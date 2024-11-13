package com.mvn;
import org.apache.commons.lang3.ObjectUtils.Null;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.browser.BrowserConfiguration;
import com.modules.AFWAlerts;
import com.modules.AFWBrowserWindows;
import com.modules.AFWFrames;
import com.modules.AFWModalDiologs;
import com.modules.ElementBrokenLinks;
import com.modules.ElementButtons;
import com.modules.ElementCheckBox;
import com.modules.ElementDynamic;
import com.modules.ElementLinks;
import com.modules.ElementRedioButton;
import com.modules.ElementTextBox;
import com.modules.ElementUploadDownload;
import com.modules.ElementWebTable;
import com.modules.FormPractise;
import com.modules.InteractionsDragabble;
import com.modules.InteractionsDroppable;
import com.modules.InteractionsResizable;
import com.modules.InteractionsSelectable;
import com.modules.InteractionsSortable;
import com.modules.WidgetsAccordian;
import com.modules.WidgetsAutoComplete;
import com.modules.WidgetsDataPicker;
import com.modules.WidgetsMenu;
import com.modules.WidgetsProgressbar;
import com.modules.WidgetsSelectMenu;
import com.modules.WidgetsSlider;
import com.modules.WidgetsTabs;
import com.modules.WidgetsToolTips;


public class MainTest {
WebDriver driver=null;
	
	ElementTextBox et= null;
	ElementCheckBox ec=null;
	ElementRedioButton er=null;
	ElementWebTable ew=null;
	ElementButtons eb=null;
	ElementLinks el=null;
	ElementBrokenLinks ebl=null;
	ElementUploadDownload eud=null;
	ElementDynamic ed=null;
	FormPractise fp=null;
	
	AFWBrowserWindows abw=null;
	AFWAlerts aa=null;
	AFWFrames af=null;
	AFWModalDiologs amd=null;
	
	WidgetsAccordian wa=null;
	WidgetsAutoComplete wac=null;
	WidgetsDataPicker wdp=null;
	WidgetsSlider ws=null;
	WidgetsProgressbar wp=null;
	WidgetsTabs wt=null;
	WidgetsToolTips wtt=null;
	WidgetsMenu wm=null;
	WidgetsSelectMenu wsm=null;
	
