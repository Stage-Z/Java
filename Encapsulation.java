class Student {
    // 1. Private variables (data hiding)
    private String name;
    private int age;
    private int grade;
    private char section;
    private String city;
    private String school;

    // 2. Public getters and setters (controlled access)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        // Optional: Validation
        if (!name.isEmpty()) {//is my name is not empty
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade){
        if (grade > 0) {
            this.grade = grade;
        }
    }

    public char getSection() {
        return section;
    }
    public void setSection(char section) {
        this.section = section;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        if (!city.isEmpty()) {
            this.city = city;
        }
    }

    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        if (!school.isEmpty()) {
            this.school = school;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Haris Riza");
        s.setAge(13);
        s.setGrade(8);
        s.setSection('B');
        s.setCity("Whitefield, Bangalore");
        s.setSchool("The Deens Academy");

        System.out.println(s.getName() + " is " + s.getAge() + " years old an is in grade " + s.getGrade() + " and is in section " + s.getSection() + " and " + s.getCity() + " and studies in " + s.getSchool());
    }
}