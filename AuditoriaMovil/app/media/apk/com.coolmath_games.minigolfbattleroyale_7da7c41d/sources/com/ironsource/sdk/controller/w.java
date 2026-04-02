package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.drive.DriveFile;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.C0119m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.controller.q;
import com.ironsource.sdk.controller.r;
import com.ironsource.sdk.controller.u;
import com.ironsource.sdk.f.a;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.vungle.warren.AdLoader;
import com.vungle.warren.model.ReportDBAdapter;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class w extends WebView implements DownloadListener, m, com.ironsource.sdk.k.c {
    private static String ab = "success";
    private static String ac = "fail";
    public static String b = "is_store";
    public static String c = "external_url";
    public static String d = "secondary_web_view";
    private static int z;
    private final String A;
    private String B;
    private String C;
    private Map<String, String> D;
    private com.ironsource.sdk.k.b E;
    private boolean F;
    private boolean G;
    private CountDownTimer H;
    private int I;
    private int J;
    private String K;
    private FrameLayout L;
    private WebChromeClient.CustomViewCallback M;
    private com.ironsource.sdk.j.a.d N;
    private com.ironsource.sdk.j.a.c O;
    private com.ironsource.sdk.j.e P;
    private com.ironsource.sdk.j.a.b Q;
    private Boolean R;
    private Object S;
    private Handler T;
    private boolean U;
    private j V;
    private com.ironsource.sdk.controller.e W;
    String a;
    private com.ironsource.sdk.service.Connectivity.b aa;
    b e;
    public CountDownTimer f;
    a g;
    View h;
    FrameLayout i;
    g j;
    String k;
    String l;
    com.ironsource.sdk.controller.f m;
    v n;
    com.ironsource.sdk.g.b o;
    q p;
    r q;
    u r;
    k s;
    com.ironsource.sdk.controller.a t;
    l u;
    x v;
    com.ironsource.sdk.controller.c w;
    com.ironsource.sdk.j.g x;
    private String y;

    /* loaded from: classes2.dex */
    class a extends WebChromeClient {
        private a() {
        }

        /* synthetic */ a(w wVar, byte b) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public final View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(w.this.w.a());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new c(w.this, (byte) 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            if (w.this.h == null) {
                return;
            }
            w.this.h.setVisibility(8);
            w.this.L.removeView(w.this.h);
            w.this.h = null;
            w.this.L.setVisibility(8);
            w.this.M.onCustomViewHidden();
            w.this.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            w.this.setVisibility(8);
            if (w.this.h != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            w.this.L.addView(view);
            w.this.h = view;
            w.this.M = customViewCallback;
            w.this.L.setVisibility(0);
        }
    }

    /* loaded from: classes2.dex */
    static class b {
        d.e a;
        String b;

        public b(d.e eVar, String str) {
            this.a = eVar;
            this.b = str;
        }
    }

    /* loaded from: classes2.dex */
    class c extends WebViewClient {
        private c() {
        }

        /* synthetic */ c(w wVar, byte b) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str = w.this.a;
            Logger.e(str, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Activity a = w.this.w.a();
            Intent intent = new Intent(a, OpenUrlActivity.class);
            intent.putExtra(w.c, str);
            intent.putExtra(w.d, false);
            a.startActivity(intent);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class d {

        /* loaded from: classes2.dex */
        public class a {
            public a() {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public final void a(boolean z, String str, com.ironsource.sdk.g.f fVar) {
                fVar.a(z ? w.ab : w.ac, str);
                w.a(w.this, fVar.toString(), z, (String) null, (String) null);
            }

            public final void a(boolean z, String str, JSONObject jSONObject) {
                try {
                    jSONObject.put(z ? w.ab : w.ac, str);
                    w.a(w.this, jSONObject.toString(), z, (String) null, (String) null);
                } catch (JSONException e) {
                    e.printStackTrace();
                    e.getMessage();
                }
            }
        }

        public d() {
        }

        private void a(String str, boolean z) {
            com.ironsource.sdk.g.c a2 = w.this.V.a(d.e.Interstitial, str);
            if (a2 != null) {
                a2.f = z;
            }
        }

        private void a(JSONObject jSONObject) {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put("nativeFeatures", new JSONArray((Collection) featuresManager.a()));
            } catch (Exception e) {
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.n, new com.ironsource.sdk.a.a().a("callfailreason", e.getMessage()).a);
                Logger.d(w.this.a, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void a(JSONObject jSONObject, String str) {
            if (a(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException unused) {
                    Logger.d(w.this.a, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        private static boolean a(String str) {
            if (TextUtils.isEmpty(str) || str.contains("-1")) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString("testerABGroup").isEmpty()) {
                    return false;
                }
                return !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }

        private void b(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", w.this.m.e());
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "adClicked(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("productType");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            final d.e e = w.e(w.this, d);
            final com.ironsource.sdk.j.a.a b = w.this.b(e);
            if (e == null || b == null) {
                return;
            }
            w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.6
                @Override // java.lang.Runnable
                public final void run() {
                    b.b(e, fetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void adCredited(final String str) {
            final boolean z;
            final boolean z2;
            final String str2;
            com.ironsource.sdk.g.c a2;
            Log.d(w.this.y, "adCredited(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("credits");
            boolean z3 = false;
            final int parseInt = d != null ? Integer.parseInt(d) : 0;
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            final String d2 = fVar.d("productType");
            if (TextUtils.isEmpty(d2)) {
                Log.d(w.this.y, "adCredited | product type is missing");
            }
            if (d.e.Interstitial.toString().equalsIgnoreCase(d2)) {
                if (!w.this.a(d.e.Interstitial.toString()) || (a2 = w.this.V.a(d.e.Interstitial, fetchDemandSourceId)) == null) {
                    return;
                }
                if (a2.d != null && a2.d.containsKey("rewarded")) {
                    z3 = Boolean.parseBoolean(a2.d.get("rewarded"));
                }
                if (z3) {
                    w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.25
                        @Override // java.lang.Runnable
                        public final void run() {
                            w.this.O.b(fetchDemandSourceId, parseInt);
                        }
                    });
                    return;
                }
                return;
            }
            String d3 = fVar.d("total");
            final int parseInt2 = d3 != null ? Integer.parseInt(d3) : 0;
            if (!d.e.OfferWall.toString().equalsIgnoreCase(d2)) {
                z = false;
                z2 = false;
                str2 = null;
            } else if (fVar.b(InAppPurchaseMetaData.KEY_SIGNATURE) || fVar.b(VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP) || fVar.b("totalCreditsFlag")) {
                w.a(w.this, str, false, "One of the keys are missing: signature/timestamp/totalCreditsFlag", (String) null);
                return;
            } else {
                if (fVar.d(InAppPurchaseMetaData.KEY_SIGNATURE).equalsIgnoreCase(SDKUtils.getMD5(d3 + w.this.B + w.this.C))) {
                    z3 = true;
                } else {
                    w.a(w.this, str, false, "Controller signature is not equal to SDK signature", (String) null);
                }
                boolean e = fVar.e("totalCreditsFlag");
                str2 = fVar.d(VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP);
                z2 = e;
                z = z3;
            }
            if (w.this.a(d2)) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.24
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (d2.equalsIgnoreCase(d.e.RewardedVideo.toString())) {
                            w.this.N.a(fetchDemandSourceId, parseInt);
                        } else if (d2.equalsIgnoreCase(d.e.OfferWall.toString()) && z && w.this.P.onOWAdCredited(parseInt, parseInt2, z2) && !TextUtils.isEmpty(str2)) {
                            if (com.ironsource.sdk.utils.b.a().a(str2, w.this.B, w.this.C)) {
                                w.a(w.this, str, true, (String) null, (String) null);
                            } else {
                                w.a(w.this, str, false, "Time Stamp could not be stored", (String) null);
                            }
                        }
                    }
                });
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "adUnitsReady(" + str + ")");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            final com.ironsource.sdk.g.a aVar = new com.ironsource.sdk.g.a(str);
            if (!aVar.c) {
                w.a(w.this, str, false, "Num Of Ad Units Do Not Exist", (String) null);
                return;
            }
            w.a(w.this, str, true, (String) null, (String) null);
            String str3 = aVar.a;
            if (d.e.RewardedVideo.toString().equalsIgnoreCase(str3) && w.this.a(str3)) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.23
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (Integer.parseInt(aVar.b) <= 0) {
                            w.this.N.b(fetchDemandSourceId);
                            return;
                        }
                        Log.d(w.this.a, "onRVInitSuccess()");
                        w.this.N.a(d.e.RewardedVideo, fetchDemandSourceId, aVar);
                    }
                });
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                String str2 = w.this.a;
                Logger.i(str2, "adViewAPI(" + str + ")");
                w.this.t.a(new com.ironsource.sdk.g.f(str).toString(), new a());
            } catch (Exception e) {
                e.printStackTrace();
                String str3 = w.this.a;
                Logger.i(str3, "adViewAPI failed with exception " + e.getMessage());
            }
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.e(w.this.a, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            d.e e;
            Map<String, com.ironsource.sdk.g.c> a2;
            com.ironsource.sdk.g.c remove;
            try {
                String str2 = w.this.a;
                Logger.i(str2, "cleanAdInstance(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d = fVar.d("productType");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                if (TextUtils.isEmpty(fetchDemandSourceId) || (e = w.e(w.this, d)) == null) {
                    return;
                }
                j jVar = w.this.V;
                if (TextUtils.isEmpty(fetchDemandSourceId) || (a2 = jVar.a(e)) == null || (remove = a2.remove(fetchDemandSourceId)) == null) {
                    return;
                }
                remove.g = null;
                if (remove.d != null) {
                    remove.d.clear();
                }
                remove.d = null;
            } catch (Exception e2) {
                w.a(w.this, str, false, e2.getMessage(), (String) null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                com.ironsource.sdk.utils.b a2 = com.ironsource.sdk.utils.b.a();
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) a2.a.getAll().keySet().toArray(new String[0]);
                SharedPreferences.Editor edit = a2.a.edit();
                for (String str2 : strArr) {
                    if (com.ironsource.sdk.utils.b.b(str2)) {
                        arrayList.add(str2);
                        edit.remove(str2);
                    }
                }
                edit.apply();
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                if (!arrayList.isEmpty()) {
                    fVar.a("removedAdsLastUpdateTime", arrayList.toString());
                }
                w.a(w.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e) {
                w.a(w.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                String str2 = w.this.a;
                Logger.i(str2, "deleteFile(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d = fVar.d("file");
                String d2 = fVar.d("path");
                if (d2 != null && !TextUtils.isEmpty(d)) {
                    com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(w.this.l, d2), d);
                    if (!cVar.exists()) {
                        w.a(w.this, str, false, "File not exist", "1");
                        return;
                    }
                    w.a(w.this, str, IronSourceStorageUtils.deleteFile(cVar), (String) null, (String) null);
                    return;
                }
                w.a(w.this, str, false, "Missing parameters for file", "1");
            } catch (Exception e) {
                w.a(w.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                String str2 = w.this.a;
                Logger.i(str2, "deleteFolder(" + str + ")");
                String d = new com.ironsource.sdk.g.f(str).d("path");
                if (d == null) {
                    w.a(w.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(w.this.l, d));
                if (!cVar.exists()) {
                    w.a(w.this, str, false, "Folder not exist", "1");
                    return;
                }
                w.a(w.this, str, IronSourceStorageUtils.deleteFolder(cVar.getPath()), (String) null, (String) null);
            } catch (Exception e) {
                w.a(w.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                String str2 = w.this.a;
                Logger.i(str2, "deviceDataAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                k kVar = w.this.s;
                String fVar2 = fVar.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar2);
                k.a aVar2 = new k.a((byte) 0);
                aVar2.a = jSONObject.optString("deviceDataFunction");
                aVar2.b = jSONObject.optJSONObject("deviceDataParams");
                aVar2.c = jSONObject.optString("success");
                aVar2.d = jSONObject.optString("fail");
                if (!"getDeviceData".equals(aVar2.a)) {
                    String str3 = k.b;
                    Logger.i(str3, "unhandled API request " + fVar2);
                    return;
                }
                String str4 = aVar2.c;
                com.ironsource.sdk.g.f fVar3 = new com.ironsource.sdk.g.f();
                fVar3.a(SDKUtils.encodeString("sdCardAvailable"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.d())));
                fVar3.a(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.e(kVar.a))));
                fVar3.a(SDKUtils.encodeString("isCharging"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.f(kVar.a))));
                fVar3.a(SDKUtils.encodeString("chargingType"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.g(kVar.a))));
                fVar3.a(SDKUtils.encodeString("airplaneMode"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.h(kVar.a))));
                fVar3.a(SDKUtils.encodeString("stayOnWhenPluggedIn"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.i(kVar.a))));
                aVar.a(true, str4, fVar3);
            } catch (Exception e) {
                e.printStackTrace();
                String str5 = w.this.a;
                Logger.i(str5, "deviceDataAPI failed with exception " + e.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            int i;
            Logger.i(w.this.a, "displayWebView(" + str + ")");
            w.a(w.this, str, true, (String) null, (String) null);
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            boolean booleanValue = ((Boolean) fVar.c(ServerProtocol.DIALOG_PARAM_DISPLAY)).booleanValue();
            String d = fVar.d("productType");
            boolean e = fVar.e("standaloneView");
            String d2 = fVar.d("adViewId");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            boolean e2 = fVar.e("ctrWVPauseResume");
            if (!booleanValue) {
                w.this.j = g.Gone;
                w.this.h();
                return;
            }
            w.this.U = fVar.e("immersive");
            boolean e3 = fVar.e("activityThemeTranslucent");
            if (w.this.j == g.Display) {
                Logger.i(w.this.a, "State: " + w.this.j);
                return;
            }
            w.this.j = g.Display;
            Logger.i(w.this.a, "State: " + w.this.j);
            Activity a2 = w.this.w.a();
            String str2 = w.this.k;
            int l = com.ironsource.environment.h.l(a2);
            if (e) {
                final com.ironsource.sdk.controller.i iVar = new com.ironsource.sdk.controller.i(a2);
                iVar.addView(w.this.i);
                iVar.b = w.this;
                iVar.b.x = iVar;
                iVar.b.requestFocus();
                iVar.a = iVar.b.w.a();
                if (((((Activity) iVar.a).getWindow().getAttributes().flags & 1024) != 0) || (i = iVar.a()) <= 0) {
                    i = 0;
                }
                int b = iVar.b();
                try {
                    if (iVar.a != null) {
                        int p = com.ironsource.environment.h.p(iVar.a);
                        if (p == 1) {
                            iVar.setPadding(0, i, 0, b);
                        } else if (p == 2) {
                            iVar.setPadding(0, i, b, 0);
                        }
                    }
                } catch (Exception unused) {
                }
                ((Activity) iVar.a).runOnUiThread(new Runnable() { // from class: com.ironsource.sdk.controller.i.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewGroup a3 = i.a(i.this);
                        if (a3 != null) {
                            a3.addView(i.this);
                        }
                    }
                });
                return;
            }
            Intent intent = e3 ? new Intent(a2, InterstitialActivity.class) : new Intent(a2, ControllerActivity.class);
            if (d.e.RewardedVideo.toString().equalsIgnoreCase(d)) {
                if ("application".equals(str2)) {
                    str2 = SDKUtils.translateRequestedOrientation(com.ironsource.environment.h.n(a2));
                }
                intent.putExtra("productType", d.e.RewardedVideo.toString());
                w.this.o.e = d.e.RewardedVideo.ordinal();
                w.this.o.c = fetchDemandSourceId;
                if (w.this.a(d.e.RewardedVideo.toString())) {
                    w.this.N.c(d.e.RewardedVideo, fetchDemandSourceId);
                }
            } else if (d.e.OfferWall.toString().equalsIgnoreCase(d)) {
                intent.putExtra("productType", d.e.OfferWall.toString());
                w.this.o.e = d.e.OfferWall.ordinal();
            } else if (d.e.Interstitial.toString().equalsIgnoreCase(d)) {
                if ("application".equals(str2)) {
                    str2 = SDKUtils.translateRequestedOrientation(com.ironsource.environment.h.n(a2));
                }
                intent.putExtra("productType", d.e.Interstitial.toString());
            }
            if (d2 != null) {
                intent.putExtra("adViewId", d2);
            }
            intent.putExtra("ctrWVPauseResume", e2);
            intent.setFlags(DriveFile.MODE_WRITE_ONLY);
            intent.putExtra("immersive", w.this.U);
            intent.putExtra("orientation_set_flag", str2);
            intent.putExtra("rotation_set_flag", l);
            w.this.e = new b(w.e(w.this, d), fetchDemandSourceId);
            a2.startActivity(intent);
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            JSONObject a2;
            try {
                Logger.i(w.this.a, "fileSystemAPI(" + str + ")");
                final l lVar = w.this.u;
                JSONObject jSONObject = new JSONObject(str);
                a aVar = new a();
                final n nVar = new n(jSONObject);
                final o oVar = new o(aVar);
                try {
                    String str2 = nVar.a;
                    JSONObject jSONObject2 = nVar.b;
                    char c = 65535;
                    boolean z = false;
                    switch (str2.hashCode()) {
                        case -2073025383:
                            if (str2.equals("saveFile")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1137024519:
                            if (str2.equals("deleteFolder")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -318115535:
                            if (str2.equals("getTotalSizeOfFiles")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 537556755:
                            if (str2.equals("updateAttributesOfFile")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1764172231:
                            if (str2.equals("deleteFile")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1953259713:
                            if (str2.equals("getFiles")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        com.ironsource.sdk.h.c a3 = l.a(jSONObject2, lVar.a);
                        String optString = jSONObject2.optString("fileUrl");
                        final com.ironsource.sdk.k.c cVar = new com.ironsource.sdk.k.c() { // from class: com.ironsource.sdk.controller.l.1
                            @Override // com.ironsource.sdk.k.c
                            public final void a(com.ironsource.sdk.h.c cVar2) {
                                try {
                                    oVar.a(nVar, l.a(nVar, cVar2.a()));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                            @Override // com.ironsource.sdk.k.c
                            public final void a(com.ironsource.sdk.h.c cVar2, com.ironsource.sdk.g.e eVar) {
                                try {
                                    oVar.b(nVar, l.a(nVar, eVar.a));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        };
                        final com.ironsource.sdk.h.b bVar = lVar.b;
                        if (TextUtils.isEmpty(optString)) {
                            throw new Exception("Missing params for file");
                        }
                        if (com.ironsource.environment.h.a(bVar.b.b) <= 0) {
                            throw new Exception("no_disk_space");
                        }
                        if (!SDKUtils.isExternalStorageAvailable()) {
                            throw new Exception("sotrage_unavailable");
                        }
                        if (!a.AnonymousClass1.b(bVar.a)) {
                            throw new Exception("no_network_connection");
                        }
                        com.ironsource.sdk.h.a aVar2 = bVar.c;
                        String path = a3.getPath();
                        com.ironsource.sdk.k.c cVar2 = new com.ironsource.sdk.k.c() { // from class: com.ironsource.sdk.h.b.1
                            @Override // com.ironsource.sdk.k.c
                            public final void a(c cVar3) {
                                cVar.a(cVar3);
                                try {
                                    bVar.d.a(cVar3.getName(), new JSONObject() { // from class: com.ironsource.sdk.h.b.1.1
                                        {
                                            AnonymousClass1.this = this;
                                            put("lastReferencedTime", System.currentTimeMillis());
                                        }
                                    });
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                            @Override // com.ironsource.sdk.k.c
                            public final void a(c cVar3, com.ironsource.sdk.g.e eVar) {
                                cVar.a(cVar3, eVar);
                            }
                        };
                        if (path != null) {
                            aVar2.a.put(path, cVar2);
                        }
                        if (!a3.exists()) {
                            bVar.b.a(a3, optString, bVar.c);
                            return;
                        }
                        Message message = new Message();
                        message.obj = a3;
                        message.what = 1015;
                        bVar.c.handleMessage(message);
                        return;
                    }
                    if (c == 1) {
                        com.ironsource.sdk.h.c a4 = l.a(jSONObject2, lVar.a);
                        com.ironsource.sdk.h.b bVar2 = lVar.b;
                        if (a4.exists()) {
                            if (!a4.delete()) {
                                throw new Exception("Failed to delete file");
                            }
                            bVar2.d.a(a4.getName());
                        }
                        a2 = l.a(nVar, a4.a());
                    } else if (c == 2) {
                        com.ironsource.sdk.h.c b = l.b(jSONObject2, lVar.a);
                        com.ironsource.sdk.h.b bVar3 = lVar.b;
                        if (b.exists()) {
                            ArrayList<com.ironsource.sdk.h.c> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(b);
                            if (IronSourceStorageUtils.deleteFolderContentRecursive(b) && b.delete()) {
                                z = true;
                            }
                            if (!z) {
                                throw new Exception("Failed to delete folder");
                            }
                            bVar3.d.a(filesInFolderRecursive);
                        }
                        a2 = l.a(nVar, b.a());
                    } else if (c == 3) {
                        com.ironsource.sdk.h.c b2 = l.b(jSONObject2, lVar.a);
                        com.ironsource.sdk.h.b bVar4 = lVar.b;
                        if (!b2.exists()) {
                            throw new Exception("Folder does not exist");
                        }
                        a2 = l.a(nVar, IronSourceStorageUtils.buildFilesMapOfDirectory(b2, bVar4.d.a()));
                    } else if (c != 4) {
                        if (c != 5) {
                            return;
                        }
                        com.ironsource.sdk.h.c a5 = l.a(jSONObject2, lVar.a);
                        JSONObject optJSONObject = jSONObject2.optJSONObject("attributesToUpdate");
                        com.ironsource.sdk.h.b bVar5 = lVar.b;
                        if (optJSONObject == null) {
                            throw new Exception("Missing attributes to update");
                        }
                        if (!a5.exists()) {
                            throw new Exception("File does not exist");
                        }
                        if (!bVar5.d.b(a5.getName(), optJSONObject)) {
                            throw new Exception("Failed to update attribute");
                        }
                        oVar.a(nVar, l.a(nVar, a5.a()));
                        return;
                    } else {
                        com.ironsource.sdk.h.c b3 = l.b(jSONObject2, lVar.a);
                        if (!b3.exists()) {
                            throw new Exception("Folder does not exist");
                        }
                        a2 = l.a(nVar, IronSourceStorageUtils.getTotalSizeOfDir(b3));
                    }
                    oVar.a(nVar, a2);
                } catch (Exception e) {
                    oVar.b(nVar, l.a(nVar, e.getMessage()));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                Logger.i(w.this.a, "fileSystemAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L6;
         */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getApplicationInfo(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.w.this
                java.lang.String r0 = com.ironsource.sdk.controller.w.b(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getApplicationInfo("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.w.this
                java.lang.String r0 = com.ironsource.sdk.controller.w.b(r0, r5)
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.w.this
                java.lang.String r1 = com.ironsource.sdk.controller.w.c(r1, r5)
                com.ironsource.sdk.g.f r2 = new com.ironsource.sdk.g.f
                r2.<init>(r5)
                java.lang.String r5 = "productType"
                java.lang.String r5 = r2.d(r5)
                java.lang.String r2 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(r2)
                com.ironsource.sdk.controller.w r3 = com.ironsource.sdk.controller.w.this
                java.lang.Object[] r5 = com.ironsource.sdk.controller.w.b(r3, r5, r2)
                r2 = 0
                r2 = r5[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r5 = r5[r3]
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L55
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 != 0) goto L5c
                r0 = r1
                goto L5d
            L55:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L5c
                goto L5d
            L5c:
                r0 = 0
            L5d:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L72
                com.ironsource.sdk.controller.w r5 = com.ironsource.sdk.controller.w.this
                java.lang.String r1 = "onGetApplicationInfoSuccess"
                java.lang.String r3 = "onGetApplicationInfoFail"
                java.lang.String r5 = com.ironsource.sdk.controller.w.a(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.w.this
                com.ironsource.sdk.controller.w.a(r0, r5)
            L72:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.w.d.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            w wVar;
            String str2;
            String str3 = w.this.a;
            Logger.i(str3, "getCachedFilesMap(" + str + ")");
            String b = w.b(w.this, str);
            if (TextUtils.isEmpty(b)) {
                return;
            }
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            if (fVar.a("path")) {
                String str4 = (String) fVar.c("path");
                if (IronSourceStorageUtils.isPathExist(w.this.l, str4)) {
                    w.this.b(w.a(w.this, b, IronSourceStorageUtils.getCachedFilesMap(w.this.l, str4), "onGetCachedFilesMapSuccess", "onGetCachedFilesMapFail"));
                    return;
                }
                wVar = w.this;
                str2 = "path file does not exist on disk";
            } else {
                wVar = w.this;
                str2 = "path key does not exist";
            }
            w.a(wVar, str, false, str2, (String) null);
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String a2;
            String str2 = w.this.a;
            Logger.i(str2, "getConnectivityInfo(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d(w.ab);
            String d2 = fVar.d(w.ac);
            JSONObject jSONObject = new JSONObject();
            if (w.this.aa != null) {
                com.ironsource.sdk.service.Connectivity.b bVar = w.this.aa;
                jSONObject = bVar.a.c(w.this.getContext());
            }
            if (jSONObject.length() > 0) {
                a2 = w.a(w.this, d, jSONObject.toString());
            } else {
                a2 = w.a(w.this, d2, w.a(w.this, "errMsg", "failed to retrieve connection info", null, null, null, null, null, null, null, false));
            }
            w.this.b(a2);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "getControllerConfig(" + str + ")");
            String d = new com.ironsource.sdk.g.f(str).d(w.ab);
            if (TextUtils.isEmpty(d)) {
                return;
            }
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            a(controllerConfigAsJSONObject);
            a(controllerConfigAsJSONObject, SDKUtils.getTesterParameters());
            b(controllerConfigAsJSONObject);
            w.this.b(w.a(w.this, d, controllerConfigAsJSONObject.toString()));
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[Catch: Exception -> 0x008c, TRY_LEAVE, TryCatch #0 {Exception -> 0x008c, blocks: (B:6:0x0036, B:8:0x003c, B:10:0x0058, B:15:0x0062, B:17:0x0076, B:19:0x0080, B:16:0x0070), top: B:24:0x0036 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getDemandSourceState(java.lang.String r9) {
            /*
                r8 = this;
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.w.this
                java.lang.String r0 = com.ironsource.sdk.controller.w.b(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getMediationState("
                r1.<init>(r2)
                r1.append(r9)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
                r0.<init>(r9)
                java.lang.String r1 = "demandSourceName"
                java.lang.String r2 = r0.d(r1)
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(r0)
                java.lang.String r4 = "productType"
                java.lang.String r0 = r0.d(r4)
                if (r0 == 0) goto L9a
                if (r2 == 0) goto L9a
                r5 = 0
                com.ironsource.sdk.g.d$e r6 = com.ironsource.sdk.utils.SDKUtils.getProductType(r0)     // Catch: java.lang.Exception -> L8c
                if (r6 == 0) goto L9a
                com.ironsource.sdk.controller.w r7 = com.ironsource.sdk.controller.w.this     // Catch: java.lang.Exception -> L8c
                com.ironsource.sdk.controller.j r7 = com.ironsource.sdk.controller.w.y(r7)     // Catch: java.lang.Exception -> L8c
                com.ironsource.sdk.g.c r6 = r7.a(r6, r3)     // Catch: java.lang.Exception -> L8c
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8c
                r7.<init>()     // Catch: java.lang.Exception -> L8c
                r7.put(r4, r0)     // Catch: java.lang.Exception -> L8c
                r7.put(r1, r2)     // Catch: java.lang.Exception -> L8c
                java.lang.String r0 = "demandSourceId"
                r7.put(r0, r3)     // Catch: java.lang.Exception -> L8c
                if (r6 == 0) goto L70
                int r0 = r6.c     // Catch: java.lang.Exception -> L8c
                r1 = -1
                if (r0 != r1) goto L5f
                r0 = 1
                goto L60
            L5f:
                r0 = r5
            L60:
                if (r0 != 0) goto L70
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.w.this     // Catch: java.lang.Exception -> L8c
                java.lang.String r0 = com.ironsource.sdk.controller.w.b(r0, r9)     // Catch: java.lang.Exception -> L8c
                java.lang.String r1 = "state"
                int r2 = r6.c     // Catch: java.lang.Exception -> L8c
                r7.put(r1, r2)     // Catch: java.lang.Exception -> L8c
                goto L76
            L70:
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.w.this     // Catch: java.lang.Exception -> L8c
                java.lang.String r0 = com.ironsource.sdk.controller.w.c(r0, r9)     // Catch: java.lang.Exception -> L8c
            L76:
                java.lang.String r1 = r7.toString()     // Catch: java.lang.Exception -> L8c
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L8c
                if (r2 != 0) goto L9a
                com.ironsource.sdk.controller.w r2 = com.ironsource.sdk.controller.w.this     // Catch: java.lang.Exception -> L8c
                java.lang.String r0 = com.ironsource.sdk.controller.w.a(r2, r0, r1)     // Catch: java.lang.Exception -> L8c
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.w.this     // Catch: java.lang.Exception -> L8c
                com.ironsource.sdk.controller.w.a(r1, r0)     // Catch: java.lang.Exception -> L8c
                goto L9a
            L8c:
                r0 = move-exception
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.w.this
                java.lang.String r2 = r0.getMessage()
                r3 = 0
                com.ironsource.sdk.controller.w.a(r1, r9, r5, r2, r3)
                r0.printStackTrace()
            L9a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.w.d.getDemandSourceState(java.lang.String):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L6;
         */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getDeviceStatus(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.w.this
                java.lang.String r0 = com.ironsource.sdk.controller.w.b(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getDeviceStatus("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.w.this
                java.lang.String r0 = com.ironsource.sdk.controller.w.b(r0, r5)
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.w.this
                java.lang.String r5 = com.ironsource.sdk.controller.w.c(r1, r5)
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.w.this
                android.content.Context r2 = r1.getContext()
                java.lang.Object[] r1 = com.ironsource.sdk.controller.w.a(r1, r2)
                r2 = 0
                r2 = r1[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r1 = r1[r3]
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L4a
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L51
                r0 = r5
                goto L52
            L4a:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L51
                goto L52
            L51:
                r0 = 0
            L52:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L67
                com.ironsource.sdk.controller.w r5 = com.ironsource.sdk.controller.w.this
                java.lang.String r1 = "onGetDeviceStatusSuccess"
                java.lang.String r3 = "onGetDeviceStatusFail"
                java.lang.String r5 = com.ironsource.sdk.controller.w.a(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.w.this
                com.ironsource.sdk.controller.w.a(r0, r5)
            L67:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.w.d.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "getDeviceVolume(" + str + ")");
            try {
                com.ironsource.sdk.utils.a.a(w.this.w.a());
                float b = com.ironsource.sdk.utils.a.b(w.this.w.a());
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                fVar.a("deviceVolume", String.valueOf(b));
                w.a(w.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            Activity a2 = w.this.w.a();
            if (a2 != null) {
                String b = w.b(w.this, str);
                String jSONObject = SDKUtils.getOrientation(a2).toString();
                if (TextUtils.isEmpty(b)) {
                    return;
                }
                w.this.b(w.a(w.this, b, jSONObject, "onGetOrientationSuccess", "onGetOrientationFail"));
            }
        }

        @JavascriptInterface
        public void getUserData(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "getUserData(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            if (!fVar.a(SDKConstants.PARAM_KEY)) {
                w.a(w.this, str, false, "key does not exist", (String) null);
                return;
            }
            String b = w.b(w.this, str);
            String d = fVar.d(SDKConstants.PARAM_KEY);
            String string = com.ironsource.sdk.utils.b.a().a.getString(d, null);
            if (string == null) {
                string = JsonUtils.EMPTY_JSON;
            }
            w.this.b(w.a(w.this, b, w.a(w.this, d, string, null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                String str2 = w.this.a;
                Logger.i(str2, "iabTokenAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                u uVar = w.this.r;
                String fVar2 = fVar.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar2);
                u.a aVar2 = new u.a((byte) 0);
                aVar2.a = jSONObject.optString("functionName");
                aVar2.b = jSONObject.optJSONObject("functionParams");
                aVar2.c = jSONObject.optString("success");
                aVar2.d = jSONObject.optString("fail");
                if ("updateToken".equals(aVar2.a)) {
                    JSONObject jSONObject2 = aVar2.b;
                    com.ironsource.sdk.g.f fVar3 = new com.ironsource.sdk.g.f();
                    try {
                        com.ironsource.sdk.service.c cVar = uVar.c;
                        C0119m.a("ctgp", jSONObject2);
                        uVar.b.a(jSONObject2);
                        aVar.a(true, aVar2.c, fVar3);
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        String str3 = u.a;
                        Logger.i(str3, "updateToken exception " + e.getMessage());
                        aVar.a(false, aVar2.d, fVar3);
                        return;
                    }
                } else if (!"getToken".equals(aVar2.a)) {
                    String str4 = u.a;
                    Logger.i(str4, "unhandled API request " + fVar2);
                    return;
                } else {
                    try {
                        aVar.a(true, aVar2.c, SDKUtils.getControllerConfigAsJSONObject().optBoolean("oneToken") ? uVar.a() : uVar.b.b(uVar.d));
                        return;
                    } catch (Exception e2) {
                        String str5 = aVar2.d;
                        String message = e2.getMessage();
                        com.ironsource.sdk.g.f fVar4 = new com.ironsource.sdk.g.f();
                        fVar4.a(w.ac, str5);
                        fVar4.a("data", message);
                        w.a(w.this, fVar4.toString(), false, (String) null, (String) null);
                        return;
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                String str6 = w.this.a;
                Logger.i(str6, "iabTokenAPI failed with exception " + e3.getMessage());
            }
            e3.printStackTrace();
            String str62 = w.this.a;
            Logger.i(str62, "iabTokenAPI failed with exception " + e3.getMessage());
        }

        @JavascriptInterface
        public void initController(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "initController(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            if (w.this.f != null) {
                w.this.f.cancel();
                w.this.f = null;
            }
            if (fVar.a("stage")) {
                String d = fVar.d("stage");
                if ("ready".equalsIgnoreCase(d)) {
                    w.b(w.this, true);
                    w.this.W.b();
                } else if ("loaded".equalsIgnoreCase(d)) {
                    w.this.W.a();
                } else if (!"failed".equalsIgnoreCase(d)) {
                    Logger.i(w.this.a, "No STAGE mentioned! should not get here!");
                } else {
                    String d2 = fVar.d("errMsg");
                    com.ironsource.sdk.controller.e eVar = w.this.W;
                    eVar.a("controller js failed to initialize : " + d2);
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(final String str) {
            w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.20
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Logger.i(w.this.a, "omidAPI(" + str + ")");
                        com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                        q qVar = w.this.p;
                        String fVar2 = fVar.toString();
                        a aVar = new a();
                        WebView G = w.G(w.this);
                        JSONObject jSONObject = new JSONObject(fVar2);
                        q.a aVar2 = new q.a((byte) 0);
                        aVar2.a = jSONObject.optString("omidFunction");
                        aVar2.b = jSONObject.optJSONObject("omidParams");
                        aVar2.c = jSONObject.optString("success");
                        aVar2.d = jSONObject.optString("fail");
                        com.ironsource.sdk.g.f fVar3 = new com.ironsource.sdk.g.f();
                        try {
                            String str2 = aVar2.a;
                            char c = 65535;
                            switch (str2.hashCode()) {
                                case -1655974669:
                                    if (str2.equals("activate")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case -984459207:
                                    if (str2.equals("getOmidData")) {
                                        c = 4;
                                        break;
                                    }
                                    break;
                                case 70701699:
                                    if (str2.equals("finishSession")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case 1208109646:
                                    if (str2.equals("impressionOccurred")) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                                case 1850541012:
                                    if (str2.equals("startSession")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                            }
                            if (c != 0) {
                                if (c == 1) {
                                    com.ironsource.sdk.e.a.a.a(aVar2.b, G);
                                } else if (c == 2) {
                                    com.ironsource.sdk.e.a.a.b();
                                } else if (c == 3) {
                                    com.ironsource.sdk.e.a.a.a(aVar2.b);
                                } else if (c != 4) {
                                    throw new IllegalArgumentException(String.format("%s | unsupported OMID API", aVar2.a));
                                }
                                aVar.a(true, aVar2.c, fVar3);
                            }
                            com.ironsource.sdk.e.a.a.a(qVar.b);
                            fVar3 = com.ironsource.sdk.e.a.a.a();
                            aVar.a(true, aVar2.c, fVar3);
                        } catch (Exception e) {
                            fVar3.a("errMsg", e.getMessage());
                            Logger.i(q.a, "OMIDJSAdapter " + aVar2.a + " Exception: " + e.getMessage());
                            aVar.a(false, aVar2.d, fVar3);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        Logger.i(w.this.a, "omidAPI failed with exception " + e2.getMessage());
                    }
                }
            });
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onAdWindowsClosed(" + str + ")");
            w.this.o.e = -1;
            w.this.o.c = null;
            w.this.e = null;
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            d.e e = w.e(w.this, d);
            String str3 = w.this.y;
            Log.d(str3, "onAdClosed() with type " + e);
            if (w.this.a(d)) {
                w.this.a(e, fetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onGetApplicationInfoFail(" + str + ")");
            w.a(w.this, str, true, (String) null, (String) null);
            w.c(w.this, "onGetApplicationInfoFail", str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onGetApplicationInfoSuccess(" + str + ")");
            w.a(w.this, str, true, (String) null, (String) null);
            w.c(w.this, "onGetApplicationInfoSuccess", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onGetCachedFilesMapFail(" + str + ")");
            w.a(w.this, str, true, (String) null, (String) null);
            w.c(w.this, "onGetCachedFilesMapFail", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onGetCachedFilesMapSuccess(" + str + ")");
            w.a(w.this, str, true, (String) null, (String) null);
            w.c(w.this, "onGetCachedFilesMapSuccess", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onGetDeviceStatusFail(" + str + ")");
            w.a(w.this, str, true, (String) null, (String) null);
            w.c(w.this, "onGetDeviceStatusFail", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onGetDeviceStatusSuccess(" + str + ")");
            w.a(w.this, str, true, (String) null, (String) null);
            w.c(w.this, "onGetDeviceStatusSuccess", str);
        }

        @JavascriptInterface
        public void onGetUserCreditsFail(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onGetUserCreditsFail(" + str + ")");
            final String d = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (w.this.a(d.e.OfferWall.toString())) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.18
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = d;
                        if (str3 == null) {
                            str3 = "We're sorry, some error occurred. we will investigate it";
                        }
                        w.this.P.onGetOWCreditsFailed(str3);
                    }
                });
            }
            w.a(w.this, str, true, (String) null, (String) null);
            w.c(w.this, "onGetUserCreditsFail", str);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onInitBannerFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String d = fVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(w.this.a, "onInitBannerFail failed with no demand source");
                return;
            }
            com.ironsource.sdk.g.c a2 = w.this.V.a(d.e.Banner, fetchDemandSourceId);
            if (a2 != null) {
                a2.a(3);
            }
            if (w.this.a(d.e.Banner.toString())) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.15
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = d;
                        if (str3 == null) {
                            str3 = "We're sorry, some error occurred. we will investigate it";
                        }
                        String str4 = w.this.a;
                        Log.d(str4, "onBannerInitFail(message:" + str3 + ")");
                        w.this.Q.a(d.e.Banner, fetchDemandSourceId, str3);
                    }
                });
            }
            w.a(w.this, str, true, (String) null, (String) null);
            w.c(w.this, "onInitBannerFail", str);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(w.this.a, "onInitBannerSuccess()");
            w.c(w.this, "onInitBannerSuccess", "true");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(w.this.a, "onInitBannerSuccess failed with no demand source");
            } else if (w.this.a(d.e.Banner.toString())) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.14
                    @Override // java.lang.Runnable
                    public final void run() {
                        Log.d(w.this.a, "onBannerInitSuccess()");
                        w.this.Q.a(d.e.Banner, fetchDemandSourceId, (com.ironsource.sdk.g.a) null);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onInitInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String d = fVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(w.this.a, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            com.ironsource.sdk.g.c a2 = w.this.V.a(d.e.Interstitial, fetchDemandSourceId);
            if (a2 != null) {
                a2.a(3);
            }
            if (w.this.a(d.e.Interstitial.toString())) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = d;
                        if (str3 == null) {
                            str3 = "We're sorry, some error occurred. we will investigate it";
                        }
                        String str4 = w.this.a;
                        Log.d(str4, "onInterstitialInitFail(message:" + str3 + ")");
                        w.this.O.a(d.e.Interstitial, fetchDemandSourceId, str3);
                    }
                });
            }
            w.a(w.this, str, true, (String) null, (String) null);
            w.c(w.this, "onInitInterstitialFail", str);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(w.this.a, "onInitInterstitialSuccess()");
            w.c(w.this, "onInitInterstitialSuccess", "true");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(w.this.a, "onInitInterstitialSuccess failed with no demand source");
            } else if (w.this.a(d.e.Interstitial.toString())) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        Log.d(w.this.a, "onInterstitialInitSuccess()");
                        w.this.O.a(d.e.Interstitial, fetchDemandSourceId, (com.ironsource.sdk.g.a) null);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onInitOfferWallFail(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onInitOfferWallFail(" + str + ")");
            w.this.o.i = false;
            final String d = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (w.this.o.h) {
                w.this.o.h = false;
                if (w.this.a(d.e.OfferWall.toString())) {
                    w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.9
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str3 = d;
                            if (str3 == null) {
                                str3 = "We're sorry, some error occurred. we will investigate it";
                            }
                            String str4 = w.this.a;
                            Log.d(str4, "onOfferWallInitFail(message:" + str3 + ")");
                            w.this.P.onOfferwallInitFail(str3);
                        }
                    });
                }
            }
            w.a(w.this, str, true, (String) null, (String) null);
            w.c(w.this, "onInitOfferWallFail", str);
        }

        @JavascriptInterface
        public void onInitOfferWallSuccess(String str) {
            w.c(w.this, "onInitOfferWallSuccess", "true");
            w.this.o.i = true;
            if (w.this.o.h) {
                w.this.o.h = false;
                if (w.this.a(d.e.OfferWall.toString())) {
                    w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.8
                        @Override // java.lang.Runnable
                        public final void run() {
                            Log.d(w.this.a, "onOfferWallInitSuccess()");
                            w.this.P.onOfferwallInitSuccess();
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onInitRewardedVideoFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String d = fVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            com.ironsource.sdk.g.c a2 = w.this.V.a(d.e.RewardedVideo, fetchDemandSourceId);
            if (a2 != null) {
                a2.a(3);
            }
            if (w.this.a(d.e.RewardedVideo.toString())) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.26
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = d;
                        if (str3 == null) {
                            str3 = "We're sorry, some error occurred. we will investigate it";
                        }
                        String str4 = w.this.a;
                        Log.d(str4, "onRVInitFail(message:" + str3 + ")");
                        w.this.N.a(d.e.RewardedVideo, fetchDemandSourceId, str3);
                    }
                });
            }
            w.a(w.this, str, true, (String) null, (String) null);
            w.c(w.this, "onInitRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(w.this.a, "onLoadBannerFail()");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String d = fVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            w.a(w.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && w.this.a(d.e.Banner.toString())) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.17
                    @Override // java.lang.Runnable
                    public final void run() {
                        Log.d(w.this.a, "onLoadBannerFail()");
                        String str2 = d;
                        if (str2 == null) {
                            str2 = "We're sorry, some error occurred. we will investigate it";
                        }
                        w.this.Q.d(fetchDemandSourceId, str2);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(w.this.a, "onLoadBannerSuccess()");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d = fVar.d("adViewId");
            com.ironsource.sdk.c.e eVar = null;
            w.a(w.this, str, true, (String) null, (String) null);
            com.ironsource.sdk.c.d a2 = com.ironsource.sdk.c.d.a();
            if (!d.isEmpty() && a2.b.containsKey(d)) {
                eVar = a2.b.get(d);
            }
            if (eVar == null) {
                com.ironsource.sdk.j.a.b bVar = w.this.Q;
                bVar.d(fetchDemandSourceId, "not found view for the current adViewId= " + d);
            } else if (eVar instanceof com.ironsource.sdk.c.a) {
                final com.ironsource.sdk.c.a aVar = (com.ironsource.sdk.c.a) eVar;
                if (w.this.a(d.e.Banner.toString())) {
                    w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.16
                        @Override // java.lang.Runnable
                        public final void run() {
                            Log.d(w.this.a, "onBannerLoadSuccess()");
                            w.this.Q.a(fetchDemandSourceId, aVar);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onLoadInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String d = fVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            w.a(w.this, str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            a(fetchDemandSourceId, false);
            if (w.this.a(d.e.Interstitial.toString())) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.11
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = d;
                        if (str3 == null) {
                            str3 = "We're sorry, some error occurred. we will investigate it";
                        }
                        w.this.O.b(fetchDemandSourceId, str3);
                    }
                });
            }
            w.c(w.this, "onLoadInterstitialFail", "true");
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onLoadInterstitialSuccess(" + str + ")");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            a(fetchDemandSourceId, true);
            w.a(w.this, str, true, (String) null, (String) null);
            if (w.this.a(d.e.Interstitial.toString())) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.this.O.c(fetchDemandSourceId);
                    }
                });
            }
            w.c(w.this, "onLoadInterstitialSuccess", "true");
        }

        @JavascriptInterface
        public void onOfferWallGeneric(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onOfferWallGeneric(" + str + ")");
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onShowInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String d = fVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            w.a(w.this, str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            a(fetchDemandSourceId, false);
            if (w.this.a(d.e.Interstitial.toString())) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.13
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = d;
                        if (str3 == null) {
                            str3 = "We're sorry, some error occurred. we will investigate it";
                        }
                        w.this.O.c(fetchDemandSourceId, str3);
                    }
                });
            }
            w.c(w.this, "onShowInterstitialFail", str);
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onShowInterstitialSuccess(" + str + ")");
            w.a(w.this, str, true, (String) null, (String) null);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(w.this.a, "onShowInterstitialSuccess called with no demand");
                return;
            }
            w.this.o.e = d.e.Interstitial.ordinal();
            w.this.o.c = fetchDemandSourceId;
            if (w.this.a(d.e.Interstitial.toString())) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.this.O.c(d.e.Interstitial, fetchDemandSourceId);
                        w.this.O.d(fetchDemandSourceId);
                    }
                });
                w.c(w.this, "onShowInterstitialSuccess", str);
            }
            a(fetchDemandSourceId, false);
        }

        @JavascriptInterface
        public void onShowOfferWallFail(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onShowOfferWallFail(" + str + ")");
            final String d = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (w.this.a(d.e.OfferWall.toString())) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = d;
                        if (str3 == null) {
                            str3 = "We're sorry, some error occurred. we will investigate it";
                        }
                        w.this.P.onOWShowFail(str3);
                    }
                });
            }
            w.a(w.this, str, true, (String) null, (String) null);
            w.c(w.this, "onShowOfferWallFail", str);
        }

        @JavascriptInterface
        public void onShowOfferWallSuccess(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onShowOfferWallSuccess(" + str + ")");
            w.this.o.e = d.e.OfferWall.ordinal();
            final String valueFromJsonObject = SDKUtils.getValueFromJsonObject(str, ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID);
            if (w.this.a(d.e.OfferWall.toString())) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.this.P.onOWShowSuccess(valueFromJsonObject);
                    }
                });
            }
            w.a(w.this, str, true, (String) null, (String) null);
            w.c(w.this, "onShowOfferWallSuccess", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onShowRewardedVideoFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String d = fVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (w.this.a(d.e.RewardedVideo.toString())) {
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.27
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = d;
                        if (str3 == null) {
                            str3 = "We're sorry, some error occurred. we will investigate it";
                        }
                        String str4 = w.this.a;
                        Log.d(str4, "onRVShowFail(message:" + d + ")");
                        w.this.N.a(fetchDemandSourceId, str3);
                    }
                });
            }
            w.a(w.this, str, true, (String) null, (String) null);
            w.c(w.this, "onShowRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onShowRewardedVideoSuccess(" + str + ")");
            w.a(w.this, str, true, (String) null, (String) null);
            w.c(w.this, "onShowRewardedVideoSuccess", str);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            String str2 = w.this.a;
            Log.d(str2, "onVideoStatusChanged(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("productType");
            if (w.this.n == null || TextUtils.isEmpty(d)) {
                return;
            }
            String d2 = fVar.d("status");
            if ("started".equalsIgnoreCase(d2)) {
                w.this.n.onVideoStarted();
            } else if ("paused".equalsIgnoreCase(d2)) {
                w.this.n.onVideoPaused();
            } else if ("playing".equalsIgnoreCase(d2)) {
                w.this.n.onVideoResumed();
            } else if ("ended".equalsIgnoreCase(d2)) {
                w.this.n.onVideoEnded();
            } else if ("stopped".equalsIgnoreCase(d2)) {
                w.this.n.onVideoStopped();
            } else {
                String str3 = w.this.a;
                Logger.i(str3, "onVideoStatusChanged: unknown status: " + d2);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
            if (r5 == 1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
            if (r5 == 2) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
            r0 = new android.content.Intent(r3, com.ironsource.sdk.controller.OpenUrlActivity.class);
            r0.putExtra(com.ironsource.sdk.controller.w.c, r1);
            r0.putExtra(com.ironsource.sdk.controller.w.b, true);
            r0.putExtra(com.ironsource.sdk.controller.w.d, true);
            r3.startActivity(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
            r0 = new android.content.Intent(r3, com.ironsource.sdk.controller.OpenUrlActivity.class);
            r0.putExtra(com.ironsource.sdk.controller.w.c, r1);
            r0.putExtra(com.ironsource.sdk.controller.w.d, true);
            r0.putExtra("immersive", r10.a.U);
            r3.startActivity(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void openUrl(java.lang.String r11) {
            /*
                r10 = this;
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.w.this
                java.lang.String r0 = com.ironsource.sdk.controller.w.b(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "openUrl("
                r1.<init>(r2)
                r1.append(r11)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
                r0.<init>(r11)
                java.lang.String r1 = "url"
                java.lang.String r1 = r0.d(r1)
                java.lang.String r2 = "method"
                java.lang.String r2 = r0.d(r2)
                java.lang.String r3 = "package_name"
                java.lang.String r0 = r0.d(r3)
                com.ironsource.sdk.controller.w r3 = com.ironsource.sdk.controller.w.this
                com.ironsource.sdk.controller.c r3 = r3.w
                android.app.Activity r3 = r3.a()
                r4 = 0
                java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Exception -> Lb9
                r5 = -1
                int r6 = r2.hashCode()     // Catch: java.lang.Exception -> Lb9
                r7 = -1455867212(0xffffffffa9393ab4, float:-4.112917E-14)
                r8 = 2
                r9 = 1
                if (r6 == r7) goto L6b
                r7 = 109770977(0x68af8e1, float:5.2275525E-35)
                if (r6 == r7) goto L61
                r7 = 1224424441(0x48fb3bf9, float:514527.78)
                if (r6 == r7) goto L57
                goto L74
            L57:
                java.lang.String r6 = "webview"
                boolean r2 = r2.equals(r6)     // Catch: java.lang.Exception -> Lb9
                if (r2 == 0) goto L74
                r5 = r9
                goto L74
            L61:
                java.lang.String r6 = "store"
                boolean r2 = r2.equals(r6)     // Catch: java.lang.Exception -> Lb9
                if (r2 == 0) goto L74
                r5 = r8
                goto L74
            L6b:
                java.lang.String r6 = "external_browser"
                boolean r2 = r2.equals(r6)     // Catch: java.lang.Exception -> Lb9
                if (r2 == 0) goto L74
                r5 = r4
            L74:
                if (r5 == 0) goto Lb5
                if (r5 == r9) goto L95
                if (r5 == r8) goto L7b
                goto L94
            L7b:
                android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> Lb9
                java.lang.Class<com.ironsource.sdk.controller.OpenUrlActivity> r2 = com.ironsource.sdk.controller.OpenUrlActivity.class
                r0.<init>(r3, r2)     // Catch: java.lang.Exception -> Lb9
                java.lang.String r2 = com.ironsource.sdk.controller.w.c     // Catch: java.lang.Exception -> Lb9
                r0.putExtra(r2, r1)     // Catch: java.lang.Exception -> Lb9
                java.lang.String r1 = com.ironsource.sdk.controller.w.b     // Catch: java.lang.Exception -> Lb9
                r0.putExtra(r1, r9)     // Catch: java.lang.Exception -> Lb9
                java.lang.String r1 = com.ironsource.sdk.controller.w.d     // Catch: java.lang.Exception -> Lb9
                r0.putExtra(r1, r9)     // Catch: java.lang.Exception -> Lb9
                r3.startActivity(r0)     // Catch: java.lang.Exception -> Lb9
            L94:
                return
            L95:
                android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> Lb9
                java.lang.Class<com.ironsource.sdk.controller.OpenUrlActivity> r2 = com.ironsource.sdk.controller.OpenUrlActivity.class
                r0.<init>(r3, r2)     // Catch: java.lang.Exception -> Lb9
                java.lang.String r2 = com.ironsource.sdk.controller.w.c     // Catch: java.lang.Exception -> Lb9
                r0.putExtra(r2, r1)     // Catch: java.lang.Exception -> Lb9
                java.lang.String r1 = com.ironsource.sdk.controller.w.d     // Catch: java.lang.Exception -> Lb9
                r0.putExtra(r1, r9)     // Catch: java.lang.Exception -> Lb9
                java.lang.String r1 = "immersive"
                com.ironsource.sdk.controller.w r2 = com.ironsource.sdk.controller.w.this     // Catch: java.lang.Exception -> Lb9
                boolean r2 = com.ironsource.sdk.controller.w.v(r2)     // Catch: java.lang.Exception -> Lb9
                r0.putExtra(r1, r2)     // Catch: java.lang.Exception -> Lb9
                r3.startActivity(r0)     // Catch: java.lang.Exception -> Lb9
                goto Lc7
            Lb5:
                com.ironsource.environment.a.AnonymousClass1.a(r3, r1, r0)     // Catch: java.lang.Exception -> Lb9
                goto Lc7
            Lb9:
                r0 = move-exception
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.w.this
                java.lang.String r2 = r0.getMessage()
                r3 = 0
                com.ironsource.sdk.controller.w.a(r1, r11, r4, r2, r3)
                r0.printStackTrace()
            Lc7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.w.d.openUrl(java.lang.String):void");
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.12
                @Override // java.lang.Runnable
                public final void run() {
                    w.this.i();
                }
            });
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            com.ironsource.sdk.g.f fVar;
            String str2;
            try {
                String str3 = w.this.a;
                Logger.i(str3, "permissionsAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar2 = new com.ironsource.sdk.g.f(str);
                r rVar = w.this.q;
                String fVar3 = fVar2.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar3);
                r.a aVar2 = new r.a((byte) 0);
                aVar2.a = jSONObject.optString("functionName");
                aVar2.b = jSONObject.optJSONObject("functionParams");
                aVar2.c = jSONObject.optString("success");
                aVar2.d = jSONObject.optString("fail");
                if ("getPermissions".equals(aVar2.a)) {
                    JSONObject jSONObject2 = aVar2.b;
                    fVar = new com.ironsource.sdk.g.f();
                    try {
                        fVar.a("permissions", com.ironsource.environment.c.a(rVar.a, jSONObject2.getJSONArray("permissions")));
                        aVar.a(true, aVar2.c, fVar);
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        String str4 = r.b;
                        Logger.i(str4, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e.getMessage());
                        fVar.a("errMsg", e.getMessage());
                        str2 = aVar2.d;
                        aVar.a(false, str2, fVar);
                        return;
                    }
                } else if (!"isPermissionGranted".equals(aVar2.a)) {
                    String str5 = r.b;
                    Logger.i(str5, "PermissionsJSAdapter unhandled API request " + fVar3);
                    return;
                } else {
                    JSONObject jSONObject3 = aVar2.b;
                    fVar = new com.ironsource.sdk.g.f();
                    try {
                        String string = jSONObject3.getString("permission");
                        fVar.a("permission", string);
                        if (com.ironsource.environment.c.a(rVar.a, string)) {
                            fVar.a("status", String.valueOf(com.ironsource.environment.c.b(rVar.a, string)));
                            aVar.a(true, aVar2.c, fVar);
                            return;
                        }
                        fVar.a("status", "unhandledPermission");
                        aVar.a(false, aVar2.d, fVar);
                        return;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        fVar.a("errMsg", e2.getMessage());
                        str2 = aVar2.d;
                        aVar.a(false, str2, fVar);
                        return;
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                String str6 = w.this.a;
                Logger.i(str6, "permissionsAPI failed with exception " + e3.getMessage());
            }
            e3.printStackTrace();
            String str62 = w.this.a;
            Logger.i(str62, "permissionsAPI failed with exception " + e3.getMessage());
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            try {
                String str2 = w.this.a;
                Logger.i(str2, "postAdEventNotification(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                final String d = fVar.d("eventName");
                if (TextUtils.isEmpty(d)) {
                    w.a(w.this, str, false, "eventName does not exist", (String) null);
                    return;
                }
                String d2 = fVar.d("dsName");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                String str3 = !TextUtils.isEmpty(fetchDemandSourceId) ? fetchDemandSourceId : d2;
                final JSONObject jSONObject = (JSONObject) fVar.c("extData");
                String d3 = fVar.d("productType");
                final d.e e = w.e(w.this, d3);
                if (!w.this.a(d3)) {
                    w.a(w.this, str, false, "productType does not exist", (String) null);
                    return;
                }
                String b = w.b(w.this, str);
                if (!TextUtils.isEmpty(b)) {
                    w.this.b(w.a(w.this, b, w.a(w.this, "productType", d3, "eventName", d, "demandSourceName", d2, "demandSourceId", str3, null, false), "postAdEventNotificationSuccess", "postAdEventNotificationFail"));
                }
                final String str4 = str3;
                w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.19
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (e != d.e.Interstitial && e != d.e.RewardedVideo && e != d.e.Banner) {
                            if (e == d.e.OfferWall) {
                                w.this.P.onOfferwallEventNotificationReceived(d, jSONObject);
                                return;
                            }
                            return;
                        }
                        com.ironsource.sdk.j.a.a b2 = w.this.b(e);
                        if (b2 != null) {
                            b2.a(e, str4, d, jSONObject);
                        }
                    }
                });
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "removeCloseEventHandler(" + str + ")");
            if (w.this.H != null) {
                w.this.H.cancel();
            }
            w.this.G = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.21
                @Override // java.lang.Runnable
                public final void run() {
                    w.this.removeJavascriptInterface("GenerateTokenForMessaging");
                }
            });
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.1
                @Override // java.lang.Runnable
                public final void run() {
                    w.this.j();
                }
            });
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                String str2 = w.this.a;
                Logger.i(str2, "saveFile(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d = fVar.d("path");
                String d2 = fVar.d("file");
                if (TextUtils.isEmpty(d2)) {
                    w.a(w.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(w.this.l, d), SDKUtils.getFileName(d2));
                if (com.ironsource.environment.h.a(w.this.l) <= 0) {
                    w.a(w.this, str, false, "no_disk_space", (String) null);
                } else if (!SDKUtils.isExternalStorageAvailable()) {
                    w.a(w.this, str, false, "sotrage_unavailable", (String) null);
                } else if (cVar.exists()) {
                    w.a(w.this, str, false, "file_already_exist", (String) null);
                } else if (!a.AnonymousClass1.b(w.this.getContext())) {
                    w.a(w.this, str, false, "no_network_connection", (String) null);
                } else {
                    w.a(w.this, str, true, (String) null, (String) null);
                    com.ironsource.sdk.k.b bVar = w.this.E;
                    bVar.a(cVar, d2, bVar.a);
                }
            } catch (Exception e) {
                w.a(w.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "setBackButtonState(" + str + ")");
            String d = new com.ironsource.sdk.g.f(str).d("state");
            SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().a.edit();
            edit.putString("back_button_state", d);
            edit.apply();
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "setForceClose(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
            String d2 = fVar.d(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
            w.this.I = Integer.parseInt(d);
            w.this.J = Integer.parseInt(d2);
            w.this.K = fVar.d("position");
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "setMixedContentAlwaysAllow(" + str + ")");
            w.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.d.22
                @Override // java.lang.Runnable
                public final void run() {
                    if (Build.VERSION.SDK_INT >= 21) {
                        w.this.getSettings().setMixedContentMode(0);
                    }
                }
            });
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "setOrientation(" + str + ")");
            String d = new com.ironsource.sdk.g.f(str).d(AdUnitActivity.EXTRA_ORIENTATION);
            w.this.k = d;
            if (w.this.x != null) {
                w.this.x.onOrientationChanged(d, com.ironsource.environment.h.l(w.this.getContext()));
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "setStoreSearchKeys(" + str + ")");
            SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().a.edit();
            edit.putString("search_keys", str);
            edit.apply();
        }

        @JavascriptInterface
        public void setUserData(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "setUserData(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            if (!fVar.a(SDKConstants.PARAM_KEY)) {
                w.a(w.this, str, false, "key does not exist", (String) null);
            } else if (!fVar.a("value")) {
                w.a(w.this, str, false, "value does not exist", (String) null);
            } else {
                String d = fVar.d(SDKConstants.PARAM_KEY);
                String d2 = fVar.d("value");
                SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().a.edit();
                edit.putString(d, d2);
                if (!edit.commit()) {
                    w.a(w.this, str, false, "SetUserData failed writing to shared preferences", (String) null);
                    return;
                }
                w.this.b(w.a(w.this, w.b(w.this, str), w.a(w.this, d, d2, null, null, null, null, null, null, null, false)));
            }
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            String str2 = w.this.a;
            Logger.i(str2, "setWebviewBackgroundColor(" + str + ")");
            w.g(w.this, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface e {
        void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class f {
        String a;
        String b;

        f() {
        }
    }

    /* loaded from: classes2.dex */
    public enum g {
        Display,
        Gone
    }

    /* loaded from: classes2.dex */
    class h implements View.OnTouchListener {
        private h() {
        }

        /* synthetic */ h(w wVar, byte b) {
            this();
        }

        /* JADX WARN: Type inference failed for: r9v6, types: [com.ironsource.sdk.controller.w$h$1] */
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                String str = w.this.a;
                StringBuilder sb = new StringBuilder("X:");
                int i = (int) x;
                sb.append(i);
                sb.append(" Y:");
                int i2 = (int) y;
                sb.append(i2);
                Logger.i(str, sb.toString());
                int m = com.ironsource.environment.h.m();
                int n = com.ironsource.environment.h.n();
                Logger.i(w.this.a, "Width:" + m + " Height:" + n);
                int dpToPx = SDKUtils.dpToPx((long) w.this.I);
                int dpToPx2 = SDKUtils.dpToPx((long) w.this.J);
                if ("top-right".equalsIgnoreCase(w.this.K)) {
                    i = m - i;
                } else if (!"top-left".equalsIgnoreCase(w.this.K)) {
                    if ("bottom-right".equalsIgnoreCase(w.this.K)) {
                        i = m - i;
                    } else if (!"bottom-left".equalsIgnoreCase(w.this.K)) {
                        i = 0;
                        i2 = 0;
                    }
                    i2 = n - i2;
                }
                if (i <= dpToPx && i2 <= dpToPx2) {
                    w.this.G = false;
                    if (w.this.H != null) {
                        w.this.H.cancel();
                    }
                    w.this.H = new CountDownTimer(AdLoader.RETRY_DELAY, 500L) { // from class: com.ironsource.sdk.controller.w.h.1
                        {
                            super(AdLoader.RETRY_DELAY, 500L);
                        }

                        @Override // android.os.CountDownTimer
                        public final void onFinish() {
                            Logger.i(w.this.a, "Close Event Timer Finish");
                            if (w.this.G) {
                                w.this.G = false;
                            } else {
                                w.this.e("forceClose");
                            }
                        }

                        @Override // android.os.CountDownTimer
                        public final void onTick(long j) {
                            String str2 = w.this.a;
                            Logger.i(str2, "Close Event Timer Tick " + j);
                        }
                    }.start();
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    class i extends WebViewClient {
        private i() {
        }

        /* synthetic */ i(w wVar, byte b) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (str.contains(IronSourceConstants.EVENTS_AD_UNIT) || str.contains("index.html")) {
                w.this.b(w.g("pageFinished"));
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains("mobileController.html") && w.this.W != null) {
                com.ironsource.sdk.controller.e eVar = w.this.W;
                eVar.a("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i + ")");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str = w.this.a;
            Log.e(str, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str2 = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            if (w.this.W != null) {
                w.this.W.b(str2);
            }
            w wVar = w.this;
            if (wVar.e != null) {
                wVar.h();
                d.e eVar = wVar.e.a;
                String str3 = wVar.e.b;
                if (wVar.a(eVar.toString())) {
                    wVar.a(eVar, str3);
                    return true;
                }
                return true;
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z;
            Logger.i("shouldInterceptRequest", str);
            try {
                z = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException unused) {
                z = false;
            }
            if (z) {
                String str2 = "file://" + w.this.l + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(str2));
                } catch (FileNotFoundException unused2) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (w.this.f(str)) {
                    w.this.b();
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public w(Context context, j jVar, com.ironsource.sdk.controller.c cVar, com.ironsource.sdk.controller.e eVar) {
        super(context);
        this.a = w.class.getSimpleName();
        this.y = IronSourceConstants.IRONSOURCE_CONFIG_NAME;
        this.A = "We're sorry, some error occurred. we will investigate it";
        this.I = 50;
        this.J = 50;
        this.K = "top-right";
        this.R = null;
        this.S = new Object();
        this.U = false;
        Logger.i(this.a, "C'tor");
        this.w = cVar;
        this.W = eVar;
        this.l = IronSourceStorageUtils.getNetworkStorageDir(context);
        this.V = jVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.i = new FrameLayout(context);
        this.L = new FrameLayout(context);
        this.L.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.L.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this);
        this.i.addView(this.L, layoutParams);
        this.i.addView(frameLayout);
        this.o = new com.ironsource.sdk.g.b();
        com.ironsource.sdk.k.b a2 = com.ironsource.sdk.k.b.a(this.l);
        this.E = a2;
        a2.a.a = this;
        this.m = new com.ironsource.sdk.controller.f(SDKUtils.getNetworkConfiguration(), this.l, SDKUtils.getControllerUrl(), this.E);
        this.g = new a(this, (byte) 0);
        setWebViewClient(new i(this, (byte) 0));
        setWebChromeClient(this.g);
        com.ironsource.sdk.utils.d.a(this);
        WebSettings settings = getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath("/data/data/org.itri.html5webview/databases/");
        settings.setDomStorageEnabled(true);
        try {
            if (Build.VERSION.SDK_INT > 11) {
                settings.setDisplayZoomControls(false);
            }
            if (Build.VERSION.SDK_INT >= 17) {
                settings.setMediaPlaybackRequiresUserGesture(false);
            }
        } catch (Throwable th) {
            String str = this.a;
            Logger.e(str, "setWebSettings - " + th.toString());
        }
        t tVar = new t(UUID.randomUUID().toString());
        addJavascriptInterface(new com.ironsource.sdk.controller.h(new com.ironsource.sdk.controller.d(new d()), tVar), "Android");
        addJavascriptInterface(new s(tVar), "GenerateTokenForMessaging");
        setDownloadListener(this);
        setOnTouchListener(new h(this, (byte) 0));
        this.T = new Handler(Looper.getMainLooper());
        this.aa = new com.ironsource.sdk.service.Connectivity.b(SDKUtils.getControllerConfigAsJSONObject(), context) { // from class: com.ironsource.sdk.controller.w.1
            @Override // com.ironsource.sdk.service.Connectivity.b, com.ironsource.sdk.service.Connectivity.d
            public final void a() {
                if (w.this.F) {
                    w.this.d(IntegrityManager.INTEGRITY_TYPE_NONE);
                }
            }

            @Override // com.ironsource.sdk.service.Connectivity.b, com.ironsource.sdk.service.Connectivity.d
            public final void a(String str2) {
                if (w.this.F) {
                    w.this.d(str2);
                }
            }

            @Override // com.ironsource.sdk.service.Connectivity.b, com.ironsource.sdk.service.Connectivity.d
            public final void a(String str2, JSONObject jSONObject) {
                if (jSONObject == null || !w.this.F) {
                    return;
                }
                try {
                    jSONObject.put("connectionType", str2);
                    w wVar = w.this;
                    String str3 = wVar.a;
                    Logger.i(str3, "device connection info changed: " + jSONObject.toString());
                    wVar.b(w.b("connectionInfoChanged", w.a("connectionInfo", jSONObject.toString(), null, null, null, null, null, null, null, false)));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        };
        a(context);
        z = FeaturesManager.getInstance().getDebugMode();
    }

    static /* synthetic */ WebView G(w wVar) {
        return wVar;
    }

    public static int a() {
        return z;
    }

    static /* synthetic */ String a(w wVar, String str, String str2) {
        return b(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String a(w wVar, String str, String str2, String str3, String str4) {
        return a(str, str2, str3, str4);
    }

    static /* synthetic */ String a(w wVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2) {
        return a(str, str2, str3, str4, str5, str6, str7, str8, null, false);
    }

    private String a(d.e eVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.toString(jSONObject.optInt(IronSourceConstants.KEY_SESSION_DEPTH)));
        String optString = jSONObject.optString("demandSourceName");
        String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        com.ironsource.sdk.g.c a2 = this.V.a(eVar, fetchDemandSourceId);
        if (a2 != null) {
            if (a2.d != null) {
                hashMap.putAll(a2.d);
            }
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                hashMap.put("demandSourceId", fetchDemandSourceId);
            }
        }
        Map<String, String> a3 = a(eVar);
        if (a3 != null) {
            hashMap.putAll(a3);
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        a.C0092a a4 = a.C0092a.a(eVar);
        return a(a4.a, flatMapToJsonAsString, a4.b, a4.c);
    }

    private static String a(String str, String str2, String str3, String str4) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "','" + str3 + "','" + str4 + "');";
    }

    public static String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    private Map<String, String> a(d.e eVar) {
        if (eVar == d.e.OfferWall) {
            return this.D;
        }
        return null;
    }

    static /* synthetic */ void a(w wVar, final String str, final d.e eVar, final com.ironsource.sdk.g.c cVar) {
        if (wVar.a(eVar.toString())) {
            wVar.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.15
                @Override // java.lang.Runnable
                public final void run() {
                    if (d.e.RewardedVideo != eVar && d.e.Interstitial != eVar && d.e.Banner != eVar) {
                        if (d.e.OfferWall == eVar) {
                            w.this.P.onOfferwallInitFail(str);
                            return;
                        } else if (d.e.OfferWallCredits == eVar) {
                            w.this.P.onGetOWCreditsFailed(str);
                            return;
                        } else {
                            return;
                        }
                    }
                    com.ironsource.sdk.g.c cVar2 = cVar;
                    if (cVar2 == null || TextUtils.isEmpty(cVar2.b)) {
                        return;
                    }
                    com.ironsource.sdk.j.a.a b2 = w.this.b(eVar);
                    String str2 = w.this.a;
                    Log.d(str2, "onAdProductInitFailed (message:" + str + ")(" + eVar + ")");
                    if (b2 != null) {
                        b2.a(eVar, cVar.b, str);
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(com.ironsource.sdk.controller.w r3, java.lang.String r4, boolean r5, java.lang.String r6, java.lang.String r7) {
        /*
            com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
            r0.<init>(r4)
            java.lang.String r1 = com.ironsource.sdk.controller.w.ab
            java.lang.String r1 = r0.d(r1)
            java.lang.String r2 = com.ironsource.sdk.controller.w.ac
            java.lang.String r0 = r0.d(r2)
            if (r5 == 0) goto L1a
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L22
            goto L23
        L1a:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L22
            r1 = r0
            goto L23
        L22:
            r1 = 0
        L23:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L5a
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L3e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3e
            r5.<init>(r4)     // Catch: org.json.JSONException -> L3e
            java.lang.String r0 = "errMsg"
            org.json.JSONObject r5 = r5.put(r0, r6)     // Catch: org.json.JSONException -> L3e
            java.lang.String r4 = r5.toString()     // Catch: org.json.JSONException -> L3e
        L3e:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L53
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L53
            r5.<init>(r4)     // Catch: org.json.JSONException -> L53
            java.lang.String r6 = "errCode"
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch: org.json.JSONException -> L53
            java.lang.String r4 = r5.toString()     // Catch: org.json.JSONException -> L53
        L53:
            java.lang.String r4 = b(r1, r4)
            r3.b(r4)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.w.a(com.ironsource.sdk.controller.w, java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }

    private void a(String str, String str2, d.e eVar, com.ironsource.sdk.g.c cVar, e eVar2) {
        String str3;
        String a2;
        String str4;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            eVar2.a("User id or Application key are missing", eVar, cVar);
            return;
        }
        f fVar = new f();
        if (eVar != d.e.RewardedVideo && eVar != d.e.Interstitial && eVar != d.e.OfferWall && eVar != d.e.Banner) {
            if (eVar == d.e.OfferWallCredits) {
                str4 = "getUserCredits";
                a2 = a("getUserCredits", a("productType", "OfferWall", "applicationKey", this.B, "applicationUserId", this.C, null, null, null, false), "null", "onGetUserCreditsFail");
            }
            b(fVar.b);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("applicationKey", this.B);
        hashMap.put("applicationUserId", this.C);
        if (cVar != null) {
            if (cVar.d != null) {
                hashMap.putAll(cVar.d);
                com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.a;
                hashMap.put("loadStartTime", String.valueOf(com.ironsource.sdk.service.a.a(cVar.b)));
            }
            hashMap.put("demandSourceName", cVar.a);
            hashMap.put("demandSourceId", cVar.b);
        }
        Map<String, String> a3 = a(eVar);
        if (a3 != null) {
            hashMap.putAll(a3);
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        a.C0092a c0092a = new a.C0092a();
        if (eVar == d.e.RewardedVideo) {
            c0092a.a = "initRewardedVideo";
            c0092a.b = "onInitRewardedVideoSuccess";
            str3 = "onInitRewardedVideoFail";
        } else if (eVar == d.e.Interstitial) {
            c0092a.a = "initInterstitial";
            c0092a.b = "onInitInterstitialSuccess";
            str3 = "onInitInterstitialFail";
        } else if (eVar == d.e.OfferWall) {
            c0092a.a = "initOfferWall";
            c0092a.b = "onInitOfferWallSuccess";
            str3 = "onInitOfferWallFail";
        } else {
            if (eVar == d.e.Banner) {
                c0092a.a = "initBanner";
                c0092a.b = "onInitBannerSuccess";
                str3 = "onInitBannerFail";
            }
            a2 = a(c0092a.a, flatMapToJsonAsString, c0092a.b, c0092a.c);
            str4 = c0092a.a;
        }
        c0092a.c = str3;
        a2 = a(c0092a.a, flatMapToJsonAsString, c0092a.b, c0092a.c);
        str4 = c0092a.a;
        fVar.a = str4;
        fVar.b = a2;
        b(fVar.b);
    }

    private void a(String str, String str2, String str3) {
        try {
            b(b("assetCachedFailed", a("file", str, "path", i(str2), "errMsg", str3, null, null, null, false)));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.ironsource.sdk.j.a.a b(d.e eVar) {
        if (eVar == d.e.Interstitial) {
            return this.O;
        }
        if (eVar == d.e.RewardedVideo) {
            return this.N;
        }
        if (eVar == d.e.Banner) {
            return this.Q;
        }
        return null;
    }

    static /* synthetic */ String b(w wVar, String str) {
        return new com.ironsource.sdk.g.f(str).d(ab);
    }

    public static String b(String str, String str2) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "');";
    }

    private void b(JSONObject jSONObject) {
        if (jSONObject.optBoolean("inspectWebview")) {
            m();
        }
    }

    static /* synthetic */ boolean b(w wVar, boolean z2) {
        wVar.F = true;
        return true;
    }

    static /* synthetic */ String c(w wVar, String str) {
        return new com.ironsource.sdk.g.f(str).d(ac);
    }

    private String c(JSONObject jSONObject) {
        com.ironsource.sdk.utils.a a2 = com.ironsource.sdk.utils.a.a(getContext());
        StringBuilder sb = new StringBuilder();
        String a3 = com.ironsource.sdk.utils.a.a();
        if (!TextUtils.isEmpty(a3)) {
            sb.append("SDKVersion=");
            sb.append(a3);
            sb.append("&");
        }
        String str = a2.c;
        if (!TextUtils.isEmpty(str)) {
            sb.append("deviceOs=");
            sb.append(str);
        }
        Uri parse = Uri.parse(SDKUtils.getControllerUrl());
        if (parse != null) {
            String str2 = parse.getScheme() + CertificateUtil.DELIMITER;
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + CertificateUtil.DELIMITER + port;
            }
            sb.append("&protocol");
            sb.append("=");
            sb.append(str2);
            sb.append("&domain");
            sb.append("=");
            sb.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String jSONObject2 = new JSONObject(jSONObject, new String[]{"isSecured", "applicationKey"}).toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        sb.append("&controllerConfig");
                        sb.append("=");
                        sb.append(jSONObject2);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            sb.append("&debug");
            sb.append("=");
            sb.append(z);
        }
        return sb.toString();
    }

    static /* synthetic */ void c(w wVar, final String str, String str2) {
        final String d2 = new com.ironsource.sdk.g.f(str2).d("errMsg");
        if (TextUtils.isEmpty(d2)) {
            return;
        }
        wVar.a(new Runnable() { // from class: com.ironsource.sdk.controller.w.6
            @Override // java.lang.Runnable
            public final void run() {
                if (w.a() == d.EnumC0093d.MODE_3.d) {
                    Activity a2 = w.this.w.a();
                    Toast.makeText(a2, str + " : " + d2, 1).show();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] c(Context context) {
        boolean z2;
        com.ironsource.sdk.utils.a a2 = com.ironsource.sdk.utils.a.a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appOrientation", IntegrityManager.INTEGRITY_TYPE_NONE);
            jSONObject.put("deviceOrientation", SDKUtils.translateDeviceOrientation(com.ironsource.environment.h.p(context)));
            String str = a2.a;
            if (str != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(str));
            }
            String str2 = a2.b;
            if (str2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(str2));
                z2 = false;
            } else {
                z2 = true;
            }
            try {
                SDKUtils.loadGoogleAdvertiserInfo(context);
                String advertiserId = SDKUtils.getAdvertiserId();
                Boolean valueOf = Boolean.valueOf(SDKUtils.isLimitAdTrackingEnabled());
                if (!TextUtils.isEmpty(advertiserId)) {
                    Logger.i(this.a, "add AID and LAT");
                    jSONObject.put("isLimitAdTrackingEnabled", valueOf);
                    jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
                }
                String str3 = a2.c;
                if (str3 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(str3));
                } else {
                    z2 = true;
                }
                String str4 = a2.d;
                if (str4 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), str4.replaceAll("[^0-9/.]", ""));
                } else {
                    z2 = true;
                }
                String str5 = a2.d;
                if (str5 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(str5));
                }
                String valueOf2 = String.valueOf(a2.e);
                if (valueOf2 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), valueOf2);
                } else {
                    z2 = true;
                }
                jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(com.ironsource.sdk.utils.a.a()));
                if (a2.f != null && a2.f.length() > 0) {
                    jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(a2.f));
                }
                String a3 = com.ironsource.c.a.a(context);
                if (a3.equals(IntegrityManager.INTEGRITY_TYPE_NONE)) {
                    z2 = true;
                } else {
                    jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(a3));
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    jSONObject.put(SDKUtils.encodeString("hasVPN"), com.ironsource.c.a.c(context));
                }
                String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase()));
                }
                if (SDKUtils.isExternalStorageAvailable()) {
                    jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.a(this.l))));
                } else {
                    z2 = true;
                }
                String valueOf3 = String.valueOf(com.ironsource.environment.h.m());
                if (TextUtils.isEmpty(valueOf3)) {
                    z2 = true;
                } else {
                    jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) + "]", SDKUtils.encodeString(valueOf3));
                }
                jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) + "]", SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.n())));
                String packageName = getContext().getPackageName();
                if (!TextUtils.isEmpty(packageName)) {
                    jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(packageName));
                }
                String valueOf4 = String.valueOf(com.ironsource.environment.h.o());
                if (!TextUtils.isEmpty(valueOf4)) {
                    jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(valueOf4));
                }
                String valueOf5 = String.valueOf(com.ironsource.environment.h.j());
                if (!TextUtils.isEmpty(valueOf5)) {
                    jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(valueOf5));
                }
                com.ironsource.sdk.utils.a.a(context);
                jSONObject.put(SDKUtils.encodeString("deviceVolume"), com.ironsource.sdk.utils.a.b(context));
                jSONObject.put(SDKUtils.encodeString("batteryLevel"), com.ironsource.environment.h.w(context));
                jSONObject.put(SDKUtils.encodeString("mcc"), a.AnonymousClass1.c(context));
                jSONObject.put(SDKUtils.encodeString("mnc"), a.AnonymousClass1.d(context));
                jSONObject.put(SDKUtils.encodeString("phoneType"), a.AnonymousClass1.f(context));
                jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(a.AnonymousClass1.e(context)));
                jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), com.ironsource.environment.c.b(context));
                jSONObject.put(SDKUtils.encodeString("firstInstallTime"), com.ironsource.environment.c.a(context));
                jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(com.ironsource.environment.c.c(context)));
                String d2 = com.ironsource.environment.c.d(context);
                if (!TextUtils.isEmpty(d2)) {
                    jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(d2));
                }
                jSONObject.put(SDKUtils.encodeString("gpi"), com.ironsource.sdk.service.d.a(getContext()));
                jSONObject.put(SDKUtils.encodeString("screenBrightness"), com.ironsource.environment.h.A(context));
            } catch (JSONException e2) {
                e = e2;
                e.printStackTrace();
                return new Object[]{jSONObject.toString(), Boolean.valueOf(z2)};
            }
        } catch (JSONException e3) {
            e = e3;
            z2 = false;
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z2)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] c(String str, String str2) {
        boolean z2;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = null;
        if (TextUtils.isEmpty(str)) {
            z2 = true;
        } else {
            d.e h2 = h(str);
            if (h2 == d.e.OfferWall) {
                map = this.D;
            } else {
                com.ironsource.sdk.g.c a2 = this.V.a(h2, str2);
                if (a2 != null) {
                    Map<String, String> map2 = a2.d;
                    map2.put("demandSourceName", a2.a);
                    map2.put("demandSourceId", a2.b);
                    map = map2;
                }
            }
            try {
                jSONObject.put("productType", str);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            z2 = false;
        }
        if (TextUtils.isEmpty(this.C)) {
            z2 = true;
        } else {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationUserId"), SDKUtils.encodeString(this.C));
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        if (TextUtils.isEmpty(this.B)) {
            z2 = true;
        } else {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationKey"), SDKUtils.encodeString(this.B));
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    if (entry.getValue().equalsIgnoreCase(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                        getSettings().setCacheMode(2);
                    } else {
                        getSettings().setCacheMode(-1);
                    }
                }
                try {
                    jSONObject.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z2)};
    }

    static /* synthetic */ d.e e(w wVar, String str) {
        return h(str);
    }

    static String g(String str) {
        return "SSA_CORE.SDKController.runFunction('" + str + "');";
    }

    static /* synthetic */ void g(w wVar, String str) {
        com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
        String d2 = fVar.d("color");
        String d3 = fVar.d("adViewId");
        int parseColor = !"transparent".equalsIgnoreCase(d2) ? Color.parseColor(d2) : 0;
        if (d3 == null) {
            wVar.setBackgroundColor(parseColor);
            return;
        }
        WebView a2 = com.ironsource.sdk.c.d.a().a(d3);
        if (a2 != null) {
            a2.setBackgroundColor(parseColor);
        }
    }

    private static d.e h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(d.e.Interstitial.toString())) {
            return d.e.Interstitial;
        }
        if (str.equalsIgnoreCase(d.e.RewardedVideo.toString())) {
            return d.e.RewardedVideo;
        }
        if (str.equalsIgnoreCase(d.e.OfferWall.toString())) {
            return d.e.OfferWall;
        }
        if (str.equalsIgnoreCase(d.e.Banner.toString())) {
            return d.e.Banner;
        }
        return null;
    }

    private String i(String str) {
        String str2 = this.l + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    private static void m() {
        if (Build.VERSION.SDK_INT >= 19) {
            setWebContentsDebuggingEnabled(true);
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [com.ironsource.sdk.controller.w$9] */
    public final void a(int i2) {
        String str;
        String str2;
        try {
            loadUrl("about:blank");
        } catch (Throwable th) {
            Logger.e(this.a, "WebViewController:: load: " + th.toString());
        }
        String str3 = "file://" + this.l + File.separator + "mobileController.html";
        if (new File(this.l + File.separator + "mobileController.html").exists()) {
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            b(controllerConfigAsJSONObject);
            String c2 = c(controllerConfigAsJSONObject);
            Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
            if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
                c2 = String.format("%s&sessionid=%s", c2, initSDKParams.get("sessionid"));
            }
            String str4 = str3 + "?" + c2;
            this.f = new CountDownTimer(50000L, 1000L, i2) { // from class: com.ironsource.sdk.controller.w.9
                private /* synthetic */ int a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(50000L, 1000L);
                    this.a = i2;
                }

                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    Logger.i(w.this.a, "Loading Controller Timer Finish");
                    int i3 = this.a;
                    if (i3 == 3) {
                        w.this.W.a("controller html - failed to load into web-view");
                    } else {
                        w.this.a(i3 + 1);
                    }
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j) {
                    String str5 = w.this.a;
                    Logger.i(str5, "Loading Controller Timer Tick " + j);
                }
            }.start();
            try {
                loadUrl(str4);
            } catch (Throwable th2) {
                Logger.e(this.a, "WebViewController:: load: " + th2.toString());
            }
            str = this.a;
            str2 = "load(): " + str4;
        } else {
            str = this.a;
            str2 = "load(): Mobile Controller HTML Does not exist";
        }
        Logger.i(str, str2);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Context context) {
        com.ironsource.sdk.service.Connectivity.b bVar = this.aa;
        if (bVar == null) {
            return;
        }
        bVar.a(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.ironsource.sdk.g.b r11) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.w.a(com.ironsource.sdk.g.b):void");
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.b bVar) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()});
        if (map != null) {
            b(a("loadBanner", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadBannerSuccess", "onLoadBannerFail"));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()});
        this.o.a(cVar.b, true);
        b(a("loadInterstitial", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    final void a(final d.e eVar, final String str) {
        a(new Runnable() { // from class: com.ironsource.sdk.controller.w.7
            @Override // java.lang.Runnable
            public final void run() {
                if (eVar != d.e.RewardedVideo && eVar != d.e.Interstitial) {
                    if (eVar == d.e.OfferWall) {
                        w.this.P.onOWAdClosed();
                        return;
                    }
                    return;
                }
                com.ironsource.sdk.j.a.a b2 = w.this.b(eVar);
                if (b2 != null) {
                    b2.a(eVar, str);
                }
            }
        });
    }

    @Override // com.ironsource.sdk.k.c
    public final void a(com.ironsource.sdk.h.c cVar) {
        if (!cVar.getName().contains("mobileController.html")) {
            String name = cVar.getName();
            String parent = cVar.getParent();
            try {
                b(b("assetCached", a("file", name, "path", i(parent), null, null, null, null, null, false)));
                return;
            } catch (Exception e2) {
                a(name, parent, e2.getMessage());
                return;
            }
        }
        com.ironsource.sdk.controller.f fVar = this.m;
        Runnable runnable = new Runnable() { // from class: com.ironsource.sdk.controller.w.3
            @Override // java.lang.Runnable
            public final void run() {
                w.this.a(1);
            }
        };
        if (fVar.a()) {
            return;
        }
        if (fVar.c == f.a.b) {
            fVar.c();
        }
        fVar.d = f.b.CONTROLLER_FROM_SERVER;
        fVar.a(fVar.d);
        runnable.run();
    }

    @Override // com.ironsource.sdk.k.c
    public final void a(com.ironsource.sdk.h.c cVar, final com.ironsource.sdk.g.e eVar) {
        if (!cVar.getName().contains("mobileController.html")) {
            a(cVar.getName(), cVar.getParent(), eVar.a);
            return;
        }
        com.ironsource.sdk.controller.f fVar = this.m;
        Runnable runnable = new Runnable() { // from class: com.ironsource.sdk.controller.w.4
            @Override // java.lang.Runnable
            public final void run() {
                w.this.a(1);
            }
        };
        Runnable runnable2 = new Runnable() { // from class: com.ironsource.sdk.controller.w.5
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.sdk.controller.e eVar2 = w.this.W;
                eVar2.a("controller html - failed to download - " + eVar.a);
            }
        };
        if (fVar.a()) {
            return;
        }
        if (fVar.c == f.a.b && fVar.d()) {
            fVar.d = f.b.FALLBACK_CONTROLLER_RECOVERY;
            fVar.a(fVar.d);
            runnable.run();
            return;
        }
        com.ironsource.sdk.a.a a2 = new com.ironsource.sdk.a.a().a("generalmessage", Integer.valueOf(fVar.b));
        if (fVar.a > 0) {
            a2.a("timingvalue", Long.valueOf(System.currentTimeMillis() - fVar.a));
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.u, a2.a);
        runnable2.run();
    }

    final void a(Runnable runnable) {
        Handler handler = this.T;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, com.ironsource.sdk.j.a.c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceName", str);
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        this.o.a(str, true);
        b(a("loadInterstitial", flatMapToJsonAsString, "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    public final void a(String str, String str2) {
        b(b("onNativeLifeCycleEvent", a("lifeCycleEvent", str2, "productType", str, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
        this.B = str;
        this.C = str2;
        this.Q = bVar;
        a(str, str2, d.e.Banner, cVar, new e() { // from class: com.ironsource.sdk.controller.w.14
            @Override // com.ironsource.sdk.controller.w.e
            public final void a(String str3, d.e eVar, com.ironsource.sdk.g.c cVar2) {
                w.a(w.this, str3, eVar, cVar2);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
        this.B = str;
        this.C = str2;
        this.O = cVar2;
        this.o.f = str;
        this.o.g = this.C;
        a(this.B, this.C, d.e.Interstitial, cVar, new e() { // from class: com.ironsource.sdk.controller.w.11
            @Override // com.ironsource.sdk.controller.w.e
            public final void a(String str3, d.e eVar, com.ironsource.sdk.g.c cVar3) {
                w.a(w.this, str3, eVar, cVar3);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.d dVar) {
        this.B = str;
        this.C = str2;
        this.N = dVar;
        this.o.a = str;
        this.o.b = str2;
        a(str, str2, d.e.RewardedVideo, cVar, new e() { // from class: com.ironsource.sdk.controller.w.10
            @Override // com.ironsource.sdk.controller.w.e
            public final void a(String str3, d.e eVar, com.ironsource.sdk.g.c cVar2) {
                w.a(w.this, str3, eVar, cVar2);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        this.B = str;
        this.C = str2;
        this.P = eVar;
        a(str, str2, d.e.OfferWallCredits, (com.ironsource.sdk.g.c) null, new e() { // from class: com.ironsource.sdk.controller.w.13
            @Override // com.ironsource.sdk.controller.w.e
            public final void a(String str3, d.e eVar2, com.ironsource.sdk.g.c cVar) {
                w.a(w.this, str3, eVar2, cVar);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.B = str;
        this.C = str2;
        this.D = map;
        this.P = eVar;
        this.o.j = map;
        this.o.h = true;
        a(this.B, this.C, d.e.OfferWall, (com.ironsource.sdk.g.c) null, new e() { // from class: com.ironsource.sdk.controller.w.12
            @Override // com.ironsource.sdk.controller.w.e
            public final void a(String str3, d.e eVar2, com.ironsource.sdk.g.c cVar) {
                w.a(w.this, str3, eVar2, cVar);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.D = map;
        b("SSA_CORE.SDKController.runFunction('showOfferWall','onShowOfferWallSuccess','onShowOfferWallFail');");
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject) {
        b(b("updateConsentInfo", jSONObject != null ? jSONObject.toString() : null));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.c cVar) {
        b(a(d.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.d dVar) {
        b(a(d.e.RewardedVideo, jSONObject));
    }

    public final void a(boolean z2, String str) {
        b(b("viewableChange", a("webview", str, null, null, null, null, null, null, "isViewable", z2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        boolean z2 = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.a, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(d.e.Interstitial.toString()) ? !str.equalsIgnoreCase(d.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(d.e.Banner.toString()) ? (str.equalsIgnoreCase(d.e.OfferWall.toString()) || str.equalsIgnoreCase(d.e.OfferWallCredits.toString())) && this.P != null : this.Q != null : this.N != null : this.O != null) {
            z2 = true;
        }
        if (!z2) {
            Logger.d(this.a, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z2;
    }

    public final void b() {
        b(g("interceptedUrlToStore"));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(Context context) {
        com.ironsource.sdk.service.Connectivity.b bVar = this.aa;
        if (bVar == null) {
            return;
        }
        bVar.b(context);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        b(a(d.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()}))));
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = "console.log(\"JS exeption: \" + JSON.stringify(e));";
        if (z != d.EnumC0093d.MODE_0.d && (z < d.EnumC0093d.MODE_1.d || z > d.EnumC0093d.MODE_3.d)) {
            str2 = "empty";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("try{");
        sb.append(str);
        sb.append("}catch(e){");
        sb.append(str2);
        sb.append("}");
        final String str3 = "javascript:" + sb.toString();
        a(new Runnable() { // from class: com.ironsource.sdk.controller.w.2
            @Override // java.lang.Runnable
            public final void run() {
                w wVar;
                Boolean bool;
                Logger.i(w.this.a, str3);
                try {
                    if (w.this.R != null) {
                        if (w.this.R.booleanValue()) {
                            w.this.evaluateJavascript(sb.toString(), null);
                        } else {
                            w.this.loadUrl(str3);
                        }
                    } else if (Build.VERSION.SDK_INT < 19) {
                        w.this.loadUrl(str3);
                        w.this.R = Boolean.FALSE;
                    } else {
                        try {
                            w.this.evaluateJavascript(sb.toString(), null);
                            w.this.R = Boolean.TRUE;
                        } catch (NoSuchMethodError e2) {
                            String str4 = w.this.a;
                            Logger.e(str4, "evaluateJavascrip NoSuchMethodError: SDK version=" + Build.VERSION.SDK_INT + " " + e2);
                            w.this.loadUrl(str3);
                            wVar = w.this;
                            bool = Boolean.FALSE;
                            wVar.R = bool;
                        } catch (Throwable th) {
                            String str5 = w.this.a;
                            Logger.e(str5, "evaluateJavascrip Exception: SDK version=" + Build.VERSION.SDK_INT + " " + th);
                            w.this.loadUrl(str3);
                            wVar = w.this;
                            bool = Boolean.FALSE;
                            wVar.R = bool;
                        }
                    }
                } catch (Throwable th2) {
                    String str6 = w.this.a;
                    Logger.e(str6, "injectJavascript: " + th2.toString());
                }
            }
        });
    }

    @Override // com.ironsource.sdk.controller.m
    public final d.c c() {
        return d.c.Web;
    }

    @Override // com.ironsource.sdk.controller.m
    public final boolean c(String str) {
        com.ironsource.sdk.g.c a2 = this.V.a(d.e.Interstitial, str);
        return a2 != null && a2.f;
    }

    @Override // com.ironsource.sdk.controller.m
    public final void d() {
        b(a("destroyBanner", "", "onDestroyBannersSuccess", "onDestroyBannersFail"));
    }

    public final void d(String str) {
        String str2 = this.a;
        Logger.i(str2, "device status changed, connection type " + str);
        com.ironsource.sdk.a.b.a(str);
        b(b("deviceStatusChanged", a("connectionType", str, null, null, null, null, null, null, null, false)));
    }

    @Override // android.webkit.WebView, com.ironsource.sdk.controller.m
    public void destroy() {
        super.destroy();
        com.ironsource.sdk.k.b bVar = this.E;
        if (bVar != null) {
            bVar.a();
        }
        com.ironsource.sdk.service.Connectivity.b bVar2 = this.aa;
        if (bVar2 != null) {
            bVar2.a.a();
        }
        CountDownTimer countDownTimer = this.f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.T = null;
    }

    @Override // com.ironsource.sdk.controller.m
    public final void e() {
        b(g("enterForeground"));
    }

    public final void e(String str) {
        if (str.equals("forceClose")) {
            h();
        }
        b(b("engageEnd", a("action", str, null, null, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void f() {
        b(g("enterBackground"));
    }

    public final boolean f(String str) {
        List<String> b2 = com.ironsource.sdk.utils.b.a().b();
        try {
            if (b2.isEmpty()) {
                return false;
            }
            for (String str2 : b2) {
                if (str.contains(str2)) {
                    a.AnonymousClass1.a(this.w.a(), str, null);
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void g() {
        a(this.o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        com.ironsource.sdk.j.g gVar = this.x;
        if (gVar != null) {
            gVar.onCloseRequested();
        }
    }

    public final void i() {
        try {
            onPause();
        } catch (Throwable th) {
            String str = this.a;
            Logger.i(str, "WebViewController: onPause() - " + th);
        }
    }

    public final void j() {
        try {
            onResume();
        } catch (Throwable th) {
            String str = this.a;
            Logger.i(str, "WebViewController: onResume() - " + th);
        }
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        String str5 = this.a;
        Logger.i(str5, str + " " + str4);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        com.ironsource.sdk.j.g gVar;
        if (i2 == 4 && (gVar = this.x) != null && gVar.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.webkit.WebView
    public WebBackForwardList saveState(Bundle bundle) {
        return super.saveState(bundle);
    }
}
