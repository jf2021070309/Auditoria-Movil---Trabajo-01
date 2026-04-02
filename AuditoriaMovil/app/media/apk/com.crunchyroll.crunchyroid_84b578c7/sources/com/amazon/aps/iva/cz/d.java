package com.amazon.aps.iva.cz;

import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashSet;
/* compiled from: PresenterRegister.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    public final o b;
    public final LinkedHashSet c;

    public d(o oVar) {
        j.f(oVar, "lifecycleOwner");
        this.b = oVar;
        this.c = new LinkedHashSet();
    }

    @Override // com.amazon.aps.iva.cz.c
    public final void a(k... kVarArr) {
        j.f(kVarArr, "presenters");
        t.e0(this.c, kVarArr);
        for (k kVar : kVarArr) {
            com.ellation.crunchyroll.mvp.lifecycle.a.a(kVar, this.b);
        }
    }

    @Override // com.amazon.aps.iva.cz.c
    public final LinkedHashSet b() {
        return this.c;
    }
}
