package com.amazon.aps.iva.r4;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.amazon.aps.iva.d4.d;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: GlanceAppWidgetManager.kt */
/* loaded from: classes.dex */
public final class i0 {
    @Deprecated
    public static com.amazon.aps.iva.z3.i<com.amazon.aps.iva.d4.d> f;
    public final Context a;
    public final AppWidgetManager b;
    public final com.amazon.aps.iva.kb0.m c;
    public static final a d = new a();
    @Deprecated
    public static final com.amazon.aps.iva.c4.c e = com.amazon.aps.iva.b50.w.q("GlanceAppWidgetManager", null, 14);
    @Deprecated
    public static final d.a<Set<String>> g = new d.a<>("list::Providers");

    /* compiled from: GlanceAppWidgetManager.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] a = {com.amazon.aps.iva.yb0.e0.a.h(new com.amazon.aps.iva.yb0.x(a.class, "appManagerDataStore", "getAppManagerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};

        public static final d.a a(a aVar, String str) {
            aVar.getClass();
            return com.amazon.aps.iva.cq.b.n0("provider:" + str);
        }
    }

    /* compiled from: GlanceAppWidgetManager.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public final Map<ComponentName, String> a;
        public final Map<String, List<ComponentName>> b;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, bVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "State(receiverToProviderName=" + this.a + ", providerNameToReceivers=" + this.b + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ b(int r1) {
            /*
                r0 = this;
                com.amazon.aps.iva.lb0.a0 r1 = com.amazon.aps.iva.lb0.a0.b
                r0.<init>(r1, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r4.i0.b.<init>(int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Map<ComponentName, String> map, Map<String, ? extends List<ComponentName>> map2) {
            com.amazon.aps.iva.yb0.j.f(map, "receiverToProviderName");
            com.amazon.aps.iva.yb0.j.f(map2, "providerNameToReceivers");
            this.a = map;
            this.b = map2;
        }
    }

    /* compiled from: GlanceAppWidgetManager.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.z3.i<com.amazon.aps.iva.d4.d>> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.z3.i<com.amazon.aps.iva.d4.d> invoke() {
            com.amazon.aps.iva.z3.i<com.amazon.aps.iva.d4.d> iVar;
            i0 i0Var = i0.this;
            i0Var.getClass();
            synchronized (i0.d) {
                iVar = i0.f;
                if (iVar == null) {
                    iVar = i0.e.getValue(i0Var.a, a.a[0]);
                    i0.f = iVar;
                }
            }
            return iVar;
        }
    }

    /* compiled from: GlanceAppWidgetManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidgetManager", f = "GlanceAppWidgetManager.kt", l = {96}, m = "getState")
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.qb0.c {
        public i0 h;
        public /* synthetic */ Object i;
        public int k;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            a aVar = i0.d;
            return i0.this.b(this);
        }
    }

    /* compiled from: GlanceAppWidgetManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidgetManager$updateReceiver$2", f = "GlanceAppWidgetManager.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.d4.d, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.d4.d>, Object> {
        public /* synthetic */ Object h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(2, dVar);
            this.i = str;
            this.j = str2;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            e eVar = new e(this.i, this.j, dVar);
            eVar.h = obj;
            return eVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.d4.d dVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.d4.d> dVar2) {
            return ((e) create(dVar, dVar2)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.d4.d dVar = (com.amazon.aps.iva.d4.d) this.h;
            com.amazon.aps.iva.d4.a d = dVar.d();
            d.a<Set<String>> aVar2 = i0.g;
            Set set = (Set) dVar.c(aVar2);
            if (set == null) {
                set = com.amazon.aps.iva.lb0.b0.b;
            }
            String str = this.i;
            LinkedHashSet R = com.amazon.aps.iva.lb0.m0.R(set, str);
            com.amazon.aps.iva.yb0.j.f(aVar2, "key");
            d.h(aVar2, R);
            d.h(a.a(i0.d, str), this.j);
            return d.e();
        }
    }

    public i0(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.a = context;
        this.b = AppWidgetManager.getInstance(context);
        this.c = com.amazon.aps.iva.kb0.f.b(new c());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.Class r8, com.amazon.aps.iva.ob0.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.r4.k0
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.r4.k0 r0 = (com.amazon.aps.iva.r4.k0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.r4.k0 r0 = new com.amazon.aps.iva.r4.k0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Class r8 = r0.i
            com.amazon.aps.iva.r4.i0 r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L44
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            com.amazon.aps.iva.ab.x.i0(r9)
            r0.h = r7
            r0.i = r8
            r0.l = r3
            java.lang.Object r9 = r7.b(r0)
            if (r9 != r1) goto L43
            return r1
        L43:
            r0 = r7
        L44:
            com.amazon.aps.iva.r4.i0$b r9 = (com.amazon.aps.iva.r4.i0.b) r9
            java.lang.String r8 = r8.getCanonicalName()
            if (r8 == 0) goto L97
            java.util.Map<java.lang.String, java.util.List<android.content.ComponentName>> r9 = r9.b
            java.lang.Object r8 = r9.get(r8)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L59
            com.amazon.aps.iva.lb0.z r8 = com.amazon.aps.iva.lb0.z.b
            return r8
        L59:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L64:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L96
            java.lang.Object r1 = r8.next()
            android.content.ComponentName r1 = (android.content.ComponentName) r1
            android.appwidget.AppWidgetManager r2 = r0.b
            int[] r1 = r2.getAppWidgetIds(r1)
            java.lang.String r2 = "appWidgetManager.getAppWidgetIds(receiver)"
            com.amazon.aps.iva.yb0.j.e(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.length
            r2.<init>(r3)
            int r3 = r1.length
            r4 = 0
        L83:
            if (r4 >= r3) goto L92
            r5 = r1[r4]
            com.amazon.aps.iva.r4.b r6 = new com.amazon.aps.iva.r4.b
            r6.<init>(r5)
            r2.add(r6)
            int r4 = r4 + 1
            goto L83
        L92:
            com.amazon.aps.iva.lb0.t.d0(r9, r2)
            goto L64
        L96:
            return r9
        L97:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Required value was null."
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r4.i0.a(java.lang.Class, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.r4.i0.b> r7) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r4.i0.b(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public final <R extends l0, P extends z> Object c(R r, P p, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        String canonicalName = r.getClass().getCanonicalName();
        if (canonicalName != null) {
            String canonicalName2 = p.getClass().getCanonicalName();
            if (canonicalName2 != null) {
                Object a2 = ((com.amazon.aps.iva.z3.i) this.c.getValue()).a(new e(canonicalName, canonicalName2, null), dVar);
                if (a2 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                    return a2;
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
