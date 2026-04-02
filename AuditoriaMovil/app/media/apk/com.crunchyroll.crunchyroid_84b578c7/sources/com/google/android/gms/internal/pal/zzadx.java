package com.google.android.gms.internal.pal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzadx implements zzaes {
    private static final zzaed zza = new zzadv();
    private final zzaed zzb;

    public zzadx() {
        zzaed zzaedVar;
        zzaed[] zzaedVarArr = new zzaed[2];
        zzaedVarArr[0] = zzacu.zza();
        try {
            zzaedVar = (zzaed) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzaedVar = zza;
        }
        zzaedVarArr[1] = zzaedVar;
        zzadw zzadwVar = new zzadw(zzaedVarArr);
        zzadg.zzf(zzadwVar, "messageInfoFactory");
        this.zzb = zzadwVar;
    }

    private static boolean zzb(zzaec zzaecVar) {
        if (zzaecVar.zzc() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.pal.zzaes
    public final zzaer zza(Class cls) {
        zzaet.zzG(cls);
        zzaec zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzacz.class.isAssignableFrom(cls)) {
                return zzaej.zzc(zzaet.zzB(), zzacp.zzb(), zzb.zza());
            }
            return zzaej.zzc(zzaet.zzz(), zzacp.zza(), zzb.zza());
        } else if (zzacz.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzaei.zzm(cls, zzb, zzael.zzb(), zzadt.zze(), zzaet.zzB(), zzacp.zzb(), zzaeb.zzb());
            }
            return zzaei.zzm(cls, zzb, zzael.zzb(), zzadt.zze(), zzaet.zzB(), null, zzaeb.zzb());
        } else if (zzb(zzb)) {
            return zzaei.zzm(cls, zzb, zzael.zza(), zzadt.zzd(), zzaet.zzz(), zzacp.zza(), zzaeb.zza());
        } else {
            return zzaei.zzm(cls, zzb, zzael.zza(), zzadt.zzd(), zzaet.zzA(), null, zzaeb.zza());
        }
    }
}
