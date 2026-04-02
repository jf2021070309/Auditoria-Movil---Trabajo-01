package androidx.compose.foundation;

import androidx.compose.foundation.a;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.b0.h0;
import com.amazon.aps.iva.b0.i0;
import com.amazon.aps.iva.b0.w0;
import com.amazon.aps.iva.b0.z0;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.p1.f0;
import com.amazon.aps.iva.xb0.q;
/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public final class h extends androidx.compose.foundation.b {

    /* compiled from: Clickable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.ClickablePointerInputNode$pointerInput$2", f = "Clickable.kt", l = {892}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements q<h0, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ h0 i;
        public /* synthetic */ long j;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final Object invoke(h0 h0Var, com.amazon.aps.iva.e1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            long j = cVar.a;
            a aVar = new a(dVar);
            aVar.i = h0Var;
            aVar.j = j;
            return aVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                h hVar = h.this;
                if (hVar.q) {
                    this.h = 1;
                    if (hVar.u1(h0Var, j, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Clickable.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e1.c cVar) {
            long j = cVar.a;
            h hVar = h.this;
            if (hVar.q) {
                hVar.s.invoke();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z, com.amazon.aps.iva.c0.l lVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, a.C0010a c0010a) {
        super(z, lVar, aVar, c0010a);
        com.amazon.aps.iva.yb0.j.f(lVar, "interactionSource");
        com.amazon.aps.iva.yb0.j.f(aVar, "onClick");
        com.amazon.aps.iva.yb0.j.f(c0010a, "interactionData");
    }

    @Override // androidx.compose.foundation.b
    public final Object v1(f0 f0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        long a2 = f0Var.a();
        long e = w.e(((int) (a2 >> 32)) / 2, com.amazon.aps.iva.o2.j.b(a2) / 2);
        this.t.c = com.amazon.aps.iva.e1.d.d((int) (e >> 32), com.amazon.aps.iva.o2.h.b(e));
        a aVar = new a(null);
        b bVar = new b();
        w0.a aVar2 = w0.a;
        Object p = z.p(new z0(f0Var, aVar, bVar, new i0(f0Var), null), dVar);
        com.amazon.aps.iva.pb0.a aVar3 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        if (p != aVar3) {
            p = com.amazon.aps.iva.kb0.q.a;
        }
        if (p == aVar3) {
            return p;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
