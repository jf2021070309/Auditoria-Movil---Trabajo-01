package k;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
/* loaded from: classes2.dex */
public abstract class j implements x {
    public final x a;

    public j(x xVar) {
        h.o.c.j.e(xVar, "delegate");
        this.a = xVar;
    }

    @Override // k.x
    public y c() {
        return this.a.c();
    }

    @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
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
