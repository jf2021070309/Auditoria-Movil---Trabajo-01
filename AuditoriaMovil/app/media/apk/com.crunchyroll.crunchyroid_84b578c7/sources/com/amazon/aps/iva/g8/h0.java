package com.amazon.aps.iva.g8;

import android.os.Bundle;
/* compiled from: NavDestination.kt */
/* loaded from: classes.dex */
public final class h0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, Boolean> {
    public final /* synthetic */ Bundle h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Bundle bundle) {
        super(1);
        this.h = bundle;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(String str) {
        String str2 = str;
        com.amazon.aps.iva.yb0.j.f(str2, "key");
        return Boolean.valueOf(!this.h.containsKey(str2));
    }
}
