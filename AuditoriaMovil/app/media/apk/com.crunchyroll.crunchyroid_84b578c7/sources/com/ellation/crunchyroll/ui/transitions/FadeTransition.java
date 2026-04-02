package com.ellation.crunchyroll.ui.transitions;

import android.view.View;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
/* compiled from: FadeTransition.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ellation/crunchyroll/ui/transitions/FadeTransition;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/ellation/crunchyroll/ui/transitions/Transition;", "", "transitionProgress", "viewModelIn", "viewModelOut", "Lcom/amazon/aps/iva/kb0/q;", "modifyView", "(FLjava/lang/Object;Ljava/lang/Object;)V", "minAlpha", "F", "maxAlpha", "Lcom/ellation/crunchyroll/ui/transitions/RangeMapper;", "alphaIncreaseRangeMapper", "Lcom/ellation/crunchyroll/ui/transitions/RangeMapper;", "alphaDecreaseRangeMapper", "<init>", "(FF)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class FadeTransition<T> extends Transition<T> {
    public static final int $stable = 0;
    private final RangeMapper alphaDecreaseRangeMapper;
    private final RangeMapper alphaIncreaseRangeMapper;
    private final float maxAlpha;
    private final float minAlpha;

    public FadeTransition(float f, float f2) {
        this.minAlpha = f;
        this.maxAlpha = f2;
        this.alphaIncreaseRangeMapper = new RangeMapper(0.0f, 100.0f, f, f2);
        this.alphaDecreaseRangeMapper = new RangeMapper(0.0f, 100.0f, f2, f);
    }

    @Override // com.ellation.crunchyroll.ui.transitions.Transition
    public void modifyView(float f, T t, T t2) {
        if (j.a(t, t2)) {
            View viewIn = getViewIn();
            if (viewIn != null) {
                viewIn.setAlpha(this.minAlpha);
            }
            View viewOut = getViewOut();
            if (viewOut != null) {
                viewOut.setAlpha(this.maxAlpha);
                return;
            }
            return;
        }
        View viewIn2 = getViewIn();
        if (viewIn2 != null) {
            viewIn2.setAlpha(this.alphaDecreaseRangeMapper.convert(f));
        }
        View viewOut2 = getViewOut();
        if (viewOut2 != null) {
            viewOut2.setAlpha(this.alphaIncreaseRangeMapper.convert(f));
        }
    }
}
