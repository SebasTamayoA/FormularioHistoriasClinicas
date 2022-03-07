/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HC.model;

/**
 *
 * @author Sebastián Tamayo
 */
public class MedicalHistory {

    // Relaciones
    private Person person = null;
    private Doctor doctor = null;

    // Atributos
    private int historyNumber = 0; // número de historia
    private String centerOfAttention = ""; // centro de atención
    private String dateOfCreation = "";    // Fecha inicio
    private String dateOfFinalization = "";  // fecha de ultima actualización

    //situación actual
    private String reasonForConsultation = ""; // Motivo de consulta
    private String currentIllness = ""; // enfermedad actual

    // Antecedentes personales (checks)
    private boolean alcoholism = false; //Alcoholismo
    private boolean smoking = false; //Tabaquismo
    private boolean drugs = false; //Drogas
    private boolean allergicToAnyMedication = false; //Alérgico a algún medicamento
    private boolean lifetimemedicationsOrTreatment = false; //Medicamentos de por vida o tratamiento
    private String others = ""; // otros

    // Antecedentes familiares (checks)
    private boolean cancer = false; //cancer
    private boolean hypertensive = false; //Hipertenso
    private boolean cardiovascular = false; //cardiovascular
    private String others2 = ""; // otros

    // Exámenes solicitados (cuadro)
    private String requestedExams = "";

    // Diagnóstico (cuadro)
    private String diagnosis = "";

    // Constructor
    public MedicalHistory(int newhistoryNumber, Person newPerson, Doctor newDoctor) {
        historyNumber = newhistoryNumber;
        person = newPerson;
        doctor = newDoctor;
    }

    // Setter y Getters
    public int getHistoryNumber() {
        return historyNumber;
    }

    public void setHistoryNumber(int historyNumber) {
        this.historyNumber = historyNumber;
    }

    public String getCenterOfAttention() {
        return centerOfAttention;
    }

    public void setCenterOfAttention(String centerOfAttention) {
        this.centerOfAttention = centerOfAttention;
    }

    public String getReasonForConsultation() {
        return reasonForConsultation;
    }

    public void setReasonForConsultation(String reasonForConsultation) {
        this.reasonForConsultation = reasonForConsultation;
    }

    public String getCurrentIllness() {
        return currentIllness;
    }

    public void setCurrentIllness(String currentIllness) {
        this.currentIllness = currentIllness;
    }

    public boolean isAlcoholism() {
        return alcoholism;
    }

    public void setAlcoholism(boolean alcoholism) {
        this.alcoholism = alcoholism;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public boolean isDrugs() {
        return drugs;
    }

    public void setDrugs(boolean drugs) {
        this.drugs = drugs;
    }

    public boolean isAllergicToAnyMedication() {
        return allergicToAnyMedication;
    }

    public void setAllergicToAnyMedication(boolean allergicToAnyMedication) {
        this.allergicToAnyMedication = allergicToAnyMedication;
    }

    public boolean isLifetimemedicationsOrTreatment() {
        return lifetimemedicationsOrTreatment;
    }

    public void setLifetimemedicationsOrTreatment(boolean lifetimemedicationsOrTreatment) {
        this.lifetimemedicationsOrTreatment = lifetimemedicationsOrTreatment;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public boolean isCancer() {
        return cancer;
    }

    public void setCancer(boolean cancer) {
        this.cancer = cancer;
    }

    public boolean isHypertensive() {
        return hypertensive;
    }

    public void setHypertensive(boolean hypertensive) {
        this.hypertensive = hypertensive;
    }

    public boolean isCardiovascular() {
        return cardiovascular;
    }

    public void setCardiovascular(boolean cardiovascular) {
        this.cardiovascular = cardiovascular;
    }

    public String getOthers2() {
        return others2;
    }

    public void setOthers2(String others2) {
        this.others2 = others2;
    }

    public String getRequestedExams() {
        return requestedExams;
    }

    public void setRequestedExams(String requestedExams) {
        this.requestedExams = requestedExams;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getDateOfFinalization() {
        return dateOfFinalization;
    }

    public void setDateOfFinalization(String dateOfFinalization) {
        this.dateOfFinalization = dateOfFinalization;
    }

    // Metodo para mostrar información
    public String getInfo() {
        String output = "";

        output = "Motivo de consulta: " + getReasonForConsultation()
                + " Fecha: " + getDateOfCreation();

        return output;
    }

}
