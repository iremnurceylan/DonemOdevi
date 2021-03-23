import javax.swing.JOptionPane;
import java.util.Scanner;

public class MainSinifi {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Danisman-Ogrenci Ýliskisi Ödevi...");

		Donem donem1 = new Donem(19, 1);
		System.out.println();
		System.out.println("/////// BÝLGÝSAYAR MÜHENDÝSLÝÐÝ Bölümü Dönemleri ve  Ders Bilgileri ///////");
		System.out.println();
		System.out.println(" ** Bu dersler " + donem1.getDonemNumarasi() + ".dönem alýnan derslerdir:");

		donem1.addDers(new Ders("Turk Dili1", 2, 1));
		donem1.addDers(new Ders("Yabancý Di1", 3, 1));
		donem1.addDers(new Ders("Bilgisayar Programlama", 3, 1));
		donem1.addDers(new Ders(" Fizik1", 4, 1));
		donem1.addDers(new Ders(" Matematik1", 4, 1));
		donem1.addDers(new Ders("Bilgisayar Müh.Giriþ", 3, 1));

		for (int i = 0; i < donem1.getDersListesi().size(); i++) {
			System.out.println((i + 1) + "-)Dersin Adý: " + donem1.getDersListesi().get(i).getDersAdi()
					+ " - Dersin Kredisi:" + donem1.getDersListesi().get(i).getDersKredisi());
		}

		System.out.println(" ****Bu dönem alýnabilecek genel kredi : " + donem1.alinabilecekKredi + " dur .***** ");
		System.out.println();

		Donem donem2 = new Donem(19, 2);
		System.out.println(" ** Bu dersler " + donem2.getDonemNumarasi() + ".dönem alýnan derslerdir:");

		donem2.addDers(new Ders("Turk Dili2", 2, 2));
		donem2.addDers(new Ders("Yabancý Dil2", 3, 2));
		donem2.addDers(new Ders("Bilgisayar Programlama2", 3, 1));
		donem2.addDers(new Ders(" Fizik2", 4, 2));
		donem2.addDers(new Ders(" Matematik2", 4, 2));
		donem2.addDers(new Ders("Lineer Cebir", 3, 2));

		for (int i = 0; i < donem2.getDersListesi().size(); i++) {
			System.out.println((i + 1) + "-)Dersin Adý: " + donem2.getDersListesi().get(i).getDersAdi()
					+ " - Dersin Kredisi:" + donem2.getDersListesi().get(i).getDersKredisi());
		}
		System.out.println(" ****Bu dönem alýnabilecek genel kredi : " + donem2.alinabilecekKredi + " dur .***** ");
		System.out.println();

		Donem donem3 = new Donem(18, 3);
		System.out.println(" ** Bu dersler " + donem3.getDonemNumarasi() + ".dönem alýnan derslerdir:");

		donem3.addDers(new Ders("Nesne Yönelimli Programlama", 3, 3));
		donem3.addDers(new Ders("Diferansiyel Denklemler", 3, 3));
		donem3.addDers(new Ders("Olasýlýk ve Ýstatistik", 3, 3));
		donem3.addDers(new Ders(" Atatürk Ýlk. ve Ýnk.Tarihi", 2, 3));
		donem3.addDers(new Ders(" Elektrik Müh.Temelleri", 3, 3));
		donem3.addDers(new Ders("Sosyal Seçmeli", 3, 3));

		for (int i = 0; i < donem3.getDersListesi().size(); i++) {
			System.out.println((i + 1) + "-)Dersin Adý: " + donem3.getDersListesi().get(i).getDersAdi()
					+ " - Dersin Kredisi:" + donem2.getDersListesi().get(i).getDersKredisi());
		}
		System.out.println(" ****Bu dönem alýnabilecek genel kredi : " + donem3.alinabilecekKredi + " dur .***** ");
		System.out.println();

		Donem donem4 = new Donem(18, 4);
		System.out.println(" ** Bu dersler " + donem4.getDonemNumarasi() + ".dönem alýnan derslerdir:");

		donem4.addDers(new Ders("Veri Yapýlarý ve Algoritmalar", 4, 3));
		donem4.addDers(new Ders("Bilgisayar Mimarisi", 3, 3));
		donem4.addDers(new Ders("Görsel Programlama", 3, 3));
		donem4.addDers(new Ders(" Atatürk Ýlk. ve Ýnk.Tarihi2", 2, 3));
		donem4.addDers(new Ders(" Elektronik Devreler", 3, 3));
		donem4.addDers(new Ders("Ayrýk Matematik", 3, 3));

