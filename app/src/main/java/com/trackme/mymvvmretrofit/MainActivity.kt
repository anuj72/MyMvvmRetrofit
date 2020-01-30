package com.trackme.mymvvmretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.trackme.mymvvmretrofit.ApiManager.MyRetrofitBuilder
import kotlinx.coroutines.*
import retrofit2.HttpException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            CoroutineScope(Dispatchers.IO ).launch {
                try {
                    val user = MyRetrofitBuilder.apiService.getCity("21dbed072350e0a0ace720c6045f52b8","India")

                    withContext(Dispatchers.Main) {
                        var  value = user
                        Log.v("Sssssss",value.toString())

                    }
                }catch (e: HttpException){
                    Log.v("Exception",e.toString())
                }


        }
    }
}
