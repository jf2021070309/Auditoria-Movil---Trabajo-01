package com.amazon.aps.iva.j0;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.c2.b;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.u1.e;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AnnotatedStringResolveInlineContent.kt */
/* loaded from: classes.dex */
public final class e {
    public static final com.amazon.aps.iva.kb0.j<List<b.C0158b<com.amazon.aps.iva.c2.p>>, List<b.C0158b<com.amazon.aps.iva.xb0.q<String, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q>>>> a;

    /* compiled from: AnnotatedStringResolveInlineContent.kt */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.s1.d0 {
        public static final a a = new a();

        /* compiled from: AnnotatedStringResolveInlineContent.kt */
        /* renamed from: com.amazon.aps.iva.j0.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0390a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ List<com.amazon.aps.iva.s1.u0> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0390a(ArrayList arrayList) {
                super(1);
                this.h = arrayList;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
                u0.a aVar2 = aVar;
                com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
                List<com.amazon.aps.iva.s1.u0> list = this.h;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    u0.a.g(aVar2, list.get(i), 0, 0);
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        @Override // com.amazon.aps.iva.s1.d0
        public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 f0Var, List<? extends com.amazon.aps.iva.s1.c0> list, long j) {
            com.amazon.aps.iva.yb0.j.f(f0Var, "$this$Layout");
            com.amazon.aps.iva.yb0.j.f(list, "children");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).V(j));
            }
            return f0Var.F0(com.amazon.aps.iva.o2.a.h(j), com.amazon.aps.iva.o2.a.g(j), com.amazon.aps.iva.lb0.a0.b, new C0390a(arrayList));
        }
    }

    /* compiled from: AnnotatedStringResolveInlineContent.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.c2.b h;
        public final /* synthetic */ List<b.C0158b<com.amazon.aps.iva.xb0.q<String, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q>>> i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.c2.b bVar, List<b.C0158b<com.amazon.aps.iva.xb0.q<String, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q>>> list, int i) {
            super(2);
            this.h = bVar;
            this.i = list;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            e.a(this.h, this.i, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    static {
        com.amazon.aps.iva.lb0.z zVar = com.amazon.aps.iva.lb0.z.b;
        a = new com.amazon.aps.iva.kb0.j<>(zVar, zVar);
    }

    public static final void a(com.amazon.aps.iva.c2.b bVar, List<b.C0158b<com.amazon.aps.iva.xb0.q<String, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q>>> list, com.amazon.aps.iva.o0.i iVar, int i) {
        com.amazon.aps.iva.yb0.j.f(bVar, "text");
        com.amazon.aps.iva.yb0.j.f(list, "inlineContents");
        com.amazon.aps.iva.o0.j g = iVar.g(-1794596951);
        e0.b bVar2 = com.amazon.aps.iva.o0.e0.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            b.C0158b<com.amazon.aps.iva.xb0.q<String, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q>> c0158b = list.get(i2);
            com.amazon.aps.iva.xb0.q<String, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> qVar = c0158b.a;
            a aVar = a.a;
            g.s(-1323940314);
            f.a aVar2 = f.a.c;
            int S = com.amazon.aps.iva.cq.b.S(g);
            com.amazon.aps.iva.o0.c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar3 = e.a.b;
            com.amazon.aps.iva.v0.a a2 = com.amazon.aps.iva.s1.u.a(aVar2);
            if (g.a instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar3);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, aVar, e.a.e);
                com.amazon.aps.iva.cq.b.k0(g, P, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (g.M || !com.amazon.aps.iva.yb0.j.a(g.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g, S, c0752a);
                }
                a2.invoke(new x2(g), g, 0);
                g.s(2058660585);
                qVar.invoke(bVar.subSequence(c0158b.b, c0158b.c).b, g, 0);
                g.U(false);
                g.U(true);
                g.U(false);
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        e0.b bVar3 = com.amazon.aps.iva.o0.e0.a;
        com.amazon.aps.iva.o0.j2 X = g.X();
        if (X != null) {
            X.d = new b(bVar, list, i);
        }
    }
}
