package dadm.mnmohmen.QuotationShake.ui.newquotation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dadm.mnmohmen.QuotationShake.R
import dadm.mnmohmen.QuotationShake.databinding.FragmentNewQuotationBinding

class NewQuotationFragment: Fragment() {

    private var _binding: FragmentNewQuotationBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewQuotationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}