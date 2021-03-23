import java.util.ArrayList;
import java.util.List;

public class Ogrenci {
	/*
	 * @param ad - Ögrenci adý
	 * 
	 * @param soyad - Ögrenci soyadý
	 * 
	 * @param bolumu - Öðrencinin okudugu bölüm
	 * 
	 * @param sinif - Ögrencinin sýnýf durumu
	 * 
	 * @param ogrenciNo - Ögrencinin okul numarasý
	 * 
	 * @param transkript - Ögrencinin genel ortalamasý
	 * 
	 * @param donemBilgileri
	 */
	private String ad;
	private String soyad;
	private String bolumu;
	private int sinif;
	private long ogrenciNo;
	private double transkript;
	private List<Donem> donemBilgileri;

	/*
	 * Ogrenci constructor'ý içerisindeki ögrenci adý,soyadý,bolumu sýnýfý,ogrencýNo
	 * transkripti nesnelerini ve dönem bilgileri listesine this deyimi ile
	 * gerektiði zaman erisebilip kullanýrýz
	 */
	Ogrenci(String ad, String soyad, String bolumu, int sinif, long ogrenciNo, double transkript) {
		this.ad = ad;
		this.soyad = soyad;
		this.bolumu = bolumu;
		this.sinif = sinif;
		this.ogrenciNo = ogrenciNo;
		this.transkript = transkript;
		this.donemBilgileri = new ArrayList<Donem>();
	}

	/*
	 * Get metodu ile ad nesnesi için girilen veri alýnýp,okunur
	 * 
	 * @return sonuc String tipinde döndürülür
	 */
	public String getAd() {
		return ad;
	}

	/*
	 * Set metodu ile ad nesnesi için veri girisi yapýlýr
	 */
	public void setAd(String ad) {
		this.ad = ad;
	}

	/*
	 * Get metodu ile soyad nesnesi için girilen veri alýnýp,okunur
	 * 
	 * @return sonuc String tipinde döndürülür
	 */
	public String getSoyad() {
		return soyad;
	}

	/*
	 * Set metodu ile soyad nesnesi için veri girisi yapýlýr
	 */
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	/*
	 * Get metodu ile bolumu nesnesi için girilen veri alýnýp,okunur
	 * 
	 * @return sonuc String tipinde döndürülür
	 */
	public String getBolumu() {
		return bolumu;
	}

	/*
	 * Set metodu ile bolumu nesnesi için veri girisi yapýlýr
	 */
	public void setBolumu(String bolumu) {
		this.bolumu = bolumu;
	}

	/*
	 * Get metodu ile sýnýf nesnesi için girilen veri alýnýp,okunur
	 * 
	 * @return sonuc int tipinde döndürülür
	 */
	public int getSinif() {
		return sinif;
	}

	/*
	 * Set metodu ile sýnýf nesnesi için veri girisi yapýlýr
	 */
	public void setSinif(int sinif) {
		this.sinif = sinif;
	}

	/*
	 * Get metodu ile ogrenciNo nesnesi için girilen veri alýnýp,okunur
	 * 
	 * @return sonuc long tipinde döndürülür
	 */
	public long getOgrenciNo() {
		return ogrenciNo;
	}

	/*
	 * Set metodu ile ogrenciNo nesnesi için veri girisi yapýlýr
	 */
	public void setOgrenciNo(long ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

	/*
	 * Get metodu ile transkript nesnesi için girilen veri alýnýp,okunur
	 * 
	 * @return sonuc double tipinde döndürülür
	 */
	public double getTranskript() {
		return transkript;
	}

	/*
	 * Set metodu ile transkript nesnesi için veri girisi yapýlýr
	 */
	public void setTranskript(double transkript) {
		this.transkript = transkript;
	}

	/*
	 * List <Donem> DonemBilgilerini listeler
	 */
	public List<Donem> getDonemBilgileri() {
		return donemBilgileri;
	}

	/*
	 * donemListesine dönembilgilerini eklememizi saðlar
	 */
	public void addOgrenci(Donem donem) {
		this.donemBilgileri.add(donem);
	}
}
