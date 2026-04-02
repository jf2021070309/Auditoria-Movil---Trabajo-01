package com.zipoapps.premiumhelper.toto;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import h.m.d;
import h.m.i.a.c;
import h.m.i.a.e;
@e(c = "com.zipoapps.premiumhelper.toto.TotoFeature", f = "TotoFeature.kt", l = {CoreConstants.OOS_RESET_FREQUENCY, 77}, m = "callApiWithRetry")
/* loaded from: classes2.dex */
public final class TotoFeature$callApiWithRetry$1<T> extends c {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$callApiWithRetry$1(TotoFeature totoFeature, d<? super TotoFeature$callApiWithRetry$1> dVar) {
        super(dVar);
        this.this$0 = totoFeature;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        Object callApiWithRetry;
        this.result = obj;
        this.label |= Level.ALL_INT;
        callApiWithRetry = this.this$0.callApiWithRetry(0, null, this);
        return callApiWithRetry;
    }
}
