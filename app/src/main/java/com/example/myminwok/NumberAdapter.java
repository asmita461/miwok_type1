package com.example.myminwok;

import android.media.MediaPlayer;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.ImageView;
import android.app.Activity;

import android.view.ViewGroup;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class NumberAdapter extends ArrayAdapter<Number> {

    public NumberAdapter(Activity context, ArrayList<Number> numbers){
        super(context, 0, numbers);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null){
            listItemView=LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Number currentNumber=getItem(position);

        TextView miwokTextView=(TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentNumber.getMiwokTranslation());

        TextView defaultTextView=(TextView)listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentNumber.getDefaultTranslation());

        ImageView imageView=(ImageView)listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentNumber.getImageResourceId());

        View textContainer=listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),R.color.category_numbers);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
