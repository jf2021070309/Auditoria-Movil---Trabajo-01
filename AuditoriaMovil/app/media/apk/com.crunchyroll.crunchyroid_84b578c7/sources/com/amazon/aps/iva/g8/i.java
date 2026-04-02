package com.amazon.aps.iva.g8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.g;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.g8.f;
import com.amazon.aps.iva.g8.g0;
import com.amazon.aps.iva.g8.r0;
import com.amazon.aps.iva.ne0.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: NavController.kt */
/* loaded from: classes.dex */
public class i {
    public final LinkedHashMap A;
    public int B;
    public final ArrayList C;
    public final com.amazon.aps.iva.ve0.l0 D;
    public final Context a;
    public final Activity b;
    public j0 c;
    public Bundle d;
    public Parcelable[] e;
    public boolean f;
    public final com.amazon.aps.iva.lb0.k<com.amazon.aps.iva.g8.f> g;
    public final com.amazon.aps.iva.ve0.v0 h;
    public final com.amazon.aps.iva.ve0.i0 i;
    public final com.amazon.aps.iva.ve0.v0 j;
    public final com.amazon.aps.iva.ve0.i0 k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;
    public final LinkedHashMap o;
    public com.amazon.aps.iva.i5.o p;
    public t q;
    public final CopyOnWriteArrayList<b> r;
    public g.b s;
    public final h t;
    public final f u;
    public final boolean v;
    public final t0 w;
    public final LinkedHashMap x;
    public com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.g8.f, com.amazon.aps.iva.kb0.q> y;
    public com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.g8.f, com.amazon.aps.iva.kb0.q> z;

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public final class a extends u0 {
        public final r0<? extends g0> g;
        public final /* synthetic */ i h;

        /* compiled from: NavController.kt */
        /* renamed from: com.amazon.aps.iva.g8.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0296a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ com.amazon.aps.iva.g8.f i;
            public final /* synthetic */ boolean j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0296a(com.amazon.aps.iva.g8.f fVar, boolean z) {
                super(0);
                this.i = fVar;
                this.j = z;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.kb0.q invoke() {
                a.super.c(this.i, this.j);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public a(i iVar, r0<? extends g0> r0Var) {
            com.amazon.aps.iva.yb0.j.f(r0Var, "navigator");
            this.h = iVar;
            this.g = r0Var;
        }

        @Override // com.amazon.aps.iva.g8.u0
        public final com.amazon.aps.iva.g8.f a(g0 g0Var, Bundle bundle) {
            i iVar = this.h;
            return f.a.a(iVar.a, g0Var, bundle, iVar.j(), iVar.q);
        }

        @Override // com.amazon.aps.iva.g8.u0
        public final void b(com.amazon.aps.iva.g8.f fVar) {
            boolean z;
            t tVar;
            com.amazon.aps.iva.yb0.j.f(fVar, "entry");
            i iVar = this.h;
            boolean a = com.amazon.aps.iva.yb0.j.a(iVar.A.get(fVar), Boolean.TRUE);
            super.b(fVar);
            iVar.A.remove(fVar);
            com.amazon.aps.iva.lb0.k<com.amazon.aps.iva.g8.f> kVar = iVar.g;
            boolean contains = kVar.contains(fVar);
            com.amazon.aps.iva.ve0.v0 v0Var = iVar.j;
            if (!contains) {
                iVar.t(fVar);
                if (fVar.i.c.isAtLeast(g.b.CREATED)) {
                    fVar.r(g.b.DESTROYED);
                }
                boolean z2 = kVar instanceof Collection;
                String str = fVar.g;
                if (!z2 || !kVar.isEmpty()) {
                    Iterator<com.amazon.aps.iva.g8.f> it = kVar.iterator();
                    while (it.hasNext()) {
                        if (com.amazon.aps.iva.yb0.j.a(it.next().g, str)) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z && !a && (tVar = iVar.q) != null) {
                    com.amazon.aps.iva.yb0.j.f(str, "backStackEntryId");
                    com.amazon.aps.iva.i5.g0 g0Var = (com.amazon.aps.iva.i5.g0) tVar.b.remove(str);
                    if (g0Var != null) {
                        g0Var.a();
                    }
                }
                iVar.u();
                v0Var.setValue(iVar.r());
            } else if (!this.d) {
                iVar.u();
                iVar.h.setValue(com.amazon.aps.iva.lb0.x.Z0(kVar));
                v0Var.setValue(iVar.r());
            }
        }

        @Override // com.amazon.aps.iva.g8.u0
        public final void c(com.amazon.aps.iva.g8.f fVar, boolean z) {
            com.amazon.aps.iva.yb0.j.f(fVar, "popUpTo");
            i iVar = this.h;
            r0 b = iVar.w.b(fVar.c.b);
            if (com.amazon.aps.iva.yb0.j.a(b, this.g)) {
                com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.g8.f, com.amazon.aps.iva.kb0.q> lVar = iVar.z;
                if (lVar != null) {
                    lVar.invoke(fVar);
                    super.c(fVar, z);
                    return;
                }
                C0296a c0296a = new C0296a(fVar, z);
                com.amazon.aps.iva.lb0.k<com.amazon.aps.iva.g8.f> kVar = iVar.g;
                int indexOf = kVar.indexOf(fVar);
                if (indexOf < 0) {
                    fVar.toString();
                    return;
                }
                int i = indexOf + 1;
                if (i != kVar.d) {
                    iVar.o(kVar.get(i).c.h, true, false);
                }
                i.q(iVar, fVar);
                c0296a.invoke();
                iVar.v();
                iVar.b();
                return;
            }
            Object obj = iVar.x.get(b);
            com.amazon.aps.iva.yb0.j.c(obj);
            ((a) obj).c(fVar, z);
        }

        @Override // com.amazon.aps.iva.g8.u0
        public final void d(com.amazon.aps.iva.g8.f fVar, boolean z) {
            com.amazon.aps.iva.yb0.j.f(fVar, "popUpTo");
            super.d(fVar, z);
            this.h.A.put(fVar, Boolean.valueOf(z));
        }

        @Override // com.amazon.aps.iva.g8.u0
        public final void e(com.amazon.aps.iva.g8.f fVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, "backStackEntry");
            i iVar = this.h;
            r0 b = iVar.w.b(fVar.c.b);
            if (com.amazon.aps.iva.yb0.j.a(b, this.g)) {
                com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.g8.f, com.amazon.aps.iva.kb0.q> lVar = iVar.y;
                if (lVar != null) {
                    lVar.invoke(fVar);
                    super.e(fVar);
                    return;
                }
                Objects.toString(fVar.c);
                return;
            }
            Object obj = iVar.x.get(b);
            if (obj != null) {
                ((a) obj).e(fVar);
                return;
            }
            throw new IllegalStateException(defpackage.b.c(new StringBuilder("NavigatorBackStack for "), fVar.c.b, " should already be created").toString());
        }

        public final void g(com.amazon.aps.iva.g8.f fVar) {
            super.e(fVar);
        }
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Context, Context> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Context invoke(Context context) {
            Context context2 = context;
            com.amazon.aps.iva.yb0.j.f(context2, "it");
            if (context2 instanceof ContextWrapper) {
                return ((ContextWrapper) context2).getBaseContext();
            }
            return null;
        }
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<n0> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final n0 invoke() {
            i iVar = i.this;
            iVar.getClass();
            return new n0(iVar.a, iVar.w);
        }
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.g8.f, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.yb0.z h;
        public final /* synthetic */ i i;
        public final /* synthetic */ g0 j;
        public final /* synthetic */ Bundle k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.yb0.z zVar, i iVar, g0 g0Var, Bundle bundle) {
            super(1);
            this.h = zVar;
            this.i = iVar;
            this.j = g0Var;
            this.k = bundle;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.g8.f fVar) {
            com.amazon.aps.iva.g8.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "it");
            this.h.b = true;
            com.amazon.aps.iva.lb0.z zVar = com.amazon.aps.iva.lb0.z.b;
            this.i.a(this.j, this.k, fVar2, zVar);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.e.m {
        public f() {
            super(false);
        }

        @Override // com.amazon.aps.iva.e.m
        public final void handleOnBackPressed() {
            i.this.n();
        }
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, Boolean> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(String str) {
            return Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(str, this.h));
        }
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.amazon.aps.iva.g8.h] */
    public i(Context context) {
        Object obj;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.a = context;
        Iterator it = com.amazon.aps.iva.ne0.k.R(context, c.h).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.b = (Activity) obj;
        this.g = new com.amazon.aps.iva.lb0.k<>();
        com.amazon.aps.iva.lb0.z zVar = com.amazon.aps.iva.lb0.z.b;
        com.amazon.aps.iva.ve0.v0 e2 = com.amazon.aps.iva.ab.x.e(zVar);
        this.h = e2;
        this.i = com.amazon.aps.iva.dg.b.h(e2);
        com.amazon.aps.iva.ve0.v0 e3 = com.amazon.aps.iva.ab.x.e(zVar);
        this.j = e3;
        this.k = com.amazon.aps.iva.dg.b.h(e3);
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.o = new LinkedHashMap();
        this.r = new CopyOnWriteArrayList<>();
        this.s = g.b.INITIALIZED;
        this.t = new androidx.lifecycle.j() { // from class: com.amazon.aps.iva.g8.h
            @Override // androidx.lifecycle.j
            public final void U2(com.amazon.aps.iva.i5.o oVar, g.a aVar) {
                i iVar = i.this;
                com.amazon.aps.iva.yb0.j.f(iVar, "this$0");
                iVar.s = aVar.getTargetState();
                if (iVar.c != null) {
                    Iterator<f> it2 = iVar.g.iterator();
                    while (it2.hasNext()) {
                        f next = it2.next();
                        next.getClass();
                        next.e = aVar.getTargetState();
                        next.y();
                    }
                }
            }
        };
        this.u = new f();
        this.v = true;
        t0 t0Var = new t0();
        this.w = t0Var;
        this.x = new LinkedHashMap();
        this.A = new LinkedHashMap();
        t0Var.a(new l0(t0Var));
        t0Var.a(new com.amazon.aps.iva.g8.a(this.a));
        this.C = new ArrayList();
        com.amazon.aps.iva.kb0.f.b(new d());
        com.amazon.aps.iva.ve0.l0 g2 = com.amazon.aps.iva.ab.t.g(1, 0, com.amazon.aps.iva.ue0.e.DROP_OLDEST, 2);
        this.D = g2;
        new com.amazon.aps.iva.ve0.h0(g2);
    }

    public static g0 e(g0 g0Var, int i) {
        j0 j0Var;
        if (g0Var.h == i) {
            return g0Var;
        }
        if (g0Var instanceof j0) {
            j0Var = (j0) g0Var;
        } else {
            j0Var = g0Var.c;
            com.amazon.aps.iva.yb0.j.c(j0Var);
        }
        return j0Var.n(i, true);
    }

    public static /* synthetic */ void q(i iVar, com.amazon.aps.iva.g8.f fVar) {
        iVar.p(fVar, false, new com.amazon.aps.iva.lb0.k<>());
    }

    public final void a(g0 g0Var, Bundle bundle, com.amazon.aps.iva.g8.f fVar, List<com.amazon.aps.iva.g8.f> list) {
        g0 g0Var2;
        Object obj;
        g0 g0Var3;
        Object obj2;
        Bundle bundle2;
        com.amazon.aps.iva.g8.f fVar2;
        com.amazon.aps.iva.g8.f fVar3;
        g0 g0Var4 = fVar.c;
        boolean z = g0Var4 instanceof com.amazon.aps.iva.g8.c;
        boolean z2 = true;
        com.amazon.aps.iva.lb0.k<com.amazon.aps.iva.g8.f> kVar = this.g;
        if (!z) {
            while (!kVar.isEmpty() && (kVar.last().c instanceof com.amazon.aps.iva.g8.c) && o(kVar.last().c.h, true, false)) {
            }
        }
        com.amazon.aps.iva.lb0.k kVar2 = new com.amazon.aps.iva.lb0.k();
        boolean z3 = g0Var instanceof j0;
        Context context = this.a;
        com.amazon.aps.iva.g8.f fVar4 = null;
        if (z3) {
            g0 g0Var5 = g0Var4;
            do {
                com.amazon.aps.iva.yb0.j.c(g0Var5);
                g0Var5 = g0Var5.c;
                if (g0Var5 != null) {
                    ListIterator<com.amazon.aps.iva.g8.f> listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            fVar3 = listIterator.previous();
                            if (com.amazon.aps.iva.yb0.j.a(fVar3.c, g0Var5)) {
                                break;
                            }
                        } else {
                            fVar3 = null;
                            break;
                        }
                    }
                    com.amazon.aps.iva.g8.f fVar5 = fVar3;
                    if (fVar5 == null) {
                        fVar5 = f.a.a(context, g0Var5, bundle, j(), this.q);
                    }
                    kVar2.addFirst(fVar5);
                    if ((!kVar.isEmpty()) && kVar.last().c == g0Var5) {
                        q(this, kVar.last());
                    }
                }
                if (g0Var5 == null) {
                    break;
                }
            } while (g0Var5 != g0Var);
        }
        if (kVar2.isEmpty()) {
            g0Var2 = g0Var4;
        } else {
            g0Var2 = ((com.amazon.aps.iva.g8.f) kVar2.first()).c;
        }
        while (g0Var2 != null && d(g0Var2.h) != g0Var2) {
            g0Var2 = g0Var2.c;
            if (g0Var2 != null) {
                if (bundle == null || bundle.isEmpty() != z2) {
                    z2 = false;
                }
                if (z2) {
                    bundle2 = null;
                } else {
                    bundle2 = bundle;
                }
                ListIterator<com.amazon.aps.iva.g8.f> listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        fVar2 = listIterator2.previous();
                        if (com.amazon.aps.iva.yb0.j.a(fVar2.c, g0Var2)) {
                            break;
                        }
                    } else {
                        fVar2 = null;
                        break;
                    }
                }
                com.amazon.aps.iva.g8.f fVar6 = fVar2;
                if (fVar6 == null) {
                    fVar6 = f.a.a(context, g0Var2, g0Var2.d(bundle2), j(), this.q);
                }
                kVar2.addFirst(fVar6);
            }
            z2 = true;
        }
        if (!kVar2.isEmpty()) {
            g0Var4 = ((com.amazon.aps.iva.g8.f) kVar2.first()).c;
        }
        while (!kVar.isEmpty() && (kVar.last().c instanceof j0)) {
            g0 g0Var6 = kVar.last().c;
            com.amazon.aps.iva.yb0.j.d(g0Var6, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((j0) g0Var6).n(g0Var4.h, false) != null) {
                break;
            }
            q(this, kVar.last());
        }
        if (kVar.isEmpty()) {
            obj = null;
        } else {
            obj = kVar.c[kVar.b];
        }
        com.amazon.aps.iva.g8.f fVar7 = (com.amazon.aps.iva.g8.f) obj;
        if (fVar7 == null) {
            if (kVar2.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = kVar2.c[kVar2.b];
            }
            fVar7 = (com.amazon.aps.iva.g8.f) obj2;
        }
        if (fVar7 != null) {
            g0Var3 = fVar7.c;
        } else {
            g0Var3 = null;
        }
        if (!com.amazon.aps.iva.yb0.j.a(g0Var3, this.c)) {
            ListIterator<com.amazon.aps.iva.g8.f> listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                com.amazon.aps.iva.g8.f previous = listIterator3.previous();
                g0 g0Var7 = previous.c;
                j0 j0Var = this.c;
                com.amazon.aps.iva.yb0.j.c(j0Var);
                if (com.amazon.aps.iva.yb0.j.a(g0Var7, j0Var)) {
                    fVar4 = previous;
                    break;
                }
            }
            com.amazon.aps.iva.g8.f fVar8 = fVar4;
            if (fVar8 == null) {
                j0 j0Var2 = this.c;
                com.amazon.aps.iva.yb0.j.c(j0Var2);
                j0 j0Var3 = this.c;
                com.amazon.aps.iva.yb0.j.c(j0Var3);
                fVar8 = f.a.a(context, j0Var2, j0Var3.d(bundle), j(), this.q);
            }
            kVar2.addFirst(fVar8);
        }
        Iterator<E> it = kVar2.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.g8.f fVar9 = (com.amazon.aps.iva.g8.f) it.next();
            Object obj3 = this.x.get(this.w.b(fVar9.c.b));
            if (obj3 != null) {
                ((a) obj3).g(fVar9);
            } else {
                throw new IllegalStateException(defpackage.b.c(new StringBuilder("NavigatorBackStack for "), g0Var.b, " should already be created").toString());
            }
        }
        kVar.addAll(kVar2);
        kVar.addLast(fVar);
        Iterator it2 = com.amazon.aps.iva.lb0.x.M0(kVar2, fVar).iterator();
        while (it2.hasNext()) {
            com.amazon.aps.iva.g8.f fVar10 = (com.amazon.aps.iva.g8.f) it2.next();
            j0 j0Var4 = fVar10.c.c;
            if (j0Var4 != null) {
                l(fVar10, f(j0Var4.h));
            }
        }
    }

    public final boolean b() {
        com.amazon.aps.iva.lb0.k<com.amazon.aps.iva.g8.f> kVar;
        while (true) {
            kVar = this.g;
            if (kVar.isEmpty() || !(kVar.last().c instanceof j0)) {
                break;
            }
            q(this, kVar.last());
        }
        com.amazon.aps.iva.g8.f k = kVar.k();
        ArrayList arrayList = this.C;
        if (k != null) {
            arrayList.add(k);
        }
        this.B++;
        u();
        int i = this.B - 1;
        this.B = i;
        if (i == 0) {
            ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(arrayList);
            arrayList.clear();
            Iterator it = Z0.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.g8.f fVar = (com.amazon.aps.iva.g8.f) it.next();
                Iterator<b> it2 = this.r.iterator();
                while (it2.hasNext()) {
                    g0 g0Var = fVar.c;
                    fVar.g();
                    it2.next().a();
                }
                this.D.b(fVar);
            }
            this.h.setValue(com.amazon.aps.iva.lb0.x.Z0(kVar));
            this.j.setValue(r());
        }
        if (k != null) {
            return true;
        }
        return false;
    }

    public final boolean c(ArrayList arrayList, g0 g0Var, boolean z, boolean z2) {
        String str;
        Object obj;
        String str2;
        com.amazon.aps.iva.yb0.z zVar = new com.amazon.aps.iva.yb0.z();
        com.amazon.aps.iva.lb0.k kVar = new com.amazon.aps.iva.lb0.k();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.yb0.z zVar2 = new com.amazon.aps.iva.yb0.z();
            this.z = new k(zVar2, zVar, this, z2, kVar);
            ((r0) it.next()).e(this.g.last(), z2);
            this.z = null;
            if (!zVar2.b) {
                break;
            }
        }
        if (z2) {
            LinkedHashMap linkedHashMap = this.n;
            if (!z) {
                t.a aVar = new t.a(new com.amazon.aps.iva.ne0.t(com.amazon.aps.iva.ne0.k.R(g0Var, l.h), new m(this)));
                while (aVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((g0) aVar.next()).h);
                    if (kVar.isEmpty()) {
                        obj = null;
                    } else {
                        obj = kVar.c[kVar.b];
                    }
                    com.amazon.aps.iva.g8.g gVar = (com.amazon.aps.iva.g8.g) obj;
                    if (gVar != null) {
                        str2 = gVar.b;
                    } else {
                        str2 = null;
                    }
                    linkedHashMap.put(valueOf, str2);
                }
            }
            if (!kVar.isEmpty()) {
                com.amazon.aps.iva.g8.g gVar2 = (com.amazon.aps.iva.g8.g) kVar.first();
                t.a aVar2 = new t.a(new com.amazon.aps.iva.ne0.t(com.amazon.aps.iva.ne0.k.R(d(gVar2.c), n.h), new o(this)));
                while (true) {
                    boolean hasNext = aVar2.hasNext();
                    str = gVar2.b;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((g0) aVar2.next()).h), str);
                }
                this.o.put(str, kVar);
            }
        }
        v();
        return zVar.b;
    }

    public final g0 d(int i) {
        g0 g0Var;
        j0 j0Var = this.c;
        if (j0Var == null) {
            return null;
        }
        if (j0Var.h == i) {
            return j0Var;
        }
        com.amazon.aps.iva.g8.f k = this.g.k();
        if (k == null || (g0Var = k.c) == null) {
            g0Var = this.c;
            com.amazon.aps.iva.yb0.j.c(g0Var);
        }
        return e(g0Var, i);
    }

    public final com.amazon.aps.iva.g8.f f(int i) {
        com.amazon.aps.iva.g8.f fVar;
        boolean z;
        com.amazon.aps.iva.lb0.k<com.amazon.aps.iva.g8.f> kVar = this.g;
        ListIterator<com.amazon.aps.iva.g8.f> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                fVar = listIterator.previous();
                if (fVar.c.h == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                fVar = null;
                break;
            }
        }
        com.amazon.aps.iva.g8.f fVar2 = fVar;
        if (fVar2 != null) {
            return fVar2;
        }
        StringBuilder d2 = com.amazon.aps.iva.e4.e.d("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        d2.append(g());
        throw new IllegalArgumentException(d2.toString().toString());
    }

    public final g0 g() {
        com.amazon.aps.iva.g8.f k = this.g.k();
        if (k != null) {
            return k.c;
        }
        return null;
    }

    public final int h() {
        com.amazon.aps.iva.lb0.k<com.amazon.aps.iva.g8.f> kVar = this.g;
        int i = 0;
        if (!(kVar instanceof Collection) || !kVar.isEmpty()) {
            for (com.amazon.aps.iva.g8.f fVar : kVar) {
                if ((!(fVar.c instanceof j0)) && (i = i + 1) < 0) {
                    f1.R();
                    throw null;
                }
            }
        }
        return i;
    }

    public final j0 i() {
        j0 j0Var = this.c;
        if (j0Var != null) {
            com.amazon.aps.iva.yb0.j.d(j0Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return j0Var;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    public final g.b j() {
        if (this.p == null) {
            return g.b.CREATED;
        }
        return this.s;
    }

    public final com.amazon.aps.iva.g8.f k() {
        Object obj;
        Iterator it = com.amazon.aps.iva.lb0.x.N0(this.g).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = com.amazon.aps.iva.ne0.k.O(it).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (!(((com.amazon.aps.iva.g8.f) obj).c instanceof j0)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (com.amazon.aps.iva.g8.f) obj;
    }

    public final void l(com.amazon.aps.iva.g8.f fVar, com.amazon.aps.iva.g8.f fVar2) {
        this.l.put(fVar, fVar2);
        LinkedHashMap linkedHashMap = this.m;
        if (linkedHashMap.get(fVar2) == null) {
            linkedHashMap.put(fVar2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(fVar2);
        com.amazon.aps.iva.yb0.j.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021e A[LOOP:1: B:94:0x0218->B:96:0x021e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(com.amazon.aps.iva.g8.g0 r27, android.os.Bundle r28, com.amazon.aps.iva.g8.o0 r29, com.amazon.aps.iva.g8.r0.a r30) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g8.i.m(com.amazon.aps.iva.g8.g0, android.os.Bundle, com.amazon.aps.iva.g8.o0, com.amazon.aps.iva.g8.r0$a):void");
    }

    public final boolean n() {
        if (this.g.isEmpty()) {
            return false;
        }
        g0 g2 = g();
        com.amazon.aps.iva.yb0.j.c(g2);
        if (!o(g2.h, true, false) || !b()) {
            return false;
        }
        return true;
    }

    public final boolean o(int i, boolean z, boolean z2) {
        g0 g0Var;
        com.amazon.aps.iva.lb0.k<com.amazon.aps.iva.g8.f> kVar = this.g;
        if (kVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = com.amazon.aps.iva.lb0.x.N0(kVar).iterator();
        while (true) {
            if (it.hasNext()) {
                g0Var = ((com.amazon.aps.iva.g8.f) it.next()).c;
                r0 b2 = this.w.b(g0Var.b);
                if (z || g0Var.h != i) {
                    arrayList.add(b2);
                }
                if (g0Var.h == i) {
                    break;
                }
            } else {
                g0Var = null;
                break;
            }
        }
        if (g0Var == null) {
            int i2 = g0.j;
            g0.a.b(i, this.a);
            return false;
        }
        return c(arrayList, g0Var, z, z2);
    }

    public final void p(com.amazon.aps.iva.g8.f fVar, boolean z, com.amazon.aps.iva.lb0.k<com.amazon.aps.iva.g8.g> kVar) {
        boolean z2;
        t tVar;
        com.amazon.aps.iva.ve0.i0 i0Var;
        Set set;
        com.amazon.aps.iva.lb0.k<com.amazon.aps.iva.g8.f> kVar2 = this.g;
        com.amazon.aps.iva.g8.f last = kVar2.last();
        if (com.amazon.aps.iva.yb0.j.a(last, fVar)) {
            kVar2.removeLast();
            a aVar = (a) this.x.get(this.w.b(last.c.b));
            boolean z3 = true;
            if (aVar != null && (i0Var = aVar.f) != null && (set = (Set) i0Var.getValue()) != null && set.contains(last)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !this.m.containsKey(last)) {
                z3 = false;
            }
            g.b bVar = last.i.c;
            g.b bVar2 = g.b.CREATED;
            if (bVar.isAtLeast(bVar2)) {
                if (z) {
                    last.r(bVar2);
                    kVar.addFirst(new com.amazon.aps.iva.g8.g(last));
                }
                if (!z3) {
                    last.r(g.b.DESTROYED);
                    t(last);
                } else {
                    last.r(bVar2);
                }
            }
            if (!z && !z3 && (tVar = this.q) != null) {
                String str = last.g;
                com.amazon.aps.iva.yb0.j.f(str, "backStackEntryId");
                com.amazon.aps.iva.i5.g0 g0Var = (com.amazon.aps.iva.i5.g0) tVar.b.remove(str);
                if (g0Var != null) {
                    g0Var.a();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + fVar.c + ", which is not the top of the back stack (" + last.c + ')').toString());
    }

    public final ArrayList r() {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.x.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (Iterable) aVar.f.getValue()) {
                com.amazon.aps.iva.g8.f fVar = (com.amazon.aps.iva.g8.f) obj;
                if (!arrayList.contains(fVar) && !fVar.l.isAtLeast(g.b.STARTED)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList2.add(obj);
                }
            }
            com.amazon.aps.iva.lb0.t.d0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<com.amazon.aps.iva.g8.f> it = this.g.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.g8.f next = it.next();
            com.amazon.aps.iva.g8.f fVar2 = next;
            if (!arrayList.contains(fVar2) && fVar2.l.isAtLeast(g.b.STARTED)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList3.add(next);
            }
        }
        com.amazon.aps.iva.lb0.t.d0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (!(((com.amazon.aps.iva.g8.f) next2).c instanceof j0)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean s(int i, Bundle bundle, o0 o0Var, r0.a aVar) {
        g0 i2;
        com.amazon.aps.iva.g8.f fVar;
        g0 g0Var;
        LinkedHashMap linkedHashMap = this.n;
        if (!linkedHashMap.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection values = linkedHashMap.values();
        g gVar = new g(str);
        com.amazon.aps.iva.yb0.j.f(values, "<this>");
        com.amazon.aps.iva.lb0.t.g0(values, gVar, true);
        LinkedHashMap linkedHashMap2 = this.o;
        com.amazon.aps.iva.yb0.h0.c(linkedHashMap2);
        com.amazon.aps.iva.lb0.k kVar = (com.amazon.aps.iva.lb0.k) linkedHashMap2.remove(str);
        ArrayList arrayList = new ArrayList();
        com.amazon.aps.iva.g8.f k = this.g.k();
        if (k == null || (i2 = k.c) == null) {
            i2 = i();
        }
        if (kVar != null) {
            Iterator<E> it = kVar.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.g8.g gVar2 = (com.amazon.aps.iva.g8.g) it.next();
                g0 e2 = e(i2, gVar2.c);
                Context context = this.a;
                if (e2 != null) {
                    arrayList.add(gVar2.a(context, e2, j(), this.q));
                    i2 = e2;
                } else {
                    int i3 = g0.j;
                    String b2 = g0.a.b(gVar2.c, context);
                    throw new IllegalStateException(("Restore State failed: destination " + b2 + " cannot be found from the current destination " + i2).toString());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((com.amazon.aps.iva.g8.f) next).c instanceof j0)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it3.hasNext()) {
                break;
            }
            com.amazon.aps.iva.g8.f fVar2 = (com.amazon.aps.iva.g8.f) it3.next();
            List list = (List) com.amazon.aps.iva.lb0.x.E0(arrayList2);
            if (list != null && (fVar = (com.amazon.aps.iva.g8.f) com.amazon.aps.iva.lb0.x.D0(list)) != null && (g0Var = fVar.c) != null) {
                str2 = g0Var.b;
            }
            if (com.amazon.aps.iva.yb0.j.a(str2, fVar2.c.b)) {
                list.add(fVar2);
            } else {
                arrayList2.add(f1.M(fVar2));
            }
        }
        com.amazon.aps.iva.yb0.z zVar = new com.amazon.aps.iva.yb0.z();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List<com.amazon.aps.iva.g8.f> list2 = (List) it4.next();
            r0 b3 = this.w.b(((com.amazon.aps.iva.g8.f) com.amazon.aps.iva.lb0.x.t0(list2)).c.b);
            this.y = new p(zVar, arrayList, new com.amazon.aps.iva.yb0.b0(), this, bundle);
            b3.d(list2, o0Var, aVar);
            this.y = null;
        }
        return zVar.b;
    }

    public final void t(com.amazon.aps.iva.g8.f fVar) {
        Integer num;
        com.amazon.aps.iva.yb0.j.f(fVar, "child");
        com.amazon.aps.iva.g8.f fVar2 = (com.amazon.aps.iva.g8.f) this.l.remove(fVar);
        if (fVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.m;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(fVar2);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            a aVar = (a) this.x.get(this.w.b(fVar2.c.b));
            if (aVar != null) {
                aVar.b(fVar2);
            }
            linkedHashMap.remove(fVar2);
        }
    }

    public final void u() {
        Boolean bool;
        boolean z;
        com.amazon.aps.iva.ve0.i0 i0Var;
        Set set;
        ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(this.g);
        if (Z0.isEmpty()) {
            return;
        }
        g0 g0Var = ((com.amazon.aps.iva.g8.f) com.amazon.aps.iva.lb0.x.D0(Z0)).c;
        ArrayList arrayList = new ArrayList();
        if (g0Var instanceof com.amazon.aps.iva.g8.c) {
            for (com.amazon.aps.iva.g8.f fVar : com.amazon.aps.iva.lb0.x.N0(Z0)) {
                g0 g0Var2 = fVar.c;
                arrayList.add(g0Var2);
                if (!(g0Var2 instanceof com.amazon.aps.iva.g8.c) && !(g0Var2 instanceof j0)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (com.amazon.aps.iva.g8.f fVar2 : com.amazon.aps.iva.lb0.x.N0(Z0)) {
            g.b bVar = fVar2.l;
            g0 g0Var3 = fVar2.c;
            boolean z2 = true;
            if (g0Var != null && g0Var3.h == g0Var.h) {
                g.b bVar2 = g.b.RESUMED;
                if (bVar != bVar2) {
                    a aVar = (a) this.x.get(this.w.b(g0Var3.b));
                    if (aVar != null && (i0Var = aVar.f) != null && (set = (Set) i0Var.getValue()) != null) {
                        bool = Boolean.valueOf(set.contains(fVar2));
                    } else {
                        bool = null;
                    }
                    if (!com.amazon.aps.iva.yb0.j.a(bool, Boolean.TRUE)) {
                        AtomicInteger atomicInteger = (AtomicInteger) this.m.get(fVar2);
                        if (atomicInteger != null && atomicInteger.get() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            hashMap.put(fVar2, bVar2);
                        }
                    }
                    hashMap.put(fVar2, g.b.STARTED);
                }
                g0 g0Var4 = (g0) com.amazon.aps.iva.lb0.x.v0(arrayList);
                if ((g0Var4 == null || g0Var4.h != g0Var3.h) ? false : false) {
                    com.amazon.aps.iva.lb0.t.i0(arrayList);
                }
                g0Var = g0Var.c;
            } else if ((true ^ arrayList.isEmpty()) && g0Var3.h == ((g0) com.amazon.aps.iva.lb0.x.t0(arrayList)).h) {
                g0 g0Var5 = (g0) com.amazon.aps.iva.lb0.t.i0(arrayList);
                if (bVar == g.b.RESUMED) {
                    fVar2.r(g.b.STARTED);
                } else {
                    g.b bVar3 = g.b.STARTED;
                    if (bVar != bVar3) {
                        hashMap.put(fVar2, bVar3);
                    }
                }
                j0 j0Var = g0Var5.c;
                if (j0Var != null && !arrayList.contains(j0Var)) {
                    arrayList.add(j0Var);
                }
            } else {
                fVar2.r(g.b.CREATED);
            }
        }
        Iterator it = Z0.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.g8.f fVar3 = (com.amazon.aps.iva.g8.f) it.next();
            g.b bVar4 = (g.b) hashMap.get(fVar3);
            if (bVar4 != null) {
                fVar3.r(bVar4);
            } else {
                fVar3.y();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (h() > 1) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            r2 = this;
            boolean r0 = r2.v
            if (r0 == 0) goto Lc
            int r0 = r2.h()
            r1 = 1
            if (r0 <= r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            com.amazon.aps.iva.g8.i$f r0 = r2.u
            r0.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g8.i.v():void");
    }
}
