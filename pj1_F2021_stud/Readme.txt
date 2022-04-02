CSC220 Programming Project#1
============================
 
Due Date: 11:55pm, Sunday, 10/10, upload sourcefile Fraction.java to ilearn

- You need to implement Fraction class which is within package PJ1
  See PJ1/Fraction.java and PJ1/FractionInterface.java for specifications

- Run programs 

  // Run 20 test cases in Fraction class
  PJ1.Fraction	

  // Run general test program
  PJ1_Test		

***************************************************************
***************************************************************

Sample Runs
===========

=> java PJ1.Fraction

=========================================

1. Set fraction is 		20/-35
	Expected result :	20/-35

2. Simplify fraction is 	20/-35 -4/7
	Expected result :	20/-35 -4/7

3. Simplify fraction is 	-51/-36 17/12
	Expected result :	-51/-36 17/12

4. Simplify fraction is 	250/-35 -50/7
	Expected result :	250/-35 -50/7


=========================================

5. The sum of 7/8 and 9/16 is 		23/16
	Expected result :		23/16

6. The difference of 9/16 and 7/8 is 	-5/16
	Expected result :		-5/16

7. The product of 15/-2 and 1/4 is 	-15/8
	Expected result :		-15/8

8. The quotient of -21/2 and 3/7 is 	-49/2
	Expected result :		-49/2

9. The sum of -21/2 and -7/-8 is 	-77/8
	Expected result :		-77/8


=========================================

10. The double floating point value of 0/10 is 	0.0
	Expected result 			0.0

11. The double floating point value of 1/-3 is 	-0.3333333333333333
	Expected result 			-0.333333333...

12. The double floating point value of -15/-6 is 	2.5
	Expected result 				2.5

First = -21/2
13. check First equals First: 
Identity of fractions OK

First = -21/2
Second = 42/-4
14. check First equals Second: 
Equality of fractions OK: equal

First = -21/2
Second = -42/-4
15. check First equals Second: 
Equality of fractions OK: not equal

First = -21/2
Second = 42/-4
16. check First compareTo Second: 
Fractions == operator OK

First = -21/2
Second = 7/8
17. check First compareTo Second: 
Fractions < operator OK

First = -21/2
Second = 7/8
18. check Second compareTo First: 
Fractions > operator OK

=========================================

19. check FractionException: 1/0
Exception: PJ1.FractionException: Denominator is 0
Expected result : FractionException!


20. check FractionException: division
Exception: PJ1.FractionException: Divisor is 0
Expected result : FractionException!


***************************************************************
***************************************************************

$ java PJ1_Test
==============================================

Operations:
  0) exit
  1) add        2) subtract     3) multiply     4) divide       5) compareTo
  6) equals     7) simplify     8) toDouble     9) setFraction

Enter an operation number: 9

Tests:

read a fraction x/y, please enter x y : -20 -10
        -20/-10 setFraction = -20/-10
==============================================

Operations:
  0) exit
  1) add        2) subtract     3) multiply     4) divide       5) compareTo
  6) equals     7) simplify     8) toDouble     9) setFraction

Enter an operation number: 3

Try to read a fraction x/y, please enter x y : 5 -10
                Read OK:5/-10

Try to read a fraction x/y, please enter x y : -1 -2
                Read OK:-1/-2

Tests:

        5/-10 * 5/-10 = 1/4
        -1/-2 * -1/-2 = 1/4
        5/-10 * -1/-2 = -1/4
        -1/-2 * 5/-10 = -1/4
==============================================

Operations:
  0) exit
  1) add        2) subtract     3) multiply     4) divide       5) compareTo
  6) equals     7) simplify     8) toDouble     9) setFraction

Enter an operation number: 7

Try to read a fraction x/y, please enter x y : -10 -20
                Read OK:-10/-20

Tests:

        -10/-20 simplify= 1/2
==============================================

Operations:
  0) exit
  1) add        2) subtract     3) multiply     4) divide       5) compareTo
  6) equals     7) simplify     8) toDouble     9) setFraction

Enter an operation number: 1

Try to read a fraction x/y, please enter x y : -5 -10
                Read OK:-5/-10

Try to read a fraction x/y, please enter x y : 7 -3
                Read OK:7/-3

Tests:

        -5/-10 + -5/-10 = 1/1
        7/-3 + 7/-3 = -14/3
        -5/-10 + 7/-3 = -11/6
        7/-3 + -5/-10 = -11/6
==============================================

Operations:
  0) exit
  1) add        2) subtract     3) multiply     4) divide       5) compareTo
  6) equals     7) simplify     8) toDouble     9) setFraction

Enter an operation number: 0

