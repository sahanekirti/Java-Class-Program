class BagDriver 
{
	public static void main(String[] args) 
	{

		Bag b1=new Bag();
		System.out.println("Default values");

		System.out.println(b1.brand);
		System.out.println(b1.color);;
		System.out.println(b1.type);
		System.out.println(b1.waterproof);
		System.out.println(b1.pocket);

        b1.brand="american tourist";
		b1.color="black";
		b1.type="travel bag";
		b1.waterproof=true;
		b1.pocket=4;

		  System.out.println("brand:"+b1.brand);
		  System.out.println("color:"+b1.color);
		  System.out.println("type:"+b1.type);
		  System.out.println("waterproof:"+b1.waterproof);
		  System.out.println("pocket:"+b1.pocket);

			  }
}
