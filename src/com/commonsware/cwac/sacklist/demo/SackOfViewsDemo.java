/***
	Copyright (c) 2008-2009 CommonsWare, LLC
	
	Licensed under the Apache License, Version 2.0 (the "License"); you may
	not use this file except in compliance with the License. You may obtain
	a copy of the License at
		http://www.apache.org/licenses/LICENSE-2.0
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/

package com.commonsware.cwac.sacklist.demo;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import com.commonsware.cwac.sacklist.SackOfViewsAdapter;

public class SackOfViewsDemo extends ListActivity {
	private static String[] items={"lorem", "ipsum", "dolor",
																	"sit", "amet", "consectetuer",
																	"adipiscing", "elit", "morbi",
																	"vel", "ligula", "vitae",
																	"arcu", "aliquet", "mollis",
																	"etiam", "vel", "erat",
																	"placerat", "ante",
																	"porttitor", "sodales",
																	"pellentesque", "augue",
																	"purus"};
	
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.main);
		
		ArrayList<View> views=new ArrayList<View>();
		
		views.add(new AnalogClock(this));
		
		for (String item : items) {
			Button btn=new Button(this);
			
			btn.setText(item);
			views.add(btn);
			views.add(null);							// stub for newView()
		}
		
		setListAdapter(new SillyAdapter(views));
	}
	
	class SillyAdapter extends SackOfViewsAdapter {
		public SillyAdapter(List<View> views) {
			super(views);
		}
		
		protected View newView(int position, ViewGroup parent) {
			TextView txt=new TextView(SackOfViewsDemo.this);
			
			txt.setText(items[(position-2)/2]);
			
			return(txt);
		}
	}
}
