package com.applovin.impl.mediation.ads;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.i;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.j;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.sdk.AppLovinSdk;
/* loaded from: classes.dex */
public abstract class a {
    private static k a;
    protected final MaxAdFormat adFormat;
    protected final String adUnitId;
    protected final r logger;
    protected final k sdk;
    protected final String tag;
    protected MaxAdListener adListener = null;
    protected MaxAdRevenueListener revenueListener = null;
    protected final i.a loadRequestBuilder = new i.a();

    /* renamed from: com.applovin.impl.mediation.ads.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0014a extends MaxAdListener, MaxAdRevenueListener {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(String str, MaxAdFormat maxAdFormat, String str2, k kVar) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = kVar;
        this.tag = str2;
        this.logger = kVar.z();
    }

    public static void logApiCall(String str, String str2) {
        k kVar = a;
        if (kVar != null) {
            kVar.z().b(str, str2);
            return;
        }
        for (AppLovinSdk appLovinSdk : AppLovinSdk.a()) {
            k kVar2 = appLovinSdk.coreSdk;
            if (!kVar2.e()) {
                kVar2.z().b(str, str2);
                a = kVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        j jVar = new j();
        jVar.a().a("MAX Ad").a(aVar).a();
        r.f(this.tag, jVar.toString());
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(String str) {
        this.logger.b(this.tag, str);
    }

    public void setExtraParameter(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        this.loadRequestBuilder.a(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        r rVar = this.logger;
        String str = this.tag;
        rVar.b(str, "Setting listener: " + maxAdListener);
        this.adListener = maxAdListener;
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        r rVar = this.logger;
        String str = this.tag;
        rVar.b(str, "Setting revenue listener: " + maxAdRevenueListener);
        this.revenueListener = maxAdRevenueListener;
    }
}
