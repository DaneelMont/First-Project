
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	House[] house1 =new House[3];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			Photo photo = new Photo();
			House house1=new House();
			System.out.println("Enter id: ");
			house1.setId(input.nextInt());

			System.out.println("Enter price: ");
			house1.setPrice(input.nextFloat());

			System.out.println("Enter location: ");
			house1.setLocation(input.nextLine());

			System.out.println("Enter advertiser: ");
			house1.setAdvertiser(input.nextLine());

			System.out.println("Enter pixel: );
			photo.setPixel(input.nextFloat());

			System.out.println("Enter byte: );
			photo.setByte(input.nextFloat());

			input.nextLine();
			house.setPhoto(photo);
			house[i] =house1;

		}
		for(House house1:house){
			System.out.println(house);
		}
	}


}
