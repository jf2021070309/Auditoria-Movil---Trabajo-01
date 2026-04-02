package com.kwad.components.ad.reward.presenter.platdetail;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
import com.kwad.sdk.utils.az;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.reward.presenter.a {
    private View ud;
    private View ue;
    private View uf;
    private View ug;
    private Animator uj;
    private Animator uk;
    private Animator ul;
    private az uo;
    private az up;
    private final long ua = 1600;
    private final long ub = 3000;
    private final long uc = PushUIConfig.dismissTime;
    private boolean uh = false;
    private boolean ui = false;
    private Animator um = null;
    private long un = 3000;
    private Interpolator uq = PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f);
    private l mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.reward.presenter.platdetail.b.1
        private boolean ur = false;

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayPaused() {
            super.onMediaPlayPaused();
            b.this.uh = true;
            com.kwad.sdk.core.e.c.d("RewardImagePlayerPresenter", "onMediaPlayPaused : ");
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            super.onMediaPlayProgress(j, j2);
            if (j2 < b.this.un || this.ur) {
                return;
            }
            this.ur = true;
            b.this.ic();
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayStart() {
            super.onMediaPlayStart();
            b.this.uh = false;
            com.kwad.sdk.core.e.c.d("RewardImagePlayerPresenter", "onMediaPlayStart : ");
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlaying() {
            super.onMediaPlaying();
            b.this.uh = false;
            com.kwad.sdk.core.e.c.d("RewardImagePlayerPresenter", "onMediaPlaying : ");
            if (b.this.um == null || b.this.um.isRunning()) {
                return;
            }
            b.this.um.start();
            b.a(b.this, (Animator) null);
        }
    };

    private Animator a(View view, long j) {
        float[] fArr = {1.0f, 1.106f, 1.0f, 1.106f, 1.0f};
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", fArr);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", fArr);
        AnimatorSet animatorSet = new AnimatorSet();
        View view2 = this.ue;
        if (view2 != null) {
            animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, "alpha", 0.2f, 0.0f));
        } else {
            animatorSet.playTogether(ofFloat, ofFloat2);
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(this.uq);
        return animatorSet;
    }

    private Animator a(View view, View view2) {
        Animator o = o(view);
        Animator o2 = o(view2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "scaleX", 1.0f);
        ofFloat.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, o2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(o, animatorSet);
        return animatorSet2;
    }

    static /* synthetic */ Animator a(b bVar, Animator animator) {
        bVar.um = null;
        return null;
    }

    private View a(int i, ViewGroup viewGroup) {
        ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.ksad_image_player_sweep, viewGroup, false);
        imageView.setImageDrawable(getContext().getResources().getDrawable(i));
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Animator animator) {
        if (this.uh) {
            this.um = animator;
        } else {
            animator.start();
        }
    }

    private Animator b(View view, long j) {
        Animator a = a(view, 1600L);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f);
        ofFloat.setDuration(PushUIConfig.dismissTime);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(a, ofFloat);
        animatorSet.setDuration(1600L);
        return animatorSet;
    }

    static /* synthetic */ View b(b bVar, View view) {
        bVar.ue = null;
        return null;
    }

    static /* synthetic */ boolean b(b bVar, boolean z) {
        bVar.ui = true;
        return true;
    }

    static /* synthetic */ View c(b bVar, View view) {
        bVar.uf = null;
        return null;
    }

    static /* synthetic */ View d(b bVar, View view) {
        bVar.ug = null;
        return null;
    }

    private void ia() {
        this.uo = new az(getContext().getResources().getDimensionPixelSize(R.dimen.ksad_image_player_sweep_wave_width_start), getContext().getResources().getDimensionPixelSize(R.dimen.ksad_image_player_sweep_wave_height_start));
        this.up = new az(getContext().getResources().getDimensionPixelSize(R.dimen.ksad_image_player_sweep_wave_width_end), getContext().getResources().getDimensionPixelSize(R.dimen.ksad_image_player_sweep_wave_height_end));
    }

    private View ib() {
        ImageView imageView = new ImageView(getContext());
        imageView.setClickable(false);
        imageView.setFocusable(false);
        imageView.setFocusableInTouchMode(false);
        imageView.setLongClickable(false);
        imageView.setBackgroundColor(Color.parseColor("#222222"));
        imageView.setAlpha(0.2f);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ic() {
        this.uj = a(this.ud, 1600L);
        this.uk = a(this.uf, this.ug);
        this.ul = b(this.ud, 1600L);
        this.uj.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.presenter.platdetail.b.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                b.p(b.this.ue);
                b.b(b.this, (View) null);
                if (b.this.ui) {
                    return;
                }
                b bVar = b.this;
                bVar.a(bVar.uk);
            }
        });
        this.uk.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.presenter.platdetail.b.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                b bVar = b.this;
                bVar.a(bVar.ul);
                b.p(b.this.uf);
                b.p(b.this.ug);
                b.c(b.this, null);
                b.d(b.this, null);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                b.b(b.this, true);
            }
        });
        this.ul.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.presenter.platdetail.b.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                b bVar = b.this;
                bVar.a(bVar.ul);
            }
        });
        a(this.uj);
    }

    private Animator o(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", -(com.kwad.sdk.d.a.a.getScreenHeight(getContext()) + ((this.up.getHeight() + this.uo.getHeight()) / 2)));
        float Jr = this.up.Jr() / this.uo.Jr();
        float Js = this.up.Js() / this.uo.Js();
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, Jr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, Js);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.8f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(3000L);
        animatorSet.playTogether(ofFloat2, ofFloat3, ofFloat, ofFloat4);
        animatorSet.setInterpolator(this.uq);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(View view) {
        if (view != null) {
            try {
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            }
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.qB.oZ.a(this.mVideoPlayStateListener);
        FrameLayout Q = this.qB.oZ.jV().Q(getContext());
        this.ud = Q;
        if (Q.getParent() != null) {
            return;
        }
        ia();
        ((FrameLayout) findViewById(R.id.ksad_reward_play_layout)).addView(this.ud, -1, -1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = -this.uo.getHeight();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ksad_root_container);
        View ib = ib();
        this.ue = ib;
        frameLayout.addView(ib, -1, -1);
        View a = a(R.drawable.ksad_image_player_sweep1, frameLayout);
        this.uf = a;
        frameLayout.addView(a, layoutParams);
        View a2 = a(R.drawable.ksad_image_player_sweep2, frameLayout);
        this.ug = a2;
        frameLayout.addView(a2, layoutParams);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
        super.onDestroy();
        this.ud = null;
        com.kwad.components.ad.reward.l.a jV = this.qB.oZ.jV();
        if (jV != null) {
            jV.release();
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        Animator animator = this.uk;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.uj;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.ul;
        if (animator3 != null) {
            animator3.cancel();
        }
        this.qB.oZ.b(this.mVideoPlayStateListener);
    }
}
