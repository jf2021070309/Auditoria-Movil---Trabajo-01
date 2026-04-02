package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzazj;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* loaded from: classes.dex */
public final class zzz {
    private final String zza;

    public /* synthetic */ zzz(zzx zzxVar, zzy zzyVar) {
        String str;
        str = zzxVar.zza;
        this.zza = str;
    }

    public final Set<String> zza() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzazj zzc() {
        char c2;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        return c2 != 0 ? c2 != 1 ? c2 != 2 ? c2 != 3 ? zzazj.AD_INITIATER_UNSPECIFIED : zzazj.REWARD_BASED_VIDEO_AD : zzazj.AD_LOADER : zzazj.INTERSTITIAL : zzazj.BANNER;
    }
}
