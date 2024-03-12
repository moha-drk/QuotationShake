package dadm.mnmohmen.QuotationShake.ui.newquotation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import dadm.mnmohmen.QuotationShake.R
import dadm.mnmohmen.QuotationShake.databinding.FragmentNewQuotationBinding
import kotlinx.coroutines.launch

class NewQuotationFragment: Fragment() {

    private var _binding: FragmentNewQuotationBinding? = null
    private val viewModel: NewQuotationViewModel by viewModels()
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

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.userName.collect { userName ->
                    val greetingText =
                        if (userName.isNotEmpty()) userName else getString(R.string.anonymous)
                    binding.welcomeMessage.text = getString(R.string.greetings, greetingText)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
