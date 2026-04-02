package com.amazon.aps.iva.f;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import com.amazon.aps.iva.e.m;
import com.amazon.aps.iva.e.v;
import com.amazon.aps.iva.e.x;
import com.amazon.aps.iva.e.y;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ne0.k;
import com.amazon.aps.iva.ne0.s;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.u0;
import com.amazon.aps.iva.o0.v0;
import com.amazon.aps.iva.o0.w0;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: BackHandler.kt */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: BackHandler.kt */
    /* renamed from: com.amazon.aps.iva.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0235a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ d h;
        public final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0235a(d dVar, boolean z) {
            super(0);
            this.h = dVar;
            this.i = z;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.setEnabled(this.i);
            return q.a;
        }
    }

    /* compiled from: BackHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<v0, u0> {
        public final /* synthetic */ OnBackPressedDispatcher h;
        public final /* synthetic */ o i;
        public final /* synthetic */ d j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(OnBackPressedDispatcher onBackPressedDispatcher, o oVar, d dVar) {
            super(1);
            this.h = onBackPressedDispatcher;
            this.i = oVar;
            this.j = dVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final u0 invoke(v0 v0Var) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.h;
            o oVar = this.i;
            d dVar = this.j;
            onBackPressedDispatcher.a(oVar, dVar);
            return new com.amazon.aps.iva.f.b(dVar);
        }
    }

    /* compiled from: BackHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements p<i, Integer, q> {
        public final /* synthetic */ boolean h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, com.amazon.aps.iva.xb0.a<q> aVar, int i, int i2) {
            super(2);
            this.h = z;
            this.i = aVar;
            this.j = i;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            a.a(this.h, this.i, iVar, this.j | 1, this.k);
            return q.a;
        }
    }

    /* compiled from: BackHandler.kt */
    /* loaded from: classes.dex */
    public static final class d extends m {
        public final /* synthetic */ p3<com.amazon.aps.iva.xb0.a<q>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q1 q1Var, boolean z) {
            super(z);
            this.a = q1Var;
        }

        @Override // com.amazon.aps.iva.e.m
        public final void handleOnBackPressed() {
            this.a.getValue().invoke();
        }
    }

    public static final void a(boolean z, com.amazon.aps.iva.xb0.a<q> aVar, i iVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        j g = iVar.g(-361453782);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.a(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (g.H(aVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && g.h()) {
            g.A();
        } else {
            if (i6 != 0) {
                z = true;
            }
            q1 h0 = com.amazon.aps.iva.cq.b.h0(aVar, g);
            g.s(-3687241);
            Object e0 = g.e0();
            i.a.C0550a c0550a = i.a.a;
            if (e0 == c0550a) {
                e0 = new d(h0, z);
                g.K0(e0);
            }
            g.U(false);
            d dVar = (d) e0;
            Boolean valueOf = Boolean.valueOf(z);
            g.s(-3686552);
            boolean H = g.H(valueOf) | g.H(dVar);
            Object e02 = g.e0();
            if (H || e02 == c0550a) {
                e02 = new C0235a(dVar, z);
                g.K0(e02);
            }
            g.U(false);
            x0.f((com.amazon.aps.iva.xb0.a) e02, g);
            w0 w0Var = com.amazon.aps.iva.f.c.a;
            g.s(-2068013981);
            v vVar = (v) g.i(com.amazon.aps.iva.f.c.a);
            g.s(1680121597);
            if (vVar == null) {
                View view = (View) g.i(androidx.compose.ui.platform.d.f);
                com.amazon.aps.iva.yb0.j.f(view, "<this>");
                vVar = (v) s.X(s.c0(k.R(view, x.h), y.h));
            }
            g.U(false);
            if (vVar == null) {
                Context context = (Context) g.i(androidx.compose.ui.platform.d.b);
                while (true) {
                    if (context instanceof ContextWrapper) {
                        if (context instanceof v) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                        break;
                    }
                }
                vVar = (v) context;
            }
            g.U(false);
            if (vVar != null) {
                OnBackPressedDispatcher onBackPressedDispatcher = vVar.getOnBackPressedDispatcher();
                o oVar = (o) g.i(androidx.compose.ui.platform.d.d);
                x0.b(oVar, onBackPressedDispatcher, new b(onBackPressedDispatcher, oVar, dVar), g);
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new c(z, aVar, i, i2);
        }
    }
}
