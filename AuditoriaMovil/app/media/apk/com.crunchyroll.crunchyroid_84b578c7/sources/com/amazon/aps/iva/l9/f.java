package com.amazon.aps.iva.l9;

import androidx.work.impl.WorkDatabase;
import com.amazon.aps.iva.t9.p;
import com.amazon.aps.iva.t9.q;
import com.amazon.aps.iva.t9.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: Schedulers.java */
/* loaded from: classes.dex */
public final class f {
    public static final /* synthetic */ int a = 0;

    static {
        com.amazon.aps.iva.k9.m.e("Schedulers");
    }

    public static void a(androidx.work.a aVar, WorkDatabase workDatabase, List<e> list) {
        if (list != null && list.size() != 0) {
            q n = workDatabase.n();
            workDatabase.c();
            try {
                r rVar = (r) n;
                ArrayList c = rVar.c(aVar.h);
                ArrayList b = rVar.b();
                if (c.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        rVar.k(currentTimeMillis, ((p) it.next()).a);
                    }
                }
                workDatabase.h();
                workDatabase.f();
                if (c.size() > 0) {
                    p[] pVarArr = (p[]) c.toArray(new p[c.size()]);
                    for (e eVar : list) {
                        if (eVar.d()) {
                            eVar.e(pVarArr);
                        }
                    }
                }
                if (b.size() > 0) {
                    p[] pVarArr2 = (p[]) b.toArray(new p[b.size()]);
                    for (e eVar2 : list) {
                        if (!eVar2.d()) {
                            eVar2.e(pVarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }
}
