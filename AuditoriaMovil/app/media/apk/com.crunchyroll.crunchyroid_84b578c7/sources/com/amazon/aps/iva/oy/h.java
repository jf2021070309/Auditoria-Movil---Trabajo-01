package com.amazon.aps.iva.oy;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.oy.a;
import com.google.android.play.core.install.InstallState;
/* compiled from: InAppUpdatesMonitor.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<InstallState, q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(InstallState installState) {
        a aVar;
        InstallState installState2 = installState;
        com.amazon.aps.iva.yb0.j.f(installState2, "installState");
        int installStatus = installState2.installStatus();
        if (installStatus != 1) {
            if (installStatus != 2) {
                if (installStatus != 3) {
                    if (installStatus != 4) {
                        if (installStatus != 5) {
                            if (installStatus == 11) {
                                aVar = a.b.i;
                            }
                            return q.a;
                        }
                        aVar = a.d.i;
                    } else {
                        aVar = a.g.i;
                    }
                } else {
                    aVar = a.f.i;
                }
            } else {
                aVar = a.C0587a.i;
            }
        } else {
            aVar = a.h.i;
        }
        i iVar = this.h;
        if (!com.amazon.aps.iva.yb0.j.a(aVar, iVar.d.d())) {
            iVar.d.k(aVar);
        }
        return q.a;
    }
}
