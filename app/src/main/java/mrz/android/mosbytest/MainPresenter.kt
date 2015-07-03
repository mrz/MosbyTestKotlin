package mrz.android.mosbytest

import com.hannesdorfmann.mosby.mvp.rx.lce.MvpLceRxPresenter

public class MainPresenter : MvpLceRxPresenter<MainView, String>() {

    public fun loadString() {
        if (isViewAttached()) {
            getView().setString("A new string")
        }
    }
}
