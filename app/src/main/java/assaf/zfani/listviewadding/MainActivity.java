package assaf.zfani.listviewadding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<String>myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView)findViewById(R.id.listView);
        ArrayList<String> myArray = new ArrayList<String>();
        myAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myArray);
        lv.setAdapter(myAdapter);
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText)findViewById(R.id.editText2);
                myAdapter.add(editText.getText().toString());
                myAdapter.notifyDataSetChanged(); // מעדכן את הליסט וויו שנכנס מידע חדש


            }
        });


    }
}
