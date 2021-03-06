package com.example.abc123

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.abc123.databinding.ActivityMainBinding
import com.example.abc123.databinding.FragmentBoardBinding
import com.example.abc123.fragments.BoardFragment
import java.util.zip.Inflater

class SubActivity : AppCompatActivity() {

    private lateinit var bbinding: FragmentBoardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bbinding = FragmentBoardBinding.inflate(layoutInflater)

        setContentView(bbinding.root)

        val item = arrayOf("내가 쓴 글","댓글 단 글","자유게시판","질문게시판","거래게시판","단대별 게시판")

        bbinding.listview.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

    }


}