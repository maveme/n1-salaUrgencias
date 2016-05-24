package uniandes.cupi2.salaUrgencias.interfaz.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;
import index.I;

/**
* 
*/
@UIPanel
public class PanelArea extends _PanelArea
{
	

	/**
	* Campo de texto para la cantidad de cupos libres.
	*/
	@UITextField(nombre = " CantidadCuposLibres ", enabled = true)
	private JTextField txtCantidadCuposLibres;
	
	/**
	* Campo de texto para la cantidad de pacientes.
	*/
	@UITextField(nombre = " CantidadPacientes ", enabled = true)
	private JTextField txtCantidadPacientes;
	
	/**
	* Campo de texto para la cantidad de cupos disponibles.
	*/
	@UITextField(nombre = " CantidadCuposDisponibles ", enabled = true)
	private JTextField txtCantidadCuposDisponibles;
	
	/**
	* Botón para agregar profesionales al área.
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnAgregarProfesionales;
	
	/**
	* Campo de texto para la cantidad de profesionales.
	*/
	@UITextField(nombre = " CantidadProfesionales ", enabled = true)
	private JTextField txtCantidadProfesionales;
	
	/**
	* Número de área.
	*/
	private Integer numeroArea; 	
	
	/**
	* Botón para retirar profesionales del área.
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnRetirarProfesionales;
	
	/**
	* Etiqueta para la imagen del área.
	*/
	@UILabel(nombre = " Imagen ")
	private JLabel lblImagen;
	
	/**
	* Botón para retirar pacientes del área.
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnRetirarPacientes;
	
	/**
	* Botón para ingresar pacientes al área.
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnIngresarPacientes;
	
	

	/**
	* 
	*/
	public void actualizar()
	{
	
	}
	
	
	

} 