		for (int i = 0; i < donem4.getDersListesi().size(); i++) {
			System.out.println(i + 1 + "-) Dersin Adi: " + donem4.getDersListesi().get(i).getDersAdi()
					+ "- Dersin Kredisi: " + donem4.getDersListesi().get(i).getDersKredisi());
		}

		System.out.println(" ****Bu dönem alýnabilecek genel kredi : " + donem4.alinabilecekKredi + " dur .***** ");
		System.out.println();
		System.out.println(" !!!!!  ÖNEMLÝ BÝLGÝ !!!!!!");
		System.out.println(
				"Ortalamasý 3.0-3.49 arasýnda olan ögrenciler fazladan 3 kredi , 3.5 ve üzeri olan ögrenciler fazladan 6 kredi daha alabilirler !!");
		System.out.println();

		Danisman[] danismanListesi = new Danisman[10];
		System.out.println(" Aþagýda mevcut Danýsman listesi bulunmaktadýr");
		danismanListesi[0] = new Danisman("Ömer_Ceylan", "Profesör", "Yazýlým");
		System.out.println("1)Danýþmanýn Adý:" + danismanListesi[0].getDanismanAdi());
		System.out.println("Unvaný:" + danismanListesi[0].getUnvan());
		System.out.println("Ana Bilim Dalý:" + danismanListesi[0].getAnaBilimDali());
		System.out.println();
		danismanListesi[0].addOgrenci(new Ogrenci("Ýremnur", "Ceylan", "Bilgisayar Mühendisliði", 1, 1, 3.3));
		danismanListesi[0].addOgrenci(new Ogrenci("Zehra ", "Ak", "Bilgisayar Mühendisliði", 1, 2, 2.8));
		danismanListesi[0].addOgrenci(new Ogrenci(" Nuran", "Korkmaz", "Bilgisayar Mühendisliði", 2, 3, 2.7));
		danismanListesi[0].addOgrenci(new Ogrenci(" Ali", "Algül", "Bilgisayar Mühendisliði", 2, 4, 2.6));
		danismanListesi[0].addOgrenci(new Ogrenci("Ayþe ", "Gündüz ", "Bilgisayar Mühendisliði", 2, 5, 2.4));
		danismanListesi[0].addOgrenci(new Ogrenci(" Hande", "Kaplan", "Bilgisayar Mühendisliði", 2, 6, 2.33));
		danismanListesi[0].addOgrenci(new Ogrenci(" Hatice", "Kartal", "Bilgisayar Mühendisliði", 1, 7, 2.87));

		danismanListesi[1] = new Danisman("Ayþe_Aydýn", "Doktor", "Yapay Zeka");
		System.out.println("2)Danýþmanýn Adý:" + danismanListesi[1].getDanismanAdi());
		System.out.println("Unvan:" + danismanListesi[1].getUnvan());
		System.out.println("Ana Bilim Dalý:" + danismanListesi[1].getAnaBilimDali());
		System.out.println();
		danismanListesi[1].addOgrenci(new Ogrenci(" Mert ", " Çakýl", "Bilgisayar Mühendisliði", 2, 8, 2.89));
		danismanListesi[1].addOgrenci(new Ogrenci(" Sevda", " Koç", "Bilgisayar Mühendisliði", 2, 9, 3.11));
		danismanListesi[1].addOgrenci(new Ogrenci(" Elif", "Ata ", "Bilgisayar Mühendisliði", 2, 10, 2.68));
		danismanListesi[1].addOgrenci(new Ogrenci(" Ayça", "Aba ", "Bilgisayar Mühendisliði", 1, 11, 3.45));
		danismanListesi[1].addOgrenci(new Ogrenci(" Aydýn", " Özkul ", "Bilgisayar Mühendisliði", 1, 12, 2.56));

		danismanListesi[2] = new Danisman("Hakan_Cakir", "Doktor", "Siber Güvenlik");
		System.out.println("3)Danýþmanýn Adý:" + danismanListesi[2].getDanismanAdi());
		System.out.println("Unvan:" + danismanListesi[2].getUnvan());
		System.out.println("Ana Bilim Dalý:" + danismanListesi[2].getAnaBilimDali());
		System.out.println();
		danismanListesi[2].addOgrenci(new Ogrenci(" Aylin", " Öz ", "Bilgisayar Mühendisliði", 1, 13, 2.53));
		danismanListesi[2].addOgrenci(new Ogrenci(" Eylül", " Öztürk ", "Bilgisayar Mühendisliði", 1, 14, 2.82));
		danismanListesi[2].addOgrenci(new Ogrenci(" Salih", " Han ", "Bilgisayar Mühendisliði", 1, 15, 2.2));
		danismanListesi[2].addOgrenci(new Ogrenci(" Mehmet Can", " Akbaba ", "Bilgisayar Mühendisliði", 1, 16, 2.2));

