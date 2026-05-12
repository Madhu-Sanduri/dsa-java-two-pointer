package samedirection;

import java.util.*;

public class PartitionLabels {

    public static List<Integer> solution(String s){

        List<int []> firstLastOccurance = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            int first=s.indexOf(s.charAt(i));
            int last=s.lastIndexOf(s.charAt(i));
            firstLastOccurance.add(new int[]{first,last});
        }
        firstLastOccurance.sort(Comparator.comparingInt(a -> a[0]));

        List<Integer> list =new ArrayList<>();
        int min=firstLastOccurance.get(0)[0],max=firstLastOccurance.get(0)[1];

        for(int i=1;i<firstLastOccurance.size();i++){

            if(max>=firstLastOccurance.get(i)[0]){
                min=Math.min(min,firstLastOccurance.get(i)[0]);
                max=Math.max(max,firstLastOccurance.get(i)[1]);
            }
            else{
                list.add(max-min+1);
                min=firstLastOccurance.get(i)[0];
                max=firstLastOccurance.get(i)[1];
            }
        }
        list.add(max-min+1);

        return list;
    }


    public static void main(String[] args) {
        System.out.println(solution("ababcbacadefegdehijhklij"));
        System.out.println(solution("eccbbbbdec"));
        System.out.println(solution("ababcc"));
    }

}
