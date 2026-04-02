package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.C0110d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.i;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public final class g extends d<com.ironsource.mediationsdk.adunit.d.b, BaseAdInteractionAdapter<?, AdapterAdInteractionListener>> {
    public g(List<NetworkSettings> list, i iVar, String str, Set<ImpressionDataListener> set) {
        super(new a(IronSource.AD_UNIT.INTERSTITIAL, str, list, iVar.i, iVar.c, iVar.e, iVar.f, -1, new com.ironsource.mediationsdk.adunit.c.b.a(a.EnumC0086a.MANUAL, iVar.i.k, iVar.i.j)), set);
    }

    private static BaseAdInteractionAdapter<?, AdapterAdInteractionListener> b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
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
        return new com.ironsource.mediationsdk.adunit.d.b(new com.ironsource.mediationsdk.adunit.d.a(IronSource.AD_UNIT.INTERSTITIAL, this.m.b, i, this.h, str, this.f, this.g, networkSettings, this.m.g), (BaseAdInteractionAdapter) baseAdAdapter, this);
    }
}
