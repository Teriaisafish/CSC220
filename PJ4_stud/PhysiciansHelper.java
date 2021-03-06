import java.util.*;
import java.io.*;

public class PhysiciansHelper
{
	// symptom to illnesses map 
	private Map<String, List<String>> symptomChecker;


	/* Constructor symptomChecker map using TreeMap */
	public PhysiciansHelper()
	{ 
		// use TreeMap, i.e. sorted order keys
		symptomChecker = new TreeMap<String,List<String>>();
	} // end default constructor


	/* Reads a text file of illnesses and their symptoms.
	   Each line in the file has the form
		Illness: Symptom, Symptom, Symptom, ...  
	   Store data into symptomChecker map */

	public void processDatafile() {
		// Step 1: read in a data filename from keybaord
		//         create a scanner for the file


		/*int lineNumber = 1;
		while (data.hasNext()) {
			String line = data.nextLine();
			line = line.toLowerCase();
			Scanner lineProcessor = new Scanner(line);
			lineProcessor.useDelimiter("\\W+");
			while (lineProcessor.hasNext()) {
				String nextWord = lineProcessor.next();
				ListWithInteratorInterface<Integer> lineList = wordTable.getValue(nextWord);
				if (lineList == null) {
					lineList = new LinkedListWithInterator<>();
					wordTable.add(nextWord, lineList);
				}
				lineList.add(lineNumber);
			}
			lineNumber++;
		}
		data.close();
        */
		// Step 2: process data lines in file scanner
		// 2.1 for each line, split the line into a disease and symptoms
		//     make sure to trim() spaces and use toLowercase()
		// 2.2 for symptoms, split into individual symptom
		//     create a scanner for symptoms 
		//     useDelimeter(",") to split into individual symptoms 
		//     make sure to trim() spaces and use toLowercase()
		//     for each symptom  
		//        if it is already in the map, insert disease into related list
		//        if it is not already in the map, create a new list with the disease
		// Step 3: display symptomChecker map
        Iterator<String> symptomChecker = TreeMap.getKeyIterator();
        Iterator<ListWithIteratorInterface<Integer>> valueIterator = TreeMap.getValueIeterator();
        while(keyIterator.hasnext()){
        	System.out.print(keyIterator.next() + " ");
        	ListWithIteratorInterface<Integer> lineList = valueIterator.next();
        	while(listIterator.hasNext()){
        		System.out.print(listIterator.next() + " ");
			}
        	System.out.println();
		}
		// implement here.....

	} // end processDatafile


	/*  Read patient's symptoms in a line and adds them to the list.
		Input format: Symptom, Symptom, Symptom,...
	    Shows diseases that match a given number of the symptoms. */

	public void processSymptoms()
	{
		// Step 1: get all possible symptoms from symptomChecker map
		//         and display them
		// Step 2: process patient symptoms, add to patientSymptoms list 
		//         read patient's symptoms in a line, separated by ','
		//         create a scanner for symptoms 
		//         UseDelimeter(",") to split into individual symptoms 
		//         make sure to trim() spaces and use toLowercase()
		//         add valid symptoms to patientSymptoms list
		//         display invalid/duplicate symptoms
		// Step 3: display patientSymptoms list
   	        // Step 4: process illnesses to frequency count
		//         create a map of disease name and frequency count
		//         for each symptom in patientSymptoms list
		//              get list of illnesses from symptomChecker map
		//              for each illness in the list
		// 	            if it is already in the map, increase counter by 1
	        //	            if it is not already in the map, create a new counter 1
		//         ** need to keep track of maximum counter numbers
		// Step 5: display result
		//         for count i = maximum counter number downto 1
		//             display illness that has count i
		 

		// implement here.....

	} // end processSymptoms 



	public static void main(String[] args)
	{

		PhysiciansHelper lookup = new PhysiciansHelper();
		lookup.processDatafile();
		lookup.processSymptoms();
	} // end main
} // end PhysiciansHelper
