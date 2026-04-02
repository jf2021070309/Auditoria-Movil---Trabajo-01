package com.kwad.sdk.core.report;

import com.kwad.sdk.core.report.g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class q<T extends g> implements o<T> {
    private final Map<String, T> aru = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.report.o
    /* renamed from: b */
    public synchronized void j(T t) {
        this.aru.put(t.actionId, t);
    }

    @Override // com.kwad.sdk.core.report.o
    public final synchronized List<T> BW() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.aru.size());
        for (Map.Entry<String, T> entry : this.aru.entrySet()) {
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }

    @Override // com.kwad.sdk.core.report.o
    public final synchronized long size() {
        int size;
        size = this.aru.size();
        com.kwad.sdk.core.e.c.d("MemReportCache", "size() = " + size);
        return size;
    }

    @Override // com.kwad.sdk.core.report.o
    public final synchronized void t(List<T> list) {
        for (T t : list) {
            this.aru.remove(t.actionId);
        }
    }
}
