package okhttp3.internal.ws;

import com.amazon.aps.iva.ef0.b;
import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.ef0.i;
import com.amazon.aps.iva.ef0.j;
import com.amazon.aps.iva.ef0.r;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
/* compiled from: MessageDeflater.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\bH\u0016R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "Lcom/amazon/aps/iva/ef0/e;", "Lcom/amazon/aps/iva/ef0/i;", "suffix", "", "endsWith", "buffer", "Lcom/amazon/aps/iva/kb0/q;", "deflate", "close", "noContextTakeover", "Z", "deflatedBytes", "Lcom/amazon/aps/iva/ef0/e;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Lcom/amazon/aps/iva/ef0/j;", "deflaterSink", "Lcom/amazon/aps/iva/ef0/j;", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MessageDeflater implements Closeable {
    private final e deflatedBytes;
    private final Deflater deflater;
    private final j deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        e eVar = new e();
        this.deflatedBytes = eVar;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new j(r.a(eVar), deflater);
    }

    private final boolean endsWith(e eVar, i iVar) {
        return eVar.z(eVar.c - iVar.c(), iVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(e eVar) throws IOException {
        boolean z;
        i iVar;
        com.amazon.aps.iva.yb0.j.f(eVar, "buffer");
        if (this.deflatedBytes.c == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.noContextTakeover) {
                this.deflater.reset();
            }
            this.deflaterSink.write(eVar, eVar.c);
            this.deflaterSink.flush();
            e eVar2 = this.deflatedBytes;
            iVar = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
            if (endsWith(eVar2, iVar)) {
                e eVar3 = this.deflatedBytes;
                long j = eVar3.c - 4;
                e.a v = eVar3.v(b.a);
                try {
                    v.a(j);
                    com.amazon.aps.iva.a60.b.k(v, null);
                } finally {
                }
            } else {
                this.deflatedBytes.L(0);
            }
            e eVar4 = this.deflatedBytes;
            eVar.write(eVar4, eVar4.c);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
