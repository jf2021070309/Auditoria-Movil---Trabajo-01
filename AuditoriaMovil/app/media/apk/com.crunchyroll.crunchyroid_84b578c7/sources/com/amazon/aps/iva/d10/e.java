package com.amazon.aps.iva.d10;

import com.ellation.crunchyroll.model.Panel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: AsyncDownloadPanelFetcher.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.downloads.AsyncDownloadPanelFetcherImpl", f = "AsyncDownloadPanelFetcher.kt", l = {64, 65}, m = "getDownloadPanels")
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.qb0.c {
    public f h;
    public List i;
    public Collection j;
    public Iterator k;
    public Panel l;
    public Collection m;
    public /* synthetic */ Object n;
    public final /* synthetic */ f o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, com.amazon.aps.iva.ob0.d<? super e> dVar) {
        super(dVar);
        this.o = fVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return f.a(this.o, null, this);
    }
}
