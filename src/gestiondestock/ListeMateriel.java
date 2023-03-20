package gestiondestock;

public class ListeMateriel {
      public Materiel[] listMateriel;
      public int maxsize;
      public int nbmateriel;
	public ListeMateriel(int maxsize) {
		this.maxsize = maxsize;
		this.nbmateriel = 0;
		this.listMateriel=new Materiel[maxsize];
	}
	public void AddMateriel(Materiel M)
    {   
		int l=this.nbmateriel;
	  if(l<maxsize)
	  {
		  listMateriel[l]=M;
		  this.nbmateriel+=1;
	  }
	  else
		  System.out.println("Liste de Materiel pleine");
}
public void RemoveMateriel(Materiel M)
{
	if(this.nbmateriel==0)
	{
		System.out.print("Liste est deja vide");
	}
	else
	{
		 int j=-1;
		for(int i=0;i<listMateriel.length;i++)
		{ 
			if(listMateriel[i]==M)
			{
			  j=i;
			}
			
		}
		if(j>-1)
		{
			for(int i=j;i<this.nbmateriel;i++)
		{
			listMateriel[i]=listMateriel[i+1];
		}	
		this.nbmateriel-=1;
		}
		else
		{
			System.out.print("Materiel n'existe pas");
		}
	
	}
}
public void affichageMateriel()
{
	for(int i=0;i<this.nbmateriel;i++)
    {
	       System.out.println("Materiel "+i+"-"+this.listMateriel[i].toString());
    }
}
public Materiel rechercherMateriel(String nom)
{
	for(int i=0;i<this.nbmateriel;i++)
	{
		if(listMateriel[i].name==nom)
		return listMateriel[i];
	}
	return null;
}
}
