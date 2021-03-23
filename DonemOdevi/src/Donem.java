import java.util.ArrayList;
import java.util.List;

public class Donem {
	/*
	 * @param alinabilecek kredi
	 * 
	 * @param donemNumarasi
	 * 
	 * @param donemOrtalamasý
	 * 
	 * @param dersListesi
	 */

	public int alinabilecekKredi;
	public int donemNumarasi;
	public List<Ders> dersListesi;

	/*
	 * Donem constructor'ý içerisindeki this deyimi ile tanýmladýgýmýz
	 * alinabilecekKredi,donemNumarasý,donemOrtalamasý ve dersListesi nesnesini
	 * gerektiðinde kullanýrýz
	 */
	Donem(int alinabilecekKredi, int donemNumarasi) {
		this.alinabilecekKredi = 19;
		this.donemNumarasi = donemNumarasi;
		this.dersListesi = new ArrayList<Ders>();
	}

	/*
	 * Get metodu ile donemNumarasý için verilen veriyi alýr ve okur
	 * 
	 * @return sonuc int türünde döndürülür
	 */
	public int getDonemNumarasi() {
		return donemNumarasi;
	}

	/*
	 * Set metodu ile donemNumarasý için girilecek veriyi girmemiz saðlanýr
	 */
	public void setDonemNumarasi(int donemNumarasi) {
		this.donemNumarasi = donemNumarasi;
	}

	/*
	 * Get metodu ile alinabilecekKredi için verilen veriyi alýr ve okur
	 * 
	 * @return sonuc int türünde döndürülür
	 */
	public int getAlinabilecekKredi() {
		return alinabilecekKredi;
	}

	/*
	 * Set metodu ile alinabilecekKredi için girilecek veriyi girmemiz saðlanýr
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
	 * derslistesine ders eklememizi saðlar
	 */
	public void addDers(Ders ders) {
		this.dersListesi.add(ders);
	}
}
