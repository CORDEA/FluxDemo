package jp.cordea.fluxdemo.ui.region


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import dagger.android.support.AndroidSupportInjection
import jp.cordea.fluxdemo.databinding.FragmentRegionBinding
import javax.inject.Inject
import javax.inject.Provider

class RegionFragment : Fragment() {
    companion object {
        fun newInstance(): RegionFragment = RegionFragment()
    }

    @Inject
    lateinit var item: Provider<RegionItem>

    private val adapter by lazy { GroupAdapter<ViewHolder>() }

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentRegionBinding.inflate(inflater, container, false)
        binding.recyclerView.adapter = adapter
        return binding.root
    }
}
