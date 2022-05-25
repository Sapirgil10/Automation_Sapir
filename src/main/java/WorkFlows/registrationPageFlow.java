package WorkFlows;
import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class registrationPageFlow extends commonOps {

    @Step("Create new account")
    public static void createAccount(String email) {
        uiActions.click(preLoginScreen.elem_newEmail);
        uiActions.sendKeys(preLoginScreen.elem_newEmail, email);
        uiActions.click(preLoginScreen.btn_createAnAccount);
    }
}
