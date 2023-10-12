package ProjectLambda;

public class TestQueueSystem {
    static ShowAndServiceQueueSystem appService = new ShowAndServiceQueueSystem();

    public static void testApp() {
        appService.showAntrianService();
        appService.addAntrianService();
        appService.peekAntrianService();
        appService.removeAntrianCashService();
        appService.clearAntrianService();
        appService.removeAntrianBankService();
        appService.clearAntrianService();
    }
}
