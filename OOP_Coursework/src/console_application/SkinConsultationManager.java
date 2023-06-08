package console_application;

import java.sql.Connection;
import java.text.ParseException;

/**
 COPYRIGHT (C) Kalindu Lokith - 20210332 - W1867088- kalindu.20210332@iit.ac.lk. All Rights Reserved.
 Object-Oriented Programming Coursework L5 sem 1
 @author Kalindu Lokith
 @version 1 Console application
 */

/**
 * Interface SkinConsultationManager. This interface will hold all important method signatures we should
 * implement in the WestminsterSkinConsultationManager class.
 */
public interface SkinConsultationManager
{

    void showMenu();
    void addNewDoctor() throws ParseException, ValidateErrorException;
    void viewDoctors();
    void deleteDoctor();
    void addConsultations();
    void cancelConsultations();
    void savetoFile(Connection conn);
    void showGUI();
    void exit();
    void callActions( String userInput) throws ParseException, InvalidInputErrorException;

}
