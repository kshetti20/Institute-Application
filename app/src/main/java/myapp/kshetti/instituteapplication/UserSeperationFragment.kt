package myapp.kshetti.instituteapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import myapp.kshetti.instituteapplication.databinding.FragmentUserSeperationBinding
import myapp.kshetti.instituteapplication.viewmodels.UserProfileViewModel

class UserSeperationFragment : Fragment() {

    private val viewModel : UserProfileViewModel by viewModels()

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