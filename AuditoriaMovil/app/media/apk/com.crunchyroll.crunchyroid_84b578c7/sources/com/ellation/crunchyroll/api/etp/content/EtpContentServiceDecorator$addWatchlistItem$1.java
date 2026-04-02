package com.ellation.crunchyroll.api.etp.content;

import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import kotlin.Metadata;
/* compiled from: EtpContentServiceDecorator.kt */
@e(c = "com.ellation.crunchyroll.api.etp.content.EtpContentServiceDecorator", f = "EtpContentServiceDecorator.kt", l = {35}, m = "addWatchlistItem")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EtpContentServiceDecorator$addWatchlistItem$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EtpContentServiceDecorator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpContentServiceDecorator$addWatchlistItem$1(EtpContentServiceDecorator etpContentServiceDecorator, d<? super EtpContentServiceDecorator$addWatchlistItem$1> dVar) {
        super(dVar);
        this.this$0 = etpContentServiceDecorator;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.addWatchlistItem(null, this);
    }
}
