package com.amazon.aps.iva.fz;

import com.amazon.aps.iva.kb0.q;
/* compiled from: NotificationsCountMonitor.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar) {
        super(1);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Integer num) {
        this.h.a.i(Integer.valueOf(num.intValue()));
        return q.a;
    }
}
