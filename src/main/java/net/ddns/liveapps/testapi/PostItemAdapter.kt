package net.ddns.liveapps.testapi

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.post_item_layout.view.*
import retrofit2.http.POST

class PostItemAdapter(val postList: List<POST>, val context: Context) :
RecyclerView.Adapter<PostItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.post_item_layout,
                parent, false))
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemView.txtPostTitle.text = postList.get(position).title
        holder.itemView.txtPostBody.text = postList.get(position).body

    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}