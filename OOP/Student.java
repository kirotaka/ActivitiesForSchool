package OOP;

class Student {
    private String name;
    private int age;
    private int grade;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Validation: Age must be 1-100
        if (age >= 1 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Error: Age must be between 1 and 100. Setting age to 0.");
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        // Validation: Grade must be 0-100
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Error: Grade must be between 0 and 100. Setting grade to 0.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("---------------------------");
    }
}

