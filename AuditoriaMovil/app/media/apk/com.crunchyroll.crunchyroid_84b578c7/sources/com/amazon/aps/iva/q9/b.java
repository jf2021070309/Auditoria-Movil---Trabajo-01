package com.amazon.aps.iva.q9;

import android.content.Context;
import com.amazon.aps.iva.t9.p;
/* compiled from: BatteryNotLowController.java */
/* loaded from: classes.dex */
public final class b extends c<Boolean> {
    public b(Context context, com.amazon.aps.iva.w9.a aVar) {
        super(com.amazon.aps.iva.r9.g.a(context, aVar).b);
    }

    @Override // com.amazon.aps.iva.q9.c
    public final boolean b(p pVar) {
        return pVar.j.d;
    }

    @Override // com.amazon.aps.iva.q9.c
    public final boolean c(Boolean bool) {
        return !bool.booleanValue();
    }
}
