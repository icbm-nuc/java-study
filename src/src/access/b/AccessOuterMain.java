package access.b;

import access.a.AccessData;

public class AccessOuterMain {

    static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField =1;
        data.publicMethod();

//        data.defaultField = 2;
//        data.defaultMethod();

//        data.privateField =3;
//        data.privateMethod();

        data.innerAccess();
    }
}
