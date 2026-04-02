package com.kwad.sdk.a.a;

import android.text.TextUtils;
import com.kwad.sdk.core.response.model.AdInfo;
/* loaded from: classes.dex */
public final class d {
    public static String A(AdInfo adInfo) {
        return com.kwad.sdk.core.config.d.zT().replace("[appname]", adInfo.adBaseInfo.appName).replace("[appsize]", com.kwad.components.core.t.e.a(adInfo.adBaseInfo.packageSize, true)).replace("[appver]", adInfo.adBaseInfo.appVersion);
    }

    public static String ye() {
        String zU = com.kwad.sdk.core.config.d.zU();
        return TextUtils.isEmpty(zU) ? "安装" : zU;
    }

    public static String yf() {
        String zV = com.kwad.sdk.core.config.d.zV();
        return TextUtils.isEmpty(zV) ? "取消" : zV;
    }
}
