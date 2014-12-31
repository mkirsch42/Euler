public class E0
{

	static boolean ranWithArgs = false;
	
	//@formatter:off
	static String str = 
			"01\t1.1554E-01" + 
			"02\t9.9385E-03" + 
			"03\t7.4108E+00" + 
			"04\t1.4875E+00" + 
			"05\t6.0272E-03" + 
			"06\t1.6928E-02" + 
			"07\t1.1901E+01" + 
			"08\t5.4732E-01" + 
			"09\t5.8894E-01" + 
			"10\t2.5648E+01" + 
			"11\t3.8516E+00" + 
			"12\t1.0443E+03" + 
			"13\t5.1520E-01" + 
			"14\t1.4259E+03" + 
			"15\t8.7844E-03" + 
			"16\t4.6077E+00" + 
			"17\t1.2394E+00" + 
			"18\t3.5241E+00" + 
			"19\t5.9631E-01" + 
			"20\t1.7869E+00" + 
			"21\t1.0881E+01" + 
			"22\t1.1906E+02" + 
			"23\t7.7129E+01" + 
			"24\t4.2255E-02" + 
			"25\t6.9249E-03" + 
			"26\t3.9119E+01" + 
			"27\t7.6302E-03" + 
			"28\t9.2332E-02" + 
			"29\t5.3781E+01" + 
			"30\t1.7974E+03" + 
			"31\t4.6310E+00" + 
			"32\t8.1020E+01" +
			"33\t1.2567E+00" +
			"34\t5.0636E+02" +
			"35\t2.2849E+02" +
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
		case 31:
			return 73682;
		case 32:
			return 45228;
		case 33:
			return 100;
		case 34:
			return 40730;
		case 35:
			return 55;
		case 67:
			return 7273;
		}
		return null;
	}

}
