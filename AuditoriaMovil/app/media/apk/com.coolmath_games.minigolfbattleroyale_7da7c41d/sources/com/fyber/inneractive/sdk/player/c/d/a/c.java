package com.fyber.inneractive.sdk.player.c.d.a;

import com.fyber.inneractive.sdk.player.c.k.k;
import com.fyber.inneractive.sdk.player.c.l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/* loaded from: classes.dex */
final class c extends d {
    long a;

    @Override // com.fyber.inneractive.sdk.player.c.d.a.d
    protected final boolean a(k kVar) {
        return true;
    }

    public c() {
        super(null);
        this.a = -9223372036854775807L;
    }

    private static Double b(k kVar) {
        return Double.valueOf(Double.longBitsToDouble(kVar.l()));
    }

    private static String c(k kVar) {
        int e = kVar.e();
        int i = kVar.b;
        kVar.d(e);
        return new String(kVar.a, i, e);
    }

    private static ArrayList<Object> d(k kVar) {
        int n = kVar.n();
        ArrayList<Object> arrayList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arrayList.add(a(kVar, kVar.d()));
        }
        return arrayList;
    }

    private static HashMap<String, Object> e(k kVar) {
        int n = kVar.n();
        HashMap<String, Object> hashMap = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            hashMap.put(c(kVar), a(kVar, kVar.d()));
        }
        return hashMap;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.a.d
    protected final void a(k kVar, long j) throws l {
        if (kVar.d() != 2) {
            throw new l();
        }
        if ("onMetaData".equals(c(kVar)) && kVar.d() == 8) {
            HashMap<String, Object> e = e(kVar);
            if (e.containsKey(IronSourceConstants.EVENTS_DURATION)) {
                double doubleValue = ((Double) e.get(IronSourceConstants.EVENTS_DURATION)).doubleValue();
                if (doubleValue > 0.0d) {
                    this.a = (long) (doubleValue * 1000000.0d);
                }
            }
        }
    }

    private static Object a(k kVar, int i) {
        if (i == 0) {
            return b(kVar);
        }
        if (i == 1) {
            return Boolean.valueOf(kVar.d() == 1);
        } else if (i == 2) {
            return c(kVar);
        } else {
            if (i != 3) {
                if (i != 8) {
                    if (i != 10) {
                        if (i != 11) {
                            return null;
                        }
                        Date date = new Date((long) b(kVar).doubleValue());
                        kVar.d(2);
                        return date;
                    }
                    return d(kVar);
                }
                return e(kVar);
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String c = c(kVar);
                int d = kVar.d();
                if (d == 9) {
                    return hashMap;
                }
                hashMap.put(c, a(kVar, d));
            }
        }
    }
}
