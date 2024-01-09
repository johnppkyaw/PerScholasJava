public class SalesRep {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String dateOfBirth;
    SalesRep(String id, String first, String last, String email, String phone, String dateOfBirth) {
        this.userId = id;
        this.firstName = first;
        this.lastName = last;
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    String getUserId() {
        return userId;
    }
    String getFirstName() {
        return firstName;
    }
    String getLastName() {
        return lastName;
    }
    String getEmail() {
        return email;
    }
    String getPhone() {
        return phone;
    }
    String getDateOfBirth() {
        return dateOfBirth;
    }
}
