package com.example.myrecyclerview

import ListMemberAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.MembersData

class MainActivity : AppCompatActivity() {
    private lateinit var rvKq: RecyclerView
    private var list: ArrayList<Member> = arrayListOf()

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvKq = findViewById(R.id.rv_kq)
        rvKq.setHasFixedSize(true)
        list.addAll(MembersData.listData)
        showRecycleList()
    }

    private fun setActionBarTitle(title: CharSequence) {
        if(supportActionBar != null){
            (supportActionBar as ActionBar).title=title
        }

    }

    private fun showRecycleList(){
        rvKq.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListMemberAdapter(list)
        rvKq.adapter = listHeroAdapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecycleList()
                title="Mode List"
            }

            R.id.action_grid -> {
                showRecyclerGrid()
                title="Mode Grid"
            }

            R.id.action_cardview -> {
                showRecyclerCardView()
                title="Mode CardViwe"
            }
        }
    }
    private fun showRecyclerGrid(){

        rvKq.layoutManager=GridLayoutManager(this,2)
        val gridKqAdapter=GridKqAdapter(list)
        rvKq.adapter=gridKqAdapter
        }
    private fun showRecyclerCardView(){
        rvKq.layoutManager=LinearLayoutManager(this)
        val cardViewKqAdapter=CardViewKqAdapter(list)
        rvKq.adapter=cardViewKqAdapter
        }
}