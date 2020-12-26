package exceptionhandlingquestion2;

public class Validator {
	public static boolean validaterequirement(int availablestorage,String bluetoothconnectivity,String wlanconnectivity)throws RequirementMisMatchException
	{
		if(availablestorage>=2 && (bluetoothconnectivity.equals("Yes")) && (wlanconnectivity.equals("Yes")))
		{
			return true;
		}
		else
		{
			throw new RequirementMisMatchException();
		}
			
	}
	

}
