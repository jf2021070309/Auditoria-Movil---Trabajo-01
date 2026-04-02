package com.ellation.crunchyroll.api.etp.playback;

import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import com.google.android.gms.cast.MediaError;
import kotlin.Metadata;
/* compiled from: PlayServiceDecorator.kt */
@e(c = "com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl", f = "PlayServiceDecorator.kt", l = {99, MediaError.DetailedErrorCode.MEDIA_DECODE, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED}, m = "deleteCachedSession")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayServiceDecoratorImpl$deleteCachedSession$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlayServiceDecoratorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayServiceDecoratorImpl$deleteCachedSession$1(PlayServiceDecoratorImpl playServiceDecoratorImpl, d<? super PlayServiceDecoratorImpl$deleteCachedSession$1> dVar) {
        super(dVar);
        this.this$0 = playServiceDecoratorImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object deleteCachedSession;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        deleteCachedSession = this.this$0.deleteCachedSession(null, false, this);
        return deleteCachedSession;
    }
}
