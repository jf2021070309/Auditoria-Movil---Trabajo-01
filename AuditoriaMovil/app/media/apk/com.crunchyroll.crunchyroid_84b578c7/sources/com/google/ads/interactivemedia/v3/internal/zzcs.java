package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzcs {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final Map zzh = new WeakHashMap();
    private boolean zzi;

    public final View zza(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzcr zzb(View view) {
        zzcr zzcrVar = (zzcr) this.zzb.get(view);
        if (zzcrVar != null) {
            this.zzb.remove(view);
        }
        return zzcrVar;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final String zzd(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = (String) this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzi = false;
    }

    public final void zzh() {
        this.zzi = true;
    }

    public final void zzi() {
        Boolean bool;
        String str;
        zzbx zza = zzbx.zza();
        if (zza != null) {
            for (com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar : zza.zzb()) {
                View zzg = zzeVar.zzg();
                if (zzeVar.zzk()) {
                    String zzi = zzeVar.zzi();
                    if (zzg != null) {
                        if (!zzg.isAttachedToWindow()) {
                            str = "notAttached";
                        } else {
                            if (zzg.hasWindowFocus()) {
                                this.zzh.remove(zzg);
                                bool = Boolean.FALSE;
                            } else if (this.zzh.containsKey(zzg)) {
                                bool = (Boolean) this.zzh.get(zzg);
                            } else {
                                Map map = this.zzh;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(zzg, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = zzg;
                                while (true) {
                                    if (view != null) {
                                        String zzb = zzcq.zzb(view);
                                        if (zzb != null) {
                                            str = zzb;
                                            break;
                                        }
                                        hashSet.add(view);
                                        ViewParent parent = view.getParent();
                                        if (parent instanceof View) {
                                            view = (View) parent;
                                        } else {
                                            view = null;
                                        }
                                    } else {
                                        this.zzd.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                }
                            }
                        }
                        if (str == null) {
                            this.zze.add(zzi);
                            this.zza.put(zzg, zzi);
                            for (zzbz zzbzVar : zzeVar.zzj()) {
                                View view2 = (View) zzbzVar.zzb().get();
                                if (view2 != null) {
                                    zzcr zzcrVar = (zzcr) this.zzb.get(view2);
                                    if (zzcrVar != null) {
                                        zzcrVar.zzc(zzeVar.zzi());
                                    } else {
                                        this.zzb.put(view2, new zzcr(zzbzVar, zzeVar.zzi()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(zzi);
                            this.zzc.put(zzi, zzg);
                            this.zzg.put(zzi, str);
                        }
                    } else {
                        this.zzf.add(zzi);
                        this.zzg.put(zzi, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean zzj(View view) {
        if (this.zzh.containsKey(view)) {
            this.zzh.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    public final int zzk(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        if (this.zzi) {
            return 2;
        }
        return 3;
    }
}
