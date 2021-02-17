package gov.ng.gifmis;

public class Object {
    private String name;
    private String department;
    private String faculty;
    private String course;
    private int level;
    private String matriculation_number;
    private String university = "Lead City University";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getMatriculation_number() {
        return matriculation_number;
    }

    public void setMatriculation_number(String matriculation_number) {
        this.matriculation_number = matriculation_number;
    }

    public String getUniversity(){
        return university;
    }

    public static void main(String[] args) {
        Object student = new Object();
        student.setName("Luqman");
        student.setFaculty("Information Technology & Applied Sciences");
        student.setDepartment("Mathematical Science");
        student.setCourse("Computer Science");
        student.setMatriculation_number("LCU/UG/08/3074");
        student.setLevel(100);
        System.out.println("Student Name: "+student.getName());
        System.out.println("University: "+student.getUniversity());
        System.out.println("Faculty: "+student.getFaculty());
        System.out.println("Department: "+student.getDepartment());
        System.out.println("Course of study: "+student.getCourse());
        System.out.println("Level: "+student.getLevel());
        System.out.println("Matriculation No.: "+student.getMatriculation_number());
    }
}
