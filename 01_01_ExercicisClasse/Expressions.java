public class Expressions {
	public static void main(String[] args) {

		int x = 3;
		int y = 2;
		int z = 7;
		boolean b1 = false;
		boolean b2 = true;

		boolean var1 = x > y && z > x && y < z;						
		System.out.println("var1 = " + ( var1 == true));
		// 3 > 2 && 7 > 3 && 2 < 7
		// true  &&  true && false
		
		boolean var2 = x + 4 >= y * 2 + x;						
		System.out.println("var2 = " + ( var2  == true));
		// 3 + 4 >= 2 * 2 + 3
		// true
		
		boolean var3 = x > y && !b1;		
		System.out.println("var3 = " + ( var3 == true ));
		// 3 > 2 && true
		// true && true
		
		boolean var4 = ((y + z / 2) % 2) * 5 == x + y;				
		System.out.println("var4 = " + ( var4 == true ));
		// ((2 + 7 / 2) % 2) * 5 == 3 + 2
		// ((2 + 3) % 2) * 5 == 5
		// (5 % 2) * 5 == 5
		// 1 * 5 == 5
		// 5 == 5
		// true
		 
		boolean var5 = !b1 && ( x > 0 || !( y < 5 ));	
		System.out.println("var5 = " + ( var5 == true ));
		// true && (3 > 0 || false);
		// true && true
		
		boolean var6 = !(b1 && !b2);					
		System.out.println("var6 = " + ( var6 == true ));
		// !(true && false)
		// !(false)
		// true
		
		boolean var7 = b1 && b2 || x > z / 2;		
		System.out.println("var7 = " + ( var7 == false ));
		// false && true || 2 > 7 / 2
		// false && true || 2 > 3
		// false || false
		
		boolean var8 = x + y + z >= 5 && x != 4;				
		System.out.println("var8 = " + ( var8 == true ));
		// 3 + 2 + 7 >= 5 && 3 != 4
		// 13 >= 5 && true
		// true && true
		// true
		
		boolean var9 = x * 2 < y + 3 || b1;				
		System.out.println("var9 = " + ( var9 == false ));
		// 3 * 2 < 2 + 3 || false
		// 6 < 5 || false
		// false || false
		// false
		
		boolean var10 = !(x < y || b1) && b2;			
		System.out.println("var10 = " + ( var10 == true ));
		// !(3 < 2 || false) && true
		// !(false || false) && true
		// !(false) && true
		// true && tue
		// true
		
		boolean var11 = (x > 3 && y <= 2) || (b1 && b2);	
		System.out.println("var11 = " + ( var11 == false ));
		// (3 > 3 && 2 <= 2) || (false && true)
		// (false && true) || false
		// false || false
		
		boolean var12 = (z > x + y + 1 && !(x == 3)) || (y * 2 > x);
		System.out.println("var12 = " + ( var12 == true ));
		// (7 > 3 + 2 + 1 && !(3 == 3)) || (2 * 2 > 3)
		// (7 > 6 && !(true)) || true
		// (true && false) || true
		// false || true
		// true
		
		boolean var13 = b1 & (x > y);				
		System.out.println("var13 = " + ( var13 == false ));
		// false & (3 > 2)
		// false & true
		// false
		
		boolean var14 = b1 | (x > y);					
		System.out.println("var14 = " + ( var14 == true ));
		// false | (3 > 2)
		// false | true
		// true
		
		boolean var15 = !(!b1 ^ b2);					
		System.out.println("var15 = " + ( var15 == true ));
		// !(true ^ true)
		// !false
		// true
		
		boolean var16 = (x > y) ^ b2;				
		System.out.println("var16 = " + ( var16 == false ));
		// (3 > 2) ^ true
		// true ^ true
		// false
		
		boolean var17 = (x + y > z) ^ (y == 2 && !b1);	
		System.out.println("var17 = " + ( var17 == true ));
		// (3 + 2 > 7) ^ (2 == 2 && true)
		// (5 > 7) ^ (true && true)
		// false ^ true
		// true
		
	}

}