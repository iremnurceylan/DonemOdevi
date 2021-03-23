public class Ders {
	/*
	 * @param dersAdi
	 * 
	 * @param dersKredisi
	 * 
	 * @param donemi
	 */
	private String dersAdi;
	private int dersKredisi;
	private int donemi;

	/*
	 * Ders constructor'� i�erisindeki ders ad�,ders kredisi,dersin donemi
	 * nesnelerini this deyimi ile gerekti�i zaman kullan�r�z
	 */

	Ders(String dersAdi, int dersKredisi, int donemi) {
		this.dersAdi = dersAdi;
		this.dersKredisi = dersKredisi;
		this.donemi = donemi;
	}

	/*
	 * Get metodu dersAdi i�in girilen veriyi al�r okur
	 * 
	 * @return sonuc String tipinde d�nd�r�l�r
	 */
	public String getDersAdi() {
		return dersAdi;
	}

	/*
	 * Set metodu dersAdi i�in veri girisi yapmam�z� sa�lar
	 */
	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}

	/*
	 * Get metodu dersKredisi i�in girilen veriyi al�r okur
	 * 
	 * @return sonuc int tipinde d�nd�r�l�r
	 */
	public int getDersKredisi() {
		return dersKredisi;
	}

	/*
	 * Set metodu dersKredisi i�in veri girisi yapmam�z� sa�lar
	 */
	public void setDersKredisi(int dersKredisi) {
		this.dersKredisi = dersKredisi;
	}
	/*
	 * Get metodu donem bilgisi i�in girilen veriyi al�r okur
	 * 
	 * @return sonuc int tipinde d�nd�r�l�r
	 */

	public int getDonemi() {
		return donemi;
	}

	/*
	 * Set metodu donem bilgisi i�in veri girisi yapmam�z� sa�lar
	 */
	public void setDonemi(int donemi) {
		this.donemi = donemi;
	}
}
