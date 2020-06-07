package MinBinHeap_A3;

public class MinBinHeap_Playground {
  public static void main(String[] args){   
    //Add more tests as methods and call them here!!
    TestBuild();
  }
  
  public static void TestBuild(){ 
    // constructs a new minbinheap, constructs an array of EntryPair, 
    // passes it into build function. Then print collection and heap.
    MinBinHeap mbh= new MinBinHeap();
    MinBinHeap mbh2= new MinBinHeap();
    EntryPair[] collection= new EntryPair[8];
    collection[0]=new EntryPair("i",3);
    collection[1]=new EntryPair("b",5);
    collection[2]=new EntryPair("c",1);
    collection[3]=new EntryPair("d",0);
    collection[4]=new EntryPair("e",46);
    collection[5]=new EntryPair("f",5);
    collection[6]=new EntryPair("g",6);
    collection[7]=new EntryPair("h",17);
    mbh.insert(new EntryPair("a",1) );
    mbh.insert(new EntryPair("b",2) );
    mbh.insert(new EntryPair("c",3) );
    mbh.insert(new EntryPair("d",4) );
    mbh.insert(new EntryPair("e",5) );
    mbh.insert(new EntryPair("f",6) );
    mbh.insert(new EntryPair("g",7) );
    mbh.insert(new EntryPair("h",8) );
    mbh.insert(new EntryPair("i",9) );
    mbh.insert(new EntryPair("j",10) );
    mbh.insert(new EntryPair("k",11) );
  
    mbh2.build(collection);
    printHeapCollection(collection);
    printHeap(mbh2.getHeap(), mbh2.size());
    System.out.print(mbh2.size() + "\n");
    
    mbh2.delMin();
    printHeap(mbh2.getHeap(), mbh2.size());
    System.out.print(mbh2.size() + "\n");
    
    printHeap(mbh.getHeap(), mbh.size());
    System.out.print(mbh.size() + "\n");
    
    mbh.delMin();
    
    printHeap(mbh.getHeap(), mbh.size());
    System.out.print(mbh.size() + "\n");
    
    mbh.delMin();
    
    printHeap(mbh.getHeap(), mbh.size());
    System.out.print(mbh.size() + "\n");
    
    mbh.delMin();
    
    printHeap(mbh.getHeap(), mbh.size());
    System.out.print(mbh.size() + "\n");
    
    
  }
  
  public static void printHeapCollection(EntryPair[] e) { 
    //this will print the entirety of an array of entry pairs you will pass 
    //to your build function.
    System.out.println("Printing Collection to pass in to build function:");
    for(int i=0;i < e.length;i++){
      System.out.print("("+e[i].value+","+e[i].priority+")\t");
    }
    System.out.print("\n");
  }
  
  public static void printHeap(EntryPair[] e,int len) { 
    //pass in mbh.getHeap(),mbh.size()... this method skips over unused 0th index....
    System.out.println("Printing Heap");
    for(int i=1;i < len+1;i++){
      System.out.print("("+e[i].value+","+e[i].priority+")\t");
    }
    System.out.print("\n");
  }
}
