/**
 * 
 */

/**
 * @author dominique
 * gere une Casier contenant des Objet(s)
 */
public class Casier
{

	private Objet[] cases ;
	private int nbCases   ;
	
	/**
	 * initialise le Casier courant en creant n cases
	 */
	public Casier(int n)
	{
		this.cases   = new Objet[n] ;
		this.nbCases =  n ;
	}
	
	
	/**
	 * retourne le nombre de cases du Casier courant
	 */
	public int nbCases()
	{
		return this.nbCases ;
	}
	
	
	/**
	 * retourne le String decrivant le Casier courant
	 */
	public String toString()
	{
		String s = "le casier contient " + this.nbCases() + " cases : \n" ;
				
		for (int i = 0 ; i < this.nbCases() ; i++)
		{
			
			s = s + i + " : ";
			
			if (this.cases[i] == null)
				s = s + " rien" ;
			else
				s = s + this.cases[i] ;
			
			s = s + "\n" ;
			
		}
		
		return s ;
	}
	
	
	/**
	 *  retourne l'Objet present a la case i du Casier courant
	 *  (l'Objet est retire de la case qui contient null apres l'operation)
	 */
	public Objet libere_objet(int i)
	{
		Objet e = this.cases[i] ;
		this.cases[i] = null ;
		
		return e ;
	}
	
	/**
	 *  depose l'Objet e dans la case i du Casier courant
	 *  
	 */
	public void prend_objet(Objet e, int i)
	{
		this.cases[i] = e ;
	}
	
}
// fin class Casier