package com.google.android.gms.internal.cast;

import com.amazon.aps.iva.c80.a;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zznu extends zztp implements zzuy {
    private static final zznu zzb;
    private int zzd;
    private zzok zze;
    private long zzf;
    private int zzg;
    private zztx zzh = zztp.zzA();
    private zztx zzi = zztp.zzA();
    private zztx zzj = zztp.zzA();
    private zztx zzk = zztp.zzA();

    static {
        zznu zznuVar = new zznu();
        zzb = zznuVar;
        zztp.zzH(zznu.class, zznuVar);
    }

    private zznu() {
    }

    public static zznt zza() {
        return (zznt) zzb.zzv();
    }

    public static /* synthetic */ void zzd(zznu zznuVar, zzok zzokVar) {
        zzokVar.getClass();
        zznuVar.zze = zzokVar;
        zznuVar.zzd |= 1;
    }

    public static /* synthetic */ void zze(zznu zznuVar, long j) {
        zznuVar.zzd |= 2;
        zznuVar.zzf = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void zzf(zznu zznuVar, Iterable iterable) {
        zztx zztxVar = zznuVar.zzh;
        if (!zztxVar.zzc()) {
            zznuVar.zzh = zztp.zzB(zztxVar);
        }
        zztx zztxVar2 = zznuVar.zzh;
        byte[] bArr = zzty.zzd;
        if (zztxVar2 instanceof ArrayList) {
            ((ArrayList) zztxVar2).ensureCapacity(iterable.size() + zztxVar2.size());
        }
        int size = zztxVar2.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String d = a.d("Element at index ", zztxVar2.size() - size, " is null.");
                int size2 = zztxVar2.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    }
                    zztxVar2.remove(size2);
                }
                throw new NullPointerException(d);
            }
            zztxVar2.add(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void zzg(zznu zznuVar, Iterable iterable) {
        zztx zztxVar = zznuVar.zzi;
        if (!zztxVar.zzc()) {
            zznuVar.zzi = zztp.zzB(zztxVar);
        }
        zztx zztxVar2 = zznuVar.zzi;
        byte[] bArr = zzty.zzd;
        if (zztxVar2 instanceof ArrayList) {
            ((ArrayList) zztxVar2).ensureCapacity(iterable.size() + zztxVar2.size());
        }
        int size = zztxVar2.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String d = a.d("Element at index ", zztxVar2.size() - size, " is null.");
                int size2 = zztxVar2.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    }
                    zztxVar2.remove(size2);
                }
                throw new NullPointerException(d);
            }
            zztxVar2.add(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void zzh(zznu zznuVar, Iterable iterable) {
        zztx zztxVar = zznuVar.zzj;
        if (!zztxVar.zzc()) {
            zznuVar.zzj = zztp.zzB(zztxVar);
        }
        zztx zztxVar2 = zznuVar.zzj;
        byte[] bArr = zzty.zzd;
        if (zztxVar2 instanceof ArrayList) {
            ((ArrayList) zztxVar2).ensureCapacity(iterable.size() + zztxVar2.size());
        }
        int size = zztxVar2.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String d = a.d("Element at index ", zztxVar2.size() - size, " is null.");
                int size2 = zztxVar2.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    }
                    zztxVar2.remove(size2);
                }
                throw new NullPointerException(d);
            }
            zztxVar2.add(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void zzi(zznu zznuVar, Iterable iterable) {
        zztx zztxVar = zznuVar.zzk;
        if (!zztxVar.zzc()) {
            zznuVar.zzk = zztp.zzB(zztxVar);
        }
        zztx zztxVar2 = zznuVar.zzk;
        byte[] bArr = zzty.zzd;
        if (zztxVar2 instanceof ArrayList) {
            ((ArrayList) zztxVar2).ensureCapacity(iterable.size() + zztxVar2.size());
        }
        int size = zztxVar2.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String d = a.d("Element at index ", zztxVar2.size() - size, " is null.");
                int size2 = zztxVar2.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    }
                    zztxVar2.remove(size2);
                }
                throw new NullPointerException(d);
            }
            zztxVar2.add(obj);
        }
    }

    @Override // com.google.android.gms.internal.cast.zztp
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zznt(null);
                }
                return new zznu();
            }
            return zztp.zzE(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", zzlq.zza(), "zzh", zzns.class, "zzi", zznq.class, "zzj", zzny.class, "zzk", zznw.class});
        }
        return (byte) 1;
    }
}
