package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.view.View;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
import com.google.android.gms.common.internal.ImagesContract;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AppLovinNativeAdImpl extends AppLovinAdBase implements AppLovinNativeAd {
    private static final String AD_RESPONSE_TYPE_APPLOVIN = "applovin";
    private static final String AD_RESPONSE_TYPE_ORTB = "ortb";
    private static final String AD_RESPONSE_TYPE_UNDEFINED = "undefined";
    private final com.applovin.impl.sdk.a.e adEventTracker;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final Uri clickDestinationBackupUri;
    private final Uri clickDestinationUri;
    private final a clickHandler;
    private final List<String> clickTrackingUrls;
    private AppLovinNativeAdEventListener eventListener;
    private Uri iconUri;
    private final List<String> impressionUrls;
    private Uri mainImageUri;
    private AppLovinMediaView mediaView;
    private AppLovinOptionsView optionsView;
    private final Uri privacyDestinationUri;
    private final List<View> registeredViews;
    private final String tag;
    private final String title;
    private final com.applovin.impl.a.a vastAd;
    private final List<String> viewableMRC100Urls;
    private final List<String> viewableMRC50Urls;
    private final List<String> viewableVideo50Urls;

    /* loaded from: classes.dex */
    public static class Builder {
        private final JSONObject adObject;
        private String advertiser;
        private String body;
        private String callToAction;
        private Uri clickDestinationBackupUri;
        private Uri clickDestinationUri;
        private List<String> clickTrackingUrls;
        private final JSONObject fullResponse;
        private Uri iconUri;
        private List<String> impressionUrls;
        private Uri mainImageUri;
        private Uri privacyDestinationUri;
        private final m sdk;
        private String title;
        private com.applovin.impl.a.a vastAd;
        private List<String> viewableMRC100Urls;
        private List<String> viewableMRC50Urls;
        private List<String> viewableVideo50Urls;

        public Builder(JSONObject jSONObject, JSONObject jSONObject2, m mVar) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.sdk = mVar;
        }

        public AppLovinNativeAdImpl build() {
            return new AppLovinNativeAdImpl(this);
        }

        public Builder setAdvertiser(String str) {
            this.advertiser = str;
            return this;
        }

        public Builder setBody(String str) {
            this.body = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.callToAction = str;
            return this;
        }

        public Builder setClickDestinationBackupUri(Uri uri) {
            this.clickDestinationBackupUri = uri;
            return this;
        }

        public Builder setClickDestinationUri(Uri uri) {
            this.clickDestinationUri = uri;
            return this;
        }

        public Builder setClickTrackingUrls(List<String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setImpressionUrls(List<String> list) {
            this.impressionUrls = list;
            return this;
        }

        public Builder setMainImageUri(Uri uri) {
            this.mainImageUri = uri;
            return this;
        }

        public Builder setPrivacyDestinationUri(Uri uri) {
            this.privacyDestinationUri = uri;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVastAd(com.applovin.impl.a.a aVar) {
            this.vastAd = aVar;
            return this;
        }

        public Builder setViewableMRC100Urls(List<String> list) {
            this.viewableMRC100Urls = list;
            return this;
        }

        public Builder setViewableMRC50Urls(List<String> list) {
            this.viewableMRC50Urls = list;
            return this;
        }

        public Builder setViewableVideo50Urls(List<String> list) {
            this.viewableVideo50Urls = list;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener, AppLovinTouchToClickListener.OnClickListener {
        private final AppLovinNativeAdImpl a;

        public a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.a = appLovinNativeAdImpl;
        }

        private void a(Context context) {
            this.a.sdk.u().maybeSubmitPersistentPostbacks(this.a.getDirectClickTrackingPostbacks());
            for (String str : this.a.clickTrackingUrls) {
                this.a.sdk.X().dispatchPostbackAsync(str, null);
            }
            if (Utils.openUri(context, this.a.clickDestinationUri, this.a.sdk) || Utils.openUri(context, this.a.clickDestinationBackupUri, this.a.sdk)) {
                j.a(this.a.eventListener, this.a);
            }
        }

        public AppLovinNativeAdImpl a() {
            return this.a;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (aVar.a(this)) {
                    AppLovinNativeAdImpl a = a();
                    AppLovinNativeAdImpl a2 = aVar.a();
                    return a != null ? a.equals(a2) : a2 == null;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            AppLovinNativeAdImpl a = a();
            return 59 + (a == null ? 43 : a.hashCode());
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a(view.getContext());
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            a(view.getContext());
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("AppLovinNativeAdImpl.ClickHandler(ad=");
            y.append(a());
            y.append(")");
            return y.toString();
        }
    }

    private AppLovinNativeAdImpl(Builder builder) {
        super(builder.adObject, builder.fullResponse, builder.sdk);
        this.registeredViews = new ArrayList();
        this.clickHandler = new a(this);
        this.adEventTracker = new com.applovin.impl.sdk.a.e(this);
        this.title = builder.title;
        this.advertiser = builder.advertiser;
        this.body = builder.body;
        this.callToAction = builder.callToAction;
        this.iconUri = builder.iconUri;
        this.mainImageUri = builder.mainImageUri;
        this.vastAd = builder.vastAd;
        this.privacyDestinationUri = builder.privacyDestinationUri;
        this.clickDestinationUri = builder.clickDestinationUri;
        this.clickDestinationBackupUri = builder.clickDestinationBackupUri;
        this.clickTrackingUrls = builder.clickTrackingUrls;
        this.impressionUrls = builder.impressionUrls;
        this.viewableMRC50Urls = builder.viewableMRC50Urls;
        this.viewableMRC100Urls = builder.viewableMRC100Urls;
        this.viewableVideo50Urls = builder.viewableVideo50Urls;
        StringBuilder y = e.a.d.a.a.y("AppLovinNativeAd:");
        y.append(getAdIdNumber());
        this.tag = y.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.applovin.impl.sdk.d.a> getDirectClickTrackingPostbacks() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, getClCode(), getStringFromAdObject("click_tracking_url", null), this.sdk);
        }
        return postbacks;
    }

    @Override // com.applovin.impl.sdk.a.a
    public com.applovin.impl.sdk.a.e getAdEventTracker() {
        return this.adEventTracker;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getBody() {
        return this.body;
    }

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getCallToAction() {
        return this.callToAction;
    }

    public a getClickHandler() {
        return this.clickHandler;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public Uri getIconUri() {
        return this.iconUri;
    }

    public List<String> getImpressionUrls() {
        return this.impressionUrls;
    }

    public Uri getMainImageUri() {
        return this.mainImageUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinMediaView getMediaView() {
        return this.mediaView;
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.a.a
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.adObjectLock) {
            JSONArray jSONArray = JsonUtils.getJSONArray(this.adObject, "omid_verification_script_resources", null);
            if (jSONArray != null) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
                    URL url = new URL(JsonUtils.getString(jSONObject, ImagesContract.URL, null));
                    String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                    String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                    arrayList.add((StringUtils.isValidString(string) && StringUtils.isValidString(string2)) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinOptionsView getOptionsView() {
        return this.optionsView;
    }

    public Uri getPrivacyDestinationUri() {
        return this.privacyDestinationUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return getStringFromAdObject("type", "undefined");
    }

    public com.applovin.impl.a.a getVastAd() {
        return this.vastAd;
    }

    @Override // com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void registerViewsForInteraction(List<View> list) {
        if (this.clickDestinationUri == null && this.clickDestinationBackupUri == null) {
            return;
        }
        for (View view : list) {
            if (view.hasOnClickListeners()) {
                v B = this.sdk.B();
                String str = this.tag;
                B.e(str, "View has an onClickListener already - " + view);
            }
            view.setOnClickListener(this.clickHandler);
            this.registeredViews.add(view);
        }
        v B2 = this.sdk.B();
        String str2 = this.tag;
        StringBuilder y = e.a.d.a.a.y("Registered views: ");
        y.append(this.registeredViews);
        B2.b(str2, y.toString());
    }

    public void setEventListener(AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        this.eventListener = appLovinNativeAdEventListener;
    }

    public void setIconUri(Uri uri) {
        this.iconUri = uri;
    }

    public void setMainImageUri(Uri uri) {
        this.mainImageUri = uri;
    }

    public void setUpNativeAdViewComponents() {
        m mVar = this.sdk;
        this.mediaView = new AppLovinMediaView(this, mVar, mVar.L());
        Uri uri = this.privacyDestinationUri;
        m mVar2 = this.sdk;
        this.optionsView = new AppLovinOptionsView(uri, mVar2, mVar2.L());
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("AppLovinNativeAd{adIdNumber=");
        y.append(getAdIdNumber());
        y.append(" - ");
        y.append(getTitle());
        y.append("}");
        return y.toString();
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void unregisterViewsForInteraction() {
        for (View view : this.registeredViews) {
            view.setOnClickListener(null);
        }
        v B = this.sdk.B();
        String str = this.tag;
        StringBuilder y = e.a.d.a.a.y("Unregistered views: ");
        y.append(this.registeredViews);
        B.b(str, y.toString());
        this.registeredViews.clear();
    }
}
