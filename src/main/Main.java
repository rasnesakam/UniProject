package main;

import java.nio.charset.Charset;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Random;

import adapters.MerniceServiceAdapter;
import business.abstracts.BaseCustomerManager;
import business.abstracts.ICustomerService;
import business.concretes.NeroCustomerManager;
import business.concretes.SerializableCustomerManager;
import business.concretes.StarbucksCustomerManager;
import entities.abstracts.Entity;
import entities.concretes.Customer;
import java.util.Scanner;



public class Main {
	
	;
	
	
	public static void istek1(ICustomerService service) {
		String istek1;
		Scanner sc= new Scanner(System.in);
		System.out.println("");
		System.out.println("Yapmak istedi�iniz i�lem a�a��dakilerden hangisidir?A�a��ya yaz�n�z.");
		System.out.println("1) M��teri ekleme");
		System.out.println("2) M��teri s�ralama");
		System.out.println("3) ��k��");
		istek1= sc.next();
		System.out.println();
		
		switch(istek1) {
		
		case "1":
			musteriekle1(service);
			break;
		case "2":
			musterisirala1(service);
			break;
		case "3":
			System.out.println("��k�� Yap�l�yor");
			return;
			
		}
		istek1(service);
	}
	
	
	public static void musterisirala1(ICustomerService service) {
		
		service.listAll();
	}
	
	public static void musteriekle1(ICustomerService service) {


		Customer musteri = new Customer(
				0, firstname() , lastname(), dateOfBirth() , nationalityId()
				);
		
		service.Save(musteri);
		
	}
	
	public static String firstname() {
		String firstname;
		Scanner sc=new Scanner(System.in);
		System.out.println("L�tfen m��teri ad�n� giriniz = ");
		firstname=sc.next();
		System.out.println("M��teri ad� " + firstname);
		return firstname ;
	}
	
	public static String lastname() {
		String lastname;
		Scanner sc=new Scanner(System.in);
		System.out.println("L�tfen m��teri soyad�n� giriniz = ");
		lastname=sc.next();
		System.out.println("M��teri soyad� " + lastname);
		return lastname;
	}
	
	public static LocalDate dateOfBirth() {
		try {
			int yil;
			int ay;
			int gun;
			Scanner sc=new Scanner(System.in);
			System.out.println("L�tfen m��teri do�um g�n�n� y�l, ay, g�n olarak giriniz. = ");
			yil= sc.nextInt();
			ay= sc.nextInt();
			gun= sc.nextInt();
			return LocalDate.of(yil,ay,gun);
		}catch(DateTimeException exception) {
			System.out.println("L�tfen tarih format�n� do�ru girin (y�l ay g�n)");
			return dateOfBirth();
		}
	}
	
	public static String nationalityId() {
		String nationalityId;
		Scanner sc=new Scanner(System.in);
		System.out.println("L�tfen m��teri �lke numaras�n� giriniz = ");
		nationalityId=sc.next();
		System.out.println("M��teri �lke numaras�: " + nationalityId);
		return nationalityId; 
	}
	

	public static void main(String[] args) {
		
		ICustomerService service = new SerializableCustomerManager();
		
		istek1(service);
		
		
	}

}
