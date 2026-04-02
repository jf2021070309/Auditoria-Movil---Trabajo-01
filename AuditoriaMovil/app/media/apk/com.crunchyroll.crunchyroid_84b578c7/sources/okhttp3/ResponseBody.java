package okhttp3;

import com.amazon.aps.iva.a60.b;
import com.amazon.aps.iva.ef0.h;
import com.amazon.aps.iva.ef0.i;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.oe0.a;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.internal.Util;
/* compiled from: ResponseBody.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0007¢\u0006\u0004\b \u0010!JB\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0005H&J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Lcom/amazon/aps/iva/ef0/h;", "consumer", "", "sizeMapper", "consumeSource", "(Lcom/amazon/aps/iva/xb0/l;Lcom/amazon/aps/iva/xb0/l;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Ljava/io/InputStream;", "byteStream", FirebaseAnalytics.Param.SOURCE, "", "bytes", "Lcom/amazon/aps/iva/ef0/i;", "byteString", "Ljava/io/Reader;", "charStream", "", "string", "Lcom/amazon/aps/iva/kb0/q;", "close", "reader", "Ljava/io/Reader;", "<init>", "()V", "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    /* compiled from: ResponseBody.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "", "cbuf", "", "off", "len", "read", "Lcom/amazon/aps/iva/kb0/q;", "close", "Lcom/amazon/aps/iva/ef0/h;", FirebaseAnalytics.Param.SOURCE, "Lcom/amazon/aps/iva/ef0/h;", "Ljava/nio/charset/Charset;", "charset", "Ljava/nio/charset/Charset;", "", "closed", "Z", "delegate", "Ljava/io/Reader;", "<init>", "(Lcom/amazon/aps/iva/ef0/h;Ljava/nio/charset/Charset;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final h source;

        public BomAwareReader(h hVar, Charset charset) {
            j.f(hVar, FirebaseAnalytics.Param.SOURCE);
            j.f(charset, "charset");
            this.source = hVar;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            q qVar;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                qVar = q.a;
            } else {
                qVar = null;
            }
            if (qVar == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            j.f(cArr, "cbuf");
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.r0(), Util.readBomAsCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* compiled from: ResponseBody.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\b\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u0005*\u00020\t2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\b\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\fJ)\u0010\u0011\u001a\u00020\u0005*\u00020\r2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0006\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0007J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\"\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\rH\u0007¨\u0006\u0015"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "toResponseBody", "", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lcom/amazon/aps/iva/ef0/i;", "(Lcom/amazon/aps/iva/ef0/i;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lcom/amazon/aps/iva/ef0/h;", "", "contentLength", "(Lcom/amazon/aps/iva/ef0/h;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "asResponseBody", FirebaseAnalytics.Param.CONTENT, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            j.f(str, "<this>");
            Charset charset = a.b;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charset$default == null) {
                    MediaType.Companion companion = MediaType.Companion;
                    mediaType = companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            com.amazon.aps.iva.ef0.e eVar = new com.amazon.aps.iva.ef0.e();
            j.f(charset, "charset");
            com.amazon.aps.iva.ef0.e Z = eVar.Z(str, 0, str.length(), charset);
            return create(Z, mediaType, Z.c);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, i iVar, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(iVar, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, h hVar, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(hVar, mediaType, j);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            j.f(bArr, "<this>");
            com.amazon.aps.iva.ef0.e eVar = new com.amazon.aps.iva.ef0.e();
            eVar.K(bArr);
            return create(eVar, mediaType, bArr.length);
        }

        public final ResponseBody create(i iVar, MediaType mediaType) {
            j.f(iVar, "<this>");
            com.amazon.aps.iva.ef0.e eVar = new com.amazon.aps.iva.ef0.e();
            eVar.I(iVar);
            return create(eVar, mediaType, iVar.c());
        }

        public final ResponseBody create(final h hVar, final MediaType mediaType, final long j) {
            j.f(hVar, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                public h source() {
                    return hVar;
                }
            };
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            j.f(str, FirebaseAnalytics.Param.CONTENT);
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            j.f(bArr, FirebaseAnalytics.Param.CONTENT);
            return create(bArr, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, i iVar) {
            j.f(iVar, FirebaseAnalytics.Param.CONTENT);
            return create(iVar, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j, h hVar) {
            j.f(hVar, FirebaseAnalytics.Param.CONTENT);
            return create(hVar, mediaType, j);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType contentType = contentType();
        if (contentType == null || (charset = contentType.charset(a.b)) == null) {
            return a.b;
        }
        return charset;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(l<? super h, ? extends T> lVar, l<? super T, Integer> lVar2) {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            h source = source();
            try {
                T invoke = lVar.invoke(source);
                b.k(source, null);
                int intValue = lVar2.invoke(invoke).intValue();
                if (contentLength != -1 && contentLength != intValue) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + intValue + ") disagree");
                }
                return invoke;
            } finally {
            }
        } else {
            throw new IOException(j0.f("Cannot buffer entire body for content length: ", contentLength));
        }
    }

    public static final ResponseBody create(h hVar, MediaType mediaType, long j) {
        return Companion.create(hVar, mediaType, j);
    }

    public final InputStream byteStream() {
        return source().r0();
    }

    public final i byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            h source = source();
            try {
                i h0 = source.h0();
                b.k(source, null);
                int c = h0.c();
                if (contentLength != -1 && contentLength != c) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + c + ") disagree");
                }
                return h0;
            } finally {
            }
        } else {
            throw new IOException(j0.f("Cannot buffer entire body for content length: ", contentLength));
        }
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            h source = source();
            try {
                byte[] X = source.X();
                b.k(source, null);
                int length = X.length;
                if (contentLength != -1 && contentLength != length) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
                }
                return X;
            } finally {
            }
        } else {
            throw new IOException(j0.f("Cannot buffer entire body for content length: ", contentLength));
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
            this.reader = bomAwareReader;
            return bomAwareReader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract h source();

    public final String string() throws IOException {
        h source = source();
        try {
            String f0 = source.f0(Util.readBomAsCharset(source, charset()));
            b.k(source, null);
            return f0;
        } finally {
        }
    }

    public static final ResponseBody create(i iVar, MediaType mediaType) {
        return Companion.create(iVar, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j, h hVar) {
        return Companion.create(mediaType, j, hVar);
    }

    public static final ResponseBody create(MediaType mediaType, i iVar) {
        return Companion.create(mediaType, iVar);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}
