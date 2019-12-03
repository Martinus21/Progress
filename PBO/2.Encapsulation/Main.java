import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

// This POJO (Plain Old Java Object)
// POJO (SISTEM LOGIN)
class UserAccount{
    private ArrayList<UserAccount> DataUser = new ArrayList<UserAccount>();
    private String username;
    private String password;

    UserAccount(){}
    UserAccount(String acc_User, String acc_Password){
        this.username = acc_User;
        this.password = acc_Password;
    }

    public boolean logUser(String username, String password) {
		if(DataUser.size() < 1) {
			System.out.println("Data Kosong");
		}else{
			for(UserAccount check: DataUser) {
				if(check.getUserName().equals(username) && check.getPassword().equals(password)) {
					return true;
				}
			}
		}
		return false;
	}
	public boolean regUser(String username, String password) {
		UserAccount tmpUser = new UserAccount(username, password);
        DataUser.add(tmpUser);    
		return logUser(username, password);
	}

	public void getUsers() {
		if(DataUser.size() < 1) {
			System.out.println("Data Kosong");
		} else {
			for (UserAccount check: DataUser) {
				System.out.println("Username : " + check.getUserName());
			}
			System.out.println();
		}
    }
    
    // SET GET USERNAME
    public void setUserName(String acc_User){
        this.username = acc_User;
    }
    public String getUserName(){
        return username;
    }

    // SET GET PASSWORD
    public void setPassword(String acc_Password){
        this.password = acc_Password;
    }
    public String getPassword(){
        return password;
    }
}

// POJO (PENJUALAN BARANG)
class PenjualanBarang {
    String merk,jns,kode;
    int harga,qty,total,no;
    int ppn,grandtotal;
    int jenis,subtotal=0;
   
	// SET GET NOMER
    public void setNo(int no){
        this.no = no;
    }
    public int getNo(){
        return no;
    }

	// SET GET KODE
    public void setKode(String kode){
        this.kode = kode;
    }
    public String getKode(){
        return kode;
    }

	// SET GET MERK
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getMerk(){
        return merk;
    }

	// SET GET JENIS
    public void setjns(String jns){
        this.jns = jns;
    }
    public String getjns(){
        return jns;
    }

	// SET GET HARGA
    public void setHarga(int harga){
        this.harga = harga;
    }
    public int getHarga(){
        return harga;
    }

	// SET GET QTY
    public void setQty(int qty){
        this.qty = qty;
    }
    public int getQty(){
        return qty;
    }

	// SET GET TOTAL
    public void setTotal(int total){
        this.total = total;
	}
    public int getTotal(){
        return total;
    }
	
    public PenjualanBarang(int no,String kode,String merk, String jns, int harga, int qty, int total){
        this.no = no;
        this.kode = kode;
        this.merk = merk;
        this.jns = jns;
        this.harga = harga;
        this.qty = qty;
        this.total = total;
    }
}

// CLASS DATA PENJUALAN
class DataPenjualan {
    ArrayList<PenjualanBarang> list;
    String merk = null,jns = null;
    int harga = 0,jenis,qty = 0,total=0,subtotal=0,jmlbayar=0,kembali=0,ppn,grandtotal;;
    Scanner scan;
    Scanner pilih = new Scanner(System.in);
    Scanner masukan = new Scanner(System.in);
    Scanner jumlah = new Scanner(System.in);
    Scanner bayar = new Scanner(System.in);
    int no = 1;
    int n;
  
