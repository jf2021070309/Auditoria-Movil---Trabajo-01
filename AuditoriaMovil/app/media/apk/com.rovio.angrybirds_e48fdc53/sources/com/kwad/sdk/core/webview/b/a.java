package com.kwad.sdk.core.webview.b;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.kwad.sdk.core.NetworkMonitor;
import com.kwad.sdk.core.config.d;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.response.model.SdkConfigData;
import com.kwad.sdk.core.webview.b.b.a;
import com.kwad.sdk.core.webview.b.c.b;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ag;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.bc;
import com.kwad.sdk.utils.g;
import com.kwad.sdk.utils.q;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class a {
    private static volatile a ayG;
    private Context mContext;
    private long mInitTime;
    private volatile boolean mHasInit = false;
    private final List<com.kwad.sdk.h.a.b> ayH = new CopyOnWriteArrayList();
    private final List<String> ayI = new CopyOnWriteArrayList();
    private final List<String> ayJ = new CopyOnWriteArrayList();
    private final NetworkMonitor.a ayK = new NetworkMonitor.a() { // from class: com.kwad.sdk.core.webview.b.a.2
        @Override // com.kwad.sdk.core.NetworkMonitor.a
        public final void a(NetworkMonitor.NetworkState networkState) {
            if (networkState == NetworkMonitor.NetworkState.NETWORK_WIFI || networkState == NetworkMonitor.NetworkState.NETWORK_MOBILE) {
                a.this.Ef();
            }
        }
    };

    private a() {
    }

    public static a Ed() {
        if (ayG == null) {
            synchronized (a.class) {
                if (ayG == null) {
                    ayG = new a();
                }
            }
        }
        return ayG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.kwad.sdk.h.a.b> Eg() {
        List<com.kwad.sdk.h.a.a> list;
        SdkConfigData zv = d.zv();
        if (zv == null || (list = zv.h5PreloadConfigs) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.kwad.sdk.h.a.a aVar : list) {
            for (com.kwad.sdk.h.a.b bVar : aVar.aCi) {
                a(bVar, aVar);
                if (bVar.isValid()) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    private WebResourceResponse V(String str, String str2) {
        int i;
        String str3;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            b.a aVar = new b.a();
            this.ayI.add(str);
            WebResourceResponse a = a(str, str2, aVar, false);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (a != null) {
                c.d("HybridPackageManager", "load success time:" + currentTimeMillis2 + "--url:" + str2);
                i = 1;
                str3 = "";
            } else {
                c.d("HybridPackageManager", "load fail errorMsg:" + aVar.msg + "-url:" + str2);
                i = 2;
                str3 = aVar.msg;
            }
            com.kwad.sdk.core.webview.b.c.b.a(str2, str, i, str3, currentTimeMillis2);
            return a;
        } catch (Throwable th) {
            c.printStackTraceOnly(th);
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
            com.kwad.sdk.core.webview.b.c.b.a(str2, str, 2, "HybridWebViewClient中 Exception " + Log.getStackTraceString(th), currentTimeMillis3);
            return null;
        }
    }

    private WebResourceResponse a(String str, String str2, b.a aVar, boolean z) {
        com.kwad.sdk.h.a.b ea = ea(str);
        if (ea == null) {
            com.kwad.sdk.h.a.b dZ = dZ(str);
            if (dZ == null) {
                aVar.msg = "配置文件没有下发该zip资源";
                return null;
            }
            aVar.msg = "资源未下载:" + dZ.loadType;
            b(dZ);
            return null;
        }
        return b.a(this.mContext, str2, ea, aVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.kwad.sdk.h.a.b bVar) {
        if (this.ayJ.contains(bVar.aCj) || TextUtils.isEmpty(bVar.packageUrl)) {
            return;
        }
        com.kwad.sdk.core.webview.b.b.a.a(bVar, new a.InterfaceC0261a() { // from class: com.kwad.sdk.core.webview.b.a.4
            @Override // com.kwad.sdk.core.webview.b.b.a.InterfaceC0261a
            public final void c(com.kwad.sdk.h.a.b bVar2) {
                a.this.ayJ.add(bVar2.aCj);
                c.d("HybridPackageManager", "download onStart: " + bVar2.toString());
            }

            @Override // com.kwad.sdk.core.webview.b.b.a.InterfaceC0261a
            public final void d(com.kwad.sdk.h.a.b bVar2) {
                c.d("HybridPackageManager", "download success: " + bVar2.toString());
                if (com.kwad.sdk.core.webview.b.b.b.a(a.this.mContext, bVar2)) {
                    c.d("HybridPackageManager", "install success: " + bVar2.toString());
                    a.this.ayH.add(bVar2);
                    a aVar = a.this;
                    aVar.bq(aVar.mContext);
                    com.kwad.sdk.core.webview.b.c.b.a(bVar2, 4);
                }
                a.this.ayJ.remove(bVar2.aCj);
            }

            @Override // com.kwad.sdk.core.webview.b.b.a.InterfaceC0261a
            public final void e(com.kwad.sdk.h.a.b bVar2) {
                c.d("HybridPackageManager", "download failure: " + bVar2.toString());
                a.this.ayJ.remove(bVar2.aCj);
            }
        });
    }

    private void a(com.kwad.sdk.h.a.b bVar, com.kwad.sdk.h.a.a aVar) {
        bVar.aCj = aVar.sceneId;
        if (TextUtils.isEmpty(bVar.packageUrl)) {
            return;
        }
        String ee = com.kwad.sdk.core.webview.b.c.a.ee(bVar.packageUrl);
        if (TextUtils.isEmpty(ee)) {
            return;
        }
        bVar.aCk = ee;
        bVar.aCl = com.kwad.sdk.core.webview.b.c.a.C(this.mContext, bVar.aCk);
    }

    private void b(final com.kwad.sdk.h.a.b bVar) {
        g.execute(new Runnable() { // from class: com.kwad.sdk.core.webview.b.a.5
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[Catch: all -> 0x005e, TryCatch #4 {, blocks: (B:7:0x001e, B:18:0x0035, B:19:0x0040, B:21:0x0046, B:23:0x0050, B:24:0x0058, B:26:0x005a, B:27:0x005d, B:17:0x0032), top: B:34:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bq(android.content.Context r5) {
        /*
            r4 = this;
            java.util.List<com.kwad.sdk.h.a.b> r0 = r4.ayH
            monitor-enter(r0)
            r1 = 0
            java.io.File r5 = com.kwad.sdk.core.webview.b.c.a.bu(r5)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            java.util.List<com.kwad.sdk.h.a.b> r2 = r4.ayH     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            org.json.JSONArray r2 = com.kwad.sdk.utils.t.I(r2)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            byte[] r5 = r2.getBytes()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
            r3.write(r5)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
            com.kwad.sdk.crash.utils.b.closeQuietly(r3)     // Catch: java.lang.Throwable -> L5e
            goto L35
        L22:
            r5 = move-exception
            r1 = r3
            goto L5a
        L25:
            r5 = move-exception
            r1 = r3
            goto L2b
        L28:
            r5 = move-exception
            goto L5a
        L2a:
            r5 = move-exception
        L2b:
            java.lang.String r5 = "updatePackageIndexFile"
            java.lang.String r2 = "read packageIndex file error"
            com.kwad.sdk.core.e.c.e(r5, r2)     // Catch: java.lang.Throwable -> L28
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)     // Catch: java.lang.Throwable -> L5e
        L35:
            java.util.List<java.lang.String> r5 = r4.ayI     // Catch: java.lang.Throwable -> L5e
            r5.clear()     // Catch: java.lang.Throwable -> L5e
            java.util.List<com.kwad.sdk.h.a.b> r5 = r4.ayH     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L5e
        L40:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L58
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L5e
            com.kwad.sdk.h.a.b r1 = (com.kwad.sdk.h.a.b) r1     // Catch: java.lang.Throwable -> L5e
            boolean r2 = r1.aCn     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L40
            java.util.List<java.lang.String> r2 = r4.ayI     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = r1.aCj     // Catch: java.lang.Throwable -> L5e
            r2.add(r1)     // Catch: java.lang.Throwable -> L5e
            goto L40
        L58:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            return
        L5a:
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)     // Catch: java.lang.Throwable -> L5e
            throw r5     // Catch: java.lang.Throwable -> L5e
        L5e:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.core.webview.b.a.bq(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b A[Catch: all -> 0x0083, TryCatch #0 {, blocks: (B:13:0x002a, B:22:0x003b, B:23:0x0045, B:24:0x0050, B:26:0x0056, B:28:0x006a, B:29:0x006f, B:31:0x0073, B:32:0x007b, B:20:0x0036, B:36:0x007f, B:37:0x0082), top: B:41:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056 A[Catch: all -> 0x0083, TryCatch #0 {, blocks: (B:13:0x002a, B:22:0x003b, B:23:0x0045, B:24:0x0050, B:26:0x0056, B:28:0x006a, B:29:0x006f, B:31:0x0073, B:32:0x007b, B:20:0x0036, B:36:0x007f, B:37:0x0082), top: B:41:0x0004 }] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void br(android.content.Context r5) {
        /*
            r4 = this;
            java.util.List<com.kwad.sdk.h.a.b> r0 = r4.ayH
            monitor-enter(r0)
            r1 = 0
            java.io.File r5 = com.kwad.sdk.core.webview.b.c.a.bu(r5)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            boolean r2 = com.kwad.sdk.utils.q.L(r5)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r2 == 0) goto L29
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L7d
            r5.<init>(r2)     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L7d
            java.lang.String r5 = com.kwad.sdk.crash.utils.h.b(r5)     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L7d
            com.kwad.sdk.core.webview.b.a$6 r3 = new com.kwad.sdk.core.webview.b.a$6     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L7d
            r3.<init>()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L7d
            java.util.List r5 = com.kwad.sdk.utils.t.a(r5, r3)     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L7d
            r1 = r2
            goto L2a
        L27:
            r5 = move-exception
            goto L33
        L29:
            r5 = r1
        L2a:
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)     // Catch: java.lang.Throwable -> L83
            r1 = r5
            goto L39
        L2f:
            r5 = move-exception
            goto L7f
        L31:
            r5 = move-exception
            r2 = r1
        L33:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L7d
            com.kwad.sdk.crash.utils.b.closeQuietly(r2)     // Catch: java.lang.Throwable -> L83
        L39:
            if (r1 == 0) goto L45
            java.util.List<com.kwad.sdk.h.a.b> r5 = r4.ayH     // Catch: java.lang.Throwable -> L83
            r5.clear()     // Catch: java.lang.Throwable -> L83
            java.util.List<com.kwad.sdk.h.a.b> r5 = r4.ayH     // Catch: java.lang.Throwable -> L83
            r5.addAll(r1)     // Catch: java.lang.Throwable -> L83
        L45:
            java.util.List<java.lang.String> r5 = r4.ayI     // Catch: java.lang.Throwable -> L83
            r5.clear()     // Catch: java.lang.Throwable -> L83
            java.util.List<com.kwad.sdk.h.a.b> r5 = r4.ayH     // Catch: java.lang.Throwable -> L83
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L83
        L50:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L83
            com.kwad.sdk.h.a.b r1 = (com.kwad.sdk.h.a.b) r1     // Catch: java.lang.Throwable -> L83
            android.content.Context r2 = r4.mContext     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = r1.aCk     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = com.kwad.sdk.core.webview.b.c.a.E(r2, r3)     // Catch: java.lang.Throwable -> L83
            boolean r2 = com.kwad.sdk.utils.q.fr(r2)     // Catch: java.lang.Throwable -> L83
            if (r2 != 0) goto L6f
            java.util.List<com.kwad.sdk.h.a.b> r2 = r4.ayH     // Catch: java.lang.Throwable -> L83
            r2.remove(r1)     // Catch: java.lang.Throwable -> L83
        L6f:
            boolean r2 = r1.aCn     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L50
            java.util.List<java.lang.String> r2 = r4.ayI     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = r1.aCj     // Catch: java.lang.Throwable -> L83
            r2.add(r1)     // Catch: java.lang.Throwable -> L83
            goto L50
        L7b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            return
        L7d:
            r5 = move-exception
            r1 = r2
        L7f:
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)     // Catch: java.lang.Throwable -> L83
            throw r5     // Catch: java.lang.Throwable -> L83
        L83:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.core.webview.b.a.br(android.content.Context):void");
    }

    private WebResourceResponse dY(String str) {
        try {
            b.a aVar = new b.a();
            synchronized (this.ayH) {
                for (String str2 : this.ayI) {
                    WebResourceResponse a = a(str2, str, aVar, true);
                    if (a != null) {
                        return a;
                    }
                }
                return null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private com.kwad.sdk.h.a.b dZ(String str) {
        List<com.kwad.sdk.h.a.b> Eg = Eg();
        if (Eg != null && !Eg.isEmpty()) {
            for (com.kwad.sdk.h.a.b bVar : Eg) {
                if (bc.isEquals(str, bVar.aCj)) {
                    return bVar;
                }
            }
        }
        return null;
    }

    private com.kwad.sdk.h.a.b ea(String str) {
        synchronized (this.ayH) {
            if (!TextUtils.isEmpty(str) && this.ayH.size() > 0) {
                for (com.kwad.sdk.h.a.b bVar : this.ayH) {
                    if (TextUtils.equals(str, bVar.aCj)) {
                        return bVar;
                    }
                }
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(List<com.kwad.sdk.h.a.b> list) {
        synchronized (this.ayH) {
            br(this.mContext);
            for (com.kwad.sdk.h.a.b bVar : this.ayH) {
                if (!list.contains(bVar)) {
                    q.aa(new File(bVar.aCl));
                    this.ayH.remove(bVar);
                } else if (q.fr(com.kwad.sdk.core.webview.b.c.a.E(this.mContext, bVar.aCk))) {
                    list.remove(bVar);
                }
            }
            bq(this.mContext);
        }
    }

    public final long Ee() {
        return this.mInitTime;
    }

    public final void Ef() {
        if (d.zE()) {
            g.execute(new Runnable() { // from class: com.kwad.sdk.core.webview.b.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        List<com.kwad.sdk.h.a.b> Eg = a.this.Eg();
                        if (Eg != null && !Eg.isEmpty()) {
                            a.this.z(Eg);
                            for (com.kwad.sdk.h.a.b bVar : Eg) {
                                if (bVar.packageType == 1 && (bVar.loadType == 1 || (bVar.loadType == 2 && ag.isWifiConnected(a.this.mContext)))) {
                                    a.this.a(bVar);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).gatherException(th);
                    }
                }
            });
        }
    }

    public final WebResourceResponse U(String str, String str2) {
        if (this.mHasInit) {
            String ed = com.kwad.sdk.core.webview.b.c.a.ed(str);
            if (TextUtils.isEmpty(ed)) {
                return dY(str);
            }
            com.kwad.sdk.core.webview.b.c.b.d(str2, ed, str);
            WebResourceResponse V = V(ed, str);
            com.kwad.sdk.core.webview.b.c.b.e(str2, ed, str);
            return V;
        }
        return null;
    }

    public final synchronized void init(final Context context) {
        if (!this.mHasInit && context != null) {
            this.mContext = ServiceProvider.HA();
            this.mHasInit = true;
            g.execute(new aw() { // from class: com.kwad.sdk.core.webview.b.a.1
                @Override // com.kwad.sdk.utils.aw
                public final void doTask() {
                    try {
                        if (d.b(com.kwad.sdk.core.config.c.alN)) {
                            a.this.mInitTime = System.currentTimeMillis();
                            a.this.br(context);
                            a.this.Ef();
                            NetworkMonitor.getInstance().a(a.this.mContext, a.this.ayK);
                        }
                    } catch (Throwable th) {
                        ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).gatherException(th);
                    }
                }
            });
        }
    }
}
