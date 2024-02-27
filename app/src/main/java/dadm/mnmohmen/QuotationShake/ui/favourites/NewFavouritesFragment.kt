package dadm.mnmohmen.QuotationShake.ui.favourites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dadm.mnmohmen.QuotationShake.databinding.FragmentFavouritesBinding

class FavouritesFragment : Fragment() {

    private var _binding: FragmentFavouritesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFavouritesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Aquí puedes inicializar tus vistas o configurar tu lógica de UI
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
