package grdpinfotech.ganeshsatkar.janjira;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Gallery extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);


    }

    public void interior(View v) {
        //Inform the user the button has been clicked
        Intent intent = new Intent(Gallery.this, Interior.class);

        startActivity(intent);
    }


    public void deliciousfood(View v) {
        //Inform the user the button has been clicked
        Intent intent = new Intent(Gallery.this, Deliciousfood.class);

        startActivity(intent);
    }


    public void celebrities(View v) {
        //Inform the user the button has been clicked
        Intent intent = new Intent(Gallery.this, Celebrities.class);

        startActivity(intent);
    }


    public void guestfeedback(View v) {
        //Inform the user the button has been clicked
        Intent intent = new Intent(Gallery.this, Guestfeedback.class);

        startActivity(intent);
    }

    public void news(View v) {
        //Inform the user the button has been clicked
        Intent intent = new Intent(Gallery.this, News.class);

        startActivity(intent);
    }

    public void video(View v) {
        //Inform the user the button has been clicked
        Intent intent = new Intent(Gallery.this, Video.class);

        startActivity(intent);
    }


    public void morephoto(View v) {
        //Inform the user the button has been clicked
        Intent facebookAppIntent;
        try {
            facebookAppIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/156197761088113"));
            startActivity(facebookAppIntent);
        } catch (ActivityNotFoundException e) {
            facebookAppIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/JanjiraResto/"));
            startActivity(facebookAppIntent);
        }
    }


}






