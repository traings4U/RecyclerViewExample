package com.mani.recyclerviewdemoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class ContactAdapter(val contactDataList : ArrayList<ContactsData>) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>()
{




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ContactViewHolder(view)

    }

    override fun getItemCount(): Int {

        return contactDataList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {


        val mContactsData = contactDataList.get(position)
        holder.tvName!!.setText(""+mContactsData.name)
        holder.tvEmail!!.setText(""+mContactsData.emailAddress)
        holder.tvMobileNumber!!.setText(""+mContactsData.mobileNumber)
        holder.tvDesgination!!.setText(""+mContactsData.designation)

        Glide.with(holder.itemView)  //2
            .load(mContactsData.profileImage) //3
            .centerCrop() //4
            .placeholder(R.drawable.ic_profile) //5
            .error(R.drawable.ic_profile) //6
            .fallback(R.drawable.ic_profile) //7
            .into(holder.ivImage) //8

    }

    class ContactViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
    {

        val tvName = itemView.findViewById<TextView>(R.id.tvName)
        val tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
        val tvMobileNumber = itemView.findViewById<TextView>(R.id.tvMobileNumber)
        val tvDesgination = itemView.findViewById<TextView>(R.id.tvDesignation)
        val ivImage = itemView.findViewById<CircleImageView>(R.id.ivImage)


    }

}