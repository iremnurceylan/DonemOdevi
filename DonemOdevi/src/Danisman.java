import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ýrem Nur Ceylan
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
	 * Danýsman constructor'ý içerisindeki this deyimi ile tanýmladýgýmýz
	 * danismanAdi,unvan,anaBilimDali ve ögrenciListesi nesnesini gerektiðinde
	 * kullanýrýz
	 */
	Danisman(String danismanAdi, String unvan, String anaBilimDali) {
		this.danismanAdi = danismanAdi;
		this.unvan = unvan;
		this.anaBilimDali = anaBilimDali;
		this.ogrenciListesi = new ArrayList<Ogrenci>();
	}

	/*
	 * Get metodu danýsmanAdi icin girilen veriyi alýr,okur
	 * 
	 * @return sonuc String tipinde döndürür
	 */
	public String getDanismanAdi() {
		return danismanAdi;
	}

	/*
	 * Set metodu danýsmanAdi için veri girmemizi saðlar
	 */
	public void setDanismanAdi(String danismanAdi) {
		this.danismanAdi = danismanAdi;
	}

	/*
	 * Get metodu unvan icin girilen veriyi alýr,okur
	 * 
	 * @return sonuc String tipinde döndürür
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
	 * Get metodu anaBilimDali icin girilen veriyi alýr,okur
	 * 
	 * @return sonuc String tipinde döndürür
	 */
	public String getAnaBilimDali() {
		return anaBilimDali;
	}

	/*
	 * Set metodu anaBilimDali icin veri girmemizi saðlar
	 */
	public void setAnaBilimDali(String anaBilimDali) {
		this.anaBilimDali = anaBilimDali;
	}

	/*
	 * List <ögrenci> ögrencilistesini listeler
	 */
	public List<Ogrenci> getOgrenciListesi() {
		return ogrenciListesi;
	}

	/*
	 * addOgrenci metodu ögrenciListesine ögrenci eklememizi saðlar
	 */
	public void addOgrenci(Ogrenci ogrenci) {
		this.ogrenciListesi.add(ogrenci);
	}
}
