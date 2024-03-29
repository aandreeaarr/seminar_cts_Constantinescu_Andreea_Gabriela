package principii_clean_code.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumireProiect;

	public static int pragPunctaj=80;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void statut(){
		System.out.println("Aplicantul "+this.nume+" "+this.prenume+(this.punctaj > Aplicant.pragPunctaj ? " " : " nu ")+"a fost acceptat.");
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}

	public int getNr_proiecte() {
		return nr_proiecte;
	}

	public void setNr_proiecte(int nr_proiecte) {
		this.nr_proiecte = nr_proiecte;
	}

	public String[] getDenumireProiect() {
		return denumireProiect;
	}

	public void setDenumireProiect(String[] denumireProiect) {
		this.denumireProiect = new String[this.nr_proiecte];
		for(int i=0;i<denumireProiect.length;i++){
			this.denumireProiect[i] = denumireProiect[i];
		}
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer();
		sb.append("nume='").append(nume).append('\'');
		sb.append(", prenume='").append(prenume).append('\'');
		sb.append(", varsta=").append(varsta);
		sb.append(", punctaj=").append(punctaj);
		sb.append(", nr_proiecte=").append(nr_proiecte);
		sb.append(", denumireProiect=").append(denumireProiect == null ? "null" : Arrays.asList(denumireProiect).toString());
		return sb.toString();
	}

	public abstract void afisareFinantare();

	public  void afisareFinantare(int sumaFinantare, String tipAplicant){
		System.out.println(tipAplicant+" "+this.getNume()+" "+this.getPrenume()+" primeste "+sumaFinantare+" Euro/zi in proiect.");
	}
}
