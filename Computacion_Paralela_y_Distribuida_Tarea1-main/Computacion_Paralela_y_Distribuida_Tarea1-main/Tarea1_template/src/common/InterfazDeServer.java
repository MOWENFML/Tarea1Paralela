package common;

import java.rmi.RemoteException;
import java.rmi.Remote;
import java.util.ArrayList;

public interface InterfazDeServer {
 ArrayList<Persona> getPersona() throws RemoteException;
	public Persona Persona(String nombre, int edad) throws RemoteException;
	public void agregarPersona() throws RemoteException;
}
