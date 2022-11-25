public class Woman extends Human {

    private String gender = "Female";
    
    public Woman  (String name, String surname) {
        super(name, surname);
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return super.toString() + " " + gender;
    }
}

