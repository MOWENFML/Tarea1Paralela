package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import common.InterfazDeServer;
import common.Persona;


public class ServerImpl implements InterfazDeServer{

	private ArrayList<Persona> DB_personas = new ArrayList<>();
	
	public ServerImpl() {
		UnicastRemoteObject.exportObject(this, 0);
		crearDB();
	}
	private void crearDB() {
		Persona pp1 = new Persona("Daniel", 16);
		Persona pp2 = new Persona("Juan", 20);
		Persona pp3 = new Persona("mikaela", 60);
		
		DB_personas.add(pp1);
		DB_personas.add(pp2);
		DB_personas.add(pp3);	
	}
	@Override
	public ArrayList<Persona> getPersona() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Persona Persona(String nombre, int edad) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
