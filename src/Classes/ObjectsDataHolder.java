package Classes;

import java.io.*;
import java.util.ArrayList;

public class ObjectsDataHolder{
    public void saveAccountData (ArrayList<Account> a)throws Exception{
        try{
            
            File f = new File("Accounts.txt");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream save = new ObjectOutputStream(fos);
            for (Account c : a){
                 save.writeObject(c);
            }
        }catch(IOException e){
            System.out.println("error at saving account data");
        }
        
    }//end of Save
    public void saveCustomerData (ArrayList<Customer> a)throws Exception{
        try{
            
            File f = new File("Customers.txt");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream save = new ObjectOutputStream(fos);
            for (Customer c : a){
                 save.writeObject(c);
            }
        }catch(IOException e){
            System.out.println("error at saving customer data");
        }
        
    }//end of Save
    public ArrayList retrieveAccountData()throws Exception{
        try{ 
            ArrayList<Account> acc = new ArrayList<>();
            File f = new File("Accounts.txt");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            acc.add((Account)ois.readObject());
            acc.add((Account)ois.readObject());
            return acc;
        }catch(IOException e){
            System.out.println("error at retrieving account data");
        }
        return null;
    }//end of retrieve
    public ArrayList retrieveCustomerData()throws Exception{
        try{ 
            ArrayList<Customer> acc = new ArrayList<>();
            File f = new File("Customers.txt");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            acc.add((Customer)ois.readObject());
            acc.add((Customer)ois.readObject());
            acc.add((Customer)ois.readObject());
            return acc;
        }catch(IOException e){
            System.out.println("error at retrieving data");
        }
        return null;
    }//end of retrieve
}//end of class