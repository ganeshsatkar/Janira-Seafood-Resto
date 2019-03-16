package grdpinfotech.ganeshsatkar.janjira;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Events extends AppCompatActivity {

    private Integer[] images={R.drawable.events2,R.drawable.events3,
            R.drawable.events4,R.drawable.events5,R.drawable.events6,R.drawable.events7,R.drawable.events8, R.drawable.events9,
            R.drawable.events1};
    private ImageView imageview;
    Button facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

       /* Button web = (Button) findViewById(R.id.morephotos);

        assert web != null;

        web.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       Intent facebookIntent = openChrome(gallery.this);
                                       startActivity(facebookIntent);


                                   }


                               }




        );*/

        android.widget.Gallery imgGallery = (android.widget.Gallery) findViewById(R.id.gallery);

        imgGallery.setAdapter(new ImageAdapter(this));
        imageview = (ImageView) findViewById(R.id.imageView);
        imgGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Toast.makeText(getApplicationContext(), "Image " + arg2, Toast.LENGTH_SHORT).show();
                imageview.setImageResource(images[arg2]);
            }
        });
    }



    public class ImageAdapter extends BaseAdapter {
        private Context context;

        public ImageAdapter(Context context) {

            this.context = context;
        }

        @Override
        public int getCount() {

            return images.length;
        }

        @Override
        public Object getItem(int arg0) {

            return arg0;
        }

        @Override
        public long getItemId(int arg0) {

            return arg0;
        }

        @Override
        public View getView(int arg0, View arg1, ViewGroup arg2) {

            ImageView imageView = new ImageView(context);
            imageView.setImageResource(images[arg0]);
            return imageView;
        }
    }





  /*  public static Intent openChrome(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.capmaval.com/gallery/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.capmaval.com/gallery/"));
        }


    }*/
}
