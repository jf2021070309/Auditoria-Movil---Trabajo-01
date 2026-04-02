package com.amazon.aps.iva.y30;

import android.content.Context;
/* compiled from: PreferenceNameProvider.kt */
/* loaded from: classes2.dex */
public final class e implements d {
    public final Context a;

    public e(Context context) {
        this.a = context;
    }

    @Override // com.amazon.aps.iva.y30.d
    public final String a(c cVar) {
        String string = this.a.getString(cVar.getPrefNameResId());
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(preferenceHeader.prefNameResId)");
        return string;
    }
}
