package com.amazon.aps.iva.j9;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.amazon.aps.iva.i9.e;
import com.amazon.aps.iva.i9.g;
import com.amazon.aps.iva.j9.g0;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* compiled from: ApiHelperForM.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: ApiHelperForM.java */
    /* loaded from: classes.dex */
    public class a extends WebMessagePort.WebMessageCallback {
        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            c.d(webMessage);
            throw null;
        }
    }

    /* compiled from: ApiHelperForM.java */
    /* loaded from: classes.dex */
    public class b extends WebMessagePort.WebMessageCallback {
        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            c.d(webMessage);
            throw null;
        }
    }

    /* compiled from: ApiHelperForM.java */
    /* renamed from: com.amazon.aps.iva.j9.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0409c extends WebView.VisualStateCallback {
        @Override // android.webkit.WebView.VisualStateCallback
        public final void onComplete(long j) {
            throw null;
        }
    }

    public static void a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage b(com.amazon.aps.iva.i9.d dVar) {
        WebMessagePort[] webMessagePortArr;
        String a2 = dVar.a();
        com.amazon.aps.iva.i9.e[] eVarArr = dVar.a;
        if (eVarArr == null) {
            webMessagePortArr = null;
        } else {
            int length = eVarArr.length;
            WebMessagePort[] webMessagePortArr2 = new WebMessagePort[length];
            for (int i = 0; i < length; i++) {
                d0 d0Var = (d0) eVarArr[i];
                if (d0Var.a == null) {
                    com.amazon.aps.iva.k.w wVar = g0.a.a;
                    d0Var.a = (WebMessagePort) ((WebkitToCompatConverterBoundaryInterface) wVar.b).convertWebMessagePort(Proxy.getInvocationHandler(d0Var.b));
                }
                webMessagePortArr2[i] = d0Var.a;
            }
            webMessagePortArr = webMessagePortArr2;
        }
        return new WebMessage(a2, webMessagePortArr);
    }

    public static WebMessagePort[] c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static com.amazon.aps.iva.i9.d d(WebMessage webMessage) {
        com.amazon.aps.iva.i9.e[] eVarArr;
        String data = webMessage.getData();
        WebMessagePort[] ports = webMessage.getPorts();
        if (ports == null) {
            eVarArr = null;
        } else {
            com.amazon.aps.iva.i9.e[] eVarArr2 = new com.amazon.aps.iva.i9.e[ports.length];
            for (int i = 0; i < ports.length; i++) {
                eVarArr2[i] = new d0(ports[i]);
            }
            eVarArr = eVarArr2;
        }
        return new com.amazon.aps.iva.i9.d(data, eVarArr);
    }

    public static CharSequence e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(WebView webView, long j, g.a aVar) {
        webView.postVisualStateCallback(j, new C0409c());
    }

    public static void j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(WebSettings webSettings, boolean z) {
        webSettings.setOffscreenPreRaster(z);
    }

    public static void l(WebMessagePort webMessagePort, e.a aVar) {
        webMessagePort.setWebMessageCallback(new a());
    }

    public static void m(WebMessagePort webMessagePort, e.a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new b(), handler);
    }
}
