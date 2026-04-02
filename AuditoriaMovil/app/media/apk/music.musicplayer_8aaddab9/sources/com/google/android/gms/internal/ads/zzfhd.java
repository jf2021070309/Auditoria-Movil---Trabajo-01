package com.google.android.gms.internal.ads;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzfhd implements zzfha {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzfha
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfhi.zzb(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.zza);
        int[] iArr = this.zza;
        return zzfhi.zzb(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzfha
    public final void zzb(View view, JSONObject jSONObject, zzfgz zzfgzVar, boolean z) {
        int i2;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    zzfgzVar.zza(viewGroup.getChildAt(i3), this, jSONObject);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt = viewGroup.getChildAt(i4);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i5 = 0;
            while (i5 < size) {
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i5));
                int size2 = arrayList3.size();
                int i6 = 0;
                while (true) {
                    i2 = i5 + 1;
                    if (i6 < size2) {
                        zzfgzVar.zza((View) arrayList3.get(i6), this, jSONObject);
                        i6++;
                    }
                }
                i5 = i2;
            }
        }
    }
}
