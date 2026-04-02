package okhttp3.internal.cache;

import java.io.IOException;
import okio.Sink;
/* JADX WARN: Classes with same name are omitted:
  classes4.dex
 */
/* loaded from: classes3.dex */
public interface CacheRequest {
    void abort();

    Sink body() throws IOException;
}
