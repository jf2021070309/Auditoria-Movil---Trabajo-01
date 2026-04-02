package com.amazon.aps.iva.y;

import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.z.a1;
import java.util.LinkedHashMap;
/* compiled from: AnimatedContent.kt */
/* loaded from: classes.dex */
public final class r<S> implements q<S> {
    public final com.amazon.aps.iva.z.a1<S> a;
    public com.amazon.aps.iva.a1.a b;
    public final y1 c;
    public final LinkedHashMap d;
    public p3<com.amazon.aps.iva.o2.j> e;

    /* compiled from: AnimatedContent.kt */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.s1.r0 {
        public boolean c;

        public a(boolean z) {
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.c == ((a) obj).c) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.s1.r0
        public final a h(com.amazon.aps.iva.o2.c cVar) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            return this;
        }

        public final int hashCode() {
            boolean z = this.c;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return defpackage.a.b(new StringBuilder("ChildData(isTarget="), this.c, ')');
        }
    }

    /* compiled from: AnimatedContent.kt */
    /* loaded from: classes.dex */
    public final class b extends a1 {
        public final com.amazon.aps.iva.z.a1<S>.a<com.amazon.aps.iva.o2.j, com.amazon.aps.iva.z.n> c;
        public final p3<d1> d;
        public final /* synthetic */ r<S> e;

        /* compiled from: AnimatedContent.kt */
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ com.amazon.aps.iva.s1.u0 h;
            public final /* synthetic */ long i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.amazon.aps.iva.s1.u0 u0Var, long j) {
                super(1);
                this.h = u0Var;
                this.i = j;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
                com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
                u0.a.e(this.h, this.i, 0.0f);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: AnimatedContent.kt */
        /* renamed from: com.amazon.aps.iva.y.r$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0875b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a1.b<S>, com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.j>> {
            public final /* synthetic */ r<S> h;
            public final /* synthetic */ r<S>.b i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0875b(r<S> rVar, r<S>.b bVar) {
                super(1);
                this.h = rVar;
                this.i = bVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.j> invoke(Object obj) {
                long j;
                com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.j> b;
                a1.b bVar = (a1.b) obj;
                com.amazon.aps.iva.yb0.j.f(bVar, "$this$animate");
                r<S> rVar = this.h;
                p3 p3Var = (p3) rVar.d.get(bVar.c());
                long j2 = 0;
                if (p3Var != null) {
                    j = ((com.amazon.aps.iva.o2.j) p3Var.getValue()).a;
                } else {
                    j = 0;
                }
                p3 p3Var2 = (p3) rVar.d.get(bVar.a());
                if (p3Var2 != null) {
                    j2 = ((com.amazon.aps.iva.o2.j) p3Var2.getValue()).a;
                }
                d1 value = this.i.d.getValue();
                if (value == null || (b = value.b(j, j2)) == null) {
                    return com.amazon.aps.iva.z.k.c(0.0f, null, 7);
                }
                return b;
            }
        }

        /* compiled from: AnimatedContent.kt */
        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<S, com.amazon.aps.iva.o2.j> {
            public final /* synthetic */ r<S> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(r<S> rVar) {
                super(1);
                this.h = rVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.o2.j invoke(Object obj) {
                long j;
                p3 p3Var = (p3) this.h.d.get(obj);
                if (p3Var != null) {
                    j = ((com.amazon.aps.iva.o2.j) p3Var.getValue()).a;
                } else {
                    j = 0;
                }
                return new com.amazon.aps.iva.o2.j(j);
            }
        }

        public b(r rVar, a1.a aVar, q1 q1Var) {
            com.amazon.aps.iva.yb0.j.f(aVar, "sizeAnimation");
            this.e = rVar;
            this.c = aVar;
            this.d = q1Var;
        }

        @Override // com.amazon.aps.iva.s1.v
        public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
            com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
            com.amazon.aps.iva.s1.u0 V = c0Var.V(j);
            r<S> rVar = this.e;
            a1.a.C0904a a2 = this.c.a(new C0875b(rVar, this), new c(rVar));
            rVar.e = a2;
            long a3 = rVar.b.a(com.amazon.aps.iva.o2.k.a(V.b, V.c), ((com.amazon.aps.iva.o2.j) a2.getValue()).a, com.amazon.aps.iva.o2.l.Ltr);
            return f0Var.F0((int) (((com.amazon.aps.iva.o2.j) a2.getValue()).a >> 32), com.amazon.aps.iva.o2.j.b(((com.amazon.aps.iva.o2.j) a2.getValue()).a), com.amazon.aps.iva.lb0.a0.b, new a(V, a3));
        }
    }

    public r(com.amazon.aps.iva.z.a1<S> a1Var, com.amazon.aps.iva.a1.a aVar, com.amazon.aps.iva.o2.l lVar) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "transition");
        com.amazon.aps.iva.yb0.j.f(aVar, "contentAlignment");
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        this.a = a1Var;
        this.b = aVar;
        this.c = com.amazon.aps.iva.cq.b.c0(new com.amazon.aps.iva.o2.j(0L));
        this.d = new LinkedHashMap();
    }

    @Override // com.amazon.aps.iva.z.a1.b
    public final S a() {
        return this.a.c().a();
    }

    @Override // com.amazon.aps.iva.z.a1.b
    public final S c() {
        return this.a.c().c();
    }
}
