package extends2.ex;

public class Phone {
    private String name;
    private String tel;

    public void set(String name, String tel) {
        this.name = name;
        this.tel = tel;
        //System.out.println(name + tel);
    }
    public String getName(){
        return name;
    }
    public String getTel(){
        return tel;
    }
}
