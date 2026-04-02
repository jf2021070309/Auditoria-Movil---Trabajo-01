package okhttp3;

import com.amazon.aps.iva.ef0.d0;
import com.amazon.aps.iva.ef0.e0;
import com.amazon.aps.iva.ef0.h;
import com.amazon.aps.iva.ef0.i;
import com.amazon.aps.iva.ef0.r;
import com.amazon.aps.iva.ef0.t;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaStatus;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal.http1.HeadersReader;
/* compiled from: MultipartReader.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0003#$%B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001e\u0010\"J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\b\u0018\u00010\u001bR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "", "maxResult", "currentPartBytesRemaining", "Lokhttp3/MultipartReader$Part;", "nextPart", "Lcom/amazon/aps/iva/kb0/q;", "close", "Lcom/amazon/aps/iva/ef0/h;", FirebaseAnalytics.Param.SOURCE, "Lcom/amazon/aps/iva/ef0/h;", "", "boundary", "Ljava/lang/String;", "()Ljava/lang/String;", "Lcom/amazon/aps/iva/ef0/i;", "dashDashBoundary", "Lcom/amazon/aps/iva/ef0/i;", "crlfDashDashBoundary", "", "partCount", "I", "", "closed", "Z", "noMoreParts", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "<init>", "(Lcom/amazon/aps/iva/ef0/h;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "Companion", "Part", "PartSource", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final t afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final i crlfDashDashBoundary;
    private PartSource currentPart;
    private final i dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final h source;

    /* compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "Lcom/amazon/aps/iva/ef0/t;", "afterBoundaryOptions", "Lcom/amazon/aps/iva/ef0/t;", "getAfterBoundaryOptions", "()Lcom/amazon/aps/iva/ef0/t;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final t getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }
    }

    /* compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000e"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lcom/amazon/aps/iva/kb0/q;", "close", "Lokhttp3/Headers;", "headers", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Lcom/amazon/aps/iva/ef0/h;", "body", "Lcom/amazon/aps/iva/ef0/h;", "()Lcom/amazon/aps/iva/ef0/h;", "<init>", "(Lokhttp3/Headers;Lcom/amazon/aps/iva/ef0/h;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Part implements Closeable {
        private final h body;
        private final Headers headers;

        public Part(Headers headers, h hVar) {
            j.f(headers, "headers");
            j.f(hVar, "body");
            this.headers = headers;
            this.body = hVar;
        }

        public final h body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    /* compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lcom/amazon/aps/iva/ef0/d0;", "Lcom/amazon/aps/iva/kb0/q;", "close", "Lcom/amazon/aps/iva/ef0/e;", "sink", "", "byteCount", "read", "Lcom/amazon/aps/iva/ef0/e0;", "timeout", "Lcom/amazon/aps/iva/ef0/e0;", "<init>", "(Lokhttp3/MultipartReader;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public final class PartSource implements d0 {
        private final e0 timeout = new e0();

        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (j.a(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // com.amazon.aps.iva.ef0.d0
        public long read(com.amazon.aps.iva.ef0.e eVar, long j) {
            boolean z;
            long read;
            long j2;
            long read2;
            j.f(eVar, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (j.a(MultipartReader.this.currentPart, this)) {
                    e0 timeout = MultipartReader.this.source.timeout();
                    e0 e0Var = this.timeout;
                    MultipartReader multipartReader = MultipartReader.this;
                    long timeoutNanos = timeout.timeoutNanos();
                    e0.b bVar = e0.Companion;
                    long timeoutNanos2 = e0Var.timeoutNanos();
                    long timeoutNanos3 = timeout.timeoutNanos();
                    bVar.getClass();
                    if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
                        timeoutNanos2 = timeoutNanos3;
                    }
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(timeoutNanos2, timeUnit);
                    if (timeout.hasDeadline()) {
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (e0Var.hasDeadline()) {
                            j2 = deadlineNanoTime;
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), e0Var.deadlineNanoTime()));
                        } else {
                            j2 = deadlineNanoTime;
                        }
                        try {
                            long currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j);
                            if (currentPartBytesRemaining == 0) {
                                read2 = -1;
                            } else {
                                read2 = multipartReader.source.read(eVar, currentPartBytesRemaining);
                            }
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (e0Var.hasDeadline()) {
                                timeout.deadlineNanoTime(j2);
                            }
                            return read2;
                        } catch (Throwable th) {
                            long j3 = j2;
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (e0Var.hasDeadline()) {
                                timeout.deadlineNanoTime(j3);
                            }
                            throw th;
                        }
                    }
                    if (e0Var.hasDeadline()) {
                        timeout.deadlineNanoTime(e0Var.deadlineNanoTime());
                    }
                    try {
                        long currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j);
                        if (currentPartBytesRemaining2 == 0) {
                            read = -1;
                        } else {
                            read = multipartReader.source.read(eVar, currentPartBytesRemaining2);
                        }
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (e0Var.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        return read;
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (e0Var.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(j0.f("byteCount < 0: ", j).toString());
        }

        @Override // com.amazon.aps.iva.ef0.d0
        public e0 timeout() {
            return this.timeout;
        }
    }

    static {
        i iVar = i.e;
        afterBoundaryOptions = t.a.b(i.a.c("\r\n"), i.a.c("--"), i.a.c(" "), i.a.c("\t"));
    }

    public MultipartReader(h hVar, String str) throws IOException {
        j.f(hVar, FirebaseAnalytics.Param.SOURCE);
        j.f(str, "boundary");
        this.source = hVar;
        this.boundary = str;
        com.amazon.aps.iva.ef0.e eVar = new com.amazon.aps.iva.ef0.e();
        eVar.c0("--");
        eVar.c0(str);
        this.dashDashBoundary = eVar.h0();
        com.amazon.aps.iva.ef0.e eVar2 = new com.amazon.aps.iva.ef0.e();
        eVar2.c0("\r\n--");
        eVar2.c0(str);
        this.crlfDashDashBoundary = eVar2.h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j) {
        this.source.P(this.crlfDashDashBoundary.c());
        long p = this.source.d().p(this.crlfDashDashBoundary);
        if (p == -1) {
            return Math.min(j, (this.source.d().c - this.crlfDashDashBoundary.c()) + 1);
        }
        return Math.min(j, p);
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws IOException {
        if (!this.closed) {
            if (this.noMoreParts) {
                return null;
            }
            if (this.partCount == 0 && this.source.z(0L, this.dashDashBoundary)) {
                this.source.e(this.dashDashBoundary.c());
            } else {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(MediaStatus.COMMAND_PLAYBACK_RATE);
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    this.source.e(currentPartBytesRemaining);
                }
                this.source.e(this.crlfDashDashBoundary.c());
            }
            boolean z = false;
            while (true) {
                int g = this.source.g(afterBoundaryOptions);
                if (g != -1) {
                    if (g != 0) {
                        if (g != 1) {
                            if (g == 2 || g == 3) {
                                z = true;
                            }
                        } else if (!z) {
                            if (this.partCount != 0) {
                                this.noMoreParts = true;
                                return null;
                            }
                            throw new ProtocolException("expected at least 1 part");
                        } else {
                            throw new ProtocolException("unexpected characters after boundary");
                        }
                    } else {
                        this.partCount++;
                        Headers readHeaders = new HeadersReader(this.source).readHeaders();
                        PartSource partSource = new PartSource();
                        this.currentPart = partSource;
                        return new Part(readHeaders, r.b(partSource));
                    }
                } else {
                    throw new ProtocolException("unexpected characters after boundary");
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultipartReader(okhttp3.ResponseBody r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            com.amazon.aps.iva.yb0.j.f(r3, r0)
            com.amazon.aps.iva.ef0.h r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L1b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L1b
            r2.<init>(r0, r3)
            return
        L1b:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
