package com.danscoding.evenity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.danscoding.evenity.databinding.ActivityListWeddingBinding

class ListWeddingActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var teamWeddingList : ArrayList<ListWedding>
    private lateinit var listWeddingAdapter: ListWeddingAdapter
    private lateinit var binding : ActivityListWeddingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_wedding)

        initRecyclerView()

    }

    private fun initRecyclerView() {
        recyclerView = findViewById(R.id.rvListWedding)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        teamWeddingList = ArrayList()
        teamWeddingList.add(ListWedding(R.drawable.music, "Maman Entertainment", "Event Organizer", (R.drawable.team3),"Rp 5.500.000", "5.0"))
        teamWeddingList.add(ListWedding(R.drawable.music, "Maman Entertainment", "Event Organizer", (R.drawable.team3),"Rp 5.500.000", "5.0"))
        teamWeddingList.add(ListWedding(R.drawable.music, "Maman Entertainment", "Event Organizer", (R.drawable.team3),"Rp 5.500.000", "5.0"))
        teamWeddingList.add(ListWedding(R.drawable.music, "Maman Entertainment", "Event Organizer", (R.drawable.team3),"Rp 5.500.000", "5.0"))
        teamWeddingList.add(ListWedding(R.drawable.music, "Maman Entertainment", "Event Organizer", (R.drawable.team3),"Rp 5.500.000", "5.0"))
        teamWeddingList.add(ListWedding(R.drawable.music, "Maman Entertainment", "Event Organizer", (R.drawable.team3),"Rp 5.500.000", "5.0"))

        listWeddingAdapter = ListWeddingAdapter(teamWeddingList)
        recyclerView.adapter = listWeddingAdapter
    }
}