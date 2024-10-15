public class Person {
    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName){
        if (firstName.isEmpty()){
            throw new RuntimeException("Name not valid.");
        }
        if (lastName.isEmpty()){
            throw new RuntimeException("Surname not valid.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void greet(){
        System.out.printf("Hello, I am %s %s! I have %d years old!",firstName,lastName,age);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
