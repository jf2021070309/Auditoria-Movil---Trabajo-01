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
@e(c = "com.zipoapps.premiumhelper.toto.TotoFeature$getConfig$2", f = "TotoFeature.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class TotoFeature$getConfig$2 extends h implements l<d<? super a0<Map<String, ? extends Map<String, ? extends Integer>>>>, Object> {
    public int label;
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$getConfig$2(TotoFeature totoFeature, d<? super TotoFeature$getConfig$2> dVar) {
        super(1, dVar);
        this.this$0 = totoFeature;
    }

    @Override // h.m.i.a.a
    public final d<k> create(d<?> dVar) {
        return new TotoFeature$getConfig$2(this.this$0, dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(d<? super a0<Map<String, Map<String, Integer>>>> dVar) {
        return ((TotoFeature$getConfig$2) create(dVar)).invokeSuspend(k.a);
    }

    @Override // h.o.b.l
    public /* bridge */ /* synthetic */ Object invoke(d<? super a0<Map<String, ? extends Map<String, ? extends Integer>>>> dVar) {
        return invoke2((d<? super a0<Map<String, Map<String, Integer>>>>) dVar);
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
            this.label = 1;
            obj = service.getConfig(packageName, userAgent, this);
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
