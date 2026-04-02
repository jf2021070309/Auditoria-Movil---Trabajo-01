package com.google.android.gms.internal.cast;

import com.amazon.aps.iva.n4.a;
import com.google.ads.AdSize;
import com.google.android.gms.common.ConnectionResult;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
final class zzva<T> implements zzvi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzwj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzux zze;
    private final boolean zzf;
    private final int[] zzg;
    private final int zzh;
    private final zzul zzi;
    private final zzvz zzj;
    private final zztf zzk;
    private final zzvc zzl;
    private final zzus zzm;

    private zzva(int[] iArr, Object[] objArr, int i, int i2, zzux zzuxVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzvc zzvcVar, zzul zzulVar, zzvz zzvzVar, zztf zztfVar, zzus zzusVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        boolean z2 = false;
        if (zztfVar != null && zztfVar.zzc(zzuxVar)) {
            z2 = true;
        }
        this.zzf = z2;
        this.zzg = iArr2;
        this.zzh = i4;
        this.zzl = zzvcVar;
        this.zzi = zzulVar;
        this.zzj = zzvzVar;
        this.zzk = zztfVar;
        this.zze = zzuxVar;
        this.zzm = zzusVar;
    }

    private static boolean zzA(Object obj, int i, zzvi zzviVar) {
        return zzviVar.zzh(zzwj.zzf(obj, i & 1048575));
    }

    private static boolean zzB(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zztp) {
            return ((zztp) obj).zzK();
        }
        return true;
    }

    private final boolean zzC(Object obj, int i, int i2) {
        if (zzwj.zzc(obj, zzm(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean zzD(Object obj, long j) {
        return ((Boolean) zzwj.zzf(obj, j)).booleanValue();
    }

    private static final void zzE(int i, Object obj, zzwq zzwqVar) throws IOException {
        if (obj instanceof String) {
            zzwqVar.zzD(i, (String) obj);
        } else {
            zzwqVar.zzd(i, (zzsu) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.cast.zzva zzi(java.lang.Class r29, com.google.android.gms.internal.cast.zzuu r30, com.google.android.gms.internal.cast.zzvc r31, com.google.android.gms.internal.cast.zzul r32, com.google.android.gms.internal.cast.zzvz r33, com.google.android.gms.internal.cast.zztf r34, com.google.android.gms.internal.cast.zzus r35) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzva.zzi(java.lang.Class, com.google.android.gms.internal.cast.zzuu, com.google.android.gms.internal.cast.zzvc, com.google.android.gms.internal.cast.zzul, com.google.android.gms.internal.cast.zzvz, com.google.android.gms.internal.cast.zztf, com.google.android.gms.internal.cast.zzus):com.google.android.gms.internal.cast.zzva");
    }

    private static double zzj(Object obj, long j) {
        return ((Double) zzwj.zzf(obj, j)).doubleValue();
    }

    private static float zzk(Object obj, long j) {
        return ((Float) zzwj.zzf(obj, j)).floatValue();
    }

    private static int zzl(Object obj, long j) {
        return ((Integer) zzwj.zzf(obj, j)).intValue();
    }

    private final int zzm(int i) {
        return this.zzc[i + 2];
    }

    private static int zzn(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzo(int i) {
        return this.zzc[i + 1];
    }

    private static long zzp(Object obj, long j) {
        return ((Long) zzwj.zzf(obj, j)).longValue();
    }

    private final zzvi zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzvi zzviVar = (zzvi) objArr[i3];
        if (zzviVar != null) {
            return zzviVar;
        }
        zzvi zzb2 = zzvf.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzs(Class cls, String str) {
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

    private final void zzt(Object obj, Object obj2, int i) {
        if (!zzy(obj2, i)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzo = zzo(i) & 1048575;
        Object object = unsafe.getObject(obj2, zzo);
        if (object != null) {
            zzvi zzq = zzq(i);
            if (!zzy(obj, i)) {
                if (!zzB(object)) {
                    unsafe.putObject(obj, zzo, object);
                } else {
                    Object zzc = zzq.zzc();
                    zzq.zze(zzc, object);
                    unsafe.putObject(obj, zzo, zzc);
                }
                zzv(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzo);
            if (!zzB(object2)) {
                Object zzc2 = zzq.zzc();
                zzq.zze(zzc2, object2);
                unsafe.putObject(obj, zzo, zzc2);
                object2 = zzc2;
            }
            zzq.zze(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
    }

    private final void zzu(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (!zzC(obj2, i2, i)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzo = zzo(i) & 1048575;
        Object object = unsafe.getObject(obj2, zzo);
        if (object != null) {
            zzvi zzq = zzq(i);
            if (!zzC(obj, i2, i)) {
                if (!zzB(object)) {
                    unsafe.putObject(obj, zzo, object);
                } else {
                    Object zzc = zzq.zzc();
                    zzq.zze(zzc, object);
                    unsafe.putObject(obj, zzo, zzc);
                }
                zzw(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzo);
            if (!zzB(object2)) {
                Object zzc2 = zzq.zzc();
                zzq.zze(zzc2, object2);
                unsafe.putObject(obj, zzo, zzc2);
                object2 = zzc2;
            }
            zzq.zze(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
    }

    private final void zzv(Object obj, int i) {
        int zzm = zzm(i);
        long j = 1048575 & zzm;
        if (j == 1048575) {
            return;
        }
        zzwj.zzq(obj, j, (1 << (zzm >>> 20)) | zzwj.zzc(obj, j));
    }

    private final void zzw(Object obj, int i, int i2) {
        zzwj.zzq(obj, zzm(i2) & 1048575, i);
    }

    private final boolean zzx(Object obj, Object obj2, int i) {
        if (zzy(obj, i) == zzy(obj2, i)) {
            return true;
        }
        return false;
    }

    private final boolean zzy(Object obj, int i) {
        int zzm = zzm(i);
        long j = zzm & 1048575;
        if (j == 1048575) {
            int zzo = zzo(i);
            long j2 = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzwj.zza(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzwj.zzb(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzwj.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzwj.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzwj.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzwj.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzwj.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzwj.zzw(obj, j2);
                case 8:
                    Object zzf = zzwj.zzf(obj, j2);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzsu) {
                        if (zzsu.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzwj.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzsu.zzb.equals(zzwj.zzf(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzwj.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzwj.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzwj.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzwj.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzwj.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzwj.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzwj.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzwj.zzc(obj, j) & (1 << (zzm >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzz(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzy(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.zzvi
    public final int zza(Object obj) {
        int i;
        int i2;
        zzva<T> zzvaVar;
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzh;
        int zzx7;
        int zzx8;
        int size;
        int zzl;
        int zzx9;
        int zzx10;
        int zzx11;
        int i3;
        int zzx12;
        int zzx13;
        zzva<T> zzvaVar2 = this;
        Unsafe unsafe = zzb;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        int i8 = 1048575;
        boolean z = 0;
        while (i5 < zzvaVar2.zzc.length) {
            int zzo = zzvaVar2.zzo(i5);
            int zzn = zzn(zzo);
            int[] iArr = zzvaVar2.zzc;
            int i9 = iArr[i5];
            int i10 = iArr[i5 + 2];
            int i11 = i10 & i7;
            if (zzn <= 17) {
                if (i11 != i8) {
                    if (i11 == i7) {
                        i4 = z;
                    } else {
                        i4 = unsafe.getInt(obj, i11);
                    }
                    i8 = i11;
                }
                i2 = 1 << (i10 >>> 20);
                i = i4;
            } else {
                i = i4;
                i2 = z;
            }
            int i12 = i8;
            int i13 = zzo & i7;
            if (zzn >= zztk.zzJ.zza()) {
                zztk.zzW.zza();
            }
            long j = i13;
            switch (zzn) {
                case 0:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        zzx = zztc.zzx(i9 << 3);
                        zzh = zzx + 8;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        zzx2 = zztc.zzx(i9 << 3);
                        zzh = zzx2 + 4;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        zzy = zztc.zzy(unsafe.getLong(obj, j));
                        zzx3 = zztc.zzx(i9 << 3);
                        zzh = zzx3 + zzy;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        zzy = zztc.zzy(unsafe.getLong(obj, j));
                        zzx3 = zztc.zzx(i9 << 3);
                        zzh = zzx3 + zzy;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        zzy = zztc.zzu(unsafe.getInt(obj, j));
                        zzx3 = zztc.zzx(i9 << 3);
                        zzh = zzx3 + zzy;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        zzx = zztc.zzx(i9 << 3);
                        zzh = zzx + 8;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        zzx2 = zztc.zzx(i9 << 3);
                        zzh = zzx2 + 4;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        zzx4 = zztc.zzx(i9 << 3);
                        zzh = zzx4 + 1;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    zzvaVar = this;
                    if (!zzz(obj, i5, i12, i, i2)) {
                        break;
                    } else {
                        int i14 = i9 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzsu) {
                            int i15 = zztc.zzb;
                            int zzd = ((zzsu) object).zzd();
                            zzx5 = zztc.zzx(zzd) + zzd;
                            zzx6 = zztc.zzx(i14);
                            zzh = zzx6 + zzx5;
                            i6 += zzh;
                            break;
                        } else {
                            zzy = zztc.zzw((String) object);
                            zzx3 = zztc.zzx(i14);
                            zzh = zzx3 + zzy;
                            i6 += zzh;
                        }
                    }
                case 9:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        zzh = zzvk.zzh(i9, unsafe.getObject(obj, j), zzvaVar.zzq(i5));
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        int i16 = zztc.zzb;
                        int zzd2 = ((zzsu) unsafe.getObject(obj, j)).zzd();
                        zzx5 = zztc.zzx(zzd2) + zzd2;
                        zzx6 = zztc.zzx(i9 << 3);
                        zzh = zzx6 + zzx5;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        zzy = zztc.zzx(unsafe.getInt(obj, j));
                        zzx3 = zztc.zzx(i9 << 3);
                        zzh = zzx3 + zzy;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        zzy = zztc.zzu(unsafe.getInt(obj, j));
                        zzx3 = zztc.zzx(i9 << 3);
                        zzh = zzx3 + zzy;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        zzx2 = zztc.zzx(i9 << 3);
                        zzh = zzx2 + 4;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        zzx = zztc.zzx(i9 << 3);
                        zzh = zzx + 8;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        int i17 = unsafe.getInt(obj, j);
                        zzx7 = zztc.zzx(i9 << 3);
                        zzx8 = zztc.zzx((i17 >> 31) ^ (i17 + i17));
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzx7 = zztc.zzx(i9 << 3);
                        zzx8 = zztc.zzy((j2 >> 63) ^ (j2 + j2));
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzvaVar = this;
                    if (zzz(obj, i5, i12, i, i2)) {
                        zzh = zztc.zzt(i9, (zzux) unsafe.getObject(obj, j), zzvaVar.zzq(i5));
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzvaVar = this;
                    zzh = zzvk.zzd(i9, (List) unsafe.getObject(obj, j), z);
                    i6 += zzh;
                    break;
                case 19:
                    zzvaVar = this;
                    zzh = zzvk.zzb(i9, (List) unsafe.getObject(obj, j), z);
                    i6 += zzh;
                    break;
                case 20:
                    zzvaVar = this;
                    List list = (List) unsafe.getObject(obj, j);
                    int i18 = zzvk.zza;
                    i3 = z;
                    if (list.size() != 0) {
                        i3 = (zztc.zzx(i9 << 3) * list.size()) + zzvk.zzg(list);
                    }
                    i6 += i3;
                    break;
                case 21:
                    zzvaVar = this;
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i19 = zzvk.zza;
                    size = list2.size();
                    i3 = z;
                    if (size != 0) {
                        zzl = zzvk.zzl(list2);
                        zzx9 = zztc.zzx(i9 << 3);
                        i3 = (zzx9 * size) + zzl;
                    }
                    i6 += i3;
                    break;
                case 22:
                    zzvaVar = this;
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i20 = zzvk.zza;
                    size = list3.size();
                    i3 = z;
                    if (size != 0) {
                        zzl = zzvk.zzf(list3);
                        zzx9 = zztc.zzx(i9 << 3);
                        i3 = (zzx9 * size) + zzl;
                    }
                    i6 += i3;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzvaVar = this;
                    zzh = zzvk.zzd(i9, (List) unsafe.getObject(obj, j), z);
                    i6 += zzh;
                    break;
                case 24:
                    zzvaVar = this;
                    zzh = zzvk.zzb(i9, (List) unsafe.getObject(obj, j), z);
                    i6 += zzh;
                    break;
                case 25:
                    zzvaVar = this;
                    int i21 = zzvk.zza;
                    int size2 = ((List) unsafe.getObject(obj, j)).size();
                    i3 = z;
                    if (size2 != 0) {
                        i3 = (zztc.zzx(i9 << 3) + 1) * size2;
                    }
                    i6 += i3;
                    break;
                case 26:
                    zzvaVar = this;
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i22 = zzvk.zza;
                    int size3 = list4.size();
                    i3 = z;
                    if (size3 != 0) {
                        boolean z2 = list4 instanceof zzuf;
                        zzx10 = zztc.zzx(i9 << 3) * size3;
                        if (z2) {
                            zzuf zzufVar = (zzuf) list4;
                            for (int i23 = z; i23 < size3; i23++) {
                                Object zze = zzufVar.zze(i23);
                                if (zze instanceof zzsu) {
                                    int zzd3 = ((zzsu) zze).zzd();
                                    zzx10 = zztc.zzx(zzd3) + zzd3 + zzx10;
                                } else {
                                    zzx10 = zztc.zzw((String) zze) + zzx10;
                                }
                            }
                        } else {
                            for (int i24 = z; i24 < size3; i24++) {
                                Object obj2 = list4.get(i24);
                                if (obj2 instanceof zzsu) {
                                    int zzd4 = ((zzsu) obj2).zzd();
                                    zzx10 = zztc.zzx(zzd4) + zzd4 + zzx10;
                                } else {
                                    zzx10 = zztc.zzw((String) obj2) + zzx10;
                                }
                            }
                        }
                        i3 = zzx10;
                    }
                    i6 += i3;
                    break;
                case 27:
                    zzvaVar = this;
                    List list5 = (List) unsafe.getObject(obj, j);
                    zzvi zzq = zzvaVar.zzq(i5);
                    int i25 = zzvk.zza;
                    int size4 = list5.size();
                    i3 = z;
                    if (size4 != 0) {
                        zzx11 = zztc.zzx(i9 << 3) * size4;
                        for (int i26 = z; i26 < size4; i26++) {
                            Object obj3 = list5.get(i26);
                            if (obj3 instanceof zzud) {
                                int zza2 = ((zzud) obj3).zza();
                                zzx11 = zztc.zzx(zza2) + zza2 + zzx11;
                            } else {
                                zzx11 = zztc.zzv((zzux) obj3, zzq) + zzx11;
                            }
                        }
                        i3 = zzx11;
                    }
                    i6 += i3;
                    break;
                case 28:
                    zzvaVar = this;
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i27 = zzvk.zza;
                    int size5 = list6.size();
                    i3 = z;
                    if (size5 != 0) {
                        zzx10 = zztc.zzx(i9 << 3) * size5;
                        for (int i28 = z; i28 < list6.size(); i28++) {
                            int zzd5 = ((zzsu) list6.get(i28)).zzd();
                            zzx10 += zztc.zzx(zzd5) + zzd5;
                        }
                        i3 = zzx10;
                    }
                    i6 += i3;
                    break;
                case 29:
                    zzvaVar = this;
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i29 = zzvk.zza;
                    size = list7.size();
                    i3 = z;
                    if (size != 0) {
                        zzl = zzvk.zzk(list7);
                        zzx9 = zztc.zzx(i9 << 3);
                        i3 = (zzx9 * size) + zzl;
                    }
                    i6 += i3;
                    break;
                case 30:
                    zzvaVar = this;
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i30 = zzvk.zza;
                    size = list8.size();
                    i3 = z;
                    if (size != 0) {
                        zzl = zzvk.zza(list8);
                        zzx9 = zztc.zzx(i9 << 3);
                        i3 = (zzx9 * size) + zzl;
                    }
                    i6 += i3;
                    break;
                case 31:
                    zzvaVar = this;
                    zzh = zzvk.zzb(i9, (List) unsafe.getObject(obj, j), z);
                    i6 += zzh;
                    break;
                case 32:
                    zzvaVar = this;
                    zzh = zzvk.zzd(i9, (List) unsafe.getObject(obj, j), z);
                    i6 += zzh;
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    zzvaVar = this;
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i31 = zzvk.zza;
                    size = list9.size();
                    i3 = z;
                    if (size != 0) {
                        zzl = zzvk.zzi(list9);
                        zzx9 = zztc.zzx(i9 << 3);
                        i3 = (zzx9 * size) + zzl;
                    }
                    i6 += i3;
                    break;
                case 34:
                    zzvaVar = this;
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i32 = zzvk.zza;
                    size = list10.size();
                    i3 = z;
                    if (size != 0) {
                        zzl = zzvk.zzj(list10);
                        zzx9 = zztc.zzx(i9 << 3);
                        i3 = (zzx9 * size) + zzl;
                    }
                    i6 += i3;
                    break;
                case 35:
                    zzvaVar = this;
                    zzx7 = zzvk.zze((List) unsafe.getObject(obj, j));
                    if (zzx7 > 0) {
                        zzx12 = zztc.zzx(zzx7);
                        zzx13 = zztc.zzx(i9 << 3);
                        zzx8 = zzx13 + zzx12;
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzvaVar = this;
                    zzx7 = zzvk.zzc((List) unsafe.getObject(obj, j));
                    if (zzx7 > 0) {
                        zzx12 = zztc.zzx(zzx7);
                        zzx13 = zztc.zzx(i9 << 3);
                        zzx8 = zzx13 + zzx12;
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzvaVar = this;
                    zzx7 = zzvk.zzg((List) unsafe.getObject(obj, j));
                    if (zzx7 > 0) {
                        zzx12 = zztc.zzx(zzx7);
                        zzx13 = zztc.zzx(i9 << 3);
                        zzx8 = zzx13 + zzx12;
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzvaVar = this;
                    zzx7 = zzvk.zzl((List) unsafe.getObject(obj, j));
                    if (zzx7 > 0) {
                        zzx12 = zztc.zzx(zzx7);
                        zzx13 = zztc.zzx(i9 << 3);
                        zzx8 = zzx13 + zzx12;
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzvaVar = this;
                    zzx7 = zzvk.zzf((List) unsafe.getObject(obj, j));
                    if (zzx7 > 0) {
                        zzx12 = zztc.zzx(zzx7);
                        zzx13 = zztc.zzx(i9 << 3);
                        zzx8 = zzx13 + zzx12;
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzvaVar = this;
                    zzx7 = zzvk.zze((List) unsafe.getObject(obj, j));
                    if (zzx7 > 0) {
                        zzx12 = zztc.zzx(zzx7);
                        zzx13 = zztc.zzx(i9 << 3);
                        zzx8 = zzx13 + zzx12;
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzvaVar = this;
                    zzx7 = zzvk.zzc((List) unsafe.getObject(obj, j));
                    if (zzx7 > 0) {
                        zzx12 = zztc.zzx(zzx7);
                        zzx13 = zztc.zzx(i9 << 3);
                        zzx8 = zzx13 + zzx12;
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzvaVar = this;
                    int i33 = zzvk.zza;
                    zzx7 = ((List) unsafe.getObject(obj, j)).size();
                    if (zzx7 > 0) {
                        zzx12 = zztc.zzx(zzx7);
                        zzx13 = zztc.zzx(i9 << 3);
                        zzx8 = zzx13 + zzx12;
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzvaVar = this;
                    zzx7 = zzvk.zzk((List) unsafe.getObject(obj, j));
                    if (zzx7 > 0) {
                        zzx12 = zztc.zzx(zzx7);
                        zzx13 = zztc.zzx(i9 << 3);
                        zzx8 = zzx13 + zzx12;
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzvaVar = this;
                    zzx7 = zzvk.zza((List) unsafe.getObject(obj, j));
                    if (zzx7 > 0) {
                        zzx12 = zztc.zzx(zzx7);
                        zzx13 = zztc.zzx(i9 << 3);
                        zzx8 = zzx13 + zzx12;
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzvaVar = this;
                    zzx7 = zzvk.zzc((List) unsafe.getObject(obj, j));
                    if (zzx7 > 0) {
                        zzx12 = zztc.zzx(zzx7);
                        zzx13 = zztc.zzx(i9 << 3);
                        zzx8 = zzx13 + zzx12;
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzvaVar = this;
                    zzx7 = zzvk.zze((List) unsafe.getObject(obj, j));
                    if (zzx7 > 0) {
                        zzx12 = zztc.zzx(zzx7);
                        zzx13 = zztc.zzx(i9 << 3);
                        zzx8 = zzx13 + zzx12;
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzvaVar = this;
                    zzx7 = zzvk.zzi((List) unsafe.getObject(obj, j));
                    if (zzx7 > 0) {
                        zzx12 = zztc.zzx(zzx7);
                        zzx13 = zztc.zzx(i9 << 3);
                        zzx8 = zzx13 + zzx12;
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzvaVar = this;
                    zzx7 = zzvk.zzj((List) unsafe.getObject(obj, j));
                    if (zzx7 > 0) {
                        zzx12 = zztc.zzx(zzx7);
                        zzx13 = zztc.zzx(i9 << 3);
                        zzx8 = zzx13 + zzx12;
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzvaVar = this;
                    List list11 = (List) unsafe.getObject(obj, j);
                    zzvi zzq2 = zzvaVar.zzq(i5);
                    int i34 = zzvk.zza;
                    int size6 = list11.size();
                    i3 = z;
                    if (size6 != 0) {
                        zzx11 = z;
                        for (int i35 = z; i35 < size6; i35++) {
                            zzx11 += zztc.zzt(i9, (zzux) list11.get(i35), zzq2);
                        }
                        i3 = zzx11;
                    }
                    i6 += i3;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    zzvaVar = this;
                    zzur zzurVar = (zzur) unsafe.getObject(obj, j);
                    zzuq zzuqVar = (zzuq) zzvaVar.zzr(i5);
                    if (zzurVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzurVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                        break;
                    }
                case 51:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        zzx = zztc.zzx(i9 << 3);
                        zzh = zzx + 8;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        zzx2 = zztc.zzx(i9 << 3);
                        zzh = zzx2 + 4;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        zzy = zztc.zzy(zzp(obj, j));
                        zzx3 = zztc.zzx(i9 << 3);
                        zzh = zzx3 + zzy;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        zzy = zztc.zzy(zzp(obj, j));
                        zzx3 = zztc.zzx(i9 << 3);
                        zzh = zzx3 + zzy;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        zzy = zztc.zzu(zzl(obj, j));
                        zzx3 = zztc.zzx(i9 << 3);
                        zzh = zzx3 + zzy;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        zzx = zztc.zzx(i9 << 3);
                        zzh = zzx + 8;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        zzx2 = zztc.zzx(i9 << 3);
                        zzh = zzx2 + 4;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        zzx4 = zztc.zzx(i9 << 3);
                        zzh = zzx4 + 1;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    zzvaVar = this;
                    if (!zzvaVar.zzC(obj, i9, i5)) {
                        break;
                    } else {
                        int i36 = i9 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzsu) {
                            int i37 = zztc.zzb;
                            int zzd6 = ((zzsu) object2).zzd();
                            zzx5 = zztc.zzx(zzd6) + zzd6;
                            zzx6 = zztc.zzx(i36);
                            zzh = zzx6 + zzx5;
                            i6 += zzh;
                            break;
                        } else {
                            zzy = zztc.zzw((String) object2);
                            zzx3 = zztc.zzx(i36);
                            zzh = zzx3 + zzy;
                            i6 += zzh;
                        }
                    }
                case 60:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        zzh = zzvk.zzh(i9, unsafe.getObject(obj, j), zzvaVar.zzq(i5));
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        int i38 = zztc.zzb;
                        int zzd7 = ((zzsu) unsafe.getObject(obj, j)).zzd();
                        zzx5 = zztc.zzx(zzd7) + zzd7;
                        zzx6 = zztc.zzx(i9 << 3);
                        zzh = zzx6 + zzx5;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        zzy = zztc.zzx(zzl(obj, j));
                        zzx3 = zztc.zzx(i9 << 3);
                        zzh = zzx3 + zzy;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        zzy = zztc.zzu(zzl(obj, j));
                        zzx3 = zztc.zzx(i9 << 3);
                        zzh = zzx3 + zzy;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        zzx2 = zztc.zzx(i9 << 3);
                        zzh = zzx2 + 4;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        zzx = zztc.zzx(i9 << 3);
                        zzh = zzx + 8;
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        int zzl2 = zzl(obj, j);
                        zzx7 = zztc.zzx(i9 << 3);
                        zzx8 = zztc.zzx((zzl2 >> 31) ^ (zzl2 + zzl2));
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        long zzp = zzp(obj, j);
                        zzx7 = zztc.zzx(i9 << 3);
                        zzx8 = zztc.zzy((zzp >> 63) ^ (zzp + zzp));
                        i6 = zzx8 + zzx7 + i6;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzvaVar = this;
                    if (zzvaVar.zzC(obj, i9, i5)) {
                        zzh = zztc.zzt(i9, (zzux) unsafe.getObject(obj, j), zzvaVar.zzq(i5));
                        i6 += zzh;
                        break;
                    } else {
                        break;
                    }
                default:
                    zzvaVar = this;
                    break;
            }
            i5 += 3;
            z = 0;
            i7 = 1048575;
            i4 = i;
            zzvaVar2 = zzvaVar;
            i8 = i12;
        }
        zzva<T> zzvaVar3 = zzvaVar2;
        zzvz zzvzVar = zzvaVar3.zzj;
        int zza3 = i6 + zzvzVar.zza(zzvzVar.zzc(obj));
        if (!zzvaVar3.zzf) {
            return zza3;
        }
        zzvaVar3.zzk.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzvi
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int zzc;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzo = zzo(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & zzo;
            int zzn = zzn(zzo);
            int i7 = iArr[i5];
            long j = i6;
            int i8 = 37;
            switch (zzn) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzwj.zza(obj, j));
                    byte[] bArr = zzty.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzwj.zzb(obj, j));
                    i4 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzwj.zzd(obj, j);
                    byte[] bArr2 = zzty.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzwj.zzd(obj, j);
                    byte[] bArr3 = zzty.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 4:
                    i = i4 * 53;
                    zzc = zzwj.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzwj.zzd(obj, j);
                    byte[] bArr4 = zzty.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 6:
                    i = i4 * 53;
                    zzc = zzwj.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 7:
                    i2 = i4 * 53;
                    floatToIntBits = zzty.zza(zzwj.zzw(obj, j));
                    i4 = floatToIntBits + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) zzwj.zzf(obj, j)).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object zzf = zzwj.zzf(obj, j);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = zzwj.zzf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 11:
                    i = i4 * 53;
                    zzc = zzwj.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 12:
                    i = i4 * 53;
                    zzc = zzwj.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 13:
                    i = i4 * 53;
                    zzc = zzwj.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzwj.zzd(obj, j);
                    byte[] bArr5 = zzty.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 15:
                    i = i4 * 53;
                    zzc = zzwj.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzwj.zzd(obj, j);
                    byte[] bArr6 = zzty.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object zzf2 = zzwj.zzf(obj, j);
                    if (zzf2 != null) {
                        i8 = zzf2.hashCode();
                    }
                    i4 = i3 + i8;
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
                    i2 = i4 * 53;
                    floatToIntBits = zzwj.zzf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    i2 = i4 * 53;
                    floatToIntBits = zzwj.zzf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 51:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzj(obj, j));
                        byte[] bArr7 = zzty.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzk(obj, j));
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr8 = zzty.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr9 = zzty.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzl(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr10 = zzty.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzl(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzty.zza(zzD(obj, j));
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) zzwj.zzf(obj, j)).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzwj.zzf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzwj.zzf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzl(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzl(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzl(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr11 = zzty.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzl(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr12 = zzty.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzwj.zzf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzj.zzc(obj).hashCode() + (i4 * 53);
        if (!this.zzf) {
            return hashCode;
        }
        this.zzk.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzvi
    public final Object zzc() {
        return ((zztp) this.zze).zzx();
    }

    @Override // com.google.android.gms.internal.cast.zzvi
    public final void zzd(Object obj) {
        if (zzB(obj)) {
            if (obj instanceof zztp) {
                zztp zztpVar = (zztp) obj;
                zztpVar.zzI(Integer.MAX_VALUE);
                zztpVar.zza = 0;
                zztpVar.zzG();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzo = zzo(i);
                int i2 = 1048575 & zzo;
                int zzn = zzn(zzo);
                long j = i2;
                if (zzn != 9) {
                    if (zzn != 60 && zzn != 68) {
                        switch (zzn) {
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
                                this.zzi.zza(obj, j);
                                break;
                            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzur) object).zzb();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzC(obj, this.zzc[i], i)) {
                        zzq(i).zzd(zzb.getObject(obj, j));
                    }
                }
                if (zzy(obj, i)) {
                    zzq(i).zzd(zzb.getObject(obj, j));
                }
            }
            this.zzj.zze(obj);
            if (this.zzf) {
                this.zzk.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzvi
    public final void zze(Object obj, Object obj2) {
        if (zzB(obj)) {
            obj2.getClass();
            for (int i = 0; i < this.zzc.length; i += 3) {
                int zzo = zzo(i);
                int i2 = 1048575 & zzo;
                int[] iArr = this.zzc;
                int zzn = zzn(zzo);
                int i3 = iArr[i];
                long j = i2;
                switch (zzn) {
                    case 0:
                        if (zzy(obj2, i)) {
                            zzwj.zzo(obj, j, zzwj.zza(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzy(obj2, i)) {
                            zzwj.zzp(obj, j, zzwj.zzb(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzy(obj2, i)) {
                            zzwj.zzr(obj, j, zzwj.zzd(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzy(obj2, i)) {
                            zzwj.zzr(obj, j, zzwj.zzd(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzy(obj2, i)) {
                            zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzy(obj2, i)) {
                            zzwj.zzr(obj, j, zzwj.zzd(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzy(obj2, i)) {
                            zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzy(obj2, i)) {
                            zzwj.zzm(obj, j, zzwj.zzw(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzy(obj2, i)) {
                            zzwj.zzs(obj, j, zzwj.zzf(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        zzt(obj, obj2, i);
                        break;
                    case 10:
                        if (zzy(obj2, i)) {
                            zzwj.zzs(obj, j, zzwj.zzf(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzy(obj2, i)) {
                            zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzy(obj2, i)) {
                            zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzy(obj2, i)) {
                            zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzy(obj2, i)) {
                            zzwj.zzr(obj, j, zzwj.zzd(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzy(obj2, i)) {
                            zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzy(obj2, i)) {
                            zzwj.zzr(obj, j, zzwj.zzd(obj2, j));
                            zzv(obj, i);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        zzt(obj, obj2, i);
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
                        this.zzi.zzb(obj, obj2, j);
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        int i4 = zzvk.zza;
                        zzur zzurVar = (zzur) zzwj.zzf(obj, j);
                        zzur zzurVar2 = (zzur) zzwj.zzf(obj2, j);
                        if (!zzurVar2.isEmpty()) {
                            if (!zzurVar.zzd()) {
                                zzurVar = zzurVar.zza();
                            }
                            zzurVar.zzc(zzurVar2);
                        }
                        zzwj.zzs(obj, j, zzurVar);
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
                        if (zzC(obj2, i3, i)) {
                            zzwj.zzs(obj, j, zzwj.zzf(obj2, j));
                            zzw(obj, i3, i);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        zzu(obj, obj2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (zzC(obj2, i3, i)) {
                            zzwj.zzs(obj, j, zzwj.zzf(obj2, j));
                            zzw(obj, i3, i);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        zzu(obj, obj2, i);
                        break;
                }
            }
            zzvk.zzo(this.zzj, obj, obj2);
            if (!this.zzf) {
                return;
            }
            this.zzk.zza(obj2);
            throw null;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    @Override // com.google.android.gms.internal.cast.zzvi
    public final void zzf(Object obj, zzwq zzwqVar) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        if (!this.zzf) {
            int[] iArr = this.zzc;
            Unsafe unsafe = zzb;
            int i5 = 1048575;
            int i6 = 1048575;
            int i7 = 0;
            int i8 = 0;
            while (i8 < iArr.length) {
                int zzo = zzo(i8);
                int[] iArr2 = this.zzc;
                int zzn = zzn(zzo);
                int i9 = iArr2[i8];
                if (zzn <= 17) {
                    int i10 = iArr2[i8 + 2];
                    int i11 = i10 & i5;
                    if (i11 != i6) {
                        if (i11 == i5) {
                            i4 = 0;
                        } else {
                            i4 = unsafe.getInt(obj, i11);
                        }
                        i7 = i4;
                        i6 = i11;
                    }
                    i = i6;
                    i2 = i7;
                    i3 = 1 << (i10 >>> 20);
                } else {
                    i = i6;
                    i2 = i7;
                    i3 = 0;
                }
                long j = zzo & i5;
                switch (zzn) {
                    case 0:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzf(i9, zzwj.zza(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzn(i9, zzwj.zzb(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzs(i9, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzH(i9, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzq(i9, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzl(i9, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzj(i9, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzb(i9, zzwj.zzw(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzE(i9, unsafe.getObject(obj, j), zzwqVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzu(i9, unsafe.getObject(obj, j), zzq(i8));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzd(i9, (zzsu) unsafe.getObject(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzF(i9, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzh(i9, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzv(i9, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzx(i9, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzz(i9, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzB(i9, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzz(obj, i8, i, i2, i3)) {
                            zzwqVar.zzp(i9, unsafe.getObject(obj, j), zzq(i8));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzvk.zzr(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, false);
                        break;
                    case 19:
                        zzvk.zzv(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, false);
                        break;
                    case 20:
                        zzvk.zzx(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, false);
                        break;
                    case 21:
                        zzvk.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, false);
                        break;
                    case 22:
                        zzvk.zzw(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, false);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        zzvk.zzu(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, false);
                        break;
                    case 24:
                        zzvk.zzt(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, false);
                        break;
                    case 25:
                        zzvk.zzq(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, false);
                        break;
                    case 26:
                        int i12 = this.zzc[i8];
                        List list = (List) unsafe.getObject(obj, j);
                        int i13 = zzvk.zza;
                        if (list != null && !list.isEmpty()) {
                            zzwqVar.zzE(i12, list);
                            break;
                        }
                        break;
                    case 27:
                        int i14 = this.zzc[i8];
                        List list2 = (List) unsafe.getObject(obj, j);
                        zzvi zzq = zzq(i8);
                        int i15 = zzvk.zza;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i16 = 0; i16 < list2.size(); i16++) {
                                ((zztd) zzwqVar).zzu(i14, list2.get(i16), zzq);
                            }
                            break;
                        }
                        break;
                    case 28:
                        int i17 = this.zzc[i8];
                        List list3 = (List) unsafe.getObject(obj, j);
                        int i18 = zzvk.zza;
                        if (list3 != null && !list3.isEmpty()) {
                            zzwqVar.zze(i17, list3);
                            break;
                        }
                        break;
                    case 29:
                        zzvk.zzC(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, false);
                        break;
                    case 30:
                        zzvk.zzs(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, false);
                        break;
                    case 31:
                        zzvk.zzy(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, false);
                        break;
                    case 32:
                        zzvk.zzz(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, false);
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        zzvk.zzA(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, false);
                        break;
                    case 34:
                        zzvk.zzB(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, false);
                        break;
                    case 35:
                        zzvk.zzr(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, true);
                        break;
                    case 36:
                        zzvk.zzv(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, true);
                        break;
                    case 37:
                        zzvk.zzx(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, true);
                        break;
                    case 38:
                        zzvk.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, true);
                        break;
                    case 39:
                        zzvk.zzw(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, true);
                        break;
                    case 40:
                        zzvk.zzu(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, true);
                        break;
                    case 41:
                        zzvk.zzt(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, true);
                        break;
                    case 42:
                        zzvk.zzq(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, true);
                        break;
                    case 43:
                        zzvk.zzC(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, true);
                        break;
                    case 44:
                        zzvk.zzs(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, true);
                        break;
                    case 45:
                        zzvk.zzy(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, true);
                        break;
                    case 46:
                        zzvk.zzz(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, true);
                        break;
                    case 47:
                        zzvk.zzA(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, true);
                        break;
                    case 48:
                        zzvk.zzB(this.zzc[i8], (List) unsafe.getObject(obj, j), zzwqVar, true);
                        break;
                    case 49:
                        int i19 = this.zzc[i8];
                        List list4 = (List) unsafe.getObject(obj, j);
                        zzvi zzq2 = zzq(i8);
                        int i20 = zzvk.zza;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i21 = 0; i21 < list4.size(); i21++) {
                                ((zztd) zzwqVar).zzp(i19, list4.get(i21), zzq2);
                            }
                            break;
                        }
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        if (unsafe.getObject(obj, j) != null) {
                            zzuq zzuqVar = (zzuq) zzr(i8);
                            throw null;
                        }
                        break;
                    case 51:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzf(i9, zzj(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzn(i9, zzk(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzs(i9, zzp(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzH(i9, zzp(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzq(i9, zzl(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzl(i9, zzp(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzj(i9, zzl(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzb(i9, zzD(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzC(obj, i9, i8)) {
                            zzE(i9, unsafe.getObject(obj, j), zzwqVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzu(i9, unsafe.getObject(obj, j), zzq(i8));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzd(i9, (zzsu) unsafe.getObject(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzF(i9, zzl(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzh(i9, zzl(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzv(i9, zzl(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzx(i9, zzp(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzz(i9, zzl(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzB(i9, zzp(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzC(obj, i9, i8)) {
                            zzwqVar.zzp(i9, unsafe.getObject(obj, j), zzq(i8));
                            break;
                        } else {
                            break;
                        }
                }
                i8 += 3;
                i6 = i;
                i7 = i2;
                i5 = 1048575;
            }
            zzvz zzvzVar = this.zzj;
            zzvzVar.zzg(zzvzVar.zzc(obj), zzwqVar);
            return;
        }
        this.zzk.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzvi
    public final boolean zzg(Object obj, Object obj2) {
        boolean zzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzo = zzo(i);
            long j = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzx(obj, obj2, i) && Double.doubleToLongBits(zzwj.zza(obj, j)) == Double.doubleToLongBits(zzwj.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzx(obj, obj2, i) && Float.floatToIntBits(zzwj.zzb(obj, j)) == Float.floatToIntBits(zzwj.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzx(obj, obj2, i) && zzwj.zzd(obj, j) == zzwj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzx(obj, obj2, i) && zzwj.zzd(obj, j) == zzwj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzx(obj, obj2, i) && zzwj.zzd(obj, j) == zzwj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzx(obj, obj2, i) && zzwj.zzw(obj, j) == zzwj.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzx(obj, obj2, i) && zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzx(obj, obj2, i) && zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzx(obj, obj2, i) && zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzx(obj, obj2, i) && zzwj.zzd(obj, j) == zzwj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzx(obj, obj2, i) && zzwj.zzd(obj, j) == zzwj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzx(obj, obj2, i) && zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j))) {
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
                    zzE = zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j));
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    zzE = zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j));
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
                    long zzm = zzm(i) & 1048575;
                    if (zzwj.zzc(obj, zzm) == zzwj.zzc(obj2, zzm) && zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!this.zzj.zzc(obj).equals(this.zzj.zzc(obj2))) {
            return false;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzk.zza(obj);
        this.zzk.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzvi
    public final boolean zzh(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzh) {
            int[] iArr = this.zzg;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int zzo = zzo(i6);
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
            if ((268435456 & zzo) != 0 && !zzz(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn != 60 && zzn != 68) {
                        if (zzn != 49) {
                            if (zzn == 50 && !((zzur) zzwj.zzf(obj, zzo & 1048575)).isEmpty()) {
                                zzuq zzuqVar = (zzuq) zzr(i6);
                                throw null;
                            }
                        }
                    } else if (zzC(obj, i7, i6) && !zzA(obj, zzo, zzq(i6))) {
                        return false;
                    }
                }
                List list = (List) zzwj.zzf(obj, zzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzvi zzq = zzq(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzq.zzh(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzz(obj, i6, i, i2, i10) && !zzA(obj, zzo, zzq(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzk.zza(obj);
        throw null;
    }
}
