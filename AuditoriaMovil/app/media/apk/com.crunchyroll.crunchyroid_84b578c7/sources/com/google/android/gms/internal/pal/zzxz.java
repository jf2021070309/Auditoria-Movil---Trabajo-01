package com.google.android.gms.internal.pal;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzxz {
    public static final zzxz zza;
    public static final zzxz zzb;
    public static final zzxz zzc;
    public static final zzxz zzd;
    public static final zzxz zze;
    public static final zzxz zzf;
    public static final zzxz zzg;
    private static final Logger zzh = Logger.getLogger(zzxz.class.getName());
    private static final List zzi;
    private static final boolean zzj;
    private final zzyh zzk;

    static {
        if (zznb.zzb()) {
            zzi = zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt");
            zzj = false;
        } else if (zzyr.zza()) {
            zzi = zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL");
            zzj = true;
        } else {
            zzi = new ArrayList();
            zzj = true;
        }
        zza = new zzxz(new zzya());
        zzb = new zzxz(new zzye());
        zzc = new zzxz(new zzyg());
        zzd = new zzxz(new zzyf());
        zze = new zzxz(new zzyb());
        zzf = new zzxz(new zzyd());
        zzg = new zzxz(new zzyc());
    }

    public zzxz(zzyh zzyhVar) {
        this.zzk = zzyhVar;
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                zzh.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider provider : zzi) {
            try {
                return this.zzk.zza(str, provider);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (zzj) {
            return this.zzk.zza(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
