package gestiondestock;
import java.util.ArrayList;
import java.util.*;
public class Test{
    public static void main(String[]args)
    {
    	ArrayList<affectationmateriel> Materielnonrendu = new ArrayList<affectationmateriel>();
    	Technicien T1=new Technicien(100,"dov");
    	Technicien T2=new Technicien(215,"zied");
    	Technicien T3=new Technicien(325,"ghassen");
    	Technicien T4=new Technicien(411,"azlouk");
    	ListeTechnicien l=new ListeTechnicien(10);
    	l.AddTechnicien(T1);  	
    	l.AddTechnicien(T2);  	
    	l.AddTechnicien(T3);  	
    	l.AddTechnicien(T4); 
    	l.RemoveTechnicien(T2);
    	Materiel M1=new Materiel(25485,"DATASHOW",4,T1);
    	Materiel M2=new Materiel(25485,"Cable HDMI",8,T2);
        ListeMateriel L1=new ListeMateriel(10);
        L1.AddMateriel(M1);
        L1.AddMateriel(M2);
        Listeaffectation LA=new Listeaffectation(10);
        Scanner sc= new Scanner(System.in);
        int choix=0;
        do {
        System.out.println("1-Liste Materiel: ");
        System.out.println("2-Affecter un Materiel: ");
        System.out.println("3-Liste de Materiel affecté: ");
        System.out.println("4-Liste de Materiel Non Rendu: ");
        System.out.println("Entrez un choix: ");
        choix= sc.nextInt();
        switch(choix)
        {
        case 1:L1.affichageMateriel();
               break;
        case 2:
               int termine;
               char rendu;
               char affectation;
               for(int seance=1;seance<7;seance++)
               {
            	   do {
                	   System.out.println("Seance'"+seance+":");
                	   System.out.println("y'a il des affectation dans cette seance:[y/n]");
                	   affectation =sc.next().charAt(0);
                	   if(affectation=='y')
                	  {
                 	   System.out.println("Materiel:");
                       for(int i=0;i<L1.nbmateriel;i++)
            	       {
            		       System.out.println("Materiel "+i+"-"+L1.listMateriel[i].toString());
            	       }
                	   System.out.println("Choisir le numero du Materiel a affecter:");
                       int numeroMateriel = sc.nextInt();
                       System.out.println("Saisir le Nom de l'enseignant :");
                       String nom = sc.next();
                       LA.AffecterMateriel(seance,L1.listMateriel[numeroMateriel],nom);
                	  }
                       System.out.println("Entrez '0' si la Seance"+seance+" est terminé sinon 1");
                       termine = sc.nextInt();
                        }while(termine!=0);
            	      
            	   for(int k=0;k<LA.nbaffectation;k++)
            	   {
            		   System.out.println(LA.listaffectation[k].toString()+" est il rendu?[y/n]");
            		   rendu =sc.next().charAt(0);
            		   if(rendu=='y')
            		   {
            			   L1.listMateriel[k].quantite+=1;
            			   LA.Removeaffectation(LA.listaffectation[k]);
            		   }
            		   else
            			  if(rendu=='n' & LA.listaffectation[k].seance==seance)
            		   {
            			  Materielnonrendu.add(LA.listaffectation[k]);
            		   }
            		   
            	   }
               }
               break;
        case 3:LA.affichageliste();
               break;
        case 4:System.out.println("Materiel Non Rendu: ");
               if(Materielnonrendu.isEmpty())
               {
            	   System.out.println("non materiel non rendu");
               }
               else
               {
               for(int i=0;i<Materielnonrendu.size();i++)
               System.out.println(Materielnonrendu.get(i));
               }
               break;
        case 5:System.out.println("Liste de Materiel defectueux : ");
               break;
        default:System.out.println("Choix Incorrect");
               
        }
        }while(choix!=9);
    }
}