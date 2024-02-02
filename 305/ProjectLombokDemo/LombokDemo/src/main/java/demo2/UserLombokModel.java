package demo2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserLombokModel {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
}
