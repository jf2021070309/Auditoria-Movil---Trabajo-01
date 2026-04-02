package com.amazon.aps.iva.nw;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.se0.m0;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: RenewContentMonitor.kt */
/* loaded from: classes2.dex */
public final class f implements e {
    public final LinkedHashMap a = new LinkedHashMap();

    /* compiled from: RenewContentMonitor.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
        public final /* synthetic */ String i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, q> j;
        public final /* synthetic */ m0<com.amazon.aps.iva.kb0.k<Object>> k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, com.amazon.aps.iva.xb0.l<? super Throwable, q> lVar, m0<? extends com.amazon.aps.iva.kb0.k<? extends Object>> m0Var) {
            super(1);
            this.i = str;
            this.j = lVar;
            this.k = m0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Throwable th) {
            Throwable th2 = th;
            f.this.a.remove(this.i);
            if (th2 == null) {
                m0<com.amazon.aps.iva.kb0.k<Object>> m0Var = this.k;
                Throwable m = m0Var.m();
                if (m == null) {
                    th2 = com.amazon.aps.iva.kb0.k.a(m0Var.i().b);
                } else {
                    th2 = m;
                }
            }
            this.j.invoke(th2);
            return q.a;
        }
    }

    @Override // com.amazon.aps.iva.nw.e
    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((j1) entry.getValue()).a(null);
        }
        linkedHashMap.clear();
    }

    @Override // com.amazon.aps.iva.nw.e
    public final void b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        j1 j1Var = (j1) this.a.remove(str);
        if (j1Var != null) {
            j1Var.a(null);
        }
    }

    @Override // com.amazon.aps.iva.nw.e
    public final void c(String str, m0<? extends com.amazon.aps.iva.kb0.k<? extends Object>> m0Var, com.amazon.aps.iva.xb0.l<? super Throwable, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        com.amazon.aps.iva.yb0.j.f(m0Var, "job");
        this.a.put(str, m0Var);
        m0Var.s0(new a(str, lVar, m0Var));
    }

    @Override // com.amazon.aps.iva.nw.e
    public final boolean d(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        j1 j1Var = (j1) this.a.get(str);
        if (j1Var != null && j1Var.isActive()) {
            return true;
        }
        return false;
    }
}
