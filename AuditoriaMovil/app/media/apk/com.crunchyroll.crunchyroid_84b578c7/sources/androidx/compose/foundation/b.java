package androidx.compose.foundation;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.a;
import com.amazon.aps.iva.a0.w;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.b0.h0;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.p1.f0;
import com.amazon.aps.iva.p1.l0;
import com.amazon.aps.iva.p1.m;
import com.amazon.aps.iva.p1.m0;
import com.amazon.aps.iva.p1.n;
import com.amazon.aps.iva.p1.n0;
import com.amazon.aps.iva.u1.g1;
import com.amazon.aps.iva.xb0.p;
/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public abstract class b extends com.amazon.aps.iva.u1.j implements com.amazon.aps.iva.t1.f, com.amazon.aps.iva.u1.f, g1 {
    public boolean q;
    public com.amazon.aps.iva.c0.l r;
    public com.amazon.aps.iva.xb0.a<q> s;
    public final a.C0010a t;
    public final a u = new a();
    public final m0 v;

    /* compiled from: Clickable.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            boolean z;
            com.amazon.aps.iva.t1.i<Boolean> iVar = androidx.compose.foundation.gestures.a.c;
            b bVar = b.this;
            boolean z2 = true;
            if (!((Boolean) bVar.l(iVar)).booleanValue()) {
                int i = w.b;
                ViewParent parent = ((View) com.amazon.aps.iva.u1.g.a(bVar, androidx.compose.ui.platform.d.f)).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (viewGroup.shouldDelayChildPressedState()) {
                        z = true;
                        break;
                    }
                    parent = viewGroup.getParent();
                }
                z = false;
                if (!z) {
                    z2 = false;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* compiled from: Clickable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.AbstractClickablePointerInputNode$pointerInputNode$1", f = "Clickable.kt", l = {846}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0011b extends com.amazon.aps.iva.qb0.i implements p<f0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public /* synthetic */ Object i;

        public C0011b(com.amazon.aps.iva.ob0.d<? super C0011b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            C0011b c0011b = new C0011b(dVar);
            c0011b.i = obj;
            return c0011b;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(f0 f0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((C0011b) create(f0Var, dVar)).invokeSuspend(q.a);
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
                this.h = 1;
                if (b.this.v1((f0) this.i, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    public b(boolean z, com.amazon.aps.iva.c0.l lVar, com.amazon.aps.iva.xb0.a aVar, a.C0010a c0010a) {
        this.q = z;
        this.r = lVar;
        this.s = aVar;
        this.t = c0010a;
        C0011b c0011b = new C0011b(null);
        m mVar = l0.a;
        n0 n0Var = new n0(c0011b);
        t1(n0Var);
        this.v = n0Var;
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void C0(m mVar, n nVar, long j) {
        com.amazon.aps.iva.yb0.j.f(nVar, "pass");
        this.v.C0(mVar, nVar, j);
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void G0() {
        this.v.G0();
    }

    public final Object u1(h0 h0Var, long j, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        com.amazon.aps.iva.c0.l lVar = this.r;
        if (lVar != null) {
            Object p = z.p(new e(h0Var, j, lVar, this.t, this.u, null), dVar);
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            if (p != aVar) {
                p = q.a;
            }
            if (p == aVar) {
                return p;
            }
        }
        return q.a;
    }

    public abstract Object v1(f0 f0Var, com.amazon.aps.iva.ob0.d<? super q> dVar);
}
