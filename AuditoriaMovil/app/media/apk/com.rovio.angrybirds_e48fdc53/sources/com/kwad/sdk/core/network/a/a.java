package com.kwad.sdk.core.network.a;

import android.util.Log;
import com.kwad.sdk.export.proxy.AdHttpProxy;
import com.kwad.sdk.g;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.f;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class a {
    private static AdHttpProxy apT;

    /* renamed from: com.kwad.sdk.core.network.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0256a {
        public String msg;
    }

    private static boolean Bj() {
        f fVar = (f) ServiceProvider.get(f.class);
        if (fVar != null) {
            return fVar.xI();
        }
        return false;
    }

    public static boolean a(String str, OutputStream outputStream, C0256a c0256a, int i) {
        boolean Bj = Bj();
        AdHttpProxy adHttpProxy = apT;
        if (adHttpProxy == null) {
            com.kwad.sdk.core.e.c.d("VideoCacheHelper", "isAdCacheEnable:" + Bj);
            adHttpProxy = Bj ? g.wW() : new com.kwad.sdk.core.network.c.a();
            apT = adHttpProxy;
        }
        if (com.kwad.framework.b.a.mp.booleanValue()) {
            com.kwad.sdk.core.e.c.d("VideoCacheHelper", adHttpProxy instanceof com.kwad.sdk.core.network.c.b ? "okHttp" : "Http");
        }
        try {
            com.kwad.sdk.core.e.c.d("VideoCacheHelper", "downloadUrlToStream success size:" + i + " url:" + str);
            adHttpProxy.downloadUrlToStream(str, outputStream, i);
            return true;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.d("VideoCacheHelper", Log.getStackTraceString(e));
            c0256a.msg = e.getMessage();
            return false;
        }
    }
}
