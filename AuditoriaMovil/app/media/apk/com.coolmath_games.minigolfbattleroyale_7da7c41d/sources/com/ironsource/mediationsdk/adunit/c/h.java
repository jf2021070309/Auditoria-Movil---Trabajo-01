package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.C0110d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.p;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public final class h extends f<com.ironsource.mediationsdk.adunit.d.c> {
    public h(List<NetworkSettings> list, p pVar, String str, boolean z, Set<ImpressionDataListener> set) {
        super(new a(IronSource.AD_UNIT.REWARDED_VIDEO, str, list, pVar.l, pVar.c, pVar.e, pVar.j, pVar.i, new com.ironsource.mediationsdk.adunit.c.b.a(z ? a.EnumC0086a.MANUAL : pVar.l.n ? a.EnumC0086a.AUTOMATIC_LOAD_WHILE_SHOW : a.EnumC0086a.AUTOMATIC_LOAD_AFTER_CLOSE, pVar.l.k, pVar.l.j)), set);
    }

    private static BaseAdInteractionAdapter<?, AdapterAdRewardListener> b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, ?> b = C0110d.a().b(networkSettings, ad_unit);
        if (b == null || !(b instanceof BaseAdInteractionAdapter)) {
            return null;
        }
        try {
            return (BaseAdInteractionAdapter) b;
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception creating adapter - " + e.getMessage());
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.e
    protected final /* synthetic */ BaseAdAdapter a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        return b(networkSettings, ad_unit);
    }

    @Override // com.ironsource.mediationsdk.adunit.c.e
    protected final /* synthetic */ com.ironsource.mediationsdk.adunit.d.a.c a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i, String str) {
        return new com.ironsource.mediationsdk.adunit.d.c(new com.ironsource.mediationsdk.adunit.d.a(IronSource.AD_UNIT.REWARDED_VIDEO, this.m.b, i, this.h, str, this.f, this.g, networkSettings, this.m.g), (BaseAdInteractionAdapter) baseAdAdapter, this);
    }
}
