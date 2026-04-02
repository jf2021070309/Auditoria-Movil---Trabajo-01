package com.amazon.aps.iva.gy;

import com.ellation.crunchyroll.model.music.Artist;
import com.google.android.gms.cast.MediaError;
/* compiled from: MusicHeroItemInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.MusicHeroItemInteractorKt", f = "MusicHeroItemInteractor.kt", l = {96, MediaError.DetailedErrorCode.MEDIA_DECODE}, m = "mapToUiModel")
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.qb0.c {
    public Artist h;
    public /* synthetic */ Object i;
    public int j;

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return t.f(null, null, this);
    }
}
