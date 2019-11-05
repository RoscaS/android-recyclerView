package com.example.recycleview_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recycleview_app.models.BlogPost
import kotlinx.android.synthetic.main.layout_blog_list_item.view.*

class BlogRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

  /*------------------------------------------------------------------*\
  |*							                ATTRIBUTES
  \*------------------------------------------------------------------*/

  private val TAG: String = "AppDebug"
  private var items: List<BlogPost> = ArrayList()

  /*------------------------------------------------------------------*\
  |*							                HOOKS
  \*------------------------------------------------------------------*/

  override fun onCreateViewHolder(parent: ViewGroup,
                                  viewType: Int): RecyclerView.ViewHolder {
    return BlogViewHolder(
      LayoutInflater
              .from(parent.context)
              .inflate(R.layout.layout_blog_list_item, parent, false)
    )
  }

  override fun onBindViewHolder(holder: RecyclerView.ViewHolder,
                                position: Int) {
    when (holder) {
      is BlogViewHolder -> holder.bind(items.get(position))
    }
  }

  /*------------------------------------------------------------------*\
  |*							                METHODES
  \*------------------------------------------------------------------*/

  fun submitList(blogList: List<BlogPost>) {
    items = blogList
  }

  /*------------------------------*\
  |*			      OVERRIDES
  \*------------------------------*/

  override fun getItemCount() = items.size

  /*------------------------------------------------------------------*\
  |*							                INTERNAL
  \*------------------------------------------------------------------*/

  class BlogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val blog_id = itemView.blog_id          // -> layout_blog_list_item.xml
    val blog_image = itemView.blog_image    // -> layout_blog_list_item.xml
    val blog_title = itemView.blog_title    // -> layout_blog_list_item.xml
    val blog_author = itemView.blog_author  // -> layout_blog_list_item.xml

    fun bind(blogPost: BlogPost) {
      val requestOptions = RequestOptions()
              .placeholder(R.drawable.ic_launcher_background)
              .error(R.drawable.ic_launcher_background)

      Glide.with(itemView.context)
              .applyDefaultRequestOptions(requestOptions)
              .load(blogPost.image)
              .into(blog_image)

      blog_id.setText("#${blogPost.id + 1}")
      blog_title.setText(blogPost.title)
      blog_author.setText(blogPost.username)
    }
  }

}
