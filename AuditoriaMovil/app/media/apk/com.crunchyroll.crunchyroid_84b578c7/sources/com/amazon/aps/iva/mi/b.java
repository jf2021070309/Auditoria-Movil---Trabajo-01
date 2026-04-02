package com.amazon.aps.iva.mi;

import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
/* compiled from: SecureWatchMusicStreamsInteractor.kt */
@e(c = "com.crunchyroll.music.watch.data.SecureWatchMusicStreamsInteractorImpl", f = "SecureWatchMusicStreamsInteractor.kt", l = {26}, m = "getStreams")
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.qb0.c {
    public String h;
    public /* synthetic */ Object i;
    public final /* synthetic */ c j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d<? super b> dVar) {
        super(dVar);
        this.j = cVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, false, this);
    }
}
