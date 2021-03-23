import javax.swing.JOptionPane;
import java.util.Scanner;

public class MainSinifi {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Danisman-Ogrenci �liskisi �devi...");

		Donem donem1 = new Donem(19, 1);
		System.out.println();
		System.out.println("/////// B�LG�SAYAR M�HEND�SL��� B�l�m� D�nemleri ve  Ders Bilgileri ///////");
		System.out.println();
		System.out.println(" ** Bu dersler " + donem1.getDonemNumarasi() + ".d�nem al�nan derslerdir:");

		donem1.addDers(new Ders("Turk Dili1", 2, 1));
		donem1.addDers(new Ders("Yabanc� Di1", 3, 1));
		donem1.addDers(new Ders("Bilgisayar Programlama", 3, 1));
		donem1.addDers(new Ders(" Fizik1", 4, 1));
		donem1.addDers(new Ders(" Matematik1", 4, 1));
		donem1.addDers(new Ders("Bilgisayar M�h.Giri�", 3, 1));

		for (int i = 0; i < donem1.getDersListesi().size(); i++) {
			System.out.println((i + 1) + "-)Dersin Ad�: " + donem1.getDersListesi().get(i).getDersAdi()
					+ " - Dersin Kredisi:" + donem1.getDersListesi().get(i).getDersKredisi());
		}

		System.out.println(" ****Bu d�nem al�nabilecek genel kredi : " + donem1.alinabilecekKredi + " dur .***** ");
		System.out.println();

		Donem donem2 = new Donem(19, 2);
		System.out.println(" ** Bu dersler " + donem2.getDonemNumarasi() + ".d�nem al�nan derslerdir:");

		donem2.addDers(new Ders("Turk Dili2", 2, 2));
		donem2.addDers(new Ders("Yabanc� Dil2", 3, 2));
		donem2.addDers(new Ders("Bilgisayar Programlama2", 3, 1));
		donem2.addDers(new Ders(" Fizik2", 4, 2));
		donem2.addDers(new Ders(" Matematik2", 4, 2));
		donem2.addDers(new Ders("Lineer Cebir", 3, 2));

		for (int i = 0; i < donem2.getDersListesi().size(); i++) {
			System.out.println((i + 1) + "-)Dersin Ad�: " + donem2.getDersListesi().get(i).getDersAdi()
					+ " - Dersin Kredisi:" + donem2.getDersListesi().get(i).getDersKredisi());
		}
		System.out.println(" ****Bu d�nem al�nabilecek genel kredi : " + donem2.alinabilecekKredi + " dur .***** ");
		System.out.println();

		Donem donem3 = new Donem(18, 3);
		System.out.println(" ** Bu dersler " + donem3.getDonemNumarasi() + ".d�nem al�nan derslerdir:");

		donem3.addDers(new Ders("Nesne Y�nelimli Programlama", 3, 3));
		donem3.addDers(new Ders("Diferansiyel Denklemler", 3, 3));
		donem3.addDers(new Ders("Olas�l�k ve �statistik", 3, 3));
		donem3.addDers(new Ders(" Atat�rk �lk. ve �nk.Tarihi", 2, 3));
		donem3.addDers(new Ders(" Elektrik M�h.Temelleri", 3, 3));
		donem3.addDers(new Ders("Sosyal Se�meli", 3, 3));

		for (int i = 0; i < donem3.getDersListesi().size(); i++) {
			System.out.println((i + 1) + "-)Dersin Ad�: " + donem3.getDersListesi().get(i).getDersAdi()
					+ " - Dersin Kredisi:" + donem2.getDersListesi().get(i).getDersKredisi());
		}
		System.out.println(" ****Bu d�nem al�nabilecek genel kredi : " + donem3.alinabilecekKredi + " dur .***** ");
		System.out.println();

		Donem donem4 = new Donem(18, 4);
		System.out.println(" ** Bu dersler " + donem4.getDonemNumarasi() + ".d�nem al�nan derslerdir:");

		donem4.addDers(new Ders("Veri Yap�lar� ve Algoritmalar", 4, 3));
		donem4.addDers(new Ders("Bilgisayar Mimarisi", 3, 3));
		donem4.addDers(new Ders("G�rsel Programlama", 3, 3));
		donem4.addDers(new Ders(" Atat�rk �lk. ve �nk.Tarihi2", 2, 3));
		donem4.addDers(new Ders(" Elektronik Devreler", 3, 3));
		donem4.addDers(new Ders("Ayr�k Matematik", 3, 3));

