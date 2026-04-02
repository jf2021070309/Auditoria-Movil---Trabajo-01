package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaxm {
    public static void zza(String[] strArr, int i2, int i3, PriorityQueue<zzaxl> priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzb(i2, zze(strArr, 0, length), zzc(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzb(i2, zze, zzc(strArr, 0, 6), 6, priorityQueue);
        long zzd = zzd(16785407L, 5);
        int i4 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i4 >= length2 - 5) {
                return;
            }
            zze = (((zzaxi.zza(strArr[i4 + 5]) + 2147483647L) % 1073807359) + (((((zze + 1073807359) - ((((zzaxi.zza(strArr[i4 - 1]) + 2147483647L) % 1073807359) * zzd) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzb(i2, zze, zzc(strArr, i4, 6), length2, priorityQueue);
            i4++;
        }
    }

    @VisibleForTesting
    public static void zzb(int i2, long j2, String str, int i3, PriorityQueue<zzaxl> priorityQueue) {
        zzaxl zzaxlVar = new zzaxl(j2, str, i3);
        if ((priorityQueue.size() != i2 || (priorityQueue.peek().zzc <= zzaxlVar.zzc && priorityQueue.peek().zza <= zzaxlVar.zza)) && !priorityQueue.contains(zzaxlVar)) {
            priorityQueue.add(zzaxlVar);
            if (priorityQueue.size() > i2) {
                priorityQueue.poll();
            }
        }
    }

    @VisibleForTesting
    public static String zzc(String[] strArr, int i2, int i3) {
        int i4 = i3 + i2;
        if (strArr.length < i4) {
            zzcgt.zzf("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i4 - 1;
            if (i2 >= i5) {
                sb.append(strArr[i5]);
                return sb.toString();
            }
            sb.append(strArr[i2]);
            sb.append(' ');
            i2++;
        }
    }

    @VisibleForTesting
    public static long zzd(long j2, int i2) {
        return i2 == 1 ? j2 : (i2 & 1) == 0 ? zzd((j2 * j2) % 1073807359, i2 >> 1) % 1073807359 : ((zzd((j2 * j2) % 1073807359, i2 >> 1) % 1073807359) * j2) % 1073807359;
    }

    private static long zze(String[] strArr, int i2, int i3) {
        long zza = (zzaxi.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i4 = 1; i4 < i3; i4++) {
            zza = (((zzaxi.zza(strArr[i4]) + 2147483647L) % 1073807359) + ((zza * 16785407) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
