package e.c.a.m.u.g;

import android.util.Log;
import e.c.a.m.m;
import e.c.a.m.p;
import e.c.a.m.s.w;
import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public class d implements p<c> {
    @Override // e.c.a.m.d
    public boolean a(Object obj, File file, m mVar) {
        try {
            e.c.a.s.a.b(((c) ((w) obj).get()).a.a.a.e().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            }
            return false;
        }
    }

    @Override // e.c.a.m.p
    public e.c.a.m.c b(m mVar) {
        return e.c.a.m.c.SOURCE;
    }
}
