package jp.cordea.fluxdemo.ui.app

import com.xwray.groupie.databinding.BindableItem
import jp.cordea.fluxdemo.R
import jp.cordea.fluxdemo.databinding.ListItemAppBinding
import javax.inject.Inject

class AppItem private constructor(
    private val viewModel: AppItemViewModel
) : BindableItem<ListItemAppBinding>() {
    class Factory @Inject constructor() {
        fun create(viewModel: AppItemViewModel) = AppItem(viewModel)
    }

    override fun getLayout(): Int = R.layout.list_item_app

    override fun bind(viewBinding: ListItemAppBinding, position: Int) {
        viewBinding.vm = viewModel
    }
}
