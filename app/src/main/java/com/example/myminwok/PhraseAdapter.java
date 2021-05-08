package com.example.myminwok;

import android.widget.ArrayAdapter;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.ImageView;
import android.app.Activity;

import android.view.ViewGroup;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class PhraseAdapter extends ArrayAdapter<Phrase> {

    public PhraseAdapter(Activity context, ArrayList<Phrase> phrases){
        super(context, 0, phrases);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null){
            listItemView=LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Phrase currentPhrase=getItem(position);

        TextView miwokTextView=(TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentPhrase.getMiwokTranslation());

        TextView defaultTextView=(TextView)listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentPhrase.getDefaultTranslation());

        ImageView imageView=(ImageView)listItemView.findViewById(R.id.image);
        imageView.setVisibility(View.GONE);

        View textContainer=listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),R.color.category_phrases);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
