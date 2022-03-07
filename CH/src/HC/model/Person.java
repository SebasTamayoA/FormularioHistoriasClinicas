/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HC.model;

/**
 *
 * @author Sebastián Tamayo
 */
public class Person {

    // Atributos
    private String name = "";
    private String firstFamName = "";
    private String secondFamName = "";
    private int identification = 0;
    private String DocumentType = "";
    private int Age = 0;
    private String gender = "";
    private String maritalStatus = "";
    private String ocupation = "";
    private String direction = "";
    private String phone = "";
    private String city = "";
    private String arl = "";
    private String eps = "";

    // metodo constructor
    public Person(int newIdentification, String newName, String newFirstFamName) {
        identification = newIdentification;
        name = newName;
        firstFamName = newFirstFamName;
    }

    // Setter y Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstFamName() {
        return firstFamName;
    }

    public void setFirstFamName(String firstFamName) {
        this.firstFamName = firstFamName;
    }

    public String getSecondFamName() {
        return secondFamName;
    }

    public void setSecondFamName(String secondFamName) {
        this.secondFamName = secondFamName;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public String getDocumentType() {
        return DocumentType;
    }

    public void setDocumentType(String DocumentType) {
        this.DocumentType = DocumentType;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArl() {
        return arl;
    }

    public void setArl(String arl) {
        this.arl = arl;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    // Metodo para mostrar información de personas
    public String getInfo() {
        String output = "";

        output = "Numero de identificacion: " + getIdentification()
                + ",  Nombres: " + getName() + ",  Apellido: " + getFirstFamName();

        return output;
    }

}
