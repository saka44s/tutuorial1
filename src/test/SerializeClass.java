package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeClass {
	public static void main(String a[]) {
		String filename = "C:\\Users\\rsk16\\Downloads\\HCL - personal\\HCL - personal\\Docs\\workDocs\\rs.txt";
		
		SerializeClass sc = new SerializeClass();
		sc.serializeObject(filename);
		sc.deserializeObject(filename);
		
	}
	
	public void deserializeObject(String filename) {
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee em  = (Employee)ois.readObject();
			printdata(em);
			
			ois.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void printdata(Employee object1) {
		System.out.println(object1.getDept());
    }
	
	public void serializeObject(String filename) {
		Employee ee = test1.getEmployees().get(0);
		
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(ee);
			System.out.println("Done");
			
			oos.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
