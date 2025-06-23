import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.tecnologia.R
import com.example.tecnologia.databinding.CardviewListItemBinding
import com.example.tecnologia.utils.Producto

class AdapterProducto(
    context: Context,
    resource: Int,
    val productList: MutableList<Producto>
) : ArrayAdapter<Producto>(context, resource, productList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding: CardviewListItemBinding
        var itemView: View

        if (convertView == null) {
            binding = CardviewListItemBinding.inflate(
                LayoutInflater.from(context),
                parent,
                false
            )
            itemView = binding.root
            itemView.tag = binding
        } else {
            itemView = convertView
            binding = itemView.tag as CardviewListItemBinding
        }

        val product = getItem(position)
        product?.let {
            binding.txtProductNameCard.text = it.nombre
            binding.txtRegionCard.text = it.departamento
            binding.txtTotalSales.text = context.getString(
                R.string.sales_format,
                it.ventasTotales
            )
            binding.determinateBar.progress = (it.unidadesVendidas % 100)
        }

        return itemView
    }
}