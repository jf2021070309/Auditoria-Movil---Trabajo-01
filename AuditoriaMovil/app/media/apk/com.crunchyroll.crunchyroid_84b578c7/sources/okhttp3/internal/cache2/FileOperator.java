package okhttp3.internal.cache2;

import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
/* compiled from: FileOperator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "", "pos", "Lcom/amazon/aps/iva/ef0/e;", FirebaseAnalytics.Param.SOURCE, "byteCount", "Lcom/amazon/aps/iva/kb0/q;", "write", "sink", "read", "Ljava/nio/channels/FileChannel;", "fileChannel", "Ljava/nio/channels/FileChannel;", "<init>", "(Ljava/nio/channels/FileChannel;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        j.f(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j, e eVar, long j2) {
        j.f(eVar, "sink");
        if (j2 >= 0) {
            while (j2 > 0) {
                long transferTo = this.fileChannel.transferTo(j, j2, eVar);
                j += transferTo;
                j2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void write(long j, e eVar, long j2) throws IOException {
        j.f(eVar, FirebaseAnalytics.Param.SOURCE);
        if (j2 >= 0 && j2 <= eVar.c) {
            while (j2 > 0) {
                long transferFrom = this.fileChannel.transferFrom(eVar, j, j2);
                j += transferFrom;
                j2 -= transferFrom;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
