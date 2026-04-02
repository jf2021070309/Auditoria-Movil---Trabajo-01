package com.amazon.aps.iva.r4;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.SizeF;
import android.widget.RemoteViews;
import com.amazon.aps.iva.o0.m2;
import com.amazon.aps.iva.o0.o2;
import com.amazon.aps.iva.r4.w1;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: GlanceAppWidget.kt */
/* loaded from: classes.dex */
public abstract class z {
    public final int a;
    public final w1.b b;
    public final com.amazon.aps.iva.z4.d c;

    /* compiled from: GlanceAppWidget.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final a a = new a();

        /* compiled from: GlanceAppWidget.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidget$Api31Impl$composeAllSizes$2", f = "GlanceAppWidget.kt", l = {440}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.r4.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0664a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super RemoteViews>, Object> {
            public int h;
            public /* synthetic */ Object i;
            public final /* synthetic */ Collection<com.amazon.aps.iva.o2.g> j;
            public final /* synthetic */ z k;
            public final /* synthetic */ Context l;
            public final /* synthetic */ int m;
            public final /* synthetic */ Object n;
            public final /* synthetic */ Bundle o;
            public final /* synthetic */ o0 p;

            /* compiled from: GlanceAppWidget.kt */
            @com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidget$Api31Impl$composeAllSizes$2$allViews$1$1", f = "GlanceAppWidget.kt", l = {MediaError.DetailedErrorCode.SMOOTH_MANIFEST}, m = "invokeSuspend")
            /* renamed from: com.amazon.aps.iva.r4.z$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0665a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.j<? extends SizeF, ? extends RemoteViews>>, Object> {
                public SizeF h;
                public int i;
                public final /* synthetic */ long j;
                public final /* synthetic */ z k;
                public final /* synthetic */ Context l;
                public final /* synthetic */ int m;
                public final /* synthetic */ Object n;
                public final /* synthetic */ Bundle o;
                public final /* synthetic */ o0 p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0665a(int i, long j, Context context, Bundle bundle, z zVar, o0 o0Var, Object obj, com.amazon.aps.iva.ob0.d dVar) {
                    super(2, dVar);
                    this.j = j;
                    this.k = zVar;
                    this.l = context;
                    this.m = i;
                    this.n = obj;
                    this.o = bundle;
                    this.p = o0Var;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                    long j = this.j;
                    z zVar = this.k;
                    Context context = this.l;
                    return new C0665a(this.m, j, context, this.o, zVar, this.p, this.n, dVar);
                }

