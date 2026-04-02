package com.crunchyroll.watchscreen.screen.offline;

import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.qo.i;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.watchscreen.screen.WatchScreenActivity;
import kotlin.Metadata;
/* compiled from: OfflineWatchScreenActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/crunchyroll/watchscreen/screen/offline/OfflineWatchScreenActivity;", "Lcom/crunchyroll/watchscreen/screen/WatchScreenActivity;", "<init>", "()V", "watch-screen_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class OfflineWatchScreenActivity extends WatchScreenActivity {
    public final m t = f.b(new a());

    /* compiled from: OfflineWatchScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.gp.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.gp.a invoke() {
            return new com.amazon.aps.iva.gp.a(OfflineWatchScreenActivity.this);
        }
    }

    @Override // com.crunchyroll.watchscreen.screen.WatchScreenActivity, com.amazon.aps.iva.cj.z
    public final boolean K1() {
        return false;
    }

    @Override // com.amazon.aps.iva.i60.b
    public final com.amazon.aps.iva.mf.f ki() {
        return null;
    }

    @Override // com.crunchyroll.watchscreen.screen.WatchScreenActivity
    public final i ni() {
        return (i) this.t.getValue();
    }
}
