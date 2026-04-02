package com.ellation.crunchyroll.api.etp.content;

import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import kotlin.Metadata;
/* compiled from: EtpContentService.kt */
@e(c = "com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt", f = "EtpContentService.kt", l = {379, 380, 381, 381}, m = "loadContentContainer")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EtpContentServiceKt$loadContentContainer$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public EtpContentServiceKt$loadContentContainer$1(d<? super EtpContentServiceKt$loadContentContainer$1> dVar) {
        super(dVar);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return EtpContentServiceKt.loadContentContainer(null, null, null, this);
    }
}
