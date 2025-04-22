package client;

import java.rmi.NotBoundException; 
import java.rmi.RemoteException;
	
import client.Client;

public class RunClient {
	public static void main(String[] args) throws RemoteException, NotBoundException{
		Client client = new Client();
		client.iniciarServidor();
		
		System.out.println("Cliente disponible");
		client.mostrarPersonas();
		client.crearPersonas();
		System.out.println(" ");
		client.mostrarPersonas();
	}
	
	
}
 

