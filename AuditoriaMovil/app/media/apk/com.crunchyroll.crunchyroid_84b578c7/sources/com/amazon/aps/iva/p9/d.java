package com.amazon.aps.iva.p9;

import android.content.Context;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.q9.c;
import com.amazon.aps.iva.q9.e;
import com.amazon.aps.iva.q9.f;
import com.amazon.aps.iva.q9.g;
import com.amazon.aps.iva.q9.h;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: WorkConstraintsTracker.java */
/* loaded from: classes.dex */
public final class d implements c.a {
    public static final /* synthetic */ int d = 0;
    public final c a;
    public final com.amazon.aps.iva.q9.c<?>[] b;
    public final Object c;

    static {
        m.e("WorkConstraintsTracker");
    }

    public d(Context context, com.amazon.aps.iva.w9.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = cVar;
        this.b = new com.amazon.aps.iva.q9.c[]{new com.amazon.aps.iva.q9.a(applicationContext, aVar), new com.amazon.aps.iva.q9.b(applicationContext, aVar), new h(applicationContext, aVar), new com.amazon.aps.iva.q9.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.c = new Object();
    }

    public final boolean a(String str) {
        com.amazon.aps.iva.q9.c<?>[] cVarArr;
        boolean z;
        synchronized (this.c) {
            for (com.amazon.aps.iva.q9.c<?> cVar : this.b) {
                Object obj = cVar.b;
                if (obj != null && cVar.c(obj) && cVar.a.contains(str)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    m c = m.c();
                    String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName());
                    c.a(new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public final void b(Collection collection) {
        com.amazon.aps.iva.q9.c<?>[] cVarArr;
        com.amazon.aps.iva.q9.c<?>[] cVarArr2;
        synchronized (this.c) {
            for (com.amazon.aps.iva.q9.c<?> cVar : this.b) {
                if (cVar.d != null) {
                    cVar.d = null;
                    cVar.e(null, cVar.b);
                }
            }
            for (com.amazon.aps.iva.q9.c<?> cVar2 : this.b) {
                cVar2.d(collection);
            }
            for (com.amazon.aps.iva.q9.c<?> cVar3 : this.b) {
                if (cVar3.d != this) {
                    cVar3.d = this;
                    cVar3.e(this, cVar3.b);
                }
            }
        }
    }

    public final void c() {
        com.amazon.aps.iva.q9.c<?>[] cVarArr;
        synchronized (this.c) {
            for (com.amazon.aps.iva.q9.c<?> cVar : this.b) {
                ArrayList arrayList = cVar.a;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    com.amazon.aps.iva.r9.d<?> dVar = cVar.c;
                    synchronized (dVar.c) {
                        if (dVar.d.remove(cVar) && dVar.d.isEmpty()) {
                            dVar.d();
                        }
                    }
                }
            }
        }
    }
}
