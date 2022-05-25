package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;

public class summeryPaymentPageFlow extends commonOps {

    public static void summeryAndPayment() {
        uiActions.click(endOfPaymentScreen.btn_proceedToCheckout_summery);
        uiActions.click(endOfPaymentScreen.btn_proceedToCheckout_address);
        uiActions.click(endOfPaymentScreen.elem_iAgree);
        uiActions.click(endOfPaymentScreen.btn_proceedToCheckout_shipping);
        uiActions.click(endOfPaymentScreen.btn_payByBankWire);
        uiActions.click(endOfPaymentScreen.btn_confirm);
    }
}
