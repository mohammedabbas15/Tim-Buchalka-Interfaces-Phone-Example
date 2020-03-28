public class Main
{
    public static void main(String[] args) {
        ITelephone mohammedPhone;
        mohammedPhone = new DeskPhone(123456);
        mohammedPhone.powerOn();
        mohammedPhone.callPhone(123456);
        mohammedPhone.answer();

        mohammedPhone = new MobilePhone(654321);
        //mohammedPhone.powerOn();
        mohammedPhone.callPhone(654321);
        mohammedPhone.answer();


    }
}
