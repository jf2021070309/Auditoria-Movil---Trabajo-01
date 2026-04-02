package com.fyber.inneractive.sdk.player.a;

import android.content.Context;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.h.o;
import com.fyber.inneractive.sdk.player.a.c;
import com.fyber.inneractive.sdk.player.a.g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class n implements c.InterfaceC0048c {
    private static final n g = new n();
    public Context a;
    public Thread b;
    private c d;
    private boolean e = false;
    private List<String> f = new CopyOnWriteArrayList();
    public Runnable c = new Runnable() { // from class: com.fyber.inneractive.sdk.player.a.n.1
        @Override // java.lang.Runnable
        public final void run() {
            File a = n.a(n.this);
            if (a != null) {
                try {
                    IAlog.b("VideoCache opening the cache in directory - %s", a);
                    n.this.d = c.a(a);
                    n.this.d.d();
                    n.this.d = c.a(a);
                    IAlog.b("VideoCache opened the cache in directory - %s current size is %d", a, Long.valueOf(n.this.d.a()));
                    n.this.d.c = n.this;
                    n.c(n.this);
                    n.d(n.this);
                } catch (Throwable th) {
                    o.a("Failed to open cache directory", th.getMessage(), null, null);
                    IAlog.a("Failed to open cache directory", th, new Object[0]);
                }
            }
        }
    };

    static /* synthetic */ boolean c(n nVar) {
        nVar.e = true;
        return true;
    }

    static /* synthetic */ Thread d(n nVar) {
        nVar.b = null;
        return null;
    }

    public static n a() {
        return g;
    }

    private n() {
    }

    private static boolean a(File file) {
        return file != null && file.getFreeSpace() > 52428800;
    }

    public static File a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if (com.fyber.inneractive.sdk.util.l.p() != null && com.fyber.inneractive.sdk.util.l.d("android.permission.WRITE_EXTERNAL_STORAGE") && "mounted".equals(com.fyber.inneractive.sdk.util.l.y())) {
            String y = com.fyber.inneractive.sdk.util.l.y();
            if (("mounted".equals(y) || "mounted_ro".equals(y)) && a(context.getExternalCacheDir())) {
                return new File(context.getExternalCacheDir(), str);
            }
        }
        if (a(context.getCacheDir())) {
            return new File(context.getCacheDir(), str);
        }
        return null;
    }

    public final boolean b() {
        boolean z;
        if (this.e && f.a().e) {
            if (!p.a()) {
                if (Build.VERSION.SDK_INT >= 23) {
                    NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
                    if (Build.VERSION.SDK_INT >= 24) {
                        z = networkSecurityPolicy.isCleartextTrafficPermitted("127.0.0.1");
                    } else {
                        z = networkSecurityPolicy.isCleartextTrafficPermitted();
                    }
                } else {
                    z = true;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final g a(int i, String str, s sVar, g.e eVar) {
        g a = g.a(this.d, str, i, sVar, eVar);
        this.f.add(a.d());
        return a;
    }

    public static String a(a aVar) {
        f a = f.a();
        if (a.e && aVar.b()) {
            a.f.add(aVar);
            String name = aVar.a().getName();
            if (name.contains(".")) {
                name = name.split("[.]{1}")[0];
            }
            return String.format(Locale.ENGLISH, "http://%s:%d/%s?_t=%d", "127.0.0.1", Integer.valueOf(a.c), name, Long.valueOf(System.currentTimeMillis()));
        }
        return null;
    }

    public final void b(String str) {
        a aVar;
        f a = f.a();
        Iterator<a> it = a.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (aVar.g.equalsIgnoreCase(str)) {
                break;
            }
        }
        if (aVar != null) {
            a.f.remove(aVar);
        }
        this.f.remove(str);
    }

    @Override // com.fyber.inneractive.sdk.player.a.c.InterfaceC0048c
    public final boolean a(String str) {
        for (String str2 : this.f) {
            if (str2.equalsIgnoreCase(str)) {
                return false;
            }
        }
        for (a aVar : f.a().f) {
            if (aVar.a().getName().contains(str)) {
                IAlog.a(String.format("MediaCacheStreamer found %s which is in use, rejecting eviction", str), new Object[0]);
                return false;
            }
        }
        return true;
    }

    static /* synthetic */ File a(n nVar) {
        return a(nVar.a, "fyb.vamp.vid.cache");
    }
}
