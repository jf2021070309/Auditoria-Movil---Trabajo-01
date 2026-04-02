package com.amazon.aps.iva.v1;

import android.os.Looper;
import android.view.View;
import androidx.lifecycle.g;
import com.amazon.aps.iva.a1.h;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.f1;
import com.amazon.aps.iva.o0.i1;
import com.amazon.aps.iva.o0.m2;
import com.amazon.aps.iva.o0.z1;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.h0;
import com.amazon.aps.iva.se0.m;
import com.amazon.aps.iva.v1.y1;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.d0;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: WindowRecomposer.android.kt */
/* loaded from: classes.dex */
public interface c3 {
    public static final a a = a.a;

    /* compiled from: WindowRecomposer.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        /* compiled from: WindowRecomposer.android.kt */
        /* renamed from: com.amazon.aps.iva.v1.c3$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0777a implements c3 {
            public static final C0777a b = new C0777a();

            /* JADX WARN: Type inference failed for: r6v5, types: [com.amazon.aps.iva.v1.y1, T] */
            @Override // com.amazon.aps.iva.v1.c3
            public final com.amazon.aps.iva.o0.m2 a(final View view) {
                boolean z;
                com.amazon.aps.iva.ob0.g gVar;
                final com.amazon.aps.iva.o0.z1 z1Var;
                LinkedHashMap linkedHashMap = j3.a;
                com.amazon.aps.iva.ob0.h hVar = com.amazon.aps.iva.ob0.h.b;
                com.amazon.aps.iva.kb0.m mVar = t0.m;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    gVar = (com.amazon.aps.iva.ob0.g) t0.m.getValue();
                } else {
                    gVar = t0.n.get();
                    if (gVar == null) {
                        throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
                    }
                }
                com.amazon.aps.iva.ob0.g plus = gVar.plus(hVar);
                com.amazon.aps.iva.o0.i1 i1Var = (com.amazon.aps.iva.o0.i1) plus.get(i1.a.b);
                androidx.lifecycle.g gVar2 = null;
                if (i1Var != null) {
                    com.amazon.aps.iva.o0.z1 z1Var2 = new com.amazon.aps.iva.o0.z1(i1Var);
                    com.amazon.aps.iva.o0.f1 f1Var = z1Var2.c;
                    synchronized (f1Var.a) {
                        f1Var.d = false;
                        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                    }
                    z1Var = z1Var2;
                } else {
                    z1Var = null;
                }
                final com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
                com.amazon.aps.iva.a1.h hVar2 = (com.amazon.aps.iva.a1.h) plus.get(h.a.b);
                com.amazon.aps.iva.a1.h hVar3 = hVar2;
                if (hVar2 == null) {
                    ?? y1Var = new y1();
                    d0Var.b = y1Var;
                    hVar3 = y1Var;
                }
                if (z1Var != null) {
                    hVar = z1Var;
                }
                com.amazon.aps.iva.ob0.g plus2 = plus.plus(hVar).plus(hVar3);
                final com.amazon.aps.iva.o0.m2 m2Var = new com.amazon.aps.iva.o0.m2(plus2);
                synchronized (m2Var.b) {
                    m2Var.q = true;
                    com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
                }
                final com.amazon.aps.iva.xe0.d i = com.amazon.aps.iva.e.z.i(plus2);
                com.amazon.aps.iva.i5.o a = com.amazon.aps.iva.i5.i0.a(view);
                if (a != null) {
                    gVar2 = a.getLifecycle();
                }
                androidx.lifecycle.g gVar3 = gVar2;
                if (gVar3 != null) {
                    view.addOnAttachStateChangeListener(new g3(view, m2Var));
                    gVar3.addObserver(new androidx.lifecycle.j() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                        /* compiled from: WindowRecomposer.android.kt */
                        /* loaded from: classes.dex */
                        public /* synthetic */ class a {
                            public static final /* synthetic */ int[] a;

                            static {
                                int[] iArr = new int[g.a.values().length];
                                try {
                                    iArr[g.a.ON_CREATE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[g.a.ON_START.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[g.a.ON_STOP.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                try {
                                    iArr[g.a.ON_DESTROY.ordinal()] = 4;
                                } catch (NoSuchFieldError unused4) {
                                }
                                try {
                                    iArr[g.a.ON_PAUSE.ordinal()] = 5;
                                } catch (NoSuchFieldError unused5) {
                                }
                                try {
                                    iArr[g.a.ON_RESUME.ordinal()] = 6;
                                } catch (NoSuchFieldError unused6) {
                                }
                                try {
                                    iArr[g.a.ON_ANY.ordinal()] = 7;
                                } catch (NoSuchFieldError unused7) {
                                }
                                a = iArr;
                            }
                        }

                        /* compiled from: WindowRecomposer.android.kt */
                        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {394}, m = "invokeSuspend")
                        /* loaded from: classes.dex */
                        public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
                            public int h;
                            public /* synthetic */ Object i;
                            public final /* synthetic */ d0<y1> j;
                            public final /* synthetic */ m2 k;
                            public final /* synthetic */ o l;
                            public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 m;
                            public final /* synthetic */ View n;

                            /* compiled from: WindowRecomposer.android.kt */
                            @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {389}, m = "invokeSuspend")
                            /* loaded from: classes.dex */
                            public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
                                public int h;
                                public final /* synthetic */ u0<Float> i;
                                public final /* synthetic */ y1 j;

                                /* compiled from: WindowRecomposer.android.kt */
                                /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a$a  reason: collision with other inner class name */
                                /* loaded from: classes.dex */
                                public static final class C0020a implements com.amazon.aps.iva.ve0.g<Float> {
                                    public final /* synthetic */ y1 b;

                                    public C0020a(y1 y1Var) {
                                        this.b = y1Var;
                                    }

                                    @Override // com.amazon.aps.iva.ve0.g
                                    public final Object a(Float f, com.amazon.aps.iva.ob0.d dVar) {
                                        this.b.b.q(f.floatValue());
                                        return q.a;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public a(u0<Float> u0Var, y1 y1Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
                                    super(2, dVar);
                                    this.i = u0Var;
                                    this.j = y1Var;
                                }

                                @Override // com.amazon.aps.iva.qb0.a
                                public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                                    return new a(this.i, this.j, dVar);
                                }

                                @Override // com.amazon.aps.iva.xb0.p
                                public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
                                    return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
                                }

                                @Override // com.amazon.aps.iva.qb0.a
                                public final Object invokeSuspend(Object obj) {
                                    com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                                    int i = this.h;
                                    if (i != 0) {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        x.i0(obj);
                                    } else {
                                        x.i0(obj);
                                        C0020a c0020a = new C0020a(this.j);
                                        this.h = 1;
                                        if (this.i.c(c0020a, this) == aVar) {
                                            return aVar;
                                        }
                                    }
                                    throw new com.amazon.aps.iva.la.a();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public b(d0<y1> d0Var, m2 m2Var, o oVar, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, com.amazon.aps.iva.ob0.d<? super b> dVar) {
                                super(2, dVar);
                                this.j = d0Var;
                                this.k = m2Var;
                                this.l = oVar;
                                this.m = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
                                this.n = view;
                            }

                            @Override // com.amazon.aps.iva.qb0.a
                            public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                                b bVar = new b(this.j, this.k, this.l, this.m, this.n, dVar);
                                bVar.i = obj;
                                return bVar;
                            }

                            @Override // com.amazon.aps.iva.xb0.p
                            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
                                return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
                            }

                            /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
                            @Override // com.amazon.aps.iva.qb0.a
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                                /*
                                    r10 = this;
                                    com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                                    int r1 = r10.h
                                    androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r2 = r10.m
                                    com.amazon.aps.iva.i5.o r3 = r10.l
                                    r4 = 1
                                    r5 = 0
                                    if (r1 == 0) goto L20
                                    if (r1 != r4) goto L18
                                    java.lang.Object r0 = r10.i
                                    com.amazon.aps.iva.se0.j1 r0 = (com.amazon.aps.iva.se0.j1) r0
                                    com.amazon.aps.iva.ab.x.i0(r11)     // Catch: java.lang.Throwable -> L16
                                    goto L6b
                                L16:
                                    r11 = move-exception
                                    goto L81
                                L18:
                                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                    r11.<init>(r0)
                                    throw r11
                                L20:
                                    com.amazon.aps.iva.ab.x.i0(r11)
                                    java.lang.Object r11 = r10.i
                                    com.amazon.aps.iva.se0.g0 r11 = (com.amazon.aps.iva.se0.g0) r11
                                    com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.v1.y1> r1 = r10.j     // Catch: java.lang.Throwable -> L7f
                                    T r1 = r1.b     // Catch: java.lang.Throwable -> L7f
                                    com.amazon.aps.iva.v1.y1 r1 = (com.amazon.aps.iva.v1.y1) r1     // Catch: java.lang.Throwable -> L7f
                                    if (r1 == 0) goto L5c
                                    android.view.View r6 = r10.n     // Catch: java.lang.Throwable -> L7f
                                    android.content.Context r6 = r6.getContext()     // Catch: java.lang.Throwable -> L7f
                                    android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L7f
                                    java.lang.String r7 = "context.applicationContext"
                                    com.amazon.aps.iva.yb0.j.e(r6, r7)     // Catch: java.lang.Throwable -> L7f
                                    com.amazon.aps.iva.ve0.u0 r6 = com.amazon.aps.iva.v1.j3.a(r6)     // Catch: java.lang.Throwable -> L7f
                                    java.lang.Object r7 = r6.getValue()     // Catch: java.lang.Throwable -> L7f
                                    java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L7f
                                    float r7 = r7.floatValue()     // Catch: java.lang.Throwable -> L7f
                                    com.amazon.aps.iva.o0.v1 r8 = r1.b     // Catch: java.lang.Throwable -> L7f
                                    r8.q(r7)     // Catch: java.lang.Throwable -> L7f
                                    androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a     // Catch: java.lang.Throwable -> L7f
                                    r7.<init>(r6, r1, r5)     // Catch: java.lang.Throwable -> L7f
                                    r1 = 3
                                    com.amazon.aps.iva.se0.c2 r11 = com.amazon.aps.iva.se0.i.d(r11, r5, r5, r7, r1)     // Catch: java.lang.Throwable -> L7f
                                    goto L5d
                                L5c:
                                    r11 = r5
                                L5d:
                                    com.amazon.aps.iva.o0.m2 r1 = r10.k     // Catch: java.lang.Throwable -> L7a
                                    r10.i = r11     // Catch: java.lang.Throwable -> L7a
                                    r10.h = r4     // Catch: java.lang.Throwable -> L7a
                                    java.lang.Object r1 = r1.C(r10)     // Catch: java.lang.Throwable -> L7a
                                    if (r1 != r0) goto L6a
                                    return r0
                                L6a:
                                    r0 = r11
                                L6b:
                                    if (r0 == 0) goto L70
                                    r0.a(r5)
                                L70:
                                    androidx.lifecycle.g r11 = r3.getLifecycle()
                                    r11.removeObserver(r2)
                                    com.amazon.aps.iva.kb0.q r11 = com.amazon.aps.iva.kb0.q.a
                                    return r11
                                L7a:
                                    r0 = move-exception
                                    r9 = r0
                                    r0 = r11
                                    r11 = r9
                                    goto L81
                                L7f:
                                    r11 = move-exception
                                    r0 = r5
                                L81:
                                    if (r0 == 0) goto L86
                                    r0.a(r5)
                                L86:
                                    androidx.lifecycle.g r0 = r3.getLifecycle()
                                    r0.removeObserver(r2)
                                    throw r11
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.b.invokeSuspend(java.lang.Object):java.lang.Object");
                            }
                        }

                        @Override // androidx.lifecycle.j
                        public final void U2(o oVar, g.a aVar) {
                            boolean z2;
                            int i2 = a.a[aVar.ordinal()];
                            m<q> mVar2 = null;
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        if (i2 == 4) {
                                            m2Var.t();
                                            return;
                                        }
                                        return;
                                    }
                                    m2 m2Var2 = m2Var;
                                    synchronized (m2Var2.b) {
                                        m2Var2.q = true;
                                        q qVar3 = q.a;
                                    }
                                    return;
                                }
                                z1 z1Var3 = z1Var;
                                if (z1Var3 != null) {
                                    f1 f1Var2 = z1Var3.c;
                                    synchronized (f1Var2.a) {
                                        synchronized (f1Var2.a) {
                                            z2 = f1Var2.d;
                                        }
                                        if (!z2) {
                                            List<com.amazon.aps.iva.ob0.d<q>> list = f1Var2.b;
                                            f1Var2.b = f1Var2.c;
                                            f1Var2.c = list;
                                            f1Var2.d = true;
                                            int size = list.size();
                                            for (int i3 = 0; i3 < size; i3++) {
                                                list.get(i3).resumeWith(q.a);
                                            }
                                            list.clear();
                                            q qVar4 = q.a;
                                        }
                                    }
                                }
                                m2 m2Var3 = m2Var;
                                synchronized (m2Var3.b) {
                                    if (m2Var3.q) {
                                        m2Var3.q = false;
                                        mVar2 = m2Var3.u();
                                    }
                                }
                                if (mVar2 != null) {
                                    mVar2.resumeWith(q.a);
                                    return;
                                }
                                return;
                            }
                            com.amazon.aps.iva.se0.i.d(i, null, h0.UNDISPATCHED, new b(d0Var, m2Var, oVar, this, view, null), 1);
                        }
                    });
                    return m2Var;
                }
                throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
            }
        }
    }

    com.amazon.aps.iva.o0.m2 a(View view);
}
