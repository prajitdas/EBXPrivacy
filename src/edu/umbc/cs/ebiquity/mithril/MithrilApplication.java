package edu.umbc.cs.ebiquity.mithril;

import android.app.Application;

public class MithrilApplication extends Application {
	private static final String CONST_DEBUG_TAG = new String("EBXPrivacyPrajit");

	public static String getConstDebugTag() {
		return CONST_DEBUG_TAG;
	}
}