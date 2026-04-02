package com.umeng.analytics.pro;

import android.content.Context;
import org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId;
/* compiled from: LenovoDeviceIdSupplier.java */
/* loaded from: classes3.dex */
public class ay implements at {
    private static final int a = 1;
    private OpenDeviceId b;
    private boolean c = false;
    private boolean d = false;

    @Override // com.umeng.analytics.pro.at
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.c) {
            OpenDeviceId openDeviceId = new OpenDeviceId();
            this.b = openDeviceId;
            this.d = openDeviceId.a(context, (OpenDeviceId.CallBack<String>) null) == 1;
            this.c = true;
        }
        bf.a("getOAID", "isSupported", Boolean.valueOf(this.d));
        if (!this.d || !this.b.c()) {
            return null;
        }
        return this.b.a();
    }
}
