// Foo Wei Hong, 20023766
package sg.edu.rp.c346.id20023766.practical2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtv;
    ImageView img;
    TextView descrpt;
    TextView facts;
    Button url;
    String wordClicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtv = findViewById(R.id.txtview);
        img = findViewById(R.id.image1);
        descrpt = findViewById(R.id.textViewdescrpt);
        facts = findViewById(R.id.textViewFacts);
        url = findViewById(R.id.button2);

        registerForContextMenu(descrpt);

        Intent intentReceived = getIntent();
        String title = intentReceived.getStringExtra("TitleName");
        txtv.setText(title);
        String desc = intentReceived.getStringExtra("description");
        descrpt.setText(desc);
        String facttext = intentReceived.getStringExtra("facts");
        facts.setText(facttext);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null ){
            int resId = bundle.getInt("resId");
            img.setImageResource(resId);

        url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlstonks = intentReceived.getStringExtra("urllink");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlstonks));
                startActivity(intent);
            }
        });
        }
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "Increase Font");
        menu.add(0, 1, 1, "Decrease Font");

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == 0) {
            wordClicked = "Increase Font";
        }else if(item.getItemId() == 1){
            wordClicked = "Decrease Font";
        }

        if(wordClicked.equalsIgnoreCase("Increase Font")){
            descrpt.setTextSize(25);
        }else if(wordClicked.equalsIgnoreCase("Decrease Font")){
            descrpt.setTextSize(16);

        }
        return super.onContextItemSelected(item);
    }
}