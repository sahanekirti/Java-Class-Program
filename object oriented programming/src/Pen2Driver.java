class Pen2Driver 
{
	public static void main(String[] args) 
	{
		Pen2 p1=new Pen2();


        System.out.println("Default vales");
		
		System.out.println(p1.brand);
		System.out.println(p1.color);
		System.out.println(p1.price);
		System.out.println(p1.type);
		System.out.println(p1.thick);

                p1.brand="trimax";
				p1.color="blue";
				p1.price=40.0;
				p1.type="gel";
             p1.thick=0.10;
       
	      System.out.println("*********************************************");
			  System.out.println("brand:"+p1.brand);
             			  System.out.println("color:"+p1.color);
						  			  System.out.println("price:"+p1.price);
									  			  System.out.println("type:"+p1.type);
												   System.out.println("thick:"+p1.thick);
       Pen2 p2=new Pen2();


		       p2.brand="cello";
				p2.color="black";
				p2.price=10.0;
				p2.type="ball pen";
             p2.thick=0.5;
       
	      System.out.println("*********************************************");
			  System.out.println("brand:"+p2.brand);
             			  System.out.println("color:"+p2.color);
						  			  System.out.println("price:"+p2.price);
									  			  System.out.println("type:"+p2.type);
												   System.out.println("thick:"+p2.thick);


                                                     

	}
}
