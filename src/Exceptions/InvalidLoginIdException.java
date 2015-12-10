/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author khizar
 */
public class InvalidLoginIdException extends InvalidLoginException{

    private String msg="Invalid ID";
    public InvalidLoginIdException() {
        super();
    }
    @Override
    public String getMessage(){
        return msg;
    }
    
    
}
