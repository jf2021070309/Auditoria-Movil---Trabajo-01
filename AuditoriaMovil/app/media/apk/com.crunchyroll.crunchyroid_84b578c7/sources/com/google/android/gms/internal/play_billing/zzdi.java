package com.google.android.gms.internal.play_billing;

import com.amazon.aps.iva.n4.a;
import com.google.ads.AdSize;
import com.google.android.gms.common.ConnectionResult;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public final class zzdi<T> implements zzdp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzeq.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzdf zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzct zzl;
    private final zzeg zzm;
    private final zzbo zzn;
    private final int zzo;
    private final zzdk zzp;
    private final zzda zzq;

    private zzdi(int[] iArr, Object[] objArr, int i, int i2, zzdf zzdfVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzdk zzdkVar, zzct zzctVar, zzeg zzegVar, zzbo zzboVar, zzda zzdaVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzo = i3;
        boolean z2 = false;
        if (zzboVar != null && zzboVar.zzc(zzdfVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i4;
        this.zzk = i5;
        this.zzp = zzdkVar;
        this.zzl = zzctVar;
        this.zzm = zzegVar;
        this.zzn = zzboVar;
        this.zzg = zzdfVar;
        this.zzq = zzdaVar;
    }

    private final zzce zzA(int i) {
        int i2 = i / 3;
        return (zzce) this.zzd[i2 + i2 + 1];
    }

    private final zzdp zzB(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzdp zzdpVar = (zzdp) this.zzd[i3];
        if (zzdpVar != null) {
            return zzdpVar;
        }
        zzdp zzb2 = zzdn.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzD(Object obj, int i) {
        zzdp zzB = zzB(i);
        int zzy = zzy(i) & 1048575;
        if (!zzP(obj, i)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzE(Object obj, int i, int i2) {
        zzdp zzB = zzB(i2);
        if (!zzT(obj, i, i2)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy(i2) & 1048575);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder b = a.b("Field ", str, " for ", name, " not found. Known fields are ");
            b.append(arrays);
            throw new RuntimeException(b.toString());
        }
    }

    private static void zzG(Object obj) {
        if (zzS(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzH(Object obj, Object obj2, int i) {
        if (!zzP(obj2, i)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzy = zzy(i) & 1048575;
        Object object = unsafe.getObject(obj2, zzy);
        if (object != null) {
            zzdp zzB = zzB(i);
            if (!zzP(obj, i)) {
                if (!zzS(object)) {
                    unsafe.putObject(obj, zzy, object);
                } else {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, zzy, zze);
                }
                zzJ(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzy);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, zzy, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (!zzT(obj2, i2, i)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzy = zzy(i) & 1048575;
        Object object = unsafe.getObject(obj2, zzy);
        if (object != null) {
            zzdp zzB = zzB(i);
            if (!zzT(obj, i2, i)) {
                if (!zzS(object)) {
                    unsafe.putObject(obj, zzy, object);
                } else {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, zzy, zze);
                }
                zzK(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzy);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, zzy, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
    }

    private final void zzJ(Object obj, int i) {
        int zzv = zzv(i);
        long j = 1048575 & zzv;
        if (j == 1048575) {
            return;
        }
        zzeq.zzq(obj, j, (1 << (zzv >>> 20)) | zzeq.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zzeq.zzq(obj, zzv(i2) & 1048575, i);
    }

    private final void zzL(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzy(i) & 1048575, obj2);
        zzJ(obj, i);
    }

    private final void zzM(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzy(i2) & 1048575, obj2);
        zzK(obj, i, i2);
    }

    private final void zzN(zzey zzeyVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzcy zzcyVar = (zzcy) zzC(i2);
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i) {
        if (zzP(obj, i) == zzP(obj2, i)) {
            return true;
        }
        return false;
    }

    private final boolean zzP(Object obj, int i) {
        int zzv = zzv(i);
        long j = zzv & 1048575;
        if (j == 1048575) {
            int zzy = zzy(i);
            long j2 = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzeq.zza(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzeq.zzb(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzeq.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzeq.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzeq.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzeq.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzeq.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzeq.zzw(obj, j2);
                case 8:
                    Object zzf = zzeq.zzf(obj, j2);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzba) {
                        if (zzba.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzeq.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzba.zzb.equals(zzeq.zzf(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzeq.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzeq.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzeq.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzeq.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzeq.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzeq.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzeq.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzeq.zzc(obj, j) & (1 << (zzv >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzQ(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzP(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzR(Object obj, int i, zzdp zzdpVar) {
        return zzdpVar.zzk(zzeq.zzf(obj, i & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcb) {
            return ((zzcb) obj).zzt();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i, int i2) {
        if (zzeq.zzc(obj, zzv(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean zzU(Object obj, long j) {
        return ((Boolean) zzeq.zzf(obj, j)).booleanValue();
    }

    private static final void zzV(int i, Object obj, zzey zzeyVar) throws IOException {
        if (obj instanceof String) {
            zzeyVar.zzF(i, (String) obj);
        } else {
            zzeyVar.zzd(i, (zzba) obj);
        }
    }

    public static zzeh zzd(Object obj) {
        zzcb zzcbVar = (zzcb) obj;
        zzeh zzehVar = zzcbVar.zzc;
        if (zzehVar == zzeh.zzc()) {
            zzeh zzf = zzeh.zzf();
            zzcbVar.zzc = zzf;
            return zzf;
        }
        return zzehVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.play_billing.zzdi zzl(java.lang.Class r27, com.google.android.gms.internal.play_billing.zzdc r28, com.google.android.gms.internal.play_billing.zzdk r29, com.google.android.gms.internal.play_billing.zzct r30, com.google.android.gms.internal.play_billing.zzeg r31, com.google.android.gms.internal.play_billing.zzbo r32, com.google.android.gms.internal.play_billing.zzda r33) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzdc, com.google.android.gms.internal.play_billing.zzdk, com.google.android.gms.internal.play_billing.zzct, com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzbo, com.google.android.gms.internal.play_billing.zzda):com.google.android.gms.internal.play_billing.zzdi");
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzeq.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzeq.zzf(obj, j)).floatValue();
    }

    private final int zzo(Object obj) {
        int i;
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int i2;
        int i3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzn;
        int zzx7;
        int zzx8;
        int zzh;
        int zzx9;
        int zzx10;
        int i4;
        int zzy2;
        int zzx11;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i8 < this.zzc.length) {
            int zzy3 = zzy(i8);
            int[] iArr = this.zzc;
            int i10 = iArr[i8];
            int zzx12 = zzx(zzy3);
            if (zzx12 <= 17) {
                int i11 = iArr[i8 + 2];
                int i12 = i11 & i5;
                int i13 = i11 >>> 20;
                if (i12 != i9) {
                    i6 = unsafe.getInt(obj, i12);
                    i9 = i12;
                }
                i = 1 << i13;
            } else {
                i = 0;
            }
            long j = i5 & zzy3;
            switch (zzx12) {
                case 0:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 1:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 2:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzy = zzbi.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzbi.zzx(i10 << 3);
                        int i14 = zzy;
                        i2 = zzx3;
                        i3 = i14;
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 3:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzy = zzbi.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzbi.zzx(i10 << 3);
                        int i142 = zzy;
                        i2 = zzx3;
                        i3 = i142;
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 4:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i3 = zzbi.zzu(unsafe.getInt(obj, j));
                        i2 = zzbi.zzx(i10 << 3);
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 5:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 6:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 7:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx4 = zzbi.zzx(i10 << 3);
                        zzn = zzx4 + 1;
                        i7 += zzn;
                        break;
                    }
                case 8:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzba) {
                            int i15 = zzbi.zzb;
                            int zzd = ((zzba) object).zzd();
                            zzx5 = zzd + zzbi.zzx(zzd);
                            zzx6 = zzbi.zzx(i10 << 3);
                            zzn = zzx5 + zzx6;
                            i7 += zzn;
                            break;
                        } else {
                            i3 = zzbi.zzw((String) object);
                            i2 = zzbi.zzx(i10 << 3);
                            i7 = i2 + i3 + i7;
                            break;
                        }
                    }
                case 9:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzn = zzdr.zzn(i10, unsafe.getObject(obj, j), zzB(i8));
                        i7 += zzn;
                        break;
                    }
                case 10:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i16 = zzbi.zzb;
                        int zzd2 = ((zzba) unsafe.getObject(obj, j)).zzd();
                        zzx5 = zzd2 + zzbi.zzx(zzd2);
                        zzx6 = zzbi.zzx(i10 << 3);
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 11:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i3 = zzbi.zzx(unsafe.getInt(obj, j));
                        i2 = zzbi.zzx(i10 << 3);
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 12:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i3 = zzbi.zzu(unsafe.getInt(obj, j));
                        i2 = zzbi.zzx(i10 << 3);
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 13:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 14:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 15:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i17 = unsafe.getInt(obj, j);
                        zzx7 = zzbi.zzx(i10 << 3);
                        zzx8 = zzbi.zzx((i17 >> 31) ^ (i17 + i17));
                        zzn = zzx8 + zzx7;
                        i7 += zzn;
                        break;
                    }
                case 16:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzx5 = zzbi.zzx(i10 << 3);
                        zzx6 = zzbi.zzy((j2 >> 63) ^ (j2 + j2));
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 17:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzn = zzbi.zzt(i10, (zzdf) unsafe.getObject(obj, j), zzB(i8));
                        i7 += zzn;
                        break;
                    }
                case 18:
                    zzn = zzdr.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 19:
                    zzn = zzdr.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 20:
                    zzn = zzdr.zzl(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 21:
                    zzn = zzdr.zzw(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 22:
                    zzn = zzdr.zzj(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzn = zzdr.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 24:
                    zzn = zzdr.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 25:
                    zzn = zzdr.zza(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 26:
                    zzn = zzdr.zzt(i10, (List) unsafe.getObject(obj, j));
                    i7 += zzn;
                    break;
                case 27:
                    zzn = zzdr.zzo(i10, (List) unsafe.getObject(obj, j), zzB(i8));
                    i7 += zzn;
                    break;
                case 28:
                    zzn = zzdr.zzb(i10, (List) unsafe.getObject(obj, j));
                    i7 += zzn;
                    break;
                case 29:
                    zzn = zzdr.zzu(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 30:
                    zzn = zzdr.zzc(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 31:
                    zzn = zzdr.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 32:
                    zzn = zzdr.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    zzn = zzdr.zzp(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 34:
                    zzn = zzdr.zzr(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 35:
                    zzh = zzdr.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 36:
                    zzh = zzdr.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 37:
                    zzh = zzdr.zzm((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 38:
                    zzh = zzdr.zzx((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 39:
                    zzh = zzdr.zzk((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 40:
                    zzh = zzdr.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 41:
                    zzh = zzdr.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 42:
                    int i18 = zzdr.zza;
                    zzh = ((List) unsafe.getObject(obj, j)).size();
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 43:
                    zzh = zzdr.zzv((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 44:
                    zzh = zzdr.zzd((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 45:
                    zzh = zzdr.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 46:
                    zzh = zzdr.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 47:
                    zzh = zzdr.zzq((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 48:
                    zzh = zzdr.zzs((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 49:
                    zzn = zzdr.zzi(i10, (List) unsafe.getObject(obj, j), zzB(i8));
                    i7 += zzn;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    zzda.zza(i10, unsafe.getObject(obj, j), zzC(i8));
                    break;
                case 51:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 52:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 53:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzy2 = zzbi.zzy(zzz(obj, j));
                        zzx11 = zzbi.zzx(i10 << 3);
                        int i19 = zzy2;
                        i4 = zzx11;
                        zzh = i19;
                        i7 += i4 + zzh;
                        break;
                    }
                case 54:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzy2 = zzbi.zzy(zzz(obj, j));
                        zzx11 = zzbi.zzx(i10 << 3);
                        int i192 = zzy2;
                        i4 = zzx11;
                        zzh = i192;
                        i7 += i4 + zzh;
                        break;
                    }
                case 55:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzh = zzbi.zzu(zzp(obj, j));
                        i4 = zzbi.zzx(i10 << 3);
                        i7 += i4 + zzh;
                        break;
                    }
                case 56:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 57:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 58:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzx4 = zzbi.zzx(i10 << 3);
                        zzn = zzx4 + 1;
                        i7 += zzn;
                        break;
                    }
                case 59:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzba) {
                            int i20 = zzbi.zzb;
                            int zzd3 = ((zzba) object2).zzd();
                            zzx5 = zzd3 + zzbi.zzx(zzd3);
                            zzx6 = zzbi.zzx(i10 << 3);
                            zzn = zzx5 + zzx6;
                            i7 += zzn;
                            break;
                        } else {
                            zzh = zzbi.zzw((String) object2);
                            i4 = zzbi.zzx(i10 << 3);
                            i7 += i4 + zzh;
                            break;
                        }
                    }
                case 60:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzn = zzdr.zzn(i10, unsafe.getObject(obj, j), zzB(i8));
                        i7 += zzn;
                        break;
                    }
                case 61:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        int i21 = zzbi.zzb;
                        int zzd4 = ((zzba) unsafe.getObject(obj, j)).zzd();
                        zzx5 = zzd4 + zzbi.zzx(zzd4);
                        zzx6 = zzbi.zzx(i10 << 3);
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 62:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzh = zzbi.zzx(zzp(obj, j));
                        i4 = zzbi.zzx(i10 << 3);
                        i7 += i4 + zzh;
                        break;
                    }
                case 63:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzh = zzbi.zzu(zzp(obj, j));
                        i4 = zzbi.zzx(i10 << 3);
                        i7 += i4 + zzh;
                        break;
                    }
                case 64:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 65:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 66:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        int zzp = zzp(obj, j);
                        zzx7 = zzbi.zzx(i10 << 3);
                        zzx8 = zzbi.zzx((zzp >> 31) ^ (zzp + zzp));
                        zzn = zzx8 + zzx7;
                        i7 += zzn;
                        break;
                    }
                case 67:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        long zzz = zzz(obj, j);
                        zzx5 = zzbi.zzx(i10 << 3);
                        zzx6 = zzbi.zzy((zzz >> 63) ^ (zzz + zzz));
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 68:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzn = zzbi.zzt(i10, (zzdf) unsafe.getObject(obj, j), zzB(i8));
                        i7 += zzn;
                        break;
                    }
            }
            i8 += 3;
            i5 = 1048575;
        }
        zzeg zzegVar = this.zzm;
        int zza2 = i7 + zzegVar.zza(zzegVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzn.zza(obj);
        throw null;
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzeq.zzf(obj, j)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzan zzanVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzcz) object).zze()) {
            zzcz zzb2 = zzcz.zza().zzb();
            zzda.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzcy zzcyVar = (zzcy) zzC;
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzan zzanVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzao.zzp(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzao.zzb(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzao.zzm(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzanVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzao.zzj(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzanVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzao.zzp(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzao.zzb(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzao.zzm(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzanVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzao.zzj(bArr, i, zzanVar);
                    int i13 = zzanVar.zza;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzev.zze(bArr, zzj2, zzj2 + i13)) {
                        throw zzci.zzc();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i13, zzcg.zzb));
                        zzj2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object zzE = zzE(obj, i4, i8);
                    int zzo = zzao.zzo(zzE, zzB(i8), bArr, i, i2, zzanVar);
                    zzM(obj, i4, i8, zzE);
                    return zzo;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzao.zza(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, zzanVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzao.zzj(bArr, i, zzanVar);
                    int i14 = zzanVar.zza;
                    zzce zzA = zzA(i8);
                    if (zzA != null && !zzA.zza(i14)) {
                        zzd(obj).zzj(i3, Long.valueOf(i14));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zzj4 = zzao.zzj(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzbe.zzb(zzanVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzao.zzm(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzbe.zzc(zzanVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object zzE2 = zzE(obj, i4, i8);
                    int zzn = zzao.zzn(zzE2, zzB(i8), bArr, i, i2, (i3 & (-8)) | 4, zzanVar);
                    zzM(obj, i4, i8, zzE2);
                    return zzn;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0216 -> B:114:0x0217). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x0264 -> B:134:0x0265). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x019b -> B:82:0x019c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzs(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.play_billing.zzan r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzs(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.play_billing.zzan):int");
    }

    private final int zzt(int i) {
        if (i >= this.zze && i <= this.zzf) {
            return zzw(i, 0);
        }
        return -1;
    }

    private final int zzu(int i, int i2) {
        if (i >= this.zze && i <= this.zzf) {
            return zzw(i, i2);
        }
        return -1;
    }

    private final int zzv(int i) {
        return this.zzc[i + 2];
    }

    private final int zzw(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzx(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzy(int i) {
        return this.zzc[i + 1];
    }

    private static long zzz(Object obj, long j) {
        return ((Long) zzeq.zzf(obj, j)).longValue();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final int zza(Object obj) {
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzn;
        int zzx7;
        int zzx8;
        int zzx9;
        int zzx10;
        zzew zzewVar = zzew.zza;
        if (this.zzo - 1 != 0) {
            Unsafe unsafe = zzb;
            int i = 0;
            for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
                int zzy2 = zzy(i2);
                int zzx11 = zzx(zzy2);
                int i3 = this.zzc[i2];
                int i4 = zzy2 & 1048575;
                if (zzx11 >= zzbt.zzJ.zza() && zzx11 <= zzbt.zzW.zza()) {
                    int i5 = this.zzc[i2 + 2];
                }
                long j = i4;
                switch (zzx11) {
                    case 0:
                        if (zzP(obj, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i2)) {
                            zzy = zzbi.zzy(zzeq.zzd(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i2)) {
                            zzy = zzbi.zzy(zzeq.zzd(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i2)) {
                            zzy = zzbi.zzu(zzeq.zzc(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i2)) {
                            zzx4 = zzbi.zzx(i3 << 3);
                            zzn = zzx4 + 1;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzP(obj, i2)) {
                            Object zzf = zzeq.zzf(obj, j);
                            if (zzf instanceof zzba) {
                                int i6 = i3 << 3;
                                int i7 = zzbi.zzb;
                                int zzd = ((zzba) zzf).zzd();
                                zzx5 = zzbi.zzx(zzd) + zzd;
                                zzx6 = zzbi.zzx(i6);
                                zzn = zzx6 + zzx5;
                                i += zzn;
                                break;
                            } else {
                                zzy = zzbi.zzw((String) zzf);
                                zzx3 = zzbi.zzx(i3 << 3);
                                i += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (zzP(obj, i2)) {
                            zzn = zzdr.zzn(i3, zzeq.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzP(obj, i2)) {
                            int i8 = i3 << 3;
                            int i9 = zzbi.zzb;
                            int zzd2 = ((zzba) zzeq.zzf(obj, j)).zzd();
                            zzx5 = zzbi.zzx(zzd2) + zzd2;
                            zzx6 = zzbi.zzx(i8);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzP(obj, i2)) {
                            zzy = zzbi.zzx(zzeq.zzc(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i2)) {
                            zzy = zzbi.zzu(zzeq.zzc(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i2)) {
                            int zzc = zzeq.zzc(obj, j);
                            zzx7 = zzbi.zzx(i3 << 3);
                            zzx8 = zzbi.zzx((zzc >> 31) ^ (zzc + zzc));
                            zzn = zzx8 + zzx7;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i2)) {
                            long zzd3 = zzeq.zzd(obj, j);
                            zzy = zzbi.zzx(i3 << 3);
                            zzx3 = zzbi.zzy((zzd3 + zzd3) ^ (zzd3 >> 63));
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzP(obj, i2)) {
                            zzn = zzbi.zzt(i3, (zzdf) zzeq.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzn = zzdr.zzg(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 19:
                        zzn = zzdr.zze(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 20:
                        zzn = zzdr.zzl(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 21:
                        zzn = zzdr.zzw(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 22:
                        zzn = zzdr.zzj(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        zzn = zzdr.zzg(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 24:
                        zzn = zzdr.zze(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 25:
                        zzn = zzdr.zza(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 26:
                        zzn = zzdr.zzt(i3, (List) zzeq.zzf(obj, j));
                        i += zzn;
                        break;
                    case 27:
                        zzn = zzdr.zzo(i3, (List) zzeq.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    case 28:
                        zzn = zzdr.zzb(i3, (List) zzeq.zzf(obj, j));
                        i += zzn;
                        break;
                    case 29:
                        zzn = zzdr.zzu(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 30:
                        zzn = zzdr.zzc(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 31:
                        zzn = zzdr.zze(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 32:
                        zzn = zzdr.zzg(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        zzn = zzdr.zzp(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 34:
                        zzn = zzdr.zzr(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 35:
                        zzy = zzdr.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i10 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i10);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        zzy = zzdr.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i11 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i11);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        zzy = zzdr.zzm((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i12 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i12);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        zzy = zzdr.zzx((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i13 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i13);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        zzy = zzdr.zzk((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i14 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i14);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        zzy = zzdr.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i15 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i15);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        zzy = zzdr.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i16 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i16);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        int i17 = zzdr.zza;
                        zzy = ((List) unsafe.getObject(obj, j)).size();
                        if (zzy > 0) {
                            int i18 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i18);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        zzy = zzdr.zzv((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i19 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i19);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        zzy = zzdr.zzd((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i20 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i20);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        zzy = zzdr.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i21 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i21);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        zzy = zzdr.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i22 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i22);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        zzy = zzdr.zzq((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i23 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i23);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        zzy = zzdr.zzs((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i24 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i24);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        zzn = zzdr.zzi(i3, (List) zzeq.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        zzda.zza(i3, zzeq.zzf(obj, j), zzC(i2));
                        break;
                    case 51:
                        if (zzT(obj, i3, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i3, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzbi.zzy(zzz(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzbi.zzy(zzz(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzbi.zzu(zzp(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i3, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i3, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i3, i2)) {
                            zzx4 = zzbi.zzx(i3 << 3);
                            zzn = zzx4 + 1;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i3, i2)) {
                            Object zzf2 = zzeq.zzf(obj, j);
                            if (zzf2 instanceof zzba) {
                                int i25 = i3 << 3;
                                int i26 = zzbi.zzb;
                                int zzd4 = ((zzba) zzf2).zzd();
                                zzx5 = zzbi.zzx(zzd4) + zzd4;
                                zzx6 = zzbi.zzx(i25);
                                zzn = zzx6 + zzx5;
                                i += zzn;
                                break;
                            } else {
                                zzy = zzbi.zzw((String) zzf2);
                                zzx3 = zzbi.zzx(i3 << 3);
                                i += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (zzT(obj, i3, i2)) {
                            zzn = zzdr.zzn(i3, zzeq.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzT(obj, i3, i2)) {
                            int i27 = i3 << 3;
                            int i28 = zzbi.zzb;
                            int zzd5 = ((zzba) zzeq.zzf(obj, j)).zzd();
                            zzx5 = zzbi.zzx(zzd5) + zzd5;
                            zzx6 = zzbi.zzx(i27);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzbi.zzx(zzp(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzbi.zzu(zzp(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i3, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i3, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i3, i2)) {
                            int zzp = zzp(obj, j);
                            zzx7 = zzbi.zzx(i3 << 3);
                            zzx8 = zzbi.zzx((zzp >> 31) ^ (zzp + zzp));
                            zzn = zzx8 + zzx7;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i3, i2)) {
                            long zzz = zzz(obj, j);
                            zzy = zzbi.zzx(i3 << 3);
                            zzx3 = zzbi.zzy((zzz + zzz) ^ (zzz >> 63));
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i3, i2)) {
                            zzn = zzbi.zzt(i3, (zzdf) zzeq.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzeg zzegVar = this.zzm;
            return i + zzegVar.zza(zzegVar.zzd(obj));
        }
        return zzo(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int zzc;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzy = zzy(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & zzy;
            int i6 = 37;
            switch (zzx(zzy)) {
                case 0:
                    i = i3 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzeq.zza(obj, j));
                    byte[] bArr = zzcg.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 1:
                    i2 = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(zzeq.zzb(obj, j));
                    i3 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j);
                    byte[] bArr2 = zzcg.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j);
                    byte[] bArr3 = zzcg.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 4:
                    i = i3 * 53;
                    zzc = zzeq.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j);
                    byte[] bArr4 = zzcg.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 6:
                    i = i3 * 53;
                    zzc = zzeq.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 7:
                    i2 = i3 * 53;
                    floatToIntBits = zzcg.zza(zzeq.zzw(obj, j));
                    i3 = floatToIntBits + i2;
                    break;
                case 8:
                    i2 = i3 * 53;
                    floatToIntBits = ((String) zzeq.zzf(obj, j)).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case 9:
                    Object zzf = zzeq.zzf(obj, j);
                    if (zzf != null) {
                        i6 = zzf.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    floatToIntBits = zzeq.zzf(obj, j).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case 11:
                    i = i3 * 53;
                    zzc = zzeq.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 12:
                    i = i3 * 53;
                    zzc = zzeq.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 13:
                    i = i3 * 53;
                    zzc = zzeq.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j);
                    byte[] bArr5 = zzcg.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 15:
                    i = i3 * 53;
                    zzc = zzeq.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j);
                    byte[] bArr6 = zzcg.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 17:
                    Object zzf2 = zzeq.zzf(obj, j);
                    if (zzf2 != null) {
                        i6 = zzf2.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i3 * 53;
                    floatToIntBits = zzeq.zzf(obj, j).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    i2 = i3 * 53;
                    floatToIntBits = zzeq.zzf(obj, j).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case 51:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzcg.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr8 = zzcg.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr9 = zzcg.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzp(obj, j);
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr10 = zzcg.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzp(obj, j);
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzcg.zza(zzU(obj, j));
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = ((String) zzeq.zzf(obj, j)).hashCode();
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzeq.zzf(obj, j).hashCode();
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzeq.zzf(obj, j).hashCode();
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzp(obj, j);
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzp(obj, j);
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzp(obj, j);
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr11 = zzcg.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzp(obj, j);
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr12 = zzcg.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzeq.zzf(obj, j).hashCode();
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzm.zzd(obj).hashCode() + (i3 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzn.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x030e, code lost:
        if (r0 != r22) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0310, code lost:
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r1 = r31;
        r13 = r32;
        r11 = r33;
        r9 = r34;
        r8 = r19;
        r5 = r20;
        r3 = r21;
        r2 = r22;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x032c, code lost:
        r2 = r0;
        r7 = r21;
        r6 = r24;
        r0 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0360, code lost:
        if (r0 != r15) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0388, code lost:
        if (r0 != r15) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0403, code lost:
        if (r6 == 1048575) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0405, code lost:
        r27.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x040b, code lost:
        r2 = r8.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x040f, code lost:
        if (r2 >= r8.zzk) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0411, code lost:
        r4 = r8.zzi[r2];
        r5 = r8.zzc[r4];
        r5 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r8.zzy(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0423, code lost:
        if (r5 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x042a, code lost:
        if (r8.zzA(r4) != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x042c, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x042f, code lost:
        r5 = (com.google.android.gms.internal.play_billing.zzcz) r5;
        r0 = (com.google.android.gms.internal.play_billing.zzcy) r8.zzC(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0437, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0438, code lost:
        if (r9 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x043c, code lost:
        if (r0 != r32) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0443, code lost:
        throw com.google.android.gms.internal.play_billing.zzci.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0446, code lost:
        if (r0 > r32) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0448, code lost:
        if (r3 != r9) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x044a, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x044f, code lost:
        throw com.google.android.gms.internal.play_billing.zzci.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.play_billing.zzan r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzan):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final Object zze() {
        return ((zzcb) this.zzg).zzi();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzf(Object obj) {
        if (!zzS(obj)) {
            return;
        }
        if (obj instanceof zzcb) {
            zzcb zzcbVar = (zzcb) obj;
            zzcbVar.zzq(Integer.MAX_VALUE);
            zzcbVar.zza = 0;
            zzcbVar.zzo();
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzy = zzy(i);
            int i2 = 1048575 & zzy;
            int zzx = zzx(zzy);
            long j = i2;
            if (zzx != 9) {
                if (zzx != 60 && zzx != 68) {
                    switch (zzx) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case ConnectionResult.API_DISABLED /* 23 */:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.zzl.zza(obj, j);
                            break;
                        case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzcz) object).zzc();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (zzT(obj, this.zzc[i], i)) {
                    zzB(i).zzf(zzb.getObject(obj, j));
                }
            }
            if (zzP(obj, i)) {
                zzB(i).zzf(zzb.getObject(obj, j));
            }
        }
        this.zzm.zzg(obj);
        if (this.zzh) {
            this.zzn.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzy = zzy(i);
            int i2 = this.zzc[i];
            long j = 1048575 & zzy;
            switch (zzx(zzy)) {
                case 0:
                    if (zzP(obj2, i)) {
                        zzeq.zzo(obj, j, zzeq.zza(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i)) {
                        zzeq.zzp(obj, j, zzeq.zzb(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj2, i)) {
                        zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj2, i)) {
                        zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj2, i)) {
                        zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj2, i)) {
                        zzeq.zzm(obj, j, zzeq.zzw(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj2, i)) {
                        zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzP(obj2, i)) {
                        zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj2, i)) {
                        zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj2, i)) {
                        zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    int i3 = zzdr.zza;
                    zzeq.zzs(obj, j, zzda.zzb(zzeq.zzf(obj, j), zzeq.zzf(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzT(obj2, i2, i)) {
                        zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i2, i)) {
                        zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzdr.zzB(this.zzm, obj, obj2);
        if (!this.zzh) {
            return;
        }
        this.zzn.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02d9, code lost:
        if (r0 != r15) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02fd, code lost:
        if (r0 != r15) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0294, code lost:
        if (r0 != r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0296, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r9 = r18;
        r1 = r19;
        r2 = r22;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02ac, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.play_billing.zzan r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.play_billing.zzan):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzi(Object obj, zzey zzeyVar) throws IOException {
        int i;
        int i2;
        int i3;
        zzew zzewVar = zzew.zza;
        int i4 = 0;
        int i5 = 1048575;
        if (this.zzo - 1 != 0) {
            if (!this.zzh) {
                int length = this.zzc.length;
                for (int i6 = 0; i6 < length; i6 += 3) {
                    int zzy = zzy(i6);
                    int i7 = this.zzc[i6];
                    switch (zzx(zzy)) {
                        case 0:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzf(i7, zzeq.zza(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzo(i7, zzeq.zzb(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzt(i7, zzeq.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzJ(i7, zzeq.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzr(i7, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzm(i7, zzeq.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzk(i7, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzb(i7, zzeq.zzw(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzP(obj, i6)) {
                                zzV(i7, zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzv(i7, zzeq.zzf(obj, zzy & 1048575), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzd(i7, (zzba) zzeq.zzf(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzH(i7, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzi(i7, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzw(i7, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzy(i7, zzeq.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzA(i7, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzC(i7, zzeq.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzP(obj, i6)) {
                                zzeyVar.zzq(i7, zzeq.zzf(obj, zzy & 1048575), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzdr.zzF(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 19:
                            zzdr.zzJ(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 20:
                            zzdr.zzM(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 21:
                            zzdr.zzU(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 22:
                            zzdr.zzL(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            zzdr.zzI(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 24:
                            zzdr.zzH(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 25:
                            zzdr.zzD(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 26:
                            zzdr.zzS(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                            break;
                        case 27:
                            zzdr.zzN(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, zzB(i6));
                            break;
                        case 28:
                            zzdr.zzE(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                            break;
                        case 29:
                            zzdr.zzT(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 30:
                            zzdr.zzG(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 31:
                            zzdr.zzO(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 32:
                            zzdr.zzP(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                            zzdr.zzQ(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 34:
                            zzdr.zzR(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 35:
                            zzdr.zzF(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 36:
                            zzdr.zzJ(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 37:
                            zzdr.zzM(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 38:
                            zzdr.zzU(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 39:
                            zzdr.zzL(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 40:
                            zzdr.zzI(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 41:
                            zzdr.zzH(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 42:
                            zzdr.zzD(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 43:
                            zzdr.zzT(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 44:
                            zzdr.zzG(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 45:
                            zzdr.zzO(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 46:
                            zzdr.zzP(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 47:
                            zzdr.zzQ(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 48:
                            zzdr.zzR(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 49:
                            zzdr.zzK(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, zzB(i6));
                            break;
                        case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                            zzN(zzeyVar, i7, zzeq.zzf(obj, zzy & 1048575), i6);
                            break;
                        case 51:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzf(i7, zzm(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzo(i7, zzn(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzt(i7, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzJ(i7, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzr(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzm(i7, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzk(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzb(i7, zzU(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzT(obj, i7, i6)) {
                                zzV(i7, zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzv(i7, zzeq.zzf(obj, zzy & 1048575), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzd(i7, (zzba) zzeq.zzf(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzH(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzi(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzw(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzy(i7, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzA(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzC(i7, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzT(obj, i7, i6)) {
                                zzeyVar.zzq(i7, zzeq.zzf(obj, zzy & 1048575), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zzeg zzegVar = this.zzm;
                zzegVar.zzi(zzegVar.zzd(obj), zzeyVar);
                return;
            }
            this.zzn.zza(obj);
            throw null;
        } else if (!this.zzh) {
            int length2 = this.zzc.length;
            Unsafe unsafe = zzb;
            int i8 = 0;
            int i9 = 0;
            int i10 = 1048575;
            while (i8 < length2) {
                int zzy2 = zzy(i8);
                int[] iArr = this.zzc;
                int i11 = iArr[i8];
                int zzx = zzx(zzy2);
                if (zzx <= 17) {
                    int i12 = iArr[i8 + 2];
                    int i13 = i12 & i5;
                    if (i13 != i10) {
                        i9 = unsafe.getInt(obj, i13);
                        i10 = i13;
                    }
                    i = 1 << (i12 >>> 20);
                } else {
                    i = i4;
                }
                long j = zzy2 & i5;
                switch (zzx) {
                    case 0:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzf(i11, zzeq.zza(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzo(i11, zzeq.zzb(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzt(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzJ(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzr(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzm(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzk(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzb(i11, zzeq.zzw(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzV(i11, unsafe.getObject(obj, j), zzeyVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzv(i11, unsafe.getObject(obj, j), zzB(i8));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzd(i11, (zzba) unsafe.getObject(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzH(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzi(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzw(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzy(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzA(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzC(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzq(i11, unsafe.getObject(obj, j), zzB(i8));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i2 = 0;
                        zzdr.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 19:
                        i2 = 0;
                        zzdr.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 20:
                        i2 = 0;
                        zzdr.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 21:
                        i2 = 0;
                        zzdr.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 22:
                        i2 = 0;
                        zzdr.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        i2 = 0;
                        zzdr.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 24:
                        i2 = 0;
                        zzdr.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 25:
                        i2 = 0;
                        zzdr.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 26:
                        zzdr.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar);
                        i2 = 0;
                        break;
                    case 27:
                        zzdr.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, zzB(i8));
                        i2 = 0;
                        break;
                    case 28:
                        zzdr.zzE(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar);
                        i2 = 0;
                        break;
                    case 29:
                        i3 = 0;
                        zzdr.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        i2 = i3;
                        break;
                    case 30:
                        i3 = 0;
                        zzdr.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        i2 = i3;
                        break;
                    case 31:
                        i3 = 0;
                        zzdr.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        i2 = i3;
                        break;
                    case 32:
                        i3 = 0;
                        zzdr.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        i2 = i3;
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        i3 = 0;
                        zzdr.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        i2 = i3;
                        break;
                    case 34:
                        i3 = 0;
                        zzdr.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        i2 = i3;
                        break;
                    case 35:
                        zzdr.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 36:
                        zzdr.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 37:
                        zzdr.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 38:
                        zzdr.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 39:
                        zzdr.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 40:
                        zzdr.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 41:
                        zzdr.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 42:
                        zzdr.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 43:
                        zzdr.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 44:
                        zzdr.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 45:
                        zzdr.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 46:
                        zzdr.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 47:
                        zzdr.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 48:
                        zzdr.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 49:
                        zzdr.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, zzB(i8));
                        i2 = 0;
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        zzN(zzeyVar, i11, unsafe.getObject(obj, j), i8);
                        i2 = 0;
                        break;
                    case 51:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzf(i11, zzm(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 52:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzo(i11, zzn(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 53:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzt(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 54:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzJ(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 55:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzr(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 56:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzm(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 57:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzk(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 58:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzb(i11, zzU(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 59:
                        if (zzT(obj, i11, i8)) {
                            zzV(i11, unsafe.getObject(obj, j), zzeyVar);
                        }
                        i2 = 0;
                        break;
                    case 60:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzv(i11, unsafe.getObject(obj, j), zzB(i8));
                        }
                        i2 = 0;
                        break;
                    case 61:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzd(i11, (zzba) unsafe.getObject(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 62:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzH(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 63:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzi(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 64:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzw(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 65:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzy(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 66:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzA(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 67:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzC(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 68:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzq(i11, unsafe.getObject(obj, j), zzB(i8));
                        }
                        i2 = 0;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                i8 += 3;
                i4 = i2;
                i5 = 1048575;
            }
            zzeg zzegVar2 = this.zzm;
            zzegVar2.zzi(zzegVar2.zzd(obj), zzeyVar);
        } else {
            this.zzn.zza(obj);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzV;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzy = zzy(i);
            long j = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (zzO(obj, obj2, i) && Double.doubleToLongBits(zzeq.zza(obj, j)) == Double.doubleToLongBits(zzeq.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i) && Float.floatToIntBits(zzeq.zzb(obj, j)) == Float.floatToIntBits(zzeq.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i) && zzeq.zzd(obj, j) == zzeq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i) && zzeq.zzd(obj, j) == zzeq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i) && zzeq.zzd(obj, j) == zzeq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i) && zzeq.zzw(obj, j) == zzeq.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i) && zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i) && zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i) && zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i) && zzeq.zzd(obj, j) == zzeq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i) && zzeq.zzd(obj, j) == zzeq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i) && zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzV = zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j));
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    zzV = zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzv = zzv(i) & 1048575;
                    if (zzeq.zzc(obj, zzv) == zzeq.zzc(obj2, zzv) && zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzV) {
                return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzn.zza(obj);
        this.zzn.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzj) {
            int i6 = this.zzi[i4];
            int i7 = this.zzc[i6];
            int zzy = zzy(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & zzy) != 0 && !zzQ(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzx = zzx(zzy);
            if (zzx != 9 && zzx != 17) {
                if (zzx != 27) {
                    if (zzx != 60 && zzx != 68) {
                        if (zzx != 49) {
                            if (zzx == 50 && !((zzcz) zzeq.zzf(obj, zzy & 1048575)).isEmpty()) {
                                zzcy zzcyVar = (zzcy) zzC(i6);
                                throw null;
                            }
                        }
                    } else if (zzT(obj, i7, i6) && !zzR(obj, zzy, zzB(i6))) {
                        return false;
                    }
                }
                List list = (List) zzeq.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzdp zzB = zzB(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzB.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzQ(obj, i6, i, i2, i10) && !zzR(obj, zzy, zzB(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzn.zza(obj);
        throw null;
    }
}
