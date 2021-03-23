import java.util.ArrayList;
import java.util.List;

public class Donem {
	/*
	 * @param alinabilecek kredi
	 * 
	 * @param donemNumarasi
	 * 
	 * @param donemOrtalamas�
	 * 
	 * @param dersListesi
	 */

	public int alinabilecekKredi;
	public int donemNumarasi;
	public List<Ders> dersListesi;

	/*
	 * Donem constructor'� i�erisindeki this deyimi ile tan�mlad�g�m�z
	 * alinabilecekKredi,donemNumaras�,donemOrtalamas� ve dersListesi nesnesini
	 * gerekti�inde kullan�r�z
	 */
	Donem(int alinabilecekKredi, int donemNumarasi) {
		this.alinabilecekKredi = 19;
		this.donemNumarasi = donemNumarasi;
		this.dersListesi = new ArrayList<Ders>();
	}

	/*
	 * Get metodu ile donemNumaras� i�in verilen veriyi al�r ve okur
	 * 
	 * @return sonuc int t�r�nde d�nd�r�l�r
	 */
	public int getDonemNumarasi() {
		return donemNumarasi;
	}

	/*
	 * Set metodu ile donemNumaras� i�in girilecek veriyi girmemiz sa�lan�r
	 */
	public void setDonemNumarasi(int donemNumarasi) {
		this.donemNumarasi = donemNumarasi;
	}

	/*
	 * Get metodu ile alinabilecekKredi i�in verilen veriyi al�r ve okur
	 * 
	 * @return sonuc int t�r�nde d�nd�r�l�r
	 */
	public int getAlinabilecekKredi() {
		return alinabilecekKredi;
	}

	/*
	 * Set metodu ile alinabilecekKredi i�in girilecek veriyi girmemiz sa�lan�r
	 */
	public void setAlinabilecekKredi(int alinabilecekKredi) {
		this.alinabilecekKredi = alinabilecekKredi;
	}

	/*
	 * List <ders> derslistesini listeler
	 */
	public List<Ders> getDersListesi() {
		return dersListesi;
	}

	/*
	 * derslistesine ders eklememizi sa�lar
	 */
	public void addDers(Ders ders) {
		this.dersListesi.add(ders);
	}
}
