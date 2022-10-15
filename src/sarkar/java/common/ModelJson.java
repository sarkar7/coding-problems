package sarkar.java.common;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ModelJson {

    private String id;
    private String name;
    private Enrollment enrollment;

}
