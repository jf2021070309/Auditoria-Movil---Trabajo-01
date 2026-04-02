package com.amazon.aps.iva.g8;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.u;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
/* compiled from: NavBackStackEntry.kt */
/* loaded from: classes.dex */
public final class f implements com.amazon.aps.iva.i5.o, com.amazon.aps.iva.i5.h0, androidx.lifecycle.e, com.amazon.aps.iva.s8.c {
    public final Context b;
    public g0 c;
    public final Bundle d;
    public g.b e;
    public final q0 f;
    public final String g;
    public final Bundle h;
    public final androidx.lifecycle.k i = new androidx.lifecycle.k(this);
    public final com.amazon.aps.iva.s8.b j = new com.amazon.aps.iva.s8.b(this);
    public boolean k;
    public g.b l;
    public final androidx.lifecycle.r m;

    /* compiled from: NavBackStackEntry.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static f a(Context context, g0 g0Var, Bundle bundle, g.b bVar, t tVar) {
            String uuid = UUID.randomUUID().toString();
            com.amazon.aps.iva.yb0.j.e(uuid, "randomUUID().toString()");
            com.amazon.aps.iva.yb0.j.f(g0Var, FirebaseAnalytics.Param.DESTINATION);
            com.amazon.aps.iva.yb0.j.f(bVar, "hostLifecycleState");
            return new f(context, g0Var, bundle, bVar, tVar, uuid, null);
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    /* loaded from: classes.dex */
    public static final class b extends androidx.lifecycle.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(fVar, null);
            com.amazon.aps.iva.yb0.j.f(fVar, "owner");
        }

        @Override // androidx.lifecycle.a
        public final <T extends com.amazon.aps.iva.i5.f0> T d(String str, Class<T> cls, androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
            com.amazon.aps.iva.yb0.j.f(pVar, "handle");
            return new c(pVar);
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.i5.f0 {
        public final androidx.lifecycle.p b;

        public c(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "handle");
            this.b = pVar;
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.lifecycle.r> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.lifecycle.r invoke() {
            Context context;
            f fVar = f.this;
            Context context2 = fVar.b;
            Application application = null;
            if (context2 != null) {
                context = context2.getApplicationContext();
            } else {
                context = null;
            }
            if (context instanceof Application) {
                application = (Application) context;
            }
            return new androidx.lifecycle.r(application, fVar, fVar.g());
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.lifecycle.p> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.lifecycle.p invoke() {
            boolean z;
            f fVar = f.this;
            if (fVar.k) {
                if (fVar.i.c != g.b.DESTROYED) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return ((c) new androidx.lifecycle.u(fVar, new b(fVar)).a(c.class)).b;
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
    }

    static {
        new a();
    }

    public f(Context context, g0 g0Var, Bundle bundle, g.b bVar, q0 q0Var, String str, Bundle bundle2) {
        this.b = context;
        this.c = g0Var;
        this.d = bundle;
        this.e = bVar;
        this.f = q0Var;
        this.g = str;
        this.h = bundle2;
        com.amazon.aps.iva.kb0.m b2 = com.amazon.aps.iva.kb0.f.b(new d());
        com.amazon.aps.iva.kb0.f.b(new e());
        this.l = g.b.INITIALIZED;
        this.m = (androidx.lifecycle.r) b2.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L86
            boolean r1 = r7 instanceof com.amazon.aps.iva.g8.f
            if (r1 != 0) goto L9
            goto L86
        L9:
            com.amazon.aps.iva.g8.f r7 = (com.amazon.aps.iva.g8.f) r7
            java.lang.String r1 = r7.g
            java.lang.String r2 = r6.g
            boolean r1 = com.amazon.aps.iva.yb0.j.a(r2, r1)
            if (r1 == 0) goto L86
            com.amazon.aps.iva.g8.g0 r1 = r6.c
            com.amazon.aps.iva.g8.g0 r2 = r7.c
            boolean r1 = com.amazon.aps.iva.yb0.j.a(r1, r2)
            if (r1 == 0) goto L86
            androidx.lifecycle.k r1 = r6.i
            androidx.lifecycle.k r2 = r7.i
            boolean r1 = com.amazon.aps.iva.yb0.j.a(r1, r2)
            if (r1 == 0) goto L86
            com.amazon.aps.iva.s8.b r1 = r6.j
            androidx.savedstate.a r1 = r1.b
            com.amazon.aps.iva.s8.b r2 = r7.j
            androidx.savedstate.a r2 = r2.b
            boolean r1 = com.amazon.aps.iva.yb0.j.a(r1, r2)
            if (r1 == 0) goto L86
            android.os.Bundle r1 = r6.d
            android.os.Bundle r7 = r7.d
            boolean r2 = com.amazon.aps.iva.yb0.j.a(r1, r7)
            r3 = 1
            if (r2 != 0) goto L85
            if (r1 == 0) goto L82
            java.util.Set r2 = r1.keySet()
            if (r2 == 0) goto L82
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r4 = r2 instanceof java.util.Collection
            if (r4 == 0) goto L5b
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L5b
        L59:
            r7 = r3
            goto L7e
        L5b:
            java.util.Iterator r2 = r2.iterator()
        L5f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L59
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            if (r7 == 0) goto L76
            java.lang.Object r4 = r7.get(r4)
            goto L77
        L76:
            r4 = 0
        L77:
            boolean r4 = com.amazon.aps.iva.yb0.j.a(r5, r4)
            if (r4 != 0) goto L5f
            r7 = r0
        L7e:
            if (r7 != r3) goto L82
            r7 = r3
            goto L83
        L82:
            r7 = r0
        L83:
            if (r7 == 0) goto L86
        L85:
            r0 = r3
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g8.f.equals(java.lang.Object):boolean");
    }

    public final Bundle g() {
        Bundle bundle = this.d;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    @Override // androidx.lifecycle.e
    public final com.amazon.aps.iva.k5.a getDefaultViewModelCreationExtras() {
        Context context;
        com.amazon.aps.iva.k5.c cVar = new com.amazon.aps.iva.k5.c(0);
        Application application = null;
        Context context2 = this.b;
        if (context2 != null) {
            context = context2.getApplicationContext();
        } else {
            context = null;
        }
        if (context instanceof Application) {
            application = context;
        }
        LinkedHashMap linkedHashMap = cVar.a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.t.a, application);
        }
        linkedHashMap.put(androidx.lifecycle.q.a, this);
        linkedHashMap.put(androidx.lifecycle.q.b, this);
        Bundle g = g();
        if (g != null) {
            linkedHashMap.put(androidx.lifecycle.q.c, g);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.e
    public final u.b getDefaultViewModelProviderFactory() {
        return this.m;
    }

    @Override // com.amazon.aps.iva.i5.o
    public final androidx.lifecycle.g getLifecycle() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.s8.c
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.j.b;
    }

    @Override // com.amazon.aps.iva.i5.h0
    public final com.amazon.aps.iva.i5.g0 getViewModelStore() {
        boolean z;
        if (this.k) {
            if (this.i.c != g.b.DESTROYED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                q0 q0Var = this.f;
                if (q0Var != null) {
                    return q0Var.h1(this.g);
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    public final int hashCode() {
        Set<String> keySet;
        int i;
        int hashCode = this.c.hashCode() + (this.g.hashCode() * 31);
        Bundle bundle = this.d;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i2 = hashCode * 31;
                Object obj = bundle.get(str);
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                hashCode = i2 + i;
            }
        }
        return this.j.b.hashCode() + ((this.i.hashCode() + (hashCode * 31)) * 31);
    }

    public final void r(g.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "maxState");
        this.l = bVar;
        y();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(f.class.getSimpleName());
        sb.append("(" + this.g + ')');
        sb.append(" destination=");
        sb.append(this.c);
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "sb.toString()");
        return sb2;
    }

    public final void y() {
        if (!this.k) {
            com.amazon.aps.iva.s8.b bVar = this.j;
            bVar.a();
            this.k = true;
            if (this.f != null) {
                androidx.lifecycle.q.b(this);
            }
            bVar.b(this.h);
        }
        int ordinal = this.e.ordinal();
        int ordinal2 = this.l.ordinal();
        androidx.lifecycle.k kVar = this.i;
        if (ordinal < ordinal2) {
            kVar.e(this.e);
        } else {
            kVar.e(this.l);
        }
    }
}
