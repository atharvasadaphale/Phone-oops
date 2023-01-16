public class Main {
    public static void main(String[] args) {
        PhoneC p1= new PhoneC("413");
        PhoneC p2 = new PhoneC("321");

        p1.callNumber("321");
        p2.receiveCall("321");
        System.out.println(p2.answerCall());
    }
}