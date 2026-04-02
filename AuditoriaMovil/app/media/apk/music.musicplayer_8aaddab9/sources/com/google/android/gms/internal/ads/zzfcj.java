package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* loaded from: classes.dex */
public final class zzfcj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfcj> CREATOR = new zzfck();
    @Nullable
    public final Context zza;
    public final zzfcg zzb;
    @SafeParcelable.Field(id = 2)
    public final int zzc;
    @SafeParcelable.Field(id = 3)
    public final int zzd;
    @SafeParcelable.Field(id = 4)
    public final int zze;
    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfcg[] zzh;
    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;
    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;
    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfcj(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) int i5, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i6, @SafeParcelable.Param(id = 7) int i7) {
        zzfcg[] values = zzfcg.values();
        this.zzh = values;
        int[] zza = zzfch.zza();
        this.zzl = zza;
        int[] zza2 = zzfci.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i2;
        this.zzb = values[i2];
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = str;
        this.zzj = i6;
        this.zzg = zza[i6];
        this.zzk = i7;
        int i8 = zza2[i7];
    }

    private zzfcj(@Nullable Context context, zzfcg zzfcgVar, int i2, int i3, int i4, String str, String str2, String str3) {
        this.zzh = zzfcg.values();
        this.zzl = zzfch.zza();
        this.zzm = zzfci.zza();
        this.zza = context;
        this.zzi = zzfcgVar.ordinal();
        this.zzb = zzfcgVar;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        int i5 = 2;
        if ("oldest".equals(str2)) {
            i5 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i5 = 3;
        }
        this.zzg = i5;
        this.zzj = i5 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
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
    public final void writeToParcel(Parcel parcel, int i2) {
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
}
