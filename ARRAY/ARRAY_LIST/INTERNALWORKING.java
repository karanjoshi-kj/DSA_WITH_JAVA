/*INTERNAL WORKING OF ARRAY LIST:

 *1. jab hammm ArrayList<Integer> banate hai , internally wo:
             object[] elementData 
        ye array banata hai.
        
        
  2.  INITIAL CAPACITY AND GROWTH:
        jab hamm ArrayList create karte hai tab uski initail capacity 10 elements ki hoti hai.

        jaise hee hammm list.add(....) karte hai , wo values elementsData[] me dalli jati hai.

  3.  WHAT HAPPENS WHEN IT GETS FULL:

       10 elements add karne ke baad se 11th element add karne par array full ho chuka hoga 

       ********* BUT INTERNALLY******************
       newcapacity = oldcapacity+(oldcapacity / 2);
       mtlb capacity agar 10 thi to ab 15 ho jayegiiii.

   4. RESIZE MECHNISM:

       naya bada array banaya jata hai.

       purane array ke sare elements naye arraay m copy kiye jate hain.

       aur purana array delete hi jata hai (GARBAGE COLLECTED) .

 */