package model;

public class Doctor {
    private Long id;
    private String name;
    private String surname;
    private int age;
    private String experiens;
    private String wages;

    public Doctor(Long id, String name, String surname, int age, String experiens, String wages) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.experiens = experiens;
        this.wages = wages;
    }

    public Doctor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getExperiens() {
        return experiens;
    }

    public void setExperiens(String experiens) {
        this.experiens = experiens;
    }

    public String getWages() {
        return wages;
    }

    public void setWages(String wages) {
        this.wages = wages;
    }

    @Override
    public String toString() {
        return "~~Doctor~~" +
                "\nid:" + id +
                "\nname:" + name +
                "\nsurname:" + surname +
                "\nage:" + age +
                "\nexperiens:" + experiens +
                "\nwages:" + wages;
    }
}
