import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import jp.co.tnk_hidy.test_linelogin.R
import jp.co.tnk_hidy.test_linelogin.RequestCode

class MainActivity : AppCompatActivity() {

    val REQUEST_CODE = RequestCode.request_code()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
