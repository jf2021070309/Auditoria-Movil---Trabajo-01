package com.zipoapps.premiumhelper.toto;

import ch.qos.logback.classic.Level;
import h.m.d;
import h.m.i.a.c;
import h.m.i.a.e;
@e(c = "com.zipoapps.premiumhelper.toto.TotoFeature", f = "TotoFeature.kt", l = {156, 162}, m = "registerFcmToken")
/* loaded from: classes2.dex */
public final class TotoFeature$registerFcmToken$1 extends c {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$registerFcmToken$1(TotoFeature totoFeature, d<? super TotoFeature$registerFcmToken$1> dVar) {
        super(dVar);
        this.this$0 = totoFeature;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Level.ALL_INT;
        return this.this$0.registerFcmToken(null, this);
    }
}
