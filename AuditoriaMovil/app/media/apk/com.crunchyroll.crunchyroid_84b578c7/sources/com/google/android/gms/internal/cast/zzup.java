package com.google.android.gms.internal.cast;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzup implements zzvj {
    private static final zzuv zza = new zzun();
    private final zzuv zzb;

    public zzup() {
        zzuv zzuvVar;
        zzuv[] zzuvVarArr = new zzuv[2];
        zzuvVarArr[0] = zztl.zza();
        try {
            zzuvVar = (zzuv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzuvVar = zza;
        }
        zzuvVarArr[1] = zzuvVar;
        zzuo zzuoVar = new zzuo(zzuvVarArr);
        byte[] bArr = zzty.zzd;
        this.zzb = zzuoVar;
    }

    private static boolean zzb(zzuu zzuuVar) {
        if (zzuuVar.zzc() - 1 != 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.zzvj
    public final zzvi zza(Class cls) {
        zzvk.zzp(cls);
        zzuu zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zztp.class.isAssignableFrom(cls)) {
                return zzvb.zzi(zzvk.zzn(), zzth.zzb(), zzb.zza());
            }
            return zzvb.zzi(zzvk.zzm(), zzth.zza(), zzb.zza());
        } else if (zztp.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzva.zzi(cls, zzb, zzvd.zzb(), zzul.zzd(), zzvk.zzn(), zzth.zzb(), zzut.zzb());
            }
            return zzva.zzi(cls, zzb, zzvd.zzb(), zzul.zzd(), zzvk.zzn(), null, zzut.zzb());
        } else if (zzb(zzb)) {
            return zzva.zzi(cls, zzb, zzvd.zza(), zzul.zzc(), zzvk.zzm(), zzth.zza(), zzut.zza());
        } else {
            return zzva.zzi(cls, zzb, zzvd.zza(), zzul.zzc(), zzvk.zzm(), null, zzut.zza());
        }
    }
}
