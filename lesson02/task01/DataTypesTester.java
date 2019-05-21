
public class DataTypesTester {
	public static void testByte() {
		byte a=5, b=2, c;
		
		System.out.println("\n*****        testByte        *****");
		System.out.println("\n***** Arithmetical Operators *****");
		
		//При выполнении математических операций происходит 
		//автоматическое продвижение типов byte и short к типу int

		// addition
		c = (byte)(a + b);
		System.out.printf("%d + %d = %d\n", a,b,c);
		// subtraction
		c = (byte)(a - b);
		System.out.printf("%d - %d = %d\n", a,b,c);
		// multiplication
		c = (byte)(a * b);
		System.out.printf("%d * %d = %d\n", a,b,c);
		// division
		c = (byte)(a / b);
		System.out.printf("%d / %d = %d\n", a,b,c);
		// modulus
		c = (byte)(a % b);
		System.out.printf("%d %% %d = %d\n", a,b,c);
		// unary minus
		c = (byte)(-a);
		System.out.printf("-%d  = %d\n", a,c);
		// unary plus
		a = 5;
		c = (byte)(+a);
		System.out.printf("+%d  = %d\n", a,c);
		//prefix increment
		System.out.printf("++%d  = %d\n", a,++a);
		//postfix increment
		a = 5;
		System.out.printf("%d++  = %d\n", a,a++);
		//prefix decriment
		a = 5;
		System.out.printf("--%d  = %d\n", a,--a);
		//postfix decriment
		a = 5;
		System.out.printf("%d--  = %d\n", a,a--);
		
		System.out.println("\n***** Bitwise Operators *****");
		
		c = (byte)(a & b); // bitwise AND
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = (byte)(a | b); // bitwise OR
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = (byte)(a ^ b); // bitwise XOR
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = (byte)(~a); // bitwise unary compliment
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		c = (byte)(a << 1); // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		a = 64;
		// из-за автоматического продвижения результата сдвига к типу int
		// результат операции сдвега влево может получиться отличным от ожидаемого
		int i = a << 2; // left shift
		System.out.printf("%d << 1 = %d\n", a, i);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(i));
		// необходимо явное приведение результата операции к типу byte
		c = (byte)(a << 2); // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		a = 5;
		c = (byte)(a >> 1); // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		a = -5;
		c = (byte)(a >> 1); // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		a = 5;
		c = (byte)(a >>> 1); // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		a = -5;
		c = (byte)(a >>> 1); // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		System.out.println("\n***** Assignment Operators *****");
		
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		
		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception
		
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
		
