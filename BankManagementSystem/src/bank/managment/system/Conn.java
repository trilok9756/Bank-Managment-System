package bank.managment.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    Connection connection;
    public Statement statement;
    public Conn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","9756787874");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
