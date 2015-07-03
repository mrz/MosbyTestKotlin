package mrz.android.mosbytest

import com.hannesdorfmann.mosby.mvp.lce.MvpLceFragment

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment : MvpLceFragment<TextView, String, MainView, MainPresenter>(), MainView {

    private var mTextView: TextView? = null

    private var mButton: Button? = null

    override fun createPresenter(): MainPresenter {
        return MainPresenter()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super<MvpLceFragment>.onViewCreated(view, savedInstanceState)

        mTextView = view.findViewById(R.id.contentView) as TextView

        mButton = view.findViewById(R.id.button) as Button

        mButton!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                presenter.loadString()
            }
        })

    }

    override fun getErrorMessage(throwable: Throwable, b: Boolean): String {
        return "An error"
    }

    override fun setData(data: String) {
    }

    override fun loadData(pullToRefresh: Boolean) {
    }

    override fun getLayoutRes(): Int {
        return R.layout.fragment_main
    }

    override fun setString(aString: String) {
        mTextView!!.setText(aString)
    }
}
