package grdpinfotech.ganeshsatkar.janjira;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import static android.content.Intent.ACTION_DIAL;

public class Contact extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }



    public void mailcontact(View v) {
        //Inform the user the button has been clicked
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/html");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"janjirafinedine@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Your Subject");
        i.putExtra(Intent.EXTRA_TEXT, "Write Your Mail Here");
        try {
            startActivity(Intent.createChooser(i, "Send feedback..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }

    }



    public void mapcontact(View v) {
        //Inform the user the button has been clicked
        Uri uri = Uri.parse("https://maps.google.com/?cid=11738933650183112800&hl=en&gl=gb");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.google.android.apps.maps");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://maps.google.com/?cid=11738933650183112800&hl=en&gl=gb")));
        }

    }


    public void webcontact(View v) {
        //Inform the user the button has been clicked
        Uri uri = Uri.parse("http://www.janjiraseafoodresto.com");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.android.chrome");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.janjiraseafoodresto.com")));
        }
    }
    public void phonecontact(View v) {
        //Inform the user the button has been clicked
        String phone = "+918805815400";
        Intent intent = new Intent(ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(intent);
    }

    public void mobilecontact(View v) {
        //Inform the user the button has been clicked
        String phone = "+918484849000";
        Intent intent = new Intent(ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(intent);

}




}