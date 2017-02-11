package Ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Emission implements Runnable {

	private PrintWriter out;
	private String message = null;
	private String reponse = null;
	private Scanner sc = null;
	
	
	public Emission(PrintWriter out) {
		this.out = out;
	}

	
	public void run() {
		
		  sc = new Scanner(System.in);
		  
		  while(true){
			    System.out.println("La réponse du serveur est :");
				message = sc.nextLine();
				reponse=resolveRequest(message);
				out.println(reponse);
			    out.flush();
			  }
	}
	
	
	
	
	
	
	
	
	
	


	private String resolveRequest(String message2) {
		
		
		String result="Votre requête n'est pas valide";
		if (message.equals("1")){
		result=getListVehicule();
		}
		
		else if (message.equals("1")){
		result=getListEmployee();
		}
		
		
		
		return result;
	}


	private String getListEmployee() {
		// Appel JDBC, puis serialise via Gson
		String res="{"listeV" : [

	{
		"annee" : "2002",
		"kilometrage": "100000",
		"constructeur": "renault",
		"modele": "clio",
		"immatriculation": "TA-442-CO",
		"fonctionne": true
	},

	{
		"annee" : "2005",
		"kilometrage": "175000",
		"constructeur": "renault",
		"modele": "clio",
		"immatriculation": "KX-162-RS",
		"fonctionne": false,
		"pieceAReparer": [{
				"type": "portière",
				"reference": "203F"
			}, {
				"type": "capot",
				"reference": "1125D-Y"
			},

			{
				"type": "clignotant",
				"reference": "1880P-T"
			}

		]



	},

	{
		"annee" : "2015",
		"kilometrage": "5000",
		"constructeur": "renault",
		"modele": "clio",
		"immatriculation": "SA-664-KL",
		"fonctionne": true

	},

	{
		"annee" : "2010",
		"kilometrage": "100000",
		"constructeur": "renault",
		"modele": "clio",
		"immatriculation": "PF-531-HU",
		"fonctionne": true

	}

]
}";
		
		
		return null;
	}


	private String getListVehicule() {
		// Appel JDBC, puis serialise via Gson
		return null;
	}
}
