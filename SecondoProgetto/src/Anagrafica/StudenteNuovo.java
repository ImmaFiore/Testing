package Anagrafica;

public class StudenteNuovo {
	final int MAGGIORE_ETA=18; //final si usa per dire che questa non si può più modificare. è una costante
	private String nome;
	private String cognome;
	private int eta;

	

	void setEta(int eta) {
		if(eta>0 && eta<130)
			this.eta=eta;
	}

	public StudenteNuovo(String nome, String cognome, int eta){
		this.nome=nome;
		this.cognome=cognome;
		this.setEta(eta);
		System.out.println(eta);
	}

	public StudenteNuovo() {
		this.nome="";
		this.cognome="";
		this.eta=0;
	}

	boolean maggiorenne() {
		return eta>=MAGGIORE_ETA;
	}
	boolean haPiuDi(int anni) {
		return eta>=anni;
	}

	public boolean ePiuGrande(StudenteNuovo imma) {
		return this.eta>imma.eta;
	}

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public int getEta() {
		return eta;
	}
}


