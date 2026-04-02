package com.amazon.aps.iva.d6;

import android.os.SystemClock;
import android.util.Pair;
import com.amazon.aps.iva.t5.g0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
/* compiled from: BaseUrlExclusionList.java */
/* loaded from: classes.dex */
public final class b {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final Random d;

    public b() {
        Random random = new Random();
        this.c = new HashMap();
        this.d = random;
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public static void a(Object obj, long j, HashMap hashMap) {
        if (hashMap.containsKey(obj)) {
            int i = g0.a;
            j = Math.max(j, ((Long) hashMap.get(obj)).longValue());
        }
        hashMap.put(obj, Long.valueOf(j));
    }

    public static void c(long j, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            hashMap.remove(arrayList.get(i));
        }
    }

    public final ArrayList b(ImmutableList immutableList) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.a;
        c(elapsedRealtime, hashMap);
        HashMap hashMap2 = this.b;
        c(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < immutableList.size(); i++) {
            com.amazon.aps.iva.e6.b bVar = (com.amazon.aps.iva.e6.b) immutableList.get(i);
            if (!hashMap.containsKey(bVar.b) && !hashMap2.containsKey(Integer.valueOf(bVar.c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final com.amazon.aps.iva.e6.b d(ImmutableList immutableList) {
        ArrayList b = b(immutableList);
        if (b.size() < 2) {
            return (com.amazon.aps.iva.e6.b) Iterables.getFirst(b, null);
        }
        int i = 0;
        Collections.sort(b, new a(0));
        ArrayList arrayList = new ArrayList();
        int i2 = ((com.amazon.aps.iva.e6.b) b.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= b.size()) {
                break;
            }
            com.amazon.aps.iva.e6.b bVar = (com.amazon.aps.iva.e6.b) b.get(i3);
            if (i2 != bVar.c) {
                if (arrayList.size() == 1) {
                    return (com.amazon.aps.iva.e6.b) b.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar.b, Integer.valueOf(bVar.d)));
                i3++;
            }
        }
        HashMap hashMap = this.c;
        com.amazon.aps.iva.e6.b bVar2 = (com.amazon.aps.iva.e6.b) hashMap.get(arrayList);
        if (bVar2 == null) {
            List subList = b.subList(0, arrayList.size());
            int i4 = 0;
            for (int i5 = 0; i5 < subList.size(); i5++) {
                i4 += ((com.amazon.aps.iva.e6.b) subList.get(i5)).d;
            }
            int nextInt = this.d.nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i < subList.size()) {
                    com.amazon.aps.iva.e6.b bVar3 = (com.amazon.aps.iva.e6.b) subList.get(i);
                    i6 += bVar3.d;
                    if (nextInt < i6) {
                        bVar2 = bVar3;
                        break;
                    }
                    i++;
                } else {
                    bVar2 = (com.amazon.aps.iva.e6.b) Iterables.getLast(subList);
                    break;
                }
            }
            hashMap.put(arrayList, bVar2);
        }
        return bVar2;
    }
}
