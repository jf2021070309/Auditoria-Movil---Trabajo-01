package com.amazon.aps.iva.j9;

import android.content.Context;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.io.File;
/* compiled from: ApiHelperForN.java */
/* loaded from: classes.dex */
public final class d {
    public static boolean a(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowContentAccess();
    }

    public static boolean b(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowFileAccess();
    }

    public static boolean c(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getBlockNetworkLoads();
    }

    public static int d(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getCacheMode();
    }

    public static File e(Context context) {
        return context.getDataDir();
    }

    public static int f(WebSettings webSettings) {
        return webSettings.getDisabledActionModeMenuItems();
    }

    public static ServiceWorkerController g() {
        return ServiceWorkerController.getInstance();
    }

    public static ServiceWorkerWebSettings h(ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }

    public static a0 i(ServiceWorkerController serviceWorkerController) {
        h(serviceWorkerController);
        return new a0();
    }

    public static boolean j(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isRedirect();
    }

    public static void k(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setAllowContentAccess(z);
    }

    public static void l(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setAllowFileAccess(z);
    }

    public static void m(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setBlockNetworkLoads(z);
    }

    public static void n(ServiceWorkerWebSettings serviceWorkerWebSettings, int i) {
        serviceWorkerWebSettings.setCacheMode(i);
    }

    public static void o(WebSettings webSettings, int i) {
        webSettings.setDisabledActionModeMenuItems(i);
    }

    public static void p(ServiceWorkerController serviceWorkerController, ServiceWorkerClient serviceWorkerClient) {
        serviceWorkerController.setServiceWorkerClient(serviceWorkerClient);
    }

    public static void q(ServiceWorkerController serviceWorkerController, com.amazon.aps.iva.i9.b bVar) {
        serviceWorkerController.setServiceWorkerClient(new w());
    }
}
