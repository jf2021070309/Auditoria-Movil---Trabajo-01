package com.ellation.crunchyroll.api.etp.playback.store;

import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import kotlin.Metadata;
/* compiled from: PlaybackSessionsStore.kt */
@e(c = "com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStoreImpl", f = "PlaybackSessionsStore.kt", l = {44, 44}, m = "deleteAllExpiredItems")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlaybackSessionsStoreImpl$deleteAllExpiredItems$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlaybackSessionsStoreImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackSessionsStoreImpl$deleteAllExpiredItems$1(PlaybackSessionsStoreImpl playbackSessionsStoreImpl, d<? super PlaybackSessionsStoreImpl$deleteAllExpiredItems$1> dVar) {
        super(dVar);
        this.this$0 = playbackSessionsStoreImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deleteAllExpiredItems(this);
    }
}
