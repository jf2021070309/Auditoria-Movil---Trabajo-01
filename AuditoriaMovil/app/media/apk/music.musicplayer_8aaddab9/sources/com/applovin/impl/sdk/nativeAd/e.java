package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.e.a implements a.InterfaceC0091a, AppLovinAdLoadListener {
    private final JSONObject a;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f4168c;

    /* renamed from: d  reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f4169d;

    /* renamed from: e  reason: collision with root package name */
    private String f4170e;

    /* renamed from: f  reason: collision with root package name */
    private String f4171f;

    /* renamed from: g  reason: collision with root package name */
    private String f4172g;

    /* renamed from: h  reason: collision with root package name */
    private String f4173h;

    /* renamed from: i  reason: collision with root package name */
    private Uri f4174i;

    /* renamed from: j  reason: collision with root package name */
    private Uri f4175j;

    /* renamed from: k  reason: collision with root package name */
    private Uri f4176k;

    /* renamed from: l  reason: collision with root package name */
    private com.applovin.impl.a.a f4177l;

    /* renamed from: m  reason: collision with root package name */
    private Uri f4178m;

    /* renamed from: n  reason: collision with root package name */
    private Uri f4179n;
    private final List<String> o;
    private final List<String> p;
    private final List<String> q;
    private final List<String> r;
    private final List<String> s;

    public e(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, m mVar) {
        super("TaskRenderNativeAd", mVar);
        this.f4170e = "";
        this.f4171f = "";
        this.f4172g = "";
        this.f4173h = "";
        this.f4174i = null;
        this.f4175j = null;
        this.f4176k = null;
        this.f4178m = null;
        this.f4179n = null;
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.a = jSONObject;
        this.f4168c = jSONObject2;
        this.f4169d = appLovinNativeAdLoadListener;
    }

    private void a() {
        AppLovinNativeAdImpl build = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.a), JsonUtils.shallowCopy(this.f4168c), this.f4020b).setTitle(this.f4170e).setAdvertiser(this.f4171f).setBody(this.f4172g).setCallToAction(this.f4173h).setIconUri(this.f4174i).setMainImageUri(this.f4175j).setVastAd(this.f4177l).setPrivacyDestinationUri(this.f4176k).setClickDestinationUri(this.f4178m).setClickDestinationBackupUri(this.f4179n).setClickTrackingUrls(this.o).setImpressionUrls(this.p).setViewableMRC50Urls(this.q).setViewableMRC100Urls(this.r).setViewableVideo50Urls(this.s).build();
        build.getAdEventTracker().b();
        a("Starting cache task for type: " + build.getType() + "...");
        this.f4020b.S().a(new a(build, this.f4020b, this), o.a.MAIN);
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, ImagesContract.URL, null);
        if (StringUtils.isValidString(string)) {
            this.f4178m = Uri.parse(string);
            StringBuilder y = e.a.d.a.a.y("Processed click destination URL: ");
            y.append(this.f4178m);
            a(y.toString());
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f4179n = Uri.parse(string2);
            StringBuilder y2 = e.a.d.a.a.y("Processed click destination backup URL: ");
            y2.append(this.f4179n);
            a(y2.toString());
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            try {
                this.o.addAll(JsonUtils.toList(jSONArray));
                a("Processed click tracking URLs: " + this.o);
            } catch (Throwable th) {
                a("Failed to render click tracking URLs", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f4169d.onNativeAdLoadFailed(-6);
    }

    private void b(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.e.1
            @Override // java.lang.Runnable
            public void run() {
                e.this.a("Preparing native ad view components...");
                try {
                    appLovinNativeAdImpl.setUpNativeAdViewComponents();
                    e.this.a("Successfully prepared native ad view components");
                    appLovinNativeAdImpl.getAdEventTracker().c();
                    e.this.f4169d.onNativeAdLoaded(appLovinNativeAdImpl);
                } catch (Throwable th) {
                    e.this.a("Failed to prepare native ad view components", th);
                    e.this.b();
                }
            }
        });
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0091a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        a("Successfully cached and loaded ad");
        b(appLovinNativeAdImpl);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        a("VAST ad rendered successfully");
        this.f4177l = (com.applovin.impl.a.a) appLovinAd;
        a();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i2) {
        d("VAST ad failed to render");
        a();
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v40 */
    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        StringBuilder y;
        String str3;
        String str4;
        StringBuilder sb3;
        String str5;
        String str6;
        String str7;
        Uri uri;
        ?? r2 = 0;
        String string = JsonUtils.getString(this.a, "privacy_url", null);
        if (!URLUtil.isValidUrl(string)) {
            string = "https://www.applovin.com/privacy/";
        }
        this.f4176k = Uri.parse(string);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.a, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            sb = new StringBuilder();
            str = "No oRtb response provided: ";
        } else {
            String string2 = JsonUtils.getString(jSONObject, "version", null);
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
            a("Rendering native ad for oRTB version: " + string2);
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
            a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
            if (jSONArray != null && jSONArray.length() != 0) {
                String str8 = "";
                int i2 = 0;
                while (i2 < jSONArray.length()) {
                    JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) r2);
                    if (jSONObject4.has("title")) {
                        this.f4170e = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) r2), "text", r2);
                        StringBuilder y2 = e.a.d.a.a.y("Processed title: ");
                        y2.append(this.f4170e);
                        a(y2.toString());
                    } else if (jSONObject4.has("link")) {
                        a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r2));
                    } else if (jSONObject4.has("img")) {
                        int i3 = JsonUtils.getInt(jSONObject4, FacebookAdapter.KEY_ID, -1);
                        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) r2);
                        int i4 = JsonUtils.getInt(jSONObject5, "type", -1);
                        String string3 = JsonUtils.getString(jSONObject5, ImagesContract.URL, r2);
                        if (i4 == 1 || 3 == i3) {
                            this.f4174i = Uri.parse(string3);
                            y = e.a.d.a.a.y("Processed icon URL: ");
                            uri = this.f4174i;
                        } else if (i4 == 3 || 2 == i3) {
                            this.f4175j = Uri.parse(string3);
                            y = e.a.d.a.a.y("Processed main image URL: ");
                            uri = this.f4175j;
                        } else {
                            c("Unrecognized image: " + jSONObject4);
                            int i5 = JsonUtils.getInt(jSONObject5, "w", -1);
                            int i6 = JsonUtils.getInt(jSONObject5, "h", -1);
                            if (i5 <= 0 || i6 <= 0) {
                                str6 = "Skipping...";
                                c(str6);
                            } else {
                                int i7 = ((i5 / i6) > 1.0d ? 1 : ((i5 / i6) == 1.0d ? 0 : -1));
                                StringBuilder sb4 = new StringBuilder();
                                if (i7 > 0) {
                                    sb4.append("Inferring main image from ");
                                    sb4.append(i5);
                                    sb4.append("x");
                                    sb4.append(i6);
                                    sb4.append("...");
                                    a(sb4.toString());
                                    this.f4175j = Uri.parse(string3);
                                } else {
                                    sb4.append("Inferring icon image from ");
                                    sb4.append(i5);
                                    sb4.append("x");
                                    sb4.append(i6);
                                    sb4.append("...");
                                    a(sb4.toString());
                                    this.f4174i = Uri.parse(string3);
                                }
                            }
                        }
                        y.append(uri);
                        String str9 = str8;
                        str7 = y.toString();
                        str5 = str9;
                        a(str7);
                        str8 = str5;
                    } else {
                        if (jSONObject4.has("video")) {
                            str5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                            if (StringUtils.isValidString(str5)) {
                                str7 = "Processed VAST video";
                                a(str7);
                                str8 = str5;
                            } else {
                                sb3 = new StringBuilder();
                                str4 = "Ignoring invalid \"vasttag\" for video: ";
                            }
                        } else if (jSONObject4.has("data")) {
                            int i8 = JsonUtils.getInt(jSONObject4, FacebookAdapter.KEY_ID, -1);
                            JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                            int i9 = JsonUtils.getInt(jSONObject6, "type", -1);
                            String string4 = JsonUtils.getString(jSONObject6, "value", null);
                            if (i9 == 1 || i8 == 8) {
                                this.f4171f = string4;
                                y = e.a.d.a.a.y("Processed advertiser: ");
                                str3 = this.f4171f;
                            } else if (i9 == 2 || i8 == 4) {
                                this.f4172g = string4;
                                y = e.a.d.a.a.y("Processed body: ");
                                str3 = this.f4172g;
                            } else if (i9 == 12 || i8 == 5) {
                                this.f4173h = string4;
                                y = e.a.d.a.a.y("Processed cta: ");
                                str3 = this.f4173h;
                            } else {
                                str4 = "Skipping unsupported data: ";
                                String str10 = str8;
                                sb3 = new StringBuilder();
                                str5 = str10;
                            }
                            y.append(str3);
                            String str92 = str8;
                            str7 = y.toString();
                            str5 = str92;
                            a(str7);
                            str8 = str5;
                        } else {
                            d("Unsupported asset object: " + jSONObject4);
                        }
                        sb3.append(str4);
                        sb3.append(jSONObject4);
                        String sb5 = sb3.toString();
                        str8 = str5;
                        str6 = sb5;
                        c(str6);
                    }
                    i2++;
                    r2 = 0;
                }
                if (jSONObject3.has("imptrackers")) {
                    d("Ignoring \"imptrackers\" field - it is deprecated in lieu of \"eventtrackers\"");
                }
                if (jSONObject3.has("jstracker")) {
                    d("Ignoring \"jstracker\" field - it is deprecated in lieu of \"eventtrackers\"");
                }
                JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
                if (jSONArray2 != null) {
                    for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                        JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray2, i10, (JSONObject) null);
                        int i11 = JsonUtils.getInt(jSONObject7, "event", -1);
                        int i12 = JsonUtils.getInt(jSONObject7, "method", -1);
                        String string5 = JsonUtils.getString(jSONObject7, ImagesContract.URL, null);
                        if (!TextUtils.isEmpty(string5)) {
                            if (i12 != 1) {
                                d("Unsupported method for event tracker: " + jSONObject7);
                            } else if (i11 == 1) {
                                this.p.add(string5);
                                a("Processed impression URL: " + string5);
                            } else {
                                if (i11 == 2) {
                                    this.q.add(string5);
                                    sb2 = new StringBuilder();
                                    str2 = "Processed viewable MRC50 URL: ";
                                } else if (i11 == 3) {
                                    this.r.add(string5);
                                    sb2 = new StringBuilder();
                                    str2 = "Processed viewable MRC100 URL: ";
                                } else if (i11 == 4) {
                                    this.s.add(string5);
                                    sb2 = new StringBuilder();
                                    str2 = "Processed viewable video 50 URL: ";
                                } else {
                                    d("Unsupported event tracker: " + jSONObject7);
                                }
                                sb2.append(str2);
                                sb2.append(string5);
                                a(sb2.toString());
                            }
                        }
                    }
                }
                if (!StringUtils.isValidString(str8)) {
                    a();
                    return;
                }
                a("Processing VAST video...");
                this.f4020b.S().a(r.a(str8, this.a, this.f4168c, com.applovin.impl.sdk.ad.b.UNKNOWN, this, this.f4020b));
                return;
            }
            sb = new StringBuilder();
            str = "Unable to retrieve assets - failing ad load: ";
        }
        sb.append(str);
        sb.append(this.a);
        d(sb.toString());
        b();
    }
}
