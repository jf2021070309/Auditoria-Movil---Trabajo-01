package com.zipoapps.premiumhelper.toto;

import com.zipoapps.premiumhelper.toto.TotoService;
import e.j.d.y.b;
import h.o.b.a;
import h.o.c.k;
/* loaded from: classes2.dex */
public final class TotoFeature$serviceConfig$2 extends k implements a<TotoService.ServiceConfig> {
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$serviceConfig$2(TotoFeature totoFeature) {
        super(0);
        this.this$0 = totoFeature;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.o.b.a
    public final TotoService.ServiceConfig invoke() {
        b bVar;
        bVar = this.this$0.configuration;
        return bVar.j() ? TotoService.ServiceConfig.Companion.getStaging() : TotoService.ServiceConfig.Companion.getProduction();
    }
}
