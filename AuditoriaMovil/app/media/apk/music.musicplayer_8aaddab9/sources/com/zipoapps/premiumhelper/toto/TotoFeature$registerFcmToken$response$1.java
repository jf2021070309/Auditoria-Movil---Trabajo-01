package com.zipoapps.premiumhelper.toto;

import com.zipoapps.premiumhelper.toto.TotoService;
import e.j.d.w;
import h.k;
import h.m.d;
import h.m.h.a;
import h.m.i.a.e;
import h.m.i.a.h;
import h.o.b.l;
import m.a0;
@e(c = "com.zipoapps.premiumhelper.toto.TotoFeature$registerFcmToken$response$1", f = "TotoFeature.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class TotoFeature$registerFcmToken$response$1 extends h implements l<d<? super a0<Void>>, Object> {
    public final /* synthetic */ TotoService.RegisterRequest $request;
    public int label;
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$registerFcmToken$response$1(TotoFeature totoFeature, TotoService.RegisterRequest registerRequest, d<? super TotoFeature$registerFcmToken$response$1> dVar) {
        super(1, dVar);
        this.this$0 = totoFeature;
        this.$request = registerRequest;
    }

    @Override // h.m.i.a.a
    public final d<k> create(d<?> dVar) {
        return new TotoFeature$registerFcmToken$response$1(this.this$0, this.$request, dVar);
    }

    @Override // h.o.b.l
    public final Object invoke(d<? super a0<Void>> dVar) {
        return ((TotoFeature$registerFcmToken$response$1) create(dVar)).invokeSuspend(k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        TotoService.TotoServiceApi service;
        String userAgent;
        a aVar = a.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            w.E0(obj);
            service = this.this$0.getService();
            TotoService.RegisterRequest registerRequest = this.$request;
            userAgent = this.this$0.getUserAgent();
            this.label = 1;
            obj = service.register(registerRequest, userAgent, this);
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
