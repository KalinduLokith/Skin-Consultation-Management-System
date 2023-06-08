package console_application;

import java.time.LocalDate;

/**
 COPYRIGHT (C) Kalindu Lokith - 20210332 - W1867088- kalindu.20210332@iit.ac.lk. All Rights Reserved.
 Object-Oriented Programming Coursework L5 sem 1
 @author Kalindu Lokith
 @version 1 Console application
 */

/**
 * Patient class will be a child class(subclass) of the Person class.
 */
public class Patient extends Person
{
    private int patientId;

    /**
     * Default constructor for Patient class.
     */
    public Patient()
    {

    }

    /**
     * Constructor for Patient class which accepts two parameters patientFirstName and patientLastName.
     * @param patientFirstName patient first name.
     * @param patientLastName patient last name.
     */
    public Patient( int patientId, String patientFirstName, String patientLastName)
    {
        super(patientFirstName, patientLastName);
        this.patientId = patientId;
    }

    /**
     * Constructor for Patient class which accepts seven parameters.
     * @param name first name of the patient.
     * @param surname surname of the parameter.
     * @param dateOfBirth birthday of the patient.
     * @param mobileNumber mobilenumber of the patient.
     * @param address address of the patient.
     */
    public Patient(int patientId,String name, String surname, LocalDate dateOfBirth, String mobileNumber, String address)
    {
        super( name,  surname,  dateOfBirth,  mobileNumber,  address);
        this.patientId = patientId;
    }

    /**
     * getter for patientId.
     * @return id of the patient.
     */
    public int getPatientId()
    {
        return patientId;
    }

}
