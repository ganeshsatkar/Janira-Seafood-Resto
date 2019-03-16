package grdpinfotech.ganeshsatkar.janjira;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void foodmenu(View v) {
        //Inform the user the button has been clicked
        Intent intent = new Intent(Menu.this, Foodmenu.class);

        startActivity(intent);
    }


    public void seafoodmenu(View v) {
        //Inform the user the button has been clicked
        Intent intent = new Intent(Menu.this, Seafoodmenu.class);

        startActivity(intent);
    }


    public void barfoodmenu(View v) {
        //Inform the user the button has been clicked
        Intent intent = new Intent(Menu.this, Barfoodmenu.class);

        startActivity(intent);
    }



}

    /*    Button b = findViewById(R.id.foodmenu);
        Button b1 = findViewById(R.id.foodmenu1);
        ImageButton i1 =findViewById(R.id.bfoodmenu);
        ImageButton i2 =findViewById(R.id.bfoodmenu1);*/



   /* 1.setOnClickListener(new View.OnClickListener() {

            public void onClick (View v){

                Intent intent = new Intent(Menu.this, Foodmenu.class);

                startActivity(intent);
            }

        });

    }

        b1.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                     Intent intent = new Intent(Menu.this, Seafoodmenu.class);

                                      startActivity(intent);
                                  }

                              }
        );




        i1.setOnClickListener(new View.OnClickListener() {

                                 public void onClick(View v) {

                                     Intent intent = new Intent(Menu.this, Foodmenu.class);

                                     startActivity(intent);
                                 }

                             }
        );

        i2.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                      Intent intent = new Intent(Menu.this, Seafoodmenu.class);

                                      startActivity(intent);
                                  }

                              }
        );



*/



