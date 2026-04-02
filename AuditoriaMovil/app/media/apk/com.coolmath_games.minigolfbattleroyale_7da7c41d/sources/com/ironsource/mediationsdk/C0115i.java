package com.ironsource.mediationsdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.ironsource.mediationsdk.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0115i {
    private ConcurrentHashMap<String, ArrayList<a>> a = new ConcurrentHashMap<>();
    private int b;

    /* renamed from: com.ironsource.mediationsdk.i$a */
    /* loaded from: classes2.dex */
    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public C0115i(List<String> list, int i) {
        this.b = i;
        for (String str : list) {
            ArrayList<a> arrayList = new ArrayList<>();
            this.a.put(str, arrayList);
        }
    }

    public final String a(String str) {
        ArrayList<a> arrayList = this.a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<a> it = arrayList.iterator();
            StringBuilder sb = new StringBuilder();
            while (true) {
                sb.append(str2);
                sb.append(it.next().ordinal());
                str2 = sb.toString();
                if (!it.hasNext()) {
                    break;
                }
                str2 = str2 + ",";
                sb = new StringBuilder();
            }
        }
        return str2;
    }

    public final void a(ConcurrentHashMap<String, a> concurrentHashMap) {
        if (this.b == 0) {
            return;
        }
        for (String str : this.a.keySet()) {
            a aVar = a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                aVar = concurrentHashMap.get(str);
            }
            ArrayList<a> arrayList = this.a.get(str);
            if (this.b != -1 && arrayList.size() == this.b) {
                arrayList.remove(0);
            }
            arrayList.add(aVar);
        }
    }
}
