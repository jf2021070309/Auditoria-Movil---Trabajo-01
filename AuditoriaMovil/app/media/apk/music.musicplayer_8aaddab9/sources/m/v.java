package m;

import java.io.IOException;
import java.lang.reflect.Array;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class v extends w<Object> {
    public final /* synthetic */ w a;

    public v(w wVar) {
        this.a = wVar;
    }

    @Override // m.w
    public void a(y yVar, @Nullable Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.a.a(yVar, Array.get(obj, i2));
        }
    }
}
