package com.amazon.aps.iva.f00;

import java.util.Iterator;
import java.util.List;
/* compiled from: OfflinePlayableAssetUiModelFactory.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.content.assets.list.item.OfflinePlayableAssetUiModelFactory", f = "OfflinePlayableAssetUiModelFactory.kt", l = {78}, m = "insertSeasons")
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.qb0.c {
    public h h;
    public List i;
    public Iterator j;
    public String k;
    public List l;
    public /* synthetic */ Object m;
    public final /* synthetic */ h n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, com.amazon.aps.iva.ob0.d<? super i> dVar) {
        super(dVar);
        this.n = hVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.e(null, this);
    }
}
