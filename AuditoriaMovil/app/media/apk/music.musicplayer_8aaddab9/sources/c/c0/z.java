package c.c0;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.List;
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class z {
    public final u a(a0 a0Var) {
        List singletonList = Collections.singletonList(a0Var);
        c.c0.d0.l lVar = (c.c0.d0.l) this;
        if (singletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new c.c0.d0.g(lVar, null, h.KEEP, singletonList, null).a();
    }

    public u b(String str, h hVar, t tVar) {
        return new c.c0.d0.g((c.c0.d0.l) this, str, hVar, Collections.singletonList(tVar), null).a();
    }
}
