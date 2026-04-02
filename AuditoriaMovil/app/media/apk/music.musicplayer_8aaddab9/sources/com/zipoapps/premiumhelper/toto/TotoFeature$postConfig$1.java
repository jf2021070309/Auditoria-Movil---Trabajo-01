package com.zipoapps.premiumhelper.toto;

import ch.qos.logback.classic.Level;
import h.m.d;
import h.m.i.a.c;
import h.m.i.a.e;
@e(c = "com.zipoapps.premiumhelper.toto.TotoFeature", f = "TotoFeature.kt", l = {127, 135}, m = "postConfig")
/* loaded from: classes2.dex */
public final class TotoFeature$postConfig$1 extends c {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$postConfig$1(TotoFeature totoFeature, d<? super TotoFeature$postConfig$1> dVar) {
        super(dVar);
        this.this$0 = totoFeature;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Level.ALL_INT;
        return this.this$0.postConfig(this);
    }
}
