package uniandes.cupi2.salaUrgencias.interfaz.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;
import uniandes.cupi2.salaUrgencias.mundo.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 * Ventana principal de la aplicación.
 */
@UIFrame(alto=800, ancho=600, titulo = "SalaUrgencias")
public class InterfazSalaUrgencias extends _InterfazSalaUrgencias
{

	

	

	/**
	* 
	*/
	private PanelArea panelArea2;
	
	/**
	* 
	*/
	private PanelArea panelArea4;
	
	/**
	* 
	*/
	private PanelOpciones panelOpciones;
	
	/**
	* 
	*/
	private PanelArea panelArea1;
	
	/**
	* 
	*/
	private PanelArea panelArea3;
	
	/**
	* 
	*/
	private PanelInformacion panelInformacion;
	
	/**
	* 
	*/
	private SalaUrgencias salaUrgencias;
	
	/**
	* 
	*/
	private PanelImagen panelImagen;
	
	

	/**
	* 
	*/
	public InterfazSalaUrgencias()
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
	public void ingresarPacientes(Integer pNumeroArea)
	{
	
	}
	
	/**
	* 
	*/
	public void reFuncOpcion1()
	{
	
	}
	
	/**
	* 
	*/
	public void retirarPacientes(int pNumeroArea)
	{
	
	}
	
	/**
	* 
	*/
	public void retirarProfesionales(Integer pNumeroArea)
	{
	
	}
	
	/**
	* 
	*/
	public void actualizarPaneles()
	{
	
	}
	
	/**
	* 
	*/
	public void reqFuncIocion2()
	{
	
	}
	
	/**
	* 
	*/
	public void agregarProfesionales(Integer pNumeroArea)
	{
	
	}
	
	
	



    // -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------


    /**
     * Método para la extensión 1
     */
    public void reqFuncOpcion1( )
    {
        String resultado = salaUrgencias.metodo1();
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Método para la extensión 2
     */
    public void reqFuncOpcion2( )
    {
        String resultado = salaUrgencias.metodo2();
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }



	// -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
    * Este método ejecuta la aplicación, creando una nueva interfaz.
    * @param pArgs Argumentos para la ejecución de la aplicación. En este caso no son necesarios.
    */
    public static void main( String[] pArgs )
    {
    	// Unifica la interfaz para Mac y para Windows.
    	try 
    	{
			UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    	
        InterfazSalaUrgencias interfaz = new InterfazSalaUrgencias( );
        interfaz.setVisible( true );
    }
}