	InteractionsSortable isort=null;
	InteractionsSelectable islect=null;
	InteractionsResizable iresize=null;
	InteractionsDroppable idrop=null;
	InteractionsDragabble idrag=null;
	
@BeforeClass
	public void loadBrowser() throws InterruptedException
	{
		driver=new BrowserConfiguration().ChromeBrowserSelection("chrome", "https://demoqa.com/");
		Thread.sleep(3000);
	}

@BeforeTest
public void beforeTest() {
	
	et=new ElementTextBox();
	ec= new ElementCheckBox();
	er=new ElementRedioButton();
	ew=new ElementWebTable();
	eb=new ElementButtons();
	el=new ElementLinks();
	ebl=new ElementBrokenLinks();
	eud=new ElementUploadDownload();
	ed=new ElementDynamic();
	fp=new FormPractise();
	
	abw=new AFWBrowserWindows();
	aa=new AFWAlerts();
	af=new AFWFrames();
	amd=new AFWModalDiologs();
	
	wa=new WidgetsAccordian();
	wac=new WidgetsAutoComplete();
	wdp=new WidgetsDataPicker();
	ws=new WidgetsSlider();
	wp=new WidgetsProgressbar();
	wt=new WidgetsTabs();
	wtt=new WidgetsToolTips();
	wm=new WidgetsMenu();
	wsm=new WidgetsSelectMenu();
	
	isort=new InteractionsSortable();
	islect=new InteractionsSelectable();
	iresize=new InteractionsResizable();
	idrop=new InteractionsDroppable();
	idrag=new InteractionsDragabble();
	
}

@Ignore
@Test(priority = 1)
public void textBoxDetails() throws InterruptedException {
	et.clickElement(driver);
	et.enterFullname(driver, "Swara Shah");
	et.enterEmail(driver, "Swara@gmail.com");
	et.enterAddress(driver, "Surat", "Vadodara");
	et.clickSubmit(driver);
}

@Ignore
@Test(priority = 2)
public void checkboxDetails() throws InterruptedException {
	ec.clickElement(driver);
	ec.clickCheckbox(driver);
}

@Ignore
@Test(priority = 3)
public void radioButtonDetails() throws InterruptedException {
	er.clickElement(driver);
	er.clickRedioButton(driver);
}

@Ignore
@Test(priority = 4)
public void webtableDetails() throws InterruptedException {
	ew.clickElement(driver);
	ew.addTable(driver, "Swara", "Shah", "swara@gmail.com", "30", "100000", "CE");
}

@Ignore
@Test(priority = 5)
public void buttonsDetails() throws InterruptedException {
	eb.clickElement(driver);
	eb.buttonClick(driver);
}

@Ignore
@Test(priority = 6)
public void linksDetails() throws InterruptedException {
	el.clickElement(driver);
	el.clickLinks(driver);
}

@Ignore
@Test(priority = 7)
public void brokenlinksDetails() throws InterruptedException {
	ebl.clickElement(driver);
	ebl.clickBrokenlinks(driver);

}

@Ignore
@Test(priority = 8)
public void uploadDownloadDetails() throws InterruptedException {
	eud.clickElement(driver);
	eud.uploadImage(driver);
	eud.downloadImage(driver);
}

@Ignore
@Test(priority = 9)
public void dynamicDetails() throws InterruptedException {
	ed.clickElement(driver);
	ed.dynamicClick(driver);
	
}

@Ignore
@Test(priority = 9)
public void formDetails() throws InterruptedException {
	fp.clickElement(driver);
	fp.formFillUp(driver);
	
}

@Ignore
@Test(priority = 10)
public void browserWindowsDetails() throws InterruptedException {
	abw.clickElement(driver);
	abw.browserWindows(driver);
	
}

@Ignore
@Test(priority = 11)
public void alertsDetails() throws InterruptedException {
	aa.clickElement(driver);
	aa.alerts(driver);
	
}

@Ignore
@Test(priority = 12)
public void framesDetails() throws InterruptedException {
	af.clickElement(driver);
	
}

@Ignore
@Test(priority = 13)
public void modalDiologsDetails() throws InterruptedException {
	amd.clickElement(driver);
	amd.modelDiologs(driver);
}

@Ignore
@Test(priority = 14)
public void accordianDetails() throws InterruptedException {
	wa.clickElement(driver);
	wa.accordianClick(driver);
}

@Ignore
@Test(priority = 15)
public void autoCompleteDetails() throws InterruptedException {
	wac.clickElement(driver);
	wac.mutlipleColorname(driver);
	wac.singleColorname(driver);
}

@Ignore
@Test(priority = 16)
public void dataPickerDetails() throws InterruptedException {
	wdp.clickElement(driver);
	wdp.selectDate(driver);
	wdp.selectDateNTime(driver);
	
}

@Ignore
@Test(priority = 17)
public void sliderDetails() throws Exception {
	ws.clickElement(driver);
	ws.slider(driver);
	
}

@Ignore
@Test(priority = 18)
public void progressbarDetails() throws Exception {
	wp.clickElement(driver);
	wp.ProgressBar(driver);
}
	
@Ignore
@Test(priority = 19)
public void tabDetails() throws Exception {
	wt.clickElement(driver);
	wt.clickTabs(driver);
}

@Ignore
@Test(priority = 20)
public void toolTipsDetails() throws Exception {
	wtt.clickElement(driver);
	wtt.hoverOver(driver);
}

@Ignore
@Test(priority = 21)
public void menuDetails() throws Exception {
	wm.clickElement(driver);
	wm.menuItems(driver);
}

@Ignore
@Test(priority = 22)
public void selectMenuDetails() throws Exception {
	wsm.clickElement(driver);
	wsm.select(driver);
}

@Ignore
@Test(priority = 23)
public void sortableDetails() throws Exception {
	isort.clickElement(driver);
	isort.sortableList(driver);
	isort.sortableGrid(driver);
	
}

@Ignore
@Test(priority = 24)
public void selectableDetails() throws Exception {
	islect.clickElement(driver);
	islect.selectableList(driver);
	islect.selectableGrid(driver);
	
}

@Ignore
@Test(priority = 25)
public void resizeableDetails() throws Exception {
	iresize.clickElement(driver);
	iresize.boxCorner1(driver);
	iresize.boxCorner2(driver);
}

@Ignore
@Test(priority = 26)
public void droppableDetails() throws Exception {
	idrop.clickElement(driver);
	idrop.simpleDrop(driver);
	idrop.accepDrop(driver);
	idrop.preventDrop(driver);
	idrop.revertDrop(driver);

}

@Ignore
@Test(priority = 27)
public void dragabbleDetails() throws Exception {
	idrag.clickElement(driver);
	idrag.simpleDrag(driver);
	idrag.axixRestrictedDrag(driver);
	idrag.containerRestrictedDrag(driver);
	idrag.cursorStyleDrag(driver);

}

//@Ignore
//@AfterClass
//public void closeBrowser() throws InterruptedException
//{
//	Thread.sleep(3000);
//	driver.close();		
//}
}
