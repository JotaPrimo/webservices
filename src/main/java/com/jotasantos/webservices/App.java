package com.jotasantos.webservices;

import com.jotasantos.webservices.servico.CertidaoNascimentoImpl;

import jakarta.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CertidaoNascimentoImpl certidaoNascimento = new CertidaoNascimentoImpl();
        Endpoint.publish("http://localhost:8085/servico/certidao", certidaoNascimento);
        System.out.println("Serviço publicado com sucesso");

    }
}
