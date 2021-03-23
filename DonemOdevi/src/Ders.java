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
	 * Ders constructor'ý içerisindeki ders adý,ders kredisi,dersin donemi
	 * nesnelerini this deyimi ile gerektiði zaman kullanýrýz
	 */

	Ders(String dersAdi, int dersKredisi, int donemi) {
		this.dersAdi = dersAdi;
		this.dersKredisi = dersKredisi;
		this.donemi = donemi;
	}

	/*
	 * Get metodu dersAdi için girilen veriyi alýr okur
	 * 
	 * @return sonuc String tipinde döndürülür
	 */
	public String getDersAdi() {
		return dersAdi;
	}

	/*
	 * Set metodu dersAdi için veri girisi yapmamýzý saðlar
	 */
	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}

	/*
	 * Get metodu dersKredisi için girilen veriyi alýr okur
	 * 
	 * @return sonuc int tipinde döndürülür
	 */
	public int getDersKredisi() {
		return dersKredisi;
	}

	/*
	 * Set metodu dersKredisi için veri girisi yapmamýzý saðlar
	 */
	public void setDersKredisi(int dersKredisi) {
		this.dersKredisi = dersKredisi;
	}
	/*
	 * Get metodu donem bilgisi için girilen veriyi alýr okur
	 * 
	 * @return sonuc int tipinde döndürülür
	 */

	public int getDonemi() {
		return donemi;
	}

	/*
	 * Set metodu donem bilgisi için veri girisi yapmamýzý saðlar
	 */
	public void setDonemi(int donemi) {
		this.donemi = donemi;
	}
}
