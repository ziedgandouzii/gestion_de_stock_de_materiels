package gestiondestock;
public class ListeTechnicien {
     public Technicien[] liste;
     public int maxsize;
     public int nbtechnicien;
	public ListeTechnicien(int maxsize) {
		this.maxsize = maxsize;
		this.nbtechnicien=0;
		this.liste=new Technicien[maxsize];
	}
    public void AddTechnicien(Technicien person)
    {   
    		int l=this.nbtechnicien;
    	  if(l<maxsize)
    	  {
    		  liste[l]=person;
    		  this.nbtechnicien+=1;
    	  }

    	  else
    		  System.out.println("Liste de Techniciens pleine");
    }
    public void RemoveTechnicien(Technicien person)
    {
    	if(this.nbtechnicien==0)
    	{
    		System.out.print("Liste est deja vide");
    	}
    	else
    	{
    		 int j=-1;
    		for(int i=0;i<liste.length;i++)
    		{ 
    			if(liste[i]==person)
    			{
    			  j=i;
    			}
    			
    		}
    		if(j>-1)
    		{
    			for(int i=j;i<this.nbtechnicien;i++)
    		{
    			liste[i]=liste[i+1];
    		}	
    		this.nbtechnicien-=1;
    		}
    		else
    		{
    			System.out.print("Technicien n'existe pas");
    		}
    	
    	}
    }
    public Technicien rechercherTechnicien(String nom)
    {
    	for(int i=0;i<this.nbtechnicien;i++)
    	{
    		if(liste[i].name==nom)
    		return liste[i];
    	}
    	return null;
    }
    
}