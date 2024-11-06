import java.time.LocalDate;

/**
 * A class that represents a student and his/her data
 */
public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String patronymicName;
    private LocalDate dateOfBirth;
    private String address;
    private String phoneNum;
    private String faculty;
    private int course;
    private String group;

    /**
     * A constructor for an object 'Student' with all data
     * @param id                The unique number
     * @param lastName          Last name
     * @param firstName         First name
     * @param patronymicName    Patronymic name
     * @param dateOfBirth       Date of birth
     * @param address           His/her address
     * @param phoneNum          Phone number
     * @param faculty           Faculty
     * @param course            Course
     * @param group             Group
     */
    public Student(int id, String lastName, String firstName, String patronymicName, LocalDate dateOfBirth,
                   String address, String phoneNum, String faculty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this. dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNum = phoneNum;
        this.faculty = faculty;
        this.course = course;
        this.group = group;}


    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setPatronymicName(String patronymicName){
        this.patronymicName = patronymicName;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public void setCourse(int course){
        this.course = course;
    }
    public void setGroup(String group){
        this.group = group;
    }

    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getPatronymicName(){
        return patronymicName;
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public String getFaculty(){
        return faculty;
    }
    public int getCourse(){
        return course;
    }
    public String getGroup(){
        return group;
    }

    /**
     * It returns a string of an object Student
     * @return        A string containing all the fields of the student
     */
    public String toString(){
        return "ID:" + id + " First name: " + firstName + " Last name: "
                + lastName + " Patronymic name: " + patronymicName +
                " Birth date: " + dateOfBirth + " Address: " + address +
                " Phone number: " + phoneNum + " Faculty: " + faculty +
                " Course: " + course + " Group: " + group;
    }
}