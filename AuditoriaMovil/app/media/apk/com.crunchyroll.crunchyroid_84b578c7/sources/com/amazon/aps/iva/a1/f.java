package com.amazon.aps.iva.a1;

import androidx.compose.ui.node.o;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.se0.m1;
import com.amazon.aps.iva.u1.i;
import com.amazon.aps.iva.u1.r0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
/* compiled from: Modifier.kt */
/* loaded from: classes.dex */
public interface f {
    public static final /* synthetic */ int a = 0;

    /* compiled from: Modifier.kt */
    /* loaded from: classes.dex */
    public static final class a implements f {
        public static final /* synthetic */ a c = new a();

        @Override // com.amazon.aps.iva.a1.f
        public final <R> R a(R r, p<? super R, ? super b, ? extends R> pVar) {
            j.f(pVar, "operation");
            return r;
        }

        @Override // com.amazon.aps.iva.a1.f
        public final boolean g(l<? super b, Boolean> lVar) {
            j.f(lVar, "predicate");
            return true;
        }

        @Override // com.amazon.aps.iva.a1.f
        public final f o(f fVar) {
            j.f(fVar, "other");
            return fVar;
        }

        public final String toString() {
            return "Modifier";
        }
    }

    /* compiled from: Modifier.kt */
    /* loaded from: classes.dex */
    public interface b extends f {
        @Override // com.amazon.aps.iva.a1.f
        default <R> R a(R r, p<? super R, ? super b, ? extends R> pVar) {
            j.f(pVar, "operation");
            return pVar.invoke(r, this);
        }

        @Override // com.amazon.aps.iva.a1.f
        default boolean g(l<? super b, Boolean> lVar) {
            j.f(lVar, "predicate");
            return lVar.invoke(this).booleanValue();
        }
    }

    <R> R a(R r, p<? super R, ? super b, ? extends R> pVar);

    boolean g(l<? super b, Boolean> lVar);

    default f o(f fVar) {
        j.f(fVar, "other");
        if (fVar == a.c) {
            return this;
        }
        return new com.amazon.aps.iva.a1.c(this, fVar);
    }

    /* compiled from: Modifier.kt */
    /* loaded from: classes.dex */
    public static abstract class c implements com.amazon.aps.iva.u1.h {
        public g0 c;
        public int d;
        public c f;
        public c g;
        public r0 h;
        public o i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public c b = this;
        public int e = -1;

        @Override // com.amazon.aps.iva.u1.h
        public final c V() {
            return this.b;
        }

        public final g0 i1() {
            g0 g0Var = this.c;
            if (g0Var == null) {
                com.amazon.aps.iva.xe0.d i = z.i(i.f(this).getCoroutineContext().plus(new m1((j1) i.f(this).getCoroutineContext().get(j1.b.b))));
                this.c = i;
                return i;
            }
            return g0Var;
        }

        public boolean j1() {
            return !(this instanceof com.amazon.aps.iva.c1.l);
        }

        public void k1() {
            boolean z;
            if (!this.n) {
                if (this.i != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.n = true;
                    this.l = true;
                    return;
                }
                throw new IllegalStateException("attach invoked on a node without a coordinator".toString());
            }
            throw new IllegalStateException("node attached multiple times".toString());
        }

        public void l1() {
            if (this.n) {
                if (!this.l) {
                    if (!this.m) {
                        this.n = false;
                        g0 g0Var = this.c;
                        if (g0Var != null) {
                            z.l(g0Var, new g());
                            this.c = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()".toString());
                }
                throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()".toString());
            }
            throw new IllegalStateException("Cannot detach a node that is not attached".toString());
        }

        public void p1() {
            if (this.n) {
                o1();
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        public void q1() {
            if (this.n) {
                if (this.l) {
                    this.l = false;
                    m1();
                    this.m = true;
                    return;
                }
                throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()".toString());
            }
            throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle".toString());
        }

        public void r1() {
            boolean z;
            if (this.n) {
                if (this.i != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (this.m) {
                        this.m = false;
                        n1();
                        return;
                    }
                    throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()".toString());
                }
                throw new IllegalStateException("detach invoked on a node without a coordinator".toString());
            }
            throw new IllegalStateException("node detached multiple times".toString());
        }

        public void s1(o oVar) {
            this.i = oVar;
        }

        public void m1() {
        }

        public void n1() {
        }

        public void o1() {
        }
    }
}
