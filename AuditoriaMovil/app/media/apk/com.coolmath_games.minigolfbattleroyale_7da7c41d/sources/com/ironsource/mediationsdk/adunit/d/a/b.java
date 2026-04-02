package com.ironsource.mediationsdk.adunit.d.a;

import com.ironsource.mediationsdk.E;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.c.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.f;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class b<Listener extends com.ironsource.mediationsdk.adunit.c.a.c> extends a<Listener> implements AdapterAdRewardListener {
    private f g;

    public b(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdInteractionAdapter<?, AdapterAdRewardListener> baseAdInteractionAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
    }

    @Override // com.ironsource.mediationsdk.adunit.d.a.a, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.g = new f();
        super.onAdClosed();
    }

    @Override // com.ironsource.mediationsdk.adunit.d.a.a, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdOpened() {
        this.g = null;
        super.onAdOpened();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (this.e == null) {
            this.c.e.l("mCurrentPlacement is null");
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("placement name = " + q()));
        HashMap hashMap = new HashMap();
        if (E.a().n != null) {
            for (String str : E.a().n.keySet()) {
                hashMap.put("custom_" + str, E.a().n.get(str));
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.c.d.a(q(), this.e.getRewardName(), this.e.getRewardAmount(), currentTimeMillis, IronSourceUtils.getTransId(currentTimeMillis, k()), f.a(this.g), hashMap, E.a().m);
        ((com.ironsource.mediationsdk.adunit.c.a.c) this.b).a((b<?>) this, this.e);
    }
}
