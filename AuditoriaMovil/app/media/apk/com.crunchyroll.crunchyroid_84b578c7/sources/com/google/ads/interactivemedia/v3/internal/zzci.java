package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.if0.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzci implements zzcf {
    private final int[] zza = new int[2];

    @Override // com.google.ads.interactivemedia.v3.internal.zzcf
    public final c zza(View view) {
        if (view == null) {
            return zzcn.zza(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.zza);
        int[] iArr = this.zza;
        return zzcn.zza(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzcf
    public final void zzb(View view, c cVar, zzce zzceVar, boolean z, boolean z2) {
        int i;
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (z) {
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
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
            int i3 = 0;
            while (i3 < size) {
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i3));
                int size2 = arrayList3.size();
                int i4 = 0;
                while (true) {
                    i = i3 + 1;
                    if (i4 < size2) {
                        zzceVar.zza((View) arrayList3.get(i4), this, cVar, z2);
                        i4++;
                    }
                }
                i3 = i;
            }
            return;
        }
        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
            zzceVar.zza(viewGroup.getChildAt(i5), this, cVar, z2);
        }
    }
}
