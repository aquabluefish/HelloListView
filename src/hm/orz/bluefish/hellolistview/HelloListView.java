package hm.orz.bluefish.hellolistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HelloListView extends Activity {
    private ListView list;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.main);

        String[] arr = {"AAA","BBB","CCC","DDD","EEE","FFF"};

        list = (ListView)this.findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list, arr);
        list.setAdapter(adapter);
    }
}
