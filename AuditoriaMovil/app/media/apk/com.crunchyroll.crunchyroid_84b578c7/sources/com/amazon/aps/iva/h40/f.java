package com.amazon.aps.iva.h40;

import android.os.Bundle;
import com.amazon.aps.iva.fz.l;
import com.amazon.aps.iva.wy.j;
/* compiled from: NotificationSettingsPresenter.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.wy.b<g> implements e {
    public final h b;

    public f(b bVar, i iVar) {
        super(bVar, new j[0]);
        this.b = iVar;
    }

    @Override // com.amazon.aps.iva.n4.v
    public final void i6(Bundle bundle, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "requestKey");
        if (bundle.containsKey("positive_button_result")) {
            getView().K9();
            return;
        }
        q6();
        this.b.b3(null);
    }

    @Override // com.amazon.aps.iva.h40.e
    public final void n6(l lVar, boolean z) {
        h hVar = this.b;
        if (z) {
            if (!hVar.e(lVar)) {
                getView().O6();
                hVar.b3(lVar);
                return;
            }
            return;
        }
        hVar.h(lVar);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onPause() {
        getView().c0();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        getView().d0();
        h hVar = this.b;
        l lVar = (l) hVar.O2().d();
        if (lVar != null) {
            hVar.i();
            hVar.e(lVar);
            hVar.b3(null);
        }
        q6();
    }

    public final void q6() {
        for (a aVar : this.b.R()) {
            getView().Eb(aVar.a.getKeyRes(), aVar.b);
        }
    }
}
