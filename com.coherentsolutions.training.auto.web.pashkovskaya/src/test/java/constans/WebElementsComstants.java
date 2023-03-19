package constans;

import org.openqa.selenium.By;

public class WebElementsComstants {
    public static final String USERNAME_ON_HOME_PAGE = "//span[@class=\"user-account__name\"]";
    public static final String LOGIN_BUTTON_ON_MAIN_PAGE = "//a[@href='https://passport.yandex.com/auth?retpath=https%3A%2F%2Fmail.yandex.com']";
    public static final String USERNAME_FIELD = "passp-field-login";
    public static final String LOGIN_BUTTON_ON_USERNAME_PAGE = "passp:sign-in";
    public static final String PASSWORD_FIELD = "passp-field-passwd";
    public static final String LOGIN_BUTTON_ON_PASSWORD_PAGE = "passp:sign-in";
    public static final String USER_ICON = "//div[@class=\"user-pic user-pic_has-plus_ user-account__pic\"] /img[contains(@src, 'https://avatars')]";
    public static final String LOG_OUT_BUTTON = "//a[@aria-label=\"Log out\"] /span[@class=\"menu__text\"]";
}
