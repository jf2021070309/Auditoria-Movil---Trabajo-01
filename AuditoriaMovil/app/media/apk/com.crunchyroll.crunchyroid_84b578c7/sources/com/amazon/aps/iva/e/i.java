package com.amazon.aps.iva.e;

import androidx.media3.exoplayer.dash.DashMediaSource;
import com.amazon.aps.iva.o6.d0;
import com.amazon.aps.iva.o6.u;
import com.amazon.aps.iva.xq.f;
import com.ellation.crunchyroll.presentation.download.button.DownloadButton;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.material.search.SearchView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                j.G((j) obj);
                return;
            case 1:
                int i2 = DashMediaSource.Q;
                ((DashMediaSource) obj).x(false);
                return;
            case 2:
                d0 d0Var = (d0) obj;
                if (!d0Var.M) {
                    u.a aVar = d0Var.r;
                    aVar.getClass();
                    aVar.a(d0Var);
                    return;
                }
                return;
            case 3:
                int i3 = com.amazon.aps.iva.b8.t.u;
                ((com.amazon.aps.iva.b8.t) obj).m();
                return;
            case 4:
                com.amazon.aps.iva.ar.b bVar = (com.amazon.aps.iva.ar.b) obj;
                int i4 = com.amazon.aps.iva.ar.b.h;
                com.amazon.aps.iva.yb0.j.f(bVar, "this$0");
                bVar.s(new f.j(0));
                return;
            case 5:
                DownloadButton.b1((DownloadButton) obj);
                return;
            case 6:
                ((WorkInitializer) obj).lambda$ensureContextsScheduled$1();
                return;
            default:
                ((SearchView) obj).show();
                return;
        }
    }
}
