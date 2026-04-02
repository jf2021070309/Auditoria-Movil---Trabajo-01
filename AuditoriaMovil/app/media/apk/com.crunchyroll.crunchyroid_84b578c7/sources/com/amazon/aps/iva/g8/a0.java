package com.amazon.aps.iva.g8;

import android.net.Uri;
/* compiled from: NavDeepLink.kt */
/* loaded from: classes.dex */
public final class a0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public final /* synthetic */ u h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(u uVar) {
        super(0);
        this.h = uVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        boolean z;
        String str = this.h.a;
        if (str != null && Uri.parse(str).getQuery() != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
