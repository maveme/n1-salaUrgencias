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
	* <span style="font-size: 12.8px;">Constante que representa el área 4.</span>
	*/
	public final static invalid AREA_4 = 4;
	/**
	* <span style="font-size: 12.8px;">Constante que representa el área 3.</span>
	*/
	public final static Integer AREA_3 = 3;
	/**
	* Constante que representa el área 1.
	*/
	public final static Integer AREA_1 = 1;
	/**
	* <span style="font-size: 12.8px;">Constante que representa el área 2.</span>
	*/
	public final static Integer AREA_2 = 2;
	

	/**
	* <span style="font-size: 12.8px;">Constante que representa el área 4.</span>
	*/
	private invalid AREA_4=4; 	
	
	/**
	* <span style="font-size: 12.8px;">Constante que representa el área 3.</span>
	*/
	private Integer AREA_3=3; 	
	
	/**
	* Constante que representa el área 1.
	*/
	private Integer AREA_1=1; 	
	
	/**
	* <span style="font-size: 12.8px;">Constante que representa el área 2.</span>
	*/
	private Integer AREA_2=2; 	
	
	

	/**
	* 
	*/
	private PanelOpciones panelOpciones;
	
	/**
	* 
	*/
	private PanelArea panelArea4;
	
	/**
	* 
	*/
	private PanelArea panelArea3;
	
	/**
	* 
	*/
	private PanelImagen panelImagen;
	
	/**
	* 
	*/
	private SalaUrgencias salaUrgencias;
	
	/**
	* 
	*/
	private PanelInformacion panelInformacion;
	
	/**
	* 
	*/
	private PanelArea panelArea1;
	
	/**
	* 
	*/
	private PanelArea panelArea2;
	
	

	/**
	* 
	*/
	public InterfazSalaUrgencias()
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
	public void reiniciar()
	{
	
	}
	
	/**
	* 
	*/
	public void retirarPacientes(invalid pNumeroArea)
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
	
	/**
	* 
	*/
	public void reFuncOpcion1()
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
