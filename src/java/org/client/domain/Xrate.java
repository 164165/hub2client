/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.client.domain;


/**
 *
 * @author marek
 */

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "currency",
    "code",
    "nbp",
    "ecb"
})
@XmlRootElement(name = "Xrate")
public class Xrate {

    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Code", required = true)
    protected String code;
    protected String nbp;
    protected String ecb;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    
    
    
    
    public Xrate() {
    }

    public Xrate(String currency, String code, String nbp, String ecb) {
        this.currency = currency;
        this.code = code;
        this.nbp = nbp;
        this.ecb = ecb;
    }

    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the nbp property.
     * 
     */
    public String getNbp() {
        return nbp;
    }

    /**
     * Sets the value of the nbp property.
     * 
     */
    public void setNbp(String value) {
        this.nbp = value;
    }

    /**
     * Gets the value of the ecb property.
     * 
     */
    public String getEcb() {
        return ecb;
    }

    /**
     * Sets the value of the ecb property.
     * 
     */
    public void setEcb(String value) {
        this.ecb = value;
    }

}
