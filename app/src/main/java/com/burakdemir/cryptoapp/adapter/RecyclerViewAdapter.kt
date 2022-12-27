package com.burakdemir.cryptoapp.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.burakdemir.cryptoapp.model.CryptoModel

class RecyclerViewAdapter(private val cryptoList: ArrayList<CryptoModel>) : RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>() {
    class RowHolder(view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return cryptoList.size
    }
}