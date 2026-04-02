package e.c.a.m.t;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class c implements e.c.a.m.d<ByteBuffer> {
    @Override // e.c.a.m.d
    public boolean a(ByteBuffer byteBuffer, File file, e.c.a.m.m mVar) {
        try {
            e.c.a.s.a.b(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
