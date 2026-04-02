package com.amazon.aps.iva.j9;

import android.webkit.WebResourceError;
import com.amazon.aps.iva.j9.g0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* compiled from: WebResourceErrorImpl.java */
/* loaded from: classes.dex */
public final class e0 extends com.amazon.aps.iva.ab.a {
    public WebResourceError a;
    public WebResourceErrorBoundaryInterface b;

    public e0(InvocationHandler invocationHandler) {
        this.b = (WebResourceErrorBoundaryInterface) com.amazon.aps.iva.hf0.a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    public final CharSequence s() {
        f0.a.getClass();
        if (this.a == null) {
            com.amazon.aps.iva.k.w wVar = g0.a.a;
            this.a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) wVar.b).convertWebResourceError(Proxy.getInvocationHandler(this.b));
        }
        return c.e(this.a);
    }

    public final int t() {
        f0.b.getClass();
        if (this.a == null) {
            com.amazon.aps.iva.k.w wVar = g0.a.a;
            this.a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) wVar.b).convertWebResourceError(Proxy.getInvocationHandler(this.b));
        }
        return c.f(this.a);
    }

    public e0(WebResourceError webResourceError) {
        this.a = webResourceError;
    }
}
