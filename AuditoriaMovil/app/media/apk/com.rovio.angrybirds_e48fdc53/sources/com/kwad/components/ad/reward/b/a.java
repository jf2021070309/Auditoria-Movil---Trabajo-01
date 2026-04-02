package com.kwad.components.ad.reward.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.reward.m.d;
import com.kwad.components.ad.reward.m.r;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdProductInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.CouponInfo;
import com.kwad.sdk.m.l;
import com.kwad.sdk.utils.bj;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a extends d implements View.OnClickListener {
    private TextView gS;
    private final ViewGroup gi;
    private TextView lG;
    private int[] qW;
    private View qX;
    private ImageView qY;
    private TextView qZ;
    private Button ra;
    private b rb;

    /* renamed from: com.kwad.components.ad.reward.b.a$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 implements Runnable {
        final /* synthetic */ r rc;
        final /* synthetic */ long rd;

        AnonymousClass1(r rVar, long j) {
            this.rc = rVar;
            this.rd = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            final Animator a = a.a(aVar, aVar.qX);
            a.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.b.a.1.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    a.removeListener(this);
                    com.kwad.sdk.core.report.a.b(AnonymousClass1.this.rc.getAdTemplate(), 169, (JSONObject) null);
                    a.a(a.this, a.this.qY, AnonymousClass1.this.rd).start();
                    bj.a(new Runnable() { // from class: com.kwad.components.ad.reward.b.a.1.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.gT();
                        }
                    }, null, AnonymousClass1.this.rd);
                }
            });
            a.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.ad.reward.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0165a {
        private CharSequence rj;
        private CharSequence rk;
        private CharSequence rl;
        private CharSequence title;

        private C0165a(CouponInfo couponInfo) {
            this.title = couponInfo.displayTitle;
            this.rj = couponInfo.displayValue;
            this.rk = !TextUtils.isEmpty(couponInfo.displayBase) ? String.format("满%s可用", couponInfo.displayBase) : "";
            this.rl = couponInfo.displayActionWords;
        }

        private static C0165a a(CouponInfo couponInfo) {
            if (couponInfo == null) {
                return null;
            }
            return new C0165a(couponInfo);
        }

        public static C0165a w(AdTemplate adTemplate) {
            AdProductInfo cy = com.kwad.sdk.core.response.b.a.cy(com.kwad.sdk.core.response.b.d.ck(adTemplate));
            if (cy == null || cy.couponList == null || cy.couponList.size() <= 0) {
                return null;
            }
            return a(cy.couponList.get(0));
        }

        public final CharSequence N(Context context) {
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(R.dimen.ksad_coupon_dialog_value_prefix_text_size));
            SpannableString spannableString = new SpannableString("¥" + ((Object) this.rj));
            spannableString.setSpan(absoluteSizeSpan, 0, 1, 17);
            return spannableString;
        }

        public final CharSequence gU() {
            return this.rk;
        }

        public final CharSequence gV() {
            return this.rl;
        }

        public final CharSequence getTitle() {
            return this.title;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void gW();

        void gX();
    }

    public a(Context context, ViewGroup viewGroup, int[] iArr) {
        this.qW = iArr;
        ViewGroup viewGroup2 = (ViewGroup) l.a(context, R.layout.ksad_reward_coupon_dialog, viewGroup, false);
        this.gi = viewGroup2;
        d(viewGroup2);
    }

    private static Animator a(ImageView imageView, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "alpha", imageView.getAlpha(), 0.0f);
        ofFloat.setDuration(j);
        return ofFloat;
    }

    static /* synthetic */ Animator a(a aVar, View view) {
        return m(view);
    }

    static /* synthetic */ Animator a(a aVar, ImageView imageView, long j) {
        return a(imageView, j);
    }

    private void a(C0165a c0165a) {
        if (c0165a == null) {
            return;
        }
        TextView textView = this.gS;
        if (textView != null) {
            textView.setText(c0165a.getTitle());
        }
        TextView textView2 = this.qZ;
        if (textView2 != null) {
            textView2.setText(c0165a.N(this.gi.getContext()));
        }
        TextView textView3 = this.lG;
        if (textView3 != null) {
            textView3.setText(c0165a.gU());
        }
        Button button = this.ra;
        if (button != null) {
            button.setText(c0165a.gV());
        }
    }

    private void d(ViewGroup viewGroup) {
        this.qX = viewGroup.findViewById(R.id.ksad_coupon_dialog_card);
        this.qY = (ImageView) viewGroup.findViewById(R.id.ksad_coupon_dialog_bg);
        this.gS = (TextView) viewGroup.findViewById(R.id.ksad_coupon_dialog_title);
        this.qZ = (TextView) viewGroup.findViewById(R.id.ksad_coupon_dialog_content);
        this.lG = (TextView) viewGroup.findViewById(R.id.ksad_coupon_dialog_desc);
        Button button = (Button) viewGroup.findViewById(R.id.ksad_coupon_dialog_btn_action);
        this.ra = button;
        button.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gT() {
        final Animator n = n(this.qX);
        n.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.b.a.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                n.removeListener(this);
                if (a.this.rb != null) {
                    a.this.rb.gX();
                }
            }
        });
        n.start();
    }

    private static Animator m(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    private Animator n(View view) {
        ObjectAnimator objectAnimator;
        int[] D;
        Interpolator create = PathInterpolatorCompat.create(0.89f, 0.02f, 0.72f, 1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.0f);
        ofFloat.setInterpolator(create);
        ofFloat2.setInterpolator(create);
        int[] iArr = this.qW;
        ObjectAnimator objectAnimator2 = null;
        if (iArr == null || iArr.length < 2 || (D = com.kwad.sdk.d.a.a.D(view)) == null) {
            objectAnimator = null;
        } else {
            Interpolator create2 = PathInterpolatorCompat.create(0.33f, 0.0f, 0.83f, 1.0f);
            objectAnimator2 = ObjectAnimator.ofFloat(view, "translationX", this.qW[0] - D[0]);
            objectAnimator = ObjectAnimator.ofFloat(view, "translationY", this.qW[1] - D[1]);
            objectAnimator2.setInterpolator(create2);
            objectAnimator.setInterpolator(create2);
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 1.0f);
        ofFloat3.setDuration(200L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat4.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat3, ofFloat4);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(500L);
        if (objectAnimator2 != null) {
            animatorSet2.playTogether(ofFloat, ofFloat2, animatorSet, objectAnimator2, objectAnimator);
        } else {
            animatorSet2.playTogether(ofFloat, ofFloat2, animatorSet);
        }
        return animatorSet2;
    }

    public final void a(b bVar) {
        this.rb = bVar;
    }

    @Override // com.kwad.components.ad.reward.m.d
    public final void a(r rVar) {
        super.a(rVar);
        a(C0165a.w(rVar.getAdTemplate()));
        this.gi.post(new AnonymousClass1(rVar, com.kwad.components.ad.reward.a.b.gN()));
    }

    @Override // com.kwad.components.ad.reward.m.d
    public final ViewGroup gS() {
        return this.gi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar;
        if (!view.equals(this.ra) || (bVar = this.rb) == null) {
            return;
        }
        bVar.gW();
    }
}
