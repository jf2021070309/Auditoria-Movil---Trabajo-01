package com.amazon.aps.iva.b7;

import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ScriptTagPayloadReader.java */
/* loaded from: classes.dex */
public final class d extends e {
    public long b;
    public long[] c;
    public long[] d;

    public d() {
        super(new m());
        this.b = -9223372036854775807L;
        this.c = new long[0];
        this.d = new long[0];
    }

    public static Serializable b(int i, v vVar) {
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(vVar.n())).doubleValue());
                                vVar.G(2);
                                return date;
                            }
                            int x = vVar.x();
                            ArrayList arrayList = new ArrayList(x);
                            for (int i2 = 0; i2 < x; i2++) {
                                Serializable b = b(vVar.u(), vVar);
                                if (b != null) {
                                    arrayList.add(b);
                                }
                            }
                            return arrayList;
                        }
                        return c(vVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String d = d(vVar);
                        int u = vVar.u();
                        if (u == 9) {
                            return hashMap;
                        }
                        Serializable b2 = b(u, vVar);
                        if (b2 != null) {
                            hashMap.put(d, b2);
                        }
                    }
                } else {
                    return d(vVar);
                }
            } else {
                if (vVar.u() != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(vVar.n()));
        }
    }

    public static HashMap<String, Object> c(v vVar) {
        int x = vVar.x();
        HashMap<String, Object> hashMap = new HashMap<>(x);
        for (int i = 0; i < x; i++) {
            String d = d(vVar);
            Serializable b = b(vVar.u(), vVar);
            if (b != null) {
                hashMap.put(d, b);
            }
        }
        return hashMap;
    }

    public static String d(v vVar) {
        int z = vVar.z();
        int i = vVar.b;
        vVar.G(z);
        return new String(vVar.a, i, z);
    }

    public final boolean a(long j, v vVar) {
        if (vVar.u() != 2 || !"onMetaData".equals(d(vVar)) || vVar.c - vVar.b == 0 || vVar.u() != 8) {
            return false;
        }
        HashMap<String, Object> c = c(vVar);
        Object obj = c.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = c.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.c = new long[size];
                this.d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.d[i] = ((Double) obj5).longValue();
                    } else {
                        this.c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }
}
