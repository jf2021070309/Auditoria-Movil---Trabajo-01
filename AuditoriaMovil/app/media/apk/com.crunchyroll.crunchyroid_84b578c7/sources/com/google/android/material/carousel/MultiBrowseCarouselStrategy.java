package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e.w;
/* loaded from: classes3.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private final boolean forceCompactArrangement;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};
    private static final int[] MEDIUM_COUNTS_COMPACT = {0};

    public MultiBrowseCarouselStrategy() {
        this(false);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        int[] iArr;
        float containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f2 = f;
        float smallSizeMin = CarouselStrategyHelper.getSmallSizeMin(view.getContext()) + f2;
        float smallSizeMax = CarouselStrategyHelper.getSmallSizeMax(view.getContext()) + f2;
        float min = Math.min(measuredHeight + f2, containerHeight);
        float p = w.p((measuredHeight / 3.0f) + f2, CarouselStrategyHelper.getSmallSizeMin(view.getContext()) + f2, CarouselStrategyHelper.getSmallSizeMax(view.getContext()) + f2);
        float f3 = (min + p) / 2.0f;
        int[] iArr2 = SMALL_COUNTS;
        if (this.forceCompactArrangement) {
            iArr = MEDIUM_COUNTS_COMPACT;
        } else {
            iArr = MEDIUM_COUNTS;
        }
        int[] iArr3 = iArr;
        int max = (int) Math.max(1.0d, Math.floor(((containerHeight - (CarouselStrategyHelper.maxValue(iArr3) * f3)) - (CarouselStrategyHelper.maxValue(iArr2) * smallSizeMax)) / min));
        int ceil = (int) Math.ceil(containerHeight / min);
        int i = (ceil - max) + 1;
        int[] iArr4 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr4[i2] = ceil - i2;
        }
        return CarouselStrategyHelper.createLeftAlignedKeylineState(view.getContext(), f2, containerHeight, Arrangement.findLowestCostArrangement(containerHeight, p, smallSizeMin, smallSizeMax, iArr2, f3, iArr3, min, iArr4));
    }

    public MultiBrowseCarouselStrategy(boolean z) {
        this.forceCompactArrangement = z;
    }
}
