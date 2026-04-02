package com.kwad.sdk.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.kwad.sdk.core.c.d;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.InstalledAppInfoManager;
import com.kwad.sdk.utils.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class b {
    private static final Map<String, String> ajD = new HashMap();
    private final AtomicBoolean ajE;
    private final AtomicBoolean ajF;
    private final List<String> ajG;
    private final List<String> ajH;
    private final BroadcastReceiver ajI;
    private Context mContext;
    private final List<com.kwad.sdk.b.a> mListeners;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private static final b ajK = new b((byte) 0);
    }

    private b() {
        this.ajE = new AtomicBoolean();
        this.ajF = new AtomicBoolean();
        this.mListeners = new CopyOnWriteArrayList();
        this.ajG = new CopyOnWriteArrayList();
        this.ajH = new CopyOnWriteArrayList();
        this.ajI = new BroadcastReceiver() { // from class: com.kwad.sdk.b.b.1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                Uri data;
                if (intent == null) {
                    return;
                }
                try {
                    String action = intent.getAction();
                    if (TextUtils.isEmpty(action) || (data = intent.getData()) == null) {
                        return;
                    }
                    String schemeSpecificPart = data.getSchemeSpecificPart();
                    if (TextUtils.isEmpty(schemeSpecificPart)) {
                        return;
                    }
                    b.this.mContext = context;
                    if (TextUtils.equals("android.intent.action.PACKAGE_ADDED", action)) {
                        b.this.v(context, schemeSpecificPart);
                    } else if (TextUtils.equals("android.intent.action.PACKAGE_REMOVED", action)) {
                        b.this.cc(schemeSpecificPart);
                    }
                } catch (Throwable th) {
                    c.printStackTrace(th);
                }
            }
        };
    }

    /* synthetic */ b(byte b) {
        this();
    }

    private synchronized void aH(Context context) {
        if (this.ajE.get()) {
            return;
        }
        y(context, "com.smile.gifmaker");
        y(context, "com.kuaishou.nebula");
        y(context, "com.tencent.mm");
        this.ajE.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cc(String str) {
        c.d("AppInstallManager", "unInstallApp packageName: " + str);
        ch(str);
        cg(str);
        cd(str);
    }

    private void cd(String str) {
        com.kwad.sdk.core.c.b.AT();
        if (com.kwad.sdk.core.c.b.isAppOnForeground()) {
            ce(str);
            return;
        }
        this.ajH.add(str);
        com.kwad.sdk.core.c.b.AT();
        com.kwad.sdk.core.c.b.a(new d() { // from class: com.kwad.sdk.b.b.3
            @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
            public final void onBackToForeground() {
                if (b.this.ajH.size() > 0) {
                    for (int i = 0; i < b.this.ajH.size(); i++) {
                        b.ce((String) b.this.ajH.get(i));
                    }
                    b.this.ajH.clear();
                }
                com.kwad.sdk.core.c.b.AT();
                com.kwad.sdk.core.c.b.b((com.kwad.sdk.core.c.c) this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ce(String str) {
        try {
            InstalledAppInfoManager.AppPackageInfo appPackageInfo = new InstalledAppInfoManager.AppPackageInfo();
            appPackageInfo.packageName = str;
            ((com.kwad.sdk.service.a.b) ServiceProvider.get(com.kwad.sdk.service.a.b.class)).e(InstalledAppInfoManager.a(appPackageInfo), 2);
        } catch (Throwable th) {
            c.printStackTrace(th);
        }
    }

    private void cf(String str) {
        for (com.kwad.sdk.b.a aVar : this.mListeners) {
            try {
                aVar.S(str);
            } catch (Throwable th) {
                c.printStackTrace(th);
            }
        }
    }

    private void cg(String str) {
        Iterator<com.kwad.sdk.b.a> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private static void ch(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -973170826) {
            if (str.equals("com.tencent.mm")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 473713875) {
            if (hashCode == 1659293491 && str.equals("com.smile.gifmaker")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("com.kuaishou.nebula")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            ajD.put("com.smile.gifmaker", "");
        } else if (c == 1) {
            ajD.put("com.kuaishou.nebula", "");
        } else if (c != 2) {
        } else {
            ajD.put("com.tencent.mm", "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(Context context, String str) {
        c.d("AppInstallManager", "installApp packageName: " + str);
        y(context, str);
        cf(str);
        w(context, str);
    }

    private void w(Context context, String str) {
        com.kwad.sdk.core.c.b.AT();
        if (com.kwad.sdk.core.c.b.isAppOnForeground()) {
            x(context, str);
            return;
        }
        this.ajG.add(str);
        com.kwad.sdk.core.c.b.AT();
        com.kwad.sdk.core.c.b.a(new d() { // from class: com.kwad.sdk.b.b.2
            @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
            public final void onBackToForeground() {
                if (b.this.ajG.size() > 0) {
                    for (int i = 0; i < b.this.ajG.size(); i++) {
                        b.x(b.this.mContext, (String) b.this.ajG.get(i));
                    }
                    b.this.ajG.clear();
                }
                com.kwad.sdk.core.c.b.AT();
                com.kwad.sdk.core.c.b.b((com.kwad.sdk.core.c.c) this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                ((com.kwad.sdk.service.a.b) ServiceProvider.get(com.kwad.sdk.service.a.b.class)).e(InstalledAppInfoManager.a(InstalledAppInfoManager.a(packageInfo, packageManager)), 1);
            }
        } catch (Throwable th) {
            c.printStackTrace(th);
        }
    }

    private static void y(Context context, String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -973170826) {
            if (str.equals("com.tencent.mm")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 473713875) {
            if (hashCode == 1659293491 && str.equals("com.smile.gifmaker")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("com.kuaishou.nebula")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            ajD.put("com.smile.gifmaker", k.J(context, "com.smile.gifmaker"));
        } else if (c == 1) {
            ajD.put("com.kuaishou.nebula", k.J(context, "com.kuaishou.nebula"));
        } else if (c != 2) {
        } else {
            ajD.put("com.tencent.mm", k.J(context, "com.tencent.mm"));
        }
    }

    public static b yy() {
        return a.ajK;
    }

    public final void a(com.kwad.sdk.b.a aVar) {
        if (aVar == null) {
            return;
        }
        checkInit();
        this.mListeners.add(aVar);
    }

    public final void b(com.kwad.sdk.b.a aVar) {
        if (aVar == null) {
            return;
        }
        checkInit();
        this.mListeners.remove(aVar);
    }

    public final synchronized void checkInit() {
        try {
            if (this.ajF.get()) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addDataScheme("package");
            ServiceProvider.HA().registerReceiver(this.ajI, intentFilter);
            this.ajF.set(true);
        } catch (Throwable th) {
            c.printStackTraceOnly(th);
        }
    }

    public final String getVersion(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        aH(context);
        return ajD.get(str);
    }
}
