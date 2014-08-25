package com.baidu.baidumap.initenviron;

import android.os.SystemClock;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class StartApp extends UiAutomatorTestCase {
	
	
	
	 @Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	public void cancel() throws UiObjectNotFoundException{
		
		SystemClock.sleep(2000);
		System.out.println("will click cancel button");

		UiObject cancelButton = new UiObject(new UiSelector().textContains("取消")
				   .className("android.widget.Button"));
		if(cancelButton.exists()){
			System.out.println("click cancel button");
			cancelButton.click(); 
		}
		
	 }
	
	public void install() throws UiObjectNotFoundException {

		SystemClock.sleep(2000);
		System.out.println("will click install button");

		UiObject cancelButton = new UiObject(new UiSelector()
				.textContains("安装").className("android.widget.Button"));
		if (cancelButton.exists()) {
			System.out.println(" click install button");
			cancelButton.click();
		}

	}

}
