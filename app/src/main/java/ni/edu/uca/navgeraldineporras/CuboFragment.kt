package ni.edu.uca.navgeraldineporras

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class CuboFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_moda, container, false)
        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener{
            findNavController().navigate(R.id.action_cuboFragment_to_nombreFragment)
        }
        return view
    }

}