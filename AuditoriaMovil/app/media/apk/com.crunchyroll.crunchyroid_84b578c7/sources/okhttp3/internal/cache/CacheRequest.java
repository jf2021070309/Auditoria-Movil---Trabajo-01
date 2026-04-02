package okhttp3.internal.cache;

import com.amazon.aps.iva.ef0.b0;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: CacheRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/cache/CacheRequest;", "", "Lcom/amazon/aps/iva/ef0/b0;", "body", "Lcom/amazon/aps/iva/kb0/q;", "abort", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface CacheRequest {
    void abort();

    b0 body() throws IOException;
}
