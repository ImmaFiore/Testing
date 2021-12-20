package Anagrafica;

public class Universitario {
	private String Nome;
	private String Cognome;
	private int eta;
	public int Analisi;
	public int Infor;
	public int Fisica;
	/*public int somma;
	public int media;*/

	public Universitario(String Nome, String Cognome, int eta, int Analisi, int Infor, int Fisica) {
		this.Nome = Nome;
		this.Cognome = Cognome;
		this.eta = eta;
		this.Analisi = Analisi;
		this.Infor = Infor;
		this.Fisica = Fisica;
	}
	public float calcoloMedia() {
		int somma = Analisi + Infor + Fisica; 
		float media = (float)somma/3;
		return media;
	}







}


