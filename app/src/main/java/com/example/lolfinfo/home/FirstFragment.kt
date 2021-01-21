package com.example.lolfinfo.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lolfinfo.R

private val CHAMPION_LIST = listOf(
    Champion(1, "Eren", 2000, ""),
    Champion(2, "Eren", 2030, ""),
    Champion(3, "Eren", 2400, ""),
    Champion(4, "Eren", 1000, ""),
    Champion(5, "Eren", 2200, ""),
    Champion(6, "Eren", 2000, ""),
    Champion(7, "Eren", 2500, ""),
    Champion(8, "Eren", 203400, ""),
    Champion(9, "Efe", 2, ""),
    Champion(10, "Efe", 2, ""),
    Champion(11, "Efe", 2, ""),
    Champion(12, "Efe", 2, "")
)

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_first, container, false)

        val recyclerView = root.findViewById<RecyclerView>(R.id.recyclerViewChampions)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = ChampionAdapter(CHAMPION_LIST)
        recyclerView.setHasFixedSize(true)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }
}