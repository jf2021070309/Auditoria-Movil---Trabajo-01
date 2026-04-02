package okhttp3.internal.cache;

import com.amazon.aps.iva.ef0.b0;
import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.ef0.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: FaultHidingSink.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lcom/amazon/aps/iva/ef0/k;", "Lcom/amazon/aps/iva/ef0/e;", FirebaseAnalytics.Param.SOURCE, "", "byteCount", "Lcom/amazon/aps/iva/kb0/q;", "write", "flush", "close", "Lkotlin/Function1;", "Ljava/io/IOException;", "onException", "Lcom/amazon/aps/iva/xb0/l;", "getOnException", "()Lcom/amazon/aps/iva/xb0/l;", "", "hasErrors", "Z", "Lcom/amazon/aps/iva/ef0/b0;", "delegate", "<init>", "(Lcom/amazon/aps/iva/ef0/b0;Lcom/amazon/aps/iva/xb0/l;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class FaultHidingSink extends k {
    private boolean hasErrors;
    private final l<IOException, q> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(b0 b0Var, l<? super IOException, q> lVar) {
        super(b0Var);
        j.f(b0Var, "delegate");
        j.f(lVar, "onException");
        this.onException = lVar;
    }

    @Override // com.amazon.aps.iva.ef0.k, com.amazon.aps.iva.ef0.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // com.amazon.aps.iva.ef0.k, com.amazon.aps.iva.ef0.b0, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    public final l<IOException, q> getOnException() {
        return this.onException;
    }

    @Override // com.amazon.aps.iva.ef0.k, com.amazon.aps.iva.ef0.b0
    public void write(e eVar, long j) {
        j.f(eVar, FirebaseAnalytics.Param.SOURCE);
        if (this.hasErrors) {
            eVar.e(j);
            return;
        }
        try {
            super.write(eVar, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
