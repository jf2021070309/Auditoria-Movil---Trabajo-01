package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.g;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.f0;
import com.amazon.aps.iva.o0.i0;
import com.amazon.aps.iva.v1.c1;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wrapper.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Lcom/amazon/aps/iva/o0/f0;", "Landroidx/lifecycle/j;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WrappedComposition implements f0, androidx.lifecycle.j {
    public final AndroidComposeView b;
    public final f0 c;
    public boolean d;
    public androidx.lifecycle.g e;
    public p<? super com.amazon.aps.iva.o0.i, ? super Integer, q> f = c1.a;

    /* compiled from: Wrapper.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<AndroidComposeView.b, q> {
        public final /* synthetic */ p<com.amazon.aps.iva.o0.i, Integer, q> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super com.amazon.aps.iva.o0.i, ? super Integer, q> pVar) {
            super(1);
            this.i = pVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(AndroidComposeView.b bVar) {
            AndroidComposeView.b bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "it");
            WrappedComposition wrappedComposition = WrappedComposition.this;
            if (!wrappedComposition.d) {
                androidx.lifecycle.g lifecycle = bVar2.a.getLifecycle();
                p<com.amazon.aps.iva.o0.i, Integer, q> pVar = this.i;
                wrappedComposition.f = pVar;
                if (wrappedComposition.e == null) {
                    wrappedComposition.e = lifecycle;
                    lifecycle.addObserver(wrappedComposition);
                } else if (lifecycle.getCurrentState().isAtLeast(g.b.CREATED)) {
                    wrappedComposition.c.m(com.amazon.aps.iva.v0.b.c(-2000640158, new i(wrappedComposition, pVar), true));
                }
            }
            return q.a;
        }
    }

    public WrappedComposition(AndroidComposeView androidComposeView, i0 i0Var) {
        this.b = androidComposeView;
        this.c = i0Var;
    }

    @Override // androidx.lifecycle.j
    public final void U2(o oVar, g.a aVar) {
        if (aVar == g.a.ON_DESTROY) {
            dispose();
        } else if (aVar == g.a.ON_CREATE && !this.d) {
            m(this.f);
        }
    }

    @Override // com.amazon.aps.iva.o0.f0
    public final void dispose() {
        if (!this.d) {
            this.d = true;
            this.b.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.g gVar = this.e;
            if (gVar != null) {
                gVar.removeObserver(this);
            }
        }
        this.c.dispose();
    }

    @Override // com.amazon.aps.iva.o0.f0
    public final boolean f() {
        return this.c.f();
    }

    @Override // com.amazon.aps.iva.o0.f0
    public final void m(p<? super com.amazon.aps.iva.o0.i, ? super Integer, q> pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, FirebaseAnalytics.Param.CONTENT);
        this.b.setOnViewTreeOwnersAvailable(new a(pVar));
    }

    @Override // com.amazon.aps.iva.o0.f0
    public final boolean r() {
        return this.c.r();
    }
}
