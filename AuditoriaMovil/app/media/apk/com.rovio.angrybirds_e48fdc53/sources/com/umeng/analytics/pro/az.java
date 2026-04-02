package com.umeng.analytics.pro;

import android.content.Context;
import org.repackage.com.meizu.flyme.openidsdk.OpenIdHelper;
/* compiled from: MeizuDeviceIdSupplier.java */
/* loaded from: classes3.dex */
class az implements at {
    @Override // com.umeng.analytics.pro.at
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean a = OpenIdHelper.a();
        bf.a("getOAID", "isSupported", Boolean.valueOf(a));
        if (!a) {
            return null;
        }
        return OpenIdHelper.b(context);
    }
}
