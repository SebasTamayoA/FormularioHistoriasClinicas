/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HC.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sebastián Tamayo
 */
public class MedicalManager {

    // Atributos
    private String name = "";

    // Listas
    public List<Person> persons = null;
    public List<Doctor> doctors = null;
    public List<MedicalHistory> medicalHistorys = null;

    // Constructor
    public MedicalManager(String newName) {
        name = newName;
        persons = new ArrayList<>();
        doctors = new ArrayList<>();
        medicalHistorys = new ArrayList<>();
    }

    // Setter y Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Permite convertir un String en fecha (Date).
     * @param fecha Cadena de fecha dd/MM/yyyy
     * @return Objeto Date
     */
    public static Date ParseFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }

    // Método para buscar persona por Id
    public Person findPersonById(int id) {
        for (Person person : persons) {
            if (person.getIdentification() == id) {
                return person;
            }
        }

        return null;
    }
    
    // metodo para buscar personas y crear lista
    public List<Person> searchPersonrById(int id) {
    List<Person> foundPerson = new ArrayList<>();
        for (Person p1 : persons) {
            if (p1.getIdentification() == id) {
                foundPerson.add(p1);
            }
        }
        return foundPerson;
    }

    // Método para adicionar persona
    public boolean addPerson(Person newPerson) {
        Person person = findPersonById(newPerson.getIdentification());

        if (person == null) {
            persons.add(newPerson);
            return true;
        }

        return false;
    }

    // Método para modificar persona por id
    public Person modifyPersonById(int id, String Name, String FirstFamName, String SecondFamName,
            String DocumentType, int Age, String Gender, String MaritalStatus,
            String Ocupation, String Direction, String Phone, String City,
            String Arl, String Eps) {

        for (Person person : persons) {
            if (person.getIdentification() == id) {
                person.setName(Name);
                person.setFirstFamName(FirstFamName);
                person.setSecondFamName(SecondFamName);
                person.setDocumentType(DocumentType);
                person.setAge(Age);
                person.setGender(Gender);
                person.setMaritalStatus(MaritalStatus);
                person.setOcupation(Ocupation);
                person.setDirection(Direction);
                person.setPhone(Phone);
                person.setCity(City);
                person.setArl(Arl);
                person.setEps(Eps);
                return person;
            }
        }
        return null;
    }


    // Método para buscar doctor por Id
    public Doctor findDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getIdentification() == id) {
                return doctor;
            }
        }

        return null;
    }
    
    // metodo para buscar doctores y crear lista
    public List<Doctor> searchDoctorById(int id) {
    List<Doctor> foundDoctor = new ArrayList<>();
        for (Doctor d : doctors) {
            if (d.getIdentification() == id) {
                foundDoctor.add(d);
            }
        }
        return foundDoctor;
    }

    // Método para adicionar doctor
    public boolean addDoctor(Doctor newDoctor) {
        Doctor doctor = findDoctorById(newDoctor.getIdentification());

        if (doctor == null) {
            doctors.add(newDoctor);
            return true;
        }

        return false;
    }

    // Método para modificar doctor por id
    public Doctor modifyDoctorById(int id, String Name, String FirstFamName, 
            String SecondFamName, String DoctorSpecialty) {

        for (Doctor doctor : doctors) {
            if (doctor.getIdentification() == id) {
                doctor.setName(Name);
                doctor.setFirstFamName(FirstFamName);
                doctor.setSecondFamName(SecondFamName);
                doctor.setDoctorSpecialty(DoctorSpecialty);
                return doctor;
            }
        }
        return null;
    }


    // Método para buscar historia clínica por Id
    public MedicalHistory findMedicalHistoryById(int id) {
        for (MedicalHistory medicalHistory : medicalHistorys) {
            if (medicalHistory.getHistoryNumber() == id) {
                return medicalHistory;
            }
        }

        return null;
    }
    
    // metodo para buscar historia clinica y crear lista
    public List<MedicalHistory> searchMedicalHistoryById(int historyNumber) {
    List<MedicalHistory> foundMh = new ArrayList<>();
        for (MedicalHistory p1 : medicalHistorys) {
            if (p1.getHistoryNumber() == historyNumber) {
                foundMh.add(p1);
            }
        }
        return foundMh;
    }

    // Método para adicionar historia clínica
    public boolean addMedicalHistory(MedicalHistory newMedicalHistory) {
        MedicalHistory medicalHistory = findMedicalHistoryById(newMedicalHistory.getHistoryNumber());

        if (medicalHistory == null) {
            medicalHistorys.add(newMedicalHistory);
            return true;
        }

        return false;
    }

    // Método para modificar historia clínica por historyNumber
    public MedicalHistory modifyMedicalHistoryById(int historyNumber, String centerOfAttention,
            String  dateOfFinalization, String reasonForConsultation, String currentIllness, boolean alcoholism,
            boolean smoking, boolean drugs, boolean allergicToAnyMedication,
            boolean lifetimemedicationsOrTreatment, String others, boolean cancer,
            boolean hypertensive, boolean cardiovascular, String others2,
            String requestedExams, String diagnosis) {

        for (MedicalHistory medicalHistory : medicalHistorys) {
            if (medicalHistory.getHistoryNumber() == historyNumber) {
                medicalHistory.setCenterOfAttention(centerOfAttention);
                medicalHistory.setDateOfFinalization(dateOfFinalization);
                medicalHistory.setReasonForConsultation(reasonForConsultation);
                medicalHistory.setCurrentIllness(currentIllness);
                medicalHistory.setAlcoholism(alcoholism);
                medicalHistory.setSmoking(smoking);
                medicalHistory.setDrugs(drugs);
                medicalHistory.setAllergicToAnyMedication(allergicToAnyMedication);
                medicalHistory.setLifetimemedicationsOrTreatment(lifetimemedicationsOrTreatment);
                medicalHistory.setOthers(others);
                medicalHistory.setCancer(cancer);
                medicalHistory.setHypertensive(hypertensive);
                medicalHistory.setCardiovascular(cardiovascular);
                medicalHistory.setOthers2(others2);
                medicalHistory.setRequestedExams(requestedExams);
                medicalHistory.setDiagnosis(diagnosis);
                return medicalHistory;
            }
        }
        return null;
    }
    
    
  

}
