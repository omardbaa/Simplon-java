import java.util.Scanner;

public class MontantSimulator {
//MontantSimulator aider vous pour calculer le montant obtenu chaque semaine et chaque mois 
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			
			System.out.println("Veuillez entrer votre Nom et Prenom");
			String userName = input.nextLine();//pour collecter le nom et prenom d'utilisateur
			
			System.out.println("Bienvenue"+ userName+ " dans 'Montant Simulator' qui vous permete de simuler\nle montant obtenu chaque semaine et chaque mois ");
			
			

			
			
			int mode;
					do {
						System.out.println("\nMerci de choisir le mode de paiement convenable pour le mode de paiement \nhebdomadaire, taper 1, et pour le mode de paiement "
								+ "Mensuel, tapez  numero 2 et 0 pour sortie");
						
						 mode = input.nextInt();//pour  inviter l'utilisateur e choisir entre le mode de paiement mensuel ou hebdomadaire
						
					
						
						
						
						//Si l'utilisateur choisis le mode hebdomadaire
						if (mode == 1) {	
							
							System.out.println("\nVeuillez entrer le nombre deheure travaillee par semaine\n(ne doit pas depasser 50 heures par semaine)");
											
							double numberDeHeures = input.nextDouble();
											
											System.out.println("\nVeuillez entrer le tarif par heure\n(Le tarif ne doit pas etre inferieur e 25DH par heure )");
											
											
											
											
											double tarifParHeure = input.nextDouble();
											
											
											
											do {	
											
			
											   if(numberDeHeures < 40) {
													System.out.println("le montant obtenu chaque semaine est "+ numberDeHeures*tarifParHeure+" DH");
													}
												
												else if(numberDeHeures >40 &&  numberDeHeures <=50){
													System.out.println("le montant obtenu chaque semaine est "+( ( 40*tarifParHeure) + ((numberDeHeures-40) * (tarifParHeure*1.5)) ) + " DH");
													
														}
											
										 	}while (false);
											
											
											
										}
						
						
						//Si l'utilisateur choisis le mode Mensuel
						else if (mode ==2){
							
										System.out.println("\nVeuillez entrer le nombre deheure travaillee par mois\n(ne doit pas depasser 200 heures par mois)");
										
										double numberDeHeures = input.nextDouble();
										
										System.out.println("\nVeuillez entrer le tarif par heure\n(Le tarif ne doit pas etre inferieur e 20 DH par heure )");
										
										double tarifParHeure = input.nextDouble();
										
										
										do {	
										
											
											if(numberDeHeures < 180) {
												System.out.println("le montant obtenu chaque mois est "+ numberDeHeures*tarifParHeure+" DH");
												}
											
											else if(numberDeHeures >180 &&  numberDeHeures <=200){
												System.out.println("le montant obtenu chaque mois est "+( ( 180*tarifParHeure) + ((numberDeHeures-180) * (tarifParHeure*1.5)) ) + " DH");
												
													}
										
									 	}while (false);
										
										
										
										
									}
						
						
						//Si l'utilisateur entre 0 le programme sera sorti
						else if (mode ==0){
							
							System.out.println("\nMerci de votre visite");
							System.exit(0);
							
			
					
							
						}
					}while(mode != 0);
			
			
		}

}
