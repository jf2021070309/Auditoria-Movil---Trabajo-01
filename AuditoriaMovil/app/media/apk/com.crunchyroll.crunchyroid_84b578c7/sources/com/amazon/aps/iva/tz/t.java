package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.j8.f;
import java.util.ArrayList;
/* compiled from: BrowseAllNewestDataSource.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<v0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ r h;
    public final /* synthetic */ f.c<Integer, com.amazon.aps.iva.uz.h> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r rVar, f.d dVar) {
        super(1);
        this.h = rVar;
        this.i = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(v0 v0Var) {
        v0 v0Var2 = v0Var;
        com.amazon.aps.iva.yb0.j.f(v0Var2, "browsePanelModel");
        r rVar = this.h;
        ArrayList a = rVar.j.a(v0Var2.a);
        int size = a.size();
        int i = v0Var2.b;
        if (i >= size) {
            size = i;
        }
        rVar.l.invoke(0, a);
        boolean z = !a.isEmpty();
        f.c<Integer, com.amazon.aps.iva.uz.h> cVar = this.i;
        if (z) {
            if (a.size() < 20) {
                cVar.a(a, size, null);
            } else {
                cVar.a(a, size, 1);
            }
        } else {
            cVar.b(com.amazon.aps.iva.lb0.z.b, null, null);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
