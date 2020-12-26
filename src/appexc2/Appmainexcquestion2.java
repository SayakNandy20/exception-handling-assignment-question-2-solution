package appexc2;

import java.util.Scanner;

import exceptionhandlingquestion2.RequirementMisMatchException;
import exceptionhandlingquestion2.Validator;


public class Appmainexcquestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Entrer the available storage(In GB)");
		int availablestorage=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter bluetooth Connectivity");
		String bluetoothconnectivity=sc.nextLine();
		System.out.println("Enter the WLAN Connectivity");
        String WLANConnectivity=sc.nextLine();
        Validator validator=new Validator();
        try {
        	validator.validaterequirement(availablestorage, bluetoothconnectivity, WLANConnectivity);
        	System.out.println("Thank you!!Transfer success");
        }
        catch(RequirementMisMatchException e)
        {
        	e.Rqmentmismatch();
        }
        
	}

}
