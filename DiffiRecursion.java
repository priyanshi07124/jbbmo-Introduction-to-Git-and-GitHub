public class DiffiRecursion {
    public static int first =-1;
    public static int last =-1;
    public static boolean [] map = new boolean[26];
    

//     public static void towerOfHanoi(int n, String src,String Helper,String Dest)
//     {// base case
//   if(n==1)
//   {
//     System.out.println("transfer disk "+ n+" "+ "from"+" "+src +" "+"to"+" "+Dest);
//     return;
//   }

//   towerOfHanoi(n-1, src, Dest, Helper);
//   System.err.println("transfer disk "+ n+" "+ "from"+" "+src +" "+"to"+" "+Dest);
//   towerOfHanoi(n-1, Helper, src, Dest);


//     }

//     public static  void RevStr(String str,int inx)
//     {//time complexity = O(n)
//         if(inx==0)
//         {
//             System.out.println(str.charAt(inx));
//             return;
//         }
//         System.out.println(str.charAt(inx));
//         RevStr(str, inx-1);
//     }

    public static void FindOcurr(String str, int idx, char element)
    {  if(idx==str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }

      char Currchar = str.charAt(idx);
      if(Currchar == element)
      {
        if(first ==-1)
        {
            first = idx;
        }
        else{
            last= idx;
        }
      }
      FindOcurr(str, idx+1, element);


    }

    // public static boolean SortedArray(int arr[],int idx)
    // {  //we are chcking aray is sorted or not
    //     //time complexity = O(n)
    //     if(idx==arr.length-1)
    //     {
    //         return true;
    //     }
    //     if(arr[idx] <arr[idx+1])
    //    return SortedArray(arr, idx+1);
    //     else
    //    return  false;
       
    // }

//     public static void MovetoEnd(String str, int idx, char element,int count, String newstr)
//     {//Time complexity = O(n)
//         if(idx==str.length()){
//             for(int i=0;i<count;i++)
//             {
//                 newstr+= element;
//             }
//             System.out.println(newstr);
//             return;
//         }
// char Currchar = str.charAt(idx);
// if(Currchar==element)
// {
//     count++;
// MovetoEnd(str, idx+1, element, count, newstr);

// }
// else{
//     newstr += Currchar;
//     MovetoEnd(str, idx+1, element, count, newstr);
// }

//     }

public static void RemoveDup(String str, int idx,  String newstr)
{//Time complexity = O(n)
    if(idx==str.length()){
       System.out.println(newstr);
        return;
    }
char Currchar = str.charAt(idx);
if(map[Currchar -'a'])
RemoveDup(str, idx+1, newstr);
else
{
    newstr +=Currchar;
    map[Currchar -'a']= true;
    RemoveDup(str, idx+1, newstr);
}


}
    public static void main(String[] args) {
        // int n=3;
        // towerOfHanoi(n, "S", "H", "D");

        // String str ="abcd";
        // RevStr(str, str.length()-1);

        // String  str = "habiaathcafaio";
        // FindOcurr(str, 0, 'a');

        // int arr[]= {1,5,10};
        // System.out.println(SortedArray(arr, 0));

        String str ="abcadd";
        RemoveDup(str, 0, "");
        
    }
    
}
