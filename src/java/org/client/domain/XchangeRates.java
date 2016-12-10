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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "no",
    "xDate",
    "xrates"
})
@XmlRootElement(name = "XchangeRates")
public class XchangeRates {

    @XmlElement(name = "No", required = true)
    protected String no;
    @XmlElement(name = "XDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xDate;
    @XmlElement(name = "Xrates", required = true)
    protected Xrates xrates;

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */


    public XchangeRates() {
        this.xrates = new Xrates();
    }

    public String getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNo(String value) {
        this.no = value;
    }

    /**
     * Gets the value of the xDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXDate() {
        return xDate;
    }

    /**
     * Sets the value of the xDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXDate(XMLGregorianCalendar value) {
        this.xDate = value;
    }

    /**
     * Gets the value of the xrates property.
     * 
     * @return
     *     possible object is
     *     {@link Xrates }
     *     
     */
    public Xrates getXrates() {
        return xrates;
    }

    /**
     * Sets the value of the xrates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Xrates }
     *     
     */
    public void setXrates(Xrates value) {
        this.xrates = value;
    }

}
