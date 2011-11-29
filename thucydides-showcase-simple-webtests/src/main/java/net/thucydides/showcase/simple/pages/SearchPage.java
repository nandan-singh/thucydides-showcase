package net.thucydides.showcase.simple.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://search.maven.org/")
public class SearchPage extends PageObject {


    @FindBy(id="query")
    private WebElement search;

    @FindBy(id="queryButton")
    private WebElement searchButton;
    
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void enter_search_terms(String searchTerms) {
        search.sendKeys(searchTerms);
    }

    public void starts_search() {
        searchButton.click();
    }
}


