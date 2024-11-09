package Que4;

class Person {
    private String name;
    private int age;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Please! Enter the valid age");
        }
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void introduce() {
        System.out.println("My Name is " + getName() + " and I am " + getAge()+" years old.");
    }
}

class Student extends Person {
    private int studentId;

    void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    int getStudentId() {
        return studentId;
    }

    @Override
    void introduce() {
        System.out.println("\nMy Name is " + getName() + " and I am " + getAge()+" years old. I am a Student and my ID is " + studentId);
    }

    void study() {
        System.out.println(getName()+" is studying now.");
    }
}

class Teacher extends Person {
    private String subject;

    void setSubject(String subject) {
        this.subject = subject;
    }

    String getSubject() {
        return subject;
    }

    @Override
    void introduce() {
        System.out.println("\nMy Name is " + getName() + " and I am " + getAge()+" years old."+getName()+" is teaching " + subject);
    }

    void teach() {
        System.out.println(getName()+" is teaching now.\n");
    }
}

class SchoolSystem {
    public static void main(String args[]) {
        Student S = new Student();
        S.setStudentId(3133);
        S.setName("Dainik Makwana");
        S.setAge(19);
        S.introduce();
        S.study();
        
        Teacher T = new Teacher();
        T.setName("Pritesh Vyas");
        T.setAge(30);
        T.setSubject("JAVA");
        T.introduce();
        T.teach();
    }
}
