package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import org.repackage.com.vivo.identifier.IdentifierManager;
/* compiled from: VivoDeviceIdSupplier.java */
/* loaded from: classes3.dex */
public class bd implements at {
    @Override // com.umeng.analytics.pro.at
    public String a(Context context) {
        if (context == null) {
        }
        String str = null;
        try {
            if (!IdentifierManager.a(context)) {
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
