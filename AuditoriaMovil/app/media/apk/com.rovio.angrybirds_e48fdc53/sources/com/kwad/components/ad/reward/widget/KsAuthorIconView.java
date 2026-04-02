package com.kwad.components.ad.reward.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Message;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.kwad.components.core.t.g;
import com.kwad.components.core.widget.KSCornerImageView;
import com.kwad.components.core.widget.e;
import com.kwad.sdk.R;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.b.a;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import com.kwad.sdk.utils.bn;
/* loaded from: classes.dex */
public class KsAuthorIconView extends FrameLayout implements bn.a {
    private ViewGroup AK;
    private KSCornerImageView AL;
    private KSCornerImageView AM;
    private KSCornerImageView AN;
    private TextView AO;
    private View AP;
    private View AQ;
    private ImageView AR;
    private View AS;
    private View AT;
    private View AU;
    private View AV;
    private final bn gz;
    private KSCornerImageView zS;

    public KsAuthorIconView(Context context) {
        super(context);
        this.gz = new bn(this);
        R(context);
    }

    public KsAuthorIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gz = new bn(this);
        R(context);
    }

    public KsAuthorIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gz = new bn(this);
        R(context);
    }

    public KsAuthorIconView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.gz = new bn(this);
        R(context);
    }

    private void R(Context context) {
        l.inflate(context, R.layout.ksad_author_icon, this);
        this.AK = (ViewGroup) findViewById(R.id.ksad_author_icon_frame);
        this.zS = (KSCornerImageView) findViewById(R.id.ksad_author_icon);
        this.AL = (KSCornerImageView) findViewById(R.id.ksad_author_icon_outer);
        this.AM = (KSCornerImageView) findViewById(R.id.ksad_author_animator);
        this.AN = (KSCornerImageView) findViewById(R.id.ksad_author_animator2);
        this.AO = (TextView) findViewById(R.id.ksad_fans_count);
        this.AQ = findViewById(R.id.ksad_fans_hot_icon);
        this.AP = findViewById(R.id.ksad_author_btn_follow);
        this.AR = (ImageView) findViewById(R.id.ksad_author_arrow_down);
        this.AT = findViewById(R.id.ksad_origin_live_bottom_layout);
        this.AS = findViewById(R.id.ksad_top_layout);
        this.AV = findViewById(R.id.ksad_author_icon_layout);
        this.AU = findViewById(R.id.ksad_top_flag_layout);
    }

    private void a(e eVar, Drawable drawable) {
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setStroke(getResources().getDimensionPixelSize(R.dimen.ksad_reward_author_icon_stroke_width), eVar.sy());
        }
    }

    private Animator c(View view, long j) {
        if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getWidth(), getResources().getDimension(R.dimen.ksad_reward_author_icon_width));
        ofFloat.addUpdateListener(f(view, false));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        Interpolator create = PathInterpolatorCompat.create(0.42f, 0.0f, 1.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(create);
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    private static Animator e(View view, boolean z) {
        float width = view.getWidth();
        if (width <= 0.0f) {
            return null;
        }
        float f = 0.9f * width;
        c.d("KsAuthorIconView", "getIconScaleAnimator size: " + width + ", endSize: " + f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(width, f);
        ofFloat.addUpdateListener(f(view, false));
        Interpolator create = PathInterpolatorCompat.create(0.42f, 0.0f, 1.0f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(create);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f, width);
        ofFloat2.addUpdateListener(f(view, false));
        Interpolator create2 = PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f);
        ofFloat2.setDuration(500L);
        ofFloat2.setInterpolator(create2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        return animatorSet;
    }

    private static ValueAnimator.AnimatorUpdateListener f(final View view, final boolean z) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.reward.widget.KsAuthorIconView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    int i = (int) floatValue;
                    layoutParams.width = i;
                    if (!z) {
                        layoutParams.height = i;
                    }
                    view.setLayoutParams(layoutParams);
                }
            }
        };
    }

    private static Animator i(View view, int i) {
        if (view == null) {
            return null;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.setPivotX(width / 2.0f);
        view.setPivotY(height);
        AnimatorSet animatorSet = new AnimatorSet();
        Interpolator create = PathInterpolatorCompat.create(0.42f, 0.0f, 1.0f, 1.0f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 1.1f, 1.0f), ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.1f, 1.0f));
        animatorSet.setInterpolator(create);
        animatorSet.setDuration(250L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        Interpolator create2 = PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f);
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 1.1f, 1.0f), ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.1f, 1.0f));
        animatorSet2.setInterpolator(create2);
        animatorSet2.setDuration(250L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.setDuration(500L);
        return animatorSet3;
    }

    @Override // com.kwad.sdk.utils.bn.a
    public final void a(Message message) {
        if (message.what != 1) {
            return;
        }
        c.d("KsAuthorIconView", "handleMsg MSG_CHECKING");
        final Animator c = c(this.AM, 900L);
        final Animator c2 = c(this.AN, 1000L);
        final Animator e = e(this.zS, false);
        final Animator i = i(this.AS, TTAdConstant.SHOW_POLL_TIME_SPLASH_DEFAULT);
        if (i == null || c == null || c2 == null || e == null) {
            this.gz.sendEmptyMessageDelayed(1, 500L);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(e, c, c2);
        animatorSet.start();
        e.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.widget.KsAuthorIconView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                c.start();
                c2.start();
                e.start();
                i.start();
            }
        });
    }

    public final void a(e eVar) {
        g.a(eVar, this);
        this.AR.setImageResource(R.drawable.ksad_reward_follow_arrow_down);
        a(eVar, this.AM.getBackground());
        a(eVar, this.AL.getBackground());
        a(eVar, this.AN.getBackground());
        a(eVar, this.AK.getBackground());
    }

    public final void b(AdTemplate adTemplate) {
        AdInfo ck = d.ck(adTemplate);
        String bQ = a.bQ(ck);
        if (!TextUtils.isEmpty(bQ)) {
            KSImageLoader.loadImage(this.zS, bQ, adTemplate);
        }
        int aX = a.aX(ck);
        if (a.cw(d.ck(adTemplate))) {
            this.AO.setText("直播中");
            this.AQ.setVisibility(8);
            this.AP.setVisibility(8);
            if (aX == 8) {
                this.AU.setVisibility(8);
                this.AR.setVisibility(8);
                this.AT.setVisibility(0);
            } else {
                this.AT.setVisibility(8);
                this.AR.setVisibility(0);
                this.AT.setVisibility(8);
            }
        } else {
            this.AO.setText(a.cr(ck));
        }
        this.gz.sendEmptyMessageAtTime(1, 500L);
    }
}
