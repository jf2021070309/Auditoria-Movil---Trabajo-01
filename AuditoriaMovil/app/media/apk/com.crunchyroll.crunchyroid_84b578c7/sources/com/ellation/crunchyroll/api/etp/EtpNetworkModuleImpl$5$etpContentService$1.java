package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.nz.e;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: EtpNetworkModule.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/amazon/aps/iva/nz/e;", "invoke", "()Lcom/amazon/aps/iva/nz/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EtpNetworkModuleImpl$5$etpContentService$1 extends l implements a<e> {
    final /* synthetic */ EtpNetworkModuleImpl $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpNetworkModuleImpl$5$etpContentService$1(EtpNetworkModuleImpl etpNetworkModuleImpl) {
        super(0);
        this.$this_run = etpNetworkModuleImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final e invoke() {
        return this.$this_run.getPlayheadsSynchronizer();
    }
}
