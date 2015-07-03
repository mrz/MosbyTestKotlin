package mrz.android.mosbytest

import com.hannesdorfmann.mosby.mvp.lce.MvpLceView

public interface MainView : MvpLceView<String> {

    public fun setString(aString: String)

}
