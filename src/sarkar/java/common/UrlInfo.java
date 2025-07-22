package sarkar.java.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UrlInfo {

    private long count;
    private String scheduleId;
    private String executionId;
    private String spiderName;

    public static List<UrlInfo> getUrls() {
        List<UrlInfo> urls = new ArrayList<>();
        urls.add(new UrlInfo(435373, "schedule_1", "execution_1", "spider_1"));
        urls.add(new UrlInfo(54345, "schedule_1", "execution_2", "spider_1"));
        urls.add(new UrlInfo(546567, "schedule_1", "execution_3", "spider_1"));
        urls.add(new UrlInfo(546547, "schedule_2", "execution_4", "spider_1"));
        urls.add(new UrlInfo(456546, "schedule_2", "execution_5", "spider_1"));
        urls.add(new UrlInfo(765674, "schedule_3", "execution_6", "spider_2"));
        urls.add(new UrlInfo(647678, "schedule_3", "execution_7", "spider_2"));
        urls.add(new UrlInfo(987845, "schedule_4", "execution_8", "spider_2"));
        urls.add(new UrlInfo(9855654, "schedule_4", "execution_9", "spider_2"));
        urls.add(new UrlInfo(2354744, "schedule_4", "execution_10", "spider_2"));

        urls.add(new UrlInfo(864563, "schedule_5", "execution_11", "spider_3"));
        urls.add(new UrlInfo(8967556, "schedule_6", "execution_12", "spider_3"));
        urls.add(new UrlInfo(235567, "schedule_6", "execution_13", "spider_3"));
        urls.add(new UrlInfo(895545, "schedule_6", "execution_14", "spider_3"));
        urls.add(new UrlInfo(6456373, "schedule_7", "execution_15", "spider_3"));

        return urls;
    }

}
