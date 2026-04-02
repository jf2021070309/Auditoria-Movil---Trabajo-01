package com.amazon.aps.iva.bp;

import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.Map;
/* compiled from: WatchScreenInteractor.kt */
/* loaded from: classes2.dex */
public interface b {
    Object f(com.amazon.aps.iva.ob0.d<? super ContentContainer> dVar);

    Object g(ContentContainer contentContainer, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.vo.c> dVar);

    Object n(String str, com.amazon.aps.iva.ob0.d<? super PlayableAsset> dVar);

    Object o(String[] strArr, com.amazon.aps.iva.ob0.d<? super Map<String, Playhead>> dVar);

    Object t(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.no.b> dVar);

    void u();
}
