 package io.github.agrania.amikompay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()

      arrayList.add(Model("ATM", R.drawable.ic_atm))
      arrayList.add(Model("Mobile Banking", R.drawable.ic_mobile))
      arrayList.add(Model("Kartu Debit", R.drawable.ic_card))

        val myAdapter = MyAdapter(arrayList, this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter


}