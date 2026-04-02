package com.kwad.components.ad.reward.c;

import android.content.Context;
import com.kwad.components.ad.reward.KSRewardVideoActivityProxy;
import com.kwad.components.ad.reward.j;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.v;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class a {
    private static volatile a rs;
    private j qB;
    private b rt;
    private volatile boolean ru = false;
    private volatile boolean rv = false;
    private List<WeakReference<com.kwad.components.core.webview.jshandler.f>> rw = new CopyOnWriteArrayList();

    private a() {
    }

    public static a gY() {
        if (rs == null) {
            synchronized (a.class) {
                if (rs == null) {
                    rs = new a();
                }
            }
        }
        return rs;
    }

    private synchronized boolean ha() {
        boolean z;
        b bVar = this.rt;
        if (bVar != null) {
            z = bVar.rA == b.f8rx;
        }
        return z;
    }

    public final void O(Context context) {
        boolean ha = ha();
        com.kwad.sdk.core.e.c.d("CurrentExtraRewardHolder", "checkStatusAndToast isCurrentHadExtra: " + ha + ", hadToast: " + this.rv);
        if (this.rv || !ha) {
            return;
        }
        this.rv = true;
        v.L(context, "恭喜获得第2份奖励");
    }

    public final void a(com.kwad.components.core.webview.jshandler.f fVar) {
        com.kwad.sdk.core.e.c.d("CurrentExtraRewardHolder", "addGetNativeHandler: " + fVar);
        if (fVar != null) {
            this.rw.add(new WeakReference<>(fVar));
        }
    }

    public final synchronized void a(AdTemplate adTemplate, b bVar) {
        if (adTemplate == null) {
            return;
        }
        com.kwad.sdk.core.e.c.d("CurrentExtraRewardHolder", "updateExtraReward: " + bVar.toJson().toString());
        this.rt = bVar;
        if (bVar.rA == b.f8rx && !this.ru) {
            this.ru = true;
            c.a(this.rt, KSRewardVideoActivityProxy.a.A(adTemplate.getUniqueId()));
            com.kwad.sdk.core.report.a.aL(adTemplate);
        }
        for (WeakReference<com.kwad.components.core.webview.jshandler.f> weakReference : this.rw) {
            if (weakReference.get() == null) {
                this.rw.remove(weakReference);
            } else {
                b gZ = gZ();
                com.kwad.sdk.core.e.c.d("CurrentExtraRewardHolder", "GetNativeDataHandler callback: " + gZ.toJson().toString());
                weakReference.get().a(gZ);
            }
        }
    }

    public final synchronized void d(AdTemplate adTemplate, int i) {
        com.kwad.sdk.core.e.c.d("CurrentExtraRewardHolder", "updateExtraReward: " + i);
        j jVar = this.qB;
        if (jVar != null && jVar.ge() && i == b.STATUS_NONE) {
            com.kwad.sdk.core.e.c.d("CurrentExtraRewardHolder", "updateExtraReward: cant update to status 2");
            return;
        }
        b gZ = gY().gZ();
        gZ.L(i);
        gY().a(adTemplate, gZ);
    }

    public final synchronized b gZ() {
        if (this.rt == null) {
            b hc = c.hc();
            this.rt = hc;
            hc.rA = 0;
        }
        com.kwad.sdk.core.e.c.d("CurrentExtraRewardHolder", "getCurrentExtraReward: " + this.rt.rA);
        return this.rt;
    }

    public final synchronized void reset() {
        this.rt = null;
        this.rv = false;
        this.ru = false;
        this.qB = null;
    }

    public final void setCallerContext(j jVar) {
        this.qB = jVar;
    }
}
