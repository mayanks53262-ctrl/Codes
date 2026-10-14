class Solution {
    public boolean checkIfPangram(String sentence) {
        String a="";
        for(int i=0;i<sentence.length();i++){
            if(!a.contains(String.valueOf(sentence.charAt(i)))){
                a+=sentence.charAt(i);
            }
        }
        if(a.length()==26){
            return true;
        }
        else{
            return false;
        }

    }
}