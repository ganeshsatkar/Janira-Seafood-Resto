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

public class Deliciousfood extends AppCompatActivity {

    private Integer[] images={R.drawable.food2,R.drawable.food3,
            R.drawable.food4,R.drawable.food5,R.drawable.b6,R.drawable.food7,
            R.drawable.food8,R.drawable.food9,R.drawable.food10,
            R.drawable.food11,R.drawable.food12,R.drawable.food13,R.drawable.food14,
            R.drawable.banner4,R.drawable.food16,R.drawable.food17,R.drawable.food18,R.drawable.banner5};
    private ImageView imageview;
    Button facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deliciousfood);

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
