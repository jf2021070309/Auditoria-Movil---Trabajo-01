package com.amazon.aps.iva.ru;

import com.amazon.aps.iva.ez.g;
/* compiled from: CommentRepliesViewModel.kt */
/* loaded from: classes2.dex */
public final class e0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ h0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var) {
        super(1);
        this.h = h0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Integer num) {
        this.h.g.i(new g.c(Integer.valueOf(num.intValue()), null));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
