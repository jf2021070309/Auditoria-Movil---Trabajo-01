package com.kwad.framework.filedownloader.a;

import com.kwad.framework.filedownloader.f.c;
import com.kwad.sdk.api.core.TLSConnectionUtils;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.h;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class c implements com.kwad.framework.filedownloader.a.b {
    protected URLConnection abR;

    /* loaded from: classes.dex */
    public static class a {
        private Proxy abS;
        private Integer abT;
        private Integer abU;
    }

    /* loaded from: classes.dex */
    public static class b implements c.b {
        private final a abV;

        public b() {
            this(null);
        }

        private b(a aVar) {
            this.abV = null;
        }

        @Override // com.kwad.framework.filedownloader.f.c.b
        public final com.kwad.framework.filedownloader.a.b ba(String str) {
            return new c(str, this.abV);
        }
    }

    public c(String str, a aVar) {
        this(new URL(str), aVar);
    }

    private c(URL url, a aVar) {
        this.abR = (aVar == null || aVar.abS == null) ? url.openConnection() : url.openConnection(aVar.abS);
        try {
            TLSConnectionUtils.wrapHttpURLConnection(this.abR);
        } catch (Throwable th) {
        }
        if (aVar != null) {
            if (aVar.abT != null) {
                this.abR.setReadTimeout(aVar.abT.intValue());
            }
            if (aVar.abU != null) {
                this.abR.setConnectTimeout(aVar.abU.intValue());
            }
        }
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final String aZ(String str) {
        return this.abR.getHeaderField(str);
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final void addHeader(String str, String str2) {
        this.abR.addRequestProperty(str, str2);
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final void execute() {
        this.abR.connect();
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final InputStream getInputStream() {
        return ((h) ServiceProvider.get(h.class)).wrapInputStream(this.abR.getInputStream());
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final int getResponseCode() {
        URLConnection uRLConnection = this.abR;
        if (uRLConnection instanceof HttpURLConnection) {
            try {
                return ((HttpURLConnection) uRLConnection).getResponseCode();
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
        return 0;
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final Map<String, List<String>> uh() {
        return this.abR.getRequestProperties();
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final Map<String, List<String>> ui() {
        return this.abR.getHeaderFields();
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final void uj() {
    }
}
