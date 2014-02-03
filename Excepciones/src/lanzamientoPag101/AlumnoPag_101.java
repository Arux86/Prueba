/**
 * 
 */
package lanzamientoPag101;

/**
 * @author Carlos
 *
 */
public class AlumnoPag_101 {
	String nombre;
	String apellidos;
	int a�oDeNacimiento;
	
AlumnoPag_101 (String nombre,String apellidos,int a�oDeNacimiento)
		throws A�oFueraDeRangoException, Exception {
	if (nombre == null || apellidos == null)
		throw new Exception ("Argumentos no validos");
	if (a�oDeNacimiento < 1900 || a�oDeNacimiento > 2014)
		throw new A�oFueraDeRangoException ("Demasiado joven o demasiado viejo");
	
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.a�oDeNacimiento = a�oDeNacimiento;
	
}
public void setA�oDeNacimiento (int a�oDeNacimiento) throws A�oFueraDeRangoException{
	if (a�oDeNacimiento < 1900 || a�oDeNacimiento > 2014)
		throw new A�oFueraDeRangoException ("Demasiado joven o demasiado viejo");
	this.a�oDeNacimiento=a�oDeNacimiento;
}

}
