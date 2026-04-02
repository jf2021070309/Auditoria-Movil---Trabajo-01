package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import android.view.ViewParent;
import com.amazon.aps.iva.if0.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzch implements zzcf {
    private final zzcf zza;

    public zzch(zzcf zzcfVar) {
        this.zza = zzcfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzcf
    public final c zza(View view) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzcf
    public final void zzb(View view, c cVar, zzce zzceVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        zzbx zza = zzbx.zza();
        if (zza != null) {
            Collection<com.google.ads.interactivemedia.omid.library.adsession.zze> zzb = zza.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar : zzb) {
                View zzg = zzeVar.zzg();
                if (zzg != null && zzg.isAttachedToWindow() && zzg.isShown()) {
                    View view2 = zzg;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() != 0.0f) {
                                ViewParent parent = view2.getParent();
                                if (parent instanceof View) {
                                    view2 = (View) parent;
                                } else {
                                    view2 = null;
                                }
                            }
                        } else {
                            View rootView = zzg.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float zza2 = zzcq.zza(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (zzcq.zza((View) arrayList.get(i)) <= zza2) {
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
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzceVar.zza((View) arrayList.get(i2), this.zza, cVar, z2);
        }
    }
}
