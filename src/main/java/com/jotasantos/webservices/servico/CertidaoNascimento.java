package com.jotasantos.webservices.servico;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;


//Service Implemetation Interface
@WebService
@SOAPBinding (style = Style.RPC)
public interface CertidaoNascimento {

	@WebMethod
	public int calcularIdade(String idade);
	
	@WebMethod
	public String diaSemanaNascimento(String idade);
	
}
