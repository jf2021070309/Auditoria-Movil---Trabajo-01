package com.kwad.sdk.core.network;
/* loaded from: classes.dex */
public final class f {
    public static f aoU = new f(-1, "请求超时事件");
    public static f aoV = new f(-2, "请求异常");
    public static f aoW = new f(-1000, "该业务组件未加载");
    public static f aoX = new f(40001, "网络错误");
    public static f aoY = new f(40002, "数据解析错误");
    public static f aoZ = new f(40003, "广告数据为空");
    public static f apa = new f(40004, "视频资源缓存失败");
    public static f apb = new f(40005, "网络超时");
    public static f apc = new f(40007, "图片下载失败");
    public static f apd = new f(40008, "广告场景不匹配");
    public static f ape = new f(40010, "activity场景不匹配");
    public static f apf = new f(40011, "sdk初始化失败");
    public static f apg = new f(100006, "更多视频请前往快手App查看");
    public static f aph = new f(100007, "复制链接失败，请稍后重试");
    public static f api = new f(100008, "内容有点敏感，不可以发送哦");
    public static f apj = new f(130001, "数据不存在");
    public static f apk = new f(0, "网络超时");
    public int errorCode;
    public String msg;

    private f(int i, String str) {
        this.errorCode = i;
        this.msg = str;
    }
}
