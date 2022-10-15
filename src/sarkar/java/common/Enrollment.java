package sarkar.java.common;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Enrollment {
    private String id;
    private String employmentType;
    private String status;
}
