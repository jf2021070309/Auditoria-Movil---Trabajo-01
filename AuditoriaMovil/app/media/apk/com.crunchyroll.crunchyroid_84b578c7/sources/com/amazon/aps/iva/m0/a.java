package com.amazon.aps.iva.m0;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.u1.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AlertDialog.kt */
/* loaded from: classes.dex */
public final class a {
    public static final com.amazon.aps.iva.a1.f a;
    public static final com.amazon.aps.iva.a1.f b;
    public static final long c;
    public static final long d;
    public static final long e;

    /* compiled from: AlertDialog.kt */
    /* renamed from: com.amazon.aps.iva.m0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0496a implements com.amazon.aps.iva.s1.d0 {
        public static final C0496a a = new C0496a();

        /* compiled from: AlertDialog.kt */
        /* renamed from: com.amazon.aps.iva.m0.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0497a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ com.amazon.aps.iva.s1.u0 h;
            public final /* synthetic */ int i;
            public final /* synthetic */ com.amazon.aps.iva.s1.u0 j;
            public final /* synthetic */ int k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0497a(com.amazon.aps.iva.s1.u0 u0Var, int i, com.amazon.aps.iva.s1.u0 u0Var2, int i2) {
                super(1);
                this.h = u0Var;
                this.i = i;
                this.j = u0Var2;
                this.k = i2;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
                com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
                com.amazon.aps.iva.s1.u0 u0Var = this.h;
                if (u0Var != null) {
                    u0.a.c(u0Var, 0, this.i, 0.0f);
                }
                com.amazon.aps.iva.s1.u0 u0Var2 = this.j;
                if (u0Var2 != null) {
                    u0.a.c(u0Var2, 0, this.k, 0.0f);
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0104  */
        @Override // com.amazon.aps.iva.s1.d0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 r11, java.util.List<? extends com.amazon.aps.iva.s1.c0> r12, long r13) {
            /*
                Method dump skipped, instructions count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.a.C0496a.d(com.amazon.aps.iva.s1.f0, java.util.List, long):com.amazon.aps.iva.s1.e0");
        }
    }

    /* compiled from: AlertDialog.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.d0.o h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.d0.o oVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar2, int i) {
            super(2);
            this.h = oVar;
            this.i = pVar;
            this.j = pVar2;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.k | 1);
            com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar = this.i;
            com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar2 = this.j;
            a.a(this.h, pVar, pVar2, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AlertDialog.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar2, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar3, int i) {
            super(2);
            this.h = pVar;
            this.i = pVar2;
            this.j = pVar3;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.v0.a aVar;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                iVar2.s(-483455358);
                f.a aVar2 = f.a.c;
                com.amazon.aps.iva.s1.d0 a = com.amazon.aps.iva.d0.m.a(com.amazon.aps.iva.d0.a.c, a.C0097a.m, iVar2);
                iVar2.s(-1323940314);
                int S = com.amazon.aps.iva.cq.b.S(iVar2);
                com.amazon.aps.iva.o0.c2 l = iVar2.l();
                com.amazon.aps.iva.u1.e.o0.getClass();
                e.a aVar3 = e.a.b;
                com.amazon.aps.iva.v0.a a2 = com.amazon.aps.iva.s1.u.a(aVar2);
                com.amazon.aps.iva.v0.a aVar4 = null;
                if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                    iVar2.z();
                    if (iVar2.e()) {
                        iVar2.w(aVar3);
                    } else {
                        iVar2.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(iVar2, a, e.a.e);
                    com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                    e.a.C0752a c0752a = e.a.f;
                    if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S))) {
                        com.amazon.aps.iva.d0.b2.c(S, iVar2, S, c0752a);
                    }
                    com.amazon.aps.iva.b8.i.c(0, a2, new com.amazon.aps.iva.o0.x2(iVar2), iVar2, 2058660585);
                    com.amazon.aps.iva.d0.p pVar = com.amazon.aps.iva.d0.p.a;
                    com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar2 = this.h;
                    int i = this.k;
                    if (pVar2 != null) {
                        aVar = com.amazon.aps.iva.v0.b.b(iVar2, 620104160, new com.amazon.aps.iva.m0.c(i, pVar2));
                    } else {
                        aVar = null;
                    }
                    com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar3 = this.i;
                    if (pVar3 != null) {
                        aVar4 = com.amazon.aps.iva.v0.b.b(iVar2, 1965858367, new com.amazon.aps.iva.m0.e(i, pVar3));
                    }
                    a.a(pVar, aVar, aVar4, iVar2, 6);
                    this.j.invoke(iVar2, Integer.valueOf(i & 14));
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

    /* compiled from: AlertDialog.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> k;
        public final /* synthetic */ com.amazon.aps.iva.f1.u0 l;
        public final /* synthetic */ long m;
        public final /* synthetic */ long n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar2, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar3, com.amazon.aps.iva.f1.u0 u0Var, long j, long j2, int i, int i2) {
            super(2);
            this.h = pVar;
            this.i = fVar;
            this.j = pVar2;
            this.k = pVar3;
            this.l = u0Var;
            this.m = j;
            this.n = j2;
            this.o = i;
            this.p = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            a.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, iVar, com.amazon.aps.iva.ff0.b.I(this.o | 1), this.p);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AlertDialog.kt */
    /* loaded from: classes.dex */
    public static final class e implements com.amazon.aps.iva.s1.d0 {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;

        /* compiled from: AlertDialog.kt */
        /* renamed from: com.amazon.aps.iva.m0.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0498a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ List<List<com.amazon.aps.iva.s1.u0>> h;
            public final /* synthetic */ com.amazon.aps.iva.s1.f0 i;
            public final /* synthetic */ float j;
            public final /* synthetic */ int k;
            public final /* synthetic */ List<Integer> l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0498a(ArrayList arrayList, com.amazon.aps.iva.s1.f0 f0Var, float f, int i, ArrayList arrayList2) {
                super(1);
                this.h = arrayList;
                this.i = f0Var;
                this.j = f;
                this.k = i;
                this.l = arrayList2;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
                com.amazon.aps.iva.s1.f0 f0Var;
                int i;
                com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
                List<List<com.amazon.aps.iva.s1.u0>> list = this.h;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    List<com.amazon.aps.iva.s1.u0> list2 = list.get(i2);
                    int size2 = list2.size();
                    int[] iArr = new int[size2];
                    int i3 = 0;
                    while (true) {
                        f0Var = this.i;
                        if (i3 >= size2) {
                            break;
                        }
                        int i4 = list2.get(i3).b;
                        if (i3 < com.amazon.aps.iva.ee0.f1.B(list2)) {
                            i = f0Var.f0(this.j);
                        } else {
                            i = 0;
                        }
                        iArr[i3] = i4 + i;
                        i3++;
                    }
                    a.C0188a c0188a = com.amazon.aps.iva.d0.a.d;
                    int[] iArr2 = new int[size2];
                    for (int i5 = 0; i5 < size2; i5++) {
                        iArr2[i5] = 0;
                    }
                    c0188a.b(f0Var, this.k, iArr, iArr2);
                    int size3 = list2.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        u0.a.c(list2.get(i6), iArr2[i6], this.l.get(i2).intValue(), 0.0f);
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public e(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public static final void f(ArrayList arrayList, com.amazon.aps.iva.yb0.b0 b0Var, com.amazon.aps.iva.s1.f0 f0Var, float f, ArrayList arrayList2, ArrayList arrayList3, com.amazon.aps.iva.yb0.b0 b0Var2, ArrayList arrayList4, com.amazon.aps.iva.yb0.b0 b0Var3, com.amazon.aps.iva.yb0.b0 b0Var4) {
            if (!arrayList.isEmpty()) {
                b0Var.b = f0Var.f0(f) + b0Var.b;
            }
            arrayList.add(0, com.amazon.aps.iva.lb0.x.X0(arrayList2));
            arrayList3.add(Integer.valueOf(b0Var2.b));
            arrayList4.add(Integer.valueOf(b0Var.b));
            b0Var.b += b0Var2.b;
            b0Var3.b = Math.max(b0Var3.b, b0Var4.b);
            arrayList2.clear();
            b0Var4.b = 0;
            b0Var2.b = 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00be A[SYNTHETIC] */
        @Override // com.amazon.aps.iva.s1.d0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 r26, java.util.List<? extends com.amazon.aps.iva.s1.c0> r27, long r28) {
            /*
                Method dump skipped, instructions count: 319
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.a.e.d(com.amazon.aps.iva.s1.f0, java.util.List, long):com.amazon.aps.iva.s1.e0");
        }
    }

    /* compiled from: AlertDialog.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(float f, float f2, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i) {
            super(2);
            this.h = f;
            this.i = f2;
            this.j = pVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.k | 1);
            float f = this.i;
            com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar = this.j;
            a.c(this.h, f, pVar, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    static {
        f.a aVar = f.a.c;
        float f2 = 24;
        a = androidx.compose.foundation.layout.d.i(aVar, f2, 0.0f, f2, 0.0f, 10);
        b = androidx.compose.foundation.layout.d.i(aVar, f2, 0.0f, f2, 28, 2);
        c = com.amazon.aps.iva.e.z.z(40);
        d = com.amazon.aps.iva.e.z.z(36);
        e = com.amazon.aps.iva.e.z.z(38);
    }

    public static final void a(com.amazon.aps.iva.d0.o oVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar2, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        e.a.d dVar;
        e.a.C0752a c0752a;
        int i3;
        int i4;
        int i5;
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        com.amazon.aps.iva.o0.j g = iVar.g(-555573207);
        if ((i & 14) == 0) {
            if (g.H(oVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (g.v(pVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (g.v(pVar2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && g.h()) {
            g.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.a1.f c2 = oVar.c(f.a.c, false);
            C0496a c0496a = C0496a.a;
            g.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g);
            com.amazon.aps.iva.o0.c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar = e.a.b;
            com.amazon.aps.iva.v0.a a2 = com.amazon.aps.iva.s1.u.a(c2);
            com.amazon.aps.iva.o0.d<?> dVar2 = g.a;
            if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar);
                } else {
                    g.m();
                }
                e.a.b bVar2 = e.a.e;
                com.amazon.aps.iva.cq.b.k0(g, c0496a, bVar2);
                e.a.d dVar3 = e.a.d;
                com.amazon.aps.iva.cq.b.k0(g, P, dVar3);
                e.a.C0752a c0752a2 = e.a.f;
                if (g.M || !com.amazon.aps.iva.yb0.j.a(g.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g, S, c0752a2);
                }
                com.amazon.aps.iva.b6.x.c(0, a2, new com.amazon.aps.iva.o0.x2(g), g, 2058660585, -1160646206);
                com.amazon.aps.iva.a1.b bVar3 = a.C0097a.a;
                if (pVar == null) {
                    c0752a = c0752a2;
                    dVar = dVar3;
                } else {
                    com.amazon.aps.iva.a1.f b2 = oVar.b(androidx.compose.ui.layout.a.b(a, "title"));
                    g.s(733328855);
                    com.amazon.aps.iva.s1.d0 c3 = com.amazon.aps.iva.d0.f.c(bVar3, false, g);
                    g.s(-1323940314);
                    int S2 = com.amazon.aps.iva.cq.b.S(g);
                    com.amazon.aps.iva.o0.c2 P2 = g.P();
                    com.amazon.aps.iva.v0.a a3 = com.amazon.aps.iva.s1.u.a(b2);
                    if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
                        g.z();
                        if (g.M) {
                            g.w(aVar);
                        } else {
                            g.m();
                        }
                        com.amazon.aps.iva.cq.b.k0(g, c3, bVar2);
                        dVar = dVar3;
                        com.amazon.aps.iva.cq.b.k0(g, P2, dVar);
                        if (!g.M && com.amazon.aps.iva.yb0.j.a(g.e0(), Integer.valueOf(S2))) {
                            c0752a = c0752a2;
                        } else {
                            c0752a = c0752a2;
                            defpackage.a.c(S2, g, S2, c0752a);
                        }
                        a3.invoke(new com.amazon.aps.iva.o0.x2(g), g, 0);
                        g.s(2058660585);
                        pVar.invoke(g, 0);
                        g.U(false);
                        g.U(true);
                        g.U(false);
                        g.U(false);
                    } else {
                        com.amazon.aps.iva.cq.b.W();
                        throw null;
                    }
                }
                g.U(false);
                g.s(-1735756597);
                if (pVar2 != null) {
                    com.amazon.aps.iva.a1.f b3 = oVar.b(androidx.compose.ui.layout.a.b(b, "text"));
                    g.s(733328855);
                    com.amazon.aps.iva.s1.d0 c4 = com.amazon.aps.iva.d0.f.c(bVar3, false, g);
                    g.s(-1323940314);
                    int S3 = com.amazon.aps.iva.cq.b.S(g);
                    com.amazon.aps.iva.o0.c2 P3 = g.P();
                    com.amazon.aps.iva.v0.a a4 = com.amazon.aps.iva.s1.u.a(b3);
                    if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
                        g.z();
                        if (g.M) {
                            g.w(aVar);
                        } else {
                            g.m();
                        }
                        com.amazon.aps.iva.cq.b.k0(g, c4, bVar2);
                        com.amazon.aps.iva.cq.b.k0(g, P3, dVar);
                        if (g.M || !com.amazon.aps.iva.yb0.j.a(g.e0(), Integer.valueOf(S3))) {
                            defpackage.a.c(S3, g, S3, c0752a);
                        }
                        a4.invoke(new com.amazon.aps.iva.o0.x2(g), g, 0);
                        g.s(2058660585);
                        pVar2.invoke(g, 0);
                        g.U(false);
                        g.U(true);
                        g.U(false);
                        g.U(false);
                    } else {
                        com.amazon.aps.iva.cq.b.W();
                        throw null;
                    }
                }
                defpackage.c.c(g, false, false, true, false);
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        com.amazon.aps.iva.o0.j2 X = g.X();
        if (X != null) {
            X.d = new b(oVar, pVar, pVar2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r25, com.amazon.aps.iva.a1.f r26, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r27, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r28, com.amazon.aps.iva.f1.u0 r29, long r30, long r32, com.amazon.aps.iva.o0.i r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.a.b(com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.f1.u0, long, long, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final void c(float f2, float f3, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        com.amazon.aps.iva.yb0.j.f(pVar, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.o0.j g = iVar.g(73434452);
        if ((i & 14) == 0) {
            if (g.b(f2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (g.b(f3)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (g.v(pVar)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && g.h()) {
            g.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            e eVar = new e(f2, f3);
            g.s(-1323940314);
            f.a aVar = f.a.c;
            int S = com.amazon.aps.iva.cq.b.S(g);
            com.amazon.aps.iva.o0.c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar2 = e.a.b;
            com.amazon.aps.iva.v0.a a2 = com.amazon.aps.iva.s1.u.a(aVar);
            int i6 = ((((i2 >> 6) & 14) << 9) & 7168) | 6;
            if (g.a instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar2);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, eVar, e.a.e);
                com.amazon.aps.iva.cq.b.k0(g, P, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (g.M || !com.amazon.aps.iva.yb0.j.a(g.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g, S, c0752a);
                }
                defpackage.b.d((i6 >> 3) & 112, a2, new com.amazon.aps.iva.o0.x2(g), g, 2058660585);
                pVar.invoke(g, Integer.valueOf((i6 >> 9) & 14));
                g.U(false);
                g.U(true);
                g.U(false);
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        com.amazon.aps.iva.o0.j2 X = g.X();
        if (X != null) {
            X.d = new f(f2, f3, pVar, i);
        }
    }
}
