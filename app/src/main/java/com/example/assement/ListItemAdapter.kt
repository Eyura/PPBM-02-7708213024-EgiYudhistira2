import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.assement.R

class ListItemAdapter(
    private val context: Context,
    private val items: List<ListItem>
) : ArrayAdapter<ListItem>(context, 0, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val listItem = getItem(position)

        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)

        val imageView = view.findViewById<ImageView>(R.id.item_image)
        val nameTextView = view.findViewById<TextView>(R.id.item_name)
        val description = view.findViewById<TextView>(R.id.description)

        imageView.setImageResource(listItem?.imageResource ?: 0)
        nameTextView.text = listItem?.name
        description.text = listItem?.description

        return view
    }
}