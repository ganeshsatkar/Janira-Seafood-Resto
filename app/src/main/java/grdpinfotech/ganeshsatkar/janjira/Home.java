package grdpinfotech.ganeshsatkar.janjira;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterViewFlipper;

public class Home extends AppCompatActivity {

    int[] fruitImages = {R.drawable.banner1, R.drawable.banner2, R.drawable.banner3, R.drawable.banner4,R.drawable.banner5,R.drawable.banner6,R.drawable.banner7};     // array of images
    String fruitNames[] = {"0oooooo", "o0ooooo", "oo0oooo", "ooo0ooo", "oooo0oo","ooooo0o","oooooo0"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        AdapterViewFlipper simpleAdapterViewFlipper = findViewById(R.id.simpleAdapterViewFlipper);
        // Custom Adapter for setting the data in Views
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), fruitNames, fruitImages);
        simpleAdapterViewFlipper.setAdapter(customAdapter); // set adapter for AdapterViewFlipper
        // set interval time for flipping between views
        simpleAdapterViewFlipper.setFlipInterval(4000);
        // set auto start for flipping between views
        simpleAdapterViewFlipper.setAutoStart(true);





    }
}
