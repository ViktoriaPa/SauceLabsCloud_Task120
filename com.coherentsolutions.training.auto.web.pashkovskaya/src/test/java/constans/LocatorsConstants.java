package constans;

import org.openqa.selenium.By;

public class LocatorsConstants {
    public static final By USERNAME_ON_HOME_PAGE = By.xpath("//span[@class=\"user-account__name\"]");
    public static final By LOGIN_BUTTON_ON_MAIN_PAGE = By.xpath("//a[@href='https://passport.yandex.com/auth?retpath=https%3A%2F%2Fmail.yandex.com']");
    public static final By USERNAME_FIELD = By.id("passp-field-login");
    public static final By LOGIN_BUTTON_ON_USERNAME_PAGE = By.id("passp:sign-in");
    public static final By PASSWORD_FIELD = By.id("passp-field-passwd");
    public static final By LOGIN_BUTTON_ON_PASSWORD_PAGE = By.id("passp:sign-in");
    public static final By USER_ICON = By.xpath("//div[@class=\"user-pic user-pic_has-plus_ user-account__pic\"] /img[contains(@src, 'https://avatars')]");
    public static final By LOG_OUT_BUTTON = By.xpath("//a[@aria-label=\"Log out\"] /span[@class=\"menu__text\"]");
}