package j.i0.i;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class v extends IOException {
    public final b a;

    public v(b bVar) {
        super("stream was reset: " + bVar);
        this.a = bVar;
    }
}
