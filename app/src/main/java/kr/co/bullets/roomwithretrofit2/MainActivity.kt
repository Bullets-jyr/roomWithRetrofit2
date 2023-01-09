package kr.co.bullets.roomwithretrofit2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kr.co.bullets.roomwithretrofit2.api.ApiInterface
import kr.co.bullets.roomwithretrofit2.api.ApiUtilites
import kr.co.bullets.roomwithretrofit2.databinding.ActivityMainBinding
import kr.co.bullets.roomwithretrofit2.repository.MemesRepository
import retrofit2.create

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var memesRepository: MemesRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        memesRepository = MemesRepository(ApiUtilites.getInstance().create(ApiInterface::class.java))
        setContentView(binding.root)

        binding.button.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                memesRepository.getMemes()
            }
        }
    }
}
