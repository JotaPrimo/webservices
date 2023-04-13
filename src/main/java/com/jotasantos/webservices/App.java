package com.jotasantos.webservices;


import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

import com.jotasantos.webservices.servico.CertidaoNascimento;
import jakarta.xml.ws.Service;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException
    {
//    	CertidaoNascimentoImpl certidaoNascimento = new CertidaoNascimentoImpl();
//        Endpoint.publish("http://localhost:8085/servico/certidao", certidaoNascimento);
//        System.out.println("Serviço publicado com sucesso");
    	
    	URL url = new URL("http://localhost:8085/servico/certidao?wsdl");
  	  
        QName qname = new QName("http://servico.webservices.jotasantos.com/", "CertidaoNascimentoImplService");
  
        Service service = Service.create(url, qname);
  
        CertidaoNascimento certidao = service.getPort(CertidaoNascimento.class);
        int idade = certidao.calcularIdade("28/01/1995");
        String diaSemana = certidao.diaSemanaNascimento("28/01/1995");        
        System.out.println("Idade: " + idade);
        System.out.println("Dia da semana: " + diaSemana);

    }
    
    
}