		for (int i = 0; i < donem4.getDersListesi().size(); i++) {
			System.out.println(i + 1 + "-) Dersin Adi: " + donem4.getDersListesi().get(i).getDersAdi()
					+ "- Dersin Kredisi: " + donem4.getDersListesi().get(i).getDersKredisi());
		}

		System.out.println(" ****Bu d�nem al�nabilecek genel kredi : " + donem4.alinabilecekKredi + " dur .***** ");
		System.out.println();
		System.out.println(" !!!!!  �NEML� B�LG� !!!!!!");
		System.out.println(
				"Ortalamas� 3.0-3.49 aras�nda olan �grenciler fazladan 3 kredi , 3.5 ve �zeri olan �grenciler fazladan 6 kredi daha alabilirler !!");
		System.out.println();

		Danisman[] danismanListesi = new Danisman[10];
		System.out.println(" A�ag�da mevcut Dan�sman listesi bulunmaktad�r");
		danismanListesi[0] = new Danisman("�mer_Ceylan", "Profes�r", "Yaz�l�m");
		System.out.println("1)Dan��man�n Ad�:" + danismanListesi[0].getDanismanAdi());
		System.out.println("Unvan�:" + danismanListesi[0].getUnvan());
		System.out.println("Ana Bilim Dal�:" + danismanListesi[0].getAnaBilimDali());
		System.out.println();
		danismanListesi[0].addOgrenci(new Ogrenci("�remnur", "Ceylan", "Bilgisayar M�hendisli�i", 1, 1, 3.3));
		danismanListesi[0].addOgrenci(new Ogrenci("Zehra ", "Ak", "Bilgisayar M�hendisli�i", 1, 2, 2.8));
		danismanListesi[0].addOgrenci(new Ogrenci(" Nuran", "Korkmaz", "Bilgisayar M�hendisli�i", 2, 3, 2.7));
		danismanListesi[0].addOgrenci(new Ogrenci(" Ali", "Alg�l", "Bilgisayar M�hendisli�i", 2, 4, 2.6));
		danismanListesi[0].addOgrenci(new Ogrenci("Ay�e ", "G�nd�z ", "Bilgisayar M�hendisli�i", 2, 5, 2.4));
		danismanListesi[0].addOgrenci(new Ogrenci(" Hande", "Kaplan", "Bilgisayar M�hendisli�i", 2, 6, 2.33));
		danismanListesi[0].addOgrenci(new Ogrenci(" Hatice", "Kartal", "Bilgisayar M�hendisli�i", 1, 7, 2.87));

		danismanListesi[1] = new Danisman("Ay�e_Ayd�n", "Doktor", "Yapay Zeka");
		System.out.println("2)Dan��man�n Ad�:" + danismanListesi[1].getDanismanAdi());
		System.out.println("Unvan:" + danismanListesi[1].getUnvan());
		System.out.println("Ana Bilim Dal�:" + danismanListesi[1].getAnaBilimDali());
		System.out.println();
		danismanListesi[1].addOgrenci(new Ogrenci(" Mert ", " �ak�l", "Bilgisayar M�hendisli�i", 2, 8, 2.89));
		danismanListesi[1].addOgrenci(new Ogrenci(" Sevda", " Ko�", "Bilgisayar M�hendisli�i", 2, 9, 3.11));
		danismanListesi[1].addOgrenci(new Ogrenci(" Elif", "Ata ", "Bilgisayar M�hendisli�i", 2, 10, 2.68));
		danismanListesi[1].addOgrenci(new Ogrenci(" Ay�a", "Aba ", "Bilgisayar M�hendisli�i", 1, 11, 3.45));
		danismanListesi[1].addOgrenci(new Ogrenci(" Ayd�n", " �zkul ", "Bilgisayar M�hendisli�i", 1, 12, 2.56));

		danismanListesi[2] = new Danisman("Hakan_Cakir", "Doktor", "Siber G�venlik");
		System.out.println("3)Dan��man�n Ad�:" + danismanListesi[2].getDanismanAdi());
		System.out.println("Unvan:" + danismanListesi[2].getUnvan());
		System.out.println("Ana Bilim Dal�:" + danismanListesi[2].getAnaBilimDali());
		System.out.println();
		danismanListesi[2].addOgrenci(new Ogrenci(" Aylin", " �z ", "Bilgisayar M�hendisli�i", 1, 13, 2.53));
		danismanListesi[2].addOgrenci(new Ogrenci(" Eyl�l", " �zt�rk ", "Bilgisayar M�hendisli�i", 1, 14, 2.82));
		danismanListesi[2].addOgrenci(new Ogrenci(" Salih", " Han ", "Bilgisayar M�hendisli�i", 1, 15, 2.2));
		danismanListesi[2].addOgrenci(new Ogrenci(" Mehmet Can", " Akbaba ", "Bilgisayar M�hendisli�i", 1, 16, 2.2));

