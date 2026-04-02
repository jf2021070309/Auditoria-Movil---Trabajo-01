package com.amazon.aps.iva.j9;

import android.webkit.WebMessagePort;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
/* compiled from: WebMessagePortImpl.java */
/* loaded from: classes.dex */
public final class d0 extends com.amazon.aps.iva.i9.e {
    public WebMessagePort a;
    public final WebMessagePortBoundaryInterface b;

    public d0(WebMessagePort webMessagePort) {
        this.a = webMessagePort;
    }

    public d0(InvocationHandler invocationHandler) {
        this.b = (WebMessagePortBoundaryInterface) com.amazon.aps.iva.hf0.a.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
