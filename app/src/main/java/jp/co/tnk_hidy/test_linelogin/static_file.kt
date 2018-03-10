package jp.co.tnk_hidy.test_linelogin

/**
 * Created by hidenori091985 on 2018/03/03.
 */
class RequestCode {
    companion object{
        private const val code = 1
        fun request_code(): Int {
            return code
        }
    }
}