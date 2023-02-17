package com.mkj.chips.qrcodeapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mkj.chips.qrcodeapp.databinding.LayoutAttendanceViewBinding
import com.mkj.chips.qrcodeapp.model.Attendance

class AttendanceAdapter(val context: Context, var attendanceList: MutableList<Attendance>) :
    Adapter<AttendanceAdapter.AttendanceVH>() {

    inner class AttendanceVH(binding: LayoutAttendanceViewBinding) : ViewHolder(binding.root) {

        val tBinding = binding

        init {

        }

        fun bindData(attend: Attendance, po: Int) {
            tBinding.tvId.text = attend.id
            tBinding.tvName.text = attend.name
            tBinding.tvDateTime.text = attend.timestamp
            if (attend.isAttendance) {
                tBinding.ivStatus.visibility = View.VISIBLE
            } else {
                tBinding.ivStatus.visibility = View.GONE
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AttendanceVH {
        val binding =
            LayoutAttendanceViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AttendanceVH(binding)
    }

    override fun onBindViewHolder(holder: AttendanceVH, position: Int) {

        holder.bindData(attendanceList[position], position)

    }

    override fun getItemCount(): Int {
        return attendanceList.let { it.size }
    }
}