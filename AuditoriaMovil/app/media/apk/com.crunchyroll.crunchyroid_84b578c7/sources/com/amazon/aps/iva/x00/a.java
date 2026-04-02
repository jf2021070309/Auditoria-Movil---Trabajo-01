package com.amazon.aps.iva.x00;

import android.animation.ValueAnimator;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.presentation.download.button.DownloadButton;
import com.ellation.widgets.behavior.HideBottomViewOnScrollBehavior;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                DownloadButton downloadButton = (DownloadButton) obj;
                int i2 = DownloadButton.p;
                j.f(downloadButton, "this$0");
                j.f(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                j.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                downloadButton.h = ((Float) animatedValue).floatValue() * downloadButton.j * downloadButton.k;
                downloadButton.invalidate();
                return;
            default:
                HideBottomViewOnScrollBehavior.a aVar = (HideBottomViewOnScrollBehavior.a) obj;
                int i3 = HideBottomViewOnScrollBehavior.a.d;
                j.f(aVar, "this$0");
                j.f(valueAnimator, "it");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                j.d(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                aVar.b.setTranslationY(((Float) animatedValue2).floatValue());
                return;
        }
    }
}
