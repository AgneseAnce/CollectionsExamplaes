package model;

import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

public class Student implements Comparable {
    private UUID id;
    private String name;
    private int grade;

    public Student (){}
    public Student(String name, int grade) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.grade = grade;
    }

    public Student(UUID id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", grade = " + grade;
    }

    @Override
    public boolean equals(Object obj) {
        // This method is here used to compare if similar objects are actually the same
        if (this == obj) return true;
        if (obj == null) return false;
        // In case of inherited classes
        if (this.getClass() != obj.getClass()) return false;

        // Casting = converting one object or type into another
        Student student = (Student) obj;
        // Equals method makes the private variables available
        boolean result = Objects.equals(name, student.getName()) && Objects.equals(this.grade, student.getGrade());

        return result;
    }

    public int compareTo(Object a) {
        Student student = (Student) a;
        // Compare by grade
        if (this.grade > student.getGrade()) return 1;
        if (this.grade < student.getGrade()) return -1;
        return 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }
}

