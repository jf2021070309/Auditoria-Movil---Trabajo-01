package com.google.android.gms.internal.cast_tv;

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
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzjf<T> implements zzjn<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzko.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzjc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzip zzm;
    private final zzke zzn;
    private final zzhi zzo;
    private final zzjh zzp;
    private final zzix zzq;

    private zzjf(int[] iArr, Object[] objArr, int i, int i2, zzjc zzjcVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzjh zzjhVar, zzip zzipVar, zzke zzkeVar, zzhi zzhiVar, zzix zzixVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzhiVar != null && zzhiVar.zzc(zzjcVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzjhVar;
        this.zzm = zzipVar;
        this.zzn = zzkeVar;
        this.zzo = zzhiVar;
        this.zzg = zzjcVar;
        this.zzq = zzixVar;
    }

    private final zzhx zzA(int i) {
        int i2 = i / 3;
        return (zzhx) this.zzd[i2 + i2 + 1];
    }

    private final zzjn zzB(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzjn zzjnVar = (zzjn) this.zzd[i3];
        if (zzjnVar != null) {
            return zzjnVar;
        }
        zzjn zzb2 = zzjk.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzD(Object obj, int i) {
        zzjn zzB = zzB(i);
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
        zzjn zzB = zzB(i2);
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
            zzjn zzB = zzB(i);
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
            zzjn zzB = zzB(i);
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
        zzko.zzq(obj, j, (1 << (zzv >>> 20)) | zzko.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zzko.zzq(obj, zzv(i2) & 1048575, i);
    }

    private final void zzL(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzy(i) & 1048575, obj2);
        zzJ(obj, i);
    }

    private final void zzM(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzy(i2) & 1048575, obj2);
        zzK(obj, i, i2);
    }

    private final void zzN(zzkw zzkwVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzkwVar.zzv(i, ((zziv) zzC(i2)).zzc(), (zziw) obj);
        }
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
                    if (Double.doubleToRawLongBits(zzko.zza(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzko.zzb(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzko.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzko.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzko.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzko.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzko.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzko.zzw(obj, j2);
                case 8:
                    Object zzf = zzko.zzf(obj, j2);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzgu) {
                        if (zzgu.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzko.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzgu.zzb.equals(zzko.zzf(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzko.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzko.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzko.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzko.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzko.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzko.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzko.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzko.zzc(obj, j) & (1 << (zzv >>> 20))) == 0) {
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

    private static boolean zzR(Object obj, int i, zzjn zzjnVar) {
        return zzjnVar.zzk(zzko.zzf(obj, i & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzht) {
            return ((zzht) obj).zzD();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i, int i2) {
        if (zzko.zzc(obj, zzv(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean zzU(Object obj, long j) {
        return ((Boolean) zzko.zzf(obj, j)).booleanValue();
    }

    private static final int zzV(byte[] bArr, int i, int i2, zzku zzkuVar, Class cls, zzgg zzggVar) throws IOException {
        boolean z;
        zzku zzkuVar2 = zzku.zza;
        switch (zzkuVar.ordinal()) {
            case 0:
                zzggVar.zzc = Double.valueOf(Double.longBitsToDouble(zzgh.zzq(bArr, i)));
                return i + 8;
            case 1:
                zzggVar.zzc = Float.valueOf(Float.intBitsToFloat(zzgh.zzb(bArr, i)));
                return i + 4;
            case 2:
            case 3:
                int zzm = zzgh.zzm(bArr, i, zzggVar);
                zzggVar.zzc = Long.valueOf(zzggVar.zzb);
                return zzm;
            case 4:
            case 12:
            case 13:
                int zzj = zzgh.zzj(bArr, i, zzggVar);
                zzggVar.zzc = Integer.valueOf(zzggVar.zza);
                return zzj;
            case 5:
            case 15:
                zzggVar.zzc = Long.valueOf(zzgh.zzq(bArr, i));
                return i + 8;
            case 6:
            case 14:
                zzggVar.zzc = Integer.valueOf(zzgh.zzb(bArr, i));
                return i + 4;
            case 7:
                int zzm2 = zzgh.zzm(bArr, i, zzggVar);
                if (zzggVar.zzb != 0) {
                    z = true;
                } else {
                    z = false;
                }
                zzggVar.zzc = Boolean.valueOf(z);
                return zzm2;
            case 8:
                return zzgh.zzh(bArr, i, zzggVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzgh.zzd(zzjk.zza().zzb(cls), bArr, i, i2, zzggVar);
            case 11:
                return zzgh.zza(bArr, i, zzggVar);
            case 16:
                int zzj2 = zzgh.zzj(bArr, i, zzggVar);
                zzggVar.zzc = Integer.valueOf(zzgy.zzb(zzggVar.zza));
                return zzj2;
            case 17:
                int zzm3 = zzgh.zzm(bArr, i, zzggVar);
                zzggVar.zzc = Long.valueOf(zzgy.zzc(zzggVar.zzb));
                return zzm3;
        }
    }

    private static final void zzW(int i, Object obj, zzkw zzkwVar) throws IOException {
        if (obj instanceof String) {
            zzkwVar.zzG(i, (String) obj);
        } else {
            zzkwVar.zzd(i, (zzgu) obj);
        }
    }

    public static zzkf zzd(Object obj) {
        zzht zzhtVar = (zzht) obj;
        zzkf zzkfVar = zzhtVar.zzc;
        if (zzkfVar == zzkf.zzc()) {
            zzkf zzf = zzkf.zzf();
            zzhtVar.zzc = zzf;
            return zzf;
        }
        return zzkfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.cast_tv.zzjf zzl(java.lang.Class r31, com.google.android.gms.internal.cast_tv.zziz r32, com.google.android.gms.internal.cast_tv.zzjh r33, com.google.android.gms.internal.cast_tv.zzip r34, com.google.android.gms.internal.cast_tv.zzke r35, com.google.android.gms.internal.cast_tv.zzhi r36, com.google.android.gms.internal.cast_tv.zzix r37) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast_tv.zzjf.zzl(java.lang.Class, com.google.android.gms.internal.cast_tv.zziz, com.google.android.gms.internal.cast_tv.zzjh, com.google.android.gms.internal.cast_tv.zzip, com.google.android.gms.internal.cast_tv.zzke, com.google.android.gms.internal.cast_tv.zzhi, com.google.android.gms.internal.cast_tv.zzix):com.google.android.gms.internal.cast_tv.zzjf");
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzko.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzko.zzf(obj, j)).floatValue();
    }

    private final int zzo(Object obj) {
        int i;
        int zzy;
        int zzy2;
        int zzz;
        int zzy3;
        int i2;
        int i3;
        int zzy4;
        int zzy5;
        int zzy6;
        int zzn;
        int zzy7;
        int zzy8;
        int zzh;
        int zzy9;
        int zzy10;
        int i4;
        int zzz2;
        int zzy11;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i8 < this.zzc.length) {
            int zzy12 = zzy(i8);
            int[] iArr = this.zzc;
            int i10 = iArr[i8];
            int zzx = zzx(zzy12);
            if (zzx <= 17) {
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
            long j = i5 & zzy12;
            switch (zzx) {
                case 0:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzy = zzhc.zzy(i10 << 3);
                        zzn = zzy + 8;
                        i7 += zzn;
                        break;
                    }
                case 1:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzy2 = zzhc.zzy(i10 << 3);
                        zzn = zzy2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 2:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzz = zzhc.zzz(unsafe.getLong(obj, j));
                        zzy3 = zzhc.zzy(i10 << 3);
                        int i14 = zzz;
                        i2 = zzy3;
                        i3 = i14;
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 3:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzz = zzhc.zzz(unsafe.getLong(obj, j));
                        zzy3 = zzhc.zzy(i10 << 3);
                        int i142 = zzz;
                        i2 = zzy3;
                        i3 = i142;
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 4:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i3 = zzhc.zzv(unsafe.getInt(obj, j));
                        i2 = zzhc.zzy(i10 << 3);
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 5:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzy = zzhc.zzy(i10 << 3);
                        zzn = zzy + 8;
                        i7 += zzn;
                        break;
                    }
                case 6:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzy2 = zzhc.zzy(i10 << 3);
                        zzn = zzy2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 7:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzy4 = zzhc.zzy(i10 << 3);
                        zzn = zzy4 + 1;
                        i7 += zzn;
                        break;
                    }
                case 8:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgu) {
                            int i15 = zzhc.zzb;
                            int zzd = ((zzgu) object).zzd();
                            zzy5 = zzd + zzhc.zzy(zzd);
                            zzy6 = zzhc.zzy(i10 << 3);
                            zzn = zzy5 + zzy6;
                            i7 += zzn;
                            break;
                        } else {
                            i3 = zzhc.zzx((String) object);
                            i2 = zzhc.zzy(i10 << 3);
                            i7 = i2 + i3 + i7;
                            break;
                        }
                    }
                case 9:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzn = zzjp.zzn(i10, unsafe.getObject(obj, j), zzB(i8));
                        i7 += zzn;
                        break;
                    }
                case 10:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i16 = zzhc.zzb;
                        int zzd2 = ((zzgu) unsafe.getObject(obj, j)).zzd();
                        zzy5 = zzd2 + zzhc.zzy(zzd2);
                        zzy6 = zzhc.zzy(i10 << 3);
                        zzn = zzy5 + zzy6;
                        i7 += zzn;
                        break;
                    }
                case 11:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i3 = zzhc.zzy(unsafe.getInt(obj, j));
                        i2 = zzhc.zzy(i10 << 3);
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 12:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i3 = zzhc.zzv(unsafe.getInt(obj, j));
                        i2 = zzhc.zzy(i10 << 3);
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 13:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzy2 = zzhc.zzy(i10 << 3);
                        zzn = zzy2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 14:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzy = zzhc.zzy(i10 << 3);
                        zzn = zzy + 8;
                        i7 += zzn;
                        break;
                    }
                case 15:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i17 = unsafe.getInt(obj, j);
                        zzy7 = zzhc.zzy(i10 << 3);
                        zzy8 = zzhc.zzy((i17 >> 31) ^ (i17 + i17));
                        zzn = zzy8 + zzy7;
                        i7 += zzn;
                        break;
                    }
                case 16:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzy5 = zzhc.zzy(i10 << 3);
                        zzy6 = zzhc.zzz((j2 >> 63) ^ (j2 + j2));
                        zzn = zzy5 + zzy6;
                        i7 += zzn;
                        break;
                    }
                case 17:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzn = zzhc.zzu(i10, (zzjc) unsafe.getObject(obj, j), zzB(i8));
                        i7 += zzn;
                        break;
                    }
                case 18:
                    zzn = zzjp.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 19:
                    zzn = zzjp.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 20:
                    zzn = zzjp.zzl(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 21:
                    zzn = zzjp.zzw(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 22:
                    zzn = zzjp.zzj(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzn = zzjp.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 24:
                    zzn = zzjp.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 25:
                    zzn = zzjp.zza(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 26:
                    zzn = zzjp.zzt(i10, (List) unsafe.getObject(obj, j));
                    i7 += zzn;
                    break;
                case 27:
                    zzn = zzjp.zzo(i10, (List) unsafe.getObject(obj, j), zzB(i8));
                    i7 += zzn;
                    break;
                case 28:
                    zzn = zzjp.zzb(i10, (List) unsafe.getObject(obj, j));
                    i7 += zzn;
                    break;
                case 29:
                    zzn = zzjp.zzu(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 30:
                    zzn = zzjp.zzc(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 31:
                    zzn = zzjp.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 32:
                    zzn = zzjp.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    zzn = zzjp.zzp(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 34:
                    zzn = zzjp.zzr(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 35:
                    zzh = zzjp.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzy9 = zzhc.zzy(zzh);
                        zzy10 = zzhc.zzy(i10 << 3);
                        i4 = zzy10 + zzy9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 36:
                    zzh = zzjp.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzy9 = zzhc.zzy(zzh);
                        zzy10 = zzhc.zzy(i10 << 3);
                        i4 = zzy10 + zzy9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 37:
                    zzh = zzjp.zzm((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzy9 = zzhc.zzy(zzh);
                        zzy10 = zzhc.zzy(i10 << 3);
                        i4 = zzy10 + zzy9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 38:
                    zzh = zzjp.zzx((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzy9 = zzhc.zzy(zzh);
                        zzy10 = zzhc.zzy(i10 << 3);
                        i4 = zzy10 + zzy9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 39:
                    zzh = zzjp.zzk((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzy9 = zzhc.zzy(zzh);
                        zzy10 = zzhc.zzy(i10 << 3);
                        i4 = zzy10 + zzy9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 40:
                    zzh = zzjp.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzy9 = zzhc.zzy(zzh);
                        zzy10 = zzhc.zzy(i10 << 3);
                        i4 = zzy10 + zzy9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 41:
                    zzh = zzjp.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzy9 = zzhc.zzy(zzh);
                        zzy10 = zzhc.zzy(i10 << 3);
                        i4 = zzy10 + zzy9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 42:
                    int i18 = zzjp.zza;
                    zzh = ((List) unsafe.getObject(obj, j)).size();
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzy9 = zzhc.zzy(zzh);
                        zzy10 = zzhc.zzy(i10 << 3);
                        i4 = zzy10 + zzy9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 43:
                    zzh = zzjp.zzv((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzy9 = zzhc.zzy(zzh);
                        zzy10 = zzhc.zzy(i10 << 3);
                        i4 = zzy10 + zzy9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 44:
                    zzh = zzjp.zzd((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzy9 = zzhc.zzy(zzh);
                        zzy10 = zzhc.zzy(i10 << 3);
                        i4 = zzy10 + zzy9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 45:
                    zzh = zzjp.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzy9 = zzhc.zzy(zzh);
                        zzy10 = zzhc.zzy(i10 << 3);
                        i4 = zzy10 + zzy9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 46:
                    zzh = zzjp.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzy9 = zzhc.zzy(zzh);
                        zzy10 = zzhc.zzy(i10 << 3);
                        i4 = zzy10 + zzy9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 47:
                    zzh = zzjp.zzq((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzy9 = zzhc.zzy(zzh);
                        zzy10 = zzhc.zzy(i10 << 3);
                        i4 = zzy10 + zzy9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 48:
                    zzh = zzjp.zzs((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzy9 = zzhc.zzy(zzh);
                        zzy10 = zzhc.zzy(i10 << 3);
                        i4 = zzy10 + zzy9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 49:
                    zzn = zzjp.zzi(i10, (List) unsafe.getObject(obj, j), zzB(i8));
                    i7 += zzn;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    zzn = zzix.zza(i10, unsafe.getObject(obj, j), zzC(i8));
                    i7 += zzn;
                    break;
                case 51:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzy = zzhc.zzy(i10 << 3);
                        zzn = zzy + 8;
                        i7 += zzn;
                        break;
                    }
                case 52:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzy2 = zzhc.zzy(i10 << 3);
                        zzn = zzy2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 53:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzz2 = zzhc.zzz(zzz(obj, j));
                        zzy11 = zzhc.zzy(i10 << 3);
                        int i19 = zzz2;
                        i4 = zzy11;
                        zzh = i19;
                        i7 += i4 + zzh;
                        break;
                    }
                case 54:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzz2 = zzhc.zzz(zzz(obj, j));
                        zzy11 = zzhc.zzy(i10 << 3);
                        int i192 = zzz2;
                        i4 = zzy11;
                        zzh = i192;
                        i7 += i4 + zzh;
                        break;
                    }
                case 55:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzh = zzhc.zzv(zzp(obj, j));
                        i4 = zzhc.zzy(i10 << 3);
                        i7 += i4 + zzh;
                        break;
                    }
                case 56:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzy = zzhc.zzy(i10 << 3);
                        zzn = zzy + 8;
                        i7 += zzn;
                        break;
                    }
                case 57:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzy2 = zzhc.zzy(i10 << 3);
                        zzn = zzy2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 58:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzy4 = zzhc.zzy(i10 << 3);
                        zzn = zzy4 + 1;
                        i7 += zzn;
                        break;
                    }
                case 59:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgu) {
                            int i20 = zzhc.zzb;
                            int zzd3 = ((zzgu) object2).zzd();
                            zzy5 = zzd3 + zzhc.zzy(zzd3);
                            zzy6 = zzhc.zzy(i10 << 3);
                            zzn = zzy5 + zzy6;
                            i7 += zzn;
                            break;
                        } else {
                            zzh = zzhc.zzx((String) object2);
                            i4 = zzhc.zzy(i10 << 3);
                            i7 += i4 + zzh;
                            break;
                        }
                    }
                case 60:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzn = zzjp.zzn(i10, unsafe.getObject(obj, j), zzB(i8));
                        i7 += zzn;
                        break;
                    }
                case 61:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        int i21 = zzhc.zzb;
                        int zzd4 = ((zzgu) unsafe.getObject(obj, j)).zzd();
                        zzy5 = zzd4 + zzhc.zzy(zzd4);
                        zzy6 = zzhc.zzy(i10 << 3);
                        zzn = zzy5 + zzy6;
                        i7 += zzn;
                        break;
                    }
                case 62:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzh = zzhc.zzy(zzp(obj, j));
                        i4 = zzhc.zzy(i10 << 3);
                        i7 += i4 + zzh;
                        break;
                    }
                case 63:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzh = zzhc.zzv(zzp(obj, j));
                        i4 = zzhc.zzy(i10 << 3);
                        i7 += i4 + zzh;
                        break;
                    }
                case 64:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzy2 = zzhc.zzy(i10 << 3);
                        zzn = zzy2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 65:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzy = zzhc.zzy(i10 << 3);
                        zzn = zzy + 8;
                        i7 += zzn;
                        break;
                    }
                case 66:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        int zzp = zzp(obj, j);
                        zzy7 = zzhc.zzy(i10 << 3);
                        zzy8 = zzhc.zzy((zzp >> 31) ^ (zzp + zzp));
                        zzn = zzy8 + zzy7;
                        i7 += zzn;
                        break;
                    }
                case 67:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        long zzz3 = zzz(obj, j);
                        zzy5 = zzhc.zzy(i10 << 3);
                        zzy6 = zzhc.zzz((zzz3 >> 63) ^ (zzz3 + zzz3));
                        zzn = zzy5 + zzy6;
                        i7 += zzn;
                        break;
                    }
                case 68:
                    if (!zzT(obj, i10, i8)) {
                        break;
                    } else {
                        zzn = zzhc.zzu(i10, (zzjc) unsafe.getObject(obj, j), zzB(i8));
                        i7 += zzn;
                        break;
                    }
            }
            i8 += 3;
            i5 = 1048575;
        }
        zzke zzkeVar = this.zzn;
        int zza2 = i7 + zzkeVar.zza(zzkeVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzko.zzf(obj, j)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    private final int zzq(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzgg zzggVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zziw) object).zze()) {
            zziw zzb2 = zziw.zza().zzb();
            zzix.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
            object = zzb2;
        }
        zziu zzc = ((zziv) zzC).zzc();
        zziw zziwVar = (zziw) object;
        int zzj = zzgh.zzj(bArr, i, zzggVar);
        int i4 = zzggVar.zza;
        if (i4 >= 0 && i4 <= i2 - zzj) {
            int i5 = zzj + i4;
            Object obj2 = zzc.zzb;
            Object obj3 = zzc.zzd;
            while (zzj < i5) {
                int i6 = zzj + 1;
                byte b = bArr[zzj];
                if (b < 0) {
                    i6 = zzgh.zzk(b, bArr, i6, zzggVar);
                    b = zzggVar.zza;
                }
                int i7 = b & 7;
                int i8 = b >>> 3;
                if (i8 != 1) {
                    if (i8 == 2 && i7 == zzc.zzc.zza()) {
                        zzj = zzV(bArr, i6, i2, zzc.zzc, zzc.zzd.getClass(), zzggVar);
                        obj3 = zzggVar.zzc;
                    }
                    zzj = zzgh.zzp(b, bArr, i6, i2, zzggVar);
                } else if (i7 == zzc.zza.zza()) {
                    zzj = zzV(bArr, i6, i2, zzc.zza, null, zzggVar);
                    obj2 = zzggVar.zzc;
                } else {
                    zzj = zzgh.zzp(b, bArr, i6, i2, zzggVar);
                }
            }
            if (zzj == i5) {
                zziwVar.put(obj2, obj3);
                return i5;
            }
            throw zzie.zze();
        }
        throw zzie.zzg();
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzgg zzggVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzgh.zzq(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzgh.zzb(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzgh.zzm(bArr, i, zzggVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzggVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzgh.zzj(bArr, i, zzggVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzggVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzgh.zzq(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzgh.zzb(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzgh.zzm(bArr, i, zzggVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzggVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzgh.zzj(bArr, i, zzggVar);
                    int i13 = zzggVar.zza;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzkt.zze(bArr, zzj2, zzj2 + i13)) {
                        throw zzie.zzc();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i13, zzic.zzb));
                        zzj2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object zzE = zzE(obj, i4, i8);
                    int zzo = zzgh.zzo(zzE, zzB(i8), bArr, i, i2, zzggVar);
                    zzM(obj, i4, i8, zzE);
                    return zzo;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzgh.zza(bArr, i, zzggVar);
                    unsafe.putObject(obj, j, zzggVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzgh.zzj(bArr, i, zzggVar);
                    int i14 = zzggVar.zza;
                    zzhx zzA = zzA(i8);
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
                    int zzj4 = zzgh.zzj(bArr, i, zzggVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzgy.zzb(zzggVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzgh.zzm(bArr, i, zzggVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzgy.zzc(zzggVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object zzE2 = zzE(obj, i4, i8);
                    int zzn = zzgh.zzn(zzE2, zzB(i8), bArr, i, i2, (i3 & (-8)) | 4, zzggVar);
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
    private final int zzs(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.cast_tv.zzgg r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast_tv.zzjf.zzs(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.cast_tv.zzgg):int");
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
        return ((Long) zzko.zzf(obj, j)).longValue();
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjn
    public final int zza(Object obj) {
        int zzy;
        int zzy2;
        int zzz;
        int zzy3;
        int zzy4;
        int zzy5;
        int zzy6;
        int zzn;
        int zzy7;
        int zzy8;
        int zzy9;
        int zzy10;
        if (this.zzi) {
            Unsafe unsafe = zzb;
            int i = 0;
            for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
                int zzy11 = zzy(i2);
                int zzx = zzx(zzy11);
                int i3 = this.zzc[i2];
                int i4 = zzy11 & 1048575;
                if (zzx >= zzhn.zzJ.zza() && zzx <= zzhn.zzW.zza()) {
                    int i5 = this.zzc[i2 + 2];
                }
                long j = i4;
                switch (zzx) {
                    case 0:
                        if (zzP(obj, i2)) {
                            zzy = zzhc.zzy(i3 << 3);
                            zzn = zzy + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i2)) {
                            zzy2 = zzhc.zzy(i3 << 3);
                            zzn = zzy2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i2)) {
                            zzz = zzhc.zzz(zzko.zzd(obj, j));
                            zzy3 = zzhc.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i2)) {
                            zzz = zzhc.zzz(zzko.zzd(obj, j));
                            zzy3 = zzhc.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i2)) {
                            zzz = zzhc.zzv(zzko.zzc(obj, j));
                            zzy3 = zzhc.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i2)) {
                            zzy = zzhc.zzy(i3 << 3);
                            zzn = zzy + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i2)) {
                            zzy2 = zzhc.zzy(i3 << 3);
                            zzn = zzy2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i2)) {
                            zzy4 = zzhc.zzy(i3 << 3);
                            zzn = zzy4 + 1;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzP(obj, i2)) {
                            Object zzf = zzko.zzf(obj, j);
                            if (zzf instanceof zzgu) {
                                int i6 = i3 << 3;
                                int i7 = zzhc.zzb;
                                int zzd = ((zzgu) zzf).zzd();
                                zzy5 = zzhc.zzy(zzd) + zzd;
                                zzy6 = zzhc.zzy(i6);
                                zzn = zzy6 + zzy5;
                                i += zzn;
                                break;
                            } else {
                                zzz = zzhc.zzx((String) zzf);
                                zzy3 = zzhc.zzy(i3 << 3);
                                i += zzy3 + zzz;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (zzP(obj, i2)) {
                            zzn = zzjp.zzn(i3, zzko.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzP(obj, i2)) {
                            int i8 = i3 << 3;
                            int i9 = zzhc.zzb;
                            int zzd2 = ((zzgu) zzko.zzf(obj, j)).zzd();
                            zzy5 = zzhc.zzy(zzd2) + zzd2;
                            zzy6 = zzhc.zzy(i8);
                            zzn = zzy6 + zzy5;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzP(obj, i2)) {
                            zzz = zzhc.zzy(zzko.zzc(obj, j));
                            zzy3 = zzhc.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i2)) {
                            zzz = zzhc.zzv(zzko.zzc(obj, j));
                            zzy3 = zzhc.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i2)) {
                            zzy2 = zzhc.zzy(i3 << 3);
                            zzn = zzy2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i2)) {
                            zzy = zzhc.zzy(i3 << 3);
                            zzn = zzy + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i2)) {
                            int zzc = zzko.zzc(obj, j);
                            zzy7 = zzhc.zzy(i3 << 3);
                            zzy8 = zzhc.zzy((zzc >> 31) ^ (zzc + zzc));
                            zzn = zzy8 + zzy7;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i2)) {
                            long zzd3 = zzko.zzd(obj, j);
                            zzz = zzhc.zzy(i3 << 3);
                            zzy3 = zzhc.zzz((zzd3 + zzd3) ^ (zzd3 >> 63));
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzP(obj, i2)) {
                            zzn = zzhc.zzu(i3, (zzjc) zzko.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzn = zzjp.zzg(i3, (List) zzko.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 19:
                        zzn = zzjp.zze(i3, (List) zzko.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 20:
                        zzn = zzjp.zzl(i3, (List) zzko.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 21:
                        zzn = zzjp.zzw(i3, (List) zzko.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 22:
                        zzn = zzjp.zzj(i3, (List) zzko.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        zzn = zzjp.zzg(i3, (List) zzko.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 24:
                        zzn = zzjp.zze(i3, (List) zzko.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 25:
                        zzn = zzjp.zza(i3, (List) zzko.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 26:
                        zzn = zzjp.zzt(i3, (List) zzko.zzf(obj, j));
                        i += zzn;
                        break;
                    case 27:
                        zzn = zzjp.zzo(i3, (List) zzko.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    case 28:
                        zzn = zzjp.zzb(i3, (List) zzko.zzf(obj, j));
                        i += zzn;
                        break;
                    case 29:
                        zzn = zzjp.zzu(i3, (List) zzko.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 30:
                        zzn = zzjp.zzc(i3, (List) zzko.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 31:
                        zzn = zzjp.zze(i3, (List) zzko.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 32:
                        zzn = zzjp.zzg(i3, (List) zzko.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        zzn = zzjp.zzp(i3, (List) zzko.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 34:
                        zzn = zzjp.zzr(i3, (List) zzko.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 35:
                        zzz = zzjp.zzh((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i10 = i3 << 3;
                            zzy9 = zzhc.zzy(zzz);
                            zzy10 = zzhc.zzy(i10);
                            zzy3 = zzy10 + zzy9;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        zzz = zzjp.zzf((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i11 = i3 << 3;
                            zzy9 = zzhc.zzy(zzz);
                            zzy10 = zzhc.zzy(i11);
                            zzy3 = zzy10 + zzy9;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        zzz = zzjp.zzm((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i12 = i3 << 3;
                            zzy9 = zzhc.zzy(zzz);
                            zzy10 = zzhc.zzy(i12);
                            zzy3 = zzy10 + zzy9;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        zzz = zzjp.zzx((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i13 = i3 << 3;
                            zzy9 = zzhc.zzy(zzz);
                            zzy10 = zzhc.zzy(i13);
                            zzy3 = zzy10 + zzy9;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        zzz = zzjp.zzk((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i14 = i3 << 3;
                            zzy9 = zzhc.zzy(zzz);
                            zzy10 = zzhc.zzy(i14);
                            zzy3 = zzy10 + zzy9;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        zzz = zzjp.zzh((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i15 = i3 << 3;
                            zzy9 = zzhc.zzy(zzz);
                            zzy10 = zzhc.zzy(i15);
                            zzy3 = zzy10 + zzy9;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        zzz = zzjp.zzf((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i16 = i3 << 3;
                            zzy9 = zzhc.zzy(zzz);
                            zzy10 = zzhc.zzy(i16);
                            zzy3 = zzy10 + zzy9;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        int i17 = zzjp.zza;
                        zzz = ((List) unsafe.getObject(obj, j)).size();
                        if (zzz > 0) {
                            int i18 = i3 << 3;
                            zzy9 = zzhc.zzy(zzz);
                            zzy10 = zzhc.zzy(i18);
                            zzy3 = zzy10 + zzy9;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        zzz = zzjp.zzv((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i19 = i3 << 3;
                            zzy9 = zzhc.zzy(zzz);
                            zzy10 = zzhc.zzy(i19);
                            zzy3 = zzy10 + zzy9;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        zzz = zzjp.zzd((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i20 = i3 << 3;
                            zzy9 = zzhc.zzy(zzz);
                            zzy10 = zzhc.zzy(i20);
                            zzy3 = zzy10 + zzy9;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        zzz = zzjp.zzf((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i21 = i3 << 3;
                            zzy9 = zzhc.zzy(zzz);
                            zzy10 = zzhc.zzy(i21);
                            zzy3 = zzy10 + zzy9;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        zzz = zzjp.zzh((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i22 = i3 << 3;
                            zzy9 = zzhc.zzy(zzz);
                            zzy10 = zzhc.zzy(i22);
                            zzy3 = zzy10 + zzy9;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        zzz = zzjp.zzq((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i23 = i3 << 3;
                            zzy9 = zzhc.zzy(zzz);
                            zzy10 = zzhc.zzy(i23);
                            zzy3 = zzy10 + zzy9;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        zzz = zzjp.zzs((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i24 = i3 << 3;
                            zzy9 = zzhc.zzy(zzz);
                            zzy10 = zzhc.zzy(i24);
                            zzy3 = zzy10 + zzy9;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        zzn = zzjp.zzi(i3, (List) zzko.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        zzn = zzix.zza(i3, zzko.zzf(obj, j), zzC(i2));
                        i += zzn;
                        break;
                    case 51:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzhc.zzy(i3 << 3);
                            zzn = zzy + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i3, i2)) {
                            zzy2 = zzhc.zzy(i3 << 3);
                            zzn = zzy2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i3, i2)) {
                            zzz = zzhc.zzz(zzz(obj, j));
                            zzy3 = zzhc.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i3, i2)) {
                            zzz = zzhc.zzz(zzz(obj, j));
                            zzy3 = zzhc.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i3, i2)) {
                            zzz = zzhc.zzv(zzp(obj, j));
                            zzy3 = zzhc.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzhc.zzy(i3 << 3);
                            zzn = zzy + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i3, i2)) {
                            zzy2 = zzhc.zzy(i3 << 3);
                            zzn = zzy2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i3, i2)) {
                            zzy4 = zzhc.zzy(i3 << 3);
                            zzn = zzy4 + 1;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i3, i2)) {
                            Object zzf2 = zzko.zzf(obj, j);
                            if (zzf2 instanceof zzgu) {
                                int i25 = i3 << 3;
                                int i26 = zzhc.zzb;
                                int zzd4 = ((zzgu) zzf2).zzd();
                                zzy5 = zzhc.zzy(zzd4) + zzd4;
                                zzy6 = zzhc.zzy(i25);
                                zzn = zzy6 + zzy5;
                                i += zzn;
                                break;
                            } else {
                                zzz = zzhc.zzx((String) zzf2);
                                zzy3 = zzhc.zzy(i3 << 3);
                                i += zzy3 + zzz;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (zzT(obj, i3, i2)) {
                            zzn = zzjp.zzn(i3, zzko.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzT(obj, i3, i2)) {
                            int i27 = i3 << 3;
                            int i28 = zzhc.zzb;
                            int zzd5 = ((zzgu) zzko.zzf(obj, j)).zzd();
                            zzy5 = zzhc.zzy(zzd5) + zzd5;
                            zzy6 = zzhc.zzy(i27);
                            zzn = zzy6 + zzy5;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzT(obj, i3, i2)) {
                            zzz = zzhc.zzy(zzp(obj, j));
                            zzy3 = zzhc.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i3, i2)) {
                            zzz = zzhc.zzv(zzp(obj, j));
                            zzy3 = zzhc.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i3, i2)) {
                            zzy2 = zzhc.zzy(i3 << 3);
                            zzn = zzy2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzhc.zzy(i3 << 3);
                            zzn = zzy + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i3, i2)) {
                            int zzp = zzp(obj, j);
                            zzy7 = zzhc.zzy(i3 << 3);
                            zzy8 = zzhc.zzy((zzp >> 31) ^ (zzp + zzp));
                            zzn = zzy8 + zzy7;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i3, i2)) {
                            long zzz2 = zzz(obj, j);
                            zzz = zzhc.zzy(i3 << 3);
                            zzy3 = zzhc.zzz((zzz2 + zzz2) ^ (zzz2 >> 63));
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i3, i2)) {
                            zzn = zzhc.zzu(i3, (zzjc) zzko.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzke zzkeVar = this.zzn;
            return i + zzkeVar.zza(zzkeVar.zzd(obj));
        }
        return zzo(obj);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjn
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
                    doubleToLongBits = Double.doubleToLongBits(zzko.zza(obj, j));
                    byte[] bArr = zzic.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 1:
                    i2 = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(zzko.zzb(obj, j));
                    i3 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = zzko.zzd(obj, j);
                    byte[] bArr2 = zzic.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = zzko.zzd(obj, j);
                    byte[] bArr3 = zzic.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 4:
                    i = i3 * 53;
                    zzc = zzko.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = zzko.zzd(obj, j);
                    byte[] bArr4 = zzic.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 6:
                    i = i3 * 53;
                    zzc = zzko.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 7:
                    i2 = i3 * 53;
                    floatToIntBits = zzic.zza(zzko.zzw(obj, j));
                    i3 = floatToIntBits + i2;
                    break;
                case 8:
                    i2 = i3 * 53;
                    floatToIntBits = ((String) zzko.zzf(obj, j)).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case 9:
                    Object zzf = zzko.zzf(obj, j);
                    if (zzf != null) {
                        i6 = zzf.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    floatToIntBits = zzko.zzf(obj, j).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case 11:
                    i = i3 * 53;
                    zzc = zzko.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 12:
                    i = i3 * 53;
                    zzc = zzko.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 13:
                    i = i3 * 53;
                    zzc = zzko.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = zzko.zzd(obj, j);
                    byte[] bArr5 = zzic.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 15:
                    i = i3 * 53;
                    zzc = zzko.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = zzko.zzd(obj, j);
                    byte[] bArr6 = zzic.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 17:
                    Object zzf2 = zzko.zzf(obj, j);
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
                    floatToIntBits = zzko.zzf(obj, j).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    i2 = i3 * 53;
                    floatToIntBits = zzko.zzf(obj, j).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case 51:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzic.zzd;
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
                        byte[] bArr8 = zzic.zzd;
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
                        byte[] bArr9 = zzic.zzd;
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
                        byte[] bArr10 = zzic.zzd;
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
                        floatToIntBits = zzic.zza(zzU(obj, j));
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = ((String) zzko.zzf(obj, j)).hashCode();
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzko.zzf(obj, j).hashCode();
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzko.zzf(obj, j).hashCode();
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
                        byte[] bArr11 = zzic.zzd;
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
                        byte[] bArr12 = zzic.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzko.zzf(obj, j).hashCode();
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

    /* JADX WARN: Code restructure failed: missing block: B:139:0x03db, code lost:
        r2 = 1048575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03de, code lost:
        if (r6 == 1048575) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03e0, code lost:
        r27.putInt(r9, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03e6, code lost:
        r3 = r8.zzk;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03ec, code lost:
        if (r3 >= r8.zzl) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03ee, code lost:
        r6 = r8.zzj[r3];
        r7 = r8.zzn;
        r10 = r8.zzc[r6];
        r11 = com.google.android.gms.internal.cast_tv.zzko.zzf(r9, r8.zzy(r6) & r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0402, code lost:
        if (r11 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0404, code lost:
        r12 = r8.zzA(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0408, code lost:
        if (r12 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x040a, code lost:
        r6 = ((com.google.android.gms.internal.cast_tv.zziv) r8.zzC(r6)).zzc();
        r11 = ((com.google.android.gms.internal.cast_tv.zziw) r11).entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0422, code lost:
        if (r11.hasNext() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0424, code lost:
        r13 = (java.util.Map.Entry) r11.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0438, code lost:
        if (r12.zza(((java.lang.Integer) r13.getValue()).intValue()) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x043a, code lost:
        if (r5 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x043c, code lost:
        r5 = r7.zzc(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0440, code lost:
        r14 = com.google.android.gms.internal.cast_tv.zziv.zzb(r6, r13.getKey(), r13.getValue());
        r15 = com.google.android.gms.internal.cast_tv.zzgu.zzb;
        r15 = new byte[r14];
        r14 = com.google.android.gms.internal.cast_tv.zzhc.zzA(r15, 0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0455, code lost:
        com.google.android.gms.internal.cast_tv.zziv.zze(r14, r6, r13.getKey(), r13.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0460, code lost:
        r7.zzf(r5, r10, com.google.android.gms.internal.cast_tv.zzgp.zza(r14, r15));
        r11.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x046e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0474, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0475, code lost:
        r3 = r3 + 1;
        r2 = 1048575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x047c, code lost:
        if (r5 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x047e, code lost:
        r8.zzn.zzi(r9, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0483, code lost:
        if (r0 != 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0487, code lost:
        if (r1 != r33) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x048e, code lost:
        throw com.google.android.gms.internal.cast_tv.zzie.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0491, code lost:
        if (r1 > r33) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0493, code lost:
        if (r4 != r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0495, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x049a, code lost:
        throw com.google.android.gms.internal.cast_tv.zzie.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.cast_tv.zzgg r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast_tv.zzjf.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.cast_tv.zzgg):int");
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjn
    public final Object zze() {
        return ((zzht) this.zzg).zzs();
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjn
    public final void zzf(Object obj) {
        if (!zzS(obj)) {
            return;
        }
        if (obj instanceof zzht) {
            zzht zzhtVar = (zzht) obj;
            zzhtVar.zzB(Integer.MAX_VALUE);
            zzhtVar.zza = 0;
            zzhtVar.zzz();
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
                                ((zziw) object).zzc();
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
        this.zzn.zzh(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjn
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
                        zzko.zzo(obj, j, zzko.zza(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i)) {
                        zzko.zzp(obj, j, zzko.zzb(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj2, i)) {
                        zzko.zzr(obj, j, zzko.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj2, i)) {
                        zzko.zzr(obj, j, zzko.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj2, i)) {
                        zzko.zzq(obj, j, zzko.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj2, i)) {
                        zzko.zzr(obj, j, zzko.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj2, i)) {
                        zzko.zzq(obj, j, zzko.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj2, i)) {
                        zzko.zzm(obj, j, zzko.zzw(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj2, i)) {
                        zzko.zzs(obj, j, zzko.zzf(obj2, j));
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
                        zzko.zzs(obj, j, zzko.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj2, i)) {
                        zzko.zzq(obj, j, zzko.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj2, i)) {
                        zzko.zzq(obj, j, zzko.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj2, i)) {
                        zzko.zzq(obj, j, zzko.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj2, i)) {
                        zzko.zzr(obj, j, zzko.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj2, i)) {
                        zzko.zzq(obj, j, zzko.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj2, i)) {
                        zzko.zzr(obj, j, zzko.zzd(obj2, j));
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
                    int i3 = zzjp.zza;
                    zzko.zzs(obj, j, zzix.zzb(zzko.zzf(obj, j), zzko.zzf(obj2, j)));
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
                        zzko.zzs(obj, j, zzko.zzf(obj2, j));
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
                        zzko.zzs(obj, j, zzko.zzf(obj2, j));
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
        zzjp.zzC(this.zzn, obj, obj2);
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
    @Override // com.google.android.gms.internal.cast_tv.zzjn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.cast_tv.zzgg r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast_tv.zzjf.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.cast_tv.zzgg):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.cast_tv.zzjn
    public final void zzi(Object obj, zzkw zzkwVar) throws IOException {
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
                                zzkwVar.zzf(i7, zzko.zza(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzo(i7, zzko.zzb(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzt(i7, zzko.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzK(i7, zzko.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzr(i7, zzko.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzm(i7, zzko.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzk(i7, zzko.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzb(i7, zzko.zzw(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzP(obj, i6)) {
                                zzW(i7, zzko.zzf(obj, zzy & 1048575), zzkwVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzw(i7, zzko.zzf(obj, zzy & 1048575), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzd(i7, (zzgu) zzko.zzf(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzI(i7, zzko.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzi(i7, zzko.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzx(i7, zzko.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzz(i7, zzko.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzB(i7, zzko.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzD(i7, zzko.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzP(obj, i6)) {
                                zzkwVar.zzq(i7, zzko.zzf(obj, zzy & 1048575), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzjp.zzG(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, false);
                            break;
                        case 19:
                            zzjp.zzK(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, false);
                            break;
                        case 20:
                            zzjp.zzN(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, false);
                            break;
                        case 21:
                            zzjp.zzV(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, false);
                            break;
                        case 22:
                            zzjp.zzM(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, false);
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            zzjp.zzJ(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, false);
                            break;
                        case 24:
                            zzjp.zzI(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, false);
                            break;
                        case 25:
                            zzjp.zzE(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, false);
                            break;
                        case 26:
                            zzjp.zzT(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar);
                            break;
                        case 27:
                            zzjp.zzO(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, zzB(i6));
                            break;
                        case 28:
                            zzjp.zzF(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar);
                            break;
                        case 29:
                            zzjp.zzU(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, false);
                            break;
                        case 30:
                            zzjp.zzH(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, false);
                            break;
                        case 31:
                            zzjp.zzP(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, false);
                            break;
                        case 32:
                            zzjp.zzQ(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, false);
                            break;
                        case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                            zzjp.zzR(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, false);
                            break;
                        case 34:
                            zzjp.zzS(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, false);
                            break;
                        case 35:
                            zzjp.zzG(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, true);
                            break;
                        case 36:
                            zzjp.zzK(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, true);
                            break;
                        case 37:
                            zzjp.zzN(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, true);
                            break;
                        case 38:
                            zzjp.zzV(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, true);
                            break;
                        case 39:
                            zzjp.zzM(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, true);
                            break;
                        case 40:
                            zzjp.zzJ(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, true);
                            break;
                        case 41:
                            zzjp.zzI(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, true);
                            break;
                        case 42:
                            zzjp.zzE(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, true);
                            break;
                        case 43:
                            zzjp.zzU(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, true);
                            break;
                        case 44:
                            zzjp.zzH(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, true);
                            break;
                        case 45:
                            zzjp.zzP(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, true);
                            break;
                        case 46:
                            zzjp.zzQ(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, true);
                            break;
                        case 47:
                            zzjp.zzR(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, true);
                            break;
                        case 48:
                            zzjp.zzS(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, true);
                            break;
                        case 49:
                            zzjp.zzL(i7, (List) zzko.zzf(obj, zzy & 1048575), zzkwVar, zzB(i6));
                            break;
                        case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                            zzN(zzkwVar, i7, zzko.zzf(obj, zzy & 1048575), i6);
                            break;
                        case 51:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzf(i7, zzm(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzo(i7, zzn(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzt(i7, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzK(i7, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzr(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzm(i7, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzk(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzb(i7, zzU(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzT(obj, i7, i6)) {
                                zzW(i7, zzko.zzf(obj, zzy & 1048575), zzkwVar);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzw(i7, zzko.zzf(obj, zzy & 1048575), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzd(i7, (zzgu) zzko.zzf(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzI(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzi(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzx(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzz(i7, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzB(i7, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzD(i7, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzT(obj, i7, i6)) {
                                zzkwVar.zzq(i7, zzko.zzf(obj, zzy & 1048575), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zzke zzkeVar = this.zzn;
                zzkeVar.zzk(zzkeVar.zzd(obj), zzkwVar);
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
                            zzkwVar.zzf(i11, zzko.zza(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzo(i11, zzko.zzb(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzt(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzK(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzr(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzm(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzk(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzb(i11, zzko.zzw(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzW(i11, unsafe.getObject(obj, j), zzkwVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzw(i11, unsafe.getObject(obj, j), zzB(i8));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzd(i11, (zzgu) unsafe.getObject(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzI(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzi(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzx(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzz(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzB(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzD(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzkwVar.zzq(i11, unsafe.getObject(obj, j), zzB(i8));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i2 = 0;
                        zzjp.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, false);
                        break;
                    case 19:
                        i2 = 0;
                        zzjp.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, false);
                        break;
                    case 20:
                        i2 = 0;
                        zzjp.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, false);
                        break;
                    case 21:
                        i2 = 0;
                        zzjp.zzV(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, false);
                        break;
                    case 22:
                        i2 = 0;
                        zzjp.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, false);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        i2 = 0;
                        zzjp.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, false);
                        break;
                    case 24:
                        i2 = 0;
                        zzjp.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, false);
                        break;
                    case 25:
                        i2 = 0;
                        zzjp.zzE(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, false);
                        break;
                    case 26:
                        zzjp.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar);
                        i2 = 0;
                        break;
                    case 27:
                        zzjp.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, zzB(i8));
                        i2 = 0;
                        break;
                    case 28:
                        zzjp.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar);
                        i2 = 0;
                        break;
                    case 29:
                        i3 = 0;
                        zzjp.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, false);
                        i2 = i3;
                        break;
                    case 30:
                        i3 = 0;
                        zzjp.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, false);
                        i2 = i3;
                        break;
                    case 31:
                        i3 = 0;
                        zzjp.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, false);
                        i2 = i3;
                        break;
                    case 32:
                        i3 = 0;
                        zzjp.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, false);
                        i2 = i3;
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        i3 = 0;
                        zzjp.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, false);
                        i2 = i3;
                        break;
                    case 34:
                        i3 = 0;
                        zzjp.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, false);
                        i2 = i3;
                        break;
                    case 35:
                        zzjp.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, true);
                        i2 = 0;
                        break;
                    case 36:
                        zzjp.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, true);
                        i2 = 0;
                        break;
                    case 37:
                        zzjp.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, true);
                        i2 = 0;
                        break;
                    case 38:
                        zzjp.zzV(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, true);
                        i2 = 0;
                        break;
                    case 39:
                        zzjp.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, true);
                        i2 = 0;
                        break;
                    case 40:
                        zzjp.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, true);
                        i2 = 0;
                        break;
                    case 41:
                        zzjp.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, true);
                        i2 = 0;
                        break;
                    case 42:
                        zzjp.zzE(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, true);
                        i2 = 0;
                        break;
                    case 43:
                        zzjp.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, true);
                        i2 = 0;
                        break;
                    case 44:
                        zzjp.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, true);
                        i2 = 0;
                        break;
                    case 45:
                        zzjp.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, true);
                        i2 = 0;
                        break;
                    case 46:
                        zzjp.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, true);
                        i2 = 0;
                        break;
                    case 47:
                        zzjp.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, true);
                        i2 = 0;
                        break;
                    case 48:
                        zzjp.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, true);
                        i2 = 0;
                        break;
                    case 49:
                        zzjp.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzkwVar, zzB(i8));
                        i2 = 0;
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        zzN(zzkwVar, i11, unsafe.getObject(obj, j), i8);
                        i2 = 0;
                        break;
                    case 51:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzf(i11, zzm(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 52:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzo(i11, zzn(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 53:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzt(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 54:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzK(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 55:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzr(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 56:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzm(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 57:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzk(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 58:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzb(i11, zzU(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 59:
                        if (zzT(obj, i11, i8)) {
                            zzW(i11, unsafe.getObject(obj, j), zzkwVar);
                        }
                        i2 = 0;
                        break;
                    case 60:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzw(i11, unsafe.getObject(obj, j), zzB(i8));
                        }
                        i2 = 0;
                        break;
                    case 61:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzd(i11, (zzgu) unsafe.getObject(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 62:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzI(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 63:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzi(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 64:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzx(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 65:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzz(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 66:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzB(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 67:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzD(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 68:
                        if (zzT(obj, i11, i8)) {
                            zzkwVar.zzq(i11, unsafe.getObject(obj, j), zzB(i8));
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
            zzke zzkeVar2 = this.zzn;
            zzkeVar2.zzk(zzkeVar2.zzd(obj), zzkwVar);
        } else {
            this.zzo.zza(obj);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjn
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzW;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzy = zzy(i);
            long j = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (zzO(obj, obj2, i) && Double.doubleToLongBits(zzko.zza(obj, j)) == Double.doubleToLongBits(zzko.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i) && Float.floatToIntBits(zzko.zzb(obj, j)) == Float.floatToIntBits(zzko.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i) && zzko.zzd(obj, j) == zzko.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i) && zzko.zzd(obj, j) == zzko.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i) && zzko.zzc(obj, j) == zzko.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i) && zzko.zzd(obj, j) == zzko.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i) && zzko.zzc(obj, j) == zzko.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i) && zzko.zzw(obj, j) == zzko.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i) && zzjp.zzW(zzko.zzf(obj, j), zzko.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i) && zzjp.zzW(zzko.zzf(obj, j), zzko.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i) && zzjp.zzW(zzko.zzf(obj, j), zzko.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i) && zzko.zzc(obj, j) == zzko.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i) && zzko.zzc(obj, j) == zzko.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i) && zzko.zzc(obj, j) == zzko.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i) && zzko.zzd(obj, j) == zzko.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i) && zzko.zzc(obj, j) == zzko.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i) && zzko.zzd(obj, j) == zzko.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i) && zzjp.zzW(zzko.zzf(obj, j), zzko.zzf(obj2, j))) {
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
                    zzW = zzjp.zzW(zzko.zzf(obj, j), zzko.zzf(obj2, j));
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    zzW = zzjp.zzW(zzko.zzf(obj, j), zzko.zzf(obj2, j));
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
                    if (zzko.zzc(obj, zzv) == zzko.zzc(obj2, zzv) && zzjp.zzW(zzko.zzf(obj, j), zzko.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzW) {
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

    @Override // com.google.android.gms.internal.cast_tv.zzjn
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (true) {
            zzjn zzjnVar = null;
            if (i4 < this.zzk) {
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
                                if (zzx != 50) {
                                    continue;
                                } else {
                                    zziw zziwVar = (zziw) zzko.zzf(obj, zzy & 1048575);
                                    if (!zziwVar.isEmpty() && ((zziv) zzC(i6)).zzc().zzc.zzb() == zzkv.MESSAGE) {
                                        for (Object obj2 : zziwVar.values()) {
                                            if (zzjnVar == null) {
                                                zzjnVar = zzjk.zza().zzb(obj2.getClass());
                                            }
                                            if (!zzjnVar.zzk(obj2)) {
                                                return false;
                                            }
                                        }
                                        continue;
                                    }
                                }
                            }
                        } else if (zzT(obj, i7, i6) && !zzR(obj, zzy, zzB(i6))) {
                            return false;
                        }
                    }
                    List list = (List) zzko.zzf(obj, zzy & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        zzjn zzB = zzB(i6);
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
            } else if (!this.zzh) {
                return true;
            } else {
                this.zzo.zza(obj);
                throw null;
            }
        }
    }
}
