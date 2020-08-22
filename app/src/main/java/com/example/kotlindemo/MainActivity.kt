package com.example.kotlindemo

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.kotlindemo.models.VenueModel
import com.example.kotlindemo.retrofit.ApiInterface
import com.example.kotlindemo.test.ImageGridAdapter
import com.example.kotlindemo.viewModels.MainActivityVM
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.get
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("$TAG onCreate")
        button10.setOnClickListener {
            startActivity(Intent(this, DetailsActivity::class.java))
        }



        val map = mutableMapOf(1 to "a", 2 to "b")
        map[3] = "Abc"
        //highOrderFn(1,():printMe())

        map.values.forEach {
            println(it)
        }
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageGridAdapter(this)
        val mainActivityVM: MainActivityVM =
            ViewModelProviders.of(this).get(MainActivityVM::class.java)
        val mainActivityVM2: MainActivityVM =
            ViewModelProviders.of(this).get(MainActivityVM::class.java)
        println("$mainActivityVM apiInterface $mainActivityVM2")
        /* println("${RetrofitObject.getRetrofitInstance()} apiInterface2 ${RetrofitObject.getApiInterface()}")
         println("${RetrofitObject.getRetrofitInstance()} apiInterface3 ${RetrofitObject.getApiInterface()}")
       */
        get<ApiInterface>().listRepos("octocat").enqueue(object : Callback<List<VenueModel>> {
            override fun onFailure(call: Call<List<VenueModel>>, t: Throwable) {
                println("${t.message}")
            }

            override fun onResponse(
                call: Call<List<VenueModel>>,
                response: Response<List<VenueModel>>
            ) {
                response.body()?.forEach {
                    println("name : ${it.name}, id : ${it.id}")
                }
            }
        })
        /* button10.setOnClickListener {
             ji.updateHieght(10)
         }*/

    }

    fun  highOrderFn(a:Int,b:()->Unit){
        println("a $a")
        b()
    }
    fun printMe(){
        println("hello")

    }

    override fun onStart() {
        super.onStart()
        println("$TAG onStart")
    }

    override fun onResume() {
        super.onResume()
        println("$TAG onResume")
    }

    override fun onPause() {
        super.onPause()
        println("$TAG onPause")
    }

    override fun onRestart() {
        super.onRestart()
        println("$TAG onRestart")
    }

    override fun onStop() {
        super.onStop()
        println("$TAG onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("$TAG onDestroy")
    }

}
