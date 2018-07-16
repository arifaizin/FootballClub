package id.co.imastudio.kadefootballclub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import id.co.imastudio.kadefootballclub.R.array.club_image
import id.co.imastudio.kadefootballclub.R.array.club_name
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var items: MutableList<Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

//        verticalLayout {
//            lparams(width = matchParent, height = matchParent )
//            recyclerView {
//                lparams (width = matchParent, height = matchParent)
//                layoutManager = LinearLayoutManager(this)
//                adapter = RecyclerViewAdapter(this, items)
//
//            }
//        }

        club_list.layoutManager = LinearLayoutManager(this)
        club_list.adapter = RecyclerViewAdapter(this, items)
    }


    private fun initData() {
        val name = resources.getStringArray(club_name)
        val image = resources.obtainTypedArray(club_image)
        items.clear()
        for (i in name.indices) {
            items.add(Item(name[i],
                    image.getResourceId(i, 0)))
        }

        //Recycle the typed array
        image.recycle()
    }
}
