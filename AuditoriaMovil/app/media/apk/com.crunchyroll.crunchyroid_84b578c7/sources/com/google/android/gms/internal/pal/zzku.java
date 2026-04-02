package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzku {
    private final Class zza;
    private zzkv zzc;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private zzrb zzd = zzrb.zza;

    public /* synthetic */ zzku(Class cls, zzkt zzktVar) {
        this.zza = cls;
    }

    private final zzku zze(Object obj, zzwa zzwaVar, boolean z) throws GeneralSecurityException {
        zzks zza;
        byte[] array;
        if (this.zzb != null) {
            if (zzwaVar.zzi() == 3) {
                ConcurrentMap concurrentMap = this.zzb;
                Integer valueOf = Integer.valueOf(zzwaVar.zza());
                if (zzwaVar.zzj() == 5) {
                    valueOf = null;
                }
                zzka zza2 = zzpj.zzb().zza(zzps.zzf(zzwaVar.zzc().zzg(), zzwaVar.zzc().zzf(), zzwaVar.zzc().zzc(), zzwaVar.zzj(), valueOf), zzlg.zza());
                if (zza2 instanceof zzpc) {
                    zza = new zzkz(zzwaVar.zzc().zzg(), zzwaVar.zzj(), null);
                } else {
                    zza = zza2.zza();
                }
                zzks zzksVar = zza;
                int zzj = zzwaVar.zzj() - 2;
                if (zzj != 1) {
                    if (zzj != 2) {
                        if (zzj != 3) {
                            if (zzj != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        } else {
                            array = zzjv.zza;
                        }
                    }
                    array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzwaVar.zza()).array();
                } else {
                    array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzwaVar.zza()).array();
                }
                zzkv zzkvVar = new zzkv(obj, array, zzwaVar.zzi(), zzwaVar.zzj(), zzwaVar.zza(), zza2, zzksVar);
                ArrayList arrayList = new ArrayList();
                arrayList.add(zzkvVar);
                zzkx zzkxVar = new zzkx(zzkvVar.zzd(), null);
                List list = (List) concurrentMap.put(zzkxVar, Collections.unmodifiableList(arrayList));
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list);
                    arrayList2.add(zzkvVar);
                    concurrentMap.put(zzkxVar, Collections.unmodifiableList(arrayList2));
                }
                if (z) {
                    if (this.zzc == null) {
                        this.zzc = zzkvVar;
                    } else {
                        throw new IllegalStateException("you cannot set two primary primitives");
                    }
                }
                return this;
            }
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        throw new IllegalStateException("addPrimitive cannot be called after build");
    }

    public final zzku zza(Object obj, zzwa zzwaVar) throws GeneralSecurityException {
        zze(obj, zzwaVar, true);
        return this;
    }

    public final zzku zzb(Object obj, zzwa zzwaVar) throws GeneralSecurityException {
        zze(obj, zzwaVar, false);
        return this;
    }

    public final zzku zzc(zzrb zzrbVar) {
        if (this.zzb != null) {
            this.zzd = zzrbVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzlb zzd() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap != null) {
            zzlb zzlbVar = new zzlb(concurrentMap, this.zzc, this.zzd, this.zza, null);
            this.zzb = null;
            return zzlbVar;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
