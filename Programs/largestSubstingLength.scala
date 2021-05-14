import scala.util.control.Breaks._
object Solution {
    def largestSubstingLength(s: String): Int = {
var i = 0
var  cnt = 1
 while(i < s.length() )
 {
   var s1: StringBuilder = new StringBuilder()
   s1.append(s(i))
   breakable
   {
   for(j <- i+1 to s.length() -1 )
   {    
     if(!s1.contains(s(j)))
     {
        s1.append(s(j))
        cnt = Math.max(s1.length,cnt)  
     }
     else
     {
      
      cnt = Math.max(s1.length,cnt)
      break
     }       
   }
   }
  i += 1
   }
if(s =="")
    0
else
 cnt 
    
    }
    
}
  