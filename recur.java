public class recur {
    public static void moveAllx(String str,int idx,int count,String newString){
        if(idx==str.lenght()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
 }
       char currChar=str.charAt(idx);
       if(currChar=='x'){
        count++;
        moveAllX(str,idx+count,newString);
       }else{
        newString+=currChar;\\newstring=newstring+currChar
        moveAllX(str,idx+1,count,newString);
       }
    }

    public static void main(String args[]) {
        String str="axbcxxd";
        moveAllX(str,0,0," ");
        
    }
}