package com.zipoapps.premiumhelper.toto;

import com.zipoapps.premiumhelper.toto.TotoService;
import e.j.d.y.b;
import h.o.b.a;
import h.o.c.k;
/* loaded from: classes2.dex */
public final class TotoFeature$service$2 extends k implements a<TotoService.TotoServiceApi> {
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$service$2(TotoFeature totoFeature) {
        super(0);
        this.this$0 = totoFeature;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.o.b.a
    public final TotoService.TotoServiceApi invoke() {
        TotoService.ServiceConfig serviceConfig;
        b bVar;
        TotoService totoService = TotoService.INSTANCE;
        serviceConfig = this.this$0.getServiceConfig();
        bVar = this.this$0.configuration;
        return totoService.build(serviceConfig, bVar.j());
    }
}
