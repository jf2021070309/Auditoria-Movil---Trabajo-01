package com.zipoapps.premiumhelper.toto;

import android.content.Context;
import com.zipoapps.premiumhelper.toto.TotoService;
import e.j.d.w;
import h.k;
import h.m.d;
import h.m.h.a;
import h.m.i.a.e;
import h.m.i.a.h;
import h.o.b.l;
import h.o.c.j;
import java.util.Map;
import m.a0;
@e(c = "com.zipoapps.premiumhelper.toto.TotoFeature$postConfig$response$1", f = "TotoFeature.kt", l = {135}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class TotoFeature$postConfig$response$1 extends h implements l<d<? super a0<Void>>, Object> {
    public final /* synthetic */ Map<String, String> $config;
    public final /* synthetic */ TotoService.PostConfigParameters $parameters;
    public int label;
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$postConfig$response$1(TotoFeature totoFeature, TotoService.PostConfigParameters postConfigParameters, Map<String, String> map, d<? super TotoFeature$postConfig$response$1> dVar) {
        super(1, dVar);
        this.this$0 = totoFeature;
        this.$parameters = postConfigParameters;
        this.$config = map;
    }

    @Override // h.m.i.a.a
    public final d<k> create(d<?> dVar) {
        return new TotoFeature$postConfig$response$1(this.this$0, this.$parameters, this.$config, dVar);
    }

    @Override // h.o.b.l
    public final Object invoke(d<? super a0<Void>> dVar) {
        return ((TotoFeature$postConfig$response$1) create(dVar)).invokeSuspend(k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        TotoService.TotoServiceApi service;
        Context context;
        String userAgent;
        a aVar = a.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            w.E0(obj);
            service = this.this$0.getService();
            context = this.this$0.context;
            String packageName = context.getPackageName();
            j.d(packageName, "context.packageName");
            userAgent = this.this$0.getUserAgent();
            Map<String, String> asMap = this.$parameters.asMap();
            Map<String, String> map = this.$config;
            this.label = 1;
            obj = service.postConfig(packageName, userAgent, asMap, map, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            w.E0(obj);
        }
        return obj;
    }
}
