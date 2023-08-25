
package week1.assignments;

public class Twowheeler {
	int noOfWheels;
	short noOfMirrors;
	long chassisNumber;
	boolean isPunctured;
	String bikeName;
	double runningKM;
public static void main(String[] args) {
	Twowheeler bike=new Twowheeler();
	bike.noOfWheels=2;
	bike.noOfMirrors=2;
	bike.chassisNumber=123456789l;
	bike.isPunctured=true;
	bike.bikeName="Honda shine";
	bike.runningKM=20.6;
	System.out.println("No of wheels"+bike.noOfWheels+"\n"+"no of mirrors"+bike.noOfMirrors+"\n"+"chassisnumber"+bike.chassisNumber+"\n"+"is punctured"+bike.isPunctured+"\n"+"bike name"+bike.bikeName+"\n"+"runing km"+bike.runningKM);
}}


