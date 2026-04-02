package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzyy extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzyr();
    zzyx zza;
    int zzb;
    int zzc;
    final zzyx zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzyt zzh;
    private zzyv zzi;

    public zzyy() {
        this(zze, true);
    }

    private final void zzf(zzyx zzyxVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (zzyxVar != null) {
            zzyx zzyxVar2 = zzyxVar.zzb;
            zzyx zzyxVar3 = zzyxVar.zzc;
            int i5 = 0;
            if (zzyxVar2 != null) {
                i = zzyxVar2.zzi;
            } else {
                i = 0;
            }
            if (zzyxVar3 != null) {
                i2 = zzyxVar3.zzi;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                zzyx zzyxVar4 = zzyxVar3.zzb;
                zzyx zzyxVar5 = zzyxVar3.zzc;
                if (zzyxVar5 != null) {
                    i4 = zzyxVar5.zzi;
                } else {
                    i4 = 0;
                }
                if (zzyxVar4 != null) {
                    i5 = zzyxVar4.zzi;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    zzi(zzyxVar3);
                    zzh(zzyxVar);
                } else {
                    zzh(zzyxVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                zzyx zzyxVar6 = zzyxVar2.zzb;
                zzyx zzyxVar7 = zzyxVar2.zzc;
                if (zzyxVar7 != null) {
                    i3 = zzyxVar7.zzi;
                } else {
                    i3 = 0;
                }
                if (zzyxVar6 != null) {
                    i5 = zzyxVar6.zzi;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    zzh(zzyxVar2);
                    zzi(zzyxVar);
                } else {
                    zzi(zzyxVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                zzyxVar.zzi = i + 1;
                if (z) {
                    return;
                }
            } else {
                zzyxVar.zzi = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            zzyxVar = zzyxVar.zza;
        }
    }

    private final void zzg(zzyx zzyxVar, zzyx zzyxVar2) {
        zzyx zzyxVar3 = zzyxVar.zza;
        zzyxVar.zza = null;
        if (zzyxVar2 != null) {
            zzyxVar2.zza = zzyxVar3;
        }
        if (zzyxVar3 != null) {
            if (zzyxVar3.zzb == zzyxVar) {
                zzyxVar3.zzb = zzyxVar2;
                return;
            } else {
                zzyxVar3.zzc = zzyxVar2;
                return;
            }
        }
        this.zza = zzyxVar2;
    }

    private final void zzh(zzyx zzyxVar) {
        int i;
        int i2;
        zzyx zzyxVar2 = zzyxVar.zzb;
        zzyx zzyxVar3 = zzyxVar.zzc;
        zzyx zzyxVar4 = zzyxVar3.zzb;
        zzyx zzyxVar5 = zzyxVar3.zzc;
        zzyxVar.zzc = zzyxVar4;
        if (zzyxVar4 != null) {
            zzyxVar4.zza = zzyxVar;
        }
        zzg(zzyxVar, zzyxVar3);
        zzyxVar3.zzb = zzyxVar;
        zzyxVar.zza = zzyxVar3;
        int i3 = 0;
        if (zzyxVar2 != null) {
            i = zzyxVar2.zzi;
        } else {
            i = 0;
        }
        if (zzyxVar4 != null) {
            i2 = zzyxVar4.zzi;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        zzyxVar.zzi = max;
        if (zzyxVar5 != null) {
            i3 = zzyxVar5.zzi;
        }
        zzyxVar3.zzi = Math.max(max, i3) + 1;
    }

    private final void zzi(zzyx zzyxVar) {
        int i;
        int i2;
        zzyx zzyxVar2 = zzyxVar.zzb;
        zzyx zzyxVar3 = zzyxVar.zzc;
        zzyx zzyxVar4 = zzyxVar2.zzb;
        zzyx zzyxVar5 = zzyxVar2.zzc;
        zzyxVar.zzb = zzyxVar5;
        if (zzyxVar5 != null) {
            zzyxVar5.zza = zzyxVar;
        }
        zzg(zzyxVar, zzyxVar2);
        zzyxVar2.zzc = zzyxVar;
        zzyxVar.zza = zzyxVar2;
        int i3 = 0;
        if (zzyxVar3 != null) {
            i = zzyxVar3.zzi;
        } else {
            i = 0;
        }
        if (zzyxVar5 != null) {
            i2 = zzyxVar5.zzi;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        zzyxVar.zzi = max;
        if (zzyxVar4 != null) {
            i3 = zzyxVar4.zzi;
        }
        zzyxVar2.zzi = Math.max(max, i3) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzyx zzyxVar = this.zzd;
        zzyxVar.zze = zzyxVar;
        zzyxVar.zzd = zzyxVar;
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
        zzyt zzytVar = this.zzh;
        if (zzytVar != null) {
            return zzytVar;
        }
        zzyt zzytVar2 = new zzyt(this);
        this.zzh = zzytVar2;
        return zzytVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzyx zzc = zzc(obj);
        if (zzc != null) {
            return zzc.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzyv zzyvVar = this.zzi;
        if (zzyvVar != null) {
            return zzyvVar;
        }
        zzyv zzyvVar2 = new zzyv(this);
        this.zzi = zzyvVar2;
        return zzyvVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.zzg) {
                throw new NullPointerException("value == null");
            }
            zzyx zza = zza(obj, true);
            Object obj3 = zza.zzh;
            zza.zzh = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzyx zzd = zzd(obj);
        if (zzd != null) {
            return zzd.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    public final zzyx zza(Object obj, boolean z) {
        int i;
        zzyx zzyxVar;
        Comparable comparable;
        zzyx zzyxVar2;
        Comparator comparator = this.zzf;
        zzyx zzyxVar3 = this.zza;
        if (zzyxVar3 != null) {
            if (comparator == zze) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(zzyxVar3.zzf);
                } else {
                    i = comparator.compare(obj, zzyxVar3.zzf);
                }
                if (i == 0) {
                    return zzyxVar3;
                }
                if (i < 0) {
                    zzyxVar2 = zzyxVar3.zzb;
                } else {
                    zzyxVar2 = zzyxVar3.zzc;
                }
                if (zzyxVar2 == null) {
                    break;
                }
                zzyxVar3 = zzyxVar2;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        zzyx zzyxVar4 = this.zzd;
        if (zzyxVar3 == null) {
            if (comparator == zze && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zzyxVar = new zzyx(this.zzg, null, obj, zzyxVar4, zzyxVar4.zze);
            this.zza = zzyxVar;
        } else {
            zzyxVar = new zzyx(this.zzg, zzyxVar3, obj, zzyxVar4, zzyxVar4.zze);
            if (i < 0) {
                zzyxVar3.zzb = zzyxVar;
            } else {
                zzyxVar3.zzc = zzyxVar;
            }
            zzf(zzyxVar3, true);
        }
        this.zzb++;
        this.zzc++;
        return zzyxVar;
    }

    public final zzyx zzb(Map.Entry entry) {
        zzyx zzc = zzc(entry.getKey());
        if (zzc != null) {
            Object obj = zzc.zzh;
            Object value = entry.getValue();
            if (obj == value || (obj != null && obj.equals(value))) {
                return zzc;
            }
            return null;
        }
        return null;
    }

    public final zzyx zzc(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return zza(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final zzyx zzd(Object obj) {
        zzyx zzc = zzc(obj);
        if (zzc != null) {
            zze(zzc, true);
        }
        return zzc;
    }

    public final void zze(zzyx zzyxVar, boolean z) {
        zzyx zzyxVar2;
        zzyx zzyxVar3;
        int i;
        if (z) {
            zzyx zzyxVar4 = zzyxVar.zze;
            zzyxVar4.zzd = zzyxVar.zzd;
            zzyxVar.zzd.zze = zzyxVar4;
        }
        zzyx zzyxVar5 = zzyxVar.zzb;
        zzyx zzyxVar6 = zzyxVar.zzc;
        zzyx zzyxVar7 = zzyxVar.zza;
        int i2 = 0;
        if (zzyxVar5 != null && zzyxVar6 != null) {
            if (zzyxVar5.zzi > zzyxVar6.zzi) {
                do {
                    zzyxVar3 = zzyxVar5;
                    zzyxVar5 = zzyxVar5.zzc;
                } while (zzyxVar5 != null);
            } else {
                do {
                    zzyxVar2 = zzyxVar6;
                    zzyxVar6 = zzyxVar6.zzb;
                } while (zzyxVar6 != null);
                zzyxVar3 = zzyxVar2;
            }
            zze(zzyxVar3, false);
            zzyx zzyxVar8 = zzyxVar.zzb;
            if (zzyxVar8 != null) {
                i = zzyxVar8.zzi;
                zzyxVar3.zzb = zzyxVar8;
                zzyxVar8.zza = zzyxVar3;
                zzyxVar.zzb = null;
            } else {
                i = 0;
            }
            zzyx zzyxVar9 = zzyxVar.zzc;
            if (zzyxVar9 != null) {
                i2 = zzyxVar9.zzi;
                zzyxVar3.zzc = zzyxVar9;
                zzyxVar9.zza = zzyxVar3;
                zzyxVar.zzc = null;
            }
            zzyxVar3.zzi = Math.max(i, i2) + 1;
            zzg(zzyxVar, zzyxVar3);
            return;
        }
        if (zzyxVar5 != null) {
            zzg(zzyxVar, zzyxVar5);
            zzyxVar.zzb = null;
        } else if (zzyxVar6 != null) {
            zzg(zzyxVar, zzyxVar6);
            zzyxVar.zzc = null;
        } else {
            zzg(zzyxVar, null);
        }
        zzf(zzyxVar7, false);
        this.zzb--;
        this.zzc++;
    }

    public zzyy(Comparator comparator, boolean z) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z;
        this.zzd = new zzyx(z);
    }

    public zzyy(boolean z) {
        this(zze, false);
    }
}