		System.out.println("\n***** Relational Operators *****");
		
		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);
		
		System.out.println("\n***** Logical Operations *****");
		
		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
				(a > b) && (a > 0));
		
		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
				(a > b) & (a > 0));
		
		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
				(a >= b) || (b != 0));
		
		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
				(a >= b) | (b != 0));
		
		// logical XOR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
				(a >= b) ^ (b != 0));
		
		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		System.out.println("\n***** Misc Operators *****");
		System.out.println("\nCondition Operator:");
		
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
		
		System.out.println("\nType Cast Operator:");
		int iValue = 4567;
		short sh = -32000;
		char ch = '\u0002';
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		c = (byte)iValue;
		System.out.printf("byte = int: c = (byte)%d --> c = %d\n", iValue, c);
		c = (byte)sh;
		System.out.printf("byte = short: c = (byte)%d --> c = %d\n", sh, c);
		c = (byte)ch;
		System.out.printf("byte = char: c = (byte)'%c' --> c = %d\n", ch, c);
		c = (byte) l;
		System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);
		c = (byte) f;
		System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
		c = (byte) d;
		System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
		// c = (byte)bool;
		System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n", bool);
	}
	public static void testShort() {
		short a=5, b=2, c;
		
		System.out.println("\n***** testShort *****");
		System.out.println("\n***** Arithmetical Operators *****");
		
		// addition
		//c = a + b; // Type mismatch: cannot convert from int to short
		
		// При выполнении математических операций происходит автоматическое продвижение
		// типов byte и short к типу int, чтобы не допустить переполнения
		
		c = (short)(a + b);
		System.out.printf("%d + %d = %d\n", a,b,c);
		// subtraction
		c = (short)(a - b);
		System.out.printf("%d - %d = %d\n", a,b,c);
		// multiplication
		c = (short)(a * b);
		System.out.printf("%d * %d = %d\n", a,b,c);
		// division
		c = (short)(a / b);
		System.out.printf("%d / %d = %d\n", a,b,c);
		// modulus
		c = (short)(a % b);
		System.out.printf("%d %% %d = %d\n", a,b,c);
		
		a = 5;
		// unary minus
		//c = -a; // cannot convert from int to short
		c = (short)(-a);
		System.out.printf("-%d  = %d\n", a,c);
		// unary plus
		//c = +a; // cannot convert from int to short
		c = (short)(+a);
		System.out.printf("+%d  = %d\n", a,c);
		//prefix increment
		a = 5;
		System.out.printf("++%d  = %d\n", a,++a);
		//postfix increment
		a = 5;
		System.out.printf("%d++  = %d\n", a,a++);
		//prefix decriment
		a = 5;
		System.out.printf("--%d  = %d\n", a,--a);
		//postfix decriment
		a = 5;
		System.out.printf("%d--  = %d\n", a,a--);
		
		c = (short)(a & b); // bitwise AND
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = (short)(a | b); // bitwise OR
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = (short)(a ^ b); // bitwise XOR
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = (short)(~a); // bitwise unary compliment
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		c = (short)(a << 1); // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		a = 16384;
		// из-за автоматического продвижения результата сдвига к типу int
		// результат операции сдвега влево может получиться отличным от ожидаемого
		int i = a << 2; // left shift
		System.out.printf("%d << 1 = %d\n", a, i);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(i));
		// необходимо явное приведение результата операции к типу byte
		c = (short)(a << 2); // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		a = 5;
		c = (short)(a >> 1); // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		a = -5;
		c = (short)(a >> 1); // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		a = 5;
		c = (short)(a >>> 1); // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		a = -5;
		c = (short)(a >>> 1); // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		System.out.println("\n***** Assignment Operators *****");
		
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		
		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception
		
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
		
		System.out.println("\n***** Relational Operators *****");
		
		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);
		
		System.out.println("\n***** Logical Operations *****");
		
		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
				(a > b) && (a > 0));
		
		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
				(a > b) & (a > 0));
		
		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
				(a >= b) || (b != 0));
		
		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
				(a >= b) | (b != 0));
		
		// logical XOR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
				(a >= b) ^ (b != 0));
		
		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		System.out.println("\n***** Misc Operators *****");
		System.out.println("\nCondition Operator:");
		
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
		
		System.out.println("\nType Cast Operator:");
		byte bt = 1;
		int iValue = -32000;
		char ch = '\u0002';
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		c = bt;
		System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);
		c = (short)iValue;
		System.out.printf("short = short: c = (short)%d --> c = %d\n", iValue, c);
		c = (short)ch;
		System.out.printf("short = char: c = (short)'%c' --> c = %d\n", ch, c);
		c = (short) l;
		System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);
		c = (short) f;
		System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
		c = (short) d;
		System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
		// c = (short)bool;
		System.out.printf("short = boolean: c = (short)%b --> Compile Error\n", bool);
	}
	public static void testChar() {
		char a=88, b='\u0059', c;
		
		System.out.println("\n*****        testChar        *****");
		System.out.println("\n***** Arithmetical Operators *****");
		
		// addition
		c = (char)(a + b);
		System.out.printf("%c + %c = %c\n", a,b,c);
		// subtraction
		c = (char)(a - b);
		System.out.printf("%c - %c = %c\n", a,b,c);
		// multiplication
		c = (char)(a * b);
		System.out.printf("%c * %c = %c\n", a,b,c);
		// division
		c = (char)(a / b);
		System.out.printf("%c / %c = %c\n", a,b,c);
		// modulus
		c = (char)(a % b);
		System.out.printf("%c %% %c = %c\n", a,b,c);
		
		a = 88;
		// unary minus
		c = (char)(-a);
		System.out.printf("-%c  = %c\n", a,c);
		// unary plus
		c = (char)(+a);
		System.out.printf("+%c  = %c\n", a,c);
		//prefix increment
		a = 88;
		System.out.printf("++%c  = %c\n", a,++a);
		//postfix increment
		a = 88;
		System.out.printf("%c++  = %c\n", a,a++);
		//prefix decriment
		a = 88;
		System.out.printf("--%c  = %c\n", a,--a);
		//postfix decriment
		a = 88;
		System.out.printf("%c--  = %c\n", a,a--);
		
		System.out.println("\n***** Bitwise Operators *****");
		
		c = (char)(a & b); // bitwise AND
		System.out.printf("%c & %c = %c\n", a, b, c);
		System.out.println("in binary form:");
		
		c = (char)(a | b); // bitwise OR
		System.out.printf("%c | %c = %c\n", a, b, c);
		
		c = (char)(a ^ b); // bitwise XOR
		System.out.printf("%c ^ %c = %c\n", a, b, c);
		
		c = (char)(~a); // bitwise unary compliment
		System.out.printf("~%c = %c\n", a, c);
		
		c = (char)(a << 1); // left shift
		System.out.printf("%c << 1 = %c\n", a, c);
				
		c = (char)(a >> 1); // right shift
		System.out.printf("%c >> 1 = %c\n", a, c);
		
		a = '\u0023';
		c = (char)(a >>> 1); // zero fill right shift
		System.out.printf("%c >>> 1 = %c\n", a, c);
				
		System.out.println("\n***** Assignment Operators *****");
		
		System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
		System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
		System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
		System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
		System.out.printf("%c %%= %c --> c = %c\n", c, a, c %= a);
		
		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception
		
		System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
		System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
		System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);
		System.out.printf("%c >>= 1 --> c = %c\n", c, c >>= 1);
		System.out.printf("%c <<= 1 --> c = %c\n", c, c <<= 1);
		System.out.printf("%c >>>= 1 --> c = %c\n", c, c >>>= 1);
		
		System.out.println("\n***** Relational Operators *****");
		
		a = 88;
		// greater than
		System.out.printf("%c > %c --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%c < %c --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%c == %c --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%c != %c --> %b\n", a, b, a != b);
		
		System.out.println("\n***** Logical Operations *****");
		
		// logical AND
		System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a,
				(a > b) && (a > 0));
		
		// bitwise logical AND
		System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a,
				(a > b) & (a > 0));
		
		// logical OR
		System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b,
				(a >= b) || (b != 0));
		
		// bitwise logical OR
		System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b,
				(a >= b) | (b != 0));
		
		// logical XOR
		System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b,
				(a >= b) ^ (b != 0));
		
		// logical NOT
		System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));
		
		System.out.println("\n***** Misc Operators *****");
		System.out.println("\nCondition Operator:");
		
		System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, (a > b ? a : b));
		
		System.out.println("\nType Cast Operator:");
		byte bt = 1;
		short sh = -32000;
		int i = 373623764;
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		c = (char) bt;
		System.out.printf("int = byte: c = (char)%d --> c = %c\n", bt, c);
		c = (char) sh;
		System.out.printf("int = short: c = (char)%d --> c = %c\n", sh, c);
		c = (char) i;
		System.out.printf("int = char: c = (char)%d --> c = %c\n", i, c);
		c = (char) l;
		System.out.printf("int = long: c = (char)%d --> c = %c\n", l, c);
		c = (char) f;
		System.out.printf("int = float: c = (char)%f --> c = %c\n", f, c);
		c = (char) d;
		System.out.printf("int = double: c = (char)%f --> c = %c\n", d, c);
		// c = (char) bool;
		System.out.printf("int = boolean: c = (char)%b --> Compile Error\n", bool);
		
	}
	public static void testInt() {
		int a=5, b=2, c;
		
		System.out.println("\n***** testInt *****");
		System.out.println("\n***** Arithmetical Operators *****");
		
		// addition
		c = a + b;
		System.out.printf("%d + %d = %d\n", a,b,c);
		// subtraction
		c = a - b;
		System.out.printf("%d - %d = %d\n", a,b,c);
		// multiplication
		c = a * b;
		System.out.printf("%d * %d = %d\n", a,b,c);
		// division
		c = a / b;
		System.out.printf("%d / %d = %d\n", a,b,c);
		// modulus
		c = a % b;
		System.out.printf("%d %% %d = %d\n", a,b,c);
		
		a = 5;
		// unary minus
		c = -a;
		System.out.printf("-%d  = %d\n", a,c);
		// unary plus
		c = +a;
		System.out.printf("+%d  = %d\n", a,c);
		//prefix increment
		a = 5;
		System.out.printf("++%d  = %d\n", a,++a);
		//postfix increment
		a = 5;
		System.out.printf("%d++  = %d\n", a,a++);
		//prefix decriment
		a = 5;
		System.out.printf("--%d  = %d\n", a,--a);
		//postfix decriment
		a = 5;
		System.out.printf("%d--  = %d\n", a,a--);
		
		System.out.println("\n***** Bitwise Operators *****");
		
		c = a & b; // bitwise AND
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = a | b; // bitwise OR
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = a ^ b; // bitwise XOR
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = ~a; // bitwise unary compliment
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		c = a << 1; // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		a = -5;
		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		a = 5;
		c = a >>> 1; // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		a = -5;
		c = a >>> 1; // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		System.out.println("\n***** Assignment Operators *****");
		
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		
		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception
		
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
		
		System.out.println("\n***** Relational Operators *****");
		
		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);
		
		System.out.println("\n***** Logical Operations *****");
		
		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
				(a > b) && (a > 0));
		
		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
				(a > b) & (a > 0));
		
		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
				(a >= b) || (b != 0));
		
		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
				(a >= b) | (b != 0));
		
		// logical XOR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
				(a >= b) ^ (b != 0));
		
		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		System.out.println("\n***** Misc Operators *****");
		System.out.println("\nCondition Operator:");
		
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
		
		System.out.println("\nType Cast Operator:");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		c = bt;
		System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
		c = sh;
		System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
		c = ch;
		System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
		c = (int) l;
		System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
		c = (int) f;
		System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
		c = (int) d;
		System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
		// c = (int)bool;
		System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
		
	}
	public static void testLong() {
		long a=45463384738L, b=45646334733L, c;
		
		System.out.println("\n***** testLong *****");
		System.out.println("\n***** Arithmetical Operators *****");
		
		// addition
		c = a + b;
		System.out.printf("%d + %d = %d\n", a,b,c);
		// subtraction
		c = a - b;
		System.out.printf("%d - %d = %d\n", a,b,c);
		// multiplication
		c = a * b;
		System.out.printf("%d * %d = %d\n", a,b,c);
		// division
		c = a / b;
		System.out.printf("%d / %d = %d\n", a,b,c);
		// modulus
		c = a % b;
		System.out.printf("%d %% %d = %d\n", a,b,c);
		
		a = 5;
		// unary minus
		c = -a;
		System.out.printf("-%d  = %d\n", a,c);
		// unary plus
		c = +a;
		System.out.printf("+%d  = %d\n", a,c);
		//prefix increment
		a = 5;
		System.out.printf("++%d  = %d\n", a,++a);
		//postfix increment
		a = 5;
		System.out.printf("%d++  = %d\n", a,a++);
		//prefix decriment
		a = 5;
		System.out.printf("--%d  = %d\n", a,--a);
		//postfix decriment
		a = 5;
		System.out.printf("%d--  = %d\n", a,a--);
		
		System.out.println("\n***** Bitwise Operators *****");
		
		c = a & b; // bitwise AND
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		//System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
		//		Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = a | b; // bitwise OR
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		//System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
		//		Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = a ^ b; // bitwise XOR
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		//System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
		//		Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		c = ~a; // bitwise unary compliment
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		//System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
		//		Integer.toBinaryString(c));
		
		c = a << 1; // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		//System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
		//		Integer.toBinaryString(c));
		
		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		//System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
		//		Integer.toBinaryString(c));
		
		a = -5;
		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		//System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
		//		Integer.toBinaryString(c));
		
		a = 5;
		c = a >>> 1; // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		//System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
		//		Integer.toBinaryString(c));
		
		a = -5;
		c = a >>> 1; // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		//System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
		//		Integer.toBinaryString(c));
		
		System.out.println("\n***** Assignment Operators *****");
		
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		
		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception
		
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
		
		System.out.println("\n***** Relational Operators *****");
		
		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);
		
		System.out.println("\n***** Logical Operations *****");
		
		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
				(a > b) && (a > 0));
		
		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
				(a > b) & (a > 0));
		
		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
				(a >= b) || (b != 0));
		
		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
				(a >= b) | (b != 0));
		
		// logical XOR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
				(a >= b) ^ (b != 0));
		
		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		System.out.println("\n***** Misc Operators *****");
		System.out.println("\nCondition Operator:");
		
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
		
		System.out.println("\nType Cast Operator:");
		byte bt = 1;
		short sh = -32000;
		int i = -3203400;
		char ch = '\u0002';
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		c = bt;
		System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
		c = sh;
		System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
		c = i;
		System.out.printf("long = int: c = %d --> c = %d\n", i, c);
		c = ch;
		System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
		c = (long) f;
		System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
		c = (long) d;
		System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
		// c = (long) bool;
		System.out.printf("long = boolean: c = (long)%b --> Compile Error\n", bool);
	}
	public static void testDouble() {
		double a=5.0, b=2.0, c;
		
		System.out.println("\n***** testDouble *****");
		System.out.println("\n***** Arithmetical Operators *****");
		
		// addition
		c = a + b;
		System.out.printf("%f + %f = %f\n", a,b,c);
		// subtraction
		c = a - b;
		System.out.printf("%f - %f = %f\n", a,b,c);
		// multiplication
		c = a * b;
		System.out.printf("%f * %f = %f\n", a,b,c);
		// division
		c = a / b;
		System.out.printf("%f / %f = %f\n", a,b,c);
		// modulus
		c = a % b;
		System.out.printf("%f %% %f = %f\n", a,b,c);
				
		a = 5.0;
		// unary minus
		c = -a;
		System.out.printf("-%f  = %f\n", a,c);
		// unary plus
		c = +a;
		System.out.printf("+%f  = %f\n", a,c);
		//prefix increment
		a = 5.0;
		System.out.printf("++%f  = %f\n", a,++a);
		//postfix increment
		a = 5.0;
		System.out.printf("%f++  = %f\n", a,a++);
		//prefix decriment
		a = 5.0;
		System.out.printf("--%f  = %f\n", a,--a);
		//postfix decriment
		a = 5.0;
		System.out.printf("%f--  = %f\n", a,a--);
				
		//System.out.println("\n***** Bitwise Operators *****");
		
		// поразрядные операции выполняются только над целочисленными типами
		//c = a & b; // bitwise AND			
		//c = a | b; // bitwise OR	
		//c = a ^ b; // bitwise XOR
		//c = ~a; // bitwise unary compliment
		//c = a << 1; // left shift
		//c = a >> 1; // right shift
		//c = a >> 1; // right shift
		//c = a >>> 1; // zero fill right shift
		//c = a >>> 1; // zero fill right shift

		System.out.println("\n***** Assignment Operators *****");
				
		System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
		System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
		System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
		System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
		System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
		
		System.out.printf("%f %%= 0 --> c = %f\n", c, c %= 0);		// There is no Exception !!!
		System.out.printf("%f /= 0 --> c = %f\n", c, c /= 0);		// There is no Exception !!!
				
		//System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		//System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		//System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		//System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		//System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		//System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
				
		System.out.println("\n***** Relational Operators *****");
				
		// greater than
		System.out.printf("%f > %f --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%f < %f --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%f == %f --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%f != %f --> %b\n", a, b, a != b);
				
		System.out.println("\n***** Logical Operations *****");
				
		// logical AND
		System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
				(a > b) && (a > 0));
				
		// bitwise logical AND
		System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
				(a > b) & (a > 0));
				
		// logical OR
		System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
				(a >= b) || (b != 0));
				
		// bitwise logical OR
		System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
				(a >= b) | (b != 0));
				
		// logical XOR
		System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
				(a >= b) ^ (b != 0));
				
		// logical NOT
		System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
				
		System.out.println("\n***** Misc Operators *****");
		System.out.println("Condition Operator:");
				
		System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));
				
		System.out.println("\nType Cast Operator:");
		
		byte bt = 1;
		short sh = -32000;
		int i = 123456789;
		char ch = '\u0002';
		long l = 100000000000000000L;
		float f = 1.9f;
		boolean bool = true;
		c = bt;
		System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);
		c = sh;
		System.out.printf("double = short: c = %d --> c = %f\n", sh, c);
		c = i;
		System.out.printf("double = int: c = %d --> c = %f\n", i, c);
		c = ch;
		System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);
		c = l;
		System.out.printf("double = long: c =  %d --> c = %f\n", l, c);
		c = f;
		System.out.printf("double = float: c = %f --> c = %f\n", f, c);
		// c = (double)bool;
		System.out.printf("double = boolean: c = (double)%b --> Compile Error\n", bool);
			
	}
	public static void testBoolean() {
		boolean a = true, b = false, c;
		
		System.out.println("\n*****        testBoolean        *****");
		System.out.println("\n***** Arithmetical Operators *****");
		
		// c = a + b; // addition
		// c = a - b; // subtraction
		// c = a * b; // multiplication
		// c = a / b; // division
		// c = a % b; // modulus
		// c = -a; // unary minus
		// c = +a; // unary plus
		// c = ++a; // prefix increment
		// c = a++; // postfix increment
		// c = --a; // prefix decrement
		// c = a--; // postfix decrement
		
		System.out.println("\n***** Bitwise Operators *****");
		
		c = a & b; // bitwise AND
		System.out.printf("%b & %b = %b\n", a, b, c);
		c = a | b; // bitwise OR
		System.out.printf("%b | %b = %b\n", a, b, c);
		c = a ^ b; // bitwise XOR
		System.out.printf("%b ^ %b = %b\n", a, b, c);
		
		// c = ~a; // bitwise unary compliment
		// c = a << 1; // left shift
		// c = a >> 1; //right shift
		// c = a >>> 1; // zero fill right shift
		
		System.out.println("\n***** Assignment Operators *****");
		
		System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
		System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
		System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
		
		// c += a;
		// c -= a;
		// c *= a;
		// c /= a;
		// c %= a;
		// c >>= 1;
		// c <<= 1;
		// c >>>= 1;
		
		System.out.println("\n***** Relational Operators *****");
		// equal to
		System.out.printf("%b == %b --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%b != %b --> %b\n", a, b, a != b);
		// c = a > b; // greater than
		// c = a >= b; // greater than or equal to
		// c = a < b; // less than
		// c = a <= b; // less than or equal to
		
		System.out.println("\n***** Logical Operations *****");
		
		c = a && b; // logical AND
		System.out.printf("%b && %b = %b\n", a, b, c);
		c = a || b; // logical OR
		System.out.printf("%b || %b = %b\n", a, b, c);
		c = a ^ b; // logical XOR
		System.out.printf("%b ^ %b = %b\n", a, b, c);
		// logical NOT
		System.out.printf("!%b --> %b\n", a, !a);
		System.out.println("\n***** Misc Operators *****");
		System.out.println("\nCondition Operator:");
		System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
		
		System.out.println("\nType Cast Operator:");
		// byte bt = 1;
		// short sh = -32000;
		// char ch = '\u0002';
		// long l = 100000000000000000L;
		// float f = 1.9f;
		// double d = 123456789.625;
		
		boolean bool = true;
		 
		//c = (boolean) bt;
		//c = (boolean) sh;
		//c = (boolean) ch;
		//c = (boolean) l;
		//c = (boolean) f;
		//c = (boolean) d;
		c = bool;
	}	
	
	// Дополнительное задание
	public static void testReference() {
		String s1 = "Hellow ", s2 = "Java!", s3;
		
		// Создаем 2 объекта Student и присваиваем ссылки на них 
		// соответствующим переменным
		Student student1 = new Student("Student", 1);
		Student student2 = new Student("Student", 2);
		
		// Создаем ссылочную переменную на объект типа Student
		Student student3;
		
		System.out.println("\n*****        testReference        *****");
		System.out.println("\n***** Arithmetical Operators *****");
		
		// addition
		// операция сложения перегружена для возможности сложения текстовых строк
		// остальные арифметические операции над строками недопустимы
		s3 = s1 + s2;
		System.out.println(s3);
		// subtraction
		//s3 = s1 - s2;
		// multiplication
		//s3 = s1 * s2;
		// division
		//s3 = s1 / s2;
		// modulus
		//s3 = s1 % s2;
		// unary minus
		//s3 = -s1;
		// unary plus
		//s3 = +s1;
		//prefix increment
		//s3 = ++s1;
		//postfix increment
		//s3 = s1++;
		//prefix decriment
		//s3 = --s1;
		//postfix decriment
		//s3 = s1--;
		
		// Все матиматические операции с сылочными переменными в Java
		// в отличае от операцией с указателями в других языках программирования
		// недопустимы
		
		//student3 = student1++;
		System.out.println("\n***** Bitwise Operators *****");
		// операции недопустимы
		
		System.out.println("\n***** Assignment Operators *****");
		
		System.out.println(s3 += s2); 			// единственная разрешенная операция
		
		System.out.println("\n***** Relational Operators *****");
		
		// данная операция показывает ссылаются ли ссылочные переменные
		// на один и тот же объект (строку) в куче
		System.out.println(s1 == s2);
		System.out.println(s1 != s2);
		
		student3 = student2;
		System.out.println(student3 == student2);
		System.out.println(student3 != student2);
		
		// проверить эквивалентность строк текста (равенство) можно при помощи
		// метода equals()
		s1 = "Hellow Java!";
		s2 = "Hellow Java!";
		System.out.println(s1.equals(s2));
		
		// для объектов метод equals() работает не так, как для строк
		// две ссылочные переменные будут эквивалентны, только если они
		// ссылаются на один и тот же объект
		student3 = new Student("Student", 1);
		System.out.println(student3 == student1);
		System.out.println(student3.equals(student1));
		
		student3 = student1;
		System.out.println(student3 == student1);
		System.out.println(student3.equals(student1));
		
		System.out.println("\n***** instanceof Operator *****");
		
		// проверяет является ли объект Student1 потомком класса Object
		System.out.println(student1 instanceof Object);
	}
}
