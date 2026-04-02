package com.applovin.mediation.nativeAds;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.sdk.r;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.vungle.warren.AdLoader;
/* loaded from: classes.dex */
public class MaxNativeAdView extends FrameLayout {
    private final MaxNativeAd a;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final FrameLayout e;
    private final FrameLayout f;
    private final FrameLayout g;
    private final Button h;

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, null, activity);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        super(activity);
        int i;
        MaxAdFormat format = maxNativeAd.getFormat();
        if (format == MaxAdFormat.BANNER) {
            i = "vertical_banner_template".equals(str) ? R.layout.max_native_ad_vertical_banner_view : ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) ? R.layout.max_native_ad_media_banner_view : "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        } else if (format == MaxAdFormat.LEADER) {
            i = "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
        } else if (format != MaxAdFormat.MREC) {
            throw new IllegalArgumentException("Unsupported ad format: " + format);
        } else {
            i = R.layout.max_native_ad_mrec_view;
        }
        addView(activity.getLayoutInflater().inflate(i, (ViewGroup) null));
        this.b = (TextView) findViewById(R.id.native_title_text_view);
        this.c = (TextView) findViewById(R.id.native_body_text_view);
        this.d = (ImageView) findViewById(R.id.native_icon_image_view);
        this.e = (FrameLayout) findViewById(R.id.native_icon_view);
        this.f = (FrameLayout) findViewById(R.id.options_view);
        this.g = (FrameLayout) findViewById(R.id.native_media_content_view);
        this.h = (Button) findViewById(R.id.native_cta_button);
        this.a = maxNativeAd;
        a();
    }

    private void a() {
        this.b.setText(this.a.getTitle());
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(this.a.getBody());
        }
        Button button = this.h;
        if (button != null) {
            button.setText(this.a.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = this.a.getIcon();
        View iconView = this.a.getIconView();
        if (icon == null) {
            if (iconView != null) {
                iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.e.addView(iconView);
            }
            this.e.setVisibility(8);
        } else if (icon.getDrawable() != null) {
            this.d.setImageDrawable(icon.getDrawable());
        } else {
            if (icon.getUri() != null && AppLovinSdkUtils.isValidString(icon.getUri().toString())) {
                this.d.setImageURI(icon.getUri());
            }
            this.e.setVisibility(8);
        }
        View optionsView = this.a.getOptionsView();
        if (this.f == null || optionsView == null) {
            FrameLayout frameLayout = this.f;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f.addView(optionsView);
        }
        View mediaView = this.a.getMediaView();
        if (this.g != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.g.addView(mediaView);
            } else if (this.a.getFormat() == MaxAdFormat.LEADER) {
                this.g.setVisibility(8);
            }
        }
        b();
        postDelayed(new Runnable() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.1
            @Override // java.lang.Runnable
            public void run() {
                MaxNativeAdView.this.setSelected(true);
            }
        }, AdLoader.RETRY_DELAY);
    }

    private void b() {
        final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (getViewTreeObserver().isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.2
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    MaxNativeAdView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = ((View) viewGroup.getParent()).getWidth();
                    viewGroup.setLayoutParams(layoutParams);
                    return true;
                }
            });
        }
    }

    public MaxNativeAd getAd() {
        return this.a;
    }

    public TextView getBodyTextView() {
        return this.c;
    }

    public Button getCallToActionButton() {
        return this.h;
    }

    public FrameLayout getIconContentView() {
        return this.e;
    }

    public ImageView getIconImageView() {
        return this.d;
    }

    public FrameLayout getMediaContentView() {
        return this.g;
    }

    public FrameLayout getOptionsContentView() {
        return this.f;
    }

    public TextView getTitleTextView() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            return;
        }
        r.h("MaxAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }
}
