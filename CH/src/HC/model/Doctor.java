/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HC.model;

/**
 *
 * @author Sebastián Tamayo
 */
public class Doctor {

    // Atributos
    private String name = "";
    private String firstFamName = "";
    private String secondFamName = "";
    private int identification = 0; // Numero de identificacion del médico
    private String doctorSpecialty = ""; // Especialidad del médico

    // metodo constructor
    public Doctor(int newIdentification, String newName, String newFirstFamName) {
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

    public String getDoctorSpecialty() {
        return doctorSpecialty;
    }

    public void setDoctorSpecialty(String doctorSpecialty) {
        this.doctorSpecialty = doctorSpecialty;
    }

}
