package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public abstract class zzgfc {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    public int zza;
    public final int zzb = zze;
    public zzgfd zzc;

    public /* synthetic */ zzgfc(zzgfa zzgfaVar) {
    }

    public static zzgfc zzF(byte[] bArr, int i2, int i3, boolean z) {
        zzgey zzgeyVar = new zzgey(bArr, i2, i3, z, null);
        try {
            zzgeyVar.zzz(i3);
            return zzgeyVar;
        } catch (zzggm e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int zzG(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long zzH(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public abstract void zzA(int i2);

    public abstract boolean zzB() throws IOException;

    public abstract int zzC();

    public abstract int zza() throws IOException;

    public abstract void zzb(int i2) throws zzggm;

    public abstract boolean zzc(int i2) throws IOException;

    public abstract double zzd() throws IOException;

    public abstract float zze() throws IOException;

    public abstract long zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract long zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract boolean zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract String zzm() throws IOException;

    public abstract zzgex zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract int zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract long zzr() throws IOException;

    public abstract int zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract int zzz(int i2) throws zzggm;
}
