package com.habisofttech.ceronne.gestion.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.habisofttech.ceronne.gestion.R;



public class DepenseViewHolder extends RecyclerView.ViewHolder {
    public View view;
    public TextView label;
    public TextView categorie;
    public TextView date;
    public TextView montant;

    public DepenseViewHolder(View itemView) {
        super(itemView);
        view = itemView;
        label = (TextView) itemView.findViewById(R.id.label);
        categorie = (TextView) itemView.findViewById(R.id.categorie);
        date = (TextView) itemView.findViewById(R.id.date);
        montant = (TextView) itemView.findViewById(R.id.montant);
    }
}
