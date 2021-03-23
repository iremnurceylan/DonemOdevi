import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author �rem Nur Ceylan
 *
 */
public class Danisman {
	/**
	 * @param danismanAdi
	 * @param unvan
	 * @param anaBilimDali
	 * @param ogrenciListesi
	 */
	private String danismanAdi;
	private String unvan;
	private String anaBilimDali;
	private List<Ogrenci> ogrenciListesi;

	/*
	 * Dan�sman constructor'� i�erisindeki this deyimi ile tan�mlad�g�m�z
	 * danismanAdi,unvan,anaBilimDali ve �grenciListesi nesnesini gerekti�inde
	 * kullan�r�z
	 */
	Danisman(String danismanAdi, String unvan, String anaBilimDali) {
		this.danismanAdi = danismanAdi;
		this.unvan = unvan;
		this.anaBilimDali = anaBilimDali;
		this.ogrenciListesi = new ArrayList<Ogrenci>();
	}

	/*
	 * Get metodu dan�smanAdi icin girilen veriyi al�r,okur
	 * 
	 * @return sonuc String tipinde d�nd�r�r
	 */
	public String getDanismanAdi() {
		return danismanAdi;
	}

	/*
	 * Set metodu dan�smanAdi i�in veri girmemizi sa�lar
	 */
	public void setDanismanAdi(String danismanAdi) {
		this.danismanAdi = danismanAdi;
	}

	/*
	 * Get metodu unvan icin girilen veriyi al�r,okur
	 * 
	 * @return sonuc String tipinde d�nd�r�r
	 */
	public String getUnvan() {
		return unvan;
	}

	/*
	 * Set metodu unvan icin veri girmemizi saglar
	 */
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	/*
	 * Get metodu anaBilimDali icin girilen veriyi al�r,okur
	 * 
	 * @return sonuc String tipinde d�nd�r�r
	 */
	public String getAnaBilimDali() {
		return anaBilimDali;
	}

	/*
	 * Set metodu anaBilimDali icin veri girmemizi sa�lar
	 */
	public void setAnaBilimDali(String anaBilimDali) {
		this.anaBilimDali = anaBilimDali;
	}

	/*
	 * List <�grenci> �grencilistesini listeler
	 */
	public List<Ogrenci> getOgrenciListesi() {
		return ogrenciListesi;
	}

	/*
	 * addOgrenci metodu �grenciListesine �grenci eklememizi sa�lar
	 */
	public void addOgrenci(Ogrenci ogrenci) {
		this.ogrenciListesi.add(ogrenci);
	}
}
