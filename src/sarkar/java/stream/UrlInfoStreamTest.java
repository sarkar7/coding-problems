package sarkar.java.stream;

import sarkar.java.common.UrlInfo;

import java.util.*;
import java.util.stream.Collectors;

public class UrlInfoStreamTest {

    public static void main(String[] args) {

        List<UrlInfo> urls = UrlInfo.getUrls();

        long totalCount = urls.stream().mapToLong(UrlInfo::getCount).sum();
        long spiderCount = urls.stream().map(UrlInfo::getSpiderName).distinct().count();
        Map<String, Object> map = new LinkedHashMap<>();
        Map<String, Object> result = new LinkedHashMap<>();



        urls.stream().collect(Collectors.groupingBy(UrlInfo::getSpiderName))
                .forEach((spiderName, result1) -> {
                    List<Object> jobIdExecIdMapList = new ArrayList<>();
                    result1.stream().collect(Collectors.groupingBy(UrlInfo::getScheduleId))
                            .forEach((scheduleId, result2) -> {
                                Map<String, Object> jobIdExecIdMap = new LinkedHashMap<>();
                                List<String> executionIds = new ArrayList<>();
                                long count = result2.stream().mapToLong(UrlInfo::getCount).sum();
                                result2.forEach(e -> executionIds.add(e.getExecutionId()));
                                jobIdExecIdMap.put("count", count);
                                jobIdExecIdMap.put("jobId", scheduleId);
                                jobIdExecIdMap.put("executionIds", executionIds);
                                jobIdExecIdMapList.add(jobIdExecIdMap);
                            });
                            map.put(spiderName, jobIdExecIdMapList);
                });
        result.put("totalCount", totalCount);
        result.put("spiderCount", spiderCount);
        result.put("stats", map);

        System.out.println(result);
    }

}
