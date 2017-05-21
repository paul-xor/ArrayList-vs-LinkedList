/*
 ////
 */
package array.vs.linkedlist;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author pavel
 */
public class ArrayVsLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       final Random random = new Random();
		double opsNumber = 1000_000;
		double opsIns = 1_000;
		
		//BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("This program is aiming to compare ArrayList vs LinkedList for the following operations:");
		String[] operations = {" .add;", " .insert;"," .get;"," .set;"}; 
		
		for (int i = 0; i < operations.length; i++) {
			System.out.println("[" + i +"] " + operations[i]);
		}
		
		Date strTime = new Date();
		ArrayList<Integer> ArrList = new ArrayList<>();				
		
		for (int i = 0; i < opsNumber; i++) {
			ArrList.add(random.nextInt(10) + 1);
		}
		
		Date endTime = new Date();
		long resultedArrTime = endTime.getTime() - strTime.getTime();
		//String ellapse = formatter.format(resultedArrTime);
		
		System.out.println("--------------Add (1000_000 elements)-----------------");
		System.out.println("ArrayList .add time: "+ resultedArrTime);
		
		// ------------
		
		Date strTime2 = new Date();
		LinkedList<Integer> LinkList = new LinkedList<>();				
		
		for (int i = 0; i < opsNumber; i++) {
			LinkList.add(random.nextInt(10) + 1);
		}
		
		Date endTime2 = new Date();
		long resultedLinkArrTime2 = endTime2.getTime() - strTime2.getTime();
		
		System.out.println("LinkedList .add time: "+ resultedLinkArrTime2);
		
		if (resultedArrTime > resultedLinkArrTime2) {
			System.out.println("LinkeList is faster solution!");
		} else {
			System.out.println("ArrayList is faster solution!");
		}
		System.out.println("--------Insert in the top (1_000 elements)--------------");
		
		// Inserts elements at the beggining
		
		strTime = new Date();
		
		for (int i = 0; i < opsIns ; i++) {
			ArrList.add(i, random.nextInt(100)+1);
		}
		
		endTime = new Date();
		resultedArrTime = endTime.getTime() - strTime.getTime();
		
		System.out.println("ArrayList .insert time: "+ resultedArrTime);
		
		strTime2 = new Date();
		for (int i = 0; i < opsIns ; i++) {
			LinkList.add(i, random.nextInt(100)+1);
		}
		endTime2 = new Date();
		resultedLinkArrTime2 = endTime2.getTime() - strTime2.getTime();
		
		System.out.println("LinkedList .insert time: "+ resultedLinkArrTime2);
		
		if (resultedArrTime > resultedLinkArrTime2) {
			System.out.println("LinkeList is faster solution!");
		} else {
			System.out.println("ArrayList  is faster solution!");
		}
		System.out.println("--------Insert in the mid (1_000 elements)--------------");
		
		// Inserts elements at the middle
		
		strTime = new Date();
				
		for (int i = 500_000; i < 500_000 + opsIns ; i++) {
				ArrList.add(i, random.nextInt(100)+1);
		}
				
		endTime = new Date();
		resultedArrTime = endTime.getTime() - strTime.getTime();
				
		System.out.println("ArrayList .insert time: "+ resultedArrTime);
				
		strTime2 = new Date();
		for (int i = 500_000; i < 500_000 + opsIns ; i++) {
				LinkList.add(i, random.nextInt(100)+1);
		}
		endTime2 = new Date();
		resultedLinkArrTime2 = endTime2.getTime() - strTime2.getTime();
				
		System.out.println("LinkedList .insert time: "+ resultedLinkArrTime2);
				
		if (resultedArrTime > resultedLinkArrTime2) {
				System.out.println("LinkeList is faster solution!");
		} else {
			System.out.println("ArrayList  is faster solution!");
		}
		System.out.println("-------------Get (50 elements)------------------");
		// Inserts elements at the beggining
		
		// Inserts elements at the beggining
		
		strTime = new Date();
		
		for (int i = 0; i < 50 ; i++) {
			System.out.print(ArrList.get(i) + " ");
		}
		System.out.println("");
		
		endTime = new Date();
		resultedArrTime = endTime.getTime() - strTime.getTime();
				
		System.out.println("ArrayList .get time: "+ resultedArrTime);
				
		strTime2 = new Date();
		for (int i = 0; i < 50 ; i++) {
				System.out.print(LinkList.get(i) + " ");
		}
		System.out.println("");
		
		endTime2 = new Date();
		resultedLinkArrTime2 = endTime2.getTime() - strTime2.getTime();
				
		System.out.println("LinkedList .insert time: "+ resultedLinkArrTime2);
				
		if (resultedArrTime > resultedLinkArrTime2) {
		System.out.println("LinkeList is faster solution!");
		} else {
				System.out.println("ArrayList  is faster solution!");
		}
		
		System.out.println("--------------Set (30_000 elements)----------------");
		
		// Sets new elements to list
		
		strTime = new Date();
						
		for (int i = 0; i < 30_000 + opsIns ; i++) {
			ArrList.set(i, random.nextInt(500)+100);
		}
		
		endTime = new Date();
		resultedArrTime = endTime.getTime() - strTime.getTime();
						
		System.out.println("ArrayList .set time: "+ resultedArrTime);
						
		strTime2 = new Date();
		for (int i = 0; i < 30_000 + opsIns ; i++) {
				LinkList.set(i, random.nextInt(500)+100);
		}
		endTime2 = new Date();
		resultedLinkArrTime2 = endTime2.getTime() - strTime2.getTime();
						
		System.out.println("LinkedList .set time: "+ resultedLinkArrTime2);
						
		if (resultedArrTime > resultedLinkArrTime2) {
				System.out.println("LinkeList is faster solution!");
		} else {
				System.out.println("ArrayList  is faster solution!");
		}
		
		System.out.println("---------------End---------------");
		ArrList.clear();
		LinkList.clear(); 
    }
    
}
