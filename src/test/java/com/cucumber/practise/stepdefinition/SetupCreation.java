package com.cucumber.practise.stepdefinition;


import com.cucumber.practise.commonfunction.PropertyLoader;
import com.cucumber.practise.commonfunction.Utils;
import com.cucumber.practise.config.ConfigSetup;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SetupCreation {
    private static final Logger logger = LoggerFactory.getLogger(SetupCreation.class);
    private static PropertyLoader propertyLoader;
    static {
        logger.info("First in all");
        String propertyFile = System.getProperty("user.dir")+"//src//main//resources//"+System.getProperty("property.file");
                //+"//src//main//resources//"+"credential.properties");
        propertyLoader = new PropertyLoader(propertyFile);
    }

    @Before
    public void startup(){
        logger.info("Starting application");
    }
    @Before("@regression")
    public void executeFirst(){
        logger.info("Execute all test scenario");
    }
    @Given("login to server")
    public void loginUser(){
        logger.info("Login user successfully");

    }
    @Then("send email")
    public void sendEmail(){
        logger.info("Send Email successfully");
    }
    @Then("verify user creation")
    public void verifyUserCreation(){
        logger.info("Verified user successfully");
    }

    @Given("login with username and password")
    public void loginWithUsernameAndPassword(){
        //String username = ConfigSetup.getUsername();
        //String password = ConfigSetup.getPassword();
        //String proper = System.getProperty("user.dir")+"//src//main//resources//cedential.properties";

        //logger.info(proper);
        String username = propertyLoader.getProperty("USERNAME_PARAM");
        String password = propertyLoader.getProperty("PASSWORD_PARAM");
        logger.info("Username "+ username);
        logger.info("Password "+ password);
    }

}
