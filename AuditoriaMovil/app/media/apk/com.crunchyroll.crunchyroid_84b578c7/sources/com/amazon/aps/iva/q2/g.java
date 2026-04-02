package com.amazon.aps.iva.q2;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.l0;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.u0;
import com.amazon.aps.iva.o0.v0;
import com.amazon.aps.iva.o0.w0;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.c0;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.e0;
import com.amazon.aps.iva.s1.f0;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.u1.e;
import com.google.android.gms.cast.MediaError;
import java.util.List;
import java.util.UUID;
/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes.dex */
public final class g {
    public static final w0 a = l0.b(a.h);

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<v0, u0> {
        public final /* synthetic */ t h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ z j;
        public final /* synthetic */ String k;
        public final /* synthetic */ com.amazon.aps.iva.o2.l l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, z zVar, String str, com.amazon.aps.iva.o2.l lVar) {
            super(1);
            this.h = tVar;
            this.i = aVar;
            this.j = zVar;
            this.k = str;
            this.l = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final u0 invoke(v0 v0Var) {
            com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
            t tVar = this.h;
            tVar.o.addView(tVar, tVar.p);
            tVar.l(this.i, this.j, this.k, this.l);
            return new com.amazon.aps.iva.q2.h(tVar);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ t h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ z j;
        public final /* synthetic */ String k;
        public final /* synthetic */ com.amazon.aps.iva.o2.l l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t tVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, z zVar, String str, com.amazon.aps.iva.o2.l lVar) {
            super(0);
            this.h = tVar;
            this.i = aVar;
            this.j = zVar;
            this.k = str;
            this.l = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.l(this.i, this.j, this.k, this.l);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<v0, u0> {
        public final /* synthetic */ t h;
        public final /* synthetic */ y i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(t tVar, y yVar) {
            super(1);
            this.h = tVar;
            this.i = yVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final u0 invoke(v0 v0Var) {
            com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
            t tVar = this.h;
            tVar.setPositionProvider(this.i);
            tVar.o();
            return new com.amazon.aps.iva.q2.i();
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", l = {MediaError.DetailedErrorCode.SEGMENT_NETWORK}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ t j;

        /* compiled from: AndroidPopup.android.kt */
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Long, com.amazon.aps.iva.kb0.q> {
            public static final a h = new a();

            public a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(Long l) {
                l.longValue();
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(t tVar, com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(2, dVar);
            this.j = tVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            e eVar = new e(this.j, dVar);
            eVar.i = obj;
            return eVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((e) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:17:0x004f). Please submit an issue!!! */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r9.h
                r2 = 1
                if (r1 == 0) goto L1a
                if (r1 != r2) goto L12
                java.lang.Object r1 = r9.i
                com.amazon.aps.iva.se0.g0 r1 = (com.amazon.aps.iva.se0.g0) r1
                com.amazon.aps.iva.ab.x.i0(r10)
                r10 = r9
                goto L4f
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                com.amazon.aps.iva.ab.x.i0(r10)
                java.lang.Object r10 = r9.i
                com.amazon.aps.iva.se0.g0 r10 = (com.amazon.aps.iva.se0.g0) r10
                r1 = r10
                r10 = r9
            L23:
                boolean r3 = com.amazon.aps.iva.e.z.E(r1)
                if (r3 == 0) goto L69
                r10.i = r1
                r10.h = r2
                com.amazon.aps.iva.ob0.g r3 = r10.getContext()
                com.amazon.aps.iva.v1.q1$a r4 = com.amazon.aps.iva.v1.q1.a.b
                com.amazon.aps.iva.ob0.g$b r3 = r3.get(r4)
                com.amazon.aps.iva.v1.q1 r3 = (com.amazon.aps.iva.v1.q1) r3
                com.amazon.aps.iva.q2.g$e$a r4 = com.amazon.aps.iva.q2.g.e.a.h
                if (r3 != 0) goto L42
                java.lang.Object r3 = com.amazon.aps.iva.o0.j1.b(r4, r10)
                goto L4c
            L42:
                com.amazon.aps.iva.v1.r1 r5 = new com.amazon.aps.iva.v1.r1
                r6 = 0
                r5.<init>(r4, r6)
                java.lang.Object r3 = r3.i0()
            L4c:
                if (r3 != r0) goto L4f
                return r0
            L4f:
                com.amazon.aps.iva.q2.t r3 = r10.j
                int[] r4 = r3.z
                r5 = 0
                r6 = r4[r5]
                r7 = r4[r2]
                android.view.View r8 = r3.m
                r8.getLocationOnScreen(r4)
                r5 = r4[r5]
                if (r6 != r5) goto L65
                r4 = r4[r2]
                if (r7 == r4) goto L23
            L65:
                r3.m()
                goto L23
            L69:
                com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q2.g.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.s1.q, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ t h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(t tVar) {
            super(1);
            this.h = tVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.s1.q qVar) {
            com.amazon.aps.iva.s1.q qVar2 = qVar;
            com.amazon.aps.iva.yb0.j.f(qVar2, "childCoordinates");
            com.amazon.aps.iva.s1.q Z = qVar2.Z();
            com.amazon.aps.iva.yb0.j.c(Z);
            this.h.n(Z);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* renamed from: com.amazon.aps.iva.q2.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0633g implements d0 {
        public final /* synthetic */ t a;
        public final /* synthetic */ com.amazon.aps.iva.o2.l b;

        /* compiled from: AndroidPopup.android.kt */
        /* renamed from: com.amazon.aps.iva.q2.g$g$a */
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
            public static final a h = new a();

            public a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
                com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public C0633g(t tVar, com.amazon.aps.iva.o2.l lVar) {
            this.a = tVar;
            this.b = lVar;
        }

        @Override // com.amazon.aps.iva.s1.d0
        public final e0 d(f0 f0Var, List<? extends c0> list, long j) {
            com.amazon.aps.iva.yb0.j.f(f0Var, "$this$Layout");
            com.amazon.aps.iva.yb0.j.f(list, "<anonymous parameter 0>");
            this.a.setParentLayoutDirection(this.b);
            return f0Var.F0(0, 0, com.amazon.aps.iva.lb0.a0.b, a.h);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ y h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ z j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(y yVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, z zVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i, int i2) {
            super(2);
            this.h = yVar;
            this.i = aVar;
            this.j = zVar;
            this.k = pVar;
            this.l = i;
            this.m = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            g.a(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1), this.m);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<UUID> {
        public static final i h = new i();

        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ t h;
        public final /* synthetic */ p3<com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q>> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(t tVar, q1 q1Var) {
            super(2);
            this.h = tVar;
            this.i = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            float f;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                com.amazon.aps.iva.a1.f a = com.amazon.aps.iva.a2.o.a(f.a.c, false, com.amazon.aps.iva.q2.j.h);
                t tVar = this.h;
                com.amazon.aps.iva.a1.f K = com.amazon.aps.iva.e.z.K(a, new k(tVar));
                if (tVar.getCanCalculatePosition()) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                com.amazon.aps.iva.a1.f j = defpackage.i.j(K, f);
                com.amazon.aps.iva.v0.a b = com.amazon.aps.iva.v0.b.b(iVar2, 606497925, new l(this.i));
                iVar2.s(1406149896);
                m mVar = m.a;
                iVar2.s(-1323940314);
                int S = com.amazon.aps.iva.cq.b.S(iVar2);
                c2 l = iVar2.l();
                com.amazon.aps.iva.u1.e.o0.getClass();
                e.a aVar = e.a.b;
                com.amazon.aps.iva.v0.a a2 = com.amazon.aps.iva.s1.u.a(j);
                if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                    iVar2.z();
                    if (iVar2.e()) {
                        iVar2.w(aVar);
                    } else {
                        iVar2.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(iVar2, mVar, e.a.e);
                    com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                    e.a.C0752a c0752a = e.a.f;
                    if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S))) {
                        b2.c(S, iVar2, S, c0752a);
                    }
                    a2.invoke(new x2(iVar2), iVar2, 0);
                    iVar2.s(2058660585);
                    b.invoke(iVar2, 6);
                    iVar2.G();
                    iVar2.o();
                    iVar2.G();
                    iVar2.G();
                } else {
                    com.amazon.aps.iva.cq.b.W();
                    throw null;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.q2.y r21, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r22, com.amazon.aps.iva.q2.z r23, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r24, com.amazon.aps.iva.o0.i r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q2.g.a(com.amazon.aps.iva.q2.y, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.q2.z, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final boolean b(View view) {
        WindowManager.LayoutParams layoutParams;
        com.amazon.aps.iva.yb0.j.f(view, "<this>");
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }
}
