public class Main {
    public static void main(String[] args){
        Element fe = new Element(3);

        if(testConstructor()) pass++;
        else fail++;

        if(testSetter()) pass++;
        else fail++;

        if(testSearch()) pass++;
        else fail++;
        if(testSearchne()) pass++;
        else fail++;
        if(testSearchtw()) pass++;
        else fail++;
        if(testDelete1()) pass++;
        else fail++;
        if(testDelete2()) pass++;
        else fail++;
        //LinkedList fl = new LinkedList();
        //fl.search(3);

        System.out.print("passes: " + pass + " fails: " + fail);
    }

    static int pass = 0;
    static int fail = 0;

    public static boolean testDelete1(){
        Element fe = new Element(3);
        Element ge = new Element(4);
        LinkedList fl = new LinkedList();
        fl.insert(fe);
        fl.insert(ge);
        fl.delete(fe);
        return fl.search(3)==null;
    }
    public static boolean testDelete2(){
        Element fe = new Element(3);
        Element ge = new Element(4);
        LinkedList fl = new LinkedList();
        fl.insert(fe);
        fl.insert(ge);
        fl.delete(ge);
        return fl.search(3)==fe;
    }

    public static boolean testSearchne(){
        Element fe = new Element(3);
        LinkedList fl = new LinkedList();
        fl.insert(fe);
        return fl.search(3)==fe;
    }

    public static boolean testSearchtw(){
        Element fe = new Element(3);
        Element ge = new Element(4);
        LinkedList fl = new LinkedList();
        fl.insert(fe);
        fl.insert(ge);
        return fl.search(3)==fe;
    }

    public static boolean testSearch(){
        LinkedList fl = new LinkedList();
        //fl.search(3);
        return fl.search(3)==null;
    }

    public static boolean testConstructor(){
        Element fe = new Element(3);
        return fe.getKey() == 3;
    }
//also tests getter
    public static boolean testSetter(){
        Element fe = new Element(3);
        Element ge = new Element(4);
        fe.setnext(ge);
        return fe.getnext().getKey() == 4;
    }


}
