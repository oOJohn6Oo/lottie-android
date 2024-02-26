package com.airbnb.lottie.issues

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable
import com.airbnb.lottie.issues.databinding.IssueReproActivityBinding

class IssueReproActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = IssueReproActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Reproduce any issues here.
        binding.animationView.setAnimation(R.raw.heart)
        binding.animationView.setOnClickListener {
            if((it as LottieAnimationView).drawable is LottieDrawable){
                it.setImageDrawable(ContextCompat.getDrawable(this, R.mipmap.ic_launcher))
            }else{
                it.setAnimation(R.raw.heart)
                it.playAnimation()
            }
        }
    }
}
