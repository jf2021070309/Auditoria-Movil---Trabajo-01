package com.amazon.aps.iva.ck;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.w5.r;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
import java.util.Map;
/* compiled from: PlayerRequestsRetrySkipper.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes.dex */
public final class g {
    public final Map<String, List<Integer>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Map<String, ? extends List<Integer>> map) {
        j.f(map, "errorsToSkip");
        this.a = map;
    }

    public final boolean a(Exception exc) {
        r rVar;
        String path;
        boolean z;
        Map<String, List<Integer>> map = this.a;
        if (map.isEmpty()) {
            return false;
        }
        if (exc instanceof r) {
            rVar = (r) exc;
        } else {
            rVar = null;
        }
        if (rVar == null || (path = rVar.d.a.getPath()) == null || map.isEmpty()) {
            return false;
        }
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            List<Integer> value = entry.getValue();
            if (q.i0(path, entry.getKey(), false) && value.contains(Integer.valueOf(rVar.f))) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
