public class SalesRep {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String dateOfBirth;
    SalesRep(String id, String first, String last, String email, String phone, String dateOfBirth) {
        userId = id;
        firstName = first;
        lastName = last;
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;

    }
}