		System.out.println("�grenci listesini g�rmek i�in istedi�iniz dan��man� seciniz:");
		Scanner giris = new Scanner(System.in);
		int secim = giris.nextInt();
		System.out.println("----------------------------- SE�T���N�Z DANI�MANIN �GRENC� L�STES� --- ---------------------");
		for (int i = 0; i < danismanListesi[secim - 1].getOgrenciListesi().size(); i++) {
			System.out.println(i + 1 + "-)");
			System.out.println(" Ad�:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getAd());
			System.out.println(" Soyad�:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getSoyad());
			System.out.println(" B�l�m�:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getBolumu());
			System.out.println(" S�n�f�:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getSinif());
			System.out.println(" �grenciNo:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getOgrenciNo());
			System.out.println(" Transkript:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getTranskript());
		}

		System.out.println("Bilgilerini degistirmek istedi�iniz �grenciyi seciniz:");
		int secim2 = giris.nextInt();
		System.out.println("Secti�iniz ��renci de  de�istirmek istedi�iniz durumu secin:");
		System.out.println("�grencinin ad�n� degistirmek icin 1 e bas�n�z.");
		System.out.println("�grencinin soyad�n� degistirmek icin 2 ye bas�n�z.");
		System.out.println("�grencinin b�l�m�n� degistirmek icin 3 e bas�n�z.");
		System.out.println("�grencinin s�n�f�n� degistirmek icin 4 e bas�n�z.");
		System.out.println("�grencinin ogrenc� numaras�n� degistirmek icin 5 e bas�n�z.");
		System.out.println("�grencinin transkriptini degistirmek icin 6 ya bas�n�z.");
		System.out.println("Seciminiz:");
		int secim3 = giris.nextInt();
		System.out.println("Yeni bilgiyi giriniz:");
		switch (secim3) {
		case 1:
			String eskiAd = danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getAd();
			String ad = giris.next();
			danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).setAd(ad);
			System.out.println(" �grencinin " + eskiAd + " olan ad� "
					+ danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getAd() + " olarak degistirildi.");
			break;
		case 2:
			String eskiSoyad = danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getSoyad();
			String soyad = giris.next();
			danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).setSoyad(soyad);
			System.out.println("�grencinin " + eskiSoyad + " olan soyad� "
					+ danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getSoyad()
					+ " olarak degistirildi.");
			break;
		case 3:
			String eskiBolumu = danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getBolumu();
			String bolumu = giris.next();
			danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).setBolumu(bolumu);
			System.out.println("�grencinin " + eskiBolumu + " olan b�l�m� "
					+ danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getBolumu()
					+ " olarak degistirildi.");
			break;
		case 4:
			int eskiSinifi = danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getSinif();
			int sinifi = giris.nextInt();
			danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).setSinif(sinifi);
			System.out.println("�grencinin " + eskiSinifi + " olan s�n�f� "
					+ danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getSinif()
					+ " olarak degistirildi.");
			break;
		case 5:
			long eskiNumarasi = danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getOgrenciNo();
			long numarasi = giris.nextLong();
			danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).setOgrenciNo(numarasi);
			System.out.println("�grencinin " + eskiNumarasi + " olan  numaras� "
					+ danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getOgrenciNo()
					+ " olarak degistirildi.");
			break;
		case 6:
			double eskiTranskripti = danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getTranskript();
			double transkript = giris.nextDouble();
			danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).setTranskript(transkript);
			System.out.println("�grencinin " + eskiTranskripti + " olan transkripti "
					+ danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getTranskript()
					+ " olarak degistirildi.");
			break;
		default:
			System.out.println("Hatal� giris yapt�n�z.Yeniden giris yap�n !!");
			break;
		}

		for (int i = 0; i < danismanListesi[secim - 1].getOgrenciListesi().size(); i++) {
			System.out.println(i + 1 + "-)");
			System.out.println(" Ad�:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getAd());
			System.out.println(" Soyad�:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getSoyad());
			System.out.println(" B�l�m�:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getBolumu());
			System.out.println(" S�n�f�:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getSinif());
			System.out.println(" �grenciNo:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getOgrenciNo());
			System.out.println(" Transkript:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getTranskript());
		}
	}
}