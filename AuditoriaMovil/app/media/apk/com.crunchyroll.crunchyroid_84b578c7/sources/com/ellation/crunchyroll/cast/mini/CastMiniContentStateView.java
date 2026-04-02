package com.ellation.crunchyroll.cast.mini;

import com.amazon.aps.iva.wy.h;
import com.ellation.crunchyroll.cast.stateoverlay.CastContentStateUiModel;
import kotlin.Metadata;
/* compiled from: CastMiniContentStateLayout.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStateView;", "Lcom/amazon/aps/iva/wy/h;", "Lcom/amazon/aps/iva/kb0/q;", "hideContentState", "Lcom/ellation/crunchyroll/cast/stateoverlay/CastContentStateUiModel;", "state", "showContentState", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastMiniContentStateView extends h {
    void hideContentState();

    void showContentState(CastContentStateUiModel castContentStateUiModel);
}
