package com.qa.iteration;

public class Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		change(40.00d, 4.59d);
	}

	private static void change(double money, double price) {

		
		
		int change = (int) (money*100 - price*100);
		if(change >= 2000) {
			int x = change/2000;
			change = change % 2000;
			System.out.println(x + " £20 note(s)");
		}
		if(change >= 1000) {
			int x = change/1000;
			change = change % 1000;
			System.out.println(x + " £10 note(s)");
		}
		if(change >= 500) {
			int x = change/500;
			change = change % 500;
			System.out.println(x + " £5 note(s)");
		}
		if(change >= 200) {
			int x = change/200;
			change = change % 200;
			System.out.println(x + " £2 coins(s)");
		}
		if(change >= 100) {
			int x = change/100;
			change = change % 100;
			System.out.println(x + " £1 coin(s)");
		}
		if(change >= 50) {
			int x = change/50;
			change = change % 50;
			System.out.println(x + " 50p coin(s)");
		}
		if(change >= 20) {
			int x = change/20;
			change = change % 20;
			System.out.println(x + " 20p coin(s)");
		}
		if(change >= 10) {
			int x = change/10;
			change = change % 10;
			System.out.println(x + " 10p coin(s)");
		}
		if(change >= 5) {
			int x = change/5;
			change = change % 5;
			System.out.println(x + " 5p coin(s)");
		}
		if(change >= 2) {
			int x = change/2;
			change = change % 2;
			System.out.println(x + " 2p coin(s)");
		}
		if(change >= 1) {
			int x = change/1;
			change = change % 1;
			System.out.println(x + " 1p coin(s)");
		}

		//boolean ismore = true;
//		while (ismore) {
//			double amount = money - price;
//
//			if (amount > 20) {
//				Double twenty = amount / 20;
//				amount = amount % 20;
//				System.out.println(twenty + " £20 note");
//
//				if (amount > 10) {
//					Double ten = amount / 10;
//					amount = amount % 20;
//					System.out.println(ten + " £10 note");
//
//					if (amount > 5) {
//						Double five = amount / 5;
//						amount = amount % 10;
//						System.out.println(five + " £5 note");
//
//						if (amount > 2) {
//							Double two = amount / 2;
//							amount = amount % 2;
//							System.out.println(two + " £2 coins");
//
//							if (amount > 1) {
//								Double one = amount / 1;
//								amount = amount % 1;
//								System.out.println(one + " £1 coins");
//
//								if (amount > 0.5) {
//									Double pennyamount = amount * 100;
//									Double fiftyp = pennyamount / 50;
//									amount = pennyamount % 50;
//									System.out.println(fiftyp + " 50p coin");
//
//									if (amount > 0.2) {
//										Double pennyamounttwenty = amount * 100;
//										Double twentyp = pennyamounttwenty / 20;
//										amount = pennyamounttwenty % 20;
//										System.out.println(twentyp + " 20p coins");
//
//										if (amount > 0.1) {
//											Double pennyamountten = amount * 100;
//											Double tenp = pennyamountten / 10;
//											amount = pennyamountten % 10;
//											System.out.println(tenp + " 10p coins");
//
//											if (amount > 0.02) {
//												Double pennyamounttwo = amount * 100;
//												Double twop = pennyamounttwo / 2;
//												amount = pennyamounttwo % 2;
//												System.out.println(twop + " 2p coins");
//
//												if (amount > 0.01) {
//													Double pennyamountone = amount * 100;
//													Double onep = pennyamountone / 1;
//													amount = pennyamountone % 1;
//													System.out.println(" 1p coins");
//												} else {
//													ismore = false;
//												}
//											} else {
//												ismore = false;
//											}
//										} else {
//											ismore = false;
//										}
//									} else {
//										ismore = false;
//									}
//								} else {
//									ismore = false;
//								}
//							} else {
//								ismore = false;
//							}
//						} else {
//							ismore = false;
//						}
//					} else {
//						ismore = false;
//					}
//				} else {
//					ismore = false;
//				}
//			} else {
//				ismore = false;
//			}

		//}

	}
}
