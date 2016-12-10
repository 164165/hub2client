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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xrate"
})
@XmlRootElement(name = "Xrates")
public class Xrates {
/*
    public Xrates() {
        this.xrate = new ArrayList<>();
    }
*/
    @XmlElement(name = "Xrate")
    protected List<Xrate> xrate;

    public List<Xrate> getXrate() {
        if (xrate == null) {
            xrate = new ArrayList<Xrate>();
        }
        return this.xrate;
    }

}
