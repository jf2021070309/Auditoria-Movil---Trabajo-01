package com.amazon.aps.iva.xw;

import android.view.View;
/* compiled from: ButterKnife.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Object, com.amazon.aps.iva.fc0.l<?>, View> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<Object, Integer, View> h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i, com.amazon.aps.iva.xb0.p pVar) {
        super(2);
        this.h = pVar;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final View invoke(Object obj, com.amazon.aps.iva.fc0.l<?> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "<anonymous parameter 1>");
        return this.h.invoke(obj, Integer.valueOf(this.i));
    }
}
