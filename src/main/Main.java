package main;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.Random;

import adapters.MerniceServiceAdapter;
import business.abstracts.BaseCustomerManager;
import business.abstracts.ICustomerService;
import business.concretes.NeroCustomerManager;
import business.concretes.StarbucksCustomerManager;
import entities.abstracts.Entity;
import entities.concretes.Customer;
import java.util.Scanner;



public class Main {
	
	;
	
	
	public static void istek1() {
		String istek1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Yapmak istediðiniz iþlem aþaðýdakilerden hangisidir?Aþaðýya yazýnýz.");
		System.out.println("1) Müþteri ekleme");
		System.out.println("2) Müþteri sýralama");
		istek1= sc.next();
		System.out.println();
		
		switch(istek1) {
		
		case "1":
			musteriekle1();
			break;
		case "2":
			musterisirala1();
			break;
	
		}
	}
	
	
	public static void musterisirala1() {
		
		/**
		 * 
		 */
		
	}
	
	public static void musteriekle1() {
		String musteriekle1;
		Customer musteri = new Customer(
				0, firstname() , lastname(), dateOfBirth() , nationalityId()
		) ; 
	}
	
	public static String firstname() {
		String firstname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen müþteri adýný giriniz = ");
		firstname=sc.next();
		System.out.println("Müþteri adý " + firstname);
		return firstname ;
	}
	
	public static String lastname() {
		String lastname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen müþteri soyadýný giriniz = ");
		lastname=sc.next();
		System.out.println("Müþteri soyadý " + lastname);
		return lastname;
	}
	
	public static LocalDate dateOfBirth() {
		int yil;
		int ay;
		int gun;
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen müþteri doðum gününü yýl, ay, gün olarak giriniz. = ");
		yil= sc.nextInt();
		ay= sc.nextInt();
		gun= sc.nextInt();
		return LocalDate.of(yil,ay,gun);
	}
	
	public static String nationalityId() {
		String nationalityId;
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen müþteri ülke numarasýný giriniz = ");
		nationalityId=sc.next();
		System.out.println("Müþteri ülke numarasý: " + nationalityId);
		return nationalityId; 
	}
	

	public static void main(String[] args) {
		
		istek1();
		
		
	}

}
