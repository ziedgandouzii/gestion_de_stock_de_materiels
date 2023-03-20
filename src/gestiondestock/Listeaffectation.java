package gestiondestock;

import java.util.Arrays;

public class Listeaffectation {
     public affectationmateriel[] listaffectation;
     public int maxsize;
     public int nbaffectation;
	public Listeaffectation(int maxsize) {
		this.maxsize = maxsize;
		this.nbaffectation = 0;
		this.listaffectation=new affectationmateriel[maxsize];
	}
	public void AffecterMateriel(int seance,Materiel m_affecté,String Enseignant)
    {  
		affectationmateriel A_M=new affectationmateriel(seance,m_affecté,Enseignant);
		int l=this.nbaffectation;
	  if(l<maxsize)
	  {
		  listaffectation[l]=A_M;
		  this.nbaffectation+=1;
	  }
	  
	  else
		  System.out.println("Liste d'affectation du materiel pleine");
     }
	public void Removeaffectation(affectationmateriel M)
	{
		if(this.nbaffectation==0)
		{
			System.out.print("Liste est deja vide");
		}
		else
		{
			 int j=-1;
			for(int i=0;i<this.nbaffectation;i++)
			{ 
				if(this.listaffectation[i]==M)
				{
				  j=i;
				}
				
			}
			if(j>-1)
			{
				for(int i=j;i<this.nbaffectation;i++)
			{
				listaffectation[i]=listaffectation[i+1];
			}	
			this.nbaffectation-=1;
			}
			else
			{
				System.out.print("Materiel n'existe pas");
			}
		
		}
	}
	public void affichageliste() {
		for(int s=1;s<7;s++)
		{
		 
	     System.out.println("Seance "+s+":");
		for(int i=0;i<this.nbaffectation;i++)
		{   
			if(this.listaffectation[i].seance==s)
			{
			System.out.println("|Enseignant="+this.listaffectation[i].Enseignant+"|Materiel affecté="+this.listaffectation[i].M_affecté);
			}
			else
			System.out.println("Non Materiel affecté dans cette seance");
		}
		}
	}
	
}
