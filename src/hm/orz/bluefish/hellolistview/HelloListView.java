package hm.orz.bluefish.hellolistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class HelloListView extends Activity {
    private ListView list;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.main);

        String[] ldata = {"AAA","BBB","CCC","DDD","EEE","FFF"};

        list = (ListView)this.findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list, ldata);
        list.setAdapter(adapter);
        list.setSelection(1);

        list.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>adapter, View view, int position, long id) {
	            TextView tview = (TextView)view;
                Toast.makeText(HelloListView.this, tview.getText() +" が選択されました", Toast.LENGTH_LONG).show();
            }
        });
    }

}
