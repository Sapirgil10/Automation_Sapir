package WorkFlows.AutomationSite;

import Extensions.uiActions;
import Utilities.commonOps;

public class addToCartFlow extends commonOps {

    public static void addToList() {

        uiActions.click(cartAddingScreen.btn_AddToCart);
    }

    public static void addToList2() {

        uiActions.click(cartAddingScreen.btn_BlueAddToCart);
        uiActions.click(cartAddingScreen.btn_ProceedToCheckout);
    }
}
