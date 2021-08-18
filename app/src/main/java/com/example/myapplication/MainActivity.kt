package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var resultAdapter: ResultAdapter
    val datas = mutableListOf<CashData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()
    }

    private fun initRecycler(){
        resultAdapter = ResultAdapter(this)
        rv_profile.adapter = resultAdapter


        // 이 부분을 Firebase 에서 가져오는 방식으로 변경 해야 함.
        datas.apply {
            add(CashData(img = R.drawable.rocket,name = "월급",age = "6,0000,000"))
            add(CashData(img = R.drawable.rocket,name = "sss",age = "100,000"))
            add(CashData(img = R.drawable.rocket,name = "bbb",age = "250,000"))
            add(CashData(img = R.drawable.rocket,name = "eee",age = "300,000"))
            add(CashData(img = R.drawable.rocket,name = "qqq",age = "90,000"))
            add(CashData(img = R.drawable.rocket,name = "ttt",age = "123,000"))
            add(CashData(img = R.drawable.rocket,name = "wwww",age = "50,000"))
            add(CashData(img = R.drawable.rocket,name = "qqqqq",age = "100,000"))

            resultAdapter.datas = datas
            resultAdapter.notifyDataSetChanged()
        }
        // recyclerview item 마다의 간격을 주기 위해
        rv_profile.addItemDecoration((VerticalItemDecorator(20)))
        rv_profile.addItemDecoration((HorizontalItemDecorator(10)))

    }

}