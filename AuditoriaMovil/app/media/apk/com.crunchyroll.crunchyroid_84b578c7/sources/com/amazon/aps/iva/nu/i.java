package com.amazon.aps.iva.nu;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CommentsTotalCountViewModel.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.ez.b implements g {
    public final com.amazon.aps.iva.qu.a b;
    public final v<com.amazon.aps.iva.ez.g<Integer>> c;

    public i(com.amazon.aps.iva.qu.b bVar) {
        super(bVar);
        this.b = bVar;
        this.c = new v<>();
    }

    @Override // com.amazon.aps.iva.nu.f
    public final void D6() {
        Integer num;
        g.c<Integer> a;
        v<com.amazon.aps.iva.ez.g<Integer>> vVar = this.c;
        com.amazon.aps.iva.ez.g<Integer> d = vVar.d();
        if (d != null && (a = d.a()) != null) {
            num = Integer.valueOf(a.a.intValue() + 1);
        } else {
            num = null;
        }
        if (num != null) {
            vVar.k(new g.c(num, null));
        } else {
            vVar.k(new g.c(1, null));
        }
    }

    @Override // com.amazon.aps.iva.nu.g
    public final void K2(String str) {
        j.f(str, "mediaId");
        com.amazon.aps.iva.ez.h.c(this.c, null);
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new h(this, str, null), 3);
    }

    @Override // com.amazon.aps.iva.nu.g
    public final v M7() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.nu.f
    public final void Z5() {
        g.c<Integer> a;
        v<com.amazon.aps.iva.ez.g<Integer>> vVar = this.c;
        com.amazon.aps.iva.ez.g<Integer> d = vVar.d();
        if (d != null && (a = d.a()) != null) {
            vVar.k(new g.c(Integer.valueOf(a.a.intValue() - 1), null));
        }
    }

    @Override // com.amazon.aps.iva.nu.g
    public final void l6(String str) {
        j.f(str, "mediaId");
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new h(this, str, null), 3);
    }
}
