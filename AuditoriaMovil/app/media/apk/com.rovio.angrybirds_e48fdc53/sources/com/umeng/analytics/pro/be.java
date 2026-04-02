package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import org.repackage.com.miui.deviceid.IdentifierManager;
/* compiled from: XiaomiDeviceIdSupplier.java */
/* loaded from: classes3.dex */
class be implements at {
    @Override // com.umeng.analytics.pro.at
    public String a(Context context) {
        if (context == null) {
        }
        String str = null;
        try {
            if (!IdentifierManager.a()) {
                UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            } else {
                str = IdentifierManager.b(context);
            }
        } catch (Exception e) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
        }
        return str;
    }
}
