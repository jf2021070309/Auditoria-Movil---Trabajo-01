package androidx.compose.foundation.gestures;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.b0.a0;
import com.amazon.aps.iva.b0.w;
import com.amazon.aps.iva.e1.c;
import com.amazon.aps.iva.o2.o;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.p1.y;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/b0/w;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DraggableElement extends f0<w> {
    public final a0 c;
    public final l<y, Boolean> d;
    public final com.amazon.aps.iva.b0.f0 e;
    public final boolean f;
    public final com.amazon.aps.iva.c0.l g;
    public final com.amazon.aps.iva.xb0.a<Boolean> h;
    public final q<g0, c, d<? super com.amazon.aps.iva.kb0.q>, Object> i;
    public final q<g0, o, d<? super com.amazon.aps.iva.kb0.q>, Object> j;
    public final boolean k;

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(a0 a0Var, l<? super y, Boolean> lVar, com.amazon.aps.iva.b0.f0 f0Var, boolean z, com.amazon.aps.iva.c0.l lVar2, com.amazon.aps.iva.xb0.a<Boolean> aVar, q<? super g0, ? super c, ? super d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar, q<? super g0, ? super o, ? super d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar2, boolean z2) {
        j.f(a0Var, "state");
        j.f(lVar, "canDrag");
        j.f(aVar, "startDragImmediately");
        j.f(qVar, "onDragStarted");
        j.f(qVar2, "onDragStopped");
        this.c = a0Var;
        this.d = lVar;
        this.e = f0Var;
        this.f = z;
        this.g = lVar2;
        this.h = aVar;
        this.i = qVar;
        this.j = qVar2;
        this.k = z2;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!j.a(DraggableElement.class, cls)) {
            return false;
        }
        j.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DraggableElement");
        DraggableElement draggableElement = (DraggableElement) obj;
        if (j.a(this.c, draggableElement.c) && j.a(this.d, draggableElement.d) && this.e == draggableElement.e && this.f == draggableElement.f && j.a(this.g, draggableElement.g) && j.a(this.h, draggableElement.h) && j.a(this.i, draggableElement.i) && j.a(this.j, draggableElement.j) && this.k == draggableElement.k) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        int i;
        int hashCode = this.d.hashCode();
        int hashCode2 = this.e.hashCode();
        int b = r.b(this.f, (hashCode2 + ((hashCode + (this.c.hashCode() * 31)) * 31)) * 31, 31);
        com.amazon.aps.iva.c0.l lVar = this.g;
        if (lVar != null) {
            i = lVar.hashCode();
        } else {
            i = 0;
        }
        int hashCode3 = this.h.hashCode();
        int hashCode4 = this.i.hashCode();
        int hashCode5 = this.j.hashCode();
        return Boolean.hashCode(this.k) + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((b + i) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final w l() {
        return new w(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(w wVar) {
        boolean z;
        w wVar2 = wVar;
        j.f(wVar2, "node");
        a0 a0Var = this.c;
        j.f(a0Var, "state");
        l<y, Boolean> lVar = this.d;
        j.f(lVar, "canDrag");
        com.amazon.aps.iva.b0.f0 f0Var = this.e;
        j.f(f0Var, "orientation");
        com.amazon.aps.iva.xb0.a<Boolean> aVar = this.h;
        j.f(aVar, "startDragImmediately");
        q<g0, c, d<? super com.amazon.aps.iva.kb0.q>, Object> qVar = this.i;
        j.f(qVar, "onDragStarted");
        q<g0, o, d<? super com.amazon.aps.iva.kb0.q>, Object> qVar2 = this.j;
        j.f(qVar2, "onDragStopped");
        boolean z2 = true;
        if (!j.a(wVar2.q, a0Var)) {
            wVar2.q = a0Var;
            z = true;
        } else {
            z = false;
        }
        wVar2.r = lVar;
        if (wVar2.s != f0Var) {
            wVar2.s = f0Var;
            z = true;
        }
        boolean z3 = wVar2.t;
        boolean z4 = this.f;
        if (z3 != z4) {
            wVar2.t = z4;
            if (!z4) {
                wVar2.x1();
            }
            z = true;
        }
        com.amazon.aps.iva.c0.l lVar2 = wVar2.u;
        com.amazon.aps.iva.c0.l lVar3 = this.g;
        if (!j.a(lVar2, lVar3)) {
            wVar2.x1();
            wVar2.u = lVar3;
        }
        wVar2.v = aVar;
        wVar2.w = qVar;
        wVar2.x = qVar2;
        boolean z5 = wVar2.y;
        boolean z6 = this.k;
        if (z5 != z6) {
            wVar2.y = z6;
        } else {
            z2 = z;
        }
        if (z2) {
            wVar2.C.r0();
        }
    }
}
