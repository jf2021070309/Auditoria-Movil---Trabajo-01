package com.amazon.aps.iva.wf;

import com.amazon.aps.iva.wy.h;
import com.amazon.aps.iva.wy.j;
/* compiled from: ContentUnavailableLayoutPresenter.kt */
/* loaded from: classes.dex */
public final class e extends com.amazon.aps.iva.wy.b<h> {
    public final b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, c cVar) {
        super(hVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(hVar, "view");
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.c();
    }
}
