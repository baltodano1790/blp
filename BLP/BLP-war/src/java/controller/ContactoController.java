/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import entities.*;
import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.faces.convert.DateTimeConverter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;
import model.ContactoFacade;
/**
 *
 * @author Bismark
 */
@Named(value = "contactoController")
@SessionScoped
public class ContactoController implements Serializable{
    @EJB
    private ContactoFacade contactoFacade;
    private Contacto c = new Contacto();

    public Contacto getC() {
        return c;
    }

    public void setC(Contacto c) {
        this.c = c;
    }

    public ContactoController() {
    }
    public List<Contacto> findAll(){
        return this.contactoFacade.findAll();
    }
    public String add(){
        this.contactoFacade.create(this.c);
        this.c = new Contacto();
        return "index";
    }
    public void delete(Contacto c){
        this.contactoFacade.remove(c);
    }
    public String edit(Contacto c){
        this.c = c;
        return "edit";
    } 
    public String edit(){
        this.contactoFacade.edit(this.c);
        this.c = new Contacto();
        return "index";
        
        
    }
//  @FacesConverter("myDateTimeConverter")
//    public class MyDateTimeConverter extends DateTimeConverter {
//
//        public MyDateTimeConverter() {
//            setPattern("MM/dd/yyyy");
//        }
//
//        @Override
//        public Object getAsObject(FacesContext context, UIComponent component, String value) {
//            if (value != null && value.length() != getPattern().length()) {
//                throw new ConverterException("Invalid format");
//            }
//
//            return super.getAsObject(context, component, value);
//        }
//
//    }
} 
