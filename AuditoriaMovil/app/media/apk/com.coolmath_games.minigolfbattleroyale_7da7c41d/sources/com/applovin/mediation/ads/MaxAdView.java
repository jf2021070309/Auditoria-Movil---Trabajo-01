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
import androidx.core.view.ViewCompat;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.b;
import com.applovin.impl.sdk.utils.o;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinSdk;
/* loaded from: classes.dex */
public class MaxAdView extends RelativeLayout {
    private MaxAdViewImpl a;
    private View b;
    private int c;

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
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
        Activity activity = (Activity) context;
        a(attributeValue, formatFromString, attributeIntValue, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxAdView(String str, Activity activity) {
        this(str, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, Activity activity) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Activity activity) {
        super(activity);
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", sdk=" + appLovinSdk + ")");
        a(str, maxAdFormat, 49, appLovinSdk, activity);
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Activity activity) {
        this(str, b.a(activity), appLovinSdk, activity);
    }

    private void a(MaxAdFormat maxAdFormat, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int applyDimension = maxAdFormat == MaxAdFormat.MREC ? (int) TypedValue.applyDimension(1, maxAdFormat.getSize().getWidth(), displayMetrics) : displayMetrics.widthPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, applyDimension, (int) TypedValue.applyDimension(1, maxAdFormat.getSize().getHeight(), displayMetrics));
    }

    private void a(String str, MaxAdFormat maxAdFormat, int i, AppLovinSdk appLovinSdk, Activity activity) {
        if (isInEditMode()) {
            a(maxAdFormat, activity);
            return;
        }
        View view = new View(activity);
        this.b = view;
        view.setBackgroundColor(0);
        addView(this.b);
        this.b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.c = getVisibility();
        this.a = new MaxAdViewImpl(str.trim(), maxAdFormat, this, this.b, appLovinSdk.coreSdk, activity);
        setGravity(i);
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
        this.a.loadAd();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        MaxAdViewImpl maxAdViewImpl = this.a;
        maxAdViewImpl.logApiCall("onWindowVisibilityChanged(visibility=" + i + ")");
        if (this.a != null && o.a(this.c, i)) {
            this.a.onWindowVisibilityChanged(i);
        }
        this.c = i;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        MaxAdViewImpl maxAdViewImpl = this.a;
        maxAdViewImpl.logApiCall("setAlpha(alpha=" + f + ")");
        View view = this.b;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        MaxAdViewImpl maxAdViewImpl = this.a;
        maxAdViewImpl.logApiCall("setBackgroundColor(color=" + i + ")");
        MaxAdViewImpl maxAdViewImpl2 = this.a;
        if (maxAdViewImpl2 != null) {
            maxAdViewImpl2.setPublisherBackgroundColor(i);
        }
        View view = this.b;
        if (view != null) {
            view.setBackgroundColor(i);
        }
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
