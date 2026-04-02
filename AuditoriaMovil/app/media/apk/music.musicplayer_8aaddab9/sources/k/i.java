package k;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
/* loaded from: classes2.dex */
public abstract class i implements v {
    public final v a;

    public i(v vVar) {
        h.o.c.j.e(vVar, "delegate");
        this.a = vVar;
    }

    @Override // k.v
    public y c() {
        return this.a.c();
    }

    @Override // k.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // k.v, java.io.Flushable
    public void flush() throws IOException {
        this.a.flush();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb.append(this.a);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }
}
