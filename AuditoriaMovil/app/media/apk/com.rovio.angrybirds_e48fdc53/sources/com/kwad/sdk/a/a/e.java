package com.kwad.sdk.a.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.report.j;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ak;
import com.kwad.sdk.utils.be;
/* loaded from: classes.dex */
public final class e implements View.OnClickListener {
    private final boolean ahY;
    private final boolean ahZ;
    private View aia;
    private ImageView aib;
    private TextView aic;
    private Button aid;
    private int aie;
    private int aif;
    private boolean aig;
    private final AdInfo mAdInfo;
    private final AdTemplate mAdTemplate;
    private final Context mContext;
    private View mRootView = yg();

    public e(Context context, AdTemplate adTemplate, boolean z, boolean z2, boolean z3) {
        this.mContext = context;
        this.mAdTemplate = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        this.ahY = z;
        this.ahZ = z2;
        this.aig = z3;
        lo();
    }

    private Animator A(View view) {
        ObjectAnimator ofFloat = (this.ahY && this.ahZ) ? ObjectAnimator.ofFloat(view, View.TRANSLATION_X, 0.0f, this.aif) : ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0.0f, -this.aie);
        ofFloat.setInterpolator(PathInterpolatorCompat.create(0.0f, 0.42f, 0.85f, 0.64f));
        ofFloat.setDuration(260L);
        return ofFloat;
    }

    private void b(FrameLayout frameLayout) {
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.ksad_install_tips_card_height);
        int dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(R.dimen.ksad_install_tips_card_margin);
        this.aie = dimensionPixelSize + dimensionPixelSize2;
        ViewGroup.LayoutParams layoutParams = this.mRootView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : new FrameLayout.LayoutParams(-1, dimensionPixelSize);
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = dimensionPixelSize2;
        layoutParams2.rightMargin = dimensionPixelSize2;
        layoutParams2.topMargin = dimensionPixelSize2;
        this.mRootView.setTranslationY(-this.aie);
        frameLayout.addView(this.mRootView, layoutParams2);
        show();
    }

    private void c(FrameLayout frameLayout) {
        int screenWidth = be.getScreenWidth(this.mContext);
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.ksad_install_tips_bottom_margin_left);
        int dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(R.dimen.ksad_install_tips_bottom_margin_bottom);
        int dimensionPixelOffset = this.mContext.getResources().getDimensionPixelOffset(R.dimen.ksad_install_tips_bottom_height);
        this.aif = screenWidth - dimensionPixelSize;
        ViewGroup.LayoutParams layoutParams = this.mRootView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : new FrameLayout.LayoutParams(-1, dimensionPixelOffset);
        layoutParams2.gravity = 80;
        layoutParams2.leftMargin = dimensionPixelSize;
        layoutParams2.rightMargin = 0;
        layoutParams2.bottomMargin = dimensionPixelSize2;
        this.mRootView.setTranslationX(this.aif);
        frameLayout.addView(this.mRootView, layoutParams2);
        show();
    }

    private void lo() {
        this.aid.setText(this.ahY ? "安装" : "打开");
        this.aia.setOnClickListener(this);
        this.aid.setOnClickListener(this);
        KSImageLoader.loadAppIcon(this.aib, com.kwad.sdk.core.response.b.a.bQ(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate)), this.mAdTemplate, 8);
        String ao = com.kwad.sdk.core.response.b.a.ao(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
        if (ao.length() >= 8) {
            ao = ao.substring(0, 7) + "...";
        }
        this.aic.setText(this.mContext.getString(this.ahY ? R.string.ksad_install_tips : R.string.ksad_launch_tips, ao));
    }

    private void show() {
        ObjectAnimator ofFloat = (this.ahY && this.ahZ) ? ObjectAnimator.ofFloat(this.mRootView, View.TRANSLATION_X, this.aif, 0.0f) : ObjectAnimator.ofFloat(this.mRootView, View.TRANSLATION_Y, -this.aie, 0.0f);
        ofFloat.setInterpolator(PathInterpolatorCompat.create(0.25f, 0.1f, 0.27f, 0.87f));
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    private View yg() {
        Context context;
        int i;
        if (this.ahY && this.ahZ) {
            context = this.mContext;
            i = R.layout.ksad_install_tips_bottom;
        } else {
            context = this.mContext;
            i = R.layout.ksad_install_tips;
        }
        this.mRootView = l.inflate(context, i, null);
        ViewCompat.setElevation(this.mRootView, this.mContext.getResources().getDimension(R.dimen.ksad_install_tips_card_elevation));
        this.aia = this.mRootView.findViewById(R.id.ksad_install_tips_close);
        this.aib = (ImageView) this.mRootView.findViewById(R.id.ksad_install_tips_icon);
        this.aic = (TextView) this.mRootView.findViewById(R.id.ksad_install_tips_content);
        this.aid = (Button) this.mRootView.findViewById(R.id.ksad_install_tips_install);
        return this.mRootView;
    }

    public final void a(FrameLayout frameLayout) {
        if (this.mRootView.getParent() != null) {
            return;
        }
        if (this.ahY && this.ahZ) {
            c(frameLayout);
        } else {
            b(frameLayout);
        }
        this.mRootView.postDelayed(new Runnable() { // from class: com.kwad.sdk.a.a.e.1
            @Override // java.lang.Runnable
            public final void run() {
                e.this.dismiss();
            }
        }, 10000L);
    }

    public final void dismiss() {
        if (this.mRootView.getParent() == null) {
            return;
        }
        final ViewGroup viewGroup = (ViewGroup) this.mRootView.getParent();
        Animator A = A(this.mRootView);
        A.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.sdk.a.a.e.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewGroup.removeView(e.this.mRootView);
            }
        });
        A.start();
        c.xY().yd();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dismiss();
        if (view.getId() != R.id.ksad_install_tips_install) {
            if (view.getId() == R.id.ksad_install_tips_close) {
                if (!this.ahY) {
                    com.kwad.sdk.core.report.a.o(this.mAdTemplate, 48);
                } else if (!this.aig) {
                    com.kwad.sdk.core.report.a.p(this.mAdTemplate, 46);
                } else {
                    j jVar = new j();
                    jVar.ci(69);
                    jVar.cm(23);
                    jVar.cq(1);
                    com.kwad.sdk.core.report.a.a(this.mAdTemplate, jVar);
                }
            }
        } else if (!this.ahY) {
            if (ak.am(this.mContext, com.kwad.sdk.core.response.b.a.aq(this.mAdInfo))) {
                com.kwad.sdk.core.report.a.aA(this.mAdTemplate);
            }
            com.kwad.sdk.core.report.a.o(this.mAdTemplate, 47);
        } else {
            if (this.aig) {
                j jVar2 = new j();
                jVar2.ci(29);
                jVar2.cm(23);
                com.kwad.sdk.core.report.a.a(this.mAdTemplate, jVar2);
            } else {
                com.kwad.sdk.core.report.a.p(this.mAdTemplate, 45);
            }
            if (ak.an(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext(), this.mAdInfo.downloadFilePath)) {
                com.kwad.sdk.core.report.a.i(this.mAdTemplate, 1);
            }
        }
    }
}
