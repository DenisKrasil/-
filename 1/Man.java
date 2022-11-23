public class Man extends Human {

    private String gender = "Male";
    
    public Man  (String name, String surname) {
        super(name, surname);
    }

    public String getName() {
        return gender;
    }

    @Override
    public String toString() {
        return super.toString() + " " + gender;
    }
}