		System.out.println("Ögrenci listesini görmek için istediðiniz danýþmaný seciniz:");
		Scanner giris = new Scanner(System.in);
		int secim = giris.nextInt();
		System.out.println("----------------------------- SEÇTÝÐÝNÝZ DANIÞMANIN ÖGRENCÝ LÝSTESÝ --- ---------------------");
		for (int i = 0; i < danismanListesi[secim - 1].getOgrenciListesi().size(); i++) {
			System.out.println(i + 1 + "-)");
			System.out.println(" Adý:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getAd());
			System.out.println(" Soyadý:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getSoyad());
			System.out.println(" Bölümü:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getBolumu());
			System.out.println(" Sýnýfý:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getSinif());
			System.out.println(" ÖgrenciNo:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getOgrenciNo());
			System.out.println(" Transkript:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getTranskript());
		}

		System.out.println("Bilgilerini degistirmek istediðiniz ögrenciyi seciniz:");
		int secim2 = giris.nextInt();
		System.out.println("Sectiðiniz öðrenci de  deðistirmek istediðiniz durumu secin:");
		System.out.println("Ögrencinin adýný degistirmek icin 1 e basýnýz.");
		System.out.println("Ögrencinin soyadýný degistirmek icin 2 ye basýnýz.");
		System.out.println("Ögrencinin bölümünü degistirmek icin 3 e basýnýz.");
		System.out.println("Ögrencinin sýnýfýný degistirmek icin 4 e basýnýz.");
		System.out.println("Ögrencinin ogrencý numarasýný degistirmek icin 5 e basýnýz.");
		System.out.println("Ögrencinin transkriptini degistirmek icin 6 ya basýnýz.");
		System.out.println("Seciminiz:");
		int secim3 = giris.nextInt();
		System.out.println("Yeni bilgiyi giriniz:");
		switch (secim3) {
		case 1:
			String eskiAd = danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getAd();
			String ad = giris.next();
			danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).setAd(ad);
			System.out.println(" Ögrencinin " + eskiAd + " olan adý "
					+ danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getAd() + " olarak degistirildi.");
			break;
		case 2:
			String eskiSoyad = danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getSoyad();
			String soyad = giris.next();
			danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).setSoyad(soyad);
			System.out.println("Ögrencinin " + eskiSoyad + " olan soyadý "
					+ danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getSoyad()
					+ " olarak degistirildi.");
			break;
		case 3:
			String eskiBolumu = danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getBolumu();
			String bolumu = giris.next();
			danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).setBolumu(bolumu);
			System.out.println("Ögrencinin " + eskiBolumu + " olan bölümü "
					+ danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getBolumu()
					+ " olarak degistirildi.");
			break;
		case 4:
			int eskiSinifi = danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getSinif();
			int sinifi = giris.nextInt();
			danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).setSinif(sinifi);
			System.out.println("Ögrencinin " + eskiSinifi + " olan sýnýfý "
					+ danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getSinif()
					+ " olarak degistirildi.");
			break;
		case 5:
			long eskiNumarasi = danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getOgrenciNo();
			long numarasi = giris.nextLong();
			danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).setOgrenciNo(numarasi);
			System.out.println("Ögrencinin " + eskiNumarasi + " olan  numarasý "
					+ danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getOgrenciNo()
					+ " olarak degistirildi.");
			break;
		case 6:
			double eskiTranskripti = danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getTranskript();
			double transkript = giris.nextDouble();
			danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).setTranskript(transkript);
			System.out.println("Ögrencinin " + eskiTranskripti + " olan transkripti "
					+ danismanListesi[secim - 1].getOgrenciListesi().get(secim2 - 1).getTranskript()
					+ " olarak degistirildi.");
			break;
		default:
			System.out.println("Hatalý giris yaptýnýz.Yeniden giris yapýn !!");
			break;
		}

		for (int i = 0; i < danismanListesi[secim - 1].getOgrenciListesi().size(); i++) {
			System.out.println(i + 1 + "-)");
			System.out.println(" Adý:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getAd());
			System.out.println(" Soyadý:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getSoyad());
			System.out.println(" Bölümü:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getBolumu());
			System.out.println(" Sýnýfý:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getSinif());
			System.out.println(" ÖgrenciNo:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getOgrenciNo());
			System.out.println(" Transkript:" + danismanListesi[secim - 1].getOgrenciListesi().get(i).getTranskript());
		}
	}
}