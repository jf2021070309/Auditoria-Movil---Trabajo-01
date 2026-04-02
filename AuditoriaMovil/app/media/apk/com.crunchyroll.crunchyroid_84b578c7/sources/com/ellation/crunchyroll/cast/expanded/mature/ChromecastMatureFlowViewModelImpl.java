package com.ellation.crunchyroll.cast.expanded.mature;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.ve0.g0;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.expanded.ChromecastMaturePreferenceInteractor;
import com.ellation.crunchyroll.model.PlayableAsset;
import kotlin.Metadata;
/* compiled from: ChromecastMatureFlowViewModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/ellation/crunchyroll/cast/expanded/mature/ChromecastMatureFlowViewModelImpl;", "Lcom/amazon/aps/iva/i5/f0;", "Lcom/ellation/crunchyroll/cast/expanded/mature/ChromecastMatureFlowViewModel;", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "currentAsset", "Lcom/amazon/aps/iva/kb0/q;", "onEnableMatureContent", "Lcom/ellation/crunchyroll/cast/expanded/ChromecastMaturePreferenceInteractor;", "maturePreferenceInteractor", "Lcom/ellation/crunchyroll/cast/expanded/ChromecastMaturePreferenceInteractor;", "Lcom/amazon/aps/iva/ve0/g0;", "", "matureFlowProcessing", "Lcom/amazon/aps/iva/ve0/g0;", "getMatureFlowProcessing", "()Lcom/amazon/aps/iva/ve0/g0;", "Lcom/amazon/aps/iva/ve0/f0;", "Lcom/amazon/aps/iva/ez/g;", "matureFlowStatus", "Lcom/amazon/aps/iva/ve0/f0;", "getMatureFlowStatus", "()Lcom/amazon/aps/iva/ve0/f0;", "<init>", "(Lcom/ellation/crunchyroll/cast/expanded/ChromecastMaturePreferenceInteractor;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ChromecastMatureFlowViewModelImpl extends f0 implements ChromecastMatureFlowViewModel {
    private final g0<Boolean> matureFlowProcessing;
    private final com.amazon.aps.iva.ve0.f0<g<PlayableAsset>> matureFlowStatus;
    private final ChromecastMaturePreferenceInteractor maturePreferenceInteractor;

    public ChromecastMatureFlowViewModelImpl(ChromecastMaturePreferenceInteractor chromecastMaturePreferenceInteractor) {
        j.f(chromecastMaturePreferenceInteractor, "maturePreferenceInteractor");
        this.maturePreferenceInteractor = chromecastMaturePreferenceInteractor;
        this.matureFlowProcessing = x.e(Boolean.FALSE);
        this.matureFlowStatus = t.g(0, 0, null, 7);
    }

    @Override // com.ellation.crunchyroll.cast.expanded.mature.ChromecastMatureFlowViewModel
    public void onEnableMatureContent(PlayableAsset playableAsset) {
        getMatureFlowProcessing().setValue(Boolean.TRUE);
        i.d(w.D(this), null, null, new ChromecastMatureFlowViewModelImpl$onEnableMatureContent$1(this, playableAsset, null), 3);
    }

    @Override // com.ellation.crunchyroll.cast.expanded.mature.ChromecastMatureFlowViewModel
    public g0<Boolean> getMatureFlowProcessing() {
        return this.matureFlowProcessing;
    }

    @Override // com.ellation.crunchyroll.cast.expanded.mature.ChromecastMatureFlowViewModel
    public com.amazon.aps.iva.ve0.f0<g<PlayableAsset>> getMatureFlowStatus() {
        return this.matureFlowStatus;
    }
}
