
public abstract class Robot {

	private int numeroCase;
	private Objet monObjet;
	private Casier monCasier;
	private ComportementSeDeplacer unComportementSeDeplacer;
	private ComportementManipuler unComportementManipuler;
	
	public Robot (Casier unCasier)
	{
		this.monCasier = unCasier;
		this.monObjet = null;
		this.numeroCase = 0;
	}
	
	public ComportementSeDeplacer getComportementSeDeplacer()
	{
		return this.unComportementSeDeplacer;
	}
	
	public ComportementManipuler getComportementManipuler()
	{
		return this.unComportementManipuler;
	}
	
	public Objet getObjet()
	{
		return this.monObjet;
	}
	
	public int getNumeroCase()
	{
		return this.numeroCase;
	}
	
	public void setComportementSeDeplacer( ComportementSeDeplacer OComportementSeDeplacer)
	{
		this.unComportementSeDeplacer = OComportementSeDeplacer; 
	}
	
	public void setComportementManipuler( ComportementManipuler OComportementManipuler)
	{
		this.unComportementManipuler = OComportementManipuler; 
	}
	
	public void setObjet (Objet OObjet)
	{
		this.monObjet = OObjet;
	}
	
	public void setNumeroCase (int ONumeroCase)
	{
		this.numeroCase = ONumeroCase;
	}
	
	public void executerSeDeplacer (int numeroCaseArrivee)
	{
		System.out.println("D'ici : "+this);
		
		this.unComportementSeDeplacer.seDeplacer();
		this.setNumeroCase(numeroCaseArrivee);
		
		System.out.println("Vers : "+this.getNumeroCase());
	}
		
	public void executerPrendre()
	{
		System.out.println(this);
		
		this.unComportementManipuler.prendre();
		this.monObjet = this.monCasier.libere_objet(this.getNumeroCase());
		
		System.out.println("Le"+this.getObjet()+"est dans la case"+this.getNumeroCase());
	}
	
	public void executerLacher()
	{
		System.out.println(this);
		
		this.unComportementManipuler.lacher();
		this.monCasier.prend_objet(this.getObjet(),this.getNumeroCase());
		
		System.out.println("Le"+this.getObjet()+"est dans la case"+this.getNumeroCase());
	}
	


}
