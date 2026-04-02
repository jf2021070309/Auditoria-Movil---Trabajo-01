package com.kwad.sdk;

import com.qq.e.comm.constants.BiddingLossReason;
/* loaded from: classes.dex */
public final class f {
    public static final f ahf = new f(10000, "其他异常");
    public static final f ahg = new f(BiddingLossReason.OTHER, "初始化参数异常");
    public int code;
    public String msg;

    public f(int i, String str) {
        this.code = i;
        this.msg = str;
    }
}
