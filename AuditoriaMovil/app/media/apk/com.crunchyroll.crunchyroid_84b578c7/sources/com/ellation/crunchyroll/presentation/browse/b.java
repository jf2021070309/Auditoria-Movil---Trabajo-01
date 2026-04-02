package com.ellation.crunchyroll.presentation.browse;

import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.l10.e;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yw.d0;
import com.ellation.crunchyroll.presentation.simulcast.SimulcastFragment;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BrowseFragmentProvider.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<List<? extends Fragment>> {
    public final /* synthetic */ com.amazon.aps.iva.a00.b h;
    public final /* synthetic */ String i;
    public final /* synthetic */ com.amazon.aps.iva.bi.a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.lx.a aVar, com.amazon.aps.iva.a00.b bVar, String str) {
        super(0);
        this.h = bVar;
        this.i = str;
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final List<? extends Fragment> invoke() {
        BrowseAllFragment.v.getClass();
        BrowseAllFragment browseAllFragment = new BrowseAllFragment();
        browseAllFragment.k.b(browseAllFragment, BrowseAllFragment.w[8], this.h);
        SimulcastFragment.t.getClass();
        SimulcastFragment simulcastFragment = new SimulcastFragment();
        simulcastFragment.n.b(simulcastFragment, SimulcastFragment.u[9], Boolean.FALSE);
        e.h.getClass();
        e eVar = new e();
        eVar.c.b(eVar, e.i[0], this.i);
        ArrayList M = f1.M(browseAllFragment, simulcastFragment, eVar);
        if (this.j.isEnabled()) {
            M.add(((d0) com.ellation.crunchyroll.application.e.a()).s.l());
        }
        return x.X0(M);
    }
}
