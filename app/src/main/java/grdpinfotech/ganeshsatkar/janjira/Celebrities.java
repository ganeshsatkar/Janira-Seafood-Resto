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

public class Celebrities extends AppCompatActivity {

    private Integer[] images={R.drawable.celebrities3,
            R.drawable.celebrities4,R.drawable.celebrities5,R.drawable.celebrities6,R.drawable.celebrities7,R.drawable.celebrities8,
            R.drawable.celebrities9,R.drawable.celebrities10,R.drawable.celebrities11,
            R.drawable.celebrities12,R.drawable.celebrities13,R.drawable.celebrities14,R.drawable.celebrities15,
            R.drawable.celebrities17,R.drawable.banner2,R.drawable.celebrities19,
            R.drawable.celebrities21,R.drawable.celebrities23,R.drawable.
            celebrities24,R.drawable.banner3,R.drawable.celebrities27,R.drawable.
            celebrities1 };
    private ImageView imageview;
    Button facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celebrities);

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
