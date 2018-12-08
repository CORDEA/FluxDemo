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
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy
import jp.cordea.fluxdemo.databinding.FragmentRegionBinding
import jp.cordea.fluxdemo.event.region.RegionActionCreator
import jp.cordea.fluxdemo.event.region.RegionStore
import javax.inject.Inject

class RegionFragment : Fragment() {
    companion object {
        fun newInstance(): RegionFragment = RegionFragment()
    }

    @Inject
    lateinit var store: RegionStore

    @Inject
    lateinit var creator: RegionActionCreator

    private val compositeDisposable = CompositeDisposable()
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        store.onReady()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy {
                adapter.addAll(it.map { RegionItem(RegionItemViewModel.from(it)) })
            }
            .addTo(compositeDisposable)
        store.onError()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy { }
            .addTo(compositeDisposable)

        creator.init()
    }
}
