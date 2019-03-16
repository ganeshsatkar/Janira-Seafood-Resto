package grdpinfotech.ganeshsatkar.janjira;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static android.content.Intent.ACTION_DIAL;
import static android.content.Intent.ACTION_SEND;
import static android.content.Intent.EXTRA_EMAIL;
import static android.content.Intent.EXTRA_SUBJECT;
import static android.content.Intent.EXTRA_TEXT;
import static android.content.Intent.createChooser;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {






    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.menuitom:

                    Intent i = new Intent(MainActivity.this, grdpinfotech.ganeshsatkar.janjira.Menu.class);
                    startActivity(i);
                    return true;



                case R.id.whatsapp:

                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse(
                                    "https://api.whatsapp.com/send?phone=+919028903523&text=Welcome%20to%20Janjira%20Seafood%20resto%20Write%20your%20Message%20here"
                            )));
                    return true;

                /*String toNumber = "+91 9028903523"; // contains spaces.
                toNumber = toNumber.replace("+", "").replace(" ", "");

                Intent sendIntent = new Intent("android.intent.action.MAIN");
                sendIntent.putExtra("jid", toNumber + "@s.whatsapp.net");
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Write Your Feedback, Video Message &  Request Here");
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setPackage("com.whatsapp");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

                    return true;*/

                       /*case R.id.navigation_testimonial:
                           startActivity(new Intent(Intent.ACTION_VIEW,
                                   Uri.parse(
                                           "https://api.whatsapp.com/send?phone=+919960759032&text=Write%20your%20feedback%20here"
                                   )));
                           return true;*/





                case R.id.call:
                    String phone = "+918484849000";
                    Intent intent = new Intent(ACTION_DIAL, Uri.fromParts("tel", phone, null));
                    startActivity(intent);
                    return true;
            }
            return false;
        }
    };





    Button t,t1,t2,t3,t4,t5,t6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



        t=(Button) findViewById(R.id.home);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(), "fonts/monotypecorsiva.ttf");
        t.setTypeface(myCustomFont);



        t=(Button) findViewById(R.id.aboutus);
        Typeface myCustomFont1=Typeface.createFromAsset(getAssets(), "fonts/monotypecorsiva.ttf");
        t.setTypeface(myCustomFont1);

        t=(Button) findViewById(R.id.events);
        Typeface myCustomFont2=Typeface.createFromAsset(getAssets(), "fonts/monotypecorsiva.ttf");
        t.setTypeface(myCustomFont2);

        t=(Button) findViewById(R.id.menu);
        Typeface myCustomFont3=Typeface.createFromAsset(getAssets(), "fonts/monotypecorsiva.ttf");
        t.setTypeface(myCustomFont3);


        t=(Button) findViewById(R.id.gallery);
        Typeface myCustomFont4=Typeface.createFromAsset(getAssets(), "fonts/monotypecorsiva.ttf");
        t.setTypeface(myCustomFont4);

        t=(Button) findViewById(R.id.contact);
        Typeface myCustomFont5=Typeface.createFromAsset(getAssets(), "fonts/monotypecorsiva.ttf");
        t.setTypeface(myCustomFont5);

        t=(Button) findViewById(R.id.keypeople);
        Typeface myCustomFont6=Typeface.createFromAsset(getAssets(), "fonts/monotypecorsiva.ttf");
        t.setTypeface(myCustomFont6);





        Button b = findViewById(R.id.home);
        Button b1 = findViewById(R.id.aboutus);
        Button b3 = findViewById(R.id.menu);
        Button b4 = findViewById(R.id.events);
        Button gal = findViewById(R.id.gallery);
        Button b5 = findViewById(R.id.contact);














       /* call.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                String phone = "+918484849000";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        }
        );*/






        b.setOnClickListener(new View.OnClickListener() {

                                 public void onClick(View v) {

                                     Intent intent = new Intent(MainActivity.this, Home.class);

                                     startActivity(intent);
                                 }

                             }
        );

        b1.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                      Intent intent = new Intent(MainActivity.this, Aboutus.class);

                                      startActivity(intent);
                                  }

                              }
        );

        b3.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                      Intent intent = new Intent(MainActivity.this, grdpinfotech.ganeshsatkar.janjira.Menu.class);

                                      startActivity(intent);
                                  }

                              }
        );






        b4.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                      Intent intent = new Intent(MainActivity.this, Events.class);

                                      startActivity(intent);
                                  }

                              }
        );

        b5.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                      Intent intent = new Intent(MainActivity.this, Contact.class);

                                      startActivity(intent);
                                  }

                              }
        );


       /* call.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                      Intent intent = new Intent(MainActivity.this, call.class);

                                      startActivity(intent);
                                  }

                              }
        );
*/



         gal.setOnClickListener(new View.OnClickListener() {

                                          public void onClick(View v) {

                                              Intent intent = new Intent(MainActivity.this, Gallery.class);

                                              startActivity(intent);
                                          }

                                      }
        );












        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.mail) {

            Intent intent = new Intent(ACTION_SEND);
            intent.setType("plain/text");
            intent.putExtra(EXTRA_EMAIL, new String[]{"chorge@janjiraseafoodresto.com"});
            intent.putExtra(EXTRA_SUBJECT, "subject");
            intent.putExtra(EXTRA_TEXT, "mail body");
            startActivity(createChooser(intent, ""));

        }

        if (id == R.id.call) {

            String phone = "+91 8484849000";
            Intent intent = new Intent(ACTION_DIAL, Uri.fromParts("tel", phone, null));
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.facebook) {


            Intent facebookAppIntent;
            try {
                facebookAppIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/156197761088113"));
                startActivity(facebookAppIntent);
            } catch (ActivityNotFoundException e) {
                facebookAppIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/JanjiraResto/"));
                startActivity(facebookAppIntent);
            }


        }


            // startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Ganeshsatkar")));

            // Handle the camera action







        else if (id == R.id.instagram) {

            Uri uri = Uri.parse("https://www.instagram.com/janjiraseafoodresto/");
            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

            likeIng.setPackage("com.instagram.android");

            try {
                startActivity(likeIng);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/janjiraseafoodresto/")));
            }




            //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/explore/locations/656214012/janjira-seafood-resto-bar/")));


        }

        else if (id == R.id.youtube) {

            Uri uri = Uri.parse("https://www.youtube.com/channel/UCGmAPuU5-QM9iqNsgssh39w");
            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

            likeIng.setPackage("com.google.android.youtube");

            try {
                startActivity(likeIng);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/channel/UCGmAPuU5-QM9iqNsgssh39w")));
            }




            //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/c/GaneshSatkar")));




        } else if (id == R.id.webite1) {
            Uri uri = Uri.parse("http://www.janjiraseafoodresto.com");
            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

            likeIng.setPackage("com.android.chrome");

            try {
                startActivity(likeIng);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.janjiraseafoodresto.com")));
            }



        } else if (id == R.id.map) {

            Uri uri = Uri.parse("https://maps.google.com/?cid=11738933650183112800&hl=en&gl=gb");
            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

            likeIng.setPackage("com.google.android.apps.maps");

            try {
                startActivity(likeIng);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://maps.google.com/?cid=11738933650183112800&hl=en&gl=gb")));
            }


        } else if (id == R.id.feedback) {

            startActivity(new Intent(MainActivity.this,Request.class));



        } else if (id == R.id.nav_share) {



            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBodyText = " To Download janjira Seafood Resto & Bar Android application click on following link https://play.google.com/store/apps/details?id=grdpinfotech.ganeshsatkar.janjira";
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Subject here");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
            startActivity(Intent.createChooser(sharingIntent, "Shearing Option"));
            return true;




        } else if (id == R.id.designby) {

            startActivity(new Intent(MainActivity.this,Designby.class));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
