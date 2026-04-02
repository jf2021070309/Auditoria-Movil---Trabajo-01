package okhttp3.internal.ws;

import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.ef0.p;
import com.amazon.aps.iva.ef0.r;
import com.amazon.aps.iva.yb0.j;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import okhttp3.internal.http2.Settings;
/* compiled from: MessageInflater.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "Lcom/amazon/aps/iva/ef0/e;", "buffer", "Lcom/amazon/aps/iva/kb0/q;", "inflate", "close", "", "noContextTakeover", "Z", "deflatedBytes", "Lcom/amazon/aps/iva/ef0/e;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "Lcom/amazon/aps/iva/ef0/p;", "inflaterSource", "Lcom/amazon/aps/iva/ef0/p;", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MessageInflater implements Closeable {
    private final e deflatedBytes;
    private final Inflater inflater;
    private final p inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        e eVar = new e();
        this.deflatedBytes = eVar;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new p(r.b(eVar), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(e eVar) throws IOException {
        boolean z;
        j.f(eVar, "buffer");
        if (this.deflatedBytes.c == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.noContextTakeover) {
                this.inflater.reset();
            }
            this.deflatedBytes.r(eVar);
            this.deflatedBytes.O(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.c;
            do {
                this.inflaterSource.a(eVar, Long.MAX_VALUE);
            } while (this.inflater.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
