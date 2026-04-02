package com.zipoapps.premiumhelper.toto;

import ch.qos.logback.classic.Level;
import h.m.d;
import h.m.i.a.c;
import h.m.i.a.e;
@e(c = "com.zipoapps.premiumhelper.toto.TotoFeature", f = "TotoFeature.kt", l = {82}, m = "getConfig")
/* loaded from: classes2.dex */
public final class TotoFeature$getConfig$1 extends c {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$getConfig$1(TotoFeature totoFeature, d<? super TotoFeature$getConfig$1> dVar) {
        super(dVar);
        this.this$0 = totoFeature;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Level.ALL_INT;
        return this.this$0.getConfig(this);
    }
}
