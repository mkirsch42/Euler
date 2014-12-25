public class E0
{

	static boolean ranWithArgs = false;
	
	//@formatter:off
	static String	str	= 
			"01\t1.0451E+00 \n" +
			"02\t1.0900E+00 \n" +
			"03\t1.7523E+01 \n" +
			"04\t6.2279E+00 \n" +
			"05\t6.1041E-01 \n" +
			"06\t5.5976E-01 \n" +
			"07\t2.0795E+01 \n" +
			"08\t3.6176E+00 \n" +
			"09\t2.5372E+00 \n" +
			"10\t6.1878E+01 \n" +
			"11\t2.4210E+01 \n" +
			"12\t1.1990E+03 \n" +
			"13\t3.3618E+00 \n" +
			"14\t2.2645E+03 \n" +
			"15\t6.1426E-01 \n" +
			"16\t1.5116E+01 \n" +
			"17\t1.7902E+00 \n" +
			"18\t1.8538E+01 \n" +
			"19\t8.4894E-01 \n" +
			"20\t4.8916E+00 \n" +
			"21\t6.0274E+01 \n" +
			"22\t1.9112E+02 \n" +
			"23\t2.0306E+02 \n" +
			"24\t3.4868E+00 \n" +
			"25\t8.4701E-01 \n" +
			"26\t6.8135E+01 \n" +
			"27\t8.9446E-01 \n" +
			"28\t6.9762E-01 \n" +
			"29\t3.8205E+02 \n" +
			"30\t2.2023E+03 \n" +
			"67\t4.2016E+01 \n";
	//@formatter:on

	static void val(String val)
	{
		if (getAnswer(Integer.parseInt(val))==null) {return;}
		System.out.println(val + "    = "+getAnswer(Integer.parseInt(val)));
		System.out.println(str.substring(str.indexOf(val+"\t")+val.length(),str.indexOf('\n',str.indexOf(val+"\t"))));
		ranWithArgs = true;
	}
	
	static void run()
	{
		if(ranWithArgs){return;}
		System.out.println(str);
		System.out.println("Times expressed in ms");
	}

	static Number getAnswer(int p)
	{
		switch (p)
		{
		case 1:
			return 233168;
		case 2:
			return 4613732;
		case 3:
			return 6857;
		case 4:
			return 906609;
		case 5:
			return 232792560;
		case 6:
			return 25164150;
		case 7:
			return 104743;
		case 8:
			return 23514624000L;
		case 9:
			return 31875000;
		case 10:
			return 142913828922L;
		case 11:
			return 70600674;
		case 12:
			return 76576500;
		case 13:
			return 5537376230L;
		case 14:
			return 837799;
		case 15:
			return 137846528820L;
		case 16:
			return 1366;
		case 17:
			return 21124;
		case 18:
			return 1074;
		case 19:
			return 171;
		case 20:
			return 648;
		case 21:
			return 31626;
		case 22:
			return 871198282;
		case 23:
			return 4179871;
		case 24:
			return 2783915460L;
		case 25:
			return 4782;
		case 26:
			return 983;
		case 27:
			return -59231;
		case 28:
			return 669171001L;
		case 29:
			return 9183;
		case 30:
			return 443839;
		case 67:
			return 7273;
		}
		return null;
	}

}
