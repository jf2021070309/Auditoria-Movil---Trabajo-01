package com.google.android.gms.internal.cast_tv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzhm {
    private static final zzhm zzb = new zzhm(true);
    final zzka zza = new zzjq(16);
    private boolean zzc;
    private boolean zzd;

    private zzhm() {
    }

    public static int zza(zzku zzkuVar, int i, Object obj) {
        int zzd;
        int zzy;
        int zzy2 = zzhc.zzy(i << 3);
        if (zzkuVar == zzku.zzj) {
            zzic.zze((zzjc) obj);
            zzy2 += zzy2;
        }
        zzkv zzkvVar = zzkv.INT;
        int i2 = 4;
        switch (zzkuVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i2 = 8;
                break;
            case 1:
                ((Float) obj).floatValue();
                break;
            case 2:
                i2 = zzhc.zzz(((Long) obj).longValue());
                break;
            case 3:
                i2 = zzhc.zzz(((Long) obj).longValue());
                break;
            case 4:
                i2 = zzhc.zzv(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).longValue();
                i2 = 8;
                break;
            case 6:
                ((Integer) obj).intValue();
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                i2 = 1;
                break;
            case 8:
                if (obj instanceof zzgu) {
                    zzd = ((zzgu) obj).zzd();
                    zzy = zzhc.zzy(zzd);
                    i2 = zzy + zzd;
                    break;
                } else {
                    i2 = zzhc.zzx((String) obj);
                    break;
                }
            case 9:
                i2 = ((zzjc) obj).zzp();
                break;
            case 10:
                if (obj instanceof zzig) {
                    zzd = ((zzig) obj).zza();
                    zzy = zzhc.zzy(zzd);
                } else {
                    zzd = ((zzjc) obj).zzp();
                    zzy = zzhc.zzy(zzd);
                }
                i2 = zzy + zzd;
                break;
            case 11:
                if (obj instanceof zzgu) {
                    zzd = ((zzgu) obj).zzd();
                    zzy = zzhc.zzy(zzd);
                } else {
                    zzd = ((byte[]) obj).length;
                    zzy = zzhc.zzy(zzd);
                }
                i2 = zzy + zzd;
                break;
            case 12:
                i2 = zzhc.zzy(((Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof zzhv) {
                    i2 = zzhc.zzv(((zzhv) obj).zza());
                    break;
                } else {
                    i2 = zzhc.zzv(((Integer) obj).intValue());
                    break;
                }
            case 14:
                ((Integer) obj).intValue();
                break;
            case 15:
                ((Long) obj).longValue();
                i2 = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i2 = zzhc.zzy((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i2 = zzhc.zzz((longValue >> 63) ^ (longValue + longValue));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzy2 + i2;
    }

    public static zzhm zzb() {
        throw null;
    }

    public static void zze(zzhc zzhcVar, zzku zzkuVar, int i, Object obj) throws IOException {
        if (zzkuVar != zzku.zzj) {
            zzhcVar.zzp(i, zzkuVar.zza());
            zzkv zzkvVar = zzkv.INT;
            switch (zzkuVar.ordinal()) {
                case 0:
                    zzhcVar.zzj(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    zzhcVar.zzh(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    zzhcVar.zzt(((Long) obj).longValue());
                    return;
                case 3:
                    zzhcVar.zzt(((Long) obj).longValue());
                    return;
                case 4:
                    zzhcVar.zzl(((Integer) obj).intValue());
                    return;
                case 5:
                    zzhcVar.zzj(((Long) obj).longValue());
                    return;
                case 6:
                    zzhcVar.zzh(((Integer) obj).intValue());
                    return;
                case 7:
                    zzhcVar.zzb(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 8:
                    if (obj instanceof zzgu) {
                        zzhcVar.zzf((zzgu) obj);
                        return;
                    } else {
                        zzhcVar.zzo((String) obj);
                        return;
                    }
                case 9:
                    ((zzjc) obj).zzF(zzhcVar);
                    return;
                case 10:
                    zzjc zzjcVar = (zzjc) obj;
                    ((zzgz) zzhcVar).zzr(zzjcVar.zzp());
                    zzjcVar.zzF(zzhcVar);
                    return;
                case 11:
                    if (obj instanceof zzgu) {
                        zzhcVar.zzf((zzgu) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    zzgz zzgzVar = (zzgz) zzhcVar;
                    zzgzVar.zzr(length);
                    zzgzVar.zzc(bArr, 0, length);
                    return;
                case 12:
                    zzhcVar.zzr(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof zzhv) {
                        zzhcVar.zzl(((zzhv) obj).zza());
                        return;
                    } else {
                        zzhcVar.zzl(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    zzhcVar.zzh(((Integer) obj).intValue());
                    return;
                case 15:
                    zzhcVar.zzj(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    zzhcVar.zzr((intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    zzhcVar.zzt((longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        }
        zzjc zzjcVar2 = (zzjc) obj;
        zzic.zze(zzjcVar2);
        zzhcVar.zzp(i, 3);
        zzjcVar2.zzF(zzhcVar);
        zzhcVar.zzp(i, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzf(com.google.android.gms.internal.cast_tv.zzhl r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.cast_tv.zzku r0 = r2.zzb()
            byte[] r1 = com.google.android.gms.internal.cast_tv.zzic.zzd
            r3.getClass()
            com.google.android.gms.internal.cast_tv.zzku r1 = com.google.android.gms.internal.cast_tv.zzku.zza
            com.google.android.gms.internal.cast_tv.zzkv r1 = com.google.android.gms.internal.cast_tv.zzkv.INT
            com.google.android.gms.internal.cast_tv.zzkv r0 = r0.zzb()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r3 instanceof com.google.android.gms.internal.cast_tv.zzjc
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.cast_tv.zzig
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.cast_tv.zzhv
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.cast_tv.zzgu
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L48
            goto L47
        L34:
            boolean r0 = r3 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r3 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r3 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r3 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r3 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
        L47:
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.cast_tv.zzku r2 = r2.zzb()
            com.google.android.gms.internal.cast_tv.zzkv r2 = r2.zzb()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast_tv.zzhm.zzf(com.google.android.gms.internal.cast_tv.zzhl, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzhm zzhmVar = new zzhm();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzhmVar.zzd((zzhl) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzhmVar.zzd((zzhl) entry.getKey(), entry.getValue());
        }
        zzhmVar.zzd = this.zzd;
        return zzhmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhm)) {
            return false;
        }
        return this.zza.equals(((zzhm) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzc() {
        if (!this.zzc) {
            for (int i = 0; i < this.zza.zzb(); i++) {
                Map.Entry zzg = this.zza.zzg(i);
                if (zzg.getValue() instanceof zzht) {
                    ((zzht) zzg.getValue()).zzy();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzd(zzhl zzhlVar, Object obj) {
        if (zzhlVar.zzc()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    zzf(zzhlVar, arrayList.get(i));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzf(zzhlVar, obj);
        }
        if (obj instanceof zzig) {
            this.zzd = true;
        }
        this.zza.put(zzhlVar, obj);
    }

    private zzhm(boolean z) {
        zzc();
        zzc();
    }
}
