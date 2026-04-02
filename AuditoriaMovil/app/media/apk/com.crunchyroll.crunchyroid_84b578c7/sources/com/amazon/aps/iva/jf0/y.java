package com.amazon.aps.iva.jf0;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
/* compiled from: RequestBuilder.java */
/* loaded from: classes4.dex */
public final class y {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final HttpUrl b;
    public String c;
    public HttpUrl.Builder d;
    public final Request.Builder e = new Request.Builder();
    public final Headers.Builder f;
    public MediaType g;
    public final boolean h;
    public final MultipartBody.Builder i;
    public final FormBody.Builder j;
    public RequestBody k;

    /* compiled from: RequestBuilder.java */
    /* loaded from: classes4.dex */
    public static class a extends RequestBody {
        public final RequestBody a;
        public final MediaType b;

        public a(RequestBody requestBody, MediaType mediaType) {
            this.a = requestBody;
            this.b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() throws IOException {
            return this.a.contentLength();
        }

        @Override // okhttp3.RequestBody
        public final MediaType contentType() {
            return this.b;
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(com.amazon.aps.iva.ef0.g gVar) throws IOException {
            this.a.writeTo(gVar);
        }
    }

    public y(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = httpUrl;
        this.c = str2;
        this.g = mediaType;
        this.h = z;
        if (headers != null) {
            this.f = headers.newBuilder();
        } else {
            this.f = new Headers.Builder();
        }
        if (z2) {
            this.j = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    public final void a(String str, String str2) {
        if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                this.g = MediaType.get(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(com.amazon.aps.iva.oa.a.a("Malformed content type: ", str2), e);
            }
        }
        this.f.add(str, str2);
    }

    public final void b(String str, String str2, boolean z) {
        String str3 = this.c;
        if (str3 != null) {
            HttpUrl httpUrl = this.b;
            HttpUrl.Builder newBuilder = httpUrl.newBuilder(str3);
            this.d = newBuilder;
            if (newBuilder != null) {
                this.c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + this.c);
            }
        }
        if (z) {
            this.d.addEncodedQueryParameter(str, str2);
        } else {
            this.d.addQueryParameter(str, str2);
        }
    }
}
