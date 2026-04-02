package com.amazon.aps.iva.mu;

import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.yb0.j;
import java.util.HashMap;
/* compiled from: CommentsVoteViewModel.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.ez.b implements f {
    public final com.amazon.aps.iva.wt.d b;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<x>>> c;
    public final HashMap<String, Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.amazon.aps.iva.wt.f fVar) {
        super(fVar);
        j.f(fVar, "interactor");
        this.b = fVar;
        this.c = new v<>();
        this.d = new HashMap<>();
    }

    public static x N8(x xVar) {
        int i;
        boolean z = xVar.h;
        boolean z2 = !z;
        int i2 = xVar.g;
        if (!z) {
            i = i2 + 1;
        } else {
            i = i2 - 1;
        }
        return x.a(xVar, i, z2, 0, false, false, false, false, false, false, false, 262047);
    }

    @Override // com.amazon.aps.iva.mu.f
    public final v D0() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.mu.f
    public final void J4(x xVar) {
        j.f(xVar, "model");
        this.c.k(new com.amazon.aps.iva.ez.d<>(new g.c(N8(xVar), null)));
        HashMap<String, Boolean> hashMap = this.d;
        String str = xVar.b;
        boolean containsKey = hashMap.containsKey(str);
        boolean z = xVar.h;
        if (containsKey) {
            if (!j.a(hashMap.get(str), Boolean.valueOf(z))) {
                hashMap.put(str, Boolean.valueOf(z));
                return;
            }
            return;
        }
        O8(xVar, z);
    }

    public final void O8(x xVar, boolean z) {
        x N8 = N8(xVar);
        String str = xVar.b;
        this.d.put(str, Boolean.valueOf(z));
        i.d(w.D(this), null, null, new g(z, this, str, xVar, N8, null), 3);
    }
}
