package okhttp3;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.ef0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.net.HttpHeaders;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
/* compiled from: Response.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001RB}\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u001b\u0012\b\u0010%\u001a\u0004\u0018\u00010!\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u00107\u001a\u00020\u001f\u0012\u0006\u00109\u001a\u00020\u001f\u0012\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bP\u0010QJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\u0006\u0010\u0016\u001a\u00020\u000eJ\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0007J\u000f\u0010\u0018\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u000e\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fJ\u0011\u0010%\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$J\u0006\u0010'\u001a\u00020&J\u0011\u0010*\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b(\u0010)J\u0011\u0010,\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b+\u0010)J\u0011\u0010.\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b-\u0010)J\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0017J\u000f\u00104\u001a\u000201H\u0007¢\u0006\u0004\b2\u00103J\u000f\u00107\u001a\u00020\u001fH\u0007¢\u0006\u0004\b5\u00106J\u000f\u00109\u001a\u00020\u001fH\u0007¢\u0006\u0004\b8\u00106J\b\u0010;\u001a\u00020:H\u0016J\b\u0010<\u001a\u00020\u000eH\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b\u0005\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b\t\u0010\bR\u0017\u0010\u0011\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\r\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0007¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u001b8\u0007¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\b\u0018\u0010\u001dR\u0019\u0010%\u001a\u0004\u0018\u00010!8\u0007¢\u0006\f\n\u0004\b%\u0010C\u001a\u0004\b%\u0010$R\u0019\u0010*\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b*\u0010D\u001a\u0004\b*\u0010)R\u0019\u0010,\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b,\u0010D\u001a\u0004\b,\u0010)R\u0019\u0010.\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b.\u0010D\u001a\u0004\b.\u0010)R\u0017\u00107\u001a\u00020\u001f8\u0007¢\u0006\f\n\u0004\b7\u0010E\u001a\u0004\b7\u00106R\u0017\u00109\u001a\u00020\u001f8\u0007¢\u0006\f\n\u0004\b9\u0010E\u001a\u0004\b9\u00106R\u001c\u0010G\u001a\u0004\u0018\u00010F8\u0001X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bG\u0010IR\u0018\u0010J\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0011\u0010M\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010O\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bO\u0010NR\u0011\u00104\u001a\u0002018G¢\u0006\u0006\u001a\u0004\b4\u00103¨\u0006S"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Lokhttp3/Request;", "-deprecated_request", "()Lokhttp3/Request;", "request", "Lokhttp3/Protocol;", "-deprecated_protocol", "()Lokhttp3/Protocol;", "protocol", "", "-deprecated_code", "()I", "code", "", "-deprecated_message", "()Ljava/lang/String;", "message", "Lokhttp3/Handshake;", "-deprecated_handshake", "()Lokhttp3/Handshake;", "handshake", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "headers", "defaultValue", "header", "Lokhttp3/Headers;", "-deprecated_headers", "()Lokhttp3/Headers;", "trailers", "", "byteCount", "Lokhttp3/ResponseBody;", "peekBody", "-deprecated_body", "()Lokhttp3/ResponseBody;", "body", "Lokhttp3/Response$Builder;", "newBuilder", "-deprecated_networkResponse", "()Lokhttp3/Response;", "networkResponse", "-deprecated_cacheResponse", "cacheResponse", "-deprecated_priorResponse", "priorResponse", "Lokhttp3/Challenge;", "challenges", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "-deprecated_sentRequestAtMillis", "()J", "sentRequestAtMillis", "-deprecated_receivedResponseAtMillis", "receivedResponseAtMillis", "Lcom/amazon/aps/iva/kb0/q;", "close", "toString", "Lokhttp3/Request;", "Lokhttp3/Protocol;", "Ljava/lang/String;", "I", "Lokhttp3/Handshake;", "Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "Lokhttp3/Response;", "J", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/internal/connection/Exchange;", "()Lokhttp3/internal/connection/Exchange;", "lazyCacheControl", "Lokhttp3/CacheControl;", "", "isSuccessful", "()Z", "isRedirect", "<init>", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLokhttp3/internal/connection/Exchange;)V", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Response implements Closeable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;

    public Response(Request request, Protocol protocol, String str, int i, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j, long j2, Exchange exchange) {
        j.f(request, "request");
        j.f(protocol, "protocol");
        j.f(str, "message");
        j.f(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = str;
        this.code = i;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = exchange;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    /* renamed from: -deprecated_body  reason: not valid java name */
    public final ResponseBody m181deprecated_body() {
        return this.body;
    }

    /* renamed from: -deprecated_cacheControl  reason: not valid java name */
    public final CacheControl m182deprecated_cacheControl() {
        return cacheControl();
    }

    /* renamed from: -deprecated_cacheResponse  reason: not valid java name */
    public final Response m183deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    /* renamed from: -deprecated_code  reason: not valid java name */
    public final int m184deprecated_code() {
        return this.code;
    }

    /* renamed from: -deprecated_handshake  reason: not valid java name */
    public final Handshake m185deprecated_handshake() {
        return this.handshake;
    }

    /* renamed from: -deprecated_headers  reason: not valid java name */
    public final Headers m186deprecated_headers() {
        return this.headers;
    }

    /* renamed from: -deprecated_message  reason: not valid java name */
    public final String m187deprecated_message() {
        return this.message;
    }

    /* renamed from: -deprecated_networkResponse  reason: not valid java name */
    public final Response m188deprecated_networkResponse() {
        return this.networkResponse;
    }

    /* renamed from: -deprecated_priorResponse  reason: not valid java name */
    public final Response m189deprecated_priorResponse() {
        return this.priorResponse;
    }

    /* renamed from: -deprecated_protocol  reason: not valid java name */
    public final Protocol m190deprecated_protocol() {
        return this.protocol;
    }

    /* renamed from: -deprecated_receivedResponseAtMillis  reason: not valid java name */
    public final long m191deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* renamed from: -deprecated_request  reason: not valid java name */
    public final Request m192deprecated_request() {
        return this.request;
    }

    /* renamed from: -deprecated_sentRequestAtMillis  reason: not valid java name */
    public final long m193deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl == null) {
            CacheControl parse = CacheControl.Companion.parse(this.headers);
            this.lazyCacheControl = parse;
            return parse;
        }
        return cacheControl;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i = this.code;
        if (i != 401) {
            if (i != 407) {
                return z.b;
            }
            str = HttpHeaders.PROXY_AUTHENTICATE;
        } else {
            str = HttpHeaders.WWW_AUTHENTICATE;
        }
        return okhttp3.internal.http.HttpHeaders.parseChallenges(headers, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final int code() {
        return this.code;
    }

    public final Exchange exchange() {
        return this.exchange;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final String header(String str) {
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return header$default(this, str, null, 2, null);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i = this.code;
        if (i != 307 && i != 308) {
            switch (i) {
                case 300:
                case MediaError.DetailedErrorCode.SEGMENT_NETWORK /* 301 */:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean isSuccessful() {
        int i = this.code;
        if (200 > i || i >= 300) {
            return false;
        }
        return true;
    }

    public final String message() {
        return this.message;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final ResponseBody peekBody(long j) throws IOException {
        ResponseBody responseBody = this.body;
        j.c(responseBody);
        x peek = responseBody.source().peek();
        e eVar = new e();
        peek.w(j);
        long min = Math.min(j, peek.c.c);
        while (min > 0) {
            long read = peek.read(eVar, min);
            if (read != -1) {
                min -= read;
            } else {
                throw new EOFException();
            }
        }
        return ResponseBody.Companion.create(eVar, this.body.contentType(), eVar.c);
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Request request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    public final Headers trailers() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available".toString());
    }

    public final String header(String str, String str2) {
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        String str3 = this.headers.get(str);
        return str3 == null ? str2 : str3;
    }

    public final List<String> headers(String str) {
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return this.headers.values(str);
    }

    /* compiled from: Response.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\"\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b_\u0010`B\u0011\b\u0010\u0012\u0006\u0010#\u001a\u00020\u0015¢\u0006\u0004\b_\u0010NJ\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0012\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0019H\u0016J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 J\b\u0010\"\u001a\u00020\u0015H\u0016J\u001a\u0010$\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010%\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u0015H\u0002R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0012\u001a\u00020?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010J\u001a\u0004\bO\u0010L\"\u0004\bP\u0010NR$\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010J\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR\"\u0010\u001a\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\u001b\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010S\u001a\u0004\bX\u0010U\"\u0004\bY\u0010WR$\u0010Z\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010 ¨\u0006a"}, d2 = {"Lokhttp3/Response$Builder;", "", "Lokhttp3/Request;", "request", "Lokhttp3/Protocol;", "protocol", "", "code", "", "message", "Lokhttp3/Handshake;", "handshake", AppMeasurementSdk.ConditionalUserProperty.NAME, "value", "header", "addHeader", "removeHeader", "Lokhttp3/Headers;", "headers", "Lokhttp3/ResponseBody;", "body", "Lokhttp3/Response;", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "Lokhttp3/internal/connection/Exchange;", "deferredTrailers", "Lcom/amazon/aps/iva/kb0/q;", "initExchange$okhttp", "(Lokhttp3/internal/connection/Exchange;)V", "initExchange", "build", "response", "checkSupportResponse", "checkPriorResponse", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "setProtocol$okhttp", "(Lokhttp3/Protocol;)V", "I", "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "setHandshake$okhttp", "(Lokhttp3/Handshake;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "Lokhttp3/Response;", "getNetworkResponse$okhttp", "()Lokhttp3/Response;", "setNetworkResponse$okhttp", "(Lokhttp3/Response;)V", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "exchange", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "setExchange$okhttp", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private final void checkPriorResponse(Response response) {
            boolean z;
            if (response != null) {
                if (response.body() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        private final void checkSupportResponse(String str, Response response) {
            boolean z;
            boolean z2;
            boolean z3;
            if (response != null) {
                boolean z4 = true;
                if (response.body() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (response.networkResponse() == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (response.cacheResponse() == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (response.priorResponse() != null) {
                                z4 = false;
                            }
                            if (!z4) {
                                throw new IllegalArgumentException(a.f(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(a.f(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(a.f(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(a.f(str, ".body != null").toString());
            }
        }

        public Builder addHeader(String str, String str2) {
            j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            j.f(str2, "value");
            this.headers.add(str, str2);
            return this;
        }

        public Builder body(ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        public Response build() {
            boolean z;
            int i = this.code;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Request request = this.request;
                if (request != null) {
                    Protocol protocol = this.protocol;
                    if (protocol != null) {
                        String str = this.message;
                        if (str != null) {
                            return new Response(request, protocol, str, i, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.code).toString());
        }

        public Builder cacheResponse(Response response) {
            checkSupportResponse("cacheResponse", response);
            this.cacheResponse = response;
            return this;
        }

        public Builder code(int i) {
            this.code = i;
            return this;
        }

        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMessage$okhttp() {
            return this.message;
        }

        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        public Builder handshake(Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        public Builder header(String str, String str2) {
            j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            j.f(str2, "value");
            this.headers.set(str, str2);
            return this;
        }

        public Builder headers(Headers headers) {
            j.f(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(Exchange exchange) {
            j.f(exchange, "deferredTrailers");
            this.exchange = exchange;
        }

        public Builder message(String str) {
            j.f(str, "message");
            this.message = str;
            return this;
        }

        public Builder networkResponse(Response response) {
            checkSupportResponse("networkResponse", response);
            this.networkResponse = response;
            return this;
        }

        public Builder priorResponse(Response response) {
            checkPriorResponse(response);
            this.priorResponse = response;
            return this;
        }

        public Builder protocol(Protocol protocol) {
            j.f(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        public Builder receivedResponseAtMillis(long j) {
            this.receivedResponseAtMillis = j;
            return this;
        }

        public Builder removeHeader(String str) {
            j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.headers.removeAll(str);
            return this;
        }

        public Builder request(Request request) {
            j.f(request, "request");
            this.request = request;
            return this;
        }

        public Builder sentRequestAtMillis(long j) {
            this.sentRequestAtMillis = j;
            return this;
        }

        public final void setBody$okhttp(ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        public final void setExchange$okhttp(Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            j.f(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMessage$okhttp(String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
            this.receivedResponseAtMillis = j;
        }

        public final void setRequest$okhttp(Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
            this.sentRequestAtMillis = j;
        }

        public Builder(Response response) {
            j.f(response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }
    }
}
