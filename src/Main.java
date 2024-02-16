
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

 Parent parent = new Parent("Beknazar","Joldoshbekov");
        System.out.println(parent);

        Boy boy = new Boy("SultanAli","Kaldarbek",20,"yellow");

        System.out.println(boy);

        Girl girl = new Girl("Bektur","Temirbekov",20,"white","rabochka",2);
        System.out.println(girl);
    }
}