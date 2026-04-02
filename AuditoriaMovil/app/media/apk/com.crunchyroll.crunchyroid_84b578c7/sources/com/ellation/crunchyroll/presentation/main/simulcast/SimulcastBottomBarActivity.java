package com.ellation.crunchyroll.presentation.main.simulcast;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.b20.b;
import com.amazon.aps.iva.v10.c;
import com.amazon.aps.iva.xw.s0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yw.d0;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.application.e;
import com.ellation.crunchyroll.presentation.simulcast.SimulcastFragment;
import kotlin.Metadata;
/* compiled from: SimulcastBottomBarActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ellation/crunchyroll/presentation/main/simulcast/SimulcastBottomBarActivity;", "Lcom/amazon/aps/iva/v10/c;", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SimulcastBottomBarActivity extends c {
    public static final /* synthetic */ int t = 0;
    public final int r = 3;
    public final com.amazon.aps.iva.ls.a s = com.amazon.aps.iva.ls.a.SIMULCAST;

    /* compiled from: SimulcastBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<Fragment> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Fragment invoke() {
            int i = SimulcastBottomBarActivity.t;
            SimulcastBottomBarActivity.this.getClass();
            com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
            if (aVar != null) {
                Object c = aVar.c().c(com.amazon.aps.iva.b20.a.class, "simulcast");
                if (c != null) {
                    if (((com.amazon.aps.iva.b20.a) c).a() == b.V1) {
                        SimulcastFragment.t.getClass();
                        SimulcastFragment simulcastFragment = new SimulcastFragment();
                        simulcastFragment.n.b(simulcastFragment, SimulcastFragment.u[9], Boolean.TRUE);
                        return simulcastFragment;
                    }
                    ((d0) e.a()).A.getClass();
                    return new com.amazon.aps.iva.jn.c();
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.presentation.main.simulcast.SimulcastConfigImpl");
            }
            j.m("instance");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return this.s;
    }

    @Override // com.amazon.aps.iva.v10.a, com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View ri = ri();
        View view = (View) this.m.getValue(this, com.amazon.aps.iva.v10.a.q[3]);
        j.d(view, "null cannot be cast to non-null type android.view.ViewGroup");
        j.f(ri, "<this>");
        ri.setOnApplyWindowInsetsListener(new s0((ViewGroup) view));
        mi(new a());
    }

    @Override // com.amazon.aps.iva.v10.a
    public final int pi() {
        return this.r;
    }
}
