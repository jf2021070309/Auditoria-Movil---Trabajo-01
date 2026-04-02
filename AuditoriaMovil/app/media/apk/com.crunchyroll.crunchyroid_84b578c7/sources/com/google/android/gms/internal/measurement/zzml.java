package com.google.android.gms.internal.measurement;

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
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzml<T> implements zzmt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zznu.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzmi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzlw zzm;
    private final zznk zzn;
    private final zzko zzo;
    private final zzmn zzp;
    private final zzmd zzq;

    private zzml(int[] iArr, Object[] objArr, int i, int i2, zzmi zzmiVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzkoVar != null && zzkoVar.zzc(zzmiVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzmnVar;
        this.zzm = zzlwVar;
        this.zzn = zznkVar;
        this.zzo = zzkoVar;
        this.zzg = zzmiVar;
        this.zzq = zzmdVar;
    }

    private final zzlf zzA(int i) {
        int i2 = i / 3;
        return (zzlf) this.zzd[i2 + i2 + 1];
    }

    private final zzmt zzB(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzmt zzmtVar = (zzmt) this.zzd[i3];
        if (zzmtVar != null) {
            return zzmtVar;
        }
        zzmt zzb2 = zzmq.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzD(Object obj, int i) {
        zzmt zzB = zzB(i);
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
        zzmt zzB = zzB(i2);
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
            zzmt zzB = zzB(i);
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
            zzmt zzB = zzB(i);
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
        zznu.zzq(obj, j, (1 << (zzv >>> 20)) | zznu.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zznu.zzq(obj, zzv(i2) & 1048575, i);
    }

    private final void zzL(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzy(i) & 1048575, obj2);
        zzJ(obj, i);
    }

    private final void zzM(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzy(i2) & 1048575, obj2);
        zzK(obj, i, i2);
    }

    private final void zzN(zzoc zzocVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzmb zzmbVar = (zzmb) zzC(i2);
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
                    if (Double.doubleToRawLongBits(zznu.zza(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zznu.zzb(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zznu.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zznu.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zznu.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zznu.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zznu.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zznu.zzw(obj, j2);
                case 8:
                    Object zzf = zznu.zzf(obj, j2);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzka) {
                        if (zzka.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zznu.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzka.zzb.equals(zznu.zzf(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zznu.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zznu.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zznu.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zznu.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zznu.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zznu.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zznu.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zznu.zzc(obj, j) & (1 << (zzv >>> 20))) == 0) {
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

    private static boolean zzR(Object obj, int i, zzmt zzmtVar) {
        return zzmtVar.zzk(zznu.zzf(obj, i & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzlb) {
            return ((zzlb) obj).zzbR();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i, int i2) {
        if (zznu.zzc(obj, zzv(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean zzU(Object obj, long j) {
        return ((Boolean) zznu.zzf(obj, j)).booleanValue();
    }

    private static final void zzV(int i, Object obj, zzoc zzocVar) throws IOException {
        if (obj instanceof String) {
            zzocVar.zzF(i, (String) obj);
        } else {
            zzocVar.zzd(i, (zzka) obj);
        }
    }

    public static zznl zzd(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar == zznl.zzc()) {
            zznl zzf = zznl.zzf();
            zzlbVar.zzc = zzf;
            return zzf;
        }
        return zznlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.zzml zzl(java.lang.Class r31, com.google.android.gms.internal.measurement.zzmf r32, com.google.android.gms.internal.measurement.zzmn r33, com.google.android.gms.internal.measurement.zzlw r34, com.google.android.gms.internal.measurement.zznk r35, com.google.android.gms.internal.measurement.zzko r36, com.google.android.gms.internal.measurement.zzmd r37) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzl(java.lang.Class, com.google.android.gms.internal.measurement.zzmf, com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zzlw, com.google.android.gms.internal.measurement.zznk, com.google.android.gms.internal.measurement.zzko, com.google.android.gms.internal.measurement.zzmd):com.google.android.gms.internal.measurement.zzml");
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zznu.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zznu.zzf(obj, j)).floatValue();
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
                        zzx = zzki.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 1:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 2:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzki.zzx(i10 << 3);
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
                        zzy = zzki.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzki.zzx(i10 << 3);
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
                        i3 = zzki.zzu(unsafe.getInt(obj, j));
                        i2 = zzki.zzx(i10 << 3);
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 5:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 6:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 7:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx4 = zzki.zzx(i10 << 3);
                        zzn = zzx4 + 1;
                        i7 += zzn;
                        break;
                    }
                case 8:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzka) {
                            int i15 = zzki.zzb;
                            int zzd = ((zzka) object).zzd();
                            zzx5 = zzd + zzki.zzx(zzd);
                            zzx6 = zzki.zzx(i10 << 3);
                            zzn = zzx5 + zzx6;
                            i7 += zzn;
                            break;
                        } else {
                            i3 = zzki.zzw((String) object);
                            i2 = zzki.zzx(i10 << 3);
                            i7 = i2 + i3 + i7;
                            break;
                        }
                    }
                case 9:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzn = zzmv.zzn(i10, unsafe.getObject(obj, j), zzB(i8));
                        i7 += zzn;
                        break;
                    }
                case 10:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i16 = zzki.zzb;
                        int zzd2 = ((zzka) unsafe.getObject(obj, j)).zzd();
                        zzx5 = zzd2 + zzki.zzx(zzd2);
                        zzx6 = zzki.zzx(i10 << 3);
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 11:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i3 = zzki.zzx(unsafe.getInt(obj, j));
                        i2 = zzki.zzx(i10 << 3);
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 12:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i3 = zzki.zzu(unsafe.getInt(obj, j));
                        i2 = zzki.zzx(i10 << 3);
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 13:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 14:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 15:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i17 = unsafe.getInt(obj, j);
                        zzx7 = zzki.zzx(i10 << 3);
                        zzx8 = zzki.zzx((i17 >> 31) ^ (i17 + i17));
                        zzn = zzx8 + zzx7;
                        i7 += zzn;
                        break;
                    }
                case 16:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzx5 = zzki.zzx(i10 << 3);
                        zzx6 = zzki.zzy((j2 >> 63) ^ (j2 + j2));
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 17:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzn = zzki.zzt(i10, (zzmi) unsafe.getObject(obj, j), zzB(i8));
                        i7 += zzn;
                        break;
                    }
                case 18:
                    zzn = zzmv.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 19:
                    zzn = zzmv.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 20:
                    zzn = zzmv.zzl(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 21:
                    zzn = zzmv.zzw(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 22:
                    zzn = zzmv.zzj(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzn = zzmv.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 24:
                    zzn = zzmv.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 25:
                    zzn = zzmv.zza(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 26:
                    zzn = zzmv.zzt(i10, (List) unsafe.getObject(obj, j));
                    i7 += zzn;
                    break;
                case 27:
                    zzn = zzmv.zzo(i10, (List) unsafe.getObject(obj, j), zzB(i8));
                    i7 += zzn;
                    break;
                case 28:
                    zzn = zzmv.zzb(i10, (List) unsafe.getObject(obj, j));
                    i7 += zzn;
                    break;
                case 29:
                    zzn = zzmv.zzu(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 30:
                    zzn = zzmv.zzc(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 31:
                    zzn = zzmv.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 32:
                    zzn = zzmv.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    zzn = zzmv.zzp(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 34:
                    zzn = zzmv.zzr(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 35:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 36:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 37:
                    zzh = zzmv.zzm((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 38:
                    zzh = zzmv.zzx((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 39:
                    zzh = zzmv.zzk((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 40:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 41:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 42:
                    int i18 = zzmv.zza;
                    zzh = ((List) unsafe.getObject(obj, j)).size();
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 43:
                    zzh = zzmv.zzv((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 44:
                    zzh = zzmv.zzd((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 45:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 46:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 47:
                    zzh = zzmv.zzq((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 48:
                    zzh = zzmv.zzs((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 49:
                    zzn = zzmv.zzi(i10, (List) unsafe.getObject(obj, j), zzB(i8));
                    i7 += zzn;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    zzmd.zza(i10, unsafe.getObject(obj, j), zzC(i8));
                    break;
                case 51:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzx = zzki.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 52:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 53:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzy2 = zzki.zzy(zzz(obj, j));
                        zzx11 = zzki.zzx(i10 << 3);
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
                        zzy2 = zzki.zzy(zzz(obj, j));
                        zzx11 = zzki.zzx(i10 << 3);
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
                        zzh = zzki.zzu(zzp(obj, j));
                        i4 = zzki.zzx(i10 << 3);
                        i7 += i4 + zzh;
                        break;
                    }
                case 56:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzx = zzki.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 57:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 58:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzx4 = zzki.zzx(i10 << 3);
                        zzn = zzx4 + 1;
                        i7 += zzn;
                        break;
                    }
                case 59:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzka) {
                            int i20 = zzki.zzb;
                            int zzd3 = ((zzka) object2).zzd();
                            zzx5 = zzd3 + zzki.zzx(zzd3);
                            zzx6 = zzki.zzx(i10 << 3);
                            zzn = zzx5 + zzx6;
                            i7 += zzn;
                            break;
                        } else {
                            zzh = zzki.zzw((String) object2);
                            i4 = zzki.zzx(i10 << 3);
                            i7 += i4 + zzh;
                            break;
                        }
                    }
                case 60:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzn = zzmv.zzn(i10, unsafe.getObject(obj, j), zzB(i8));
                        i7 += zzn;
                        break;
                    }
                case 61:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        int i21 = zzki.zzb;
                        int zzd4 = ((zzka) unsafe.getObject(obj, j)).zzd();
                        zzx5 = zzd4 + zzki.zzx(zzd4);
                        zzx6 = zzki.zzx(i10 << 3);
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 62:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzh = zzki.zzx(zzp(obj, j));
                        i4 = zzki.zzx(i10 << 3);
                        i7 += i4 + zzh;
                        break;
                    }
                case 63:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzh = zzki.zzu(zzp(obj, j));
                        i4 = zzki.zzx(i10 << 3);
                        i7 += i4 + zzh;
                        break;
                    }
                case 64:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 65:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzx = zzki.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 66:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        int zzp = zzp(obj, j);
                        zzx7 = zzki.zzx(i10 << 3);
                        zzx8 = zzki.zzx((zzp >> 31) ^ (zzp + zzp));
                        zzn = zzx8 + zzx7;
                        i7 += zzn;
                        break;
                    }
                case 67:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        long zzz = zzz(obj, j);
                        zzx5 = zzki.zzx(i10 << 3);
                        zzx6 = zzki.zzy((zzz >> 63) ^ (zzz + zzz));
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 68:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzn = zzki.zzt(i10, (zzmi) unsafe.getObject(obj, j), zzB(i8));
                        i7 += zzn;
                        break;
                    }
            }
            i8 += 3;
            i5 = 1048575;
        }
        zznk zznkVar = this.zzn;
        int zza2 = i7 + zznkVar.zza(zznkVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zznu.zzf(obj, j)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzmc) object).zze()) {
            zzmc zzb2 = zzmc.zza().zzb();
            zzmd.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzmb zzmbVar = (zzmb) zzC;
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzjo.zzp(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzjo.zzb(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzjo.zzm(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzjnVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzjo.zzj(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzjnVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzjo.zzp(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzjo.zzb(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzjo.zzm(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzjnVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzjo.zzj(bArr, i, zzjnVar);
                    int i13 = zzjnVar.zza;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !zznz.zze(bArr, zzj2, zzj2 + i13)) {
                        throw zzll.zzc();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i13, zzlj.zzb));
                        zzj2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object zzE = zzE(obj, i4, i8);
                    int zzo = zzjo.zzo(zzE, zzB(i8), bArr, i, i2, zzjnVar);
                    zzM(obj, i4, i8, zzE);
                    return zzo;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzjo.zza(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, zzjnVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzjo.zzj(bArr, i, zzjnVar);
                    int i14 = zzjnVar.zza;
                    zzlf zzA = zzA(i8);
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
                    int zzj4 = zzjo.zzj(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzke.zzb(zzjnVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzjo.zzm(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzke.zzc(zzjnVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object zzE2 = zzE(obj, i4, i8);
                    int zzn = zzjo.zzn(zzE2, zzB(i8), bArr, i, i2, (i3 & (-8)) | 4, zzjnVar);
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
    private final int zzs(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.measurement.zzjn r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzs(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzjn):int");
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
        return ((Long) zznu.zzf(obj, j)).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
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
        if (this.zzi) {
            Unsafe unsafe = zzb;
            int i = 0;
            for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
                int zzy2 = zzy(i2);
                int zzx11 = zzx(zzy2);
                int i3 = this.zzc[i2];
                int i4 = zzy2 & 1048575;
                if (zzx11 >= zzkt.zzJ.zza() && zzx11 <= zzkt.zzW.zza()) {
                    int i5 = this.zzc[i2 + 2];
                }
                long j = i4;
                switch (zzx11) {
                    case 0:
                        if (zzP(obj, i2)) {
                            zzx = zzki.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i2)) {
                            zzx2 = zzki.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i2)) {
                            zzy = zzki.zzy(zznu.zzd(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i2)) {
                            zzy = zzki.zzy(zznu.zzd(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i2)) {
                            zzy = zzki.zzu(zznu.zzc(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i2)) {
                            zzx = zzki.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i2)) {
                            zzx2 = zzki.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i2)) {
                            zzx4 = zzki.zzx(i3 << 3);
                            zzn = zzx4 + 1;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzP(obj, i2)) {
                            Object zzf = zznu.zzf(obj, j);
                            if (zzf instanceof zzka) {
                                int i6 = i3 << 3;
                                int i7 = zzki.zzb;
                                int zzd = ((zzka) zzf).zzd();
                                zzx5 = zzki.zzx(zzd) + zzd;
                                zzx6 = zzki.zzx(i6);
                                zzn = zzx6 + zzx5;
                                i += zzn;
                                break;
                            } else {
                                zzy = zzki.zzw((String) zzf);
                                zzx3 = zzki.zzx(i3 << 3);
                                i += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (zzP(obj, i2)) {
                            zzn = zzmv.zzn(i3, zznu.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzP(obj, i2)) {
                            int i8 = i3 << 3;
                            int i9 = zzki.zzb;
                            int zzd2 = ((zzka) zznu.zzf(obj, j)).zzd();
                            zzx5 = zzki.zzx(zzd2) + zzd2;
                            zzx6 = zzki.zzx(i8);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzP(obj, i2)) {
                            zzy = zzki.zzx(zznu.zzc(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i2)) {
                            zzy = zzki.zzu(zznu.zzc(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i2)) {
                            zzx2 = zzki.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i2)) {
                            zzx = zzki.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i2)) {
                            int zzc = zznu.zzc(obj, j);
                            zzx7 = zzki.zzx(i3 << 3);
                            zzx8 = zzki.zzx((zzc >> 31) ^ (zzc + zzc));
                            zzn = zzx8 + zzx7;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i2)) {
                            long zzd3 = zznu.zzd(obj, j);
                            zzy = zzki.zzx(i3 << 3);
                            zzx3 = zzki.zzy((zzd3 + zzd3) ^ (zzd3 >> 63));
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzP(obj, i2)) {
                            zzn = zzki.zzt(i3, (zzmi) zznu.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzn = zzmv.zzg(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 19:
                        zzn = zzmv.zze(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 20:
                        zzn = zzmv.zzl(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 21:
                        zzn = zzmv.zzw(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 22:
                        zzn = zzmv.zzj(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        zzn = zzmv.zzg(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 24:
                        zzn = zzmv.zze(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 25:
                        zzn = zzmv.zza(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 26:
                        zzn = zzmv.zzt(i3, (List) zznu.zzf(obj, j));
                        i += zzn;
                        break;
                    case 27:
                        zzn = zzmv.zzo(i3, (List) zznu.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    case 28:
                        zzn = zzmv.zzb(i3, (List) zznu.zzf(obj, j));
                        i += zzn;
                        break;
                    case 29:
                        zzn = zzmv.zzu(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 30:
                        zzn = zzmv.zzc(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 31:
                        zzn = zzmv.zze(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 32:
                        zzn = zzmv.zzg(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        zzn = zzmv.zzp(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 34:
                        zzn = zzmv.zzr(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 35:
                        zzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i10 = i3 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i10);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        zzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i11 = i3 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i11);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        zzy = zzmv.zzm((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i12 = i3 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i12);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        zzy = zzmv.zzx((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i13 = i3 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i13);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        zzy = zzmv.zzk((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i14 = i3 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i14);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        zzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i15 = i3 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i15);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        zzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i16 = i3 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i16);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        int i17 = zzmv.zza;
                        zzy = ((List) unsafe.getObject(obj, j)).size();
                        if (zzy > 0) {
                            int i18 = i3 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i18);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        zzy = zzmv.zzv((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i19 = i3 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i19);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        zzy = zzmv.zzd((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i20 = i3 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i20);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        zzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i21 = i3 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i21);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        zzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i22 = i3 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i22);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        zzy = zzmv.zzq((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i23 = i3 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i23);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        zzy = zzmv.zzs((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i24 = i3 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i24);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        zzn = zzmv.zzi(i3, (List) zznu.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        zzmd.zza(i3, zznu.zzf(obj, j), zzC(i2));
                        break;
                    case 51:
                        if (zzT(obj, i3, i2)) {
                            zzx = zzki.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i3, i2)) {
                            zzx2 = zzki.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzki.zzy(zzz(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzki.zzy(zzz(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzki.zzu(zzp(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i3, i2)) {
                            zzx = zzki.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i3, i2)) {
                            zzx2 = zzki.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i3, i2)) {
                            zzx4 = zzki.zzx(i3 << 3);
                            zzn = zzx4 + 1;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i3, i2)) {
                            Object zzf2 = zznu.zzf(obj, j);
                            if (zzf2 instanceof zzka) {
                                int i25 = i3 << 3;
                                int i26 = zzki.zzb;
                                int zzd4 = ((zzka) zzf2).zzd();
                                zzx5 = zzki.zzx(zzd4) + zzd4;
                                zzx6 = zzki.zzx(i25);
                                zzn = zzx6 + zzx5;
                                i += zzn;
                                break;
                            } else {
                                zzy = zzki.zzw((String) zzf2);
                                zzx3 = zzki.zzx(i3 << 3);
                                i += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (zzT(obj, i3, i2)) {
                            zzn = zzmv.zzn(i3, zznu.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzT(obj, i3, i2)) {
                            int i27 = i3 << 3;
                            int i28 = zzki.zzb;
                            int zzd5 = ((zzka) zznu.zzf(obj, j)).zzd();
                            zzx5 = zzki.zzx(zzd5) + zzd5;
                            zzx6 = zzki.zzx(i27);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzki.zzx(zzp(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzki.zzu(zzp(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i3, i2)) {
                            zzx2 = zzki.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i3, i2)) {
                            zzx = zzki.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i3, i2)) {
                            int zzp = zzp(obj, j);
                            zzx7 = zzki.zzx(i3 << 3);
                            zzx8 = zzki.zzx((zzp >> 31) ^ (zzp + zzp));
                            zzn = zzx8 + zzx7;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i3, i2)) {
                            long zzz = zzz(obj, j);
                            zzy = zzki.zzx(i3 << 3);
                            zzx3 = zzki.zzy((zzz + zzz) ^ (zzz >> 63));
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i3, i2)) {
                            zzn = zzki.zzt(i3, (zzmi) zznu.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                }
            }
            zznk zznkVar = this.zzn;
            return i + zznkVar.zza(zznkVar.zzd(obj));
        }
        return zzo(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
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
                    doubleToLongBits = Double.doubleToLongBits(zznu.zza(obj, j));
                    byte[] bArr = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 1:
                    i2 = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(zznu.zzb(obj, j));
                    i3 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = zznu.zzd(obj, j);
                    byte[] bArr2 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = zznu.zzd(obj, j);
                    byte[] bArr3 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 4:
                    i = i3 * 53;
                    zzc = zznu.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = zznu.zzd(obj, j);
                    byte[] bArr4 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 6:
                    i = i3 * 53;
                    zzc = zznu.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 7:
                    i2 = i3 * 53;
                    floatToIntBits = zzlj.zza(zznu.zzw(obj, j));
                    i3 = floatToIntBits + i2;
                    break;
                case 8:
                    i2 = i3 * 53;
                    floatToIntBits = ((String) zznu.zzf(obj, j)).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case 9:
                    Object zzf = zznu.zzf(obj, j);
                    if (zzf != null) {
                        i6 = zzf.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    floatToIntBits = zznu.zzf(obj, j).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case 11:
                    i = i3 * 53;
                    zzc = zznu.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 12:
                    i = i3 * 53;
                    zzc = zznu.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 13:
                    i = i3 * 53;
                    zzc = zznu.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = zznu.zzd(obj, j);
                    byte[] bArr5 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 15:
                    i = i3 * 53;
                    zzc = zznu.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = zznu.zzd(obj, j);
                    byte[] bArr6 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 17:
                    Object zzf2 = zznu.zzf(obj, j);
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
                    floatToIntBits = zznu.zzf(obj, j).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    i2 = i3 * 53;
                    floatToIntBits = zznu.zzf(obj, j).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case 51:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzlj.zzd;
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
                        byte[] bArr8 = zzlj.zzd;
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
                        byte[] bArr9 = zzlj.zzd;
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
                        byte[] bArr10 = zzlj.zzd;
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
                        floatToIntBits = zzlj.zza(zzU(obj, j));
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = ((String) zznu.zzf(obj, j)).hashCode();
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zznu.zzf(obj, j).hashCode();
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zznu.zzf(obj, j).hashCode();
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
                        byte[] bArr11 = zzlj.zzd;
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
                        byte[] bArr12 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zznu.zzf(obj, j).hashCode();
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzd(obj).hashCode() + (i3 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
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
        r2 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x040f, code lost:
        if (r2 >= r8.zzl) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0411, code lost:
        r4 = r8.zzj[r2];
        r5 = r8.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zznu.zzf(r12, r8.zzy(r4) & 1048575);
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
        r5 = (com.google.android.gms.internal.measurement.zzmc) r5;
        r0 = (com.google.android.gms.internal.measurement.zzmb) r8.zzC(r4);
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
        throw com.google.android.gms.internal.measurement.zzll.zze();
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
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzjn r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzjn):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final Object zze() {
        return ((zzlb) this.zzg).zzbD();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzf(Object obj) {
        if (!zzS(obj)) {
            return;
        }
        if (obj instanceof zzlb) {
            zzlb zzlbVar = (zzlb) obj;
            zzlbVar.zzbP(Integer.MAX_VALUE);
            zzlbVar.zzb = 0;
            zzlbVar.zzbN();
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
                            this.zzm.zza(obj, j);
                            break;
                        case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzmc) object).zzc();
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
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
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
                        zznu.zzo(obj, j, zznu.zza(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i)) {
                        zznu.zzp(obj, j, zznu.zzb(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj2, i)) {
                        zznu.zzm(obj, j, zznu.zzw(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj2, i)) {
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
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
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    int i3 = zzmv.zza;
                    zznu.zzs(obj, j, zzmd.zzb(zznu.zzf(obj, j), zznu.zzf(obj2, j)));
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
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
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
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
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
        zzmv.zzB(this.zzn, obj, obj2);
        if (!this.zzh) {
            return;
        }
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02e8, code lost:
        if (r0 != r24) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ea, code lost:
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r10 = r18;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0329, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x034c, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.zzjn r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzjn):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzi(Object obj, zzoc zzocVar) throws IOException {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1048575;
        if (this.zzi) {
            if (!this.zzh) {
                int length = this.zzc.length;
                for (int i6 = 0; i6 < length; i6 += 3) {
                    int zzy = zzy(i6);
                    int i7 = this.zzc[i6];
                    switch (zzx(zzy)) {
                        case 0:
                            if (zzP(obj, i6)) {
                                zzocVar.zzf(i7, zznu.zza(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzP(obj, i6)) {
                                zzocVar.zzo(i7, zznu.zzb(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzP(obj, i6)) {
                                zzocVar.zzt(i7, zznu.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzP(obj, i6)) {
                                zzocVar.zzJ(i7, zznu.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzP(obj, i6)) {
                                zzocVar.zzr(i7, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzP(obj, i6)) {
                                zzocVar.zzm(i7, zznu.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzP(obj, i6)) {
                                zzocVar.zzk(i7, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzP(obj, i6)) {
                                zzocVar.zzb(i7, zznu.zzw(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzP(obj, i6)) {
                                zzV(i7, zznu.zzf(obj, zzy & 1048575), zzocVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzP(obj, i6)) {
                                zzocVar.zzv(i7, zznu.zzf(obj, zzy & 1048575), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzP(obj, i6)) {
                                zzocVar.zzd(i7, (zzka) zznu.zzf(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzP(obj, i6)) {
                                zzocVar.zzH(i7, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzP(obj, i6)) {
                                zzocVar.zzi(i7, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzP(obj, i6)) {
                                zzocVar.zzw(i7, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzP(obj, i6)) {
                                zzocVar.zzy(i7, zznu.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzP(obj, i6)) {
                                zzocVar.zzA(i7, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzP(obj, i6)) {
                                zzocVar.zzC(i7, zznu.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzP(obj, i6)) {
                                zzocVar.zzq(i7, zznu.zzf(obj, zzy & 1048575), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzmv.zzF(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 19:
                            zzmv.zzJ(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 20:
                            zzmv.zzM(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 21:
                            zzmv.zzU(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 22:
                            zzmv.zzL(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            zzmv.zzI(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 24:
                            zzmv.zzH(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 25:
                            zzmv.zzD(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 26:
                            zzmv.zzS(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                            break;
                        case 27:
                            zzmv.zzN(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i6));
                            break;
                        case 28:
                            zzmv.zzE(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                            break;
                        case 29:
                            zzmv.zzT(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 30:
                            zzmv.zzG(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 31:
                            zzmv.zzO(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 32:
                            zzmv.zzP(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                            zzmv.zzQ(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 34:
                            zzmv.zzR(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 35:
                            zzmv.zzF(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 36:
                            zzmv.zzJ(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 37:
                            zzmv.zzM(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 38:
                            zzmv.zzU(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 39:
                            zzmv.zzL(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 40:
                            zzmv.zzI(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 41:
                            zzmv.zzH(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 42:
                            zzmv.zzD(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 43:
                            zzmv.zzT(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 44:
                            zzmv.zzG(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 45:
                            zzmv.zzO(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 46:
                            zzmv.zzP(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 47:
                            zzmv.zzQ(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 48:
                            zzmv.zzR(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 49:
                            zzmv.zzK(i7, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i6));
                            break;
                        case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                            zzN(zzocVar, i7, zznu.zzf(obj, zzy & 1048575), i6);
                            break;
                        case 51:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzf(i7, zzm(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzo(i7, zzn(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzt(i7, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzJ(i7, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzr(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzm(i7, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzk(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzb(i7, zzU(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzT(obj, i7, i6)) {
                                zzV(i7, zznu.zzf(obj, zzy & 1048575), zzocVar);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzv(i7, zznu.zzf(obj, zzy & 1048575), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzd(i7, (zzka) zznu.zzf(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzH(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzi(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzw(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzy(i7, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzA(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzC(i7, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzT(obj, i7, i6)) {
                                zzocVar.zzq(i7, zznu.zzf(obj, zzy & 1048575), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zznk zznkVar = this.zzn;
                zznkVar.zzi(zznkVar.zzd(obj), zzocVar);
                return;
            }
            this.zzo.zza(obj);
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
                            zzocVar.zzf(i11, zznu.zza(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzo(i11, zznu.zzb(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzt(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzJ(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzr(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzm(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzk(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzb(i11, zznu.zzw(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzV(i11, unsafe.getObject(obj, j), zzocVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzv(i11, unsafe.getObject(obj, j), zzB(i8));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzd(i11, (zzka) unsafe.getObject(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzH(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzi(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzw(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzy(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzA(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzC(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzocVar.zzq(i11, unsafe.getObject(obj, j), zzB(i8));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i2 = 0;
                        zzmv.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                        break;
                    case 19:
                        i2 = 0;
                        zzmv.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                        break;
                    case 20:
                        i2 = 0;
                        zzmv.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                        break;
                    case 21:
                        i2 = 0;
                        zzmv.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                        break;
                    case 22:
                        i2 = 0;
                        zzmv.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        i2 = 0;
                        zzmv.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                        break;
                    case 24:
                        i2 = 0;
                        zzmv.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                        break;
                    case 25:
                        i2 = 0;
                        zzmv.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                        break;
                    case 26:
                        zzmv.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar);
                        i2 = 0;
                        break;
                    case 27:
                        zzmv.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, zzB(i8));
                        i2 = 0;
                        break;
                    case 28:
                        zzmv.zzE(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar);
                        i2 = 0;
                        break;
                    case 29:
                        i3 = 0;
                        zzmv.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                        i2 = i3;
                        break;
                    case 30:
                        i3 = 0;
                        zzmv.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                        i2 = i3;
                        break;
                    case 31:
                        i3 = 0;
                        zzmv.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                        i2 = i3;
                        break;
                    case 32:
                        i3 = 0;
                        zzmv.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                        i2 = i3;
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        i3 = 0;
                        zzmv.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                        i2 = i3;
                        break;
                    case 34:
                        i3 = 0;
                        zzmv.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, false);
                        i2 = i3;
                        break;
                    case 35:
                        zzmv.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                        i2 = 0;
                        break;
                    case 36:
                        zzmv.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                        i2 = 0;
                        break;
                    case 37:
                        zzmv.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                        i2 = 0;
                        break;
                    case 38:
                        zzmv.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                        i2 = 0;
                        break;
                    case 39:
                        zzmv.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                        i2 = 0;
                        break;
                    case 40:
                        zzmv.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                        i2 = 0;
                        break;
                    case 41:
                        zzmv.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                        i2 = 0;
                        break;
                    case 42:
                        zzmv.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                        i2 = 0;
                        break;
                    case 43:
                        zzmv.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                        i2 = 0;
                        break;
                    case 44:
                        zzmv.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                        i2 = 0;
                        break;
                    case 45:
                        zzmv.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                        i2 = 0;
                        break;
                    case 46:
                        zzmv.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                        i2 = 0;
                        break;
                    case 47:
                        zzmv.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                        i2 = 0;
                        break;
                    case 48:
                        zzmv.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, true);
                        i2 = 0;
                        break;
                    case 49:
                        zzmv.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j), zzocVar, zzB(i8));
                        i2 = 0;
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        zzN(zzocVar, i11, unsafe.getObject(obj, j), i8);
                        i2 = 0;
                        break;
                    case 51:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzf(i11, zzm(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 52:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzo(i11, zzn(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 53:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzt(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 54:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzJ(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 55:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzr(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 56:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzm(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 57:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzk(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 58:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzb(i11, zzU(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 59:
                        if (zzT(obj, i11, i8)) {
                            zzV(i11, unsafe.getObject(obj, j), zzocVar);
                        }
                        i2 = 0;
                        break;
                    case 60:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzv(i11, unsafe.getObject(obj, j), zzB(i8));
                        }
                        i2 = 0;
                        break;
                    case 61:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzd(i11, (zzka) unsafe.getObject(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 62:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzH(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 63:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzi(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 64:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzw(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 65:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzy(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 66:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzA(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 67:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzC(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 68:
                        if (zzT(obj, i11, i8)) {
                            zzocVar.zzq(i11, unsafe.getObject(obj, j), zzB(i8));
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
            zznk zznkVar2 = this.zzn;
            zznkVar2.zzi(zznkVar2.zzd(obj), zzocVar);
        } else {
            this.zzo.zza(obj);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzV;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzy = zzy(i);
            long j = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (zzO(obj, obj2, i) && Double.doubleToLongBits(zznu.zza(obj, j)) == Double.doubleToLongBits(zznu.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i) && Float.floatToIntBits(zznu.zzb(obj, j)) == Float.floatToIntBits(zznu.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i) && zznu.zzd(obj, j) == zznu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i) && zznu.zzd(obj, j) == zznu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i) && zznu.zzd(obj, j) == zznu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i) && zznu.zzw(obj, j) == zznu.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i) && zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i) && zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i) && zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i) && zznu.zzd(obj, j) == zznu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i) && zznu.zzd(obj, j) == zznu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i) && zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
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
                    zzV = zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j));
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    zzV = zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j));
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
                    if (zznu.zzc(obj, zzv) == zznu.zzc(obj2, zzv) && zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzV) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzk) {
            int i6 = this.zzj[i4];
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
                            if (zzx == 50 && !((zzmc) zznu.zzf(obj, zzy & 1048575)).isEmpty()) {
                                zzmb zzmbVar = (zzmb) zzC(i6);
                                throw null;
                            }
                        }
                    } else if (zzT(obj, i7, i6) && !zzR(obj, zzy, zzB(i6))) {
                        return false;
                    }
                }
                List list = (List) zznu.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzmt zzB = zzB(i6);
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
        this.zzo.zza(obj);
        throw null;
    }
}
