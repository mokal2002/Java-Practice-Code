interface Member {  void callBack(); }

class store {
    Member members[]=new Member[10];
    int count=0;
    void register(Member m) { members[count++]=m;}
    void inviteSale() { for (int i = 0; i < count; i++) { members[i].callBack(); }}
}


class Customer implements Member {
    String name;
    Customer(String n) {name=n;}
    public void callBack() {System.out.println("OK I Will Visit"+name);}
}

public class callback145 {
    public static void main(String[] args) {
        store st=new store();
        Customer c0=new Customer(" John");
        Customer c1=new Customer(" John");
        Customer c2=new Customer(" John");
        Customer c3=new Customer(" John");

        st.register(c0);
        st.register(c1);
        st.register(c2);
        st.register(c3);

        st.inviteSale();
    }
}