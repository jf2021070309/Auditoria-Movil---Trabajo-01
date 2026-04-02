package com.truex.adrenderer.web;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.qa0.f;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes4.dex */
public class TruexWebView extends WebView {
    public com.amazon.aps.iva.qa0.a b;
    public String c;
    public String d;
    public c e;
    public com.amazon.aps.iva.qa0.c f;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            a = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
    }

    public TruexWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(com.amazon.aps.iva.qa0.b bVar, HashMap hashMap) {
        bVar.toString();
        if (hashMap.size() > 0) {
            if (bVar == com.amazon.aps.iva.qa0.b.AD_ERROR) {
                Objects.toString(hashMap.get("errorMessage"));
            } else {
                new c((Map<?, ?>) hashMap).toString();
            }
        }
        com.amazon.aps.iva.qa0.a aVar = this.b;
        if (aVar != null) {
            ((f) aVar).c(bVar, hashMap);
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            evaluateJavascript("history.back()", null);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[Catch: b -> 0x00a4, LOOP:0: B:30:0x0074->B:31:0x0076, LOOP_END, TryCatch #0 {b -> 0x00a4, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x000f, B:8:0x0013, B:9:0x0018, B:29:0x0052, B:31:0x0076, B:32:0x0082, B:34:0x0092, B:37:0x009a, B:38:0x009f, B:12:0x0020, B:18:0x0034, B:21:0x003c, B:22:0x0042), top: B:45:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092 A[Catch: b -> 0x00a4, TryCatch #0 {b -> 0x00a4, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x000f, B:8:0x0013, B:9:0x0018, B:29:0x0052, B:31:0x0076, B:32:0x0082, B:34:0x0092, B:37:0x009a, B:38:0x009f, B:12:0x0020, B:18:0x0034, B:21:0x003c, B:22:0x0042), top: B:45:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a A[Catch: b -> 0x00a4, TryCatch #0 {b -> 0x00a4, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x000f, B:8:0x0013, B:9:0x0018, B:29:0x0052, B:31:0x0076, B:32:0x0082, B:34:0x0092, B:37:0x009a, B:38:0x009f, B:12:0x0020, B:18:0x0034, B:21:0x003c, B:22:0x0042), top: B:45:0x0001 }] */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getAdParametersJSON() {
        /*
            r7 = this;
            r0 = 0
            com.amazon.aps.iva.if0.c r1 = new com.amazon.aps.iva.if0.c     // Catch: com.amazon.aps.iva.if0.b -> La4
            r1.<init>()     // Catch: com.amazon.aps.iva.if0.b -> La4
            java.lang.String r2 = r7.d     // Catch: com.amazon.aps.iva.if0.b -> La4
            if (r2 == 0) goto Lf
            java.lang.String r3 = "vastConfigUrl"
            r1.put(r3, r2)     // Catch: com.amazon.aps.iva.if0.b -> La4
        Lf:
            com.amazon.aps.iva.if0.c r2 = r7.e     // Catch: com.amazon.aps.iva.if0.b -> La4
            if (r2 == 0) goto L18
            java.lang.String r3 = "vastConfigJSON"
            r1.put(r3, r2)     // Catch: com.amazon.aps.iva.if0.b -> La4
        L18:
            com.amazon.aps.iva.qa0.c r2 = r7.f     // Catch: com.amazon.aps.iva.if0.b -> La4
            java.lang.String r2 = r2.b     // Catch: com.amazon.aps.iva.if0.b -> La4
            r3 = 0
            if (r2 == 0) goto L20
            goto L52
        L20:
            android.content.Context r2 = r7.getContext()     // Catch: com.amazon.aps.iva.if0.b -> La4
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r4 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r2)     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = r4.getId()     // Catch: java.lang.Exception -> L31
            boolean r2 = r4.isLimitAdTrackingEnabled()     // Catch: java.lang.Exception -> L32
            goto L4d
        L31:
            r5 = r0
        L32:
            if (r2 == 0) goto L39
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: com.amazon.aps.iva.if0.b -> La4
            goto L3a
        L39:
            r2 = r0
        L3a:
            if (r2 == 0) goto L4c
            java.lang.String r4 = "advertising_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r2, r4)     // Catch: com.amazon.aps.iva.if0.b -> La4
            java.lang.String r4 = "limit_ad_tracking"
            int r2 = android.provider.Settings.Secure.getInt(r2, r4)     // Catch: android.provider.Settings.SettingNotFoundException -> L4c com.amazon.aps.iva.if0.b -> La4
            if (r2 == 0) goto L4c
            r2 = 1
            goto L4d
        L4c:
            r2 = r3
        L4d:
            if (r2 == 0) goto L51
            r2 = r0
            goto L52
        L51:
            r2 = r5
        L52:
            java.lang.String r4 = "userAdvertisingId"
            r1.put(r4, r2)     // Catch: com.amazon.aps.iva.if0.b -> La4
            java.lang.String r2 = "fallbackAdvertisingId"
            com.amazon.aps.iva.qa0.c r4 = r7.f     // Catch: com.amazon.aps.iva.if0.b -> La4
            r4.getClass()     // Catch: com.amazon.aps.iva.if0.b -> La4
            r1.put(r2, r0)     // Catch: com.amazon.aps.iva.if0.b -> La4
            java.lang.String r2 = "supportsUserCancelStream"
            com.amazon.aps.iva.qa0.c r4 = r7.f     // Catch: com.amazon.aps.iva.if0.b -> La4
            boolean r4 = r4.a     // Catch: com.amazon.aps.iva.if0.b -> La4
            r1.put(r2, r4)     // Catch: com.amazon.aps.iva.if0.b -> La4
            com.amazon.aps.iva.if0.a r2 = new com.amazon.aps.iva.if0.a     // Catch: com.amazon.aps.iva.if0.b -> La4
            r2.<init>()     // Catch: com.amazon.aps.iva.if0.b -> La4
            com.amazon.aps.iva.qa0.b[] r4 = com.amazon.aps.iva.qa0.b.values()     // Catch: com.amazon.aps.iva.if0.b -> La4
            int r5 = r4.length     // Catch: com.amazon.aps.iva.if0.b -> La4
        L74:
            if (r3 >= r5) goto L82
            r6 = r4[r3]     // Catch: com.amazon.aps.iva.if0.b -> La4
            java.lang.String r6 = r6.toString()     // Catch: com.amazon.aps.iva.if0.b -> La4
            r2.put(r6)     // Catch: com.amazon.aps.iva.if0.b -> La4
            int r3 = r3 + 1
            goto L74
        L82:
            java.lang.String r3 = "enableAdEvents"
            r1.put(r3, r2)     // Catch: com.amazon.aps.iva.if0.b -> La4
            android.content.Context r2 = r7.getContext()     // Catch: com.amazon.aps.iva.if0.b -> La4
            com.amazon.aps.iva.qa0.c r3 = r7.f     // Catch: com.amazon.aps.iva.if0.b -> La4
            r3.getClass()     // Catch: com.amazon.aps.iva.if0.b -> La4
            if (r2 == 0) goto L97
            java.lang.String r2 = r2.getPackageName()     // Catch: com.amazon.aps.iva.if0.b -> La4
            goto L98
        L97:
            r2 = r0
        L98:
            if (r2 == 0) goto L9f
            java.lang.String r3 = "appId"
            r1.put(r3, r2)     // Catch: com.amazon.aps.iva.if0.b -> La4
        L9f:
            java.lang.String r0 = r1.toString()     // Catch: com.amazon.aps.iva.if0.b -> La4
            return r0
        La4:
            r1 = move-exception
            r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truex.adrenderer.web.TruexWebView.getAdParametersJSON():java.lang.String");
    }

    @Override // android.webkit.WebView
    public final void onPause() {
        super.onPause();
        evaluateJavascript("initiallyPauseAd = true; if (tar) tar.pause()", null);
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        super.onResume();
        evaluateJavascript("initiallyPauseAd = false; if (tar) tar.resume()", null);
    }

    public void setEmitter(com.amazon.aps.iva.qa0.a aVar) {
        this.b = aVar;
    }

    @JavascriptInterface
    public void signalAdEvent(String str) {
        try {
            c cVar = new c(str);
            String string = cVar.getString("type");
            com.amazon.aps.iva.sa0.a aVar = com.amazon.aps.iva.ta0.b.a;
            HashMap hashMap = new HashMap();
            if (cVar != c.NULL) {
                hashMap = com.amazon.aps.iva.ta0.b.b(cVar);
            }
            hashMap.remove("type");
            a(com.amazon.aps.iva.qa0.b.toEvent(string), hashMap);
        } catch (Exception unused) {
        }
    }

    public void setKeyEventListener(b bVar) {
    }
}
