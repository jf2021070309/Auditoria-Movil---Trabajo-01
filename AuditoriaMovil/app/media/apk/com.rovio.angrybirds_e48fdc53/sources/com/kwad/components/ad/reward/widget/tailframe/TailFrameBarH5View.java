package com.kwad.components.ad.reward.widget.tailframe;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
/* loaded from: classes.dex */
public class TailFrameBarH5View extends LinearLayout {
    protected TextView dB;
    protected TextView dC;
    protected ValueAnimator iK;

    public TailFrameBarH5View(Context context) {
        this(context, null, 0);
    }

    public TailFrameBarH5View(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TailFrameBarH5View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void f(Context context, int i) {
        l.inflate(context, i, this);
        this.dB = (TextView) findViewById(R.id.ksad_tf_h5_ad_desc);
        this.dC = (TextView) findViewById(R.id.ksad_tf_h5_open_btn);
    }

    private void kr() {
        if (this.iK != null) {
            ks();
            this.iK.start();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.2f, 1.0f);
        this.iK = ofFloat;
        ofFloat.setDuration(1200L);
        this.iK.setRepeatCount(-1);
        this.iK.setRepeatMode(1);
        this.iK.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.reward.widget.tailframe.TailFrameBarH5View.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TailFrameBarH5View.this.dC.setScaleY(floatValue);
                TailFrameBarH5View.this.dC.setScaleX(floatValue);
            }
        });
        this.iK.start();
    }

    public final void b(AdTemplate adTemplate) {
        AdInfo ck = d.ck(adTemplate);
        this.dB.setText(com.kwad.sdk.core.response.b.a.an(ck));
        this.dC.setText(com.kwad.sdk.core.response.b.a.aw(ck));
        kr();
    }

    public final void e(boolean z, boolean z2) {
        f(getContext(), z ? z2 ? R.layout.ksad_video_tf_bar_h5_portrait_vertical : R.layout.ksad_video_tf_bar_h5_portrait_horizontal : R.layout.ksad_video_tf_bar_h5_landscape);
    }

    public TextView getH5OpenBtn() {
        return this.dC;
    }

    public final void ks() {
        ValueAnimator valueAnimator = this.iK;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.iK.cancel();
        this.iK.end();
    }
}
