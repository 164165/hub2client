/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.client.view;

/**
 *
 * @author marek
 */
import org.client.beans.XratesService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.xml.datatype.XMLGregorianCalendar;
import org.client.domain.Xrate;



@ManagedBean(name="dtXratesTableView")
@ViewScoped
public class XratesTableView implements Serializable {
     
    private List<Xrate> rates;
    private String tabelaNBP;
    private XMLGregorianCalendar exDate;

    public String getTabelaNBP() {
        return tabelaNBP;
    }

    public void setTabelaNBP(String tabelaNBP) {
        this.tabelaNBP = tabelaNBP;
    }
     
    @ManagedProperty("#{xratesService}")
    private XratesService service;
 
    @PostConstruct
    public void init() {
        this.rates = service.createXrates();
        this.tabelaNBP= service.getTabelaNBP();
        this.exDate = service.getxDate();
    }
     
    public List<Xrate> getXrates() {
        return rates;
    }
 
    public void setService(XratesService service) {
        this.service = service;
    }

    public XMLGregorianCalendar getExDate() {
        return exDate;
    }
    
    
}
