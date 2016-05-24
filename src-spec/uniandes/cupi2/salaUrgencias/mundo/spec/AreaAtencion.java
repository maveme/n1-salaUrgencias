package uniandes.cupi2.salaUrgencias.mundo.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.*;

/**
* 
*/
public class AreaAtencion extends _AreaAtencion
{

	

	/**
	* Cantidad de profesionales presentes en el área.
	*/
	@Atributo(genGet=true, genSet=true)
	private Integer cantidadProfesionales;
	/**
	* Cantidad de pacientes presentes en el área.
	*/
	@Atributo(genGet=true, genSet=true)
	private Integer cantidadPacientes;
	/**
	* <span style="font-size: 12.8px;">Ruta donde se guarda la imagen del área.</span>
	*/
	@Atributo(genGet=true, genSet=true)
	private String rutaImagen;
	/**
	* Nombre del área.
	*/
	@Atributo(genGet=true, genSet=true)
	private String nombre;
	

	

	/**
	* 
	*/
	public void agregarProfesionales(Integer pCantidadProfesionales)
	{
	
	}
	
	/**
	* 
	*/
	public void retirarPacientes(invalid pCantidadPacientes)
	{
	
	}
	
	/**
	* 
	*/
	public Integer darCantidadCuposDisponibles()
	{
	
	}
	
	/**
	* 
	*/
	public Integer darCantidadCuposLibres()
	{
	
	}
	
	/**
	* 
	*/
	public void reiniciar()
	{
	
	}
	
	/**
	* 
	*/
	public void ingresarPacientes(Integer pCantidadPacientes)
	{
	
	}
	
	/**
	* 
	*/
	public void inicializar(String pNombre, Integer pCantidadPacientes, Integer pCantidadProfresionales, String pRutaImagen)
	{
	
	}
	
	/**
	* 
	*/
	public void retirarProfesionales(Integer pCantidadProfesionales)
	{
	
	}
	
	
}

