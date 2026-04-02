package com.applovin.mediation.nativeAds;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.ads.b;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.R;
import e.a.d.a.a;
import java.lang.ref.WeakReference;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class MaxNativeAdView extends FrameLayout {
    private final View a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f4420b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f4421c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f4422d;

    /* renamed from: e  reason: collision with root package name */
    private final ImageView f4423e;

    /* renamed from: f  reason: collision with root package name */
    private final FrameLayout f4424f;

    /* renamed from: g  reason: collision with root package name */
    private final ViewGroup f4425g;

    /* renamed from: h  reason: collision with root package name */
    private final FrameLayout f4426h;

    /* renamed from: i  reason: collision with root package name */
    private final ViewGroup f4427i;

    /* renamed from: j  reason: collision with root package name */
    private final FrameLayout f4428j;

    /* renamed from: k  reason: collision with root package name */
    private final Button f4429k;

    /* renamed from: l  reason: collision with root package name */
    private b f4430l;

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        super(context);
        boolean z = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.a = view;
        } else {
            this.a = LayoutInflater.from(context).inflate(z ? a(maxNativeAdViewBinder.templateType, format) : maxNativeAdViewBinder.layoutResourceId, (ViewGroup) this, false);
        }
        addView(this.a);
        this.f4420b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f4421c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f4422d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f4423e = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f4424f = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f4425g = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f4426h = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f4427i = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f4428j = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        this.f4429k = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        if (maxNativeAd != null) {
            a(maxNativeAd);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaxNativeAdView(com.applovin.mediation.nativeAds.MaxNativeAd r3, java.lang.String r4, android.content.Context r5) {
        /*
            r2 = this;
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r0 = new com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder
            r1 = -1
            r0.<init>(r1)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r0.setTemplateType(r4)
            int r0 = com.applovin.sdk.R.id.native_title_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setTitleTextViewId(r0)
            int r0 = com.applovin.sdk.R.id.native_advertiser_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setAdvertiserTextViewId(r0)
            int r0 = com.applovin.sdk.R.id.native_body_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setBodyTextViewId(r0)
            int r0 = com.applovin.sdk.R.id.native_icon_image_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setIconImageViewId(r0)
            int r0 = com.applovin.sdk.R.id.native_icon_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setIconContentViewId(r0)
            int r0 = com.applovin.sdk.R.id.options_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setOptionsContentViewGroupId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setOptionsContentFrameLayoutId(r0)
            int r0 = com.applovin.sdk.R.id.native_media_content_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setMediaContentViewGroupId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setMediaContentFrameLayoutId(r0)
            int r0 = com.applovin.sdk.R.id.native_cta_button
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setCallToActionButtonId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r4 = r4.build()
            r2.<init>(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.nativeAds.MaxNativeAdView.<init>(com.applovin.mediation.nativeAds.MaxNativeAd, java.lang.String, android.content.Context):void");
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(String str, Context context) {
        this((MaxNativeAd) null, str, context);
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            if ("small_template_1".equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_small_template_1;
            }
            if ("medium_template_1".equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_medium_template_1;
            }
            throw new IllegalArgumentException(a.k("Attempting to render MAX native ad with invalid format: ", str));
        } else if (maxAdFormat == MaxAdFormat.BANNER) {
            return "vertical_banner_template".equals(str) ? R.layout.max_native_ad_vertical_banner_view : ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) ? R.layout.max_native_ad_media_banner_view : "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        } else if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
        } else if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        } else {
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
    }

    private void a() {
        final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            final WeakReference weakReference = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.2
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) weakReference.get();
                    if (viewTreeObserver2 == null || !viewTreeObserver2.isAlive()) {
                        AppLovinSdk.getInstance(MaxNativeAdView.this.getContext()).coreSdk.B().d("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                    } else {
                        viewTreeObserver2.removeOnPreDrawListener(this);
                    }
                    weakReference.clear();
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = ((View) viewGroup.getParent()).getWidth();
                    viewGroup.setLayoutParams(layoutParams);
                    return true;
                }
            });
        }
    }

    private void a(MaxNativeAd maxNativeAd) {
        this.f4420b.setText(maxNativeAd.getTitle());
        if (this.f4421c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f4421c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f4421c.setVisibility(8);
            }
        }
        if (this.f4422d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f4422d.setText(maxNativeAd.getBody());
            } else {
                this.f4422d.setVisibility(4);
            }
        }
        if (this.f4429k != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f4429k.setText(maxNativeAd.getCallToAction());
            } else {
                this.f4429k.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f4424f;
        if (frameLayout != null) {
            if (icon == null || this.f4423e == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f4424f.removeAllViews();
                    this.f4424f.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f4423e.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f4424f.setVisibility(8);
            } else {
                this.f4423e.setImageURI(icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f4426h;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f4426h.addView(optionsView);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f4428j != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                this.f4428j.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f4428j.setVisibility(8);
            }
        }
        a();
        postDelayed(new Runnable() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.1
            @Override // java.lang.Runnable
            public void run() {
                MaxNativeAdView.this.setSelected(true);
            }
        }, 2000L);
    }

    private void b(MaxNativeAd maxNativeAd) {
        if (this.f4420b != null) {
            if (StringUtils.isValidString(maxNativeAd.getTitle())) {
                this.f4420b.setText(maxNativeAd.getTitle());
            } else {
                this.f4420b.setText((CharSequence) null);
            }
        }
        String body = maxNativeAd.getBody();
        if (this.f4422d != null) {
            if (StringUtils.isValidString(body)) {
                this.f4422d.setText(body);
            } else {
                this.f4422d.setText((CharSequence) null);
            }
        }
        String advertiser = maxNativeAd.getAdvertiser();
        if (this.f4421c != null) {
            if (StringUtils.isValidString(advertiser)) {
                this.f4421c.setText(advertiser);
            } else {
                this.f4421c.setText((CharSequence) null);
            }
        }
        String callToAction = maxNativeAd.getCallToAction();
        if (this.f4429k != null) {
            if (StringUtils.isValidString(callToAction)) {
                this.f4429k.setText(callToAction);
            } else {
                this.f4429k.setText((CharSequence) null);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f4423e;
        if (imageView != null) {
            if (icon == null) {
                imageView.setImageDrawable(null);
            } else if (icon.getDrawable() != null) {
                this.f4423e.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null) {
                this.f4423e.setImageURI(icon.getUri());
            } else {
                this.f4423e.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f4427i;
        if (viewGroup != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f4427i.addView(mediaView);
            } else {
                viewGroup.removeAllViews();
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f4425g;
        if (viewGroup2 != null) {
            if (optionsView == null) {
                viewGroup2.removeAllViews();
                return;
            }
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f4425g.addView(optionsView);
        }
    }

    public TextView getAdvertiserTextView() {
        return this.f4421c;
    }

    public TextView getBodyTextView() {
        return this.f4422d;
    }

    public Button getCallToActionButton() {
        return this.f4429k;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f4424f;
    }

    public ImageView getIconImageView() {
        return this.f4423e;
    }

    public View getMainView() {
        return this.a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f4428j;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f4427i;
        return viewGroup != null ? viewGroup : this.f4428j;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f4426h;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f4425g;
        return viewGroup != null ? viewGroup : this.f4426h;
    }

    public TextView getTitleTextView() {
        return this.f4420b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f4430l;
        if (bVar != null) {
            bVar.b();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        v.h("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    public void recycle() {
        ViewGroup viewGroup;
        b bVar = this.f4430l;
        if (bVar != null) {
            bVar.a();
            this.f4430l = null;
        }
        View view = this.a;
        if (view == null || view.getParent() == this || (viewGroup = (ViewGroup) this.a.getParent()) == null) {
            return;
        }
        viewGroup.removeAllViews();
        addView(this.a);
        removeView(viewGroup);
    }

    public void render(d dVar, a.InterfaceC0074a interfaceC0074a, m mVar) {
        recycle();
        this.f4430l = new b(dVar, interfaceC0074a, mVar);
        MaxNativeAd v = dVar.v();
        if (StringUtils.isValidString(dVar.x())) {
            a(v);
        } else {
            b(v);
        }
    }
}
