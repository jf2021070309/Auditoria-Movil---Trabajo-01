package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e.w;
/* loaded from: classes3.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallSizeMin = CarouselStrategyHelper.getSmallSizeMin(view.getContext()) + f;
        float smallSizeMax = CarouselStrategyHelper.getSmallSizeMax(view.getContext()) + f;
        float f2 = containerHeight;
        float min = Math.min(measuredWidth + f, f2);
        float p = w.p((measuredWidth / 3.0f) + f, CarouselStrategyHelper.getSmallSizeMin(view.getContext()) + f, CarouselStrategyHelper.getSmallSizeMax(view.getContext()) + f);
        float f3 = (min + p) / 2.0f;
        int max = (int) Math.max(1.0d, Math.floor((f2 - (CarouselStrategyHelper.maxValue(SMALL_COUNTS) * smallSizeMax)) / min));
        int ceil = (((int) Math.ceil(f2 / min)) - max) + 1;
        int[] iArr = new int[ceil];
        for (int i = 0; i < ceil; i++) {
            iArr[i] = max + i;
        }
        return CarouselStrategyHelper.createLeftAlignedKeylineState(view.getContext(), f, f2, Arrangement.findLowestCostArrangement(f2, p, smallSizeMin, smallSizeMax, SMALL_COUNTS, f3, MEDIUM_COUNTS, min, iArr));
    }
}
