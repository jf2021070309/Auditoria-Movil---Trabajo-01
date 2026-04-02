package com.zipoapps.premiumhelper.toto;

import android.content.Context;
import e.j.d.c0.b0;
import h.o.b.a;
import h.o.c.k;
/* loaded from: classes2.dex */
public final class TotoFeature$userAgent$2 extends k implements a<String> {
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$userAgent$2(TotoFeature totoFeature) {
        super(0);
        this.this$0 = totoFeature;
    }

    @Override // h.o.b.a
    public final String invoke() {
        Context context;
        Context context2;
        StringBuilder sb = new StringBuilder();
        context = this.this$0.context;
        sb.append(context.getPackageName());
        sb.append('_');
        context2 = this.this$0.context;
        sb.append(b0.k(context2));
        return sb.toString();
    }
}
