package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzafr implements zzagt {
    private static final zzafx zza = new zzafp();
    private final zzafx zzb;

    public zzafr() {
        zzafx zzafxVar;
        zzafx[] zzafxVarArr = new zzafx[2];
        zzafxVarArr[0] = zzaeo.zza();
        try {
            zzafxVar = (zzafx) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzafxVar = zza;
        }
        zzafxVarArr[1] = zzafxVar;
        zzafq zzafqVar = new zzafq(zzafxVarArr);
        byte[] bArr = zzafa.zzd;
        this.zzb = zzafqVar;
    }

    private static boolean zzb(zzafw zzafwVar) {
        if (zzafwVar.zzc() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagt
    public final zzags zza(Class cls) {
        zzagu.zzE(cls);
        zzafw zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzaet.class.isAssignableFrom(cls)) {
                return zzagd.zzc(zzagu.zzA(), zzaei.zzb(), zzb.zza());
            }
            return zzagd.zzc(zzagu.zzy(), zzaei.zza(), zzb.zza());
        } else if (zzaet.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzagc.zzm(cls, zzb, zzagf.zzb(), zzafn.zze(), zzagu.zzA(), zzaei.zzb(), zzafv.zzb());
            }
            return zzagc.zzm(cls, zzb, zzagf.zzb(), zzafn.zze(), zzagu.zzA(), null, zzafv.zzb());
        } else if (zzb(zzb)) {
            return zzagc.zzm(cls, zzb, zzagf.zza(), zzafn.zzd(), zzagu.zzy(), zzaei.zza(), zzafv.zza());
        } else {
            return zzagc.zzm(cls, zzb, zzagf.zza(), zzafn.zzd(), zzagu.zzz(), null, zzafv.zza());
        }
    }
}
