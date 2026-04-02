package com.amazon.aps.iva.gv;

import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.gv.i;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yu.e;
import com.crunchyroll.crunchyroid.R;
/* compiled from: CrunchylistsRouter.kt */
/* loaded from: classes2.dex */
public final class g implements f {
    public final FragmentManager a;
    public final com.amazon.aps.iva.xb0.a<q> b;
    public final i c;

    public g(FragmentManager fragmentManager, c cVar, i iVar) {
        this.a = fragmentManager;
        this.b = cVar;
        this.c = iVar;
    }

    @Override // com.amazon.aps.iva.gv.f
    public final void a() {
        FragmentManager fragmentManager = this.a;
        androidx.fragment.app.a a = defpackage.b.a(fragmentManager, fragmentManager);
        e.a aVar = com.amazon.aps.iva.yu.e.h;
        i iVar = this.c;
        j.d(iVar, "null cannot be cast to non-null type com.ellation.crunchyroll.crunchylists.crunchylistsdialog.ModifyCrunchylistAction.AddToCrunchylist");
        aVar.getClass();
        com.amazon.aps.iva.bv.d dVar = ((i.a) iVar).b;
        j.f(dVar, "input");
        com.amazon.aps.iva.yu.e eVar = new com.amazon.aps.iva.yu.e();
        eVar.c.b(eVar, com.amazon.aps.iva.yu.e.i[0], dVar);
        a.e(R.id.crunchylists_content_container, eVar, null);
        a.c(null);
        a.h();
    }

    @Override // com.amazon.aps.iva.gv.f
    public final void b() {
        this.b.invoke();
    }

    @Override // com.amazon.aps.iva.gv.f
    public final void c() {
        FragmentManager fragmentManager = this.a;
        androidx.fragment.app.a a = defpackage.b.a(fragmentManager, fragmentManager);
        com.amazon.aps.iva.qv.c.f.getClass();
        i iVar = this.c;
        j.f(iVar, "modifyCrunchylistAction");
        com.amazon.aps.iva.qv.c cVar = new com.amazon.aps.iva.qv.c();
        cVar.c.b(cVar, com.amazon.aps.iva.qv.c.g[0], iVar);
        a.e(R.id.crunchylists_content_container, cVar, null);
        a.c(null);
        a.h();
    }

    @Override // com.amazon.aps.iva.gv.f
    public final void closeScreen() {
        FragmentManager fragmentManager = this.a;
        if (fragmentManager.D() == 1) {
            this.b.invoke();
        } else {
            fragmentManager.O();
        }
    }
}
