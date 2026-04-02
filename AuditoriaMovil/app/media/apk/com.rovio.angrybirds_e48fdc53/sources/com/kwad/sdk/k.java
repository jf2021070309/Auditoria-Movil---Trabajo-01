package com.kwad.sdk;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.kwad.framework.filedownloader.f.c;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.q;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
/* loaded from: classes.dex */
public final class k implements com.kwad.framework.filedownloader.a.b {
    private final OkHttpClient ahr;
    private final Request.Builder ahs;
    private Request aht;
    private Response ahu;

    /* loaded from: classes.dex */
    public static class a implements c.b {
        private volatile OkHttpClient ahr;
        private OkHttpClient.Builder ahv;

        public a() {
        }

        public a(boolean z) {
            this.ahv = z ? k.xP() : k.xQ();
        }

        @Override // com.kwad.framework.filedownloader.f.c.b
        public final com.kwad.framework.filedownloader.a.b ba(String str) {
            if (this.ahr == null) {
                synchronized (a.class) {
                    if (this.ahr == null) {
                        OkHttpClient.Builder builder = this.ahv;
                        this.ahr = builder != null ? builder.build() : new OkHttpClient();
                        this.ahv = null;
                    }
                }
            }
            return new k(str, this.ahr, (byte) 0);
        }
    }

    private k(String str, OkHttpClient okHttpClient) {
        this(new Request.Builder().url(str), okHttpClient);
    }

    /* synthetic */ k(String str, OkHttpClient okHttpClient, byte b) {
        this(str, okHttpClient);
    }

    private k(Request.Builder builder, OkHttpClient okHttpClient) {
        this.ahs = builder;
        this.ahr = okHttpClient;
    }

    private String bR(String str) {
        String aZ = aZ(DownloadUtils.CONTENT_TYPE);
        String extension = q.getExtension(str);
        String str2 = ".apk";
        if (TextUtils.isEmpty(aZ) || !TextUtils.isEmpty(extension)) {
            if (TextUtils.isEmpty(str)) {
                return System.currentTimeMillis() + ".apk";
            }
            return str;
        }
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(aZ);
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        if (!TextUtils.isEmpty(extensionFromMimeType)) {
            str2 = "." + extensionFromMimeType;
        }
        sb.append(str2);
        return sb.toString();
    }

    private static OkHttpClient.Builder xN() {
        return new OkHttpClient.Builder().connectTimeout(10000L, TimeUnit.MILLISECONDS).addInterceptor(new com.kwad.sdk.j.a()).readTimeout(0L, TimeUnit.MILLISECONDS).connectionPool(new ConnectionPool(6, 60000L, TimeUnit.MILLISECONDS)).retryOnConnectionFailure(true);
    }

    private static OkHttpClient.Builder xO() {
        return new OkHttpClient.Builder().connectTimeout(10000L, TimeUnit.MILLISECONDS).addInterceptor(new com.kwad.sdk.j.a()).protocols(Util.immutableList(Protocol.HTTP_1_1)).readTimeout(0L, TimeUnit.MILLISECONDS).connectionPool(new ConnectionPool(6, 60000L, TimeUnit.MILLISECONDS)).retryOnConnectionFailure(true);
    }

    static /* synthetic */ OkHttpClient.Builder xP() {
        return xO();
    }

    static /* synthetic */ OkHttpClient.Builder xQ() {
        return xN();
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final String aZ(String str) {
        String str2;
        if (!DownloadUtils.CONTENT_DISPOSITION.equals(str)) {
            Response response = this.ahu;
            if (response == null) {
                return null;
            }
            return response.header(str);
        }
        try {
        } catch (Exception e) {
            str2 = "";
        }
        if (TextUtils.isEmpty(com.kwad.framework.filedownloader.f.f.br(this.ahu.header(str)))) {
            List<String> pathSegments = this.ahu.request().url().pathSegments();
            str2 = pathSegments.get(pathSegments.size() - 1);
            return "attachment; filename=\"" + bR(str2) + "\"";
        }
        return this.ahu.header(str);
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final void addHeader(String str, String str2) {
        this.ahs.addHeader(str, str2);
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final void execute() {
        if (this.aht == null) {
            this.aht = this.ahs.build();
        }
        this.ahu = this.ahr.newCall(this.aht).execute();
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final InputStream getInputStream() {
        Response response = this.ahu;
        if (response != null) {
            return ((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).wrapInputStream(response.body().byteStream());
        }
        throw new IllegalStateException("Please invoke #execute first!");
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final int getResponseCode() {
        Response response = this.ahu;
        if (response != null) {
            return response.code();
        }
        throw new IllegalStateException("Please invoke #execute first!");
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final Map<String, List<String>> uh() {
        if (this.aht == null) {
            this.aht = this.ahs.build();
        }
        return this.aht.headers().toMultimap();
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final Map<String, List<String>> ui() {
        Response response = this.ahu;
        if (response == null) {
            return null;
        }
        return response.headers().toMultimap();
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final void uj() {
        this.aht = null;
        Response response = this.ahu;
        if (response != null && response.body() != null) {
            com.kwad.sdk.crash.utils.b.closeQuietly(this.ahu.body());
        }
        this.ahu = null;
    }
}
