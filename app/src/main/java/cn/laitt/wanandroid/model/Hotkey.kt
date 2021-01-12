package cn.laitt.wanandroid.model

import com.emcrp.network.beans.BaseResponse

class Hotkey : BaseResponse() {
    /**
     * data : [{"id":6,"link":"","name":"面试","order":1,"visible":1},{"id":9,"link":"","name":"Studio3","order":1,"visible":1},{"id":5,"link":"","name":"动画","order":2,"visible":1},{"id":1,"link":"","name":"自定义View","order":3,"visible":1},{"id":2,"link":"","name":"性能优化 速度","order":4,"visible":1},{"id":3,"link":"","name":"gradle","order":5,"visible":1},{"id":4,"link":"","name":"Camera 相机","order":6,"visible":1},{"id":7,"link":"","name":"代码混淆 安全","order":7,"visible":1},{"id":8,"link":"","name":"逆向 加固","order":8,"visible":1}]
     * errorCode : 0
     * errorMsg :
     */
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * id : 6
         * link :
         * name : 面试
         * order : 1
         * visible : 1
         */
        var id = 0
        var link: String? = null
        var name: String? = null
        var order = 0
        var visible = 0
    }
}