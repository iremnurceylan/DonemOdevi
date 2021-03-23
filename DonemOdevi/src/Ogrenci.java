import java.util.ArrayList;
import java.util.List;

public class Ogrenci {
	/*
	 * @param ad - �grenci ad�
	 * 
	 * @param soyad - �grenci soyad�
	 * 
	 * @param bolumu - ��rencinin okudugu b�l�m
	 * 
	 * @param sinif - �grencinin s�n�f durumu
	 * 
	 * @param ogrenciNo - �grencinin okul numaras�
	 * 
	 * @param transkript - �grencinin genel ortalamas�
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
	 * Ogrenci constructor'� i�erisindeki �grenci ad�,soyad�,bolumu s�n�f�,ogrenc�No
	 * transkripti nesnelerini ve d�nem bilgileri listesine this deyimi ile
	 * gerekti�i zaman erisebilip kullan�r�z
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
	 * Get metodu ile ad nesnesi i�in girilen veri al�n�p,okunur
	 * 
	 * @return sonuc String tipinde d�nd�r�l�r
	 */
	public String getAd() {
		return ad;
	}

	/*
	 * Set metodu ile ad nesnesi i�in veri girisi yap�l�r
	 */
	public void setAd(String ad) {
		this.ad = ad;
	}

	/*
	 * Get metodu ile soyad nesnesi i�in girilen veri al�n�p,okunur
	 * 
	 * @return sonuc String tipinde d�nd�r�l�r
	 */
	public String getSoyad() {
		return soyad;
	}

	/*
	 * Set metodu ile soyad nesnesi i�in veri girisi yap�l�r
	 */
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	/*
	 * Get metodu ile bolumu nesnesi i�in girilen veri al�n�p,okunur
	 * 
	 * @return sonuc String tipinde d�nd�r�l�r
	 */
	public String getBolumu() {
		return bolumu;
	}

	/*
	 * Set metodu ile bolumu nesnesi i�in veri girisi yap�l�r
	 */
	public void setBolumu(String bolumu) {
		this.bolumu = bolumu;
	}

	/*
	 * Get metodu ile s�n�f nesnesi i�in girilen veri al�n�p,okunur
	 * 
	 * @return sonuc int tipinde d�nd�r�l�r
	 */
	public int getSinif() {
		return sinif;
	}

	/*
	 * Set metodu ile s�n�f nesnesi i�in veri girisi yap�l�r
	 */
	public void setSinif(int sinif) {
		this.sinif = sinif;
	}

	/*
	 * Get metodu ile ogrenciNo nesnesi i�in girilen veri al�n�p,okunur
	 * 
	 * @return sonuc long tipinde d�nd�r�l�r
	 */
	public long getOgrenciNo() {
		return ogrenciNo;
	}

	/*
	 * Set metodu ile ogrenciNo nesnesi i�in veri girisi yap�l�r
	 */
	public void setOgrenciNo(long ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

	/*
	 * Get metodu ile transkript nesnesi i�in girilen veri al�n�p,okunur
	 * 
	 * @return sonuc double tipinde d�nd�r�l�r
	 */
	public double getTranskript() {
		return transkript;
	}

	/*
	 * Set metodu ile transkript nesnesi i�in veri girisi yap�l�r
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
	 * donemListesine d�nembilgilerini eklememizi sa�lar
	 */
	public void addOgrenci(Donem donem) {
		this.donemBilgileri.add(donem);
	}
}
