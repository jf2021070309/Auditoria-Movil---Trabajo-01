package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzwv {
    public long zza;
    public final String zzb;
    public final String zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final List<zzvu> zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.google.android.gms.internal.ads.zzvu>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzwv(java.lang.String r14, com.google.android.gms.internal.ads.zzvl r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.zzb
            long r3 = r15.zzc
            long r5 = r15.zzd
            long r7 = r15.zze
            long r9 = r15.zzf
            java.util.List<com.google.android.gms.internal.ads.zzvu> r0 = r15.zzh
            if (r0 == 0) goto L10
        Le:
            r11 = r0
            goto L44
        L10:
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.zzg
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L23:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Le
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.zzvu r11 = new com.google.android.gms.internal.ads.zzvu
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L23
        L44:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwv.<init>(java.lang.String, com.google.android.gms.internal.ads.zzvl):void");
    }

    private zzwv(String str, String str2, long j2, long j3, long j4, long j5, List<zzvu> list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = j5;
        this.zzh = list;
    }

    public static zzwv zza(zzww zzwwVar) throws IOException {
        if (zzwy.zzi(zzwwVar) == 538247942) {
            String zzm = zzwy.zzm(zzwwVar);
            String zzm2 = zzwy.zzm(zzwwVar);
            long zzk = zzwy.zzk(zzwwVar);
            long zzk2 = zzwy.zzk(zzwwVar);
            long zzk3 = zzwy.zzk(zzwwVar);
            long zzk4 = zzwy.zzk(zzwwVar);
            int zzi = zzwy.zzi(zzwwVar);
            if (zzi >= 0) {
                List emptyList = zzi == 0 ? Collections.emptyList() : new ArrayList();
                for (int i2 = 0; i2 < zzi; i2++) {
                    emptyList.add(new zzvu(zzwy.zzm(zzwwVar).intern(), zzwy.zzm(zzwwVar).intern()));
                }
                return new zzwv(zzm, zzm2, zzk, zzk2, zzk3, zzk4, emptyList);
            }
            throw new IOException(a.R(31, "readHeaderList size=", zzi));
        }
        throw new IOException();
    }
}
