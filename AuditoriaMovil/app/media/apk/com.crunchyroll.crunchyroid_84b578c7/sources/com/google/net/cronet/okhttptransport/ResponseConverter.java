package com.google.net.cronet.okhttptransport;

import com.amazon.aps.iva.ef0.d0;
import com.amazon.aps.iva.ef0.r;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Uninterruptibles;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.chromium.net.UrlResponseInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ResponseConverter {
    private static final String CONTENT_ENCODING_HEADER_NAME = "Content-Encoding";
    private static final String CONTENT_LENGTH_HEADER_NAME = "Content-Length";
    private static final String CONTENT_TYPE_HEADER_NAME = "Content-Type";
    private static final ImmutableSet<String> ENCODINGS_HANDLED_BY_CRONET = ImmutableSet.of("br", "deflate", "gzip", "x-gzip");
    private static final Splitter COMMA_SPLITTER = Splitter.on(',').trimResults().omitEmptyStrings();

    private static Protocol convertProtocol(String str) {
        if (str.contains("quic")) {
            return Protocol.QUIC;
        }
        if (str.contains("h3")) {
            return Protocol.QUIC;
        }
        if (str.contains("spdy")) {
            return Protocol.HTTP_2;
        }
        if (str.contains("h2")) {
            return Protocol.HTTP_2;
        }
        if (str.contains("http1.1")) {
            return Protocol.HTTP_1_1;
        }
        return Protocol.HTTP_1_0;
    }

    private static ResponseBody createResponseBody(Request request, int i, String str, String str2, d0 d0Var) throws IOException {
        long parseLong;
        MediaType mediaType;
        if (request.method().equals("HEAD")) {
            parseLong = 0;
        } else {
            if (str2 != null) {
                try {
                    parseLong = Long.parseLong(str2);
                } catch (NumberFormatException unused) {
                }
            }
            parseLong = -1;
        }
        if ((i != 204 && i != 205) || parseLong <= 0) {
            if (str != null) {
                mediaType = MediaType.parse(str);
            } else {
                mediaType = null;
            }
            return ResponseBody.create(mediaType, parseLong, r.b(d0Var));
        }
        throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + str2);
    }

    private static <T> T getFutureValue(Future<T> future) throws IOException {
        try {
            return (T) Uninterruptibles.getUninterruptibly(future);
        } catch (ExecutionException e) {
            throw new IOException(e);
        }
    }

    private static String getLastHeaderValue(String str, UrlResponseInfo urlResponseInfo) {
        List<String> list = urlResponseInfo.getAllHeaders().get(str);
        if (list != null && !list.isEmpty()) {
            return (String) Iterables.getLast(list);
        }
        return null;
    }

    private static <K, V> V getOrDefault(Map<K, V> map, K k, V v) {
        V v2 = map.get(k);
        if (v2 == null) {
            return (V) Preconditions.checkNotNull(v);
        }
        return v2;
    }

    /* renamed from: toResponse */
    public Response lambda$toResponseAsync$0(Request request, OkHttpBridgeRequestCallback okHttpBridgeRequestCallback) throws IOException {
        boolean z;
        String str;
        boolean z2;
        Response.Builder builder = new Response.Builder();
        UrlResponseInfo urlResponseInfo = (UrlResponseInfo) getFutureValue(okHttpBridgeRequestCallback.getUrlResponseInfo());
        String lastHeaderValue = getLastHeaderValue("Content-Type", urlResponseInfo);
        ArrayList arrayList = new ArrayList();
        for (String str2 : (List) getOrDefault(urlResponseInfo.getAllHeaders(), "Content-Encoding", Collections.emptyList())) {
            Iterables.addAll(arrayList, COMMA_SPLITTER.split(str2));
        }
        if (!arrayList.isEmpty() && ENCODINGS_HANDLED_BY_CRONET.containsAll(arrayList)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str = getLastHeaderValue("Content-Length", urlResponseInfo);
        } else {
            str = null;
        }
        builder.request(request).code(urlResponseInfo.getHttpStatusCode()).message(urlResponseInfo.getHttpStatusText()).protocol(convertProtocol(urlResponseInfo.getNegotiatedProtocol())).body(createResponseBody(request, urlResponseInfo.getHttpStatusCode(), lastHeaderValue, str, (d0) getFutureValue(okHttpBridgeRequestCallback.getBodySource())));
        for (Map.Entry<String, String> entry : urlResponseInfo.getAllHeadersAsList()) {
            if (!z && (Ascii.equalsIgnoreCase(entry.getKey(), "Content-Length") || Ascii.equalsIgnoreCase(entry.getKey(), "Content-Encoding"))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                builder.addHeader(entry.getKey(), entry.getValue());
            }
        }
        return builder.build();
    }

    public ListenableFuture<Response> toResponseAsync(final Request request, final OkHttpBridgeRequestCallback okHttpBridgeRequestCallback) {
        return Futures.whenAllComplete(okHttpBridgeRequestCallback.getUrlResponseInfo(), okHttpBridgeRequestCallback.getBodySource()).call(new Callable() { // from class: com.google.net.cronet.okhttptransport.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Response lambda$toResponseAsync$0;
                lambda$toResponseAsync$0 = ResponseConverter.this.lambda$toResponseAsync$0(request, okHttpBridgeRequestCallback);
                return lambda$toResponseAsync$0;
            }
        }, MoreExecutors.directExecutor());
    }
}
