package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzffr {
    private final zzehp zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfam zzf;
    private final Clock zzg;
    private final zzaas zzh;

    public zzffr(zzehp zzehpVar, zzcgz zzcgzVar, String str, String str2, Context context, zzfam zzfamVar, Clock clock, zzaas zzaasVar) {
        this.zza = zzehpVar;
        this.zzb = zzcgzVar.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfamVar;
        this.zzg = clock;
        this.zzh = zzaasVar;
    }

    public static final List<String> zzd(int i, int i2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            StringBuilder sb = new StringBuilder(23);
            sb.append("2.");
            sb.append(i2);
            arrayList.add(zze(str, "@gw_mpe@", sb.toString()));
        }
        return arrayList;
    }

    private static String zze(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    private static String zzf(String str) {
        return (TextUtils.isEmpty(str) || !zzcgs.zzj()) ? str : "fakeForAdDebugLog";
    }

    public final List<String> zza(zzfal zzfalVar, zzezz zzezzVar, List<String> list) {
        return zzb(zzfalVar, zzezzVar, false, "", "", list);
    }

    public final List<String> zzb(zzfal zzfalVar, zzezz zzezzVar, boolean z, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1";
        for (String str4 : list) {
            String zze = zze(zze(zze(str4, "@gw_adlocid@", zzfalVar.zza.zza.zzf), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzb);
            if (zzezzVar != null) {
                zze = zzcfc.zza(zze(zze(zze(zze, "@gw_qdata@", zzezzVar.zzy), "@gw_adnetid@", zzezzVar.zzx), "@gw_allocid@", zzezzVar.zzw), this.zze, zzezzVar.zzS);
            }
            String zze2 = zze(zze(zze(zze, "@gw_adnetstatus@", this.zza.zzg()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z2 = false;
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzca)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (!z2) {
                if (z3) {
                    z3 = true;
                } else {
                    arrayList.add(zze2);
                }
            }
            if (this.zzh.zza(Uri.parse(zze2))) {
                Uri.Builder buildUpon = Uri.parse(zze2).buildUpon();
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zze2 = buildUpon.build().toString();
            }
            arrayList.add(zze2);
        }
        return arrayList;
    }

    public final List<String> zzc(zzezz zzezzVar, List<String> list, zzcbz zzcbzVar) {
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.zzg.currentTimeMillis();
        try {
            String zzb = zzcbzVar.zzb();
            String num = Integer.toString(zzcbzVar.zzc());
            zzfam zzfamVar = this.zzf;
            String zzf = zzfamVar == null ? "" : zzf(zzfamVar.zza);
            zzfam zzfamVar2 = this.zzf;
            String zzf2 = zzfamVar2 != null ? zzf(zzfamVar2.zzb) : "";
            for (String str : list) {
                arrayList.add(zzcfc.zza(zze(zze(zze(zze(zze(zze(str, "@gw_rwd_userid@", Uri.encode(zzf)), "@gw_rwd_custom_data@", Uri.encode(zzf2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zzb)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzb), this.zze, zzezzVar.zzS));
            }
            return arrayList;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
