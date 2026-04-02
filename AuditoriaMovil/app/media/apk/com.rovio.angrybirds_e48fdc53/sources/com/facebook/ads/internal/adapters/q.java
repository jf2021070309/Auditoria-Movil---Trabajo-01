package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.n.e;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.share.internal.ShareConstants;
import com.flurry.android.FlurryAgent;
import com.flurry.android.ads.FlurryAdErrorType;
import com.flurry.android.ads.FlurryAdNative;
import com.flurry.android.ads.FlurryAdNativeAsset;
import com.flurry.android.ads.FlurryAdNativeListener;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class q extends ab implements x {
    private static volatile boolean a;
    private ac b;
    private FlurryAdNative c;
    private boolean d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private com.facebook.ads.internal.n.f j;
    private com.facebook.ads.internal.n.f k;
    private com.facebook.ads.internal.n.f l;

    @Override // com.facebook.ads.internal.adapters.ab
    public String A() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public List<com.facebook.ads.internal.n.e> B() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int C() {
        return 0;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int D() {
        return 0;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.c E() {
        return com.facebook.ads.internal.n.c.FLURRY;
    }

    @Override // com.facebook.ads.internal.adapters.x
    public g F() {
        return g.YAHOO;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(int i) {
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(final Context context, ac acVar, com.facebook.ads.internal.m.c cVar, Map<String, Object> map, e.d dVar) {
        JSONObject jSONObject = (JSONObject) map.get(ShareConstants.WEB_DIALOG_PARAM_DATA);
        String optString = jSONObject.optString("api_key");
        String optString2 = jSONObject.optString("placement_id");
        synchronized (q.class) {
            if (!a) {
                com.facebook.ads.internal.q.a.d.a(context, y.a(F()) + " Initializing");
                FlurryAgent.setLogEnabled(true);
                FlurryAgent.init(context, optString);
                a = true;
            }
        }
        com.facebook.ads.internal.q.a.d.a(context, y.a(F()) + " Loading");
        this.b = acVar;
        this.c = new FlurryAdNative(context, optString2);
        this.c.setListener(new FlurryAdNativeListener() { // from class: com.facebook.ads.internal.adapters.q.1
            public void onAppExit(FlurryAdNative flurryAdNative) {
            }

            public void onClicked(FlurryAdNative flurryAdNative) {
                if (q.this.b != null) {
                    q.this.b.c(q.this);
                }
            }

            public void onCloseFullscreen(FlurryAdNative flurryAdNative) {
            }

            public void onCollapsed(FlurryAdNative flurryAdNative) {
            }

            public void onError(FlurryAdNative flurryAdNative, FlurryAdErrorType flurryAdErrorType, int i) {
                com.facebook.ads.internal.q.a.d.a(context, y.a(q.this.F()) + " Failed with FlurryError: " + flurryAdErrorType.toString());
                if (q.this.b != null) {
                    q.this.b.a(q.this, com.facebook.ads.internal.protocol.a.a(AdErrorType.MEDIATION_ERROR, flurryAdErrorType.toString()));
                }
            }

            public void onExpanded(FlurryAdNative flurryAdNative) {
            }

            public void onFetched(FlurryAdNative flurryAdNative) {
                if (q.this.b == null) {
                    return;
                }
                if (flurryAdNative.isVideoAd()) {
                    com.facebook.ads.internal.q.a.d.a(context, y.a(q.this.F()) + " Failed. AN does not support Flurry video ads");
                    q.this.b.a(q.this, new com.facebook.ads.internal.protocol.a(AdErrorType.MEDIATION_ERROR, "video ad"));
                    return;
                }
                q.this.d = true;
                FlurryAdNativeAsset asset = flurryAdNative.getAsset("headline");
                if (asset != null) {
                    q.this.e = asset.getValue();
                }
                FlurryAdNativeAsset asset2 = flurryAdNative.getAsset("summary");
                if (asset2 != null) {
                    q.this.f = asset2.getValue();
                }
                FlurryAdNativeAsset asset3 = flurryAdNative.getAsset(ShareConstants.FEED_SOURCE_PARAM);
                if (asset3 != null) {
                    q.this.g = asset3.getValue();
                }
                FlurryAdNativeAsset asset4 = flurryAdNative.getAsset("appCategory");
                if (asset4 != null) {
                    q.this.i = asset4.getValue();
                }
                FlurryAdNativeAsset asset5 = flurryAdNative.getAsset("callToAction");
                if (asset5 != null) {
                    q.this.h = asset5.getValue();
                } else if (flurryAdNative.getAsset("appRating") != null) {
                    q.this.h = "Install Now";
                } else {
                    q.this.h = "Learn More";
                }
                FlurryAdNativeAsset asset6 = flurryAdNative.getAsset("secImage");
                if (asset6 != null) {
                    q.this.j = new com.facebook.ads.internal.n.f(asset6.getValue(), 82, 82);
                }
                FlurryAdNativeAsset asset7 = flurryAdNative.getAsset("secHqImage");
                if (asset7 != null) {
                    q.this.k = new com.facebook.ads.internal.n.f(asset7.getValue(), 1200, 627);
                }
                FlurryAdNativeAsset asset8 = flurryAdNative.getAsset("secBrandingLogo");
                if (asset8 != null) {
                    q.this.l = new com.facebook.ads.internal.n.f(asset8.getValue(), 20, 20);
                }
                com.facebook.ads.internal.q.a.d.a(context, y.a(q.this.F()) + " Loaded");
                q.this.b.a(q.this);
            }

            public void onImpressionLogged(FlurryAdNative flurryAdNative) {
                if (q.this.b != null) {
                    q.this.b.b(q.this);
                }
            }

            public void onShowFullscreen(FlurryAdNative flurryAdNative) {
            }
        });
        this.c.fetchAd();
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(View view, List<View> list) {
        if (this.c != null) {
            this.c.setTrackingView(view);
        }
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(ac acVar) {
        this.b = acVar;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(Map<String, String> map) {
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void b(Map<String, String> map) {
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void b_() {
        if (this.c != null) {
            this.c.removeTrackingView();
        }
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String c() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean c_() {
        return this.d;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean d() {
        return false;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean e() {
        return false;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean f() {
        return false;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean g() {
        return false;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean h() {
        return true;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int i() {
        return 0;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int j() {
        return 0;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int k() {
        return 0;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.f l() {
        return this.j;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.f m() {
        return this.k;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.h n() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String o() {
        return this.e;
    }

    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public void onDestroy() {
        b_();
        this.b = null;
        if (this.c != null) {
            this.c.destroy();
            this.c = null;
        }
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String p() {
        return this.g;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String q() {
        return this.f;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String r() {
        return this.h;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String s() {
        return this.i;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.g t() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.f u() {
        return this.l;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String v() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String w() {
        return "Ad";
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String x() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String y() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.j z() {
        return com.facebook.ads.internal.n.j.DEFAULT;
    }
}
