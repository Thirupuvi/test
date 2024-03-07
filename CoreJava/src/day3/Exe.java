package day3;


public class Exe {
	public static void main(String[] args) {
		Customer cl=new Customer();
		Customer c2=new Customer();
		Customer c3=new Customer();
		cl.setAddress("TamilNadu");
		cl.setCid(10);
		cl.setName("Puvi");
		System.out.println("ID: "+cl.getCid()+"\nName: "+cl.getName()+"\nADDRESS: "+cl.getAddress());
		c2.setAddress("TamilNadu");
		c2.setCid(10);
		c2.setName("Ruu");
		System.out.println(c2);
		System.out.println(c3);
		
		
	}
	

}


