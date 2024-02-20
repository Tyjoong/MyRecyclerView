import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myrecyclerview.Member
import com.example.myrecyclerview.R


class ListMemberAdapter(private val listMember: ArrayList<Member>) : RecyclerView.Adapter<ListMemberAdapter.ListViewHolder>() {
    class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvName: TextView = itemView.findViewById(R.id.name)
        var tvFrom: TextView = itemView.findViewById(R.id.from)
        var imgPhoto: ImageView = itemView.findViewById(R.id.photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_kq, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMember.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, from, photo) = listMember[position]


        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)


        holder.tvName.text = name
        holder.tvFrom.text = from
    }
    }
