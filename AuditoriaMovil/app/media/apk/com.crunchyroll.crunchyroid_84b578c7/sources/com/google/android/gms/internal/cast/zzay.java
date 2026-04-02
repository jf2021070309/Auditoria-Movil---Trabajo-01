package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.f8.e0;
import com.amazon.aps.iva.f8.f0;
import com.google.android.gms.cast.CastMediaControlIntent;
import com.google.android.gms.cast.internal.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzay extends f0.a {
    private static final Logger zzb = new Logger("MRDiscoveryCallback");
    private final zzbg zzf;
    private final Map zzd = Collections.synchronizedMap(new HashMap());
    private final LinkedHashSet zze = new LinkedHashSet();
    private final Set zzc = Collections.synchronizedSet(new LinkedHashSet());
    public final zzax zza = new zzax(this);

    public zzay(Context context) {
        this.zzf = new zzbg(context);
    }

    @Override // com.amazon.aps.iva.f8.f0.a
    public final void onRouteAdded(f0 f0Var, f0.h hVar) {
        zzb.d("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        zzf(hVar, true);
    }

    @Override // com.amazon.aps.iva.f8.f0.a
    public final void onRouteChanged(f0 f0Var, f0.h hVar) {
        zzb.d("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        zzf(hVar, true);
    }

    @Override // com.amazon.aps.iva.f8.f0.a
    public final void onRouteRemoved(f0 f0Var, f0.h hVar) {
        zzb.d("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        zzf(hVar, false);
    }

    public final void zza(List list) {
        zzb.d(a.d("SetRouteDiscovery for ", list.size(), " IDs"), new Object[0]);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(zzes.zza((String) it.next()));
        }
        Map map = this.zzd;
        zzb.d("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
        HashMap hashMap = new HashMap();
        synchronized (this.zzd) {
            for (String str : linkedHashSet) {
                zzaw zzawVar = (zzaw) this.zzd.get(zzes.zza(str));
                if (zzawVar != null) {
                    hashMap.put(str, zzawVar);
                }
            }
            this.zzd.clear();
            this.zzd.putAll(hashMap);
        }
        Map map2 = this.zzd;
        zzb.d("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map2.keySet())), new Object[0]);
        synchronized (this.zze) {
            this.zze.clear();
            this.zze.addAll(linkedHashSet);
        }
        zzb();
    }

    public final void zzb() {
        LinkedHashSet linkedHashSet = this.zze;
        Logger logger = zzb;
        logger.d(a.d("Starting RouteDiscovery with ", linkedHashSet.size(), " IDs"), new Object[0]);
        logger.d("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzc();
        } else {
            new zzed(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzav
                @Override // java.lang.Runnable
                public final void run() {
                    zzay.this.zzc();
                }
            });
        }
    }

    public final void zzc() {
        this.zzf.zzb(this);
        synchronized (this.zze) {
            try {
                Iterator it = this.zze.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String categoryForCast = CastMediaControlIntent.categoryForCast(str);
                    if (categoryForCast != null) {
                        ArrayList<String> arrayList = new ArrayList<>();
                        if (!arrayList.contains(categoryForCast)) {
                            arrayList.add(categoryForCast);
                        }
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("controlCategories", arrayList);
                        e0 e0Var = new e0(bundle, arrayList);
                        if (((zzaw) this.zzd.get(str)) == null) {
                            this.zzd.put(str, new zzaw(e0Var));
                        }
                        Logger logger = zzb;
                        String categoryForCast2 = CastMediaControlIntent.categoryForCast(str);
                        logger.d("Adding mediaRouter callback for control category " + categoryForCast2, new Object[0]);
                        this.zzf.zza().a(e0Var, this, 4);
                    } else {
                        throw new IllegalArgumentException("category must not be null");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Map map = this.zzd;
        zzb.d("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
    }

    public final void zzd() {
        zzb.d("Stopping RouteDiscovery.", new Object[0]);
        this.zzd.clear();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.zzf.zzb(this);
        } else {
            new zzed(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzau
                @Override // java.lang.Runnable
                public final void run() {
                    zzay.this.zze();
                }
            });
        }
    }

    public final void zze() {
        this.zzf.zzb(this);
    }

    public final void zzf(f0.h hVar, boolean z) {
        boolean z2;
        zzfu zzj;
        boolean remove;
        Logger logger = zzb;
        logger.d("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), hVar);
        synchronized (this.zzd) {
            logger.d("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
            z2 = false;
            for (Map.Entry entry : this.zzd.entrySet()) {
                String str = (String) entry.getKey();
                zzaw zzawVar = (zzaw) entry.getValue();
                if (hVar.j(zzawVar.zzb)) {
                    if (z) {
                        Logger logger2 = zzb;
                        logger2.d("Adding/updating route for appId " + str, new Object[0]);
                        remove = zzawVar.zza.add(hVar);
                        if (!remove) {
                            logger2.w("Route " + String.valueOf(hVar) + " already exists for appId " + str, new Object[0]);
                        }
                    } else {
                        Logger logger3 = zzb;
                        logger3.d("Removing route for appId " + str, new Object[0]);
                        remove = zzawVar.zza.remove(hVar);
                        if (!remove) {
                            logger3.w("Route " + String.valueOf(hVar) + " already removed from appId " + str, new Object[0]);
                        }
                    }
                    z2 = remove;
                }
            }
        }
        if (z2) {
            zzb.d("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.zzc) {
                HashMap hashMap = new HashMap();
                synchronized (this.zzd) {
                    for (String str2 : this.zzd.keySet()) {
                        zzaw zzawVar2 = (zzaw) this.zzd.get(zzes.zza(str2));
                        if (zzawVar2 == null) {
                            zzj = zzfu.zzk();
                        } else {
                            zzj = zzfu.zzj(zzawVar2.zza);
                        }
                        if (!zzj.isEmpty()) {
                            hashMap.put(str2, zzj);
                        }
                    }
                }
                zzft.zzc(hashMap.entrySet());
                for (com.google.android.gms.cast.framework.zzbg zzbgVar : this.zzc) {
                    zzbgVar.zza();
                }
            }
        }
    }
}
