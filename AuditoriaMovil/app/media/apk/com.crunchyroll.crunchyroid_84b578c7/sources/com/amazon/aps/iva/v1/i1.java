package com.amazon.aps.iva.v1;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.savedstate.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: DisposableSaveableStateRegistry.android.kt */
/* loaded from: classes.dex */
public final class i1 implements a.b {
    public final /* synthetic */ com.amazon.aps.iva.x0.i a;

    public i1(com.amazon.aps.iva.x0.j jVar) {
        this.a = jVar;
    }

    @Override // androidx.savedstate.a.b
    public final Bundle a() {
        ArrayList<? extends Parcelable> arrayList;
        Map<String, List<Object>> d = this.a.d();
        Bundle bundle = new Bundle();
        for (Map.Entry<String, List<Object>> entry : d.entrySet()) {
            String key = entry.getKey();
            List<Object> value = entry.getValue();
            if (value instanceof ArrayList) {
                arrayList = (ArrayList) value;
            } else {
                arrayList = new ArrayList<>(value);
            }
            bundle.putParcelableArrayList(key, arrayList);
        }
        return bundle;
    }
}
