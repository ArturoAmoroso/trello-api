package trello.ui.pages;

import org.openqa.selenium.By;

public class Card extends AbstractPageObject {

    private String CARD_NAME_XPATH = "//span[text()='%s']";

    public String getCardByTitle(String cardName) {
        return action.getText(By.xpath(String.format(this.CARD_NAME_XPATH, cardName)));
    }
}
