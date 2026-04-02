package com.amazon.aps.iva.h10;

import com.amazon.aps.iva.d10.v;
import com.amazon.aps.iva.d10.w;
import com.amazon.aps.iva.h10.c;
/* compiled from: DownloadsEmptyStateInteractor.kt */
/* loaded from: classes2.dex */
public final class e implements d {
    public final com.amazon.aps.iva.xb0.a<Boolean> a;
    public final com.amazon.aps.iva.xb0.a<Boolean> b;
    public final boolean c;

    public e(v vVar, boolean z, w wVar) {
        this.a = vVar;
        this.b = wVar;
        this.c = z;
    }

    @Override // com.amazon.aps.iva.h10.d
    public final c a() {
        boolean z = this.c;
        com.amazon.aps.iva.xb0.a<Boolean> aVar = this.b;
        if (z) {
            if (aVar.invoke().booleanValue()) {
                return c.C0316c.f;
            }
            return c.d.f;
        } else if (aVar.invoke().booleanValue()) {
            return c.b.f;
        } else {
            if (this.a.invoke().booleanValue()) {
                return c.e.f;
            }
            return c.a.f;
        }
    }
}
