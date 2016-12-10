/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.client.service;

/**
 *
 * @author marek
 */

import org.client.domain.XchangeRates;

public class XchangeRatesService {

    private XchangeRates rates = new XchangeRates();
    private static final XchangeRatesService sinstance = new XchangeRatesService();

    private XchangeRatesService() {

    }

    public static XchangeRatesService getInstance() {
        return sinstance;
    }

    public XchangeRates getRates() {
        return rates;
    }

    public void setRates(XchangeRates rates) {
        this.rates = rates;
    }

    public XchangeRatesService(XchangeRates rates) {
        this.rates = rates;
    }

}
