package androidx.compose.foundation;

import androidx.compose.foundation.a;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.b0.a1;
import com.amazon.aps.iva.b0.h0;
import com.amazon.aps.iva.b0.w0;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.p1.f0;
/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public final class j extends androidx.compose.foundation.b {
    public com.amazon.aps.iva.xb0.a<q> w;
    public com.amazon.aps.iva.xb0.a<q> x;

    /* compiled from: Clickable.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.e1.c cVar) {
            long j = cVar.a;
            com.amazon.aps.iva.xb0.a<q> aVar = j.this.x;
            if (aVar != null) {
                aVar.invoke();
            }
            return q.a;
        }
    }

    /* compiled from: Clickable.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.e1.c cVar) {
            long j = cVar.a;
            com.amazon.aps.iva.xb0.a<q> aVar = j.this.w;
            if (aVar != null) {
                aVar.invoke();
            }
            return q.a;
        }
    }

    /* compiled from: Clickable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.CombinedClickablePointerInputNode$pointerInput$4", f = "Clickable.kt", l = {936}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<h0, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public /* synthetic */ h0 i;
        public /* synthetic */ long j;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final Object invoke(h0 h0Var, com.amazon.aps.iva.e1.c cVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            long j = cVar.a;
            c cVar2 = new c(dVar);
            cVar2.i = h0Var;
            cVar2.j = j;
            return cVar2.invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                h0 h0Var = this.i;
                long j = this.j;
                j jVar = j.this;
                if (jVar.q) {
                    this.h = 1;
                    if (jVar.u1(h0Var, j, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return q.a;
        }
    }

    /* compiled from: Clickable.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.e1.c cVar) {
            long j = cVar.a;
            j jVar = j.this;
            if (jVar.q) {
                jVar.s.invoke();
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z, com.amazon.aps.iva.c0.l lVar, com.amazon.aps.iva.xb0.a<q> aVar, a.C0010a c0010a, com.amazon.aps.iva.xb0.a<q> aVar2, com.amazon.aps.iva.xb0.a<q> aVar3) {
        super(z, lVar, aVar, c0010a);
        com.amazon.aps.iva.yb0.j.f(lVar, "interactionSource");
        com.amazon.aps.iva.yb0.j.f(aVar, "onClick");
        com.amazon.aps.iva.yb0.j.f(c0010a, "interactionData");
        this.w = aVar2;
        this.x = aVar3;
    }

    @Override // androidx.compose.foundation.b
    public final Object v1(f0 f0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        a aVar;
        b bVar;
        long a2 = f0Var.a();
        long e = w.e(((int) (a2 >> 32)) / 2, com.amazon.aps.iva.o2.j.b(a2) / 2);
        this.t.c = com.amazon.aps.iva.e1.d.d((int) (e >> 32), com.amazon.aps.iva.o2.h.b(e));
        if (this.q && this.x != null) {
            aVar = new a();
        } else {
            aVar = null;
        }
        if (this.q && this.w != null) {
            bVar = new b();
        } else {
            bVar = null;
        }
        c cVar = new c(null);
        d dVar2 = new d();
        w0.a aVar2 = w0.a;
        Object p = z.p(new a1(f0Var, null, bVar, aVar, dVar2, cVar), dVar);
        com.amazon.aps.iva.pb0.a aVar3 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        if (p != aVar3) {
            p = q.a;
        }
        if (p == aVar3) {
            return p;
        }
        return q.a;
    }
}
