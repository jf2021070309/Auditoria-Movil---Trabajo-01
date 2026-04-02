package com.kwad.components.core.c;

import com.kwad.sdk.core.response.model.AdTemplate;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class f {
    private static volatile f IQ;
    private ConcurrentHashMap<String, WeakReference<Object>> IP = new ConcurrentHashMap<>();

    private static String N(AdTemplate adTemplate) {
        long cd = com.kwad.sdk.core.response.b.d.cd(adTemplate);
        long cu = com.kwad.sdk.core.response.b.d.cu(adTemplate);
        return cd + "-" + cu;
    }

    private static String b(g gVar) {
        String mz = gVar.mz();
        String mF = gVar.mF();
        return mz + "-" + mF;
    }

    public static f my() {
        if (IQ == null) {
            synchronized (f.class) {
                if (IQ == null) {
                    IQ = new f();
                }
            }
        }
        return IQ;
    }

    public final void M(AdTemplate adTemplate) {
        this.IP.remove(N(adTemplate));
    }

    public final boolean a(g gVar) {
        String b = b(gVar);
        com.kwad.sdk.core.e.c.d("AdMemCachePool", "contains key: " + b);
        boolean z = false;
        if (this.IP.containsKey(b)) {
            WeakReference<Object> weakReference = this.IP.get(b);
            if (weakReference != null && weakReference.get() != null) {
                z = true;
            }
            if (z) {
                com.kwad.sdk.core.e.c.d("AdMemCachePool", "contains ad: " + weakReference.get());
            }
            return z;
        }
        return false;
    }

    public final void add(Object obj) {
        if (obj instanceof com.kwad.components.core.internal.api.a) {
            this.IP.put(N(((com.kwad.components.core.internal.api.a) obj).getAdTemplate()), new WeakReference<>(obj));
        }
    }
}
