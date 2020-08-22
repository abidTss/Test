package com.example.kotlindemo.test

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlindemo.R
import kotlinx.android.synthetic.main.image_item.view.*

class ImageGridAdapter(var context: Context) : RecyclerView.Adapter<ImageVH>() {
    val list = listOf(
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/072821e07b30419d8b4a9a4e2ee7fcfa.jpeg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/60513a0ae8de4883857bab0d0d88260c.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/61a173aeef124c90b719ef05e1094d04.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/5d71a9cd8a21494d830dae50631ab087.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/f282f21e384e46ef9372d951eb97c88e.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/4e35979cbbba40fea2233fc2d015797d.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/9911c65d8588435db2267bc55436c2cf.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/80ba9cca618f44cdbe9fa8db1fbc5505.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/7bb62d99cbe243e79550dbc0fb97ec20.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/150c0d72abaf4318b440606f48ec077e.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/7ac1051df6674db98c898c5435ec86c7.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/9c405e33ce72437ebd24b7008e726b37.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/3649b8dda9bc4a609f476c551a72aa16.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/fe6a7029650d4c1b9f301c8956f370ef.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/a9fb6bcb25154b24a10a7446bee6494a.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/16083e1585fa43e2965820238d84e118.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/63acd2807b9b46b5ad16b1f29536b2ce.jpg",
        "https://prod-fnpgarden.sfo2.cdn.digitaloceanspaces.com/ff579e5997654a52b1d4183da61b07c7.jpg"

    )
    val layoutInflator: LayoutInflater = LayoutInflater.from(context)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageVH {
        val view: View = layoutInflator.inflate(R.layout.image_item, parent, false)
        return ImageVH(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: ImageVH, position: Int) {

        Glide.with(context).load(list[position]).placeholder(R.drawable.ic_launcher_background).into(holder.imageView)

    }
}

class ImageVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var imageView = itemView.imageId
}