package com.kwad.components.ad.splashscreen.c.a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.splashscreen.c.e {
    private AnimatorSet Eg;
    private TextView Eh;
    private ViewGroup Ei;
    private ViewGroup Ej;

    private void initView() {
        this.Eh = (TextView) findViewById(R.id.ksad_ad_developer_text);
        this.Ei = (ViewGroup) findViewById(R.id.ksad_splash_end_card_native_view);
        this.Ej = (ViewGroup) findViewById(R.id.ksad_splash_end_card_native_dialog_root);
    }

    private void lx() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Ej, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Eh, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.Ei, "scaleX", 0.8f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.Ei, "scaleY", 0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.Eg = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        this.Eg.setDuration(300L);
        this.Eg.start();
    }

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        lx();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        initView();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        AnimatorSet animatorSet = this.Eg;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
