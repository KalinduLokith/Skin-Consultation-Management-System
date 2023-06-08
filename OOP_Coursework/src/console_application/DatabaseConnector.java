package console_application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 COPYRIGHT (C) Kalindu Lokith - 20210332 - W1867088- kalindu.20210332@iit.ac.lk. All Rights Reserved.
 Object-Oriented Programming Coursework L5 sem 1
 @author Kalindu Lokith
 @version 1 Console application
 */

/**
 * This class will create the connection to westminster_skincare_consultation_database.accdb Microsoft Access database
 */
public class DatabaseConnector
{
    private final int FLAG = 11;
    private final String DATABASE_URL = "jdbc:ucanaccess://src/console_application/westminster_skincare_consultation_database.mdb; jackcessOpener=console_application.CryptCodecOpener";
    private final String USERNAME = "Admin";
    private final String PASSWORD = "root";
    Connection conn;

    /**
     * constructor of the DatabaseConnector class which establish the database connection.
     */
    public DatabaseConnector(boolean wantConnectionConfirmationMsg)
    {
        try
        {
            conn = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
            if(wantConnectionConfirmationMsg)
            {
                System.out.println("DATABASE CONNECTION ESTABLISHED SUCCESSFULLY.");
            }
        }
        catch (SQLException exc)
        {
            try
            {
                throw new DatabaseConnectionErrorException(FLAG, exc);
            }
            catch (DatabaseConnectionErrorException err)
            {
                System.out.println(err);
            }
        }
    }

    /**
     * getter for Connection object conn
     * @return Connection to the database
     */
    public Connection getConnection()
    {
        return conn;
    }

    /**
     * setter for Connection object conn
     * @param conn connection to the database
     */
    public void setConnection(Connection conn)
    {
        this.conn = conn;
    }
}