    void getDataJual(){
        list = new ArrayList<PenjualanBarang>();
		scan = new Scanner(System.in);
		System.out.println("\n### Uh She Up Chart ###");
        System.out.print("Masukan Jumlah Barang Transaksi : ");
        n = Integer.parseInt(scan.nextLine());
        for(int i=0; i<n; i++) {
			System.out.println("\nKode Barang ");
			System.out.println("A. ASUS");
			System.out.println("B. Dell");
			System.out.println("C. Lenovo");
			System.out.println("D. HP");
			System.out.print("Pilih Merk Barang : ");
            String kode = pilih.next();
            switch (kode){
                case "A":
                    merk="ASUS";
                    System.out.println("\nJenis Laptop ASUS");
					System.out.println("1. ZenBook");
					System.out.println("2. RoG"); 
					System.out.println("3. TuF");
					System.out.print("Silahkan pilih jenis : ");
                    jenis=masukan.nextInt();
                    if (jenis==1) {
                        jns="Zenbook";
                        harga=5000000;
                    }else if (jenis==2) {
                        jns="RoG";
                        harga=10000000;
                    }else if (jenis==3) {
                        jns="TuF";
                        harga=1500000;
                    }else{
                        System.out.println("Jenis yg anda pilih tidak ada!!!");
                    }
                    System.out.print("Silahkan masukan jumlah : ");
                    qty=masukan.nextInt();
                break;
                case "B":
                    merk="Dell";
					System.out.println("\nJenis Laptop Dell");
					System.out.println("1. Inspiron");
					System.out.println("2. Alienware"); 
					System.out.println("3. XPS");
					System.out.print("Silahkan pilih jenis : ");
                    jenis=masukan.nextInt();
                    if (jenis==1) {
                       jns="Inspiron";
                        harga=9000000;
                    }else if (jenis==2) {
                        jns="Alienware";
                        harga=27000000;
                    }else if (jenis==3) {
                        jns="XPS";
                        harga=35000000;
                    }else{
                        System.out.println("Jenis yg anda pilih tidak ada!!!");
                    }
                    System.out.print("Silahkan masukan jumlah : ");
                    qty=masukan.nextInt();
                break;
                case "C":
					merk="Lenovo";
					System.out.println("\nJenis Laptop Lenovo");
					System.out.println("1. Thinkpad");
					System.out.println("2. Ideapad"); 
					System.out.println("3. Legion");
					System.out.print("Silahkan pilih jenis : ");
                    jenis=masukan.nextInt();
                    if (jenis==1) {
                        jns="Thinkpad";
                        harga=3000000;
                    }else if (jenis==2) {
                        jns="Ideapad";
                        harga=6000000;
                    }else if (jenis==3) {
                        jns="Legion";
                        harga=13000000;
                    }else{
                        System.out.println("Jenis yg anda ppilih tidak ada!!!");
                    }
                    System.out.print("Silahkan masukan jumlah : ");
                    qty=masukan.nextInt();
				break;
                case "D":
					merk="HP";
					System.out.println("\nJenis Laptop HP");
					System.out.println("1. Envy");
					System.out.println("2. Pavilion"); 
					System.out.println("3. Omen");
					System.out.print("Silahkan pilih jenis : ");
                    jenis=masukan.nextInt();
                    if (jenis==1) {
                        jns="Envy";
                        harga=1400000;
                    }else if (jenis==2) {
                        jns="Pavilion";
                        harga=16000000;
                    }else if (jenis==3) {
                        jns="Omen";
                        harga=30000000;
                    }else{
                        System.out.println("Jenis yg anda ppilih tidak ada!!!");
                    }
                    System.out.print("Silahkan masukan jumlah : ");
                    qty=masukan.nextInt();
                break;
                default :
                    System.out.println("Kode barang adalah yang anda pilih salah. Silahkan ulangi");
                break;
            }
            total=qty*harga;
            list.add(new PenjualanBarang(no,kode,merk,jns,harga,qty,total));
            no++;
        }
    }
  
    void displayChart() {
        System.out.println("\n### CHART TOKO LAPTOP UH SHE UP SHOP ###");
        System.out.println("--------------------------------------------------------------");
        System.out.println("|No.| Kode |"+" Merk |"+" Jenis |"+" Harga |"+" Jumlah |"+" Total |");
        System.out.println("--------------------------------------------------------------");

        if(list.isEmpty()) {
            System.out.println("Chart Kosong");
        }else {
            for(int i=0; i<list.size(); i++) {
                System.out.println("|"+list.get(i).getNo() +" |"+list.get(i).getKode() +" |"
                +list.get(i).getMerk()+" |"+list.get(i).getjns()+" |"+list.get(i).getHarga()
                +" |"+list.get(i).getQty()+" |"+list.get(i).getTotal()+" |");
                subtotal+=list.get(i).getTotal();
                ppn=(int) ((int) subtotal* 0.1);
                grandtotal=subtotal+ppn;
            }
            System.out.println("--------------------------------------------------------------");
            System.out.println("\t\t\t\t\t Subtotal : Rp. "+subtotal);
            System.out.println("\t\t\t\t\t ppn : Rp. "+ppn);
            System.out.println("\t\t\t\t\t Finaltotal: Rp. "+grandtotal);
            System.out.print("\t\t\t\t\t Pembayaran: Rp. ");
            jmlbayar=bayar.nextInt();
            kembali=(int) (jmlbayar-grandtotal);
            System.out.println("\t\t\t\t\t Kembalian : Rp. "+kembali);
            System.out.print("\n");
        }
    }

    void clearChart(){
        for(int j=0; j<list.size(); j++){
            list.removeAll(list);
            no=1;
            subtotal=0;
            ppn=0;
            grandtotal=0;
        }
    }  
}

// CLASS MAIN
class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserAccount usr = new UserAccount();
		String ulang = "y";
		String pil;

		while(ulang.equals("y") || ulang.equals("Y")) {
			System.out.println("\n#### Selamat Datang ####");
			System.out.println("#### Toko Laptop Brand Uh She Up ####");
			System.out.println("");
            System.out.print("Apakah sudah memiliki account Y/N : ");
			pil = input.nextLine();

			String username, password;
			if(pil.equals("Y")) {
				System.out.println("\nLOGIN");
				System.out.print("Masukan Username anda : ");
				username = input.nextLine();
				System.out.print("Masukan Password anda : ");
				password = input.nextLine();
				if(usr.logUser(username, password)) {
					DataPenjualan objPenjualan = new DataPenjualan();
					objPenjualan.getDataJual();
					objPenjualan.displayChart();
					objPenjualan.clearChart();
				}else{
					System.out.println("Login Gagal");
				}
			}else if(pil.equals("N")) {
				System.out.println("\nREGISTER");
				System.out.print("Masukan Username anda : ");
				username = input.nextLine();
				System.out.print("Masukan Password anda : ");
				password = input.nextLine();
				if(usr.regUser(username, password)) {
                    System.out.println("Berhasil Register, Silahkan Login");
				}
			} else {
				System.out.println("Inputan yang anda masukan salah!");
			}

			System.out.print("\nUlangi program ? (Y/N) : ");		
			ulang = input.nextLine();
		}
    }
}