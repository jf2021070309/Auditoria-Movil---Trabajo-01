package com.amazon.aps.iva.yw;

import androidx.fragment.app.Fragment;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class c0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Fragment, com.amazon.aps.iva.m50.a> {
    public final /* synthetic */ d0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var) {
        super(1);
        this.h = d0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.m50.a invoke(Fragment fragment) {
        Fragment fragment2 = fragment;
        com.amazon.aps.iva.yb0.j.f(fragment2, "fragment");
        return new b0(this.h, fragment2);
    }
}
