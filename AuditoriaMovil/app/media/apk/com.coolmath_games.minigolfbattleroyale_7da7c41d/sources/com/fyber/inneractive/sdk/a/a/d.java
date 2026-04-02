package com.fyber.inneractive.sdk.a.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import org.json.JSONArray;
/* loaded from: classes.dex */
final class d extends PriorityQueue<b> {
    private int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(int i) {
        super(1, new e());
        this.a = i;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    /* renamed from: a */
    public final boolean add(b bVar) {
        boolean add = super.add(bVar);
        if (size() > this.a) {
            poll();
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONArray a(int i, boolean z) {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList(this);
        Collections.sort(arrayList, new Comparator<b>() { // from class: com.fyber.inneractive.sdk.a.a.d.1
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(b bVar, b bVar2) {
                b bVar3 = bVar;
                b bVar4 = bVar2;
                if (bVar3 == null || bVar4 == null) {
                    return 0;
                }
                return bVar4.d - bVar3.d > 0 ? 1 : -1;
            }
        });
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jSONArray.put(((b) it.next()).a(false, z));
            i2++;
            if (i2 >= i) {
                break;
            }
        }
        return jSONArray;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return super.size();
    }
}
