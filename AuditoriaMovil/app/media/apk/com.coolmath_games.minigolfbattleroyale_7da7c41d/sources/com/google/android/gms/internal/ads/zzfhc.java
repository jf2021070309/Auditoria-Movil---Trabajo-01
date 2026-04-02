package com.google.android.gms.internal.ads;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfhc implements zzfha {
    private final zzfha zza;

    public zzfhc(zzfha zzfhaVar) {
        this.zza = zzfhaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfha
    public final JSONObject zza(View view) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfha
    public final void zzb(View view, JSONObject jSONObject, zzfgz zzfgzVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        zzfgr zza = zzfgr.zza();
        if (zza != null) {
            Collection<zzfgg> zzf = zza.zzf();
            int size = zzf.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (zzfgg zzfggVar : zzf) {
                View zzi = zzfggVar.zzi();
                if (zzi != null && (Build.VERSION.SDK_INT < 19 || zzi.isAttachedToWindow())) {
                    if (zzi.isShown()) {
                        View view2 = zzi;
                        while (true) {
                            if (view2 != null) {
                                if (view2.getAlpha() != 0.0f) {
                                    ViewParent parent = view2.getParent();
                                    view2 = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                View rootView = zzi.getRootView();
                                if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                    identityHashMap.put(rootView, rootView);
                                    float zza2 = zzfhl.zza(rootView);
                                    int size2 = arrayList.size();
                                    while (size2 > 0) {
                                        int i = size2 - 1;
                                        if (zzfhl.zza((View) arrayList.get(i)) <= zza2) {
                                            break;
                                        }
                                        size2 = i;
                                    }
                                    arrayList.add(size2, rootView);
                                }
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzfgzVar.zza((View) arrayList.get(i2), this.zza, jSONObject);
        }
    }
}
