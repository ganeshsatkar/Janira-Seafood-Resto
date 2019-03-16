/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package grdpinfotech.ganeshsatkar.janjira;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class a
extends BaseAdapter {
    Context a;
    int[] b;
    String[] c;
    LayoutInflater d;

    public a(Context context, String[] arrstring, int[] arrn) {
        this.a = context;
        this.b = arrn;
        this.c = arrstring;
        this.d = LayoutInflater.from((Context)context);
    }

    public int getCount() {
        return this.c.length;
    }

    public Object getItem(int n) {
        return null;
    }

    public long getItemId(int n) {
        return 0;
    }

    public View getView(int n, View view, ViewGroup viewGroup) {
        View view2 = this.d.inflate(2131361854, null);
        TextView textView = (TextView)view2.findViewById(2131230809);
        ImageView imageView = (ImageView)view2.findViewById(2131230808);
        textView.setText((CharSequence)this.c[n]);
        imageView.setImageResource(this.b[n]);
        return view2;
    }
}

