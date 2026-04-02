package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes.dex */
public final class zzny {
    @Pure
    public static void zza(boolean z, String str) throws zzaha {
        if (!z) {
            throw zzaha.zzb(str, null);
        }
    }

    public static int zzb(zznv zznvVar, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i4 < i3) {
            int zzf = zznvVar.zzf(bArr, i2 + i4, i3 - i4);
            if (zzf == -1) {
                break;
            }
            i4 += zzf;
        }
        return i4;
    }

    public static boolean zzc(zznv zznvVar, byte[] bArr, int i2, int i3) throws IOException {
        try {
            ((zznp) zznvVar).zza(bArr, i2, i3, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zzd(zznv zznvVar, int i2) throws IOException {
        try {
            ((zznp) zznvVar).zzd(i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zznv zznvVar, byte[] bArr, int i2, int i3, boolean z) throws IOException {
        try {
            return zznvVar.zzh(bArr, 0, i3, z);
        } catch (EOFException e2) {
            if (z) {
                return false;
            }
            throw e2;
        }
    }
}
