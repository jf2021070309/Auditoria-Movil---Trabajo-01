package com.amazon.aps.iva.p00;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.r00.m;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: VideoDownloadModuleImpl.kt */
/* loaded from: classes2.dex */
public final class h extends l implements p<PlayableAsset, String, q> {
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c cVar) {
        super(2);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(PlayableAsset playableAsset, String str) {
        PlayableAsset playableAsset2 = playableAsset;
        String str2 = str;
        com.amazon.aps.iva.yb0.j.f(playableAsset2, "asset");
        com.amazon.aps.iva.yb0.j.f(str2, "newAudioLocale");
        com.amazon.aps.iva.r00.i iVar = this.h.f;
        iVar.getClass();
        iVar.b.Y0(playableAsset2, str2, new m(iVar, playableAsset2, str2));
        return q.a;
    }
}
