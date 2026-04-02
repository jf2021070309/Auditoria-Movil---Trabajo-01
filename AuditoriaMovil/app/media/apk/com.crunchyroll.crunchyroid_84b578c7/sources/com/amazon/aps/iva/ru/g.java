package com.amazon.aps.iva.ru;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: CommentRepliesModule.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<PlayableAsset> {
    public final /* synthetic */ r h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r rVar) {
        super(0);
        this.h = rVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final PlayableAsset invoke() {
        return this.h.c.getCurrentAsset().d();
    }
}
