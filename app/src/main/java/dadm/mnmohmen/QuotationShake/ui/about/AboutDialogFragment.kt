package dadm.mnmohmen.QuotationShake.ui.about

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import dadm.mnmohmen.QuotationShake.R

class AboutDialogFragment : DialogFragment(R.layout.fragment_about) {


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setTitle(R.string.dialog_title)
            .setMessage(R.string.dialog_message)
            .create()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        7
    }

}
