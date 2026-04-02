package com.amazon.aps.iva.a40;

import com.amazon.aps.iva.a40.a;
import com.amazon.aps.iva.kb0.q;
/* compiled from: ChangePasswordFragment.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(0);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        a.C0101a c0101a = a.j;
        a aVar = this.h;
        ((f) aVar.h.getValue()).U3(aVar.di().getPassword(), aVar.fi().getPassword());
        return q.a;
    }
}
