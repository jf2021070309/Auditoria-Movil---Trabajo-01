package com.amazon.aps.iva.j0;

import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 {
    public static com.amazon.aps.iva.kb0.j a(int i, com.amazon.aps.iva.r4.k kVar) {
        return com.amazon.aps.iva.aq.k.J(kVar, new com.amazon.aps.iva.r4.j(i));
    }

    public static Object b(zzbl zzblVar, int i, List list, int i2) {
        zzh.zzh(zzblVar.name(), i, list);
        return list.get(i2);
    }

    public static String c(int i, String str, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static String d(String str) {
        String uuid = UUID.randomUUID().toString();
        com.amazon.aps.iva.yb0.j.e(uuid, str);
        return uuid;
    }

    public static String e(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String f(String str, long j) {
        return str + j;
    }

    public static ArrayList g(int i, HashMap hashMap, ArrayList arrayList, int i2, String str) {
        hashMap.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }
}
