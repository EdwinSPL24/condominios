package util;

import javax.swing.JOptionPane;

import model.daosIMP.PersonaDaoImp;
import model.daosINT.IPersonaDao;
import model.entities.Persona;

public class pruebas {

	public static void main(String[] args) {
		
		/*
		String cedula=JOptionPane.showInputDialog("Inserte el Cedula");
		String nombre=JOptionPane.showInputDialog("Inserte el nombre");
		String celular=JOptionPane.showInputDialog("Inserte la celular");
		String direccion=JOptionPane.showInputDialog("Inserte la direccion");
		String email=JOptionPane.showInputDialog("Inserte la email");
		String contrasena=JOptionPane.showInputDialog("Inserte la contraseña");
		*/
		
		String cedula="1";
		String nombre="1";
		String celular="1";
		String direccion="1";
		String email="1";
		String contrasena="1";
		IPersonaDao EDao=new PersonaDaoImp();
		
		Persona p = new Persona();
			
		p.setDocumento(cedula);
		p.setNombre(nombre);
		p.setCelular(celular);
		p.setDireccion(direccion);
		p.setEmail(email);
		p.setClave(contrasena);
		
		EDao.insert(p);

	}

}
