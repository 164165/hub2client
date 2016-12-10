/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.client.client;

/**
 *
 * @author marek
 */
import org.client.domain.XchangeRates;
import org.client.service.XchangeRatesService;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class HubClient {

   
    private final XchangeRatesService xchangeService =XchangeRatesService.getInstance();

    public void getRates() {
        
        ClientConfig xrConfig = new DefaultClientConfig();
        Client xrClient = Client.create(xrConfig);
        
        try {
            WebResource resource = xrClient.resource("http://localhost:8080/hub2/webresources/rates");
            ClientResponse response = resource.accept("application/xml").get(ClientResponse.class);
            if (response.getStatus() == 200) {

                XchangeRates output = response.getEntity(XchangeRates.class);
                xchangeService.setRates(output);
            } else {
                System.out.println("Client Client Error..!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            xrClient.destroy();
        }

    }
  

    public XchangeRatesService getXchangeService() {
        getRates();
        return xchangeService;
    }
}
