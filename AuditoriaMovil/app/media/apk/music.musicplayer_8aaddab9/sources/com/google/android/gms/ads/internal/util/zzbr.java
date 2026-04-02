package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzchl;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzvy;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.internal.ads.zzxj;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbr {
    private static zzwf zzb;
    private static final Object zzc = new Object();
    @Deprecated
    public static final zzbm<Void> zza = new zzbj();

    public zzbr(Context context) {
        zzwf zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbjl.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) zzbet.zzc().zzc(zzbjl.zzcQ)).booleanValue()) {
                        zza2 = zzba.zzb(context);
                        zzb = zza2;
                    }
                }
                zza2 = zzxj.zza(context, null);
                zzb = zza2;
            }
        }
    }

    public final zzfsm<zzvy> zza(String str) {
        zzchl zzchlVar = new zzchl();
        zzb.zzb(new zzbq(str, null, zzchlVar));
        return zzchlVar;
    }

    public final zzfsm<String> zzb(int i2, String str, Map<String, String> map, byte[] bArr) {
        zzbo zzboVar = new zzbo(null);
        zzbk zzbkVar = new zzbk(this, str, zzboVar);
        zzcgs zzcgsVar = new zzcgs(null);
        zzbl zzblVar = new zzbl(this, i2, str, zzboVar, zzbkVar, bArr, map, zzcgsVar);
        if (zzcgs.zzj()) {
            try {
                zzcgsVar.zzb(str, "GET", zzblVar.zzn(), zzblVar.zzo());
            } catch (zzvk e2) {
                zzcgt.zzi(e2.getMessage());
            }
        }
        zzb.zzb(zzblVar);
        return zzboVar;
    }
}
