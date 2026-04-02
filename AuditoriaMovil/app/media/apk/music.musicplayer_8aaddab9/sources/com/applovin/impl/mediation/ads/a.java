package com.applovin.impl.mediation.ads;

import android.app.Activity;
import ch.qos.logback.core.rolling.helper.Compressor;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.i;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class a {
    private static m a;
    public final MaxAdFormat adFormat;
    public final String adUnitId;
    public String customPostbackData;
    public final v logger;
    public final m sdk;
    public final String tag;
    public final Map<String, Object> localExtraParameters = Collections.synchronizedMap(new HashMap());
    public MaxAdListener adListener = null;
    public MaxAdRevenueListener revenueListener = null;
    public final i.a loadRequestBuilder = new i.a();

    /* renamed from: com.applovin.impl.mediation.ads.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0074a extends MaxAdListener, MaxAdRevenueListener {
    }

    public a(String str, MaxAdFormat maxAdFormat, String str2, m mVar) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = mVar;
        this.tag = str2;
        this.logger = mVar.B();
    }

    public static void logApiCall(String str, String str2) {
        m mVar = a;
        if (mVar != null) {
            mVar.B().b(str, str2);
            return;
        }
        for (AppLovinSdk appLovinSdk : AppLovinSdk.a()) {
            m mVar2 = appLovinSdk.coreSdk;
            if (!mVar2.e()) {
                mVar2.B().b(str, str2);
                a = mVar2;
            }
        }
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        k kVar = new k();
        kVar.a().a("MAX Ad").a(aVar).a();
        v.f(this.tag, kVar.toString());
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(String str) {
        this.logger.b(this.tag, str);
    }

    public void setCustomPostbackData(String str) {
        this.customPostbackData = str;
        this.loadRequestBuilder.a(str);
        if (str == null || str.length() <= 8192) {
            return;
        }
        String str2 = this.tag;
        StringBuilder y = e.a.d.a.a.y("Provided custom postback data parameter longer than supported (");
        y.append(str.length());
        y.append(" bytes, ");
        y.append(Compressor.BUFFER_SIZE);
        y.append(" maximum)");
        v.h(str2, y.toString());
    }

    public void setExtraParameter(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (this.adFormat.isAdViewAd() && "ad_refresh_seconds".equals(str) && StringUtils.isValidString(str2)) {
            int parseInt = Integer.parseInt(str2);
            if (parseInt > TimeUnit.MINUTES.toSeconds(2L)) {
                String str3 = this.tag;
                v.i(str3, "Attempting to set extra parameter \"ad_refresh_seconds\" to over 2 minutes (" + parseInt + "s) - this will be ignored");
            }
        }
        this.loadRequestBuilder.a(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        v vVar = this.logger;
        String str = this.tag;
        vVar.b(str, "Setting listener: " + maxAdListener);
        this.adListener = maxAdListener;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (obj instanceof Activity) {
            this.logger.e(this.tag, "Ignoring setting local extra parameter to Activity instance - please pass a WeakReference of it instead!");
            return;
        }
        if ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str)) {
            setExtraParameter("is_amazon_integration", Boolean.toString(true));
        }
        this.localExtraParameters.put(str, obj);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        v vVar = this.logger;
        String str = this.tag;
        vVar.b(str, "Setting revenue listener: " + maxAdRevenueListener);
        this.revenueListener = maxAdRevenueListener;
    }
}
