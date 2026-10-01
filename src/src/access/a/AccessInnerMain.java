package access.a;

public class AccessInnerMain {
    static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField =1;
        data.publicMethod();

        data.defaultField = 2;
        data.defaultMethod();

//        data.privateField =3;
//        data.privateMethod();

        data.innerAccess();
    }
}
