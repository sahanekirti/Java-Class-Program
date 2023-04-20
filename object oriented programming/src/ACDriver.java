class ACDriver 
{
	public static void main(String[] args) 
	{
		AC a1=new AC();
		a1.brand="voltas";
		a1.model=1234;
		a1.price=10000.00;
		a1.ton=3;
		a1.type="commercial";
		a1.maxtemp=25;
        a1.mintemp=17;
		a1.star=4;
		a1.ambient=19;

		a1.displayAC();


		//a1.showMaxTemp();
      //a1.ambientTemp();

           AC a2=new AC();
		a2.brand="croma";
		a2.model=1473;
		a2.price=50000.00;
		a2.ton=3;
		a2.type="domestic";
		a2.maxtemp=23;
        a2.mintemp=14;
		a2.star=3;
		a2.ambient=23;

		a2.displayAC();
	}
}
