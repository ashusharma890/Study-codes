//using Hashmap

class Solution {
    public String destCity(List<List<String>> paths) {
       Map<String,String> hmap = new HashMap<>();
	int i=0;
   while(i<paths.size()){
	   List<String> currentList = paths.get(i);
	   hmap.put(currentList.get(0),currentList.get(1));
	   i++;
   }
	String destination = paths.get(0).get(1);       
	while(hmap.containsKey(destination)){
		destination = hmap.get(destination);
	}
	return destination;
    }
}

//using hashset

class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> srcCities = new HashSet<>();
        for(List<String> path: paths) {
            srcCities.add(path.get(0));
        }
        
        
        for(List<String> path: paths) {
            // check if every dest city has src city
            if(!srcCities.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return "";
    }
}

//brute-force approach

class Solution {
    public String destCity(List<List<String>> paths) {
               String startes="";
        for(int i=0;i<paths.size();i++)
            startes+=paths.get(i).get(0);
        for(int i=0;i<paths.size();i++)
            if(!startes.contains(paths.get(i).get(1)))
                return paths.get(i).get(1);
        return null;
        
    }
}

