package com.amazon.aps.iva.j1;

import android.graphics.Canvas;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.f1.y;
import com.amazon.aps.iva.h1.a;
import com.amazon.aps.iva.o0.y1;
/* compiled from: Vector.kt */
/* loaded from: classes.dex */
public final class k extends i {
    public final com.amazon.aps.iva.j1.c b;
    public boolean c;
    public final com.amazon.aps.iva.j1.a d;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> e;
    public final y1 f;
    public float g;
    public float h;
    public long i;
    public final a j;

    /* compiled from: Vector.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.e, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.h1.e eVar) {
            com.amazon.aps.iva.h1.e eVar2 = eVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$null");
            k.this.b.a(eVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Vector.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public static final b h = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke() {
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Vector.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            k kVar = k.this;
            kVar.c = true;
            kVar.e.invoke();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public k() {
        com.amazon.aps.iva.j1.c cVar = new com.amazon.aps.iva.j1.c();
        cVar.j = 0.0f;
        cVar.p = true;
        cVar.c();
        cVar.k = 0.0f;
        cVar.p = true;
        cVar.c();
        cVar.d(new c());
        this.b = cVar;
        this.c = true;
        this.d = new com.amazon.aps.iva.j1.a();
        this.e = b.h;
        this.f = com.amazon.aps.iva.cq.b.c0(null);
        this.i = com.amazon.aps.iva.e1.g.c;
        this.j = new a();
    }

    @Override // com.amazon.aps.iva.j1.i
    public final void a(com.amazon.aps.iva.h1.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "<this>");
        e(eVar, 1.0f, null);
    }

    public final void e(com.amazon.aps.iva.h1.e eVar, float f, y yVar) {
        y yVar2;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(eVar, "<this>");
        if (yVar == null) {
            yVar2 = (y) this.f.getValue();
        } else {
            yVar2 = yVar;
        }
        boolean z2 = this.c;
        com.amazon.aps.iva.j1.a aVar = this.d;
        if (!z2 && com.amazon.aps.iva.e1.g.a(this.i, eVar.h())) {
            z = false;
        } else {
            float d = com.amazon.aps.iva.e1.g.d(eVar.h()) / this.g;
            com.amazon.aps.iva.j1.c cVar = this.b;
            cVar.l = d;
            cVar.p = true;
            cVar.c();
            cVar.m = com.amazon.aps.iva.e1.g.b(eVar.h()) / this.h;
            cVar.p = true;
            cVar.c();
            long a2 = com.amazon.aps.iva.o2.k.a((int) Math.ceil(com.amazon.aps.iva.e1.g.d(eVar.h())), (int) Math.ceil(com.amazon.aps.iva.e1.g.b(eVar.h())));
            com.amazon.aps.iva.o2.l layoutDirection = eVar.getLayoutDirection();
            aVar.getClass();
            com.amazon.aps.iva.yb0.j.f(layoutDirection, "layoutDirection");
            a aVar2 = this.j;
            com.amazon.aps.iva.yb0.j.f(aVar2, "block");
            aVar.c = eVar;
            com.amazon.aps.iva.f1.i iVar = aVar.a;
            com.amazon.aps.iva.f1.g gVar = aVar.b;
            if (iVar == null || gVar == null || ((int) (a2 >> 32)) > iVar.getWidth() || com.amazon.aps.iva.o2.j.b(a2) > iVar.getHeight()) {
                iVar = com.amazon.aps.iva.aq.j.f((int) (a2 >> 32), com.amazon.aps.iva.o2.j.b(a2), 0, 28);
                Canvas canvas = com.amazon.aps.iva.f1.h.a;
                gVar = new com.amazon.aps.iva.f1.g();
                gVar.a = new Canvas(com.amazon.aps.iva.f1.j.a(iVar));
                aVar.a = iVar;
                aVar.b = gVar;
            }
            aVar.d = a2;
            long b2 = com.amazon.aps.iva.o2.k.b(a2);
            com.amazon.aps.iva.h1.a aVar3 = aVar.e;
            a.C0315a c0315a = aVar3.b;
            com.amazon.aps.iva.o2.c cVar2 = c0315a.a;
            com.amazon.aps.iva.o2.l lVar = c0315a.b;
            com.amazon.aps.iva.f1.u uVar = c0315a.c;
            long j = c0315a.d;
            c0315a.a = eVar;
            c0315a.b = layoutDirection;
            c0315a.c = gVar;
            c0315a.d = b2;
            gVar.n();
            com.amazon.aps.iva.h1.e.H(aVar3, x.b, 0L, 0L, 0.0f, null, 62);
            aVar2.invoke(aVar3);
            gVar.g();
            a.C0315a c0315a2 = aVar3.b;
            c0315a2.getClass();
            com.amazon.aps.iva.yb0.j.f(cVar2, "<set-?>");
            c0315a2.a = cVar2;
            com.amazon.aps.iva.yb0.j.f(lVar, "<set-?>");
            c0315a2.b = lVar;
            com.amazon.aps.iva.yb0.j.f(uVar, "<set-?>");
            c0315a2.c = uVar;
            c0315a2.d = j;
            iVar.a.prepareToDraw();
            z = false;
            this.c = false;
            this.i = eVar.h();
        }
        aVar.getClass();
        com.amazon.aps.iva.f1.i iVar2 = aVar.a;
        if (iVar2 != null) {
            z = true;
        }
        if (z) {
            com.amazon.aps.iva.h1.e.I(eVar, iVar2, 0L, aVar.d, 0L, 0L, f, null, yVar2, 0, 0, 858);
            return;
        }
        throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
    }

    public final String toString() {
        String str = "Params: \tname: " + this.b.h + "\n\tviewportWidth: " + this.g + "\n\tviewportHeight: " + this.h + "\n";
        com.amazon.aps.iva.yb0.j.e(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
