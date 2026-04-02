package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzfcj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfcj> CREATOR = new zzfck();
    @Nullable
    public final Context zza;
    public final zzfcg zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfcg[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfcj(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        this.zzh = zzfcg.values();
        this.zzl = zzfch.zza();
        int[] zza = zzfci.zza();
        this.zzm = zza;
        this.zza = null;
        this.zzi = i;
        this.zzb = this.zzh[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = this.zzl[i5];
        this.zzk = i6;
        int i7 = zza[i6];
    }

    public static zzfcj zza(zzfcg zzfcgVar, Context context) {
        if (zzfcgVar == zzfcg.Rewarded) {
            return new zzfcj(context, zzfcgVar, ((Integer) zzbet.zzc().zzc(zzbjl.zzeH)).intValue(), ((Integer) zzbet.zzc().zzc(zzbjl.zzeN)).intValue(), ((Integer) zzbet.zzc().zzc(zzbjl.zzeP)).intValue(), (String) zzbet.zzc().zzc(zzbjl.zzeR), (String) zzbet.zzc().zzc(zzbjl.zzeJ), (String) zzbet.zzc().zzc(zzbjl.zzeL));
        } else if (zzfcgVar == zzfcg.Interstitial) {
            return new zzfcj(context, zzfcgVar, ((Integer) zzbet.zzc().zzc(zzbjl.zzeI)).intValue(), ((Integer) zzbet.zzc().zzc(zzbjl.zzeO)).intValue(), ((Integer) zzbet.zzc().zzc(zzbjl.zzeQ)).intValue(), (String) zzbet.zzc().zzc(zzbjl.zzeS), (String) zzbet.zzc().zzc(zzbjl.zzeK), (String) zzbet.zzc().zzc(zzbjl.zzeM));
        } else if (zzfcgVar == zzfcg.AppOpen) {
            return new zzfcj(context, zzfcgVar, ((Integer) zzbet.zzc().zzc(zzbjl.zzeV)).intValue(), ((Integer) zzbet.zzc().zzc(zzbjl.zzeX)).intValue(), ((Integer) zzbet.zzc().zzc(zzbjl.zzeY)).intValue(), (String) zzbet.zzc().zzc(zzbjl.zzeT), (String) zzbet.zzc().zzc(zzbjl.zzeU), (String) zzbet.zzc().zzc(zzbjl.zzeW));
        } else {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfcj(@Nullable Context context, zzfcg zzfcgVar, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfcg.values();
        this.zzl = zzfch.zza();
        this.zzm = zzfci.zza();
        this.zza = context;
        this.zzi = zzfcgVar.ordinal();
        this.zzb = zzfcgVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
