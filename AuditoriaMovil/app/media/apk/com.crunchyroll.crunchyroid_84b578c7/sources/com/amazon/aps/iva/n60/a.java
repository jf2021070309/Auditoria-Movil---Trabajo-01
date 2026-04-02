package com.amazon.aps.iva.n60;

import com.amazon.aps.iva.t50.c;
import com.amazon.aps.iva.x50.h;
import com.amazon.aps.iva.x50.i;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ScreenReloadDebouncer.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<Long, h> {
    public static final a h = new a();

    public a() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final h invoke(Long l) {
        return new i(l.longValue(), c.b.a);
    }
}
