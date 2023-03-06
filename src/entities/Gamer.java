package entities;

public class Gamer {
	private int id;
	private String kullaniciAdi;
	private String isim;
	private String soyisim;
	private String dogumYili;
	private String tcKimlikNo;
	
	
	public Gamer() {
		super();
	}
	public Gamer(int id, String kullaniciAdi, String isim, String soyisim, String dogumYili, String tcKimlikNo) {
		super();
		this.id = id;
		this.kullaniciAdi = kullaniciAdi;
		this.isim = isim;
		this.soyisim = soyisim;
		this.dogumYili = dogumYili;
		this.tcKimlikNo = tcKimlikNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public String getDogumYili() {
		return dogumYili;
	}
	public void setDogumYili(String dogumYili) {
		this.dogumYili = dogumYili;
	}
	public String getTcKimlikNo() {
		return tcKimlikNo;
	}
	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}
	
	
}
