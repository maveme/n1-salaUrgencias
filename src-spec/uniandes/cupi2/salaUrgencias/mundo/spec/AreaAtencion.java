package uniandes.cupi2.salaUrgencias.mundo.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.*;

/**
* 
*/
public class AreaAtencion extends _AreaAtencion
{

	

	/**
	* Nombre del área.
	*/
	@Atributo(genGet=true, genSet=true)
	private String nombre;
	/**
	* Cantidad de profesionales presentes en el área.
	*/
	@Atributo(genGet=true, genSet=true)
	private Integer cantidadProfesionales;
	/**
	* <span style="font-size: 12.8px;">Ruta donde se guarda la imagen del área.</span>
	*/
	@Atributo(genGet=true, genSet=true)
	private String rutaImagen;
	/**
	* Cantidad de pacientes presentes en el área.
	*/
	@Atributo(genGet=true, genSet=true)
	private Integer cantidadPacientes;
	

	

	/**
	* 
	*/
	public Integer darCantidadCuposLibres()
	{
	
	}
	
	/**
	* 
	*/
	public void agregarProfesionales(Integer pCantidadProfesionales)
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
	public void retirarProfesionales(Integer pCantidadProfesionales)
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
	public Integer darCantidadCuposDisponibles()
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
	public void inicializar(String pNombre, Integer pCantidadPacientes, Integer pCantidadProfresionales, String pRutaImagen)
	{
	
	}
	
	
}

