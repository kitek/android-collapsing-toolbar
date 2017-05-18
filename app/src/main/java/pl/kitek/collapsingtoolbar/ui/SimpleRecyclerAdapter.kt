package pl.kitek.collapsingtoolbar.ui

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import pl.kitek.collapsingtoolbar.dp2px
import pl.kitek.collapsingtoolbar.ui.SimpleRecyclerAdapter.ViewHolder

class SimpleRecyclerAdapter(private val items: List<String>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(parent)

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        (holder as ViewHolder).bind(items[position])
    }

    override fun getItemCount() = items.size

    class ViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            TextView(parent.context).apply {
                val p = dp2px(16).toInt()
                setPadding(p, p, p, p)
            }) {
        fun bind(item: String) = with(itemView as TextView) {
            text = item
        }
    }
}