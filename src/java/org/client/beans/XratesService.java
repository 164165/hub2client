/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.client.beans;

import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.xml.datatype.XMLGregorianCalendar;
import org.client.client.HubClient;
import org.client.domain.Xrate;
import org.client.service.XchangeRatesService;

/**
 *
 * @author marek
 */
@ManagedBean(name = "xratesService")
@ApplicationScoped
public class XratesService {

    private String tabelaNBP;
    private XMLGregorianCalendar xDate;
    
    public List<Xrate> createXrates() {
        // List<Xrate> list = new ArrayList<Xrate>();
        XchangeRatesService xcinstance = XchangeRatesService.getInstance();
        HubClient client = new HubClient();
        client.getRates();
        tabelaNBP = xcinstance.getRates().getNo();
        xDate = xcinstance.getRates().getXDate();
        return xcinstance.getRates().getXrates().getXrate();
        
    }

    public String getTabelaNBP() {
        return tabelaNBP;
    }

    public XMLGregorianCalendar getxDate() {
        return xDate;
    }
    
}
