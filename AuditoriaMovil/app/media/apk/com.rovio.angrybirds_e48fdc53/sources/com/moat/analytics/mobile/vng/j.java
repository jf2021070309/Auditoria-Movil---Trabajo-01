package com.moat.analytics.mobile.vng;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.moat.analytics.mobile.vng.s;
import com.moat.analytics.mobile.vng.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class j {
    private final WeakReference<WebView> e;
    private final a l;
    private int b = 0;
    private boolean c = false;
    boolean a = false;
    private boolean d = false;
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final BroadcastReceiver m = new BroadcastReceiver() { // from class: com.moat.analytics.mobile.vng.j.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                j.this.c();
            } catch (Exception e) {
                m.a(e);
            }
            if (System.currentTimeMillis() - j.this.i > 10000) {
                j.this.e();
            }
        }
    };
    private final BroadcastReceiver n = new BroadcastReceiver() { // from class: com.moat.analytics.mobile.vng.j.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                j.this.d();
            } catch (Exception e) {
                m.a(e);
            }
        }
    };
    private final s.a j = new s.a();
    private final LinkedList<String> g = new LinkedList<>();
    private final List<String> k = new ArrayList();
    private final Map<b, String> f = new WeakHashMap();
    private final long i = System.currentTimeMillis();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum a {
        WEBVIEW,
        NATIVE_DISPLAY,
        NATIVE_VIDEO
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(WebView webView, a aVar) {
        this.e = new WeakReference<>(webView);
        this.l = aVar;
        IntentFilter intentFilter = new IntentFilter("UPDATE_METADATA");
        IntentFilter intentFilter2 = new IntentFilter("UPDATE_VIEW_INFO");
        LocalBroadcastManager.getInstance(s.c()).registerReceiver(this.m, intentFilter);
        LocalBroadcastManager.getInstance(s.c()).registerReceiver(this.n, intentFilter2);
        try {
            p.a(3, "JavaScriptBridge", this, b() ? "bridge installed" : "bridge not installed");
        } catch (Exception e) {
            m.a(e);
        }
    }

    private boolean a(WebView webView, String str) {
        if (webView == null) {
            p.a(6, "JavaScriptBridge", this, "WebView is null. Can't " + str);
            return false;
        } else if (webView.getSettings().getJavaScriptEnabled()) {
            return true;
        } else {
            p.a(6, "JavaScriptBridge", this, "JavaScript is not enabled in the given WebView. Can't " + str);
            return false;
        }
    }

    private boolean b() {
        if (h() == null || a(h(), "installBridge")) {
            this.a = true;
            i.a().a(s.c(), this);
            return true;
        }
        return false;
    }

    static /* synthetic */ int c(j jVar) {
        int i = jVar.b;
        jVar.b = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            if (w.a().a == w.d.OFF) {
                return;
            }
            if (!this.d) {
                p.a(3, "JavaScriptBridge", this, "Ready for communication (setting environment variables).");
                this.d = true;
            }
            String format = String.format("javascript:(function(e,k){function l(){function f(a){var b=a.c,c=a.a,f=a.b;a=a.f;var d=[];if(c)b[c]&&d.push(b[c].fn[0]);else for(key in b)if(b[key])for(var g=0,e=b[key].fn.length;g<e;g++)d.push(b[key].fn[g]);g=0;for(e=d.length;g<e;g++){var h=d[g];if('function'===typeof h)try{f?h(f):h()}catch(k){}a&&delete b[c]}}function d(a,b,c){'function'===typeof a&&(b===kuea&&c[b]?c[b].fn.push(a):c[b]={ts:+new Date,fn:[a]})}kuea=+new Date;iymv={};briz=!1;ewat=+new Date;bnkr=[];bjmk={};dptk={};uqaj={};ryup={};yhgt={};csif={};this.g=function(a){this.namespace=a.namespace;this.version=a.version;this.appName=a.appName;this.deviceOS=a.deviceOS;this.isNative=a.isNative;this.versionHash=a.versionHash;this.aqzx=a.aqzx;this.appId=a.appId};this.nvsj=function(a){briz||(d(a,ewat,iymv),briz=!0)};this.bpsy=function(a,b){var c=b||kuea;c!==kuea&&bjmk[c]||d(a,c,bjmk)};this.qmrv=function(a,b){var c=b||kuea;c!==kuea&&uqaj[c]||d(a,c,uqaj)};this.lgpr=function(a,b){d(a,b||kuea,yhgt)};this.hgen=function(a,b){d(a,b||kuea,csif)};this.xrnk=function(a){delete yhgt[a||kuea]};this.vgft=function(a){return dptk[a||kuea]||!1};this.lkpu=function(a){return ryup[a||kuea]||!1};this.crts=function(a){var b={c:iymv,b:a,a:ewat};briz?f(b):bnkr.push(a)};this.mqjh=function(a){var b=a||kuea;dptk[b]=!0;var c={c:bjmk,f:!0};b!==kuea&&(c.b=a,c.a=a);f(c)};this.egpw=function(a){var b=a||kuea;ryup[b]=!0;var c={c:uqaj,f:!0};b!==kuea&&(c.b=a,c.a=a);f(c)};this.sglu=function(a){var b={c:yhgt,b:a.event||a,f:!1};(a.adKey||kuea)!==kuea&&(b.a=a.adKey);f(b);return 0<Object.keys(yhgt).length};this.ucbx=function(a){f({a:a.adKey||kuea,c:csif,b:a.event,f:!1})}}'undefined'===typeof e.MoatMAK&&(e.MoatMAK=new l,e.MoatMAK.g(k),e.__zMoatInit__=!0)})(window,%s);", i());
            if (g()) {
                h().loadUrl(format);
            }
        } catch (Exception e) {
            p.a("JavaScriptBridge", this, "Failed to initialize communication (did not set environment variables).", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            if (w.a().a == w.d.OFF) {
                return;
            }
            if (this.e == null || !g() || (this.c && h().getUrl() == null)) {
                if (this.e == null) {
                    p.a(3, "JavaScriptBridge", this, "WebView ref became null, stopping tracking loop");
                } else {
                    p.a(3, "JavaScriptBridge", this, "WebView became null" + (h() == null ? "" : "based on null url") + ", stopping tracking loop");
                }
                f();
                return;
            }
            if (h().getUrl() != null) {
                this.c = true;
            }
            for (Map.Entry<b, String> entry : this.f.entrySet()) {
                b key = entry.getKey();
                if (key == null || key.d() == null) {
                    p.a(3, "JavaScriptBridge", this, "Tracker has no subject");
                    if (key == null || !key.c) {
                        c(key);
                    }
                }
                if (key.d) {
                    f(String.format("javascript: MoatMAK.mqjh(\"%s\")", key.b));
                    String format = String.format("javascript: MoatMAK.sglu(%s)", key.f());
                    if (Build.VERSION.SDK_INT >= 19) {
                        h().evaluateJavascript(format, new ValueCallback<String>() { // from class: com.moat.analytics.mobile.vng.j.1
                            @Override // android.webkit.ValueCallback
                            /* renamed from: a */
                            public void onReceiveValue(String str) {
                                if (str == null || str.equalsIgnoreCase("null") || str.equalsIgnoreCase("false")) {
                                    p.a(3, "JavaScriptBridge", j.this, "Received value is:" + (str == null ? "null" : "(String)" + str));
                                    if (j.this.b >= 50) {
                                        j.this.f();
                                    }
                                    j.c(j.this);
                                } else if (!str.equalsIgnoreCase(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
                                    p.a(3, "JavaScriptBridge", j.this, "Received unusual value from Javascript:" + str);
                                } else {
                                    if (j.this.b != 0) {
                                        p.a(3, "JavaScriptBridge", j.this, "Javascript has found ad");
                                        j.this.e();
                                    }
                                    j.this.b = 0;
                                }
                            }
                        });
                    } else {
                        h().loadUrl(format);
                    }
                }
            }
        } catch (Exception e) {
            m.a(e);
            f();
        }
    }

    private void d(b bVar) {
        p.a(3, "JavaScriptBridge", this, "Stopping view update loop");
        if (bVar != null) {
            i.a().a(bVar);
        }
    }

    private void d(String str) {
        if (this.k.size() >= 50) {
            this.k.subList(0, 25).clear();
        }
        this.k.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        p.a(3, "JavaScriptBridge", this, "Stopping metadata reporting loop");
        i.a().a(this);
        LocalBroadcastManager.getInstance(s.c()).unregisterReceiver(this.m);
    }

    private boolean e(String str) {
        if (this.a) {
            return true;
        }
        p.a(6, "JavaScriptBridge", this, "Bridge is not installed in the given WebView. Can't " + str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        p.a(3, "JavaScriptBridge", this, "Cleaning up");
        e();
        for (Map.Entry<b, String> entry : this.f.entrySet()) {
            d(entry.getKey());
        }
        this.f.clear();
        LocalBroadcastManager.getInstance(s.c()).unregisterReceiver(this.n);
    }

    private void f(String str) {
        if (g()) {
            h().loadUrl(str);
        }
    }

    private boolean g() {
        return h() != null;
    }

    private WebView h() {
        return this.e.get();
    }

    private String i() {
        try {
            HashMap hashMap = new HashMap();
            String a2 = this.j.a();
            String b = this.j.b();
            String num = Integer.toString(Build.VERSION.SDK_INT);
            String b2 = s.b();
            String str = this.l == a.WEBVIEW ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1";
            hashMap.put("versionHash", "3f2ae9c1894282b5e0222f0d06bbf457191f816f");
            hashMap.put("appName", a2);
            hashMap.put("namespace", "VNG");
            hashMap.put("version", "2.2.0");
            hashMap.put("deviceOS", num);
            hashMap.put("isNative", str);
            hashMap.put("appId", b);
            if (b2 != null) {
                hashMap.put("aqzx", b2);
            }
            return new JSONObject(hashMap).toString();
        } catch (Exception e) {
            return "{}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        p.a(3, "JavaScriptBridge", this, "webViewReady");
        this.h.compareAndSet(false, true);
        e();
        for (String str : this.k) {
            f(str);
        }
        this.k.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b bVar) {
        if (bVar != null) {
            p.a(3, "JavaScriptBridge", this, "adding tracker" + bVar.b);
            this.f.put(bVar, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        String format = String.format("javascript: MoatMAK.crts(%s)", str);
        if (this.h.get()) {
            f(format);
        } else {
            d(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        if (this.h.get() && g()) {
            f(String.format("javascript:%s.dispatchEvent(%s);", str, jSONObject2));
        } else {
            this.g.add(jSONObject2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        p.a(3, "JavaScriptBridge", this, "markUserInteractionEvent:" + str);
        String format = String.format("javascript: MoatMAK.ucbx(%s)", str);
        if (this.h.get()) {
            f(format);
        } else {
            d(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(b bVar) {
        try {
            if (g() && a(h(), "startTracking") && e("startTracking")) {
                if (bVar.d() == null) {
                    if (!bVar.c) {
                        p.a(3, "JavaScriptBridge", this, "Tracker subject is null, won't start tracking");
                        return false;
                    }
                    p.a(3, "JavaScriptBridge", this, "Tracker subject is null at start");
                }
                p.a(3, "JavaScriptBridge", this, "Starting tracking on tracker" + bVar.b);
                f(String.format("javascript: MoatMAK.mqjh(\"%s\")", bVar.b));
                i.a().a(s.c(), bVar);
                return true;
            }
            return false;
        } catch (Exception e) {
            p.a("JavaScriptBridge", this, "Failed to initialize impression start.", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(String str) {
        p.a(3, "JavaScriptBridge", this, "flushDispatchQueue");
        this.h.compareAndSet(false, true);
        if (this.g.size() >= 200) {
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < 10; i++) {
                linkedList.addFirst(this.g.removeFirst());
            }
            int min = Math.min(Math.min(this.g.size() / 200, 10) + 200, this.g.size());
            for (int i2 = 0; i2 < min; i2++) {
                this.g.removeFirst();
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                this.g.addFirst((String) it.next());
            }
        }
        int i3 = 0;
        while (!this.g.isEmpty() && i3 < 200) {
            i3++;
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            while (true) {
                if (!this.g.isEmpty() && i3 < 200) {
                    int i4 = i3 + 1;
                    String first = this.g.getFirst();
                    if (sb.length() + first.length() > 2000) {
                        i3 = i4;
                        break;
                    }
                    this.g.removeFirst();
                    if (z) {
                        z = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(first);
                    i3 = i4;
                }
            }
            f(String.format("javascript:%s.dispatchMany([%s])", str, sb.toString()));
        }
        this.g.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(b bVar) {
        boolean z = true;
        if (g() && a(h(), "stopTracking") && e("stopTracking")) {
            try {
                p.a(3, "JavaScriptBridge", this, "Ending tracking on tracker" + bVar.b);
                f(String.format("javascript: MoatMAK.egpw(\"%s\")", bVar.b));
            } catch (Exception e) {
                p.a("JavaScriptBridge", this, "Failed to end impression.", e);
            }
        } else {
            z = false;
        }
        if (this.l == a.NATIVE_DISPLAY) {
            d(bVar);
        } else {
            f();
        }
        this.f.remove(bVar);
        return z;
    }

    protected void finalize() {
        try {
            super.finalize();
            p.a(3, "JavaScriptBridge", this, "finalize");
            f();
        } catch (Exception e) {
            m.a(e);
        }
    }
}
