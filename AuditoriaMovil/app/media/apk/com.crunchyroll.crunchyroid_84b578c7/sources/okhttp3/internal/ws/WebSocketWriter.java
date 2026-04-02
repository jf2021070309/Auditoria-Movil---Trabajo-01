package okhttp3.internal.ws;

import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.ef0.g;
import com.amazon.aps.iva.ef0.i;
import com.amazon.aps.iva.yb0.j;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
/* compiled from: WebSocketWriter.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u0011\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b1\u00102J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0013R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u0004\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "opcode", "Lcom/amazon/aps/iva/ef0/i;", "payload", "Lcom/amazon/aps/iva/kb0/q;", "writeControlFrame", "writePing", "writePong", "code", "reason", "writeClose", "formatOpcode", "data", "writeMessageFrame", "close", "", "isClient", "Z", "Lcom/amazon/aps/iva/ef0/g;", "sink", "Lcom/amazon/aps/iva/ef0/g;", "getSink", "()Lcom/amazon/aps/iva/ef0/g;", "Ljava/util/Random;", "random", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "J", "Lcom/amazon/aps/iva/ef0/e;", "messageBuffer", "Lcom/amazon/aps/iva/ef0/e;", "sinkBuffer", "writerClosed", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "", "maskKey", "[B", "Lcom/amazon/aps/iva/ef0/e$a;", "maskCursor", "Lcom/amazon/aps/iva/ef0/e$a;", "<init>", "(ZLcom/amazon/aps/iva/ef0/g;Ljava/util/Random;ZZJ)V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final e.a maskCursor;
    private final byte[] maskKey;
    private final e messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final g sink;
    private final e sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, g gVar, Random random, boolean z2, boolean z3, long j) {
        byte[] bArr;
        j.f(gVar, "sink");
        j.f(random, "random");
        this.isClient = z;
        this.sink = gVar;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.messageBuffer = new e();
        this.sinkBuffer = gVar.d();
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.maskKey = bArr;
        this.maskCursor = z ? new e.a() : null;
    }

    private final void writeControlFrame(int i, i iVar) throws IOException {
        boolean z;
        if (!this.writerClosed) {
            int c = iVar.c();
            if (c <= 125) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.sinkBuffer.L(i | 128);
                if (this.isClient) {
                    this.sinkBuffer.L(c | 128);
                    Random random = this.random;
                    byte[] bArr = this.maskKey;
                    j.c(bArr);
                    random.nextBytes(bArr);
                    this.sinkBuffer.K(this.maskKey);
                    if (c > 0) {
                        e eVar = this.sinkBuffer;
                        long j = eVar.c;
                        eVar.I(iVar);
                        e eVar2 = this.sinkBuffer;
                        e.a aVar = this.maskCursor;
                        j.c(aVar);
                        eVar2.v(aVar);
                        this.maskCursor.c(j);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.L(c);
                    this.sinkBuffer.I(iVar);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final g getSink() {
        return this.sink;
    }

    public final void writeClose(int i, i iVar) throws IOException {
        i iVar2 = i.e;
        if (i != 0 || iVar != null) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            e eVar = new e();
            eVar.V(i);
            if (iVar != null) {
                eVar.I(iVar);
            }
            iVar2 = eVar.h0();
        }
        try {
            writeControlFrame(8, iVar2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, i iVar) throws IOException {
        j.f(iVar, "data");
        if (!this.writerClosed) {
            this.messageBuffer.I(iVar);
            int i2 = 128;
            int i3 = i | 128;
            if (this.perMessageDeflate && iVar.c() >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater = this.messageDeflater;
                if (messageDeflater == null) {
                    messageDeflater = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater;
                }
                messageDeflater.deflate(this.messageBuffer);
                i3 |= 64;
            }
            long j = this.messageBuffer.c;
            this.sinkBuffer.L(i3);
            if (!this.isClient) {
                i2 = 0;
            }
            if (j <= 125) {
                this.sinkBuffer.L(((int) j) | i2);
            } else if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.L(i2 | WebSocketProtocol.PAYLOAD_SHORT);
                this.sinkBuffer.V((int) j);
            } else {
                this.sinkBuffer.L(i2 | 127);
                this.sinkBuffer.R(j);
            }
            if (this.isClient) {
                Random random = this.random;
                byte[] bArr = this.maskKey;
                j.c(bArr);
                random.nextBytes(bArr);
                this.sinkBuffer.K(this.maskKey);
                if (j > 0) {
                    e eVar = this.messageBuffer;
                    e.a aVar = this.maskCursor;
                    j.c(aVar);
                    eVar.v(aVar);
                    this.maskCursor.c(0L);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, j);
            this.sink.j();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(i iVar) throws IOException {
        j.f(iVar, "payload");
        writeControlFrame(9, iVar);
    }

    public final void writePong(i iVar) throws IOException {
        j.f(iVar, "payload");
        writeControlFrame(10, iVar);
    }
}
