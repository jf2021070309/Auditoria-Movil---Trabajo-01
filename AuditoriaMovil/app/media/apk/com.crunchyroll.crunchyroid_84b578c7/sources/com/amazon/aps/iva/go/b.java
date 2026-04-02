package com.amazon.aps.iva.go;

import com.amazon.aps.iva.co.d;
import com.amazon.aps.iva.fo.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.usermigration.progress.WatchDataProgress;
import com.ellation.crunchyroll.api.etp.auth.model.WatchDataStatus;
/* compiled from: WatchDataProgressPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<c> implements com.amazon.aps.iva.go.a {
    public final g b;
    public final d c;
    public final com.amazon.aps.iva.fo.c d;
    public final com.amazon.aps.iva.ls.a e;

    /* compiled from: WatchDataProgressPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<WatchDataStatus, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(WatchDataStatus watchDataStatus) {
            WatchDataStatus watchDataStatus2 = watchDataStatus;
            WatchDataStatus watchDataStatus3 = WatchDataStatus.IN_PROGRESS;
            b bVar = b.this;
            if (watchDataStatus2 == watchDataStatus3) {
                com.amazon.aps.iva.ls.a aVar = bVar.e;
                if (aVar != null) {
                    bVar.d.b(aVar);
                }
                bVar.getView().k();
            } else {
                bVar.getView().f();
            }
            return q.a;
        }
    }

    public b(WatchDataProgress watchDataProgress, g gVar, d dVar, com.amazon.aps.iva.fo.c cVar, com.amazon.aps.iva.ls.a aVar) {
        super(watchDataProgress, new j[0]);
        this.b = gVar;
        this.c = dVar;
        this.d = cVar;
        this.e = aVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        if (this.c.isEnabled()) {
            a aVar = new a();
            this.b.a(getView(), aVar);
        }
    }
}
