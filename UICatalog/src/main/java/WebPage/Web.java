package WebPage;

import common.Base;

public class Web extends Base {
    public void checkWebPageWhole(){
        clickByXpath("//XCUIElementTypeOther[@name=\"main\"]");
    }
    public void checkMenuBar(){ clickByXpath("//XCUIElementTypeOther[@name=\"Global, navigation\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]"); }
    public void checkAppleLogo(){ clickByXpath("//XCUIElementTypeOther[@name=\"Global, navigation\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]"); }
    public void checkShoppingBag(){ clickByXpath("/XCUIElementTypeButton[@name=\"Shopping Bag\"]"); }
    public void checkLimitedTime(){ clickByXpath("//XCUIElementTypeStaticText[@name=\"Limited time\"]"); }
    public void checkIPhoneXRPrice(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\" from $449. iPhoneTest X\"]");
    }
    public void checkIPhoneXSPrice(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\" from $699.\"]");
    }
    public void checkTradingIPhone(){ clickByXpath("//XCUIElementTypeStaticText[@name=\"Trade in your current iPhoneTest and upgrade to a new one.\"]"); }
    public void checkBuyWithTradingIPhone(){
        clickByXpath("//XCUIElementTypeLink[@name=\"Buy now with trade in\"]");
    }
    public void checkIPhoneXR(){
        clickByXpath("//XCUIElementTypeOther[@name=\"iPhoneTest X R\"]");
    }
    public void checkTextIPhoneXR(){ clickByXpath("//XCUIElementTypeOther[@name=\"All-screen design. Longest battery life ever in an iPhoneTest. Fastest performance. Studio-quality photos.\"]"); }
    public void checkLearnMore(){
        clickByXpath("//XCUIElementTypeLink[@name=\"Learn more about iPhoneTest X R\"]");
    }
    public void checkBuyIPhoneXR(){
        clickByXpath("//XCUIElementTypeLink[@name=\"Buy iPhoneTest X R\"]");
    }
}