package com.amazon.aps.iva.o0;

import android.os.Trace;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.y0.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: Recomposer.kt */
/* loaded from: classes.dex */
public final class m2 extends g0 {
    public static final com.amazon.aps.iva.ve0.v0 v;
    public static final AtomicReference<Boolean> w;
    public final com.amazon.aps.iva.o0.e a;
    public final Object b;
    public com.amazon.aps.iva.se0.j1 c;
    public Throwable d;
    public final ArrayList e;
    public com.amazon.aps.iva.p0.c<Object> f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public ArrayList l;
    public Set<o0> m;
    public com.amazon.aps.iva.se0.m<? super com.amazon.aps.iva.kb0.q> n;
    public boolean o;
    public b p;
    public boolean q;
    public final com.amazon.aps.iva.ve0.v0 r;
    public final com.amazon.aps.iva.se0.m1 s;
    public final com.amazon.aps.iva.ob0.g t;
    public final c u;

    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public b(Exception exc) {
        }
    }

    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    public final class c {
    }

    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    public enum d {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            com.amazon.aps.iva.se0.m<com.amazon.aps.iva.kb0.q> u;
            m2 m2Var = m2.this;
            synchronized (m2Var.b) {
                u = m2Var.u();
                if (((d) m2Var.r.getValue()).compareTo(d.ShuttingDown) <= 0) {
                    throw com.amazon.aps.iva.e.z.h("Recomposer shutdown; frame clock awaiter will never resume", m2Var.d);
                }
            }
            if (u != null) {
                u.resumeWith(com.amazon.aps.iva.kb0.q.a);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
            com.amazon.aps.iva.se0.m<? super com.amazon.aps.iva.kb0.q> mVar;
            com.amazon.aps.iva.se0.m<? super com.amazon.aps.iva.kb0.q> mVar2;
            Throwable th2 = th;
            CancellationException h = com.amazon.aps.iva.e.z.h("Recomposer effect job completed", th2);
            m2 m2Var = m2.this;
            synchronized (m2Var.b) {
                com.amazon.aps.iva.se0.j1 j1Var = m2Var.c;
                mVar = null;
                if (j1Var != null) {
                    m2Var.r.setValue(d.ShuttingDown);
                    if (!m2Var.o) {
                        j1Var.a(h);
                    } else {
                        mVar2 = m2Var.n;
                        if (mVar2 != null) {
                            m2Var.n = null;
                            j1Var.s0(new n2(m2Var, th2));
                            mVar = mVar2;
                        }
                    }
                    mVar2 = null;
                    m2Var.n = null;
                    j1Var.s0(new n2(m2Var, th2));
                    mVar = mVar2;
                } else {
                    m2Var.d = h;
                    m2Var.r.setValue(d.ShutDown);
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                }
            }
            if (mVar != null) {
                mVar.resumeWith(com.amazon.aps.iva.kb0.q.a);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Recomposer.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {526, 537}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.se0.g0, i1, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public List h;
        public List i;
        public List j;
        public Set k;
        public Set l;
        public int m;
        public /* synthetic */ i1 n;

        /* compiled from: Recomposer.kt */
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Long, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ m2 h;
            public final /* synthetic */ List<o0> i;
            public final /* synthetic */ List<m1> j;
            public final /* synthetic */ Set<o0> k;
            public final /* synthetic */ List<o0> l;
            public final /* synthetic */ Set<o0> m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m2 m2Var, List<o0> list, List<m1> list2, Set<o0> set, List<o0> list3, Set<o0> set2) {
                super(1);
                this.h = m2Var;
                this.i = list;
                this.j = list2;
                this.k = set;
                this.l = list3;
                this.m = set2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v13 */
            /* JADX WARN: Type inference failed for: r11v14, types: [int] */
            /* JADX WARN: Type inference failed for: r11v15 */
            /* JADX WARN: Type inference failed for: r11v16, types: [int] */
            /* JADX WARN: Type inference failed for: r13v0 */
            /* JADX WARN: Type inference failed for: r13v1, types: [int] */
            /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r15v0 */
            /* JADX WARN: Type inference failed for: r15v1, types: [int] */
            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(Long l) {
                boolean v;
                boolean z;
                long longValue = l.longValue();
                m2 m2Var = this.h;
                synchronized (m2Var.b) {
                    v = m2Var.v();
                }
                boolean z2 = false;
                if (v) {
                    m2 m2Var2 = this.h;
                    Trace.beginSection("Recomposer:animation");
                    try {
                        m2Var2.a.b(longValue);
                        synchronized (com.amazon.aps.iva.y0.m.c) {
                            com.amazon.aps.iva.p0.c<com.amazon.aps.iva.y0.h0> cVar = com.amazon.aps.iva.y0.m.j.get().h;
                            if (cVar != null && cVar.e()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            com.amazon.aps.iva.y0.m.a();
                        }
                        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                    } finally {
                    }
                }
                m2 m2Var3 = this.h;
                List<o0> list = this.i;
                List<m1> list2 = this.j;
                Set<o0> set = this.k;
                List<o0> list3 = this.l;
                Set<o0> set2 = this.m;
                Trace.beginSection("Recomposer:recompose");
                try {
                    m2.r(m2Var3);
                    synchronized (m2Var3.b) {
                        ArrayList arrayList = m2Var3.g;
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            list.add((o0) arrayList.get(i));
                        }
                        m2Var3.g.clear();
                        com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
                    }
                    com.amazon.aps.iva.p0.c<Object> cVar2 = new com.amazon.aps.iva.p0.c<>();
                    com.amazon.aps.iva.p0.c cVar3 = new com.amazon.aps.iva.p0.c();
                    while (true) {
                        if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                            break;
                        }
                        try {
                            int size2 = list.size();
                            for (int i2 = z2; i2 < size2; i2++) {
                                o0 o0Var = list.get(i2);
                                cVar3.add(o0Var);
                                o0 q = m2.q(m2Var3, o0Var, cVar2);
                                if (q != null) {
                                    list3.add(q);
                                }
                            }
                            list.clear();
                            if (cVar2.e()) {
                                synchronized (m2Var3.b) {
                                    ?? r13 = m2Var3.e;
                                    int size3 = r13.size();
                                    for (int i3 = z2; i3 < size3; i3++) {
                                        o0 o0Var2 = (o0) r13.get(i3);
                                        if (!cVar3.contains(o0Var2) && o0Var2.g(cVar2)) {
                                            list.add(o0Var2);
                                        }
                                    }
                                    com.amazon.aps.iva.kb0.q qVar3 = com.amazon.aps.iva.kb0.q.a;
                                }
                            }
                            if (list.isEmpty()) {
                                try {
                                    g.i(list2, m2Var3);
                                    while (!list2.isEmpty()) {
                                        com.amazon.aps.iva.lb0.t.d0(set, m2Var3.z(list2, cVar2));
                                        g.i(list2, m2Var3);
                                    }
                                } catch (Exception e) {
                                    m2.B(m2Var3, e, true, 2);
                                    g.h(list, list2, list3, set, set2);
                                }
                            }
                            z2 = false;
                        } catch (Exception e2) {
                            m2.B(m2Var3, e2, true, 2);
                            g.h(list, list2, list3, set, set2);
                            list.clear();
                        }
                    }
                    if (!list3.isEmpty()) {
                        try {
                            int size4 = list3.size();
                            for (int i4 = z2; i4 < size4; i4++) {
                                set2.add(list3.get(i4));
                            }
                            int size5 = list3.size();
                            for (int i5 = z2; i5 < size5; i5++) {
                                list3.get(i5).n();
                            }
                            list3.clear();
                        } catch (Exception e3) {
                            m2.B(m2Var3, e3, z2, 6);
                            g.h(list, list2, list3, set, set2);
                            list3.clear();
                        }
                    }
                    if (!set.isEmpty()) {
                        try {
                            com.amazon.aps.iva.lb0.t.d0(set2, set);
                            for (o0 o0Var3 : set) {
                                o0Var3.e();
                            }
                            set.clear();
                        } catch (Exception e4) {
                            m2.B(m2Var3, e4, z2, 6);
                            g.h(list, list2, list3, set, set2);
                            set.clear();
                        }
                    }
                    if (!set2.isEmpty()) {
                        try {
                            for (o0 o0Var4 : set2) {
                                o0Var4.s();
                            }
                            set2.clear();
                        } catch (Exception e5) {
                            m2.B(m2Var3, e5, z2, 6);
                            g.h(list, list2, list3, set, set2);
                            set2.clear();
                        }
                    }
                    synchronized (m2Var3.b) {
                        m2Var3.u();
                    }
                    com.amazon.aps.iva.y0.m.k().m();
                    m2Var3.m = null;
                    com.amazon.aps.iva.kb0.q qVar4 = com.amazon.aps.iva.kb0.q.a;
                    Trace.endSection();
                    return com.amazon.aps.iva.kb0.q.a;
                } finally {
                }
            }
        }

        public g(com.amazon.aps.iva.ob0.d<? super g> dVar) {
            super(3, dVar);
        }

        public static final void h(List list, List list2, List list3, Set set, Set set2) {
            list.clear();
            list2.clear();
            list3.clear();
            set.clear();
            set2.clear();
        }

        public static final void i(List list, m2 m2Var) {
            list.clear();
            synchronized (m2Var.b) {
                ArrayList arrayList = m2Var.i;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((m1) arrayList.get(i));
                }
                m2Var.i.clear();
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, i1 i1Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            g gVar = new g(dVar);
            gVar.n = i1Var;
            return gVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r14v25, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r6v23, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r6v25, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r9v9, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0153 -> B:58:0x0159). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01e7 -> B:79:0x01f0). Please submit an issue!!! */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 509
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.m2.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a();
        v = com.amazon.aps.iva.ab.x.e(com.amazon.aps.iva.t0.b.e);
        w = new AtomicReference<>(Boolean.FALSE);
    }

    public m2(com.amazon.aps.iva.ob0.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "effectCoroutineContext");
        com.amazon.aps.iva.o0.e eVar = new com.amazon.aps.iva.o0.e(new e());
        this.a = eVar;
        this.b = new Object();
        this.e = new ArrayList();
        this.f = new com.amazon.aps.iva.p0.c<>();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.r = com.amazon.aps.iva.ab.x.e(d.Inactive);
        com.amazon.aps.iva.se0.m1 m1Var = new com.amazon.aps.iva.se0.m1((com.amazon.aps.iva.se0.j1) gVar.get(j1.b.b));
        m1Var.s0(new f());
        this.s = m1Var;
        this.t = gVar.plus(eVar).plus(m1Var);
        this.u = new c();
    }

    public static /* synthetic */ void B(m2 m2Var, Exception exc, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        m2Var.A(exc, null, z);
    }

    public static final o0 q(m2 m2Var, o0 o0Var, com.amazon.aps.iva.p0.c cVar) {
        boolean z;
        com.amazon.aps.iva.y0.b bVar;
        com.amazon.aps.iva.y0.b A;
        if (o0Var.o() || o0Var.f()) {
            return null;
        }
        Set<o0> set = m2Var.m;
        boolean z2 = true;
        if (set != null && set.contains(o0Var)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        q2 q2Var = new q2(o0Var);
        s2 s2Var = new s2(o0Var, cVar);
        com.amazon.aps.iva.y0.h k = com.amazon.aps.iva.y0.m.k();
        if (k instanceof com.amazon.aps.iva.y0.b) {
            bVar = (com.amazon.aps.iva.y0.b) k;
        } else {
            bVar = null;
        }
        if (bVar != null && (A = bVar.A(q2Var, s2Var)) != null) {
            try {
                com.amazon.aps.iva.y0.h j = A.j();
                if (!cVar.e()) {
                    z2 = false;
                }
                if (z2) {
                    o0Var.q(new p2(o0Var, cVar));
                }
                boolean i = o0Var.i();
                com.amazon.aps.iva.y0.h.p(j);
                if (!i) {
                    o0Var = null;
                }
                return o0Var;
            } finally {
                s(A);
            }
        }
        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
    }

    public static final boolean r(m2 m2Var) {
        boolean z;
        ArrayList Z0;
        synchronized (m2Var.b) {
            z = false;
            if (m2Var.f.isEmpty()) {
                z = ((!m2Var.g.isEmpty()) || m2Var.v()) ? true : true;
            } else {
                com.amazon.aps.iva.p0.c<Object> cVar = m2Var.f;
                m2Var.f = new com.amazon.aps.iva.p0.c<>();
                synchronized (m2Var.b) {
                    Z0 = com.amazon.aps.iva.lb0.x.Z0(m2Var.e);
                }
                try {
                    int size = Z0.size();
                    for (int i = 0; i < size; i++) {
                        ((o0) Z0.get(i)).b(cVar);
                        if (((d) m2Var.r.getValue()).compareTo(d.ShuttingDown) <= 0) {
                            break;
                        }
                    }
                    m2Var.f = new com.amazon.aps.iva.p0.c<>();
                    synchronized (m2Var.b) {
                        if (m2Var.u() == null) {
                            z = ((!m2Var.g.isEmpty()) || m2Var.v()) ? true : true;
                        } else {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                        }
                    }
                } catch (Throwable th) {
                    synchronized (m2Var.b) {
                        m2Var.f.b(cVar);
                        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                        throw th;
                    }
                }
            }
        }
        return z;
    }

    public static void s(com.amazon.aps.iva.y0.b bVar) {
        try {
            if (!(bVar.v() instanceof i.a)) {
                return;
            }
            throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
        } finally {
            bVar.c();
        }
    }

    public static final void y(ArrayList arrayList, m2 m2Var, o0 o0Var) {
        arrayList.clear();
        synchronized (m2Var.b) {
            Iterator it = m2Var.i.iterator();
            while (it.hasNext()) {
                m1 m1Var = (m1) it.next();
                if (com.amazon.aps.iva.yb0.j.a(m1Var.c, o0Var)) {
                    arrayList.add(m1Var);
                    it.remove();
                }
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    public final void A(Exception exc, o0 o0Var, boolean z) {
        Boolean bool = w.get();
        com.amazon.aps.iva.yb0.j.e(bool, "_hotReloadEnabled.get()");
        if (bool.booleanValue() && !(exc instanceof h)) {
            synchronized (this.b) {
                int i = com.amazon.aps.iva.o0.b.a;
                this.h.clear();
                this.g.clear();
                this.f = new com.amazon.aps.iva.p0.c<>();
                this.i.clear();
                this.j.clear();
                this.k.clear();
                this.p = new b(exc);
                if (o0Var != null) {
                    ArrayList arrayList = this.l;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.l = arrayList;
                    }
                    if (!arrayList.contains(o0Var)) {
                        arrayList.add(o0Var);
                    }
                    this.e.remove(o0Var);
                }
                u();
            }
            return;
        }
        throw exc;
    }

    public final Object C(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object g2 = com.amazon.aps.iva.se0.i.g(dVar, this.a, new r2(this, new g(null), j1.a(dVar.getContext()), null));
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        if (g2 != aVar) {
            g2 = com.amazon.aps.iva.kb0.q.a;
        }
        if (g2 == aVar) {
            return g2;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.o0.g0
    public final void a(o0 o0Var, com.amazon.aps.iva.v0.a aVar) {
        com.amazon.aps.iva.y0.b A;
        com.amazon.aps.iva.yb0.j.f(o0Var, "composition");
        boolean o = o0Var.o();
        try {
            q2 q2Var = new q2(o0Var);
            com.amazon.aps.iva.y0.b bVar = null;
            s2 s2Var = new s2(o0Var, null);
            com.amazon.aps.iva.y0.h k = com.amazon.aps.iva.y0.m.k();
            if (k instanceof com.amazon.aps.iva.y0.b) {
                bVar = (com.amazon.aps.iva.y0.b) k;
            }
            if (bVar != null && (A = bVar.A(q2Var, s2Var)) != null) {
                com.amazon.aps.iva.y0.h j = A.j();
                o0Var.j(aVar);
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                com.amazon.aps.iva.y0.h.p(j);
                s(A);
                if (!o) {
                    com.amazon.aps.iva.y0.m.k().m();
                }
                synchronized (this.b) {
                    if (((d) this.r.getValue()).compareTo(d.ShuttingDown) > 0 && !this.e.contains(o0Var)) {
                        this.e.add(o0Var);
                    }
                }
                try {
                    x(o0Var);
                    try {
                        o0Var.n();
                        o0Var.e();
                        if (!o) {
                            com.amazon.aps.iva.y0.m.k().m();
                            return;
                        }
                        return;
                    } catch (Exception e2) {
                        B(this, e2, false, 6);
                        return;
                    }
                } catch (Exception e3) {
                    A(e3, o0Var, true);
                    return;
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        } catch (Exception e4) {
            A(e4, o0Var, true);
        }
    }

    @Override // com.amazon.aps.iva.o0.g0
    public final void b(m1 m1Var) {
        synchronized (this.b) {
            LinkedHashMap linkedHashMap = this.j;
            k1<Object> k1Var = m1Var.a;
            com.amazon.aps.iva.yb0.j.f(linkedHashMap, "<this>");
            Object obj = linkedHashMap.get(k1Var);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(k1Var, obj);
            }
            ((List) obj).add(m1Var);
        }
    }

    @Override // com.amazon.aps.iva.o0.g0
    public final boolean d() {
        return false;
    }

    @Override // com.amazon.aps.iva.o0.g0
    public final int f() {
        return 1000;
    }

    @Override // com.amazon.aps.iva.o0.g0
    public final com.amazon.aps.iva.ob0.g g() {
        return this.t;
    }

    @Override // com.amazon.aps.iva.o0.g0
    public final void h(o0 o0Var) {
        com.amazon.aps.iva.se0.m<com.amazon.aps.iva.kb0.q> mVar;
        com.amazon.aps.iva.yb0.j.f(o0Var, "composition");
        synchronized (this.b) {
            if (!this.g.contains(o0Var)) {
                this.g.add(o0Var);
                mVar = u();
            } else {
                mVar = null;
            }
        }
        if (mVar != null) {
            mVar.resumeWith(com.amazon.aps.iva.kb0.q.a);
        }
    }

    @Override // com.amazon.aps.iva.o0.g0
    public final void i(m1 m1Var, l1 l1Var) {
        synchronized (this.b) {
            this.k.put(m1Var, l1Var);
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    @Override // com.amazon.aps.iva.o0.g0
    public final l1 j(m1 m1Var) {
        l1 l1Var;
        com.amazon.aps.iva.yb0.j.f(m1Var, "reference");
        synchronized (this.b) {
            l1Var = (l1) this.k.remove(m1Var);
        }
        return l1Var;
    }

    @Override // com.amazon.aps.iva.o0.g0
    public final void m(o0 o0Var) {
        com.amazon.aps.iva.yb0.j.f(o0Var, "composition");
        synchronized (this.b) {
            Set set = this.m;
            if (set == null) {
                set = new LinkedHashSet();
                this.m = set;
            }
            set.add(o0Var);
        }
    }

    @Override // com.amazon.aps.iva.o0.g0
    public final void p(o0 o0Var) {
        com.amazon.aps.iva.yb0.j.f(o0Var, "composition");
        synchronized (this.b) {
            this.e.remove(o0Var);
            this.g.remove(o0Var);
            this.h.remove(o0Var);
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    public final void t() {
        synchronized (this.b) {
            if (((d) this.r.getValue()).compareTo(d.Idle) >= 0) {
                this.r.setValue(d.ShuttingDown);
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
        this.s.a(null);
    }

    public final com.amazon.aps.iva.se0.m<com.amazon.aps.iva.kb0.q> u() {
        d dVar;
        com.amazon.aps.iva.ve0.v0 v0Var = this.r;
        int compareTo = ((d) v0Var.getValue()).compareTo(d.ShuttingDown);
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = this.h;
        ArrayList arrayList3 = this.g;
        if (compareTo <= 0) {
            this.e.clear();
            this.f = new com.amazon.aps.iva.p0.c<>();
            arrayList3.clear();
            arrayList2.clear();
            arrayList.clear();
            this.l = null;
            com.amazon.aps.iva.se0.m<? super com.amazon.aps.iva.kb0.q> mVar = this.n;
            if (mVar != null) {
                mVar.J(null);
            }
            this.n = null;
            this.p = null;
            return null;
        }
        if (this.p != null) {
            dVar = d.Inactive;
        } else if (this.c == null) {
            this.f = new com.amazon.aps.iva.p0.c<>();
            arrayList3.clear();
            if (v()) {
                dVar = d.InactivePendingWork;
            } else {
                dVar = d.Inactive;
            }
        } else if (!(!arrayList3.isEmpty()) && !this.f.e() && !(!arrayList2.isEmpty()) && !(!arrayList.isEmpty()) && !v()) {
            dVar = d.Idle;
        } else {
            dVar = d.PendingWork;
        }
        v0Var.setValue(dVar);
        if (dVar != d.PendingWork) {
            return null;
        }
        com.amazon.aps.iva.se0.m mVar2 = this.n;
        this.n = null;
        return mVar2;
    }

    public final boolean v() {
        boolean z;
        if (!this.q) {
            com.amazon.aps.iva.o0.e eVar = this.a;
            synchronized (eVar.c) {
                z = !eVar.e.isEmpty();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean w() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (!this.f.e() && !(!this.g.isEmpty())) {
                if (!v()) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final void x(o0 o0Var) {
        synchronized (this.b) {
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (com.amazon.aps.iva.yb0.j.a(((m1) arrayList.get(i)).c, o0Var)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                return;
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            ArrayList arrayList2 = new ArrayList();
            y(arrayList2, this, o0Var);
            while (!arrayList2.isEmpty()) {
                z(arrayList2, null);
                y(arrayList2, this, o0Var);
            }
        }
    }

    public final List<o0> z(List<m1> list, com.amazon.aps.iva.p0.c<Object> cVar) {
        com.amazon.aps.iva.y0.b bVar;
        com.amazon.aps.iva.y0.b A;
        ArrayList arrayList;
        Object obj;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m1 m1Var = list.get(i);
            o0 o0Var = m1Var.c;
            Object obj2 = hashMap.get(o0Var);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(o0Var, obj2);
            }
            ((ArrayList) obj2).add(m1Var);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            o0 o0Var2 = (o0) entry.getKey();
            List list2 = (List) entry.getValue();
            e0.f(!o0Var2.o());
            q2 q2Var = new q2(o0Var2);
            s2 s2Var = new s2(o0Var2, cVar);
            com.amazon.aps.iva.y0.h k = com.amazon.aps.iva.y0.m.k();
            if (k instanceof com.amazon.aps.iva.y0.b) {
                bVar = (com.amazon.aps.iva.y0.b) k;
            } else {
                bVar = null;
            }
            if (bVar != null && (A = bVar.A(q2Var, s2Var)) != null) {
                try {
                    com.amazon.aps.iva.y0.h j = A.j();
                    synchronized (this.b) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            m1 m1Var2 = (m1) list2.get(i2);
                            LinkedHashMap linkedHashMap = this.j;
                            k1<Object> k1Var = m1Var2.a;
                            com.amazon.aps.iva.yb0.j.f(linkedHashMap, "<this>");
                            List list3 = (List) linkedHashMap.get(k1Var);
                            if (list3 != null) {
                                Object i0 = com.amazon.aps.iva.lb0.t.i0(list3);
                                if (list3.isEmpty()) {
                                    linkedHashMap.remove(k1Var);
                                }
                                obj = i0;
                            } else {
                                obj = null;
                            }
                            arrayList.add(new com.amazon.aps.iva.kb0.j(m1Var2, obj));
                        }
                    }
                    o0Var2.k(arrayList);
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                    com.amazon.aps.iva.y0.h.p(j);
                } finally {
                    s(A);
                }
            } else {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
        }
        return com.amazon.aps.iva.lb0.x.X0(hashMap.keySet());
    }

    @Override // com.amazon.aps.iva.o0.g0
    public final void k(Set<Object> set) {
    }
}
