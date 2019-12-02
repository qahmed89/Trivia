package com.example.android.navigation


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {
lateinit var binding :FragmentTitleBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)
        binding.playButton.setOnClickListener { view: View ->
            view.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToGameFragment())
        }


setHasOptionsMenu(true)

        return binding.root

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,view!!.findNavController())||super.onOptionsItemSelected(item)
    }
    //    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        binding.playButton.setOnClickListener {
//            Toast.makeText(context,"hello",Toast.LENGTH_SHORT).show()
//            Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_gameFragment)
//        }
//    }
}
