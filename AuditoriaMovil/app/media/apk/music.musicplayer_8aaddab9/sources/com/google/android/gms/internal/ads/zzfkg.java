package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class zzfkg {
    private static final HashMap<String, Class<?>> zza = new HashMap<>();
    private final Context zzb;
    private final zzfkh zzc;
    private final zzfii zzd;
    private final zzfie zze;
    private zzfjv zzf;
    private final Object zzg = new Object();

    public zzfkg(Context context, zzfkh zzfkhVar, zzfii zzfiiVar, zzfie zzfieVar) {
        this.zzb = context;
        this.zzc = zzfkhVar;
        this.zzd = zzfiiVar;
        this.zze = zzfieVar;
    }

    private final synchronized Class<?> zzd(zzfjw zzfjwVar) throws zzfkf {
        String zza2 = zzfjwVar.zza().zza();
        HashMap<String, Class<?>> hashMap = zza;
        Class<?> cls = hashMap.get(zza2);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfjwVar.zzb())) {
                throw new zzfkf(2026, "VM did not pass signature verification");
            }
            try {
                File zzc = zzfjwVar.zzc();
                if (!zzc.exists()) {
                    zzc.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfjwVar.zzb().getAbsolutePath(), zzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zza2, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
                throw new zzfkf((int) AdError.REMOTE_ADS_SERVICE_ERROR, e2);
            }
        } catch (GeneralSecurityException e3) {
            throw new zzfkf(2026, e3);
        }
    }

    public final boolean zza(zzfjw zzfjwVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfjv zzfjvVar = new zzfjv(zzd(zzfjwVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfjwVar.zzd(), null, new Bundle(), 2), zzfjwVar, this.zzc, this.zzd);
                if (zzfjvVar.zzf()) {
                    int zzh = zzfjvVar.zzh();
                    if (zzh != 0) {
                        StringBuilder sb = new StringBuilder(15);
                        sb.append("ci: ");
                        sb.append(zzh);
                        throw new zzfkf(4001, sb.toString());
                    }
                    synchronized (this.zzg) {
                        zzfjv zzfjvVar2 = this.zzf;
                        if (zzfjvVar2 != null) {
                            try {
                                zzfjvVar2.zzg();
                            } catch (zzfkf e2) {
                                this.zzd.zzc(e2.zza(), -1L, e2);
                            }
                        }
                        this.zzf = zzfjvVar;
                    }
                    this.zzd.zzb(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new zzfkf(4000, "init failed");
            } catch (Exception e3) {
                throw new zzfkf((int) AdError.INTERNAL_ERROR_2004, e3);
            }
        } catch (zzfkf e4) {
            this.zzd.zzc(e4.zza(), System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        } catch (Exception e5) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e5);
            return false;
        }
    }

    public final zzfil zzb() {
        zzfjv zzfjvVar;
        synchronized (this.zzg) {
            zzfjvVar = this.zzf;
        }
        return zzfjvVar;
    }

    public final zzfjw zzc() {
        synchronized (this.zzg) {
            zzfjv zzfjvVar = this.zzf;
            if (zzfjvVar != null) {
                return zzfjvVar.zze();
            }
            return null;
        }
    }
}
