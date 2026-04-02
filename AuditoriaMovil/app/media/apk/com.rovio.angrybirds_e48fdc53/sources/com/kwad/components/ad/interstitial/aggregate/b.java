package com.kwad.components.ad.interstitial.aggregate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator;
import com.kwad.components.ad.interstitial.aggregate.a;
import com.kwad.components.ad.interstitial.aggregate.c;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsInterstitialAd;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import com.kwad.sdk.utils.ai;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.interstitial.f.a {
    private com.kwad.components.core.widget.a.b bG;
    private final com.kwad.sdk.core.h.c cV;
    protected KsInterstitialAd.AdInteractionListener hB;
    private boolean hJ;
    private TransViewPager hN;
    private a hO;
    private ViewPagerIndicator hP;
    private SlideTipsView hQ;
    private SlideTipsView hR;
    private ValueAnimator hS;
    private boolean hT;
    private InterstitialAggregateManualTipsView hU;
    private boolean hV;
    private boolean hW;
    private final ViewPager.OnPageChangeListener hX;
    protected AdInfo mAdInfo;
    protected AdTemplate mAdTemplate;
    private final List<AdTemplate> mAdTemplateList;
    private final View mRootView;

    public b(Context context) {
        this(context, null);
    }

    private b(Context context, AttributeSet attributeSet) {
        super(context, null);
        this.mAdTemplateList = new ArrayList();
        this.cV = new com.kwad.sdk.core.h.d() { // from class: com.kwad.components.ad.interstitial.aggregate.b.2
            @Override // com.kwad.sdk.core.h.d, com.kwad.sdk.core.h.c
            public final void aK() {
                super.aK();
                if (Build.VERSION.SDK_INT >= 19 && b.this.hT) {
                    if (b.this.hP != null) {
                        b.this.hP.cA();
                    }
                    if (b.this.hS != null) {
                        b.this.hS.resume();
                    }
                    b.this.hT = false;
                }
            }

            @Override // com.kwad.sdk.core.h.d, com.kwad.sdk.core.h.c
            public final void aL() {
                super.aL();
                if (Build.VERSION.SDK_INT >= 19 && !b.this.hT) {
                    if (b.this.hP != null) {
                        b.this.hP.cz();
                    }
                    if (b.this.hS != null) {
                        b.this.hS.pause();
                    }
                    b.this.hT = true;
                }
            }
        };
        this.hX = new ViewPager.SimpleOnPageChangeListener() { // from class: com.kwad.components.ad.interstitial.aggregate.b.3
            private int hZ = 0;

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public final void onPageScrolled(int i, float f, int i2) {
                if (f != 0.0f) {
                    if (b.this.hQ.getVisibility() == 0) {
                        b.this.hQ.clearAnimation();
                        b.this.hQ.setVisibility(8);
                    }
                    if (b.this.hR.getVisibility() == 0) {
                        b.this.hR.clearAnimation();
                        b.this.hR.setVisibility(8);
                    }
                }
            }

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public final void onPageSelected(int i) {
                com.kwad.components.ad.interstitial.f.c x = b.this.hN.x(i);
                if (x != null) {
                    x.eu();
                }
                if (this.hZ != i) {
                    com.kwad.sdk.core.report.a.a((AdTemplate) b.this.mAdTemplateList.get(this.hZ), -1L, (JSONObject) null);
                    com.kwad.components.ad.interstitial.f.c x2 = b.this.hN.x(this.hZ);
                    if (x2 != null) {
                        x2.ev();
                    }
                }
                this.hZ = i;
            }
        };
        this.mContext = context;
        this.mRootView = l.inflate(context, R.layout.ksad_interstitial_multi_ad, this);
        initView();
    }

    static /* synthetic */ AnimationSet a(b bVar, float f, float f2) {
        return b(f, f2);
    }

    static /* synthetic */ boolean a(b bVar, boolean z) {
        bVar.hW = true;
        return true;
    }

    private static AnimationSet b(float f, float f2) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, f, 1, f2, 1, 0.0f, 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.8f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(800L);
        animationSet.setFillAfter(true);
        return animationSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn() {
        if (this.mAdTemplate.mAdScene != null) {
            c.cu().a(16, com.kwad.components.ad.interstitial.a.b.cG(), this.mAdTemplate.mAdScene, new c.b() { // from class: com.kwad.components.ad.interstitial.aggregate.b.6
                @Override // com.kwad.components.ad.interstitial.aggregate.c.b
                public final void onInterstitialAdLoad(List<AdTemplate> list) {
                    if (list == null || list.size() <= 0) {
                        return;
                    }
                    b.this.mAdTemplateList.addAll(list);
                    b.this.hO.setAdTemplateList(b.this.mAdTemplateList);
                    b.this.hO.notifyDataSetChanged();
                    b.this.hN.setOffscreenPageLimit(b.this.mAdTemplateList.size() - 1);
                    b.this.hN.addOnPageChangeListener(b.this.hX);
                    b.this.cq();
                    b.this.hP.setViewPager(b.this.hN);
                    b.this.hP.setVisibility(0);
                    b.this.bG.a(b.this.cV);
                    com.kwad.components.ad.interstitial.b.a.J(b.this.mContext);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cq() {
        this.hP.setPlayProgressListener(new ViewPagerIndicator.a() { // from class: com.kwad.components.ad.interstitial.aggregate.b.7
            @Override // com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator.a
            public final void ct() {
                b.a(b.this, true);
                if (b.this.hJ) {
                    b.this.cs();
                } else {
                    b.this.cr();
                }
                b.this.hN.setScrollable(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cr() {
        if (this.hV) {
            this.hU.a(this.mAdTemplate, this.hN);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 120, 0);
        this.hS = ofInt;
        ofInt.setDuration(1200L);
        this.hS.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.interstitial.aggregate.b.8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float f;
                b.this.hN.scrollTo(com.kwad.sdk.d.a.a.a(b.this.mContext, ((Integer) valueAnimator.getAnimatedValue()).intValue()), 0);
                b.this.hN.onPageScrolled(0, com.kwad.sdk.d.a.a.a(b.this.mContext, f) / b.this.getWidth(), 0);
            }
        });
        this.hS.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.interstitial.aggregate.b.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (b.this.hV) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(200L);
                    alphaAnimation.setFillAfter(true);
                    b.this.hU.startAnimation(alphaAnimation);
                    b.this.hU.setVisibility(0);
                }
                b.this.hQ.setVisibility(0);
                b.this.hQ.startAnimation(b.a(b.this, 0.5f, 0.1f));
            }
        });
        this.hS.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cs() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, getWidth());
        this.hS = ofInt;
        ofInt.setDuration(800L);
        this.hS.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.interstitial.aggregate.b.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b.this.hN.scrollTo(intValue, 0);
                b.this.hN.onPageScrolled(0, intValue / b.this.getWidth(), 0);
            }
        });
        this.hS.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.interstitial.aggregate.b.11
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                b.this.hN.setCurrentItem(1);
                b.this.hR.setVisibility(0);
                b.this.hR.startAnimation(b.a(b.this, -0.5f, -0.1f));
            }
        });
        this.hS.start();
    }

    private void initView() {
        this.hN = (TransViewPager) this.mRootView.findViewById(R.id.ksad_multi_ad_container);
        this.hP = (ViewPagerIndicator) this.mRootView.findViewById(R.id.ksad_multi_ad_indicator);
        this.hQ = (SlideTipsView) this.mRootView.findViewById(R.id.ksad_left_slide);
        this.hR = (SlideTipsView) this.mRootView.findViewById(R.id.ksad_right_slide);
        this.hU = (InterstitialAggregateManualTipsView) this.mRootView.findViewById(R.id.ksad_manual_tips_view);
        this.bG = new com.kwad.components.core.widget.a.b(this.mRootView, 100);
    }

    @Override // com.kwad.components.ad.interstitial.f.a
    public final void a(AdTemplate adTemplate, com.kwad.components.ad.interstitial.d dVar, KsAdVideoPlayConfig ksAdVideoPlayConfig, KsInterstitialAd.AdInteractionListener adInteractionListener) {
        float f;
        this.mAdTemplate = adTemplate;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        this.mAdInfo = ck;
        this.hJ = com.kwad.sdk.core.response.b.a.cd(ck) == 1;
        this.mAdTemplateList.clear();
        this.mAdTemplateList.add(this.mAdTemplate);
        this.hB = adInteractionListener;
        a aVar = new a(adTemplate, dVar, ksAdVideoPlayConfig, adInteractionListener);
        this.hO = aVar;
        aVar.a(new a.b() { // from class: com.kwad.components.ad.interstitial.aggregate.b.1
            @Override // com.kwad.components.ad.interstitial.aggregate.a.b
            public final void a(com.kwad.components.ad.interstitial.f.c cVar, int i) {
                b.this.hN.a(i, cVar);
            }
        });
        this.hO.a(new a.InterfaceC0152a() { // from class: com.kwad.components.ad.interstitial.aggregate.b.4
            @Override // com.kwad.components.ad.interstitial.aggregate.a.InterfaceC0152a
            public final void cm() {
                if (b.this.hW) {
                    return;
                }
                if (b.this.hS != null) {
                    b.this.hS.cancel();
                }
                b.this.hP.setPlayProgressListener(null);
                b.this.hP.setVisibility(8);
                b.this.hN.setScrollable(false);
            }
        });
        this.hN.setAdapter(this.hO);
        this.hO.setAdTemplateList(this.mAdTemplateList);
        this.hO.notifyDataSetChanged();
        this.bG.sB();
        ViewPagerIndicator viewPagerIndicator = this.hP;
        if (viewPagerIndicator == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewPagerIndicator.getLayoutParams();
        if (marginLayoutParams != null) {
            this.hV = ai.IK();
            Context context = this.mContext;
            if (this.hV) {
                f = this.hJ ? 12 : 4;
            } else {
                f = 6.0f;
            }
            marginLayoutParams.bottomMargin = com.kwad.sdk.d.a.a.a(context, f);
            this.hP.setLayoutParams(marginLayoutParams);
        }
        this.hP.setFirstAdShowTime(com.kwad.sdk.core.response.b.a.ce(this.mAdInfo));
        post(new Runnable() { // from class: com.kwad.components.ad.interstitial.aggregate.b.5
            @Override // java.lang.Runnable
            public final void run() {
                b.this.cn();
            }
        });
    }

    @Override // com.kwad.components.ad.interstitial.f.a
    public final void co() {
    }

    @Override // com.kwad.components.ad.interstitial.f.a
    public final void cp() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.bG.b(this.cV);
        this.bG.sC();
        this.mAdTemplateList.clear();
        this.hN.clearOnPageChangeListeners();
        c.cu().release();
    }

    @Override // com.kwad.components.ad.interstitial.f.a
    public final void setAdInteractionListener(KsInterstitialAd.AdInteractionListener adInteractionListener) {
        this.hB = adInteractionListener;
    }
}
