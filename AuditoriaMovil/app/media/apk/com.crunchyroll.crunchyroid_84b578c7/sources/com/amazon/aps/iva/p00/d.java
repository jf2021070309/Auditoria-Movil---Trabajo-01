package com.amazon.aps.iva.p00;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: VideoDownloadModuleImpl.kt */
/* loaded from: classes2.dex */
public final class d extends l implements p<String, PlayableAsset, q> {
    public final /* synthetic */ p<PlayableAsset, String, q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar) {
        super(2);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(String str, PlayableAsset playableAsset) {
        String str2 = str;
        PlayableAsset playableAsset2 = playableAsset;
        com.amazon.aps.iva.yb0.j.f(str2, "newAudioLocale");
        com.amazon.aps.iva.yb0.j.f(playableAsset2, "asset");
        this.h.invoke(playableAsset2, str2);
        return q.a;
    }
}
