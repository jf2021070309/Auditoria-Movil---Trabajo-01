package e.d.e;

import java.io.IOException;
import java.io.StringWriter;
/* loaded from: classes2.dex */
public abstract class o {
    public t a() {
        if (this instanceof t) {
            return (t) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            e.d.e.e0.c cVar = new e.d.e.e0.c(stringWriter);
            cVar.f7917h = true;
            e.d.e.c0.z.o.X.b(cVar, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
