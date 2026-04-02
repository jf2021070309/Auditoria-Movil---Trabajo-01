package com.ellation.crunchyroll.cast.expanded.mature;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.ve0.k0;
import com.amazon.aps.iva.ve0.u0;
import com.ellation.crunchyroll.model.PlayableAsset;
import kotlin.Metadata;
/* compiled from: ChromecastMatureFlowViewModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/cast/expanded/mature/ChromecastMatureFlowViewModel;", "", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "currentAsset", "Lcom/amazon/aps/iva/kb0/q;", "onEnableMatureContent", "Lcom/amazon/aps/iva/ve0/u0;", "", "getMatureFlowProcessing", "()Lcom/amazon/aps/iva/ve0/u0;", "matureFlowProcessing", "Lcom/amazon/aps/iva/ve0/k0;", "Lcom/amazon/aps/iva/ez/g;", "getMatureFlowStatus", "()Lcom/amazon/aps/iva/ve0/k0;", "matureFlowStatus", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface ChromecastMatureFlowViewModel {
    u0<Boolean> getMatureFlowProcessing();

    k0<g<PlayableAsset>> getMatureFlowStatus();

    void onEnableMatureContent(PlayableAsset playableAsset);
}
