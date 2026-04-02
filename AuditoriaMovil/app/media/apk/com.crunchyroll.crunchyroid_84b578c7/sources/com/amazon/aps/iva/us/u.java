package com.amazon.aps.iva.us;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: UpsellFlowEnteredAnalytics.kt */
/* loaded from: classes2.dex */
public interface u {

    /* compiled from: UpsellFlowEnteredAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ void a(u uVar, com.amazon.aps.iva.fs.b bVar, PlayableAsset playableAsset, int i) {
            if ((i & 2) != 0) {
                playableAsset = null;
            }
            uVar.onUpsellFlowEntryPointClick(bVar, playableAsset, (com.amazon.aps.iva.vw.a) null);
        }
    }

    void onUpsellFlowEntryPointClick(com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.vw.a aVar2);

    void onUpsellFlowEntryPointClick(com.amazon.aps.iva.fs.b bVar, PlayableAsset playableAsset, com.amazon.aps.iva.vw.a aVar);
}
