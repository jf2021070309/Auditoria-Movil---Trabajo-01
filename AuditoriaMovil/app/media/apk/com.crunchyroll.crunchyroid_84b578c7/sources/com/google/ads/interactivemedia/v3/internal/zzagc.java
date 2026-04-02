package com.google.ads.interactivemedia.v3.internal;

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
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzagc<T> implements zzags<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzaht.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzafz zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzafn zzn;
    private final zzahj zzo;
    private final zzaeg zzp;
    private final zzage zzq;
    private final zzafu zzr;

    private zzagc(int[] iArr, Object[] objArr, int i, int i2, zzafz zzafzVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzage zzageVar, zzafn zzafnVar, zzahj zzahjVar, zzaeg zzaegVar, zzafu zzafuVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzafzVar instanceof zzaet;
        this.zzj = z;
        boolean z3 = false;
        if (zzaegVar != null && zzaegVar.zzh(zzafzVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzq = zzageVar;
        this.zzn = zzafnVar;
        this.zzo = zzahjVar;
        this.zzp = zzaegVar;
        this.zzg = zzafzVar;
        this.zzr = zzafuVar;
    }

    private static long zzA(Object obj, long j) {
        return ((Long) zzaht.zzf(obj, j)).longValue();
    }

    private final zzaex zzB(int i) {
        int i2 = i / 3;
        return (zzaex) this.zzd[i2 + i2 + 1];
    }

    private final zzags zzC(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzags zzagsVar = (zzags) this.zzd[i3];
        if (zzagsVar != null) {
            return zzagsVar;
        }
        zzags zzb2 = zzagh.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzD(Object obj, int i, Object obj2, zzahj zzahjVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzf = zzaht.zzf(obj, zzz(i) & 1048575);
        if (zzf == null) {
            return obj2;
        }
        if (zzB(i) == null) {
            return obj2;
        }
        zzaft zzaftVar = (zzaft) zzf;
        zzafs zzafsVar = (zzafs) zzE(i);
        throw null;
    }

    private final Object zzE(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzF(Object obj, int i) {
        zzags zzC = zzC(i);
        int zzz = zzz(i) & 1048575;
        if (!zzT(obj, i)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, zzz);
        if (zzW(object)) {
            return object;
        }
        Object zze = zzC.zze();
        if (object != null) {
            zzC.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzG(Object obj, int i, int i2) {
        zzags zzC = zzC(i2);
        if (!zzX(obj, i, i2)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, zzz(i2) & 1048575);
        if (zzW(object)) {
            return object;
        }
        Object zze = zzC.zze();
        if (object != null) {
            zzC.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzH(Class cls, String str) {
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

    private static void zzI(Object obj) {
        if (zzW(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzJ(Object obj, Object obj2, int i) {
        if (!zzT(obj2, i)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzz = zzz(i) & 1048575;
        Object object = unsafe.getObject(obj2, zzz);
        if (object != null) {
            zzags zzC = zzC(i);
            if (!zzT(obj, i)) {
                if (!zzW(object)) {
                    unsafe.putObject(obj, zzz, object);
                } else {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, zzz, zze);
                }
                zzM(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzz);
            if (!zzW(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, zzz, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
    }

    private final void zzK(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (!zzX(obj2, i2, i)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzz = zzz(i) & 1048575;
        Object object = unsafe.getObject(obj2, zzz);
        if (object != null) {
            zzags zzC = zzC(i);
            if (!zzX(obj, i2, i)) {
                if (!zzW(object)) {
                    unsafe.putObject(obj, zzz, object);
                } else {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, zzz, zze);
                }
                zzN(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzz);
            if (!zzW(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, zzz, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
    }

    private final void zzL(Object obj, int i, zzagk zzagkVar) throws IOException {
        if (zzS(i)) {
            zzaht.zzs(obj, i & 1048575, zzagkVar.zzs());
        } else if (this.zzi) {
            zzaht.zzs(obj, i & 1048575, zzagkVar.zzr());
        } else {
            zzaht.zzs(obj, i & 1048575, zzagkVar.zzp());
        }
    }

    private final void zzM(Object obj, int i) {
        int zzw = zzw(i);
        long j = 1048575 & zzw;
        if (j == 1048575) {
            return;
        }
        zzaht.zzq(obj, j, (1 << (zzw >>> 20)) | zzaht.zzc(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzaht.zzq(obj, zzw(i2) & 1048575, i);
    }

    private final void zzO(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzz(i) & 1048575, obj2);
        zzM(obj, i);
    }

    private final void zzP(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzz(i2) & 1048575, obj2);
        zzN(obj, i, i2);
    }

    private final void zzQ(zzaib zzaibVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzafs zzafsVar = (zzafs) zzE(i2);
        throw null;
    }

    private final boolean zzR(Object obj, Object obj2, int i) {
        if (zzT(obj, i) == zzT(obj2, i)) {
            return true;
        }
        return false;
    }

    private static boolean zzS(int i) {
        if ((i & 536870912) != 0) {
            return true;
        }
        return false;
    }

    private final boolean zzT(Object obj, int i) {
        int zzw = zzw(i);
        long j = zzw & 1048575;
        if (j == 1048575) {
            int zzz = zzz(i);
            long j2 = zzz & 1048575;
            switch (zzy(zzz)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzaht.zza(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzaht.zzb(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzaht.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzaht.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzaht.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzaht.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzaht.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzaht.zzw(obj, j2);
                case 8:
                    Object zzf = zzaht.zzf(obj, j2);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzadr) {
                        if (zzadr.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzaht.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzadr.zzb.equals(zzaht.zzf(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzaht.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzaht.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzaht.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzaht.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzaht.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzaht.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzaht.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzaht.zzc(obj, j) & (1 << (zzw >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzU(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzT(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzV(Object obj, int i, zzags zzagsVar) {
        return zzagsVar.zzl(zzaht.zzf(obj, i & 1048575));
    }

    private static boolean zzW(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzaet) {
            return ((zzaet) obj).zzaQ();
        }
        return true;
    }

    private final boolean zzX(Object obj, int i, int i2) {
        if (zzaht.zzc(obj, zzw(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean zzY(Object obj, long j) {
        return ((Boolean) zzaht.zzf(obj, j)).booleanValue();
    }

    private static final void zzZ(int i, Object obj, zzaib zzaibVar) throws IOException {
        if (obj instanceof String) {
            zzaibVar.zzF(i, (String) obj);
        } else {
            zzaibVar.zzd(i, (zzadr) obj);
        }
    }

    public static zzahk zzd(Object obj) {
        zzaet zzaetVar = (zzaet) obj;
        zzahk zzahkVar = zzaetVar.zzc;
        if (zzahkVar == zzahk.zzc()) {
            zzahk zzf = zzahk.zzf();
            zzaetVar.zzc = zzf;
            return zzf;
        }
        return zzahkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.ads.interactivemedia.v3.internal.zzagc zzm(java.lang.Class r31, com.google.ads.interactivemedia.v3.internal.zzafw r32, com.google.ads.interactivemedia.v3.internal.zzage r33, com.google.ads.interactivemedia.v3.internal.zzafn r34, com.google.ads.interactivemedia.v3.internal.zzahj r35, com.google.ads.interactivemedia.v3.internal.zzaeg r36, com.google.ads.interactivemedia.v3.internal.zzafu r37) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzagc.zzm(java.lang.Class, com.google.ads.interactivemedia.v3.internal.zzafw, com.google.ads.interactivemedia.v3.internal.zzage, com.google.ads.interactivemedia.v3.internal.zzafn, com.google.ads.interactivemedia.v3.internal.zzahj, com.google.ads.interactivemedia.v3.internal.zzaeg, com.google.ads.interactivemedia.v3.internal.zzafu):com.google.ads.interactivemedia.v3.internal.zzagc");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzaht.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzaht.zzf(obj, j)).floatValue();
    }

    private final int zzp(Object obj) {
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
            int zzz = zzz(i8);
            int[] iArr = this.zzc;
            int i10 = iArr[i8];
            int zzy3 = zzy(zzz);
            if (zzy3 <= 17) {
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
            long j = i5 & zzz;
            switch (zzy3) {
                case 0:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx = zzaea.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 1:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzaea.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 2:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzy = zzaea.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzaea.zzx(i10 << 3);
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
                        zzy = zzaea.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzaea.zzx(i10 << 3);
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
                        i3 = zzaea.zzu(unsafe.getInt(obj, j));
                        i2 = zzaea.zzx(i10 << 3);
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 5:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx = zzaea.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 6:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzaea.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 7:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx4 = zzaea.zzx(i10 << 3);
                        zzn = zzx4 + 1;
                        i7 += zzn;
                        break;
                    }
                case 8:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzadr) {
                            int i15 = zzaea.zzb;
                            int zzd = ((zzadr) object).zzd();
                            zzx5 = zzd + zzaea.zzx(zzd);
                            zzx6 = zzaea.zzx(i10 << 3);
                            zzn = zzx5 + zzx6;
                            i7 += zzn;
                            break;
                        } else {
                            i3 = zzaea.zzw((String) object);
                            i2 = zzaea.zzx(i10 << 3);
                            i7 = i2 + i3 + i7;
                            break;
                        }
                    }
                case 9:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzn = zzagu.zzn(i10, unsafe.getObject(obj, j), zzC(i8));
                        i7 += zzn;
                        break;
                    }
                case 10:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i16 = zzaea.zzb;
                        int zzd2 = ((zzadr) unsafe.getObject(obj, j)).zzd();
                        zzx5 = zzd2 + zzaea.zzx(zzd2);
                        zzx6 = zzaea.zzx(i10 << 3);
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 11:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i3 = zzaea.zzx(unsafe.getInt(obj, j));
                        i2 = zzaea.zzx(i10 << 3);
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 12:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i3 = zzaea.zzu(unsafe.getInt(obj, j));
                        i2 = zzaea.zzx(i10 << 3);
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 13:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzaea.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 14:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzx = zzaea.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 15:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i17 = unsafe.getInt(obj, j);
                        zzx7 = zzaea.zzx(i10 << 3);
                        zzx8 = zzaea.zzx((i17 >> 31) ^ (i17 + i17));
                        zzn = zzx8 + zzx7;
                        i7 += zzn;
                        break;
                    }
                case 16:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzx5 = zzaea.zzx(i10 << 3);
                        zzx6 = zzaea.zzy((j2 >> 63) ^ (j2 + j2));
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 17:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzn = zzaea.zzt(i10, (zzafz) unsafe.getObject(obj, j), zzC(i8));
                        i7 += zzn;
                        break;
                    }
                case 18:
                    zzn = zzagu.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 19:
                    zzn = zzagu.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 20:
                    zzn = zzagu.zzl(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 21:
                    zzn = zzagu.zzw(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 22:
                    zzn = zzagu.zzj(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzn = zzagu.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 24:
                    zzn = zzagu.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 25:
                    zzn = zzagu.zza(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 26:
                    zzn = zzagu.zzt(i10, (List) unsafe.getObject(obj, j));
                    i7 += zzn;
                    break;
                case 27:
                    zzn = zzagu.zzo(i10, (List) unsafe.getObject(obj, j), zzC(i8));
                    i7 += zzn;
                    break;
                case 28:
                    zzn = zzagu.zzb(i10, (List) unsafe.getObject(obj, j));
                    i7 += zzn;
                    break;
                case 29:
                    zzn = zzagu.zzu(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 30:
                    zzn = zzagu.zzc(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 31:
                    zzn = zzagu.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 32:
                    zzn = zzagu.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    zzn = zzagu.zzp(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 34:
                    zzn = zzagu.zzr(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 35:
                    zzh = zzagu.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzaea.zzx(zzh);
                        zzx10 = zzaea.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 36:
                    zzh = zzagu.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzaea.zzx(zzh);
                        zzx10 = zzaea.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 37:
                    zzh = zzagu.zzm((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzaea.zzx(zzh);
                        zzx10 = zzaea.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 38:
                    zzh = zzagu.zzx((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzaea.zzx(zzh);
                        zzx10 = zzaea.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 39:
                    zzh = zzagu.zzk((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzaea.zzx(zzh);
                        zzx10 = zzaea.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 40:
                    zzh = zzagu.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzaea.zzx(zzh);
                        zzx10 = zzaea.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 41:
                    zzh = zzagu.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzaea.zzx(zzh);
                        zzx10 = zzaea.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 42:
                    int i18 = zzagu.zza;
                    zzh = ((List) unsafe.getObject(obj, j)).size();
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzaea.zzx(zzh);
                        zzx10 = zzaea.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 43:
                    zzh = zzagu.zzv((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzaea.zzx(zzh);
                        zzx10 = zzaea.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 44:
                    zzh = zzagu.zzd((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzaea.zzx(zzh);
                        zzx10 = zzaea.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 45:
                    zzh = zzagu.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzaea.zzx(zzh);
                        zzx10 = zzaea.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 46:
                    zzh = zzagu.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzaea.zzx(zzh);
                        zzx10 = zzaea.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 47:
                    zzh = zzagu.zzq((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzaea.zzx(zzh);
                        zzx10 = zzaea.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 48:
                    zzh = zzagu.zzs((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzaea.zzx(zzh);
                        zzx10 = zzaea.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 49:
                    zzn = zzagu.zzi(i10, (List) unsafe.getObject(obj, j), zzC(i8));
                    i7 += zzn;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    zzafu.zza(i10, unsafe.getObject(obj, j), zzE(i8));
                    break;
                case 51:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        zzx = zzaea.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 52:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        zzx2 = zzaea.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 53:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        zzy2 = zzaea.zzy(zzA(obj, j));
                        zzx11 = zzaea.zzx(i10 << 3);
                        int i19 = zzy2;
                        i4 = zzx11;
                        zzh = i19;
                        i7 += i4 + zzh;
                        break;
                    }
                case 54:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        zzy2 = zzaea.zzy(zzA(obj, j));
                        zzx11 = zzaea.zzx(i10 << 3);
                        int i192 = zzy2;
                        i4 = zzx11;
                        zzh = i192;
                        i7 += i4 + zzh;
                        break;
                    }
                case 55:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        zzh = zzaea.zzu(zzq(obj, j));
                        i4 = zzaea.zzx(i10 << 3);
                        i7 += i4 + zzh;
                        break;
                    }
                case 56:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        zzx = zzaea.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 57:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        zzx2 = zzaea.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 58:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        zzx4 = zzaea.zzx(i10 << 3);
                        zzn = zzx4 + 1;
                        i7 += zzn;
                        break;
                    }
                case 59:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzadr) {
                            int i20 = zzaea.zzb;
                            int zzd3 = ((zzadr) object2).zzd();
                            zzx5 = zzd3 + zzaea.zzx(zzd3);
                            zzx6 = zzaea.zzx(i10 << 3);
                            zzn = zzx5 + zzx6;
                            i7 += zzn;
                            break;
                        } else {
                            zzh = zzaea.zzw((String) object2);
                            i4 = zzaea.zzx(i10 << 3);
                            i7 += i4 + zzh;
                            break;
                        }
                    }
                case 60:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        zzn = zzagu.zzn(i10, unsafe.getObject(obj, j), zzC(i8));
                        i7 += zzn;
                        break;
                    }
                case 61:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        int i21 = zzaea.zzb;
                        int zzd4 = ((zzadr) unsafe.getObject(obj, j)).zzd();
                        zzx5 = zzd4 + zzaea.zzx(zzd4);
                        zzx6 = zzaea.zzx(i10 << 3);
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 62:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        zzh = zzaea.zzx(zzq(obj, j));
                        i4 = zzaea.zzx(i10 << 3);
                        i7 += i4 + zzh;
                        break;
                    }
                case 63:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        zzh = zzaea.zzu(zzq(obj, j));
                        i4 = zzaea.zzx(i10 << 3);
                        i7 += i4 + zzh;
                        break;
                    }
                case 64:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        zzx2 = zzaea.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 65:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        zzx = zzaea.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 66:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        int zzq = zzq(obj, j);
                        zzx7 = zzaea.zzx(i10 << 3);
                        zzx8 = zzaea.zzx((zzq >> 31) ^ (zzq + zzq));
                        zzn = zzx8 + zzx7;
                        i7 += zzn;
                        break;
                    }
                case 67:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        long zzA = zzA(obj, j);
                        zzx5 = zzaea.zzx(i10 << 3);
                        zzx6 = zzaea.zzy((zzA >> 63) ^ (zzA + zzA));
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 68:
                    if (!zzX(obj, i10, i8)) {
                        break;
                    } else {
                        zzn = zzaea.zzt(i10, (zzafz) unsafe.getObject(obj, j), zzC(i8));
                        i7 += zzn;
                        break;
                    }
            }
            i8 += 3;
            i5 = 1048575;
        }
        zzahj zzahjVar = this.zzo;
        int zza2 = i7 + zzahjVar.zza(zzahjVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzp.zza(obj);
        throw null;
    }

    private static int zzq(Object obj, long j) {
        return ((Integer) zzaht.zzf(obj, j)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzade zzadeVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzE = zzE(i3);
        Object object = unsafe.getObject(obj, j);
        if (zzafu.zzb(object)) {
            zzaft zzb2 = zzaft.zza().zzb();
            zzafu.zzc(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzafs zzafsVar = (zzafs) zzE;
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzade zzadeVar) throws IOException {
        boolean z;
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzadf.zzp(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzadf.zzb(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzadf.zzm(bArr, i, zzadeVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzadeVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzadf.zzj(bArr, i, zzadeVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzadeVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzadf.zzp(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzadf.zzb(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzadf.zzm(bArr, i, zzadeVar);
                    if (zzadeVar.zzb != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzadf.zzj(bArr, i, zzadeVar);
                    int i13 = zzadeVar.zza;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzahy.zzi(bArr, zzj2, zzj2 + i13)) {
                        throw zzafc.zzd();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i13, zzafa.zzb));
                        zzj2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object zzG = zzG(obj, i4, i8);
                    int zzo = zzadf.zzo(zzG, zzC(i8), bArr, i, i2, zzadeVar);
                    zzP(obj, i4, i8, zzG);
                    return zzo;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzadf.zza(bArr, i, zzadeVar);
                    unsafe.putObject(obj, j, zzadeVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzadf.zzj(bArr, i, zzadeVar);
                    int i14 = zzadeVar.zza;
                    zzaex zzB = zzB(i8);
                    if (zzB != null && !zzB.zza(i14)) {
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
                    int zzj4 = zzadf.zzj(bArr, i, zzadeVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzadv.zzs(zzadeVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzadf.zzm(bArr, i, zzadeVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzadv.zzt(zzadeVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object zzG2 = zzG(obj, i4, i8);
                    int zzn = zzadf.zzn(zzG2, zzC(i8), bArr, i, i2, (i3 & (-8)) | 4, zzadeVar);
                    zzP(obj, i4, i8, zzG2);
                    return zzn;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0211 -> B:113:0x0212). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0148 -> B:61:0x0149). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01c3 -> B:93:0x01c4). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzt(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.ads.interactivemedia.v3.internal.zzade r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzagc.zzt(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.ads.interactivemedia.v3.internal.zzade):int");
    }

    private final int zzu(int i) {
        if (i >= this.zze && i <= this.zzf) {
            return zzx(i, 0);
        }
        return -1;
    }

    private final int zzv(int i, int i2) {
        if (i >= this.zze && i <= this.zzf) {
            return zzx(i, i2);
        }
        return -1;
    }

    private final int zzw(int i) {
        return this.zzc[i + 2];
    }

    private final int zzx(int i, int i2) {
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

    private static int zzy(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzz(int i) {
        return this.zzc[i + 1];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
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
        if (this.zzj) {
            Unsafe unsafe = zzb;
            int i = 0;
            for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
                int zzz = zzz(i2);
                int zzy2 = zzy(zzz);
                int i3 = this.zzc[i2];
                int i4 = zzz & 1048575;
                if (zzy2 >= zzael.zzJ.zza() && zzy2 <= zzael.zzW.zza()) {
                    int i5 = this.zzc[i2 + 2];
                }
                long j = i4;
                switch (zzy2) {
                    case 0:
                        if (zzT(obj, i2)) {
                            zzx = zzaea.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzT(obj, i2)) {
                            zzx2 = zzaea.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzT(obj, i2)) {
                            zzy = zzaea.zzy(zzaht.zzd(obj, j));
                            zzx3 = zzaea.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzT(obj, i2)) {
                            zzy = zzaea.zzy(zzaht.zzd(obj, j));
                            zzx3 = zzaea.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzT(obj, i2)) {
                            zzy = zzaea.zzu(zzaht.zzc(obj, j));
                            zzx3 = zzaea.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzT(obj, i2)) {
                            zzx = zzaea.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzT(obj, i2)) {
                            zzx2 = zzaea.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzT(obj, i2)) {
                            zzx4 = zzaea.zzx(i3 << 3);
                            zzn = zzx4 + 1;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzT(obj, i2)) {
                            Object zzf = zzaht.zzf(obj, j);
                            if (zzf instanceof zzadr) {
                                int i6 = i3 << 3;
                                int i7 = zzaea.zzb;
                                int zzd = ((zzadr) zzf).zzd();
                                zzx5 = zzaea.zzx(zzd) + zzd;
                                zzx6 = zzaea.zzx(i6);
                                zzn = zzx6 + zzx5;
                                i += zzn;
                                break;
                            } else {
                                zzy = zzaea.zzw((String) zzf);
                                zzx3 = zzaea.zzx(i3 << 3);
                                i += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (zzT(obj, i2)) {
                            zzn = zzagu.zzn(i3, zzaht.zzf(obj, j), zzC(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzT(obj, i2)) {
                            int i8 = i3 << 3;
                            int i9 = zzaea.zzb;
                            int zzd2 = ((zzadr) zzaht.zzf(obj, j)).zzd();
                            zzx5 = zzaea.zzx(zzd2) + zzd2;
                            zzx6 = zzaea.zzx(i8);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzT(obj, i2)) {
                            zzy = zzaea.zzx(zzaht.zzc(obj, j));
                            zzx3 = zzaea.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzT(obj, i2)) {
                            zzy = zzaea.zzu(zzaht.zzc(obj, j));
                            zzx3 = zzaea.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzT(obj, i2)) {
                            zzx2 = zzaea.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzT(obj, i2)) {
                            zzx = zzaea.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzT(obj, i2)) {
                            int zzc = zzaht.zzc(obj, j);
                            zzx7 = zzaea.zzx(i3 << 3);
                            zzx8 = zzaea.zzx((zzc >> 31) ^ (zzc + zzc));
                            zzn = zzx8 + zzx7;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzT(obj, i2)) {
                            long zzd3 = zzaht.zzd(obj, j);
                            zzy = zzaea.zzx(i3 << 3);
                            zzx3 = zzaea.zzy((zzd3 + zzd3) ^ (zzd3 >> 63));
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzT(obj, i2)) {
                            zzn = zzaea.zzt(i3, (zzafz) zzaht.zzf(obj, j), zzC(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzn = zzagu.zzg(i3, (List) zzaht.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 19:
                        zzn = zzagu.zze(i3, (List) zzaht.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 20:
                        zzn = zzagu.zzl(i3, (List) zzaht.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 21:
                        zzn = zzagu.zzw(i3, (List) zzaht.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 22:
                        zzn = zzagu.zzj(i3, (List) zzaht.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        zzn = zzagu.zzg(i3, (List) zzaht.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 24:
                        zzn = zzagu.zze(i3, (List) zzaht.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 25:
                        zzn = zzagu.zza(i3, (List) zzaht.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 26:
                        zzn = zzagu.zzt(i3, (List) zzaht.zzf(obj, j));
                        i += zzn;
                        break;
                    case 27:
                        zzn = zzagu.zzo(i3, (List) zzaht.zzf(obj, j), zzC(i2));
                        i += zzn;
                        break;
                    case 28:
                        zzn = zzagu.zzb(i3, (List) zzaht.zzf(obj, j));
                        i += zzn;
                        break;
                    case 29:
                        zzn = zzagu.zzu(i3, (List) zzaht.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 30:
                        zzn = zzagu.zzc(i3, (List) zzaht.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 31:
                        zzn = zzagu.zze(i3, (List) zzaht.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 32:
                        zzn = zzagu.zzg(i3, (List) zzaht.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        zzn = zzagu.zzp(i3, (List) zzaht.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 34:
                        zzn = zzagu.zzr(i3, (List) zzaht.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 35:
                        zzy = zzagu.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i10 = i3 << 3;
                            zzx9 = zzaea.zzx(zzy);
                            zzx10 = zzaea.zzx(i10);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        zzy = zzagu.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i11 = i3 << 3;
                            zzx9 = zzaea.zzx(zzy);
                            zzx10 = zzaea.zzx(i11);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        zzy = zzagu.zzm((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i12 = i3 << 3;
                            zzx9 = zzaea.zzx(zzy);
                            zzx10 = zzaea.zzx(i12);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        zzy = zzagu.zzx((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i13 = i3 << 3;
                            zzx9 = zzaea.zzx(zzy);
                            zzx10 = zzaea.zzx(i13);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        zzy = zzagu.zzk((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i14 = i3 << 3;
                            zzx9 = zzaea.zzx(zzy);
                            zzx10 = zzaea.zzx(i14);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        zzy = zzagu.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i15 = i3 << 3;
                            zzx9 = zzaea.zzx(zzy);
                            zzx10 = zzaea.zzx(i15);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        zzy = zzagu.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i16 = i3 << 3;
                            zzx9 = zzaea.zzx(zzy);
                            zzx10 = zzaea.zzx(i16);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        int i17 = zzagu.zza;
                        zzy = ((List) unsafe.getObject(obj, j)).size();
                        if (zzy > 0) {
                            int i18 = i3 << 3;
                            zzx9 = zzaea.zzx(zzy);
                            zzx10 = zzaea.zzx(i18);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        zzy = zzagu.zzv((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i19 = i3 << 3;
                            zzx9 = zzaea.zzx(zzy);
                            zzx10 = zzaea.zzx(i19);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        zzy = zzagu.zzd((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i20 = i3 << 3;
                            zzx9 = zzaea.zzx(zzy);
                            zzx10 = zzaea.zzx(i20);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        zzy = zzagu.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i21 = i3 << 3;
                            zzx9 = zzaea.zzx(zzy);
                            zzx10 = zzaea.zzx(i21);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        zzy = zzagu.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i22 = i3 << 3;
                            zzx9 = zzaea.zzx(zzy);
                            zzx10 = zzaea.zzx(i22);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        zzy = zzagu.zzq((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i23 = i3 << 3;
                            zzx9 = zzaea.zzx(zzy);
                            zzx10 = zzaea.zzx(i23);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        zzy = zzagu.zzs((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i24 = i3 << 3;
                            zzx9 = zzaea.zzx(zzy);
                            zzx10 = zzaea.zzx(i24);
                            zzx3 = zzx10 + zzx9;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        zzn = zzagu.zzi(i3, (List) zzaht.zzf(obj, j), zzC(i2));
                        i += zzn;
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        zzafu.zza(i3, zzaht.zzf(obj, j), zzE(i2));
                        break;
                    case 51:
                        if (zzX(obj, i3, i2)) {
                            zzx = zzaea.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzX(obj, i3, i2)) {
                            zzx2 = zzaea.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzX(obj, i3, i2)) {
                            zzy = zzaea.zzy(zzA(obj, j));
                            zzx3 = zzaea.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzX(obj, i3, i2)) {
                            zzy = zzaea.zzy(zzA(obj, j));
                            zzx3 = zzaea.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzX(obj, i3, i2)) {
                            zzy = zzaea.zzu(zzq(obj, j));
                            zzx3 = zzaea.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzX(obj, i3, i2)) {
                            zzx = zzaea.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzX(obj, i3, i2)) {
                            zzx2 = zzaea.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzX(obj, i3, i2)) {
                            zzx4 = zzaea.zzx(i3 << 3);
                            zzn = zzx4 + 1;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzX(obj, i3, i2)) {
                            Object zzf2 = zzaht.zzf(obj, j);
                            if (zzf2 instanceof zzadr) {
                                int i25 = i3 << 3;
                                int i26 = zzaea.zzb;
                                int zzd4 = ((zzadr) zzf2).zzd();
                                zzx5 = zzaea.zzx(zzd4) + zzd4;
                                zzx6 = zzaea.zzx(i25);
                                zzn = zzx6 + zzx5;
                                i += zzn;
                                break;
                            } else {
                                zzy = zzaea.zzw((String) zzf2);
                                zzx3 = zzaea.zzx(i3 << 3);
                                i += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (zzX(obj, i3, i2)) {
                            zzn = zzagu.zzn(i3, zzaht.zzf(obj, j), zzC(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzX(obj, i3, i2)) {
                            int i27 = i3 << 3;
                            int i28 = zzaea.zzb;
                            int zzd5 = ((zzadr) zzaht.zzf(obj, j)).zzd();
                            zzx5 = zzaea.zzx(zzd5) + zzd5;
                            zzx6 = zzaea.zzx(i27);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzX(obj, i3, i2)) {
                            zzy = zzaea.zzx(zzq(obj, j));
                            zzx3 = zzaea.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzX(obj, i3, i2)) {
                            zzy = zzaea.zzu(zzq(obj, j));
                            zzx3 = zzaea.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzX(obj, i3, i2)) {
                            zzx2 = zzaea.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzX(obj, i3, i2)) {
                            zzx = zzaea.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzX(obj, i3, i2)) {
                            int zzq = zzq(obj, j);
                            zzx7 = zzaea.zzx(i3 << 3);
                            zzx8 = zzaea.zzx((zzq >> 31) ^ (zzq + zzq));
                            zzn = zzx8 + zzx7;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzX(obj, i3, i2)) {
                            long zzA = zzA(obj, j);
                            zzy = zzaea.zzx(i3 << 3);
                            zzx3 = zzaea.zzy((zzA + zzA) ^ (zzA >> 63));
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzX(obj, i3, i2)) {
                            zzn = zzaea.zzt(i3, (zzafz) zzaht.zzf(obj, j), zzC(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzahj zzahjVar = this.zzo;
            return i + zzahjVar.zza(zzahjVar.zzd(obj));
        }
        return zzp(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int zzc;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzz = zzz(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & zzz;
            int i6 = 37;
            switch (zzy(zzz)) {
                case 0:
                    i = i3 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzaht.zza(obj, j));
                    byte[] bArr = zzafa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 1:
                    i2 = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(zzaht.zzb(obj, j));
                    i3 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = zzaht.zzd(obj, j);
                    byte[] bArr2 = zzafa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = zzaht.zzd(obj, j);
                    byte[] bArr3 = zzafa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 4:
                    i = i3 * 53;
                    zzc = zzaht.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = zzaht.zzd(obj, j);
                    byte[] bArr4 = zzafa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 6:
                    i = i3 * 53;
                    zzc = zzaht.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 7:
                    i2 = i3 * 53;
                    floatToIntBits = zzafa.zza(zzaht.zzw(obj, j));
                    i3 = floatToIntBits + i2;
                    break;
                case 8:
                    i2 = i3 * 53;
                    floatToIntBits = ((String) zzaht.zzf(obj, j)).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case 9:
                    Object zzf = zzaht.zzf(obj, j);
                    if (zzf != null) {
                        i6 = zzf.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    floatToIntBits = zzaht.zzf(obj, j).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case 11:
                    i = i3 * 53;
                    zzc = zzaht.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 12:
                    i = i3 * 53;
                    zzc = zzaht.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 13:
                    i = i3 * 53;
                    zzc = zzaht.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = zzaht.zzd(obj, j);
                    byte[] bArr5 = zzafa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 15:
                    i = i3 * 53;
                    zzc = zzaht.zzc(obj, j);
                    i3 = i + zzc;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = zzaht.zzd(obj, j);
                    byte[] bArr6 = zzafa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + zzc;
                    break;
                case 17:
                    Object zzf2 = zzaht.zzf(obj, j);
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
                    floatToIntBits = zzaht.zzf(obj, j).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    i2 = i3 * 53;
                    floatToIntBits = zzaht.zzf(obj, j).hashCode();
                    i3 = floatToIntBits + i2;
                    break;
                case 51:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzafa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzA(obj, j);
                        byte[] bArr8 = zzafa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzA(obj, j);
                        byte[] bArr9 = zzafa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzq(obj, j);
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzA(obj, j);
                        byte[] bArr10 = zzafa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzq(obj, j);
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzafa.zza(zzY(obj, j));
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = ((String) zzaht.zzf(obj, j)).hashCode();
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzaht.zzf(obj, j).hashCode();
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzaht.zzf(obj, j).hashCode();
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzq(obj, j);
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzq(obj, j);
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzq(obj, j);
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzA(obj, j);
                        byte[] bArr11 = zzafa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzq(obj, j);
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzA(obj, j);
                        byte[] bArr12 = zzafa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzaht.zzf(obj, j).hashCode();
                        i3 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzo.zzd(obj).hashCode() + (i3 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzp.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x030c, code lost:
        if (r0 != r21) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x030e, code lost:
        r15 = r27;
        r14 = r28;
        r12 = r29;
        r1 = r30;
        r13 = r31;
        r11 = r32;
        r9 = r33;
        r8 = r18;
        r5 = r19;
        r3 = r20;
        r2 = r21;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x032a, code lost:
        r2 = r0;
        r7 = r20;
        r6 = r23;
        r0 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x035e, code lost:
        if (r0 != r15) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0386, code lost:
        if (r0 != r15) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0409, code lost:
        if (r0 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x040b, code lost:
        r26.putInt(r12, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0411, code lost:
        r10 = r8.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0416, code lost:
        if (r10 >= r8.zzm) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0418, code lost:
        zzD(r28, r8.zzk[r10], null, r8.zzo, r28);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x042b, code lost:
        if (r9 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x042f, code lost:
        if (r6 != r31) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0436, code lost:
        throw com.google.ads.interactivemedia.v3.internal.zzafc.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0439, code lost:
        if (r6 > r31) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x043b, code lost:
        if (r7 != r9) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x043d, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0442, code lost:
        throw com.google.ads.interactivemedia.v3.internal.zzafc.zzg();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.ads.interactivemedia.v3.internal.zzade r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzagc.zzc(java.lang.Object, byte[], int, int, int, com.google.ads.interactivemedia.v3.internal.zzade):int");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final Object zze() {
        return ((zzaet) this.zzg).zzaA();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final void zzf(Object obj) {
        if (!zzW(obj)) {
            return;
        }
        if (obj instanceof zzaet) {
            zzaet zzaetVar = (zzaet) obj;
            zzaetVar.zzaN(Integer.MAX_VALUE);
            zzaetVar.zza = 0;
            zzaetVar.zzaL();
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzz = zzz(i);
            int i2 = 1048575 & zzz;
            int zzy = zzy(zzz);
            long j = i2;
            if (zzy != 9) {
                if (zzy != 60 && zzy != 68) {
                    switch (zzy) {
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
                            this.zzn.zzb(obj, j);
                            break;
                        case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzaft) object).zzc();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (zzX(obj, this.zzc[i], i)) {
                    zzC(i).zzf(zzb.getObject(obj, j));
                }
            }
            if (zzT(obj, i)) {
                zzC(i).zzf(zzb.getObject(obj, j));
            }
        }
        this.zzo.zzm(obj);
        if (this.zzh) {
            this.zzp.zze(obj);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final void zzg(Object obj, Object obj2) {
        zzI(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzz = zzz(i);
            int i2 = this.zzc[i];
            long j = 1048575 & zzz;
            switch (zzy(zzz)) {
                case 0:
                    if (zzT(obj2, i)) {
                        zzaht.zzo(obj, j, zzaht.zza(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj2, i)) {
                        zzaht.zzp(obj, j, zzaht.zzb(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj2, i)) {
                        zzaht.zzr(obj, j, zzaht.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj2, i)) {
                        zzaht.zzr(obj, j, zzaht.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj2, i)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj2, i)) {
                        zzaht.zzr(obj, j, zzaht.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj2, i)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj2, i)) {
                        zzaht.zzm(obj, j, zzaht.zzw(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzT(obj2, i)) {
                        zzaht.zzs(obj, j, zzaht.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i);
                    break;
                case 10:
                    if (zzT(obj2, i)) {
                        zzaht.zzs(obj, j, zzaht.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzT(obj2, i)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj2, i)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj2, i)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj2, i)) {
                        zzaht.zzr(obj, j, zzaht.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj2, i)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj2, i)) {
                        zzaht.zzr(obj, j, zzaht.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzJ(obj, obj2, i);
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
                    this.zzn.zzc(obj, obj2, j);
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    int i3 = zzagu.zza;
                    zzaht.zzs(obj, j, zzafu.zzc(zzaht.zzf(obj, j), zzaht.zzf(obj2, j)));
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
                    if (zzX(obj2, i2, i)) {
                        zzaht.zzs(obj, j, zzaht.zzf(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzK(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzX(obj2, i2, i)) {
                        zzaht.zzs(obj, j, zzaht.zzf(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzK(obj, obj2, i);
                    break;
            }
        }
        zzagu.zzD(this.zzo, obj, obj2);
        if (!this.zzh) {
            return;
        }
        this.zzp.zza(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0621 A[Catch: all -> 0x0616, TryCatch #3 {all -> 0x0616, blocks: (B:157:0x05ef, B:171:0x061c, B:173:0x0621, B:174:0x0626), top: B:199:0x05ef }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0659 A[LOOP:3: B:189:0x0655->B:191:0x0659, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x062c A[SYNTHETIC] */
    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r18, com.google.ads.interactivemedia.v3.internal.zzagk r19, com.google.ads.interactivemedia.v3.internal.zzaef r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzagc.zzh(java.lang.Object, com.google.ads.interactivemedia.v3.internal.zzagk, com.google.ads.interactivemedia.v3.internal.zzaef):void");
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
    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.ads.interactivemedia.v3.internal.zzade r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzagc.zzi(java.lang.Object, byte[], int, int, com.google.ads.interactivemedia.v3.internal.zzade):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final void zzj(Object obj, zzaib zzaibVar) throws IOException {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1048575;
        if (this.zzj) {
            if (!this.zzh) {
                int length = this.zzc.length;
                for (int i6 = 0; i6 < length; i6 += 3) {
                    int zzz = zzz(i6);
                    int i7 = this.zzc[i6];
                    switch (zzy(zzz)) {
                        case 0:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzf(i7, zzaht.zza(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzo(i7, zzaht.zzb(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzt(i7, zzaht.zzd(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzJ(i7, zzaht.zzd(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzr(i7, zzaht.zzc(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzm(i7, zzaht.zzd(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzk(i7, zzaht.zzc(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzb(i7, zzaht.zzw(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzT(obj, i6)) {
                                zzZ(i7, zzaht.zzf(obj, zzz & 1048575), zzaibVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzv(i7, zzaht.zzf(obj, zzz & 1048575), zzC(i6));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzd(i7, (zzadr) zzaht.zzf(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzH(i7, zzaht.zzc(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzi(i7, zzaht.zzc(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzw(i7, zzaht.zzc(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzy(i7, zzaht.zzd(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzA(i7, zzaht.zzc(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzC(i7, zzaht.zzd(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzT(obj, i6)) {
                                zzaibVar.zzq(i7, zzaht.zzf(obj, zzz & 1048575), zzC(i6));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzagu.zzH(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                            break;
                        case 19:
                            zzagu.zzL(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                            break;
                        case 20:
                            zzagu.zzO(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                            break;
                        case 21:
                            zzagu.zzW(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                            break;
                        case 22:
                            zzagu.zzN(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            zzagu.zzK(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                            break;
                        case 24:
                            zzagu.zzJ(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                            break;
                        case 25:
                            zzagu.zzF(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                            break;
                        case 26:
                            zzagu.zzU(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar);
                            break;
                        case 27:
                            zzagu.zzP(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, zzC(i6));
                            break;
                        case 28:
                            zzagu.zzG(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar);
                            break;
                        case 29:
                            zzagu.zzV(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                            break;
                        case 30:
                            zzagu.zzI(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                            break;
                        case 31:
                            zzagu.zzQ(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                            break;
                        case 32:
                            zzagu.zzR(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                            break;
                        case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                            zzagu.zzS(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                            break;
                        case 34:
                            zzagu.zzT(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                            break;
                        case 35:
                            zzagu.zzH(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                            break;
                        case 36:
                            zzagu.zzL(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                            break;
                        case 37:
                            zzagu.zzO(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                            break;
                        case 38:
                            zzagu.zzW(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                            break;
                        case 39:
                            zzagu.zzN(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                            break;
                        case 40:
                            zzagu.zzK(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                            break;
                        case 41:
                            zzagu.zzJ(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                            break;
                        case 42:
                            zzagu.zzF(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                            break;
                        case 43:
                            zzagu.zzV(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                            break;
                        case 44:
                            zzagu.zzI(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                            break;
                        case 45:
                            zzagu.zzQ(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                            break;
                        case 46:
                            zzagu.zzR(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                            break;
                        case 47:
                            zzagu.zzS(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                            break;
                        case 48:
                            zzagu.zzT(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                            break;
                        case 49:
                            zzagu.zzM(i7, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, zzC(i6));
                            break;
                        case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                            zzQ(zzaibVar, i7, zzaht.zzf(obj, zzz & 1048575), i6);
                            break;
                        case 51:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzf(i7, zzn(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzo(i7, zzo(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzt(i7, zzA(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzJ(i7, zzA(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzr(i7, zzq(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzm(i7, zzA(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzk(i7, zzq(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzb(i7, zzY(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzX(obj, i7, i6)) {
                                zzZ(i7, zzaht.zzf(obj, zzz & 1048575), zzaibVar);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzv(i7, zzaht.zzf(obj, zzz & 1048575), zzC(i6));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzd(i7, (zzadr) zzaht.zzf(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzH(i7, zzq(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzi(i7, zzq(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzw(i7, zzq(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzy(i7, zzA(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzA(i7, zzq(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzC(i7, zzA(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzX(obj, i7, i6)) {
                                zzaibVar.zzq(i7, zzaht.zzf(obj, zzz & 1048575), zzC(i6));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zzahj zzahjVar = this.zzo;
                zzahjVar.zzp(zzahjVar.zzd(obj), zzaibVar);
                return;
            }
            this.zzp.zza(obj);
            throw null;
        } else if (!this.zzh) {
            int length2 = this.zzc.length;
            Unsafe unsafe = zzb;
            int i8 = 0;
            int i9 = 0;
            int i10 = 1048575;
            while (i8 < length2) {
                int zzz2 = zzz(i8);
                int[] iArr = this.zzc;
                int i11 = iArr[i8];
                int zzy = zzy(zzz2);
                if (zzy <= 17) {
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
                long j = zzz2 & i5;
                switch (zzy) {
                    case 0:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzf(i11, zzaht.zza(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzo(i11, zzaht.zzb(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzt(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzJ(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzr(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzm(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzk(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzb(i11, zzaht.zzw(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzZ(i11, unsafe.getObject(obj, j), zzaibVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzv(i11, unsafe.getObject(obj, j), zzC(i8));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzd(i11, (zzadr) unsafe.getObject(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzH(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzi(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzw(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzy(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzA(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzC(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzaibVar.zzq(i11, unsafe.getObject(obj, j), zzC(i8));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i2 = 0;
                        zzagu.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                        break;
                    case 19:
                        i2 = 0;
                        zzagu.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                        break;
                    case 20:
                        i2 = 0;
                        zzagu.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                        break;
                    case 21:
                        i2 = 0;
                        zzagu.zzW(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                        break;
                    case 22:
                        i2 = 0;
                        zzagu.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        i2 = 0;
                        zzagu.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                        break;
                    case 24:
                        i2 = 0;
                        zzagu.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                        break;
                    case 25:
                        i2 = 0;
                        zzagu.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                        break;
                    case 26:
                        zzagu.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar);
                        i2 = 0;
                        break;
                    case 27:
                        zzagu.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, zzC(i8));
                        i2 = 0;
                        break;
                    case 28:
                        zzagu.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar);
                        i2 = 0;
                        break;
                    case 29:
                        i3 = 0;
                        zzagu.zzV(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                        i2 = i3;
                        break;
                    case 30:
                        i3 = 0;
                        zzagu.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                        i2 = i3;
                        break;
                    case 31:
                        i3 = 0;
                        zzagu.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                        i2 = i3;
                        break;
                    case 32:
                        i3 = 0;
                        zzagu.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                        i2 = i3;
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        i3 = 0;
                        zzagu.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                        i2 = i3;
                        break;
                    case 34:
                        i3 = 0;
                        zzagu.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, false);
                        i2 = i3;
                        break;
                    case 35:
                        zzagu.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                        i2 = 0;
                        break;
                    case 36:
                        zzagu.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                        i2 = 0;
                        break;
                    case 37:
                        zzagu.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                        i2 = 0;
                        break;
                    case 38:
                        zzagu.zzW(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                        i2 = 0;
                        break;
                    case 39:
                        zzagu.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                        i2 = 0;
                        break;
                    case 40:
                        zzagu.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                        i2 = 0;
                        break;
                    case 41:
                        zzagu.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                        i2 = 0;
                        break;
                    case 42:
                        zzagu.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                        i2 = 0;
                        break;
                    case 43:
                        zzagu.zzV(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                        i2 = 0;
                        break;
                    case 44:
                        zzagu.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                        i2 = 0;
                        break;
                    case 45:
                        zzagu.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                        i2 = 0;
                        break;
                    case 46:
                        zzagu.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                        i2 = 0;
                        break;
                    case 47:
                        zzagu.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                        i2 = 0;
                        break;
                    case 48:
                        zzagu.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, true);
                        i2 = 0;
                        break;
                    case 49:
                        zzagu.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzaibVar, zzC(i8));
                        i2 = 0;
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        zzQ(zzaibVar, i11, unsafe.getObject(obj, j), i8);
                        i2 = 0;
                        break;
                    case 51:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzf(i11, zzn(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 52:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzo(i11, zzo(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 53:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzt(i11, zzA(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 54:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzJ(i11, zzA(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 55:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzr(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 56:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzm(i11, zzA(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 57:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzk(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 58:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzb(i11, zzY(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 59:
                        if (zzX(obj, i11, i8)) {
                            zzZ(i11, unsafe.getObject(obj, j), zzaibVar);
                        }
                        i2 = 0;
                        break;
                    case 60:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzv(i11, unsafe.getObject(obj, j), zzC(i8));
                        }
                        i2 = 0;
                        break;
                    case 61:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzd(i11, (zzadr) unsafe.getObject(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 62:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzH(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 63:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzi(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 64:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzw(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 65:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzy(i11, zzA(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 66:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzA(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 67:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzC(i11, zzA(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 68:
                        if (zzX(obj, i11, i8)) {
                            zzaibVar.zzq(i11, unsafe.getObject(obj, j), zzC(i8));
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
            zzahj zzahjVar2 = this.zzo;
            zzahjVar2.zzp(zzahjVar2.zzd(obj), zzaibVar);
        } else {
            this.zzp.zza(obj);
            throw null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzX;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzz = zzz(i);
            long j = zzz & 1048575;
            switch (zzy(zzz)) {
                case 0:
                    if (zzR(obj, obj2, i) && Double.doubleToLongBits(zzaht.zza(obj, j)) == Double.doubleToLongBits(zzaht.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzR(obj, obj2, i) && Float.floatToIntBits(zzaht.zzb(obj, j)) == Float.floatToIntBits(zzaht.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzR(obj, obj2, i) && zzaht.zzd(obj, j) == zzaht.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzR(obj, obj2, i) && zzaht.zzd(obj, j) == zzaht.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzR(obj, obj2, i) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzR(obj, obj2, i) && zzaht.zzd(obj, j) == zzaht.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzR(obj, obj2, i) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzR(obj, obj2, i) && zzaht.zzw(obj, j) == zzaht.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzR(obj, obj2, i) && zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzR(obj, obj2, i) && zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzR(obj, obj2, i) && zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzR(obj, obj2, i) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzR(obj, obj2, i) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzR(obj, obj2, i) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzR(obj, obj2, i) && zzaht.zzd(obj, j) == zzaht.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzR(obj, obj2, i) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzR(obj, obj2, i) && zzaht.zzd(obj, j) == zzaht.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzR(obj, obj2, i) && zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j))) {
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
                    zzX = zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j));
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    zzX = zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j));
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
                    long zzw = zzw(i) & 1048575;
                    if (zzaht.zzc(obj, zzw) == zzaht.zzc(obj2, zzw) && zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzX) {
                return false;
            }
        }
        if (!this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj);
        this.zzp.zza(obj2);
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzl) {
            int i6 = this.zzk[i4];
            int i7 = this.zzc[i6];
            int zzz = zzz(i6);
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
            if ((268435456 & zzz) != 0 && !zzU(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzy = zzy(zzz);
            if (zzy != 9 && zzy != 17) {
                if (zzy != 27) {
                    if (zzy != 60 && zzy != 68) {
                        if (zzy != 49) {
                            if (zzy == 50 && !((zzaft) zzaht.zzf(obj, zzz & 1048575)).isEmpty()) {
                                zzafs zzafsVar = (zzafs) zzE(i6);
                                throw null;
                            }
                        }
                    } else if (zzX(obj, i7, i6) && !zzV(obj, zzz, zzC(i6))) {
                        return false;
                    }
                }
                List list = (List) zzaht.zzf(obj, zzz & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzags zzC = zzC(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzC.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzU(obj, i6, i, i2, i10) && !zzV(obj, zzz, zzC(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj);
        throw null;
    }
}
