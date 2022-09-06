public class LinkedList {
    Element head;

    public LinkedList(){
    }

    public Element search(int key){
        Element x = head;
        while(x != null && x.getKey() !=key){
            x = x.getnext();
        }
        return x;
    }

    public void delete(Element a){
        if (a.getprev() != null){
            a.getprev().setnext(a.getnext()); //moves the next one down
        }
        else{
            head = a.getnext();
        }
        if(a.getnext()!=null){
            a.getnext().setprev(a.getprev());
        }
    }

    public void insert(Element a){
        a.setnext(head);
        if(head !=null){
            head.setprev(a);
        }
        head = a;
        a.setprev(null);

    }
}
