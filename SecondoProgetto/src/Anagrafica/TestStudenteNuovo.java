package Anagrafica;

public class TestStudenteNuovo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudenteNuovo GA = new StudenteNuovo();
		StudenteNuovo imma = new StudenteNuovo("Imma", "Fiore", 24);
		GA.setNome("Gloria");
		GA.setCognome("Anello");
		GA.setEta(22);
		System.out.println("GA"+ " " + GA.getNome() + " " + GA.getCognome() + " " + GA.getEta());
		System.out.println(GA.ePiuGrande(imma));
		
		                              
    
	}

}
