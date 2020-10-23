/**
 * Desc:A java class used to descride car details for parking system
 * @author Suparna Arya
 * Date:23/11/2020
 *
 */
public class CarDetails {
	private String ownerName;
	private String car_reg_no;
    public CarDetails(String ownerName,String car_reg_no)
     {
        this.ownerName=ownerName;
        this.car_reg_no=car_reg_no;
      }
    public String displayOwner()
    {
    	return ownerName;
    }
    public String displayCarReg()
    {
    	return car_reg_no;
    }

}
