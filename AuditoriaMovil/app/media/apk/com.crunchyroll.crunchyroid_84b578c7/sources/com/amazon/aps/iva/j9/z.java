package com.amazon.aps.iva.j9;

import android.webkit.SafeBrowsingResponse;
import com.amazon.aps.iva.j9.a;
import com.amazon.aps.iva.j9.g0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* compiled from: SafeBrowsingResponseImpl.java */
/* loaded from: classes.dex */
public final class z extends com.amazon.aps.iva.ab.a {
    public SafeBrowsingResponse a;
    public SafeBrowsingResponseBoundaryInterface b;

    public z(InvocationHandler invocationHandler) {
        this.b = (SafeBrowsingResponseBoundaryInterface) com.amazon.aps.iva.hf0.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    public final void s() {
        a.f fVar = f0.c;
        if (fVar.b()) {
            if (this.a == null) {
                com.amazon.aps.iva.k.w wVar = g0.a.a;
                this.a = j0.a(((WebkitToCompatConverterBoundaryInterface) wVar.b).convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.b)));
            }
            l.e(this.a, true);
        } else if (fVar.c()) {
            if (this.b == null) {
                com.amazon.aps.iva.k.w wVar2 = g0.a.a;
                this.b = (SafeBrowsingResponseBoundaryInterface) com.amazon.aps.iva.hf0.a.a(SafeBrowsingResponseBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) wVar2.b).convertSafeBrowsingResponse(this.a));
            }
            this.b.showInterstitial(true);
        } else {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }

    public z(SafeBrowsingResponse safeBrowsingResponse) {
        this.a = safeBrowsingResponse;
    }
}
