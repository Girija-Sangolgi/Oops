package com.xworkz.atmapp;

public class HospitalImpl implements Hospital{

    Patient patient;

    @Override
    public boolean addPatient(Patient patient) {
        boolean isPatientAdded=false;
        if(patient!=null){
            this.patient=patient;
            isPatientAdded=true;
        }

        return isPatientAdded;
    }
}
