package com.javahelps.com.javahelps.androiddictionarywithsqlite.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.javahelps.com.javahelps.androiddictionarywithsqlite.R;
import com.javahelps.com.javahelps.androiddictionarywithsqlite.utils.DictionaryModel;

import java.util.List;

public class Word_Adapter extends RecyclerView.Adapter<Word_Adapter.ViewHolder> {
    public List<DictionaryModel> data;

    public Word_Adapter(){}
    public void setData(List<DictionaryModel> data ){
        this.data=data;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        Context context =parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);

        View wordView=inflater.inflate( R.layout.word_item,parent,false );

        ViewHolder viewHolder=new ViewHolder( wordView,context );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        DictionaryModel dictionaryModel=data.get( position );
        holder.wordText.setText(dictionaryModel.getWord());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public Context context;
        public TextView wordText;
        public ViewHolder(View itemView ,Context context){
            super(itemView);
            this.context=context;
            wordText=itemView.findViewById( R.id.wordtext );
        }
    }
}
