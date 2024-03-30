package com.example.tester;
public class Tester
{
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    // Конструктор без параметров
    public Tester()
    {
        this("Gave", "Lirison", 54, "C2", 555.55);
    }

    // Конструктор с параметрами
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary)
    {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name)
    {
        this(name, null, 0, null, 0);
    }

    public Tester(String name, String surname)
    {
        this(name, surname, 0, null, 0);
    }

    public Tester(String name, String surname, int experienceInYears)
    {
        this(name, surname, experienceInYears, null, 0);
    }

    // Перегруженные методы
    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setExperienceInYears(int experienceInYears)
    {
        this.experienceInYears = experienceInYears;
    }

    public void setEnglishLevel(String englishLevel)
    {
        this.englishLevel = englishLevel;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    // Статический метод
    public static void printTesterInfo(Tester tester)
    {
        System.out.println("Name: " + tester.name);
        System.out.println("Surname: " + tester.surname);
        System.out.println("Experience in Years: " + tester.experienceInYears);
        System.out.println("English Level: " + tester.englishLevel);
        System.out.println("Salary: " + tester.salary);
    }
}