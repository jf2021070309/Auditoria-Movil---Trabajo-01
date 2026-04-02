package com.kwad.components.ad.widget.tailframe.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwad.components.ad.widget.AppScoreView;
import com.kwad.components.ad.widget.KsAppTagsView;
import com.kwad.components.core.page.widget.TextProgressBar;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.b.c;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import java.util.List;
/* loaded from: classes.dex */
public abstract class a extends LinearLayout {
    protected AppScoreView Bh;
    protected TextProgressBar Bx;
    protected View GH;
    protected TextView HQ;
    protected TextView dx;
    protected ValueAnimator iK;
    protected ImageView ll;
    protected TextView lm;
    protected KsAppTagsView yB;
    protected com.kwad.components.ad.i.a yE;
    private Runnable yF;
    protected View yt;
    protected Button yu;
    protected Button yv;

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(l.wrapContextIfNeed(context), attributeSet, i);
        initView();
    }

    private void initView() {
        this.GH = l.inflate(getContext(), getLayoutId(), this);
        this.ll = (ImageView) findViewById(R.id.ksad_app_icon);
        this.lm = (TextView) findViewById(R.id.ksad_app_name);
        this.Bh = (AppScoreView) findViewById(R.id.ksad_app_score);
        this.dx = (TextView) findViewById(R.id.ksad_app_download_count);
        this.HQ = (TextView) findViewById(R.id.ksad_app_introduce);
        TextProgressBar textProgressBar = (TextProgressBar) findViewById(R.id.ksad_download_bar);
        this.Bx = textProgressBar;
        textProgressBar.setTextDimen(com.kwad.sdk.d.a.a.a(getContext(), 16.0f));
        this.Bx.setTextColor(-1);
        this.yB = (KsAppTagsView) findViewById(R.id.ksad_reward_apk_info_tags);
        this.yu = (Button) findViewById(R.id.ksad_reward_apk_info_install_action);
        this.yv = (Button) findViewById(R.id.ksad_reward_apk_info_install_start);
        this.yt = findViewById(R.id.ksad_reward_apk_info_install_container);
        this.yE = new com.kwad.components.ad.i.a(this.GH);
    }

    private void mg() {
        ValueAnimator valueAnimator = this.iK;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.2f, 1.0f);
            this.iK = ofFloat;
            ofFloat.setDuration(1200L);
            this.iK.setRepeatCount(-1);
            this.iK.setRepeatMode(1);
            this.iK.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.widget.tailframe.appbar.a.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    a.this.Bx.setScaleY(floatValue);
                    a.this.Bx.setScaleX(floatValue);
                }
            });
            this.iK.start();
        }
    }

    public void b(AdTemplate adTemplate) {
        ImageView imageView;
        String bQ;
        AdInfo ck = d.ck(adTemplate);
        if (d.u(adTemplate)) {
            imageView = this.ll;
            bQ = com.kwad.sdk.core.response.b.a.ct(ck);
        } else {
            imageView = this.ll;
            bQ = com.kwad.sdk.core.response.b.a.bQ(ck);
        }
        KSImageLoader.loadAppIcon(imageView, bQ, adTemplate, 12);
        this.lm.setText(com.kwad.sdk.core.response.b.a.bO(ck));
        if (!d.u(adTemplate)) {
            float as = com.kwad.sdk.core.response.b.a.as(ck);
            if (as >= 3.0f) {
                this.Bh.setScore(as);
                this.Bh.setVisibility(0);
            } else {
                this.Bh.setVisibility(8);
            }
            String ar = com.kwad.sdk.core.response.b.a.ar(ck);
            if (TextUtils.isEmpty(ar)) {
                this.dx.setVisibility(8);
            } else {
                this.dx.setText(ar);
                this.dx.setVisibility(0);
            }
        }
        this.HQ.setText(com.kwad.sdk.core.response.b.a.an(ck));
        if (d.u(adTemplate)) {
            this.Bx.setVisibility(8);
            this.yt.setVisibility(0);
            this.yv.setText("查看详情");
            Button button = this.yu;
            StringBuilder sb = new StringBuilder();
            sb.append(com.kwad.sdk.core.config.d.zB());
            button.setText(String.format("浏览详情页%s秒，领取奖励", sb.toString()));
            if (!adTemplate.mRewardVerifyCalled) {
                if (this.yF == null) {
                    this.yF = new Runnable() { // from class: com.kwad.components.ad.widget.tailframe.appbar.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.yE.ic();
                        }
                    };
                }
                this.yt.postDelayed(this.yF, 1600L);
            }
        } else {
            this.Bx.setVisibility(0);
            this.yt.setVisibility(8);
            Runnable runnable = this.yF;
            if (runnable != null) {
                this.yt.removeCallbacks(runnable);
                this.yF = null;
            }
            z(d.ck(adTemplate));
        }
        if (d.u(adTemplate)) {
            List<String> cb = c.cb(adTemplate);
            if (cb.size() > 0) {
                this.yB.setVisibility(0);
            } else {
                this.yB.setVisibility(8);
            }
            this.yB.setAppTags(cb);
        }
    }

    public View getBtnInstallContainer() {
        return this.yt;
    }

    public abstract int getLayoutId();

    public TextProgressBar getTextProgressBar() {
        return this.Bx;
    }

    public final void ks() {
        ValueAnimator valueAnimator = this.iK;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.iK.cancel();
            this.iK.end();
        }
        Runnable runnable = this.yF;
        if (runnable != null) {
            this.yt.removeCallbacks(runnable);
            this.yF = null;
        }
        this.yE.lR();
    }

    public final void z(AdInfo adInfo) {
        int i = adInfo.status;
        if (i == 1 || i == 2 || i == 3) {
            ks();
        } else {
            mg();
        }
    }
}
