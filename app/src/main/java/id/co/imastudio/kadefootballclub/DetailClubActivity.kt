package id.co.imastudio.kadefootballclub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import org.jetbrains.anko.*

class DetailClubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var namaClub = intent.getStringExtra("name")
        var imageClub = intent.getIntExtra("image", 0)
        DetailActivityUI().setContentView(this)

//        var imgClubImage = find<ImageView>(R.id.img_club)
//        imgClubImage.imageResource = imageClub

        toast(namaClub)

        verticalLayout{

            imageView(imageClub).
                    lparams(width= matchParent, height = 500) {
                        padding = dip(20)
                        margin = dip(15)
                    }

            textView(namaClub).
                    lparams(width = matchParent){
                        gravity = Gravity.CENTER
                    }
        }
    }

    class DetailActivityUI() : AnkoComponent<DetailClubActivity> {
        //        override fun createView(ui: AnkoContext<DetailClubActivity>): View {
        override fun createView(ui: AnkoContext<DetailClubActivity>) = with(ui){

            verticalLayout {
//                imageView {
////                    id = R.id.dsds
//                    imageResource = R.drawable.img_acm
//                }.lparams(width = matchParent, height = dip(200)) {
//                    padding = dip(20)
//                    margin = dip(15)
//                }
//
//                textView("tes") {
////                    id = R.id.text_club
//                }.lparams(width = matchParent, height = wrapContent) {
//                    gravity = Gravity.CENTER_HORIZONTAL
//                }
            }
        }
    }
}