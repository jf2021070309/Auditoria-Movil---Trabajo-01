package com.kwad.sdk.core.videocache;

import com.kwad.sdk.utils.ao;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
final class i extends ProxySelector {
    private static final List<Proxy> awR = Arrays.asList(Proxy.NO_PROXY);
    private final ProxySelector awS;
    private final String awT;
    private final int awU;

    private i(ProxySelector proxySelector, String str, int i) {
        this.awS = (ProxySelector) ao.checkNotNull(proxySelector);
        this.awT = ao.fF(str);
        this.awU = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void install(String str, int i) {
        ProxySelector.setDefault(new i(ProxySelector.getDefault(), str, i));
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.awS.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        return this.awT.equals(uri.getHost()) && this.awU == uri.getPort() ? awR : this.awS.select(uri);
    }
}
