public class Student{
    int studNo;
    String firstName;
    String lastName;
    String section;

    public Student(int studNo, String firstName, String lastName, String section){
        super();
        this.studNo = studNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.section = section;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", section=" + section + ", studNo="
                + studNo + "]";
    }
}