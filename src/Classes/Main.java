package Classes;

import Exceptions.*;
import java.lang.Exception.*;
import GUI.*;
import Utility.*;
import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Account> accounts = new ArrayList<>();
    static ArrayList<Bill> bills = new ArrayList<>();
    static DataBase dataBase = DataBase.getInstance();
    static LoginView login = new LoginView();
    static String UserID, pass;
    static int index = -1;
    static Scanner cin = new Scanner (System.in);
    
    public static void main(String args[])throws Exception{
        initData();
        loadData();
        initBills();
        while (true){
            if (login()){
                System.out.println(accounts.get(index).getBalance());
            }
        }
    }
    
    public static boolean IdValidation(){
        for (Customer c: customers){
            if (c.getUserID().equalsIgnoreCase(UserID)){
                index = customers.indexOf(c);
                return true;
            }
        }return false;
    }
    
    public static boolean PasswordValidation(){
        if(customers.get(index).getPass().equalsIgnoreCase(pass)){
            return true;
        }
        return false;
    }
    
    public static void loadData(){
        try{
            dataBase.saveAccountData();
            dataBase.saveCustomerData();
            dataBase.loadAccountData();
            dataBase.loadCustomerData();
        }catch(Exception e){
            System.out.println("File not Found");
        }
    }
    
    public static boolean login() throws InvalidLoginException{
        try{
            System.out.print("USER ID: ");
            UserID = cin.nextLine();
            System.out.print("PASSWORD: ");
            pass = cin.nextLine();
            if (!(IdValidation())){
                throw new InvalidLoginIdException();  
            }
            if (!(PasswordValidation())){
                throw new InvalidLoginPasswordException();
            }
        }catch(InvalidLoginIdException e){
            System.out.println(e.getMessage());
            return false;
        }catch(InvalidLoginPasswordException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    public static void initBills(){
        bills.add(new KESC("12345", "Khizar Lakhani", false, 840));
        bills.add(new PTCL("12346", "Khizar Lakhani", false, 840));
        bills.add(new SSGC("12347", "Khizar Lakhani", false, 840));
        bills.add(new MobileBill("12348", "Khizar Lakhani", false, 840));    
    }
    
    public static void initData(){
        customers.add(new Customer("Mursal Abdul Saboor Khan", "42301023132453", "1234", "mask477", "123456"));
        customers.add(new Customer("Muhammad Khizar Lakhani", "42301023138675", "1235", "mkhizar", "123456"));
        customers.add(new Customer("Maria Sameen", "42301023135341", "1236", "maria", "123456"));
        customers.add(new Customer("Muhammad Saqlain Shoiab", "42301023138453", "1237", "saqlain", "123456"));
        
        accounts.add(new PersonalCurrentAccount(0, "1234", 2000000));
        accounts.add(new BusinessCurrentAccount(1, "1235", 5000000));
        accounts.add(new FixDepositSavingAccount(2, "1236", 250000));
        accounts.add(new RunningSavingAccount(3, "1237", 50000));
    }
}
