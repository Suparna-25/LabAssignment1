/**
 * Desc:A java program that provides salutation for predefined names
 * @author Suparna Arya
 * Date:23/11/2020
 *
 */
public class SalutationClass {
	public static void main(String[] args) {
		String [][] names_salutaions= {{"Mr.","Mrs.","Ms."},
				{"Pratik","Aishwarya","Surya","Dishant","Somesh","Praveen"}};
		System.out.println(names_salutaions[0][0]+names_salutaions[1][0]);
		System.out.println(names_salutaions[0][2]+names_salutaions[1][1]);
		System.out.println(names_salutaions[0][1]+names_salutaions[1][2]);
		System.out.println(names_salutaions[0][0]+names_salutaions[1][3]);
		System.out.println(names_salutaions[0][0]+names_salutaions[1][4]);
		System.out.println(names_salutaions[0][0]+names_salutaions[1][5]);
	 
	}

}
