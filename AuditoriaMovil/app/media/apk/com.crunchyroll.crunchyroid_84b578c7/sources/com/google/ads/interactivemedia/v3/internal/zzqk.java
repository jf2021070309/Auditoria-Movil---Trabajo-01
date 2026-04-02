package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.cast.CastStatusCodes;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzqk {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzql zzc;
    private final zzoy zzd;
    private final zzot zze;
    private zzpz zzf;
    private final Object zzg = new Object();

    public zzqk(Context context, zzql zzqlVar, zzoy zzoyVar, zzot zzotVar) {
        this.zzb = context;
        this.zzc = zzqlVar;
        this.zzd = zzoyVar;
        this.zze = zzotVar;
    }

    private final synchronized Class zzd(zzqa zzqaVar) throws zzqj {
        String zzk = zzqaVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzqaVar.zzc())) {
                try {
                    File zzb = zzqaVar.zzb();
                    if (!zzb.exists()) {
                        zzb.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(zzqaVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(zzk, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                    throw new zzqj(2008, e);
                }
            }
            throw new zzqj(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e2) {
            throw new zzqj(2026, e2);
        }
    }

    public final zzpb zza() {
        zzpz zzpzVar;
        synchronized (this.zzg) {
            zzpzVar = this.zzf;
        }
        return zzpzVar;
    }

    public final zzqa zzb() {
        synchronized (this.zzg) {
            zzpz zzpzVar = this.zzf;
            if (zzpzVar != null) {
                return zzpzVar.zzf();
            }
            return null;
        }
    }

    public final boolean zzc(zzqa zzqaVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzpz zzpzVar = new zzpz(zzd(zzqaVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzqaVar.zze(), null, new Bundle(), 2), zzqaVar, this.zzc, this.zzd);
                if (zzpzVar.zzh()) {
                    int zze = zzpzVar.zze();
                    if (zze == 0) {
                        synchronized (this.zzg) {
                            zzpz zzpzVar2 = this.zzf;
                            if (zzpzVar2 != null) {
                                try {
                                    zzpzVar2.zzg();
                                } catch (zzqj e) {
                                    this.zzd.zzc(e.zza(), -1L, e);
                                }
                            }
                            this.zzf = zzpzVar;
                        }
                        this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                        return true;
                    }
                    throw new zzqj(4001, "ci: " + zze);
                }
                throw new zzqj(4000, "init failed");
            } catch (Exception e2) {
                throw new zzqj((int) CastStatusCodes.APPLICATION_NOT_FOUND, e2);
            }
        } catch (zzqj e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}
