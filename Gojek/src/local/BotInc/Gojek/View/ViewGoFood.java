package local.BotInc.Gojek.View;

import java.util.List;

import static local.BotInc.Gojek.Constant.Restaurant.*;

import local.BotInc.Gojek.Controller.GoFoodController;

public class ViewGoFood extends BaseView {

	private List<String> listHistory;

	public ViewGoFood(List<String> listHistory) {
		this.listHistory = listHistory;
		show();
	}

	@Override
	void show() {

		String namaMenu,namaRestaurant,alamatRestaurant;
		int hargaMenu,jlhPesanan;
		String namaCustomer,currentLoc;
	
		System.out.println("==== Welcome to Go-Food by " + super.brandName + " ====");
		System.out.println("Input your name : ");
		namaCustomer = input.nextLine();
		System.out.print("Input your location : ");
		currentLoc = input.nextLine();
		
		//buat bisa memasukkan makanan berulang
		tampilkanDaftar();

		do {

			System.out.print("Choose Restaurant number : ");
			int restaurantNumber = input.nextInt();

			if (restaurantNumber == 1) {
				tampilkanDaftarBgIwan();
				namaRestaurant = BGIWAN1.namaRestaurant;
				alamatRestaurant = BGIWAN1.alamatRestaurant;
				System.out.println("Silakan Pilih Menu yang akan dipesan ? ");
				int PilihanMenu = input.nextInt();

				do {

					if (PilihanMenu == 1) {
						namaMenu = BGIWAN1.namaMenu;
						hargaMenu = BGIWAN1.harga;
						break;
					} else if (PilihanMenu == 2) {
						namaMenu = BGIWAN2.namaMenu;
						hargaMenu = BGIWAN2.harga;
						break;
					} else if (PilihanMenu == 3) {
						namaMenu = BGIWAN3.namaMenu;
						hargaMenu = BGIWAN3.harga;
						break;
					} else if (PilihanMenu == 4) {
						namaMenu = BGIWAN4.namaMenu;
						hargaMenu = BGIWAN4.harga;
						break;
					} else {
						System.out.println("Menu tidak ada");
					}
				} while (true);

				break;

			} else if (restaurantNumber == 2) {
				tampilkanDaftarOtoy();
				namaRestaurant = OTOY1.namaRestaurant;
				alamatRestaurant = BGIWAN1.alamatRestaurant;
				System.out.println("Silakan Pilih Menu yang akan dipesan ? ");
				int PilihanMenu = input.nextInt();
			

				do {

					if (PilihanMenu == 1) {
						namaMenu = OTOY1.namaMenu;
						hargaMenu = OTOY1.harga;
						break;
					} else if (PilihanMenu == 2) {
						namaMenu = OTOY2.namaMenu;
						hargaMenu = OTOY2.harga;
						break;
					} else if (PilihanMenu == 3) {
						namaMenu = OTOY3.namaMenu;
						hargaMenu = OTOY3.harga;
						break;
					} else if (PilihanMenu == 4) {
						namaMenu = OTOY4.namaMenu;
						hargaMenu = OTOY4.harga;
						break;
					} else {
						System.out.println("Menu tidak ada");
					}
				} while (true);

				break;

			} else if (restaurantNumber == 3) {
				tampilkanDaftarIbuAzka();
				namaRestaurant = IbuAzka1.namaRestaurant;
				alamatRestaurant = IbuAzka1.alamatRestaurant;
				System.out.println("Silakan Pilih Menu yang akan dipesan ? ");
				int PilihanMenu = input.nextInt();

				do {

					if (PilihanMenu == 1) {
						namaMenu = IbuAzka1.namaMenu;
						hargaMenu = IbuAzka1.harga;
						break;
					} else if (PilihanMenu == 2) {
						namaMenu = IbuAzka2.namaMenu;
						hargaMenu = IbuAzka2.harga;
						break;
					} else if (PilihanMenu == 3) {
						namaMenu = IbuAzka3.namaMenu;
						hargaMenu = IbuAzka3.harga;
						break;
					} else if (PilihanMenu == 4) {
						namaMenu = IbuAzka4.namaMenu;
						hargaMenu = IbuAzka4.harga;
						break;
					} else {
						System.out.println("Menu tidak ada");
					}
				} while (true);

				break;

			} else if (restaurantNumber == 4) {
				tampilkanDaftarMieAceh();
				namaRestaurant = MIEACEH1.namaRestaurant;
				alamatRestaurant = MIEACEH1.alamatRestaurant;
				System.out.println("Silakan Pilih Menu yang akan dipesan ? ");
				int PilihanMenu = input.nextInt();

				do {

					if (PilihanMenu == 1) {
						namaMenu = MIEACEH1.namaMenu;
						hargaMenu = MIEACEH1.harga;
						break;
					} else if (PilihanMenu == 2) {
						namaMenu = MIEACEH2.namaMenu;
						hargaMenu = MIEACEH2.harga;
						break;
					} else if (PilihanMenu == 3) {
						namaMenu = MIEACEH3.namaMenu;
						hargaMenu = MIEACEH3.harga;
						break;
					} else if (PilihanMenu == 4) {
						namaMenu = MIEACEH4.namaMenu;
						hargaMenu = MIEACEH4.harga;
						break;
					} else {
						System.out.println("Menu tidak ada");
					}
				} while (true);

				break;
				
			} else {
				System.out.println("Restaurant tidak ada");
			}

		} while (true);

		System.out.println("Input amount of food : ");
		jlhPesanan = input.nextInt();
		
		System.out.println("Finding driver....");
		System.out.println("Driver Found");

		GoFoodController gofood = new GoFoodController(namaCustomer, currentLoc, namaRestaurant , alamat , namaMenu , hargaMenu, jlhPesanan);
		String cetak = gofood.start();
		listHistory.add(cetak);
		System.out.println(cetak);

		System.out.print("Repeat [y or n] : ");
		String repeat = input.nextLine();
		if ("y".equalsIgnoreCase(repeat)) {
			show();
		} else {
			new ViewMain(listHistory);
		}

	}

