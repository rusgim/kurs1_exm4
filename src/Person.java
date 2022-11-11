public class Person {
    private String surNamePerson;
    private String namePerson;
    private String patronymicPerson;

    public Person(String surNamePerson, String namePerson, String patronymicPerson) {
        this.surNamePerson = surNamePerson;
        this.namePerson = namePerson;
        this.patronymicPerson = patronymicPerson;
    }

    public String getSurNamePerson() {return this.surNamePerson;}
    public String getNamePerson() {return this.namePerson;}
    public String getPatronymicPerson() {return this.patronymicPerson;}

    public String toString() {
        return "ФИО - " + this.surNamePerson + " " + this.namePerson + " " + this.patronymicPerson;
    }
}
