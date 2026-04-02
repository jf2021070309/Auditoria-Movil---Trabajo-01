package com.kwad.components.ad.reward.presenter;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.sdk.R;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class n extends a implements View.OnClickListener, com.kwad.components.ad.reward.presenter.platdetail.actionbar.a {
    private static long sz = 300;
    private ImageView eZ;
    private ViewGroup sA;
    private TextView sB;
    private boolean sC;
    private float sD;
    private WeakReference<View> sE;
    private q sF;
    private boolean sG = false;
    private com.kwad.components.ad.reward.e.f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.reward.presenter.n.1
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            n.this.hide();
        }
    };

    public n(q qVar) {
        this.sF = qVar;
    }

    private void a(ViewGroup.LayoutParams layoutParams) {
        int i;
        if (layoutParams == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.sA.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (layoutParams.height == -1) {
                i = this.sA.getResources().getDimensionPixelSize(R.dimen.ksad_reward_playable_pre_tips_margin_bottom_without_actionbar);
            } else {
                int dimensionPixelSize = this.sA.getResources().getDimensionPixelSize(R.dimen.ksad_reward_playable_pre_tips_margin_bottom);
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    WeakReference<View> weakReference = this.sE;
                    View view = weakReference != null ? weakReference.get() : null;
                    int i2 = marginLayoutParams2.height;
                    if (i2 <= 0 && view != null) {
                        i2 = view.getHeight();
                    }
                    marginLayoutParams.bottomMargin = i2 + marginLayoutParams2.bottomMargin + dimensionPixelSize;
                    this.sA.setLayoutParams(marginLayoutParams);
                }
                i = layoutParams.height + dimensionPixelSize;
            }
            marginLayoutParams.bottomMargin = i;
            this.sA.setLayoutParams(marginLayoutParams);
        }
    }

    private synchronized void hH() {
        if (this.sG) {
            return;
        }
        com.kwad.sdk.core.report.a.d(this.qB.mAdTemplate, (JSONObject) null, new com.kwad.sdk.core.report.j().ci(192).ae(this.qB.oZ.getPlayDuration()));
        this.sG = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animator hI() {
        ValueAnimator valueAnimator;
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.sA, "translationX", getContext().getResources().getDimension(R.dimen.ksad_reward_playable_pre_tips_transx));
        Drawable background = this.eZ.getBackground();
        if (background instanceof ColorDrawable) {
            final ColorDrawable colorDrawable = (ColorDrawable) background;
            valueAnimator = com.kwad.sdk.widget.a.ofArgb(getContext().getResources().getColor(R.color.ksad_playable_pre_tips_icon_bg), getContext().getResources().getColor(R.color.ksad_reward_main_color));
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.reward.presenter.n.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    colorDrawable.setColor(((Integer) valueAnimator2.getAnimatedValue()).intValue());
                }
            });
        } else {
            valueAnimator = null;
        }
        animatorSet.playTogether(ofFloat, valueAnimator, ObjectAnimator.ofFloat(this.sB, "alpha", 0.0f, 1.0f));
        animatorSet.setDuration(sz);
        return animatorSet;
    }

    private void initView() {
        ViewGroup viewGroup = this.sA;
        if (viewGroup == null) {
            return;
        }
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.ksad_playabel_pre_tips_icon);
        this.eZ = imageView;
        imageView.setBackgroundColor(getContext().getResources().getColor(R.color.ksad_playable_pre_tips_icon_bg));
        this.sB = (TextView) this.sA.findViewById(R.id.ksad_playabel_pre_tips_text);
        this.sA.setOnClickListener(this);
    }

    public final void I(boolean z) {
        ViewGroup viewGroup = this.sA;
        if (viewGroup == null || viewGroup.getVisibility() == 0) {
            return;
        }
        hH();
        WeakReference<View> weakReference = this.sE;
        if (weakReference != null && weakReference.get() != null) {
            a(this.sE.get().getLayoutParams());
        }
        this.sA.setVisibility(0);
        if (z) {
            this.sA.postDelayed(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.n.2
                @Override // java.lang.Runnable
                public final void run() {
                    n.this.hI().start();
                }
            }, 2000L);
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.a
    public final void a(RewardActionBarControl.ShowActionBarResult showActionBarResult, View view) {
        this.sE = new WeakReference<>(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        com.kwad.sdk.core.e.c.d("RewardPlayablePreTips", "onActionBarShown: type: " + showActionBarResult + ", params.height: " + layoutParams.height + ", params.width: " + layoutParams.width);
        a(layoutParams);
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (this.sA == null) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.ksad_playable_pre_tips_stub);
            this.sA = (ViewGroup) (viewStub != null ? viewStub.inflate() : findViewById(R.id.ksad_playable_pre_tips_root));
            initView();
        }
        if (this.qB.fX()) {
            a(new ViewGroup.LayoutParams(-1, this.sA.getResources().getDimensionPixelSize(R.dimen.ksad_reward_js_actionbar_height)));
        } else {
            this.qB.pc.a(this);
        }
        this.qB.b(this.mPlayEndPageListener);
    }

    public final void hide() {
        ViewGroup viewGroup = this.sA;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewGroup viewGroup = this.sA;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        com.kwad.components.ad.reward.b.fr().a(PlayableSource.PENDANT_CLICK_NOT_AUTO);
        com.kwad.sdk.core.report.a.a(this.qB.mAdTemplate, new com.kwad.sdk.core.report.j().ci(192).ae(this.qB.oZ.getPlayDuration()));
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.sD = com.kwad.components.ad.reward.a.b.gK();
        this.sC = !com.kwad.components.ad.reward.a.b.gM() && com.kwad.components.ad.reward.a.b.gL();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qB.c(this.mPlayEndPageListener);
        this.qB.pc.b(this);
    }
}
