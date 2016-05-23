package uniandes.cupi2.model.interfaz.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;
import index.I;

/**
* 
*/
@UIPanel
public class PanelArea extends _PanelArea
{
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnIngresarPacientes.</span>
	*/
	public final static invalid INGRESAR_PACIENTES = "Ingresar pacientes";
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnRetirarProfesionales.</span>
	*/
	public final static invalid RETIRAR_PROFESIONALES = "Retirar profesionales";
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnRetirarPacientes.</span>
	*/
	public final static invalid RETIRAR_PACIENTES = "Retirar pacientes";
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnAgregarProfesionales.</span>
	*/
	public final static invalid AGREGAR_PROFESIONALES = "Agregar profesionales";
	

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
	* Campo de texto para la cantidad de profesionales.
	*/
	@UITextField(nombre = " CantidadProfesionales ", enabled = true)
	private JTextField txtCantidadProfesionales;
	
	/**
	* Número de área.
	*/
	private Integer numeroArea; 	
	
	/**
	* Botón para agregar profesionales al área.
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnAgregarProfesionales;
	
	/**
	* Botón para ingresar pacientes al área.
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnIngresarPacientes;
	
	/**
	* Campo de texto para la cantidad de pacientes.
	*/
	@UITextField(nombre = " CantidadPacientes ", enabled = true)
	private JTextField txtCantidadPacientes;
	
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnIngresarPacientes.</span>
	*/
	private invalid INGRESAR_PACIENTES="Ingresar pacientes"; 	
	
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnRetirarProfesionales.</span>
	*/
	private invalid RETIRAR_PROFESIONALES="Retirar profesionales"; 	
	
	/**
	* Botón para retirar profesionales del área.
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnRetirarProfesionales;
	
	/**
	* Campo de texto para la cantidad de cupos disponibles.
	*/
	@UITextField(nombre = " CantidadCuposDisponibles ", enabled = true)
	private JTextField txtCantidadCuposDisponibles;
	
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnRetirarPacientes.</span>
	*/
	private invalid RETIRAR_PACIENTES="Retirar pacientes"; 	
	
	/**
	* Campo de texto para la cantidad de cupos libres.
	*/
	@UITextField(nombre = " CantidadCuposLibres ", enabled = true)
	private JTextField txtCantidadCuposLibres;
	
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnAgregarProfesionales.</span>
	*/
	private invalid AGREGAR_PROFESIONALES="Agregar profesionales"; 	
	
	

	
	/**
	* 
	*/
	public void actualizar()
	{
	
	}
	
	

} 
