package com.habisofttech.ceronne.gestion;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.habisofttech.ceronne.gestion.adapters.DepenseViewHolder;
import com.habisofttech.ceronne.gestion.models.Depense;

import java.text.SimpleDateFormat;
import java.util.ArrayList;



public class DepenseAdapter extends RecyclerView.Adapter<DepenseViewHolder> {
    private ArrayList<Depense> depenses;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");

    public DepenseAdapter(ArrayList<Depense> depenses) {
        this.depenses = depenses;
    }

    @Override
    public DepenseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.depense_items,parent,false);

        return new DepenseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DepenseViewHolder holder, int position) {
        Depense depense = depenses.get(position);

        holder.label.setText(depense.getLabel());
        holder.montant.setText(depense.getMontant()+" XAF");
        holder.categorie.setText(depense.getCategorie().getLabel());
        String dateStr = dateFormat.format(depense.getDate());
        holder.date.setText(dateStr);

    }

    @Override
    public int getItemCount() {
        return depenses.size();
    }
}
