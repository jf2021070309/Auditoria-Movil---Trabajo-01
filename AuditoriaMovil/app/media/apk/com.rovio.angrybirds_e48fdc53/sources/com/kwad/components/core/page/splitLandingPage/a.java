package com.kwad.components.core.page.splitLandingPage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwad.components.core.e.d.c;
import com.kwad.components.core.o.e;
import com.kwad.components.core.page.b.b;
import com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView;
import com.kwad.components.core.page.splitLandingPage.view.a;
import com.kwad.components.core.t.m;
import com.kwad.components.core.widget.FeedVideoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.config.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.mvp.Presenter;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a extends e {
    private LinearLayout MA;
    private FeedVideoView Mz;
    private SplitScrollWebView Oq;
    private Presenter Or;
    private com.kwad.components.core.page.splitLandingPage.view.a Os;
    private com.kwad.components.core.page.b.a Ot;
    private boolean Ou;
    private AdTemplate mAdTemplate;
    private c mApkDownloadHelper;

    public static a W(AdTemplate adTemplate) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putString("key_photo", adTemplate.toJson().toString());
        bundle.putBoolean("key_report", adTemplate.mPvReported);
        aVar.setArguments(bundle);
        return aVar;
    }

    static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.Ou = false;
        return false;
    }

    private void initView() {
        com.kwad.components.core.page.recycle.e eVar = new com.kwad.components.core.page.recycle.e(this.mAdTemplate, this.mApkDownloadHelper, null);
        this.Or.k(eVar);
        com.kwad.components.core.page.splitLandingPage.view.a aVar = new com.kwad.components.core.page.splitLandingPage.view.a(this.mContext, new com.kwad.components.core.page.splitLandingPage.a.a(eVar.adTemplate, eVar.JN));
        this.Os = aVar;
        aVar.a(new a.InterfaceC0208a() { // from class: com.kwad.components.core.page.splitLandingPage.a.3
            @Override // com.kwad.components.core.page.splitLandingPage.view.a.InterfaceC0208a
            public final boolean pr() {
                return a.this.po();
            }
        });
        this.Mz.post(new Runnable() { // from class: com.kwad.components.core.page.splitLandingPage.a.4
            @Override // java.lang.Runnable
            public final void run() {
                a.this.Oq.setTranslationY(a.this.Oq.getTranslationY() + a.this.Mz.getHeight());
            }
        });
        this.Oq.setSplitScrollWebViewListener(new SplitScrollWebView.a() { // from class: com.kwad.components.core.page.splitLandingPage.a.5
            @Override // com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView.a
            public final void d(float f) {
                a.this.Oq.setTranslationY(a.this.Oq.getTranslationY() - f);
            }

            @Override // com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView.a
            public final boolean ps() {
                if (a.this.Os.pt() || d.yV() != 2) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    Animator a = m.a((View) a.this.Oq, (Interpolator) null, a.this.Oq.getTranslationY(), 0.0f);
                    if (d.yV() == 2) {
                        if (a.this.Mz.isComplete()) {
                            animatorSet.playTogether(a);
                        } else {
                            animatorSet.playSequentially(a, a.this.Os.aB(true));
                        }
                    } else if (d.yV() == 1) {
                        animatorSet.playTogether(a);
                    }
                    animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.core.page.splitLandingPage.a.5.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            a.this.Mz.pq();
                            if (d.yV() != 2 || a.this.Mz.isComplete()) {
                                return;
                            }
                            a.this.Os.pu();
                        }
                    });
                    animatorSet.start();
                    return true;
                }
                return false;
            }
        });
    }

    private void j(ViewGroup viewGroup) {
        Presenter presenter = new Presenter();
        this.Or = presenter;
        presenter.F(viewGroup);
        b bVar = new b();
        bVar.F(this.Oq);
        com.kwad.components.core.page.b.a aVar = new com.kwad.components.core.page.b.a();
        this.Ot = aVar;
        aVar.F(this.Mz);
        this.Or.a(bVar);
        this.Or.a(this.Ot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean po() {
        SplitScrollWebView splitScrollWebView = this.Oq;
        if (splitScrollWebView == null || splitScrollWebView.getTranslationY() != 0.0f || this.Ou) {
            return false;
        }
        this.Oq.setDisableAnimation(false);
        this.Ou = true;
        SplitScrollWebView splitScrollWebView2 = this.Oq;
        Animator a = m.a((View) splitScrollWebView2, (Interpolator) null, 0.0f, splitScrollWebView2.getTranslationY() + this.Mz.getHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        if (d.yV() == 2 && this.Os.isVisible()) {
            this.Os.pq();
            animatorSet.playSequentially(this.Os.aB(false), a);
        } else {
            animatorSet.play(a);
        }
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.core.page.splitLandingPage.a.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                a.this.pp();
                a.this.Mz.pu();
                a.a(a.this, false);
            }
        });
        animatorSet.start();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pp() {
        this.Ot.lM();
        this.Ot.F(this.Mz);
        this.Ot.k(new com.kwad.components.core.page.recycle.e(this.mAdTemplate, this.mApkDownloadHelper, null));
    }

    private void v(View view) {
        this.MA = (LinearLayout) view.findViewById(R.id.ksad_web_tip_bar);
        TextView textView = (TextView) view.findViewById(R.id.ksad_web_tip_bar_textview);
        ((ImageView) view.findViewById(R.id.ksad_web_tip_close_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.page.splitLandingPage.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a.this.MA.setVisibility(8);
            }
        });
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        boolean bn = com.kwad.sdk.core.response.b.a.bn(ck);
        String bj = com.kwad.sdk.core.response.b.a.bj(ck);
        if (!bn) {
            this.MA.setVisibility(8);
            return;
        }
        this.MA.setVisibility(0);
        textView.setText(bj);
        textView.setSelected(true);
    }

    @Override // com.kwad.components.core.o.e, com.kwad.sdk.l.a.b
    public final boolean bQ() {
        SplitScrollWebView splitScrollWebView = this.Oq;
        if (splitScrollWebView != null && splitScrollWebView.canGoBack()) {
            this.Oq.goBack();
            return true;
        } else if (po()) {
            return true;
        } else {
            FeedVideoView feedVideoView = this.Mz;
            if (feedVideoView != null) {
                return feedVideoView.sv();
            }
            return false;
        }
    }

    @Override // com.kwad.components.core.o.e, com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getArguments().getString("key_photo");
        AdTemplate adTemplate = new AdTemplate();
        if (string != null) {
            try {
                adTemplate.parseJson(new JSONObject(string));
            } catch (JSONException e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
        }
        this.mAdTemplate = adTemplate;
        adTemplate.mPvReported = getArguments().getBoolean("key_report", false);
        this.mAdTemplate.mAdWebVideoPageShowing = true;
    }

    @Override // com.kwad.components.core.o.e, com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public final void onDestroy() {
        super.onDestroy();
        AdTemplate adTemplate = this.mAdTemplate;
        if (adTemplate != null) {
            adTemplate.mAdWebVideoPageShowing = false;
        }
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.Mz = (FeedVideoView) findViewById(R.id.ksad_split_land_ad_feed_video);
        this.Oq = (SplitScrollWebView) findViewById(R.id.ksad_video_webView);
        v(view);
        j(this.lN);
        initView();
    }

    @Override // com.kwad.components.core.o.e
    public final int oz() {
        return R.layout.ksad_split_land_page;
    }

    public final void pq() {
        this.Mz.pq();
    }

    public final void setApkDownloadHelper(c cVar) {
        this.mApkDownloadHelper = cVar;
    }
}
