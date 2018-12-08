package jp.cordea.fluxdemo.ui.region

import com.xwray.groupie.databinding.BindableItem
import jp.cordea.fluxdemo.R
import jp.cordea.fluxdemo.databinding.ListItemRegionBinding

class RegionItem(
    private val viewModel: RegionItemViewModel
) : BindableItem<ListItemRegionBinding>() {
    override fun getLayout(): Int = R.layout.list_item_region

    override fun bind(viewBinding: ListItemRegionBinding, position: Int) {
        viewBinding.vm = viewModel
    }
}