                @Override // com.amazon.aps.iva.xb0.p
                public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.j<? extends SizeF, ? extends RemoteViews>> dVar) {
                    return ((C0665a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    SizeF sizeF;
                    com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                    int i = this.i;
                    if (i != 0) {
                        if (i == 1) {
                            sizeF = this.h;
                            com.amazon.aps.iva.ab.x.i0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        com.amazon.aps.iva.ab.x.i0(obj);
                        long j = this.j;
                        SizeF sizeF2 = new SizeF(com.amazon.aps.iva.o2.g.c(j), com.amazon.aps.iva.o2.g.b(j));
                        z zVar = this.k;
                        Context context = this.l;
                        int i2 = this.m;
                        Object obj2 = this.n;
                        Bundle bundle = this.o;
                        long j2 = this.j;
                        o0 o0Var = this.p;
                        this.h = sizeF2;
                        this.i = 1;
                        Object f = zVar.f(context, i2, obj2, bundle, j2, o0Var, this);
                        if (f == aVar) {
                            return aVar;
                        }
                        sizeF = sizeF2;
                        obj = f;
                    }
                    return new com.amazon.aps.iva.kb0.j(sizeF, obj);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0664a(z zVar, Context context, int i, Object obj, Bundle bundle, Collection collection, o0 o0Var, com.amazon.aps.iva.ob0.d dVar) {
                super(2, dVar);
                this.j = collection;
                this.k = zVar;
                this.l = context;
                this.m = i;
                this.n = obj;
                this.o = bundle;
                this.p = o0Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                C0664a c0664a = new C0664a(this.k, this.l, this.m, this.n, this.o, this.j, this.p, dVar);
                c0664a.i = obj;
                return c0664a;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super RemoteViews> dVar) {
                return ((C0664a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                Object a;
                RemoteViews remoteViews;
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                int i2 = 1;
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                        a = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    com.amazon.aps.iva.se0.g0 g0Var = (com.amazon.aps.iva.se0.g0) this.i;
                    Collection<com.amazon.aps.iva.o2.g> collection = this.j;
                    z zVar = this.k;
                    Context context = this.l;
                    int i3 = this.m;
                    Object obj2 = this.n;
                    Bundle bundle = this.o;
                    o0 o0Var = this.p;
                    ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(collection));
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        ArrayList arrayList2 = arrayList;
                        o0 o0Var2 = o0Var;
                        Object obj3 = obj2;
                        arrayList2.add(com.amazon.aps.iva.se0.i.b(g0Var, null, null, new C0665a(i3, ((com.amazon.aps.iva.o2.g) it.next()).a, context, bundle, zVar, o0Var2, obj3, null), 3));
                        arrayList = arrayList2;
                        o0Var = o0Var2;
                        bundle = bundle;
                        obj2 = obj3;
                        i3 = i3;
                        context = context;
                        i2 = 1;
                        it = it2;
                    }
                    this.h = i2;
                    a = com.amazon.aps.iva.se0.d.a(arrayList, this);
                    if (a == aVar) {
                        return aVar;
                    }
                }
                List list = (List) a;
                com.amazon.aps.iva.kb0.j jVar = (com.amazon.aps.iva.kb0.j) com.amazon.aps.iva.lb0.x.R0(list);
                if (jVar == null || (remoteViews = (RemoteViews) jVar.c) == null) {
                    return new RemoteViews(com.amazon.aps.iva.lb0.i0.Z(list));
                }
                return remoteViews;
            }
        }

        public final Object a(z zVar, Context context, int i, Object obj, Bundle bundle, Collection<com.amazon.aps.iva.o2.g> collection, o0 o0Var, com.amazon.aps.iva.ob0.d<? super RemoteViews> dVar) {
            return com.amazon.aps.iva.e.z.p(new C0664a(zVar, context, i, obj, bundle, collection, o0Var, null), dVar);
        }
    }

    /* compiled from: GlanceAppWidget.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidget", f = "GlanceAppWidget.kt", l = {192, 195, 197, 197}, m = "compose$glance_appwidget_release")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public Context i;
        public AppWidgetManager j;
        public Object k;
        public Bundle l;
        public int m;
        public /* synthetic */ Object n;
        public int p;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.n = obj;
            this.p |= Integer.MIN_VALUE;
            return z.this.d(null, null, 0, null, null, this);
        }
    }

    /* compiled from: GlanceAppWidget.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidget$composeForSize$2", f = "GlanceAppWidget.kt", l = {376}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super RemoteViews>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ int j;
        public final /* synthetic */ z k;
        public final /* synthetic */ Context l;
        public final /* synthetic */ Bundle m;
        public final /* synthetic */ Object n;
        public final /* synthetic */ long o;
        public final /* synthetic */ o0 p;

        /* compiled from: GlanceAppWidget.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidget$composeForSize$2$1", f = "GlanceAppWidget.kt", l = {374}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public final /* synthetic */ m2 i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m2 m2Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
                super(2, dVar);
                this.i = m2Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new a(this.i, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    this.h = 1;
                    if (this.i.C(this) == aVar) {
                        return aVar;
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, long j, Context context, Bundle bundle, z zVar, o0 o0Var, Object obj, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.j = i;
            this.k = zVar;
            this.l = context;
            this.m = bundle;
            this.n = obj;
            this.o = j;
            this.p = o0Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            int i = this.j;
            z zVar = this.k;
            c cVar = new c(i, this.o, this.l, this.m, zVar, this.p, this.n, dVar);
            cVar.i = obj;
            return cVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super RemoteViews> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            t1 t1Var;
            int i;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i2 = this.h;
            boolean z = true;
            if (i2 != 0) {
                if (i2 == 1) {
                    t1Var = (t1) this.i;
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.se0.g0 g0Var = (com.amazon.aps.iva.se0.g0) this.i;
                t1 t1Var2 = new t1();
                com.amazon.aps.iva.p4.b bVar = new com.amazon.aps.iva.p4.b(t1Var2);
                m2 m2Var = new m2(g0Var.getCoroutineContext());
                com.amazon.aps.iva.o0.i0 a2 = com.amazon.aps.iva.o0.j0.a(bVar, m2Var);
                com.amazon.aps.iva.r4.b bVar2 = new com.amazon.aps.iva.r4.b(this.j);
                z zVar = this.k;
                Context context = this.l;
                Bundle bundle = this.m;
                Object obj2 = this.n;
                long j = this.o;
                zVar.getClass();
                a2.m(com.amazon.aps.iva.v0.b.c(-1333538889, new d0(context, bVar2, bundle, obj2, j, zVar), true));
                com.amazon.aps.iva.se0.i.d(g0Var, null, null, new a(m2Var, null), 3);
                com.amazon.aps.iva.se0.m1 m1Var = m2Var.s;
                m1Var.getClass();
                Object obj3 = com.amazon.aps.iva.kb0.q.a;
                if (m1Var.g0(obj3)) {
                    synchronized (m2Var.b) {
                        m2Var.o = true;
                    }
                }
                this.i = t1Var2;
                this.h = 1;
                Object r = com.amazon.aps.iva.dg.b.r(m2Var.r, new o2(null), this);
                if (r == aVar) {
                    obj3 = r;
                }
                if (obj3 == aVar) {
                    return aVar;
                }
                t1Var = t1Var2;
            }
            com.amazon.aps.iva.yb0.j.f(t1Var, "root");
            ArrayList arrayList = t1Var.c;
            if (arrayList.size() != 1) {
                com.amazon.aps.iva.y4.g gVar = new com.amazon.aps.iva.y4.g();
                com.amazon.aps.iva.lb0.t.d0(gVar.c, arrayList);
                arrayList.clear();
                arrayList.add(gVar);
            }
            com.amazon.aps.iva.hc.m.p(t1Var);
            com.amazon.aps.iva.hc.m.y(t1Var, f1.h);
            Context context2 = this.l;
            int i3 = this.j;
            o0 o0Var = this.p;
            if (o0Var != null) {
                i = o0Var.a(t1Var);
            } else {
                i = 0;
            }
            long j2 = this.o;
            com.amazon.aps.iva.yb0.j.f(context2, "context");
            if (context2.getResources().getConfiguration().getLayoutDirection() != 1) {
                z = false;
            }
            return com.amazon.aps.iva.n1.c.q(new a2(context2, i3, z, o0Var, -1, false, new AtomicInteger(0), new n0(0, 0, null, 7), new AtomicBoolean(false), j2, -1, -1, false, null, false, false), t1Var.c, i);
        }
    }

    /* compiled from: GlanceAppWidget.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidget", f = "GlanceAppWidget.kt", l = {118, 125, 125, 125, 125}, m = "deleted$glance_appwidget_release")
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.qb0.c {
        public z h;
        public Context i;
        public int j;
        public /* synthetic */ Object k;
        public int m;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return z.this.g(null, 0, this);
        }
    }

    public z() {
        this(0);
    }

    public static final RemoteViews b(z zVar, List list) {
        zVar.getClass();
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                if (size == 2) {
                    return new RemoteViews((RemoteViews) list.get(0), (RemoteViews) list.get(1));
                }
                throw new IllegalArgumentException("There must be between 0 and 2 views.");
            }
            return (RemoteViews) list.get(0);
        }
        return null;
    }

    public static long c(DisplayMetrics displayMetrics, AppWidgetManager appWidgetManager, int i) {
        int i2;
        com.amazon.aps.iva.yb0.j.f(appWidgetManager, "appWidgetManager");
        AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(i);
        if (appWidgetInfo == null) {
            return com.amazon.aps.iva.o2.g.b;
        }
        int i3 = appWidgetInfo.minWidth;
        int i4 = Integer.MAX_VALUE;
        if ((appWidgetInfo.resizeMode & 1) != 0) {
            i2 = appWidgetInfo.minResizeWidth;
        } else {
            i2 = Integer.MAX_VALUE;
        }
        int min = Math.min(i3, i2);
        int i5 = appWidgetInfo.minHeight;
        if ((appWidgetInfo.resizeMode & 2) != 0) {
            i4 = appWidgetInfo.minResizeHeight;
        }
        int min2 = Math.min(i5, i4);
        float f = displayMetrics.density;
        return com.amazon.aps.iva.ee0.f1.f(min / f, min2 / f);
    }

    public abstract void a(com.amazon.aps.iva.o0.i iVar, int i);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.amazon.aps.iva.r4.o0] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.amazon.aps.iva.r4.o0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.content.Context, android.os.Bundle, java.lang.Object, android.appwidget.AppWidgetManager] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.amazon.aps.iva.r4.o0$a] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r18, android.appwidget.AppWidgetManager r19, int r20, java.lang.Object r21, android.os.Bundle r22, com.amazon.aps.iva.ob0.d<? super android.widget.RemoteViews> r23) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r4.z.d(android.content.Context, android.appwidget.AppWidgetManager, int, java.lang.Object, android.os.Bundle, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public final Object e(Context context, AppWidgetManager appWidgetManager, int i, Object obj, Bundle bundle, o0 o0Var, b bVar) {
        w1 h = h();
        if (h instanceof w1.b) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            com.amazon.aps.iva.yb0.j.e(displayMetrics, "context.resources.displayMetrics");
            return f(context, i, obj, bundle, c(displayMetrics, appWidgetManager, i), o0Var, bVar);
        } else if (h instanceof w1.a) {
            if (Build.VERSION.SDK_INT >= 31) {
                return a.a.a(this, context, i, obj, bundle, ((w1.a) h).a, o0Var, bVar);
            }
            return com.amazon.aps.iva.e.z.p(new a0(((w1.a) h).a, bundle, this, context, i, obj, o0Var, null), bVar);
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
    }

    public final Object f(Context context, int i, Object obj, Bundle bundle, long j, o0 o0Var, com.amazon.aps.iva.ob0.d<? super RemoteViews> dVar) {
        return com.amazon.aps.iva.se0.i.g(dVar, new com.amazon.aps.iva.o0.e(null), new c(i, j, context, bundle, this, o0Var, obj, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.content.Context r9, int r10, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.amazon.aps.iva.r4.z.d
            if (r0 == 0) goto L13
            r0 = r11
            com.amazon.aps.iva.r4.z$d r0 = (com.amazon.aps.iva.r4.z.d) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.r4.z$d r0 = new com.amazon.aps.iva.r4.z$d
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4e
            if (r2 == r6) goto L44
            if (r2 == r5) goto L40
            if (r2 == r4) goto L40
            if (r2 == r3) goto L40
            r9 = 5
            if (r2 == r9) goto L38
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            com.amazon.aps.iva.r4.z r9 = r0.h
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            com.amazon.aps.iva.ab.x.i0(r11)
            throw r9
        L40:
            com.amazon.aps.iva.ab.x.i0(r11)
            goto Lac
        L44:
            int r10 = r0.j
            android.content.Context r9 = r0.i
            com.amazon.aps.iva.r4.z r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r11)     // Catch: java.lang.Throwable -> L79 java.util.concurrent.CancellationException -> L93
            goto L5f
        L4e:
            com.amazon.aps.iva.ab.x.i0(r11)
            r0.h = r8     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L92
            r0.i = r9     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L92
            r0.j = r10     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L92
            r0.m = r6     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L92
            com.amazon.aps.iva.kb0.q r11 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L92
            if (r11 != r1) goto L5e
            return r1
        L5e:
            r2 = r8
        L5f:
            com.amazon.aps.iva.z4.b r11 = r2.i()
            if (r11 == 0) goto Lac
            com.amazon.aps.iva.z4.a r2 = com.amazon.aps.iva.z4.a.a
            java.lang.String r10 = defpackage.i.u(r10)
            r0.h = r7
            r0.i = r7
            r0.m = r5
            java.lang.Object r9 = r2.a(r9, r11, r10, r0)
            if (r9 != r1) goto Lac
            return r1
        L78:
            r2 = r8
        L79:
            com.amazon.aps.iva.z4.b r11 = r2.i()
            if (r11 == 0) goto Lac
            com.amazon.aps.iva.z4.a r2 = com.amazon.aps.iva.z4.a.a
            java.lang.String r10 = defpackage.i.u(r10)
            r0.h = r7
            r0.i = r7
            r0.m = r3
            java.lang.Object r9 = r2.a(r9, r11, r10, r0)
            if (r9 != r1) goto Lac
            return r1
        L92:
            r2 = r8
        L93:
            com.amazon.aps.iva.z4.b r11 = r2.i()
            if (r11 == 0) goto Lac
            com.amazon.aps.iva.z4.a r2 = com.amazon.aps.iva.z4.a.a
            java.lang.String r10 = defpackage.i.u(r10)
            r0.h = r7
            r0.i = r7
            r0.m = r4
            java.lang.Object r9 = r2.a(r9, r11, r10, r0)
            if (r9 != r1) goto Lac
            return r1
        Lac:
            com.amazon.aps.iva.kb0.q r9 = com.amazon.aps.iva.kb0.q.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r4.z.g(android.content.Context, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public w1 h() {
        return this.b;
    }

    public com.amazon.aps.iva.z4.b<?> i() {
        return this.c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(3:10|11|12)(2:24|25))(4:26|27|28|(1:30))|13|14|15))|35|6|7|(0)(0)|13|14|15) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(android.content.Context r5, android.appwidget.AppWidgetManager r6, int r7, com.amazon.aps.iva.r4.e0 r8, com.amazon.aps.iva.ob0.d r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.r4.b0
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.r4.b0 r0 = (com.amazon.aps.iva.r4.b0) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            com.amazon.aps.iva.r4.b0 r0 = new com.amazon.aps.iva.r4.b0
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.l
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.n
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r7 = r0.k
            android.appwidget.AppWidgetManager r6 = r0.j
            android.content.Context r5 = r0.i
            com.amazon.aps.iva.r4.z r8 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L64
            goto L64
        L2f:
            r9 = move-exception
            goto L50
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            com.amazon.aps.iva.ab.x.i0(r9)
            r0.h = r4     // Catch: java.lang.Throwable -> L4d java.util.concurrent.CancellationException -> L64
            r0.i = r5     // Catch: java.lang.Throwable -> L4d java.util.concurrent.CancellationException -> L64
            r0.j = r6     // Catch: java.lang.Throwable -> L4d java.util.concurrent.CancellationException -> L64
            r0.k = r7     // Catch: java.lang.Throwable -> L4d java.util.concurrent.CancellationException -> L64
            r0.n = r3     // Catch: java.lang.Throwable -> L4d java.util.concurrent.CancellationException -> L64
            java.lang.Object r5 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L4d java.util.concurrent.CancellationException -> L64
            if (r5 != r1) goto L64
            return r1
        L4d:
            r8 = move-exception
            r9 = r8
            r8 = r4
        L50:
            int r0 = r8.a
            if (r0 == 0) goto L63
            android.widget.RemoteViews r9 = new android.widget.RemoteViews
            java.lang.String r5 = r5.getPackageName()
            int r8 = r8.a
            r9.<init>(r5, r8)
            r6.updateAppWidget(r7, r9)
            goto L64
        L63:
            throw r9
        L64:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r4.z.j(android.content.Context, android.appwidget.AppWidgetManager, int, com.amazon.aps.iva.r4.e0, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public z(int i) {
        this.a = R.layout.glance_error_layout;
        this.b = w1.b.a;
        this.c = com.amazon.aps.iva.z4.d.a;
    }
}
