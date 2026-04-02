package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.b;
import com.applovin.impl.sdk.utils.p;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinSdk;
/* loaded from: classes.dex */
public class MaxAdView extends RelativeLayout {
    private MaxAdViewImpl a;

    /* renamed from: b  reason: collision with root package name */
    private View f4404b;

    /* renamed from: c  reason: collision with root package name */
    private int f4405c;

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        String attributeValue = attributeSet.getAttributeValue(AppLovinAdView.NAMESPACE, "adUnitId");
        String attributeValue2 = attributeSet.getAttributeValue(AppLovinAdView.NAMESPACE, "adFormat");
        MaxAdFormat formatFromString = StringUtils.isValidString(attributeValue2) ? MaxAdFormat.formatFromString(attributeValue2) : b.a(context);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (attributeValue == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(attributeValue)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (!(context instanceof Activity)) {
            throw new IllegalArgumentException("Max ad view context is not an activity");
        }
        a(attributeValue, formatFromString, attributeIntValue, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context);
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", sdk=" + appLovinSdk + ")");
        a(str, maxAdFormat, 49, appLovinSdk, context);
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, b.a(context), appLovinSdk, context);
    }

    private void a(MaxAdFormat maxAdFormat, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int applyDimension = maxAdFormat == MaxAdFormat.MREC ? (int) TypedValue.applyDimension(1, maxAdFormat.getSize().getWidth(), displayMetrics) : displayMetrics.widthPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, applyDimension, (int) TypedValue.applyDimension(1, maxAdFormat.getSize().getHeight(), displayMetrics));
    }

    private void a(String str, MaxAdFormat maxAdFormat, int i2, AppLovinSdk appLovinSdk, Context context) {
        if (isInEditMode()) {
            a(maxAdFormat, context);
            return;
        }
        View view = new View(context);
        this.f4404b = view;
        view.setBackgroundColor(0);
        addView(this.f4404b);
        this.f4404b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f4405c = getVisibility();
        this.a = new MaxAdViewImpl(str.trim(), maxAdFormat, this, this.f4404b, appLovinSdk.coreSdk, context);
        setGravity(i2);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.a.getAdUnitId();
    }

    public String getPlacement() {
        return this.a.getPlacement();
    }

    public void loadAd() {
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        MaxAdViewImpl maxAdViewImpl = this.a;
        maxAdViewImpl.logApiCall("onWindowVisibilityChanged(visibility=" + i2 + ")");
        if (this.a != null && p.a(this.f4405c, i2)) {
            this.a.onWindowVisibilityChanged(i2);
        }
        this.f4405c = i2;
    }

    @Override // android.view.View
    public void setAlpha(float f2) {
        MaxAdViewImpl maxAdViewImpl = this.a;
        maxAdViewImpl.logApiCall("setAlpha(alpha=" + f2 + ")");
        View view = this.f4404b;
        if (view != null) {
            view.setAlpha(f2);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        MaxAdViewImpl maxAdViewImpl = this.a;
        maxAdViewImpl.logApiCall("setBackgroundColor(color=" + i2 + ")");
        MaxAdViewImpl maxAdViewImpl2 = this.a;
        if (maxAdViewImpl2 != null) {
            maxAdViewImpl2.setPublisherBackgroundColor(i2);
        }
        View view = this.f4404b;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    public void setCustomPostbackData(String str) {
        MaxAdViewImpl maxAdViewImpl = this.a;
        maxAdViewImpl.logApiCall("setCustomPostbackData(value=" + str + ")");
        this.a.setCustomPostbackData(str);
    }

    public void setExtraParameter(String str, String str2) {
        MaxAdViewImpl maxAdViewImpl = this.a;
        maxAdViewImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        MaxAdViewImpl maxAdViewImpl = this.a;
        maxAdViewImpl.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxAdViewImpl maxAdViewImpl = this.a;
        maxAdViewImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxAdViewImpl maxAdViewImpl = this.a;
        maxAdViewImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.a.stopAutoRefresh();
    }

    @Override // android.view.View
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }
}
