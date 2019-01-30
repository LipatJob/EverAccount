package model.wrapped;

import database.DBConnection;
import database.LoginDataObject;
import java.sql.SQLException;
import model.LoginModel;
import view.LoginView;
import view.View;

/**
 *
 * @author lipat
 */

public class WrappedLoginModel extends WrappedModel{
    LoginModel model;
    LoginDataObject dataObject;
    
    public WrappedLoginModel(DBConnection connection) {
        super(connection);
        model=new LoginModel();
    }
    
    public boolean checkPassword() throws SQLException{
        String userInput=model.getPassword(); //user input
        dataObject.getHash(model); //hashed password
        String server=model.getPassword();
        if(userInput.equals(server)){
            return true;
        }
        return false;
    }
    
    
    
    @Override
    public void updateViewModel(View currentView) {
    }

    @Override
    public void updateDBModel() {
    }

    @Override
    public void addDBModel() {
    }

    @Override
    public void updateModelView(View currentView) {
        LoginView tempView=(LoginView) currentView;
        model.setUsername(tempView.getTfUsername().getText());
        model.setPassword(new String(tempView.getPwfAccountPassword().getPassword()));
    }

    @Override //*
    public void updateModelDB() {
        
    }
    
}
