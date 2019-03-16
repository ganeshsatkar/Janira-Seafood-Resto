package grdpinfotech.ganeshsatkar.janjira;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Gourav on 05-05-2016.
 */
public class CustomAdapterForEvents extends BaseAdapter {
    Context context;
    int[] fruitImages;
    String[] fruitNames;
    LayoutInflater inflter;

    public CustomAdapterForEvents(Context applicationContext, String[] fruitNames, int[] fruitImages) {
        this.context = applicationContext;
        this.fruitImages = fruitImages;
        this.fruitNames = fruitNames;
        inflter = (LayoutInflater.from(applicationContext));

    }

    @Override
    public int getCount() {
        return fruitNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflter.inflate(R.layout.list_itemforevents, null);
        TextView fruitName = view.findViewById(R.id.eventName);
        ImageView fruitImage = view.findViewById(R.id.eventImage);
        fruitName.setText(fruitNames[position]);
        fruitImage.setImageResource(fruitImages[position]);
        return view;
    }
}
