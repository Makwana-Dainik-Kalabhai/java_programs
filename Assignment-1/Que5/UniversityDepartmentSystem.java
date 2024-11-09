package Que5;

class User {
    private String userName , emailId;
    
    User() {

    }

    User(String userName, String emailId) {
        this.userName = userName;
        this.emailId = emailId;
    }

    String getUserName() {
        return userName;
    }

    String getEmailId() {
        return emailId;
    }
}

class Professor extends User {
    private String department;

    Professor(String userName, String emailId, String department) {
        super(userName, emailId);
        this.department = department;
    }

    String getDepartment() {
        return department;
    }
}

class Course {
    private int code, creditHours;
    private String name;

    Course(int code, String name, int creditHours) {
        this.code = code;
        this.name = name;
        this.creditHours = creditHours;
    }

    int getCode() {
        return code;
    }

    String getName() {
        return name;
    }

    int getCreditHours() {
        return creditHours;
    }
}

class Department {
    String name, professor1,course1;

    Department(String name) {
        this.name = name;
    }

    void setProfessor1(String professor1) {
        this.professor1 = professor1;
    }

    void setCourse1(String course1) {
        this.course1 = course1;
    }
}

class UniversityDepartmentSystem {
    public static void main(String args[]) {
        Professor P = new Professor("Hitesh Sir", "hitesh123@gmail.com", "Computer Science");
        Course C = new Course(31, "Int. M.Sc.(CA & IT)", 8);

        Department D = new Department("Programming");
        D.setProfessor1("Pritesh Vyas");
        D.setCourse1("JAVA Development");

        System.out.println("\n\nDetails about Professor");
        System.out.printf("\tProfessor Name: %s",P.getUserName());
        System.out.printf("\n\tProfessor Email ID: %s",P.getEmailId());
        System.out.printf("\n\tDepartment: %s",P.getDepartment());

        System.out.println("\n\nDetails about Course");
        System.out.printf("\tCode: %d\n",C.getCode());
        System.out.printf("\tName: %s\n",C.getName());
        System.out.printf("\tCredit Hours: %d\n",C.getCreditHours());
    }
}
