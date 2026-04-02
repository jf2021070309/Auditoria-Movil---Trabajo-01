package com.crunchyroll.connectivity;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.g;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.mf.f;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.x50.r;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.connectivity.d;
import com.crunchyroll.crunchyroid.R;
import com.ellation.widgets.bottommessage.error.ErrorBottomMessageView;
/* compiled from: NoNetworkMessageDelegate.kt */
/* loaded from: classes.dex */
public final class e implements com.amazon.aps.iva.mf.d, f {
    public final com.amazon.aps.iva.k.c b;
    public final m c;
    public ErrorBottomMessageView d;

    /* compiled from: NoNetworkMessageDelegate.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.mf.b> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.mf.b invoke() {
            e eVar = e.this;
            com.amazon.aps.iva.k.c cVar = eVar.b;
            g lifecycle = cVar.getLifecycle();
            j.e(lifecycle, "activity.lifecycle");
            d a = d.a.a(cVar, lifecycle);
            com.amazon.aps.iva.k.c cVar2 = eVar.b;
            j.f(cVar2, "context");
            if (q.a.a == null) {
                q.a.a = new r(cVar2);
            }
            r rVar = q.a.a;
            j.c(rVar);
            return new com.amazon.aps.iva.mf.c(eVar, a, rVar, new Handler(cVar2.getMainLooper()));
        }
    }

    public e(com.amazon.aps.iva.k.c cVar) {
        j.f(cVar, "activity");
        this.b = cVar;
        this.c = com.amazon.aps.iva.kb0.f.b(new a());
    }

    @Override // com.amazon.aps.iva.mf.d
    public final void A2() {
        ErrorBottomMessageView G = G();
        com.amazon.aps.iva.k.c cVar = this.b;
        String string = cVar.getString(R.string.no_network);
        j.e(string, "activity.getString(R.string.no_network)");
        String string2 = cVar.getString(R.string.desc_no_network_message_visible);
        j.e(string2, "activity.getString(R.str…_network_message_visible)");
        G.X7(string, string2);
    }

    public final ErrorBottomMessageView G() {
        if (this.d == null) {
            com.amazon.aps.iva.k.c cVar = this.b;
            ErrorBottomMessageView errorBottomMessageView = (ErrorBottomMessageView) cVar.findViewById(R.id.no_network_message_view);
            this.d = errorBottomMessageView;
            if (errorBottomMessageView == null) {
                ViewGroup viewGroup = null;
                ErrorBottomMessageView errorBottomMessageView2 = new ErrorBottomMessageView(cVar, null, 6, 0);
                errorBottomMessageView2.setId(R.id.no_network_message_view);
                this.d = errorBottomMessageView2;
                View findViewById = cVar.findViewById(16908290);
                if (findViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) findViewById;
                }
                if (viewGroup != null) {
                    viewGroup.addView(this.d);
                }
            }
        }
        ErrorBottomMessageView errorBottomMessageView3 = this.d;
        j.c(errorBottomMessageView3);
        return errorBottomMessageView3;
    }

    @Override // com.amazon.aps.iva.mf.d
    public final void R4() {
        G().G4();
    }

    @Override // com.amazon.aps.iva.mf.f
    public final void U0() {
        ((com.amazon.aps.iva.mf.b) this.c.getValue()).a0();
    }

    @Override // com.amazon.aps.iva.mf.f
    public final void W0() {
        ((com.amazon.aps.iva.mf.b) this.c.getValue()).x1();
    }

    @Override // com.amazon.aps.iva.mf.d
    public final void f9() {
        ErrorBottomMessageView G = G();
        com.amazon.aps.iva.k.c cVar = this.b;
        String string = cVar.getString(R.string.no_network);
        j.e(string, "activity.getString(R.string.no_network)");
        String string2 = cVar.getString(R.string.desc_no_network_message_visible);
        j.e(string2, "activity.getString(R.str…_network_message_visible)");
        G.H6(string, string2);
    }

    @Override // com.amazon.aps.iva.mf.d
    public final void gh() {
        G().U2();
    }

    @Override // com.amazon.aps.iva.mf.f
    public final void init() {
        com.ellation.crunchyroll.mvp.lifecycle.a.a((com.amazon.aps.iva.mf.b) this.c.getValue(), this.b);
    }
}
