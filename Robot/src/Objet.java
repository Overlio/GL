/**
 * 
 */

/**
 * @author Dominique Bouthinon
 * 
 * gestion d'un objet caracterise par un nom et un poids
 *
 */
public class Objet 
{
	private String 	nom ;
	private int 	poids  ;
	
	
	/**
	 * initialise l'Objet courant avec unNom et unPoids
	 */
	public Objet(String unNom, int unPoids)
	{
		this.nom   = unNom ;
		this.poids = unPoids ;
	}
	
	
	/**
	 * 	retourne le poids de l'Objet courant
	 */
	public int getPoids()
	{
		return this.poids ;
	}	
	
	/**
	 * 	retourne le nom de l'Objet coura ;nt
	 */
	public String getNom()
	{
		return this.nom ;
	}	
	
	
	/**
	 *  retourne le String decrivant l'Objet courant
	 */
	public String toString()
	{
		return  this.getNom()    + " pesant " + this.getPoids() + " kg" ;
	}	
	
}
// fin classe Objet