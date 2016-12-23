package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util.Function;

public class PaginaPrincipalPrimeFacesPage {
	WebDriver driver;

	// Constructor
	public PaginaPrincipalPrimeFacesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Localizadores

	// Menú

	// Search Menu
	@FindBy(how = How.XPATH, using = "id('menuSearch')")
	private WebElement menuSearch;
	// Ajax Core
	@FindBy(how = How.XPATH, using = "id('SubMenu-Ajax')/span")
	private WebElement lnkAjaxCore;
	// Input
	// Input
	@FindBy(how = How.XPATH, using = "id('SubMenu-Input')/span")
	private WebElement lnkInput;
	// Button
	@FindBy(how = How.XPATH, using = "id('SubMenu-Button')/span")
	private WebElement lnkButton;
	// Data
	@FindBy(how = How.XPATH, using = "id('SubMenu-Data')/span")
	private WebElement lnkData;
	// Panel
	@FindBy(how = How.XPATH, using = "id('SubMenu-Panel')/span")
	private WebElement lnkPanel;
	// Overlay
	@FindBy(how = How.XPATH, using = "id('SubMenu-Overlay')/span")
	private WebElement lnkOverlay;
	// Menu
	@FindBy(how = How.XPATH, using = "id('SubMenu-Menu')/span")
	private WebElement lnkMenu;
	// Charts
	@FindBy(how = How.XPATH, using = "id('SubMenu-Charts')/span")
	private WebElement lnkCharts;
	// Messages
	@FindBy(how = How.XPATH, using = "id('SubMenu-Message')/span")
	private WebElement lnkMessages;
	// Multimedia
	@FindBy(how = How.XPATH, using = "id('SubMenu-Multimedia')/span")
	private WebElement lnkMultimedia;
	// File
	@FindBy(how = How.XPATH, using = "id('SubMenu-File')/span")
	private WebElement lnkFile;
	// DragDrop
	@FindBy(how = How.XPATH, using = "id('SubMenu-DragDrop')/span")
	private WebElement lnkDragDrop;
	// Client Side Validation
	@FindBy(how = How.XPATH, using = "id('SubMenu-CSV')/span")
	private WebElement lnkClientSideValidation;
	// DF
	@FindBy(how = How.XPATH, using = "id('SubMenu-DF')/span")
	private WebElement lnkDialogFramework;
	// Misc
	@FindBy(how = How.XPATH, using = "id('SubMenu-Misc')/span")
	private WebElement lnkMisc;

	public WebElement getMenuSearch() {
		scrollBar(menuSearch);
		return menuSearch;
	}

	public WebElement getLnkAjaxCore() {
		scrollBar(lnkAjaxCore);
		return lnkAjaxCore;
	}

	public WebElement getLnkInput() {
		scrollBar(lnkInput);
		return lnkInput;
	}

	public WebElement getLnkButton() {
		scrollBar(lnkButton);
		return lnkButton;
	}

	public WebElement getLnkData() {
		scrollBar(lnkData);
		return lnkData;
	}

	public WebElement getLnkPanel() {
		scrollBar(lnkPanel);
		return lnkPanel;
	}

	public WebElement getLnkOverlay() {
		scrollBar(lnkOverlay);
		return lnkOverlay;
	}

	public WebElement getLnkMenu() {
		scrollBar(lnkMenu);
		return lnkMenu;
	}

	public WebElement getLnkCharts() {
		scrollBar(lnkCharts);
		return lnkCharts;
	}

	public WebElement getLnkMessages() {
		scrollBar(lnkMessages);
		return lnkMessages;
	}

	public WebElement getLnkMultimedia() {
		scrollBar(lnkMultimedia);
		return lnkMultimedia;
	}

	public WebElement getLnkFile() {
		scrollBar(lnkFile);
		return lnkFile;
	}

	public WebElement getLnkDragDrop() {
		scrollBar(lnkDragDrop);
		return lnkDragDrop;
	}

	public WebElement getLnkClientSideValidation() {
		scrollBar(lnkClientSideValidation);
		return lnkClientSideValidation;
	}

	public WebElement getLnkDialogFramework() {
		scrollBar(lnkDialogFramework);
		return lnkDialogFramework;
	}

	public WebElement getLnkMisc() {
		scrollBar(lnkMisc);
		return lnkMisc;
	}

	public String validarElementosMenu() {
		String msg = "Ok";
		if (!menuSearch.isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró el área de búsqueda \n";
		}
		if (!getLnkAjaxCore().isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró la opción del menú Ajax Core \n";
		}
		if (!getLnkInput().isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró la opción del menú Input \n";
		}
		if (!getLnkButton().isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró la opción del menú Buttón \n";
		}
		if (!getLnkData().isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró la opción del menú Data \n";
		}
		if (!getLnkPanel().isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró la opción del menú Panel \n";
		}
		if (!getLnkOverlay().isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró la opción del menú Overlay \n";
		}
		if (!getLnkMenu().isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró la opción del menú Menu \n";
		}
		if (!getLnkCharts().isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró la opción del menú Charts \n";
		}
		if (!getLnkMessages().isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró la opción del menú Messages \n";
		}
		if (!getLnkMultimedia().isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró la opción del menú Multimedia \n";
		}
		if (!getLnkFile().isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró la opción del menú File \n";
		}
		if (!getLnkDragDrop().isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró la opción del menú Drag Drop \n";
		}
		if (!getLnkClientSideValidation().isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró la opción del menú Client Side Validation \n";
		}
		if (!getLnkDialogFramework().isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró la opción del menú Dialog Framework \n";
		}
		if (!getLnkMisc().isDisplayed()) {
			if (msg.equals("Ok")) {
				msg = "";
			}
			msg = msg + "No se encontró la opción del menú Misc \n";
		}
		return msg;
	}

	public String menuInput() {
		String msg = "Ok";
		
		if(getLnkInput().isDisplayed()){
			getLnkAjaxCore().click();
			Function.waitForLoad(driver);
			return msg;
		}
		return "No se encontró el menú Input";

	}
	public String menuInputEditor() {
		String msg = "Ok";
		WebElement editor=driver.findElement(By.xpath("id('MENUSIDEindent')/div[3]/a[text()='• Editor']"));
		if(editor.isDisplayed()){
			editor.click();
			Function.waitForLoad(driver);
			return msg;
		}
		return "No se encontró el menú Ajax Core";

	}

	public void scrollBar(WebElement element) {
		Function.waitForLoad(driver);
		Function.scrollTo(driver, element);
	}

}
