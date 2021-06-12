package myapp.kshetti.instituteapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import myapp.kshetti.instituteapplication.databinding.FragmentUserSeperationBinding

class UserSeperationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentUserSeperationBinding>(
            inflater,
            R.layout.fragment_user_seperation, container, false
        )
        return binding.root
    }
}