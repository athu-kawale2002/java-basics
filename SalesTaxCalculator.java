class SalesTaxCalculator
{
		public static void main(String ...args)
		{
			float amount = 100.0f;
			float taxRate = 10.0f;
			float taxAmt = amount*taxRate/100;
			System.out.println(taxAmt);
		}
}