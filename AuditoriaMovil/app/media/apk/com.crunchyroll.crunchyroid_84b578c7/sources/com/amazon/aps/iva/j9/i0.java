package com.amazon.aps.iva.j9;

import android.graphics.Path;
import android.webkit.WebView;
import com.amazon.aps.iva.ma.g;
import com.amazon.aps.iva.me0.a;
import java.util.ArrayList;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* compiled from: WebViewProviderFactoryAdapter.java */
/* loaded from: classes.dex */
public final class i0 implements h0, a.c {
    public final Object b;

    public /* synthetic */ i0(Object obj) {
        this.b = obj;
    }

    public final void a(Path path) {
        List list = (List) this.b;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                com.amazon.aps.iva.ba.t tVar = (com.amazon.aps.iva.ba.t) list.get(size);
                g.a aVar = com.amazon.aps.iva.ma.g.a;
                if (tVar != null && !tVar.a) {
                    com.amazon.aps.iva.ma.g.a(path, tVar.d.l() / 100.0f, tVar.e.l() / 100.0f, tVar.f.l() / 360.0f);
                }
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.j9.h0
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) com.amazon.aps.iva.hf0.a.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // com.amazon.aps.iva.j9.h0
    public final String[] d() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // com.amazon.aps.iva.j9.h0
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) com.amazon.aps.iva.hf0.a.a(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getWebkitToCompatConverter());
    }

    @Override // com.amazon.aps.iva.me0.a.c
    public final Iterable h(Object obj) {
        com.amazon.aps.iva.fc0.n nVar = (com.amazon.aps.iva.fc0.n) this.b;
        com.amazon.aps.iva.yb0.j.f(nVar, "$tmp0");
        return (Iterable) nVar.invoke((com.amazon.aps.iva.fc0.d) obj);
    }

    public i0(com.amazon.aps.iva.qo.w wVar) {
        this.b = wVar.u4();
    }

    public i0() {
        this.b = new ArrayList();
    }

    public i0(com.amazon.aps.iva.zj.e eVar) {
        this.b = eVar;
    }
}
