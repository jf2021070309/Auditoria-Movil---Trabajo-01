package com.amazon.aps.iva.f8;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: MediaRouteProviderDescriptor.java */
/* loaded from: classes.dex */
public final class d0 {
    public final List<y> a;
    public final boolean b;

    public d0(ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            this.a = Collections.emptyList();
        } else {
            this.a = Collections.unmodifiableList(new ArrayList(arrayList));
        }
        this.b = z;
    }

    public static d0 a(Bundle bundle) {
        y yVar;
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                if (bundle2 != null) {
                    yVar = new y(bundle2);
                } else {
                    yVar = null;
                }
                arrayList.add(yVar);
            }
        }
        return new d0(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public final boolean b() {
        List<y> list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            y yVar = list.get(i);
            if (yVar == null || !yVar.f()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(this.a.toArray()) + ", isValid=" + b() + " }";
    }
}