	public static void tampilkanDaftar() {
		System.out.println("Daftar Masakan yang dapat dipesan : ");
		tampilkanDaftarBgIwan();
		tampilkanDaftarIbuAzka();
		tampilkanDaftarMieAceh();
		tampilkanDaftarOtoy();
	}

	public static void tampilkanDaftarBgIwan() {
		System.out.println("================ (1) " + BGIWAN1.namaRestaurant + "================");
		System.out.println(BGIWAN1.no + ". Nama Menu : " + BGIWAN1.namaMenu + " dengan harga " + BGIWAN1.harga);
		System.out.println(BGIWAN2.no + ". Nama Menu : " + BGIWAN2.namaMenu + " dengan harga " + BGIWAN2.harga);
		System.out.println(BGIWAN3.no + ". Nama Menu : " + BGIWAN3.namaMenu + " dengan harga " + BGIWAN3.harga);
		System.out.println(BGIWAN4.no + ". Nama Menu : " + BGIWAN4.namaMenu + " dengan harga " + BGIWAN4.harga);
	}

	public static void tampilkanDaftarOtoy() {
		System.out.println("================ (2) " + OTOY1.namaRestaurant + "================");
		System.out.println(OTOY1.no + ". Nama Menu : " + OTOY1.namaMenu + " dengan harga " + OTOY1.harga);
		System.out.println(OTOY2.no + ". Nama Menu : " + OTOY2.namaMenu + " dengan harga " + OTOY2.harga);
		System.out.println(OTOY3.no + ". Nama Menu : " + OTOY3.namaMenu + " dengan harga " + OTOY3.harga);
		System.out.println(OTOY4.no + ". Nama Menu : " + OTOY4.namaMenu + " dengan harga " + OTOY4.harga);
	}

	public static void tampilkanDaftarIbuAzka() {
		System.out.println("================ (3) " + IbuAzka1.namaRestaurant + "================");
		System.out.println(IbuAzka1.no + ". Nama Menu : " + IbuAzka1.namaMenu + " dengan harga " + IbuAzka1.harga);
		System.out.println(IbuAzka2.no + ". Nama Menu : " + IbuAzka2.namaMenu + " dengan harga " + IbuAzka2.harga);
		System.out.println(IbuAzka3.no + ". Nama Menu : " + IbuAzka3.namaMenu + " dengan harga " + IbuAzka3.harga);
		System.out.println(IbuAzka4.no + ". Nama Menu : " + IbuAzka4.namaMenu + " dengan harga " + IbuAzka4.harga);
	}

	public static void tampilkanDaftarMieAceh() {
		System.out.println("================ (4) " + MIEACEH1.namaRestaurant + "================");
		System.out.println(MIEACEH1.no + ". Nama Menu : " + MIEACEH1.namaMenu + " dengan harga " + MIEACEH1.harga);
		System.out.println(MIEACEH2.no + ". Nama Menu : " + MIEACEH2.namaMenu + " dengan harga " + MIEACEH2.harga);
		System.out.println(MIEACEH3.no + ". Nama Menu : " + MIEACEH3.namaMenu + " dengan harga " + MIEACEH3.harga);
		System.out.println(MIEACEH4.no + ". Nama Menu : " + MIEACEH4.namaMenu + " dengan harga " + MIEACEH4.harga);

	}

}
