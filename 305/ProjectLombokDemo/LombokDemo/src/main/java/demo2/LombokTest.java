package demo2;

public class LombokTest {
    public static void main(String[] args) {
        // test constructor
        UserLombokModel lombokModel = new UserLombokModel(100, "Ramesh", "Fadatare", 28, "Male");
        System.out.println(lombokModel.toString());

        UserLombokModel lombokMdl = new UserLombokModel();

        // test getter and setter methods
        lombokMdl.setId(200L);
        lombokMdl.setFirstName("Ram");
        lombokMdl.setLastName("Fad");
        lombokMdl.setAge(30);
        lombokMdl.setGender("Male");

        System.out.println(lombokMdl.getId());
        System.out.println(lombokMdl.getFirstName());
        System.out.println(lombokMdl.getLastName());
        System.out.println(lombokMdl.getGender());
        System.out.println(lombokMdl.getAge());

    }
}
