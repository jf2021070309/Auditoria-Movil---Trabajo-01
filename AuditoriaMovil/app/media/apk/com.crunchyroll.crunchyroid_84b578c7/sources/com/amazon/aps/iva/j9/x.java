package com.amazon.aps.iva.j9;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
/* compiled from: JavaScriptReplyProxyImpl.java */
/* loaded from: classes.dex */
public final class x implements Callable<Object> {
    public final /* synthetic */ JsReplyProxyBoundaryInterface a;

    public x(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.a = jsReplyProxyBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new y(this.a);
    }
}
