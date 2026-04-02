package com.amazon.aps.iva.h2;

import android.os.Build;
/* compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
/* loaded from: classes.dex */
public final class b0 {
    public final e0 a;

    public b0() {
        e0 eVar;
        if (Build.VERSION.SDK_INT >= 28) {
            eVar = new com.amazon.aps.iva.e.z();
        } else {
            eVar = new com.amazon.aps.iva.bo.e();
        }
        this.a = eVar;
    }
}
