package com.amazon.aps.iva.i20;

import com.amazon.aps.iva.js.i;
import com.amazon.aps.iva.js.j0;
import com.amazon.aps.iva.js.q;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CrPlusSubscriptionAnalytics.kt */
/* loaded from: classes2.dex */
public interface e {

    /* compiled from: CrPlusSubscriptionAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static f a(com.amazon.aps.iva.ls.a aVar) {
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.fs.d dVar = new com.amazon.aps.iva.fs.d();
            j.f(aVar, "screen");
            return new f(aVar, null, dVar);
        }
    }

    /* compiled from: CrPlusSubscriptionAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public static /* synthetic */ void b(e eVar, String str, String str2, i iVar, q qVar, com.amazon.aps.iva.ks.j jVar, int i) {
            j0 j0Var;
            i iVar2;
            q qVar2;
            com.amazon.aps.iva.ks.j jVar2;
            if ((i & 4) != 0) {
                j0Var = j0.UPSELL;
            } else {
                j0Var = null;
            }
            if ((i & 8) != 0) {
                iVar2 = null;
            } else {
                iVar2 = iVar;
            }
            if ((i & 16) != 0) {
                qVar2 = null;
            } else {
                qVar2 = qVar;
            }
            if ((i & 32) != 0) {
                jVar2 = null;
            } else {
                jVar2 = jVar;
            }
            eVar.c(str, str2, j0Var, iVar2, qVar2, jVar2);
        }
    }

    void a(com.amazon.aps.iva.fs.b bVar, String str, String str2, com.amazon.aps.iva.js.f fVar, i iVar, q qVar, com.amazon.aps.iva.ks.j jVar);

    void b(String str, String str2, j0 j0Var, i iVar, q qVar, com.amazon.aps.iva.ks.j jVar);

    void c(String str, String str2, j0 j0Var, i iVar, q qVar, com.amazon.aps.iva.ks.j jVar);

    void d(Throwable th);

    void e();

    void f(com.amazon.aps.iva.fs.b bVar, String str, String str2);

    void g(Throwable th);
}
