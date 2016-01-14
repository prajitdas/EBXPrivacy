package edu.umbc.cs.ebiquity.mithril.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import edu.umbc.cs.ebiquity.mithril.R;
import edu.umbc.cs.ebiquity.mithril.ebxprivacy.ActivityMain;

public class MithrilLauncherActivity extends Activity {
	private Button mBtnLaunchXPrivacy;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mithril_launcher);
		
		mBtnLaunchXPrivacy = (Button) findViewById(R.id.btn_launch_xprivacy);
		
		addOnClickListener();
	}

	private void addOnClickListener() {
		mBtnLaunchXPrivacy.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent myIntent = new Intent(v.getContext(), ActivityMain.class);
				startActivity(myIntent);
				finish();
			}
		});		
	}

}