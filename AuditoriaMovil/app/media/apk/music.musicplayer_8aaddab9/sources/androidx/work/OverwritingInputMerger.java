package androidx.work;

import c.c0.f;
import c.c0.k;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends k {
    @Override // c.c0.k
    public f a(List<f> list) {
        f.a aVar = new f.a();
        HashMap hashMap = new HashMap();
        for (f fVar : list) {
            hashMap.putAll(Collections.unmodifiableMap(fVar.f1600c));
        }
        aVar.c(hashMap);
        return aVar.a();
    }
}
