package com.google.android.gms.internal.cast_tv;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzit implements zzjo {
    private static final zzja zza = new zzir();
    private final zzja zzb;

    public zzit() {
        zzja zzjaVar;
        zzja[] zzjaVarArr = new zzja[2];
        zzjaVarArr[0] = zzhp.zza();
        try {
            zzjaVar = (zzja) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzjaVar = zza;
        }
        zzjaVarArr[1] = zzjaVar;
        zzis zzisVar = new zzis(zzjaVarArr);
        byte[] bArr = zzic.zzd;
        this.zzb = zzisVar;
    }

    private static boolean zzb(zziz zzizVar) {
        if (zzizVar.zzc() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjo
    public final zzjn zza(Class cls) {
        zzjp.zzD(cls);
        zziz zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzht.class.isAssignableFrom(cls)) {
                return zzjg.zzc(zzjp.zzA(), zzhk.zzb(), zzb.zza());
            }
            return zzjg.zzc(zzjp.zzy(), zzhk.zza(), zzb.zza());
        } else if (zzht.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzjf.zzl(cls, zzb, zzji.zzb(), zzip.zzd(), zzjp.zzA(), zzhk.zzb(), zziy.zzb());
            }
            return zzjf.zzl(cls, zzb, zzji.zzb(), zzip.zzd(), zzjp.zzA(), null, zziy.zzb());
        } else if (zzb(zzb)) {
            return zzjf.zzl(cls, zzb, zzji.zza(), zzip.zzc(), zzjp.zzy(), zzhk.zza(), zziy.zza());
        } else {
            return zzjf.zzl(cls, zzb, zzji.zza(), zzip.zzc(), zzjp.zzz(), null, zziy.zza());
        }
    }
}
