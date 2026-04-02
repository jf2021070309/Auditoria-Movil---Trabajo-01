package com.amazon.aps.iva.u00;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.p00.c;
import com.amazon.aps.iva.sv.g2;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import com.ellation.crunchyroll.presentation.download.button.DownloadButton;
import java.util.List;
/* compiled from: BulkDownloadActionsPresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.wy.b<m> implements c {
    public final g2 b;
    public final com.amazon.aps.iva.v00.a c;
    public final com.amazon.aps.iva.u00.a d;
    public final com.amazon.aps.iva.tv.a e;

    /* compiled from: BulkDownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ PlayableAsset i;
        public final /* synthetic */ com.amazon.aps.iva.hg.g j;
        public final /* synthetic */ String k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PlayableAsset playableAsset, com.amazon.aps.iva.hg.g gVar, String str) {
            super(0);
            this.i = playableAsset;
            this.j = gVar;
            this.k = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            m view = i.this.getView();
            PlayableAsset playableAsset = this.i;
            List<PlayableAssetVersion> versions = playableAsset.getVersions();
            String str = this.k;
            if (str == null) {
                str = playableAsset.getAudioLocale();
            }
            view.Y9(versions, this.j, str);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public i(c.a aVar, com.amazon.aps.iva.sv.n nVar, com.amazon.aps.iva.v00.b bVar, b bVar2, com.amazon.aps.iva.tv.a aVar2) {
        super(aVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = nVar;
        this.c = bVar;
        this.d = bVar2;
        this.e = aVar2;
    }

    @Override // com.amazon.aps.iva.u00.c
    public final void Q2(com.amazon.aps.iva.hg.e eVar, DownloadButton downloadButton) {
        com.amazon.aps.iva.yb0.j.f(downloadButton, "downloadButtonView");
        com.amazon.aps.iva.hg.g gVar = eVar.c;
        this.b.X0(gVar, new l(this, gVar, eVar, downloadButton));
    }

    public final void q6(com.amazon.aps.iva.hg.g gVar, String str) {
        String str2;
        PlayableAsset playableAsset = (PlayableAsset) x.v0(gVar.d);
        if (playableAsset != null) {
            m view = getView();
            List<PlayableAssetVersion> versions = playableAsset.getVersions();
            if (str == null) {
                str2 = playableAsset.getAudioLocale();
            } else {
                str2 = str;
            }
            view.l2(versions, str2, new a(playableAsset, gVar, str));
        }
    }
}
