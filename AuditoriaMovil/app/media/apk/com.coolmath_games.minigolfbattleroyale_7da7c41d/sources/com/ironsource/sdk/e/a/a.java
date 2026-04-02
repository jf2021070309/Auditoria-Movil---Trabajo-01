package com.ironsource.sdk.e.a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.c.d;
import com.ironsource.sdk.g.f;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class a {
    private static AdSession b;
    private static final Partner a = Partner.createPartner("Ironsrc", "7");
    private static boolean c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.sdk.e.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0091a {
        public boolean a;
        public Owner b;
        public Owner c;
        public String d;
        public ImpressionType e;
        public CreativeType f;
        public String g;
        private Owner h;

        public static C0091a a(JSONObject jSONObject) {
            C0091a c0091a = new C0091a();
            c0091a.a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String optString = jSONObject.optString("impressionOwner", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(String.format("Missing OMID impressionOwner", optString));
            }
            try {
                c0091a.b = Owner.valueOf(optString.toUpperCase());
                String optString2 = jSONObject.optString("videoEventsOwner", "");
                if (TextUtils.isEmpty(optString)) {
                    throw new IllegalArgumentException(String.format("Missing OMID videoEventsOwner", optString2));
                }
                try {
                    c0091a.c = Owner.valueOf(optString2.toUpperCase());
                    c0091a.d = jSONObject.optString("customReferenceData", "");
                    c0091a.f = c(jSONObject);
                    c0091a.e = b(jSONObject);
                    String optString3 = jSONObject.optString("adViewId", "");
                    if (TextUtils.isEmpty(optString3)) {
                        throw new IllegalArgumentException(String.format("Missing OMID webview id", optString3));
                    }
                    c0091a.g = optString3;
                    jSONObject.optBoolean("signalLoaded", false);
                    c0091a.h = d(jSONObject);
                    return c0091a;
                } catch (IllegalArgumentException unused) {
                    throw new IllegalArgumentException(String.format("%s | Invalid OMID videoEventsOwner", optString2));
                }
            } catch (IllegalArgumentException unused2) {
                throw new IllegalArgumentException(String.format("%s | Invalid OMID impressionOwner", optString));
            }
        }

        private static ImpressionType b(JSONObject jSONObject) {
            ImpressionType[] values;
            String optString = jSONObject.optString("impressionType", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(String.format("Missing OMID creativeType", optString));
            }
            for (ImpressionType impressionType : ImpressionType.values()) {
                if (optString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new IllegalArgumentException(String.format("Missing OMID creativeType", optString));
        }

        private static CreativeType c(JSONObject jSONObject) {
            CreativeType[] values;
            String optString = jSONObject.optString("creativeType", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(String.format("Missing OMID creativeType", optString));
            }
            for (CreativeType creativeType : CreativeType.values()) {
                if (optString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new IllegalArgumentException(String.format("Missing OMID creativeType", optString));
        }

        private static Owner d(JSONObject jSONObject) {
            String optString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(optString.toUpperCase());
            } catch (IllegalArgumentException unused) {
                return owner;
            }
        }
    }

    public static f a() {
        f fVar = new f();
        fVar.a(SDKUtils.encodeString("omidVersion"), SDKUtils.encodeString(Omid.getVersion()));
        fVar.a(SDKUtils.encodeString("omidPartnerName"), SDKUtils.encodeString("Ironsrc"));
        fVar.a(SDKUtils.encodeString("omidPartnerVersion"), SDKUtils.encodeString("7"));
        return fVar;
    }

    public static void a(Context context) {
        if (c) {
            return;
        }
        Omid.activate(context);
        c = true;
    }

    public static void a(JSONObject jSONObject) {
        c();
        AdEvents createAdEvents = AdEvents.createAdEvents(b);
        try {
            if (((Boolean) jSONObject.get("signalLoaded")).booleanValue()) {
                createAdEvents.loaded();
            }
        } catch (Exception unused) {
        }
        createAdEvents.impressionOccurred();
    }

    public static void a(JSONObject jSONObject, WebView webView) {
        C0091a a2 = C0091a.a(jSONObject);
        if (!c) {
            throw new IllegalStateException("OMID has not been activated");
        }
        if (b != null) {
            throw new IllegalStateException("OMID Session has already started");
        }
        if (!TextUtils.isEmpty(a2.g) && (webView = d.a().a(a2.g)) == null) {
            throw new IllegalStateException("webview not found");
        }
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(a2.f, a2.e, a2.b, a2.c, a2.a), AdSessionContext.createHtmlAdSessionContext(a, webView, null, a2.d));
        createAdSession.registerAdView(webView);
        b = createAdSession;
        createAdSession.start();
    }

    public static void b() {
        c();
        b.finish();
        b = null;
    }

    private static void c() {
        if (!c) {
            throw new IllegalStateException("OMID has not been activated");
        }
        if (b == null) {
            throw new IllegalStateException("OMID Session has not started");
        }
    }
}
