package com.mkj.chips.qrcodeapp.activity.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mkj.chips.qrcodeapp.adapter.AttendanceAdapter
import com.mkj.chips.qrcodeapp.databinding.FragmentDashboardBinding
import com.mkj.chips.qrcodeapp.model.Attendance

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private var attendList: MutableList<Attendance> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadAttend()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

       /* val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding?.rvAttend?.layoutManager = LinearLayoutManager(this@DashboardFragment.activity)
        val adapter = this@DashboardFragment.activity?.let { AttendanceAdapter(it, attendList) }
        _binding?.rvAttend?.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun loadAttend() {
        attendList.add(Attendance("TPSIPRD000002121", "Sahil", "20 March 2023 12:30 PM", true))
        attendList.add(Attendance("TPSIPRD000002121", "Sahil", "20 March 2023 12:30 PM", true))
        attendList.add(Attendance("TPSIPRD000002121", "Sahil", "20 March 2023 12:30 PM", false))
        attendList.add(Attendance("TPSIPRD000002121", "Sahil", "20 March 2023 12:30 PM", true))
        attendList.add(Attendance("TPSIPRD000002121", "Sahil", "20 March 2023 12:30 PM", true))
        attendList.add(Attendance("TPSIPRD000002121", "Sahil", "20 March 2023 12:30 PM", true))
        attendList.add(Attendance("TPSIPRD000002121", "Sahil", "20 March 2023 12:30 PM", true))
        attendList.add(Attendance("TPSIPRD000002121", "Sahil", "20 March 2023 12:30 PM", true))
        attendList.add(Attendance("TPSIPRD000002121", "Sahil", "20 March 2023 12:30 PM", true))
        attendList.add(Attendance("TPSIPRD000002121", "Sahil", "20 March 2023 12:30 PM", true))
        attendList.add(Attendance("TPSIPRD000002121", "Sahil", "20 March 2023 12:30 PM", true))
    }
}