package com.kwad.components.ad.reward.m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.utils.bc;
import com.kwad.sdk.utils.bj;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class l extends s implements View.OnClickListener {
    private ImageView eZ;
    private TextView lG;
    private com.kwad.components.ad.reward.j qB;
    private ImageView zC;
    private TextView zD;
    private TextView zE;
    private TextView zF;
    private View zG;
    private Set<ImageView> zH = new HashSet();
    private TextView zI;
    private Animator zJ;

    public l(com.kwad.components.ad.reward.j jVar) {
        this.qB = jVar;
    }

    private static Animator a(View view, long j, float f) {
        if (view == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Interpolator create = PathInterpolatorCompat.create(0.22f, 0.59f, 0.36f, 1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(view.getHeight());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 1.0f);
        ofFloat.setDuration(100L);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "rotation", 0.0f, f).setDuration(j);
        float f2 = -f;
        long j2 = j * 2;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "rotation", f, f2).setDuration(j2);
        duration2.setInterpolator(create);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "rotation", f2, f).setDuration(j2);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, "rotation", f, f2).setDuration(j2);
        duration4.setInterpolator(create);
        animatorSet.playSequentially(ofFloat, duration, duration2, duration3, duration4, ObjectAnimator.ofFloat(view, "rotation", f2, 0.0f).setDuration(j));
        return animatorSet;
    }

    static /* synthetic */ Animator a(l lVar, View view) {
        return r(view);
    }

    static /* synthetic */ Animator a(l lVar, View view, long j, float f) {
        return a(view, 100L, 8.0f);
    }

    private void a(com.kwad.components.ad.reward.model.a aVar) {
        this.zD.setText(aVar.getTitle());
        this.lG.setText(aVar.hs());
        this.zE.setText(aVar.hp());
        String gw = aVar.gw();
        Drawable drawable = this.eZ.getResources().getDrawable(R.drawable.ksad_ic_default_user_avatar);
        KSImageLoader.loadCircleIcon(this.eZ, gw, drawable);
        String X = com.kwad.components.ad.d.b.X();
        if (!bc.isNullString(X)) {
            KSImageLoader.loadImage(this.zC, X, aVar.hj());
        }
        if (!aVar.hq()) {
            this.zG.setVisibility(8);
            return;
        }
        this.zG.setVisibility(0);
        String ho = aVar.ho();
        if (!TextUtils.isEmpty(ho)) {
            this.zI.setText(String.format("%s已预约直播", ho));
        }
        if (aVar.hr() != null) {
            List<String> hr = aVar.hr();
            int i = 0;
            for (ImageView imageView : this.zH) {
                if (i < hr.size()) {
                    imageView.setVisibility(0);
                    KSImageLoader.loadCircleIcon(imageView, hr.get(i), drawable);
                }
                i++;
            }
        }
    }

    private void initView() {
        if (this.sA == null) {
            return;
        }
        this.zF = (TextView) this.sA.findViewById(R.id.ksad_reward_live_subscribe_badge);
        this.zC = (ImageView) this.sA.findViewById(R.id.ksad_reward_live_subscribe_kwai_logo);
        this.eZ = (ImageView) this.sA.findViewById(R.id.ksad_reward_live_subscribe_icon);
        this.zD = (TextView) this.sA.findViewById(R.id.ksad_reward_live_subscribe_name);
        this.lG = (TextView) this.sA.findViewById(R.id.ksad_reward_live_subscribe_desc);
        this.zE = (TextView) this.sA.findViewById(R.id.ksad_reward_live_subscribe_btn_follow);
        this.zG = this.sA.findViewById(R.id.ksad_reward_live_subscribe_follower_area);
        this.zH.add((ImageView) this.sA.findViewById(R.id.ksad_reward_live_subscribe_follower_icon1));
        this.zH.add((ImageView) this.sA.findViewById(R.id.ksad_reward_live_subscribe_follower_icon2));
        this.zH.add((ImageView) this.sA.findViewById(R.id.ksad_reward_live_subscribe_follower_icon3));
        this.zI = (TextView) this.sA.findViewById(R.id.ksad_reward_live_subscribe_count);
        this.sA.setOnClickListener(this);
        this.zE.setOnClickListener(this);
    }

    private void kh() {
        this.zF.postDelayed(new Runnable() { // from class: com.kwad.components.ad.reward.m.l.1
            @Override // java.lang.Runnable
            public final void run() {
                l lVar = l.this;
                lVar.zJ = l.a(lVar, lVar.zF, 100L, 8.0f);
                l.this.zJ.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.m.l.1.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        if (l.this.zJ != null) {
                            l.this.zJ.start();
                        }
                    }
                });
                l.this.zJ.start();
            }
        }, 500L);
    }

    private void ki() {
        bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.ad.reward.m.l.2
            @Override // java.lang.Runnable
            public final void run() {
                l lVar = l.this;
                l.a(lVar, lVar.zG).start();
            }
        }, 2000L);
    }

    private static Animator r(View view) {
        Interpolator create = PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationY", view.getResources().getDimension(R.dimen.ksad_live_subscribe_card_count_area_trans_y)).setDuration(250L);
        duration.setInterpolator(create);
        return duration;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.components.ad.reward.m.d
    public final void a(r rVar) {
        super.a(rVar);
        AdTemplate adTemplate = rVar.getAdTemplate();
        if (adTemplate != null) {
            a(com.kwad.components.ad.reward.model.a.y(adTemplate));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.components.ad.reward.m.d
    public final void ac(boolean z) {
        super.ac(z);
        Context context = this.sA.getContext();
        if (ai.IK()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.sA.getLayoutParams();
        layoutParams.width = context.getResources().getDimensionPixelSize(R.dimen.ksad_live_subscribe_card_width_horizontal);
        this.sA.setLayoutParams(layoutParams);
    }

    public final void h(ViewGroup viewGroup) {
        super.a(viewGroup, R.id.ksad_reward_live_subscribe_stub, R.id.ksad_reward_live_subscribe_root);
        initView();
    }

    public final void kg() {
        kh();
        ki();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.equals(this.zE)) {
            this.qB.a(1, view.getContext(), 29, 1);
        } else if (view.equals(this.sA)) {
            this.qB.a(1, view.getContext(), 53, 2);
        }
    }

    @Override // com.kwad.components.ad.reward.m.d
    public final void onUnbind() {
        super.onUnbind();
        Animator animator = this.zJ;
        if (animator != null) {
            animator.cancel();
            this.zJ = null;
        }
    }
}
