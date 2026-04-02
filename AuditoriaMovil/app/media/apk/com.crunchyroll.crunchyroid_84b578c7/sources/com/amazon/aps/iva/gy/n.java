package com.amazon.aps.iva.gy;

import com.amazon.aps.iva.lb0.z;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import java.util.ArrayList;
import java.util.List;
/* compiled from: HomeFeedInteractor.kt */
/* loaded from: classes2.dex */
public final class n {
    public final List<HomeFeedItemRaw> a;
    public final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(List<? extends HomeFeedItemRaw> list, int i) {
        this.a = list;
        this.b = i;
    }

    public final List<HomeFeedItemRaw> a() {
        List<HomeFeedItemRaw> list = this.a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((HomeFeedItemRaw) obj).isValid()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return z.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, nVar.a) && this.b == nVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        List<HomeFeedItemRaw> list = this.a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return Integer.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "HomeFeedResponseContainer(_items=" + this.a + ", total=" + this.b + ")";
    }
}
