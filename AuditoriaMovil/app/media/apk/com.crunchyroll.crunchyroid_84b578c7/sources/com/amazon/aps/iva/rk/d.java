package com.amazon.aps.iva.rk;

import com.amazon.aps.iva.fj.f;
import com.amazon.aps.iva.fj.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
/* compiled from: PlayerEngine.kt */
/* loaded from: classes.dex */
public final class d {
    public final boolean a = true;
    public final ArrayList b = new ArrayList();

    public final <TBuilder extends g> void a(f<TBuilder> fVar, l<? super TBuilder, q> lVar) {
        j.f(lVar, "configure");
        fVar.d(lVar);
        ArrayList arrayList = this.b;
        if (arrayList.contains(fVar)) {
            return;
        }
        arrayList.add(fVar);
    }
}
