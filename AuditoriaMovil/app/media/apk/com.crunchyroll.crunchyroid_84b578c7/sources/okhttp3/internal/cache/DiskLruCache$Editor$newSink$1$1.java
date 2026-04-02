package okhttp3.internal.cache;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.cache.DiskLruCache;
/* compiled from: DiskLruCache.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Ljava/io/IOException;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class DiskLruCache$Editor$newSink$1$1 extends l implements com.amazon.aps.iva.xb0.l<IOException, q> {
    final /* synthetic */ DiskLruCache this$0;
    final /* synthetic */ DiskLruCache.Editor this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.this$0 = diskLruCache;
        this.this$1 = editor;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(IOException iOException) {
        invoke2(iOException);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IOException iOException) {
        j.f(iOException, "it");
        DiskLruCache diskLruCache = this.this$0;
        DiskLruCache.Editor editor = this.this$1;
        synchronized (diskLruCache) {
            editor.detach$okhttp();
            q qVar = q.a;
        }
    }
}
