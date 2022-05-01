package _0057_FileNaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class FileNaming {

	 public static  String[] solution(String[] names) {
		 
		    List<String> filesWithoutRepeatName = new ArrayList<>();
		    for( String name : names ){
		        if(filesWithoutRepeatName.contains(name)){
		            int order = 1;
		            for(; filesWithoutRepeatName.contains(name+"("+order+")") ;order++){

		            }
		            name+="("+order+")";
		        }
		        filesWithoutRepeatName.add(name);
		    }
		    String[] resultArray = new String[filesWithoutRepeatName.size()];
		    return filesWithoutRepeatName.toArray(resultArray);
			
	}
	
}
