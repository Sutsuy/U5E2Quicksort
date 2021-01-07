package QuicksortListas;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int arreglo[]= {4,3,1,2};
		List <Integer> Lista = new ArrayList <Integer> ();
		Lista.add(4);
		Lista.add(3);
		Lista.add(1);
		Lista.add(2);


		int izq=0, der=Lista.size()-1;


		quicksort (Lista,izq,der);
		
System.out.println("Lista ordenada ");
		for(int j=0;j<Lista.size();j++)
		{
			System.out.println("* "+ Lista.get(j));
		}

			}
			
		private static void quicksort (List <Integer> Lista, int izq ,int der1)
		{
			int pivote = Lista.get(izq),aux, i=izq, d=der1;
			
			while(i<d)
			{
			while (Lista.get(i)<= pivote && i<d)	
				i++;
			while (Lista.get(d) > pivote)
				d--;
			
			if(i<d)
			{
				aux=Lista.get(i);
				Lista.set(i,Lista.get(d));
				Lista.set(d,aux);
				
			}
			
			
			}
			
			Lista.set(izq , Lista.get(d));
			Lista.set(d,pivote);
			
			if(izq< d -1)
				quicksort(Lista, izq, d-1);
			
			if(d+ 1 < der1)
				quicksort(Lista, d+1, der1);
			
			
		}
			
	
	
	
	
	
	
	
	
	
	
	}


