public class Element {
    private Element prev;
    private Element next;
    private int key;

    public Element(int _key){
        key = _key;
    }
    public int getKey(){
        return key;
    }
    /*
    public void insert(Element _next) {
        if(next == null) next = _next;
        next.insert(_next);
    }
    */

    public void setprev(Element _prev){
        prev = _prev;
    }

    public void setnext(Element _next){
        next = _next;
    }
    public Element getprev(){
        return prev;
    }

    public Element getnext(){
        return next;
    }

}
