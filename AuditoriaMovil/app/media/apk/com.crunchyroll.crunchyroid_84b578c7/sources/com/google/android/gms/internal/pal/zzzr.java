package com.google.android.gms.internal.pal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzzr extends AbstractMap implements Serializable {
    private static final Comparator zzf = new zzzk();
    final Comparator zza;
    zzzq zzb;
    int zzc;
    int zzd;
    final zzzq zze;
    private zzzm zzg;
    private zzzo zzh;

    public zzzr() {
        Comparator comparator = zzf;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = new zzzq();
        this.zza = comparator;
    }

    private final void zzf(zzzq zzzqVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (zzzqVar != null) {
            zzzq zzzqVar2 = zzzqVar.zzb;
            zzzq zzzqVar3 = zzzqVar.zzc;
            int i5 = 0;
            if (zzzqVar2 != null) {
                i = zzzqVar2.zzh;
            } else {
                i = 0;
            }
            if (zzzqVar3 != null) {
                i2 = zzzqVar3.zzh;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                zzzq zzzqVar4 = zzzqVar3.zzb;
                zzzq zzzqVar5 = zzzqVar3.zzc;
                if (zzzqVar5 != null) {
                    i4 = zzzqVar5.zzh;
                } else {
                    i4 = 0;
                }
                if (zzzqVar4 != null) {
                    i5 = zzzqVar4.zzh;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    zzi(zzzqVar3);
                    zzh(zzzqVar);
                } else {
                    zzh(zzzqVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                zzzq zzzqVar6 = zzzqVar2.zzb;
                zzzq zzzqVar7 = zzzqVar2.zzc;
                if (zzzqVar7 != null) {
                    i3 = zzzqVar7.zzh;
                } else {
                    i3 = 0;
                }
                if (zzzqVar6 != null) {
                    i5 = zzzqVar6.zzh;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    zzh(zzzqVar2);
                    zzi(zzzqVar);
                } else {
                    zzi(zzzqVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                zzzqVar.zzh = i + 1;
                if (z) {
                    return;
                }
            } else {
                zzzqVar.zzh = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            zzzqVar = zzzqVar.zza;
        }
    }

    private final void zzg(zzzq zzzqVar, zzzq zzzqVar2) {
        zzzq zzzqVar3 = zzzqVar.zza;
        zzzqVar.zza = null;
        if (zzzqVar2 != null) {
            zzzqVar2.zza = zzzqVar3;
        }
        if (zzzqVar3 != null) {
            if (zzzqVar3.zzb == zzzqVar) {
                zzzqVar3.zzb = zzzqVar2;
                return;
            } else {
                zzzqVar3.zzc = zzzqVar2;
                return;
            }
        }
        this.zzb = zzzqVar2;
    }

    private final void zzh(zzzq zzzqVar) {
        int i;
        int i2;
        zzzq zzzqVar2 = zzzqVar.zzb;
        zzzq zzzqVar3 = zzzqVar.zzc;
        zzzq zzzqVar4 = zzzqVar3.zzb;
        zzzq zzzqVar5 = zzzqVar3.zzc;
        zzzqVar.zzc = zzzqVar4;
        if (zzzqVar4 != null) {
            zzzqVar4.zza = zzzqVar;
        }
        zzg(zzzqVar, zzzqVar3);
        zzzqVar3.zzb = zzzqVar;
        zzzqVar.zza = zzzqVar3;
        int i3 = 0;
        if (zzzqVar2 != null) {
            i = zzzqVar2.zzh;
        } else {
            i = 0;
        }
        if (zzzqVar4 != null) {
            i2 = zzzqVar4.zzh;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        zzzqVar.zzh = max;
        if (zzzqVar5 != null) {
            i3 = zzzqVar5.zzh;
        }
        zzzqVar3.zzh = Math.max(max, i3) + 1;
    }

    private final void zzi(zzzq zzzqVar) {
        int i;
        int i2;
        zzzq zzzqVar2 = zzzqVar.zzb;
        zzzq zzzqVar3 = zzzqVar.zzc;
        zzzq zzzqVar4 = zzzqVar2.zzb;
        zzzq zzzqVar5 = zzzqVar2.zzc;
        zzzqVar.zzb = zzzqVar5;
        if (zzzqVar5 != null) {
            zzzqVar5.zza = zzzqVar;
        }
        zzg(zzzqVar, zzzqVar2);
        zzzqVar2.zzc = zzzqVar;
        zzzqVar.zza = zzzqVar2;
        int i3 = 0;
        if (zzzqVar3 != null) {
            i = zzzqVar3.zzh;
        } else {
            i = 0;
        }
        if (zzzqVar5 != null) {
            i2 = zzzqVar5.zzh;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        zzzqVar.zzh = max;
        if (zzzqVar4 != null) {
            i3 = zzzqVar4.zzh;
        }
        zzzqVar2.zzh = Math.max(max, i3) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zzb = null;
        this.zzc = 0;
        this.zzd++;
        zzzq zzzqVar = this.zze;
        zzzqVar.zze = zzzqVar;
        zzzqVar.zzd = zzzqVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (zzc(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzzm zzzmVar = this.zzg;
        if (zzzmVar != null) {
            return zzzmVar;
        }
        zzzm zzzmVar2 = new zzzm(this);
        this.zzg = zzzmVar2;
        return zzzmVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzzq zzc = zzc(obj);
        if (zzc != null) {
            return zzc.zzg;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzzo zzzoVar = this.zzh;
        if (zzzoVar != null) {
            return zzzoVar;
        }
        zzzo zzzoVar2 = new zzzo(this);
        this.zzh = zzzoVar2;
        return zzzoVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            zzzq zza = zza(obj, true);
            Object obj3 = zza.zzg;
            zza.zzg = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzzq zzd = zzd(obj);
        if (zzd != null) {
            return zzd.zzg;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc;
    }

    public final zzzq zza(Object obj, boolean z) {
        int i;
        zzzq zzzqVar;
        Comparable comparable;
        zzzq zzzqVar2;
        Comparator comparator = this.zza;
        zzzq zzzqVar3 = this.zzb;
        if (zzzqVar3 != null) {
            if (comparator == zzf) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(zzzqVar3.zzf);
                } else {
                    i = comparator.compare(obj, zzzqVar3.zzf);
                }
                if (i == 0) {
                    return zzzqVar3;
                }
                if (i < 0) {
                    zzzqVar2 = zzzqVar3.zzb;
                } else {
                    zzzqVar2 = zzzqVar3.zzc;
                }
                if (zzzqVar2 == null) {
                    break;
                }
                zzzqVar3 = zzzqVar2;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        zzzq zzzqVar4 = this.zze;
        if (zzzqVar3 == null) {
            if (comparator == zzf && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zzzqVar = new zzzq(null, obj, zzzqVar4, zzzqVar4.zze);
            this.zzb = zzzqVar;
        } else {
            zzzqVar = new zzzq(zzzqVar3, obj, zzzqVar4, zzzqVar4.zze);
            if (i < 0) {
                zzzqVar3.zzb = zzzqVar;
            } else {
                zzzqVar3.zzc = zzzqVar;
            }
            zzf(zzzqVar3, true);
        }
        this.zzc++;
        this.zzd++;
        return zzzqVar;
    }

    public final zzzq zzb(Map.Entry entry) {
        zzzq zzc = zzc(entry.getKey());
        if (zzc != null) {
            Object obj = zzc.zzg;
            Object value = entry.getValue();
            if (obj == value || (obj != null && obj.equals(value))) {
                return zzc;
            }
            return null;
        }
        return null;
    }

    public final zzzq zzc(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return zza(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final zzzq zzd(Object obj) {
        zzzq zzc = zzc(obj);
        if (zzc != null) {
            zze(zzc, true);
        }
        return zzc;
    }

    public final void zze(zzzq zzzqVar, boolean z) {
        zzzq zzzqVar2;
        zzzq zzzqVar3;
        int i;
        if (z) {
            zzzq zzzqVar4 = zzzqVar.zze;
            zzzqVar4.zzd = zzzqVar.zzd;
            zzzqVar.zzd.zze = zzzqVar4;
        }
        zzzq zzzqVar5 = zzzqVar.zzb;
        zzzq zzzqVar6 = zzzqVar.zzc;
        zzzq zzzqVar7 = zzzqVar.zza;
        int i2 = 0;
        if (zzzqVar5 != null && zzzqVar6 != null) {
            if (zzzqVar5.zzh > zzzqVar6.zzh) {
                do {
                    zzzqVar3 = zzzqVar5;
                    zzzqVar5 = zzzqVar5.zzc;
                } while (zzzqVar5 != null);
            } else {
                do {
                    zzzqVar2 = zzzqVar6;
                    zzzqVar6 = zzzqVar6.zzb;
                } while (zzzqVar6 != null);
                zzzqVar3 = zzzqVar2;
            }
            zze(zzzqVar3, false);
            zzzq zzzqVar8 = zzzqVar.zzb;
            if (zzzqVar8 != null) {
                i = zzzqVar8.zzh;
                zzzqVar3.zzb = zzzqVar8;
                zzzqVar8.zza = zzzqVar3;
                zzzqVar.zzb = null;
            } else {
                i = 0;
            }
            zzzq zzzqVar9 = zzzqVar.zzc;
            if (zzzqVar9 != null) {
                i2 = zzzqVar9.zzh;
                zzzqVar3.zzc = zzzqVar9;
                zzzqVar9.zza = zzzqVar3;
                zzzqVar.zzc = null;
            }
            zzzqVar3.zzh = Math.max(i, i2) + 1;
            zzg(zzzqVar, zzzqVar3);
            return;
        }
        if (zzzqVar5 != null) {
            zzg(zzzqVar, zzzqVar5);
            zzzqVar.zzb = null;
        } else if (zzzqVar6 != null) {
            zzg(zzzqVar, zzzqVar6);
            zzzqVar.zzc = null;
        } else {
            zzg(zzzqVar, null);
        }
        zzf(zzzqVar7, false);
        this.zzc--;
        this.zzd++;
    }
}
