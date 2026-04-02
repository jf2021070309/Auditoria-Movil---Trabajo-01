package com.amazon.aps.iva.e;

import com.amazon.aps.iva.q2.r;
/* compiled from: OnBackPressedDispatcher.kt */
/* loaded from: classes.dex */
public final class u extends m {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<m, com.amazon.aps.iva.kb0.q> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r.b bVar, boolean z) {
        super(z);
        this.a = bVar;
    }

    @Override // com.amazon.aps.iva.e.m
    public final void handleOnBackPressed() {
        this.a.invoke(this);
    }
}
