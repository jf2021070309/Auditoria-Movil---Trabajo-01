package com.amazon.aps.iva.fo;

import com.ellation.crunchyroll.api.etp.auth.model.FunUser;
import com.ellation.crunchyroll.api.etp.auth.model.WatchDataStatus;
/* compiled from: WatchDataNotificationInteractor.kt */
/* loaded from: classes2.dex */
public final class f implements e {
    public final g a;

    public f(h hVar) {
        this.a = hVar;
    }

    @Override // com.amazon.aps.iva.fo.e
    public final void a(FunUser funUser, FunUser funUser2) {
        WatchDataStatus watchDataStatus;
        WatchDataStatus watchDataStatus2;
        boolean z;
        WatchDataStatus watchDataStatus3 = null;
        if (funUser2 != null) {
            watchDataStatus = funUser2.getWatchDataStatus();
        } else {
            watchDataStatus = null;
        }
        g gVar = this.a;
        gVar.b(watchDataStatus);
        if (funUser != null) {
            watchDataStatus2 = funUser.getWatchDataStatus();
        } else {
            watchDataStatus2 = null;
        }
        boolean z2 = false;
        if (watchDataStatus2 != WatchDataStatus.IN_PROGRESS) {
            if (funUser != null) {
                watchDataStatus3 = funUser.getWatchDataStatus();
            }
            if (watchDataStatus3 != WatchDataStatus.NOT_MIGRATED) {
                z = false;
                if (watchDataStatus != WatchDataStatus.SKIP || watchDataStatus == WatchDataStatus.MERGE || watchDataStatus == WatchDataStatus.OVERWRITE) {
                    z2 = true;
                }
                if (!z && z2) {
                    com.amazon.aps.iva.yb0.j.c(funUser2);
                    gVar.c(funUser2.getWatchDataStatus());
                    return;
                }
            }
        }
        z = true;
        if (watchDataStatus != WatchDataStatus.SKIP) {
        }
        z2 = true;
        if (!z) {
        }
    }
}
