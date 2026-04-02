package com.google.android.gms.internal.measurement;

import com.google.android.gms.drive.DriveFile;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzll<T> implements zzlt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmr.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzli zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkw zzm;
    private final zzmh<?, ?> zzn;
    private final zzjq<?> zzo;
    private final zzln zzp;
    private final zzld zzq;

    /* JADX WARN: Multi-variable type inference failed */
    private zzll(int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, zzli zzliVar, boolean z, boolean z2, int[] iArr3, int i3, int i4, zzln zzlnVar, zzkw zzkwVar, zzmh<?, ?> zzmhVar, zzjq<?> zzjqVar, zzld zzldVar) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zze = objArr;
        this.zzf = i;
        this.zzi = zzliVar;
        boolean z3 = false;
        if (zzmhVar != 0 && zzmhVar.zza(i2)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = z2;
        this.zzk = iArr3;
        this.zzl = i3;
        this.zzp = i4;
        this.zzm = zzlnVar;
        this.zzn = zzkwVar;
        this.zzo = zzmhVar;
        this.zzg = i2;
        this.zzq = zzjqVar;
    }

    private final int zzA(int i) {
        return this.zzc[i + 1];
    }

    private final int zzB(int i) {
        return this.zzc[i + 2];
    }

    private static int zzC(int i) {
        return (i >>> 20) & 255;
    }

    private static <T> double zzD(T t, long j) {
        return ((Double) zzmr.zzn(t, j)).doubleValue();
    }

    private static <T> float zzE(T t, long j) {
        return ((Float) zzmr.zzn(t, j)).floatValue();
    }

    private static <T> int zzF(T t, long j) {
        return ((Integer) zzmr.zzn(t, j)).intValue();
    }

    private static <T> long zzG(T t, long j) {
        return ((Long) zzmr.zzn(t, j)).longValue();
    }

    private static <T> boolean zzH(T t, long j) {
        return ((Boolean) zzmr.zzn(t, j)).booleanValue();
    }

    private final boolean zzI(T t, T t2, int i) {
        return zzK(t, i) == zzK(t2, i);
    }

    private final boolean zzJ(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzK(t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zzK(T t, int i) {
        int zzB = zzB(i);
        long j = zzB & 1048575;
        if (j != 1048575) {
            return (zzmr.zzd(t, j) & (1 << (zzB >>> 20))) != 0;
        }
        int zzA = zzA(i);
        long j2 = zzA & 1048575;
        switch (zzC(zzA)) {
            case 0:
                return zzmr.zzl(t, j2) != 0.0d;
            case 1:
                return zzmr.zzj(t, j2) != 0.0f;
            case 2:
                return zzmr.zzf(t, j2) != 0;
            case 3:
                return zzmr.zzf(t, j2) != 0;
            case 4:
                return zzmr.zzd(t, j2) != 0;
            case 5:
                return zzmr.zzf(t, j2) != 0;
            case 6:
                return zzmr.zzd(t, j2) != 0;
            case 7:
                return zzmr.zzh(t, j2);
            case 8:
                Object zzn = zzmr.zzn(t, j2);
                if (zzn instanceof String) {
                    return !((String) zzn).isEmpty();
                } else if (zzn instanceof zzjd) {
                    return !zzjd.zzb.equals(zzn);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzmr.zzn(t, j2) != null;
            case 10:
                return !zzjd.zzb.equals(zzmr.zzn(t, j2));
            case 11:
                return zzmr.zzd(t, j2) != 0;
            case 12:
                return zzmr.zzd(t, j2) != 0;
            case 13:
                return zzmr.zzd(t, j2) != 0;
            case 14:
                return zzmr.zzf(t, j2) != 0;
            case 15:
                return zzmr.zzd(t, j2) != 0;
            case 16:
                return zzmr.zzf(t, j2) != 0;
            case 17:
                return zzmr.zzn(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzL(T t, int i) {
        int zzB = zzB(i);
        long j = 1048575 & zzB;
        if (j == 1048575) {
            return;
        }
        zzmr.zze(t, j, (1 << (zzB >>> 20)) | zzmr.zzd(t, j));
    }

    private final boolean zzM(T t, int i, int i2) {
        return zzmr.zzd(t, (long) (zzB(i2) & 1048575)) == i;
    }

    private final void zzN(T t, int i, int i2) {
        zzmr.zze(t, zzB(i2) & 1048575, i);
    }

    private final int zzO(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzQ(i, 0);
    }

    private final int zzP(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzQ(i, i2);
    }

    private final int zzQ(int i, int i2) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzR(T t, zzjl zzjlVar) throws IOException {
        int i;
        boolean z;
        if (this.zzh) {
            this.zzo.zzb(t);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int zzA = zzA(i4);
            int i6 = this.zzc[i4];
            int zzC = zzC(zzA);
            if (zzC <= 17) {
                int i7 = this.zzc[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = unsafe.getInt(t, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = zzA & i2;
            switch (zzC) {
                case 0:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzf(i6, zzmr.zzl(t, j));
                        break;
                    }
                case 1:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zze(i6, zzmr.zzj(t, j));
                        break;
                    }
                case 2:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzc(i6, unsafe.getLong(t, j));
                        break;
                    }
                case 3:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzh(i6, unsafe.getLong(t, j));
                        break;
                    }
                case 4:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzi(i6, unsafe.getInt(t, j));
                        break;
                    }
                case 5:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzj(i6, unsafe.getLong(t, j));
                        break;
                    }
                case 6:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzk(i6, unsafe.getInt(t, j));
                        break;
                    }
                case 7:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzl(i6, zzmr.zzh(t, j));
                        break;
                    }
                case 8:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzT(i6, unsafe.getObject(t, j), zzjlVar);
                        break;
                    }
                case 9:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzr(i6, unsafe.getObject(t, j), zzv(i4));
                        break;
                    }
                case 10:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzn(i6, (zzjd) unsafe.getObject(t, j));
                        break;
                    }
                case 11:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzo(i6, unsafe.getInt(t, j));
                        break;
                    }
                case 12:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzg(i6, unsafe.getInt(t, j));
                        break;
                    }
                case 13:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzb(i6, unsafe.getInt(t, j));
                        break;
                    }
                case 14:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzd(i6, unsafe.getLong(t, j));
                        break;
                    }
                case 15:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzp(i6, unsafe.getInt(t, j));
                        break;
                    }
                case 16:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzq(i6, unsafe.getLong(t, j));
                        break;
                    }
                case 17:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzjlVar.zzs(i6, unsafe.getObject(t, j), zzv(i4));
                        break;
                    }
                case 18:
                    zzlv.zzJ(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, false);
                    break;
                case 19:
                    zzlv.zzK(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, false);
                    break;
                case 20:
                    zzlv.zzL(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, false);
                    break;
                case 21:
                    zzlv.zzM(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, false);
                    break;
                case 22:
                    zzlv.zzQ(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, false);
                    break;
                case 23:
                    zzlv.zzO(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, false);
                    break;
                case 24:
                    zzlv.zzT(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, false);
                    break;
                case 25:
                    zzlv.zzW(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, false);
                    break;
                case 26:
                    zzlv.zzX(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar);
                    break;
                case 27:
                    zzlv.zzZ(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, zzv(i4));
                    break;
                case 28:
                    zzlv.zzY(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar);
                    break;
                case 29:
                    z = false;
                    zzlv.zzR(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, false);
                    break;
                case 30:
                    z = false;
                    zzlv.zzV(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, false);
                    break;
                case 31:
                    z = false;
                    zzlv.zzU(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, false);
                    break;
                case 32:
                    z = false;
                    zzlv.zzP(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, false);
                    break;
                case 33:
                    z = false;
                    zzlv.zzS(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, false);
                    break;
                case 34:
                    z = false;
                    zzlv.zzN(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, false);
                    break;
                case 35:
                    zzlv.zzJ(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, true);
                    break;
                case 36:
                    zzlv.zzK(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, true);
                    break;
                case 37:
                    zzlv.zzL(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, true);
                    break;
                case 38:
                    zzlv.zzM(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, true);
                    break;
                case 39:
                    zzlv.zzQ(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, true);
                    break;
                case 40:
                    zzlv.zzO(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, true);
                    break;
                case 41:
                    zzlv.zzT(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, true);
                    break;
                case 42:
                    zzlv.zzW(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, true);
                    break;
                case 43:
                    zzlv.zzR(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, true);
                    break;
                case 44:
                    zzlv.zzV(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, true);
                    break;
                case 45:
                    zzlv.zzU(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, true);
                    break;
                case 46:
                    zzlv.zzP(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, true);
                    break;
                case 47:
                    zzlv.zzS(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, true);
                    break;
                case 48:
                    zzlv.zzN(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, true);
                    break;
                case 49:
                    zzlv.zzaa(this.zzc[i4], (List) unsafe.getObject(t, j), zzjlVar, zzv(i4));
                    break;
                case 50:
                    zzS(zzjlVar, i6, unsafe.getObject(t, j), i4);
                    break;
                case 51:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzf(i6, zzD(t, j));
                    }
                    break;
                case 52:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zze(i6, zzE(t, j));
                    }
                    break;
                case 53:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzc(i6, zzG(t, j));
                    }
                    break;
                case 54:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzh(i6, zzG(t, j));
                    }
                    break;
                case 55:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzi(i6, zzF(t, j));
                    }
                    break;
                case 56:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzj(i6, zzG(t, j));
                    }
                    break;
                case 57:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzk(i6, zzF(t, j));
                    }
                    break;
                case 58:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzl(i6, zzH(t, j));
                    }
                    break;
                case 59:
                    if (zzM(t, i6, i4)) {
                        zzT(i6, unsafe.getObject(t, j), zzjlVar);
                    }
                    break;
                case 60:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzr(i6, unsafe.getObject(t, j), zzv(i4));
                    }
                    break;
                case 61:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzn(i6, (zzjd) unsafe.getObject(t, j));
                    }
                    break;
                case 62:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzo(i6, zzF(t, j));
                    }
                    break;
                case 63:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzg(i6, zzF(t, j));
                    }
                    break;
                case 64:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzb(i6, zzF(t, j));
                    }
                    break;
                case 65:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzd(i6, zzG(t, j));
                    }
                    break;
                case 66:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzp(i6, zzF(t, j));
                    }
                    break;
                case 67:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzq(i6, zzG(t, j));
                    }
                    break;
                case 68:
                    if (zzM(t, i6, i4)) {
                        zzjlVar.zzs(i6, unsafe.getObject(t, j), zzv(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzmh<?, ?> zzmhVar = this.zzn;
        zzmhVar.zzi(zzmhVar.zzd(t), zzjlVar);
    }

    private final <K, V> void zzS(zzjl zzjlVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzlb zzlbVar = (zzlb) zzw(i2);
        throw null;
    }

    private static final void zzT(int i, Object obj, zzjl zzjlVar) throws IOException {
        if (obj instanceof String) {
            zzjlVar.zzm(i, (String) obj);
        } else {
            zzjlVar.zzn(i, (zzjd) obj);
        }
    }

    static zzmi zzf(Object obj) {
        zzkd zzkdVar = (zzkd) obj;
        zzmi zzmiVar = zzkdVar.zzc;
        if (zzmiVar == zzmi.zza()) {
            zzmi zzb2 = zzmi.zzb();
            zzkdVar.zzc = zzb2;
            return zzb2;
        }
        return zzmiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzll<T> zzk(Class<T> cls, zzlf zzlfVar, zzln zzlnVar, zzkw zzkwVar, zzmh<?, ?> zzmhVar, zzjq<?> zzjqVar, zzld zzldVar) {
        if (zzlfVar instanceof zzls) {
            return zzl((zzls) zzlfVar, zzlnVar, zzkwVar, zzmhVar, zzjqVar, zzldVar);
        }
        zzme zzmeVar = (zzme) zzlfVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.android.gms.internal.measurement.zzll<T> zzl(com.google.android.gms.internal.measurement.zzls r34, com.google.android.gms.internal.measurement.zzln r35, com.google.android.gms.internal.measurement.zzkw r36, com.google.android.gms.internal.measurement.zzmh<?, ?> r37, com.google.android.gms.internal.measurement.zzjq<?> r38, com.google.android.gms.internal.measurement.zzld r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzll.zzl(com.google.android.gms.internal.measurement.zzls, com.google.android.gms.internal.measurement.zzln, com.google.android.gms.internal.measurement.zzkw, com.google.android.gms.internal.measurement.zzmh, com.google.android.gms.internal.measurement.zzjq, com.google.android.gms.internal.measurement.zzld):com.google.android.gms.internal.measurement.zzll");
    }

    private static Field zzn(Class<?> cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private final void zzo(T t, T t2, int i) {
        long zzA = zzA(i) & 1048575;
        if (zzK(t2, i)) {
            Object zzn = zzmr.zzn(t, zzA);
            Object zzn2 = zzmr.zzn(t2, zzA);
            if (zzn != null && zzn2 != null) {
                zzmr.zzo(t, zzA, zzkl.zzi(zzn, zzn2));
                zzL(t, i);
            } else if (zzn2 != null) {
                zzmr.zzo(t, zzA, zzn2);
                zzL(t, i);
            }
        }
    }

    private final void zzp(T t, T t2, int i) {
        int zzA = zzA(i);
        int i2 = this.zzc[i];
        long j = zzA & 1048575;
        if (zzM(t2, i2, i)) {
            Object zzn = zzM(t, i2, i) ? zzmr.zzn(t, j) : null;
            Object zzn2 = zzmr.zzn(t2, j);
            if (zzn != null && zzn2 != null) {
                zzmr.zzo(t, j, zzkl.zzi(zzn, zzn2));
                zzN(t, i2, i);
            } else if (zzn2 != null) {
                zzmr.zzo(t, j, zzn2);
                zzN(t, i2, i);
            }
        }
    }

    private final int zzq(T t) {
        int i;
        int zzw;
        int zzw2;
        int zzw3;
        int zzx;
        int zzw4;
        int zzv;
        int zzw5;
        int zzw6;
        int zzc;
        int zzw7;
        int zzw8;
        int zzu;
        int zzw9;
        int i2;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int zzA = zzA(i6);
            int i7 = this.zzc[i6];
            int zzC = zzC(zzA);
            if (zzC <= 17) {
                int i8 = this.zzc[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i5 = unsafe.getInt(t, i9);
                    i3 = i9;
                }
            } else {
                i = 0;
            }
            long j = zzA & 1048575;
            switch (zzC) {
                case 0:
                    if ((i5 & i) != 0) {
                        zzw = zzjk.zzw(i7 << 3);
                        zzw8 = zzw + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if ((i5 & i) != 0) {
                        zzw2 = zzjk.zzw(i7 << 3);
                        zzw8 = zzw2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i5 & i) != 0) {
                        long j2 = unsafe.getLong(t, j);
                        zzw3 = zzjk.zzw(i7 << 3);
                        zzx = zzjk.zzx(j2);
                        zzw8 = zzw3 + zzx;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i5 & i) != 0) {
                        long j3 = unsafe.getLong(t, j);
                        zzw3 = zzjk.zzw(i7 << 3);
                        zzx = zzjk.zzx(j3);
                        zzw8 = zzw3 + zzx;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i5 & i) != 0) {
                        int i10 = unsafe.getInt(t, j);
                        zzw4 = zzjk.zzw(i7 << 3);
                        zzv = zzjk.zzv(i10);
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i5 & i) != 0) {
                        zzw = zzjk.zzw(i7 << 3);
                        zzw8 = zzw + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i5 & i) != 0) {
                        zzw2 = zzjk.zzw(i7 << 3);
                        zzw8 = zzw2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i5 & i) != 0) {
                        zzw5 = zzjk.zzw(i7 << 3);
                        zzw8 = zzw5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i5 & i) != 0) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof zzjd) {
                            zzw6 = zzjk.zzw(i7 << 3);
                            zzc = ((zzjd) object).zzc();
                            zzw7 = zzjk.zzw(zzc);
                            i2 = zzw6 + zzw7 + zzc;
                            i4 += i2;
                        } else {
                            zzw4 = zzjk.zzw(i7 << 3);
                            zzv = zzjk.zzy((String) object);
                            i2 = zzw4 + zzv;
                            i4 += i2;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if ((i5 & i) != 0) {
                        zzw8 = zzlv.zzw(i7, unsafe.getObject(t, j), zzv(i6));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i5 & i) != 0) {
                        zzw6 = zzjk.zzw(i7 << 3);
                        zzc = ((zzjd) unsafe.getObject(t, j)).zzc();
                        zzw7 = zzjk.zzw(zzc);
                        i2 = zzw6 + zzw7 + zzc;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i5 & i) != 0) {
                        int i11 = unsafe.getInt(t, j);
                        zzw4 = zzjk.zzw(i7 << 3);
                        zzv = zzjk.zzw(i11);
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i5 & i) != 0) {
                        int i12 = unsafe.getInt(t, j);
                        zzw4 = zzjk.zzw(i7 << 3);
                        zzv = zzjk.zzv(i12);
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i5 & i) != 0) {
                        zzw2 = zzjk.zzw(i7 << 3);
                        zzw8 = zzw2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i5 & i) != 0) {
                        zzw = zzjk.zzw(i7 << 3);
                        zzw8 = zzw + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i5 & i) != 0) {
                        int i13 = unsafe.getInt(t, j);
                        zzw4 = zzjk.zzw(i7 << 3);
                        zzv = zzjk.zzw((i13 >> 31) ^ (i13 + i13));
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i5 & i) != 0) {
                        long j4 = unsafe.getLong(t, j);
                        zzw4 = zzjk.zzw(i7 << 3);
                        zzv = zzjk.zzx((j4 >> 63) ^ (j4 + j4));
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i5 & i) != 0) {
                        zzw8 = zzjk.zzE(i7, (zzli) unsafe.getObject(t, j), zzv(i6));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    zzw8 = zzlv.zzs(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 19:
                    zzw8 = zzlv.zzq(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 20:
                    zzw8 = zzlv.zzc(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 21:
                    zzw8 = zzlv.zze(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 22:
                    zzw8 = zzlv.zzk(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 23:
                    zzw8 = zzlv.zzs(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 24:
                    zzw8 = zzlv.zzq(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 25:
                    zzw8 = zzlv.zzu(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 26:
                    zzw8 = zzlv.zzv(i7, (List) unsafe.getObject(t, j));
                    break;
                case 27:
                    zzw8 = zzlv.zzx(i7, (List) unsafe.getObject(t, j), zzv(i6));
                    break;
                case 28:
                    zzw8 = zzlv.zzy(i7, (List) unsafe.getObject(t, j));
                    break;
                case 29:
                    zzw8 = zzlv.zzm(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 30:
                    zzw8 = zzlv.zzi(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 31:
                    zzw8 = zzlv.zzq(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 32:
                    zzw8 = zzlv.zzs(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 33:
                    zzw8 = zzlv.zzo(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 34:
                    zzw8 = zzlv.zzg(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 35:
                    zzv = zzlv.zzr((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i7);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 36:
                    zzv = zzlv.zzp((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i7);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 37:
                    zzv = zzlv.zzb((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i7);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 38:
                    zzv = zzlv.zzd((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i7);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 39:
                    zzv = zzlv.zzj((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i7);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 40:
                    zzv = zzlv.zzr((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i7);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 41:
                    zzv = zzlv.zzp((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i7);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 42:
                    zzv = zzlv.zzt((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i7);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 43:
                    zzv = zzlv.zzl((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i7);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 44:
                    zzv = zzlv.zzh((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i7);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 45:
                    zzv = zzlv.zzp((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i7);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 46:
                    zzv = zzlv.zzr((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i7);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 47:
                    zzv = zzlv.zzn((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i7);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 48:
                    zzv = zzlv.zzf((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i7);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 49:
                    zzw8 = zzlv.zzz(i7, (List) unsafe.getObject(t, j), zzv(i6));
                    break;
                case 50:
                    zzld.zza(i7, unsafe.getObject(t, j), zzw(i6));
                    continue;
                case 51:
                    if (zzM(t, i7, i6)) {
                        zzw = zzjk.zzw(i7 << 3);
                        zzw8 = zzw + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (zzM(t, i7, i6)) {
                        zzw2 = zzjk.zzw(i7 << 3);
                        zzw8 = zzw2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (zzM(t, i7, i6)) {
                        long zzG = zzG(t, j);
                        zzw3 = zzjk.zzw(i7 << 3);
                        zzx = zzjk.zzx(zzG);
                        zzw8 = zzw3 + zzx;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (zzM(t, i7, i6)) {
                        long zzG2 = zzG(t, j);
                        zzw3 = zzjk.zzw(i7 << 3);
                        zzx = zzjk.zzx(zzG2);
                        zzw8 = zzw3 + zzx;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (zzM(t, i7, i6)) {
                        int zzF = zzF(t, j);
                        zzw4 = zzjk.zzw(i7 << 3);
                        zzv = zzjk.zzv(zzF);
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 56:
                    if (zzM(t, i7, i6)) {
                        zzw = zzjk.zzw(i7 << 3);
                        zzw8 = zzw + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (zzM(t, i7, i6)) {
                        zzw2 = zzjk.zzw(i7 << 3);
                        zzw8 = zzw2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (zzM(t, i7, i6)) {
                        zzw5 = zzjk.zzw(i7 << 3);
                        zzw8 = zzw5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (zzM(t, i7, i6)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof zzjd) {
                            zzw6 = zzjk.zzw(i7 << 3);
                            zzc = ((zzjd) object2).zzc();
                            zzw7 = zzjk.zzw(zzc);
                            i2 = zzw6 + zzw7 + zzc;
                            i4 += i2;
                        } else {
                            zzw4 = zzjk.zzw(i7 << 3);
                            zzv = zzjk.zzy((String) object2);
                            i2 = zzw4 + zzv;
                            i4 += i2;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (zzM(t, i7, i6)) {
                        zzw8 = zzlv.zzw(i7, unsafe.getObject(t, j), zzv(i6));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (zzM(t, i7, i6)) {
                        zzw6 = zzjk.zzw(i7 << 3);
                        zzc = ((zzjd) unsafe.getObject(t, j)).zzc();
                        zzw7 = zzjk.zzw(zzc);
                        i2 = zzw6 + zzw7 + zzc;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 62:
                    if (zzM(t, i7, i6)) {
                        int zzF2 = zzF(t, j);
                        zzw4 = zzjk.zzw(i7 << 3);
                        zzv = zzjk.zzw(zzF2);
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 63:
                    if (zzM(t, i7, i6)) {
                        int zzF3 = zzF(t, j);
                        zzw4 = zzjk.zzw(i7 << 3);
                        zzv = zzjk.zzv(zzF3);
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 64:
                    if (zzM(t, i7, i6)) {
                        zzw2 = zzjk.zzw(i7 << 3);
                        zzw8 = zzw2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (zzM(t, i7, i6)) {
                        zzw = zzjk.zzw(i7 << 3);
                        zzw8 = zzw + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (zzM(t, i7, i6)) {
                        int zzF4 = zzF(t, j);
                        zzw4 = zzjk.zzw(i7 << 3);
                        zzv = zzjk.zzw((zzF4 >> 31) ^ (zzF4 + zzF4));
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 67:
                    if (zzM(t, i7, i6)) {
                        long zzG3 = zzG(t, j);
                        zzw4 = zzjk.zzw(i7 << 3);
                        zzv = zzjk.zzx((zzG3 >> 63) ^ (zzG3 + zzG3));
                        i2 = zzw4 + zzv;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 68:
                    if (zzM(t, i7, i6)) {
                        zzw8 = zzjk.zzE(i7, (zzli) unsafe.getObject(t, j), zzv(i6));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i4 += zzw8;
        }
        zzmh<?, ?> zzmhVar = this.zzn;
        int zzh = i4 + zzmhVar.zzh(zzmhVar.zzd(t));
        if (this.zzh) {
            this.zzo.zzb(t);
            throw null;
        }
        return zzh;
    }

    private final int zzr(T t) {
        int zzw;
        int zzw2;
        int zzw3;
        int zzx;
        int zzw4;
        int zzv;
        int zzw5;
        int zzw6;
        int zzc;
        int zzw7;
        int zzw8;
        int zzu;
        int zzw9;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int zzA = zzA(i3);
            int zzC = zzC(zzA);
            int i4 = this.zzc[i3];
            long j = zzA & 1048575;
            if (zzC >= zzjv.DOUBLE_LIST_PACKED.zza() && zzC <= zzjv.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (zzC) {
                case 0:
                    if (zzK(t, i3)) {
                        zzw = zzjk.zzw(i4 << 3);
                        zzw8 = zzw + 8;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzK(t, i3)) {
                        zzw2 = zzjk.zzw(i4 << 3);
                        zzw8 = zzw2 + 4;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzK(t, i3)) {
                        long zzf = zzmr.zzf(t, j);
                        zzw3 = zzjk.zzw(i4 << 3);
                        zzx = zzjk.zzx(zzf);
                        i2 += zzw3 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzK(t, i3)) {
                        long zzf2 = zzmr.zzf(t, j);
                        zzw3 = zzjk.zzw(i4 << 3);
                        zzx = zzjk.zzx(zzf2);
                        i2 += zzw3 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzK(t, i3)) {
                        int zzd = zzmr.zzd(t, j);
                        zzw4 = zzjk.zzw(i4 << 3);
                        zzv = zzjk.zzv(zzd);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzK(t, i3)) {
                        zzw = zzjk.zzw(i4 << 3);
                        zzw8 = zzw + 8;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzK(t, i3)) {
                        zzw2 = zzjk.zzw(i4 << 3);
                        zzw8 = zzw2 + 4;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzK(t, i3)) {
                        zzw5 = zzjk.zzw(i4 << 3);
                        zzw8 = zzw5 + 1;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzK(t, i3)) {
                        break;
                    } else {
                        Object zzn = zzmr.zzn(t, j);
                        if (zzn instanceof zzjd) {
                            zzw6 = zzjk.zzw(i4 << 3);
                            zzc = ((zzjd) zzn).zzc();
                            zzw7 = zzjk.zzw(zzc);
                            i = zzw6 + zzw7 + zzc;
                            i2 += i;
                            break;
                        } else {
                            zzw4 = zzjk.zzw(i4 << 3);
                            zzv = zzjk.zzy((String) zzn);
                            i = zzw4 + zzv;
                            i2 += i;
                        }
                    }
                case 9:
                    if (zzK(t, i3)) {
                        zzw8 = zzlv.zzw(i4, zzmr.zzn(t, j), zzv(i3));
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzK(t, i3)) {
                        zzw6 = zzjk.zzw(i4 << 3);
                        zzc = ((zzjd) zzmr.zzn(t, j)).zzc();
                        zzw7 = zzjk.zzw(zzc);
                        i = zzw6 + zzw7 + zzc;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzK(t, i3)) {
                        int zzd2 = zzmr.zzd(t, j);
                        zzw4 = zzjk.zzw(i4 << 3);
                        zzv = zzjk.zzw(zzd2);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzK(t, i3)) {
                        int zzd3 = zzmr.zzd(t, j);
                        zzw4 = zzjk.zzw(i4 << 3);
                        zzv = zzjk.zzv(zzd3);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzK(t, i3)) {
                        zzw2 = zzjk.zzw(i4 << 3);
                        zzw8 = zzw2 + 4;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzK(t, i3)) {
                        zzw = zzjk.zzw(i4 << 3);
                        zzw8 = zzw + 8;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzK(t, i3)) {
                        int zzd4 = zzmr.zzd(t, j);
                        zzw4 = zzjk.zzw(i4 << 3);
                        zzv = zzjk.zzw((zzd4 >> 31) ^ (zzd4 + zzd4));
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzK(t, i3)) {
                        long zzf3 = zzmr.zzf(t, j);
                        zzw4 = zzjk.zzw(i4 << 3);
                        zzv = zzjk.zzx((zzf3 >> 63) ^ (zzf3 + zzf3));
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzK(t, i3)) {
                        zzw8 = zzjk.zzE(i4, (zzli) zzmr.zzn(t, j), zzv(i3));
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzw8 = zzlv.zzs(i4, (List) zzmr.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 19:
                    zzw8 = zzlv.zzq(i4, (List) zzmr.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 20:
                    zzw8 = zzlv.zzc(i4, (List) zzmr.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 21:
                    zzw8 = zzlv.zze(i4, (List) zzmr.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 22:
                    zzw8 = zzlv.zzk(i4, (List) zzmr.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 23:
                    zzw8 = zzlv.zzs(i4, (List) zzmr.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 24:
                    zzw8 = zzlv.zzq(i4, (List) zzmr.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 25:
                    zzw8 = zzlv.zzu(i4, (List) zzmr.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 26:
                    zzw8 = zzlv.zzv(i4, (List) zzmr.zzn(t, j));
                    i2 += zzw8;
                    break;
                case 27:
                    zzw8 = zzlv.zzx(i4, (List) zzmr.zzn(t, j), zzv(i3));
                    i2 += zzw8;
                    break;
                case 28:
                    zzw8 = zzlv.zzy(i4, (List) zzmr.zzn(t, j));
                    i2 += zzw8;
                    break;
                case 29:
                    zzw8 = zzlv.zzm(i4, (List) zzmr.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 30:
                    zzw8 = zzlv.zzi(i4, (List) zzmr.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 31:
                    zzw8 = zzlv.zzq(i4, (List) zzmr.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 32:
                    zzw8 = zzlv.zzs(i4, (List) zzmr.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 33:
                    zzw8 = zzlv.zzo(i4, (List) zzmr.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 34:
                    zzw8 = zzlv.zzg(i4, (List) zzmr.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 35:
                    zzv = zzlv.zzr((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i4);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzv = zzlv.zzp((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i4);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzv = zzlv.zzb((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i4);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzv = zzlv.zzd((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i4);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzv = zzlv.zzj((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i4);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzv = zzlv.zzr((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i4);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzv = zzlv.zzp((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i4);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzv = zzlv.zzt((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i4);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzv = zzlv.zzl((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i4);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzv = zzlv.zzh((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i4);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzv = zzlv.zzp((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i4);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzv = zzlv.zzr((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i4);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzv = zzlv.zzn((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i4);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzv = zzlv.zzf((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzjk.zzu(i4);
                        zzw9 = zzjk.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzw8 = zzlv.zzz(i4, (List) zzmr.zzn(t, j), zzv(i3));
                    i2 += zzw8;
                    break;
                case 50:
                    zzld.zza(i4, zzmr.zzn(t, j), zzw(i3));
                    break;
                case 51:
                    if (zzM(t, i4, i3)) {
                        zzw = zzjk.zzw(i4 << 3);
                        zzw8 = zzw + 8;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(t, i4, i3)) {
                        zzw2 = zzjk.zzw(i4 << 3);
                        zzw8 = zzw2 + 4;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(t, i4, i3)) {
                        long zzG = zzG(t, j);
                        zzw3 = zzjk.zzw(i4 << 3);
                        zzx = zzjk.zzx(zzG);
                        i2 += zzw3 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(t, i4, i3)) {
                        long zzG2 = zzG(t, j);
                        zzw3 = zzjk.zzw(i4 << 3);
                        zzx = zzjk.zzx(zzG2);
                        i2 += zzw3 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(t, i4, i3)) {
                        int zzF = zzF(t, j);
                        zzw4 = zzjk.zzw(i4 << 3);
                        zzv = zzjk.zzv(zzF);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(t, i4, i3)) {
                        zzw = zzjk.zzw(i4 << 3);
                        zzw8 = zzw + 8;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(t, i4, i3)) {
                        zzw2 = zzjk.zzw(i4 << 3);
                        zzw8 = zzw2 + 4;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(t, i4, i3)) {
                        zzw5 = zzjk.zzw(i4 << 3);
                        zzw8 = zzw5 + 1;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzM(t, i4, i3)) {
                        break;
                    } else {
                        Object zzn2 = zzmr.zzn(t, j);
                        if (zzn2 instanceof zzjd) {
                            zzw6 = zzjk.zzw(i4 << 3);
                            zzc = ((zzjd) zzn2).zzc();
                            zzw7 = zzjk.zzw(zzc);
                            i = zzw6 + zzw7 + zzc;
                            i2 += i;
                            break;
                        } else {
                            zzw4 = zzjk.zzw(i4 << 3);
                            zzv = zzjk.zzy((String) zzn2);
                            i = zzw4 + zzv;
                            i2 += i;
                        }
                    }
                case 60:
                    if (zzM(t, i4, i3)) {
                        zzw8 = zzlv.zzw(i4, zzmr.zzn(t, j), zzv(i3));
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(t, i4, i3)) {
                        zzw6 = zzjk.zzw(i4 << 3);
                        zzc = ((zzjd) zzmr.zzn(t, j)).zzc();
                        zzw7 = zzjk.zzw(zzc);
                        i = zzw6 + zzw7 + zzc;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(t, i4, i3)) {
                        int zzF2 = zzF(t, j);
                        zzw4 = zzjk.zzw(i4 << 3);
                        zzv = zzjk.zzw(zzF2);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(t, i4, i3)) {
                        int zzF3 = zzF(t, j);
                        zzw4 = zzjk.zzw(i4 << 3);
                        zzv = zzjk.zzv(zzF3);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(t, i4, i3)) {
                        zzw2 = zzjk.zzw(i4 << 3);
                        zzw8 = zzw2 + 4;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(t, i4, i3)) {
                        zzw = zzjk.zzw(i4 << 3);
                        zzw8 = zzw + 8;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(t, i4, i3)) {
                        int zzF4 = zzF(t, j);
                        zzw4 = zzjk.zzw(i4 << 3);
                        zzv = zzjk.zzw((zzF4 >> 31) ^ (zzF4 + zzF4));
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(t, i4, i3)) {
                        long zzG3 = zzG(t, j);
                        zzw4 = zzjk.zzw(i4 << 3);
                        zzv = zzjk.zzx((zzG3 >> 63) ^ (zzG3 + zzG3));
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(t, i4, i3)) {
                        zzw8 = zzjk.zzE(i4, (zzli) zzmr.zzn(t, j), zzv(i3));
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzmh<?, ?> zzmhVar = this.zzn;
        return i2 + zzmhVar.zzh(zzmhVar.zzd(t));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021c -> B:120:0x021d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0151 -> B:67:0x0152). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01ce -> B:100:0x01cf). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzs(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.zzir r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzll.zzs(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzir):int");
    }

    private final <K, V> int zzt(T t, byte[] bArr, int i, int i2, int i3, long j, zzir zzirVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzw = zzw(i3);
        Object object = unsafe.getObject(t, j);
        if (!((zzlc) object).zze()) {
            zzlc<K, V> zzc = zzlc.zza().zzc();
            zzld.zzb(zzc, object);
            unsafe.putObject(t, j, zzc);
        }
        zzlb zzlbVar = (zzlb) zzw;
        throw null;
    }

    private final int zzu(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzir zzirVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(zzis.zze(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(zzis.zzd(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzc = zzis.zzc(bArr, i, zzirVar);
                    unsafe.putObject(t, j, Long.valueOf(zzirVar.zzb));
                    unsafe.putInt(t, j2, i4);
                    return zzc;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zza2 = zzis.zza(bArr, i, zzirVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzirVar.zza));
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzis.zze(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzis.zzd(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzc2 = zzis.zzc(bArr, i, zzirVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzirVar.zzb != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzc2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zza3 = zzis.zza(bArr, i, zzirVar);
                    int i9 = zzirVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & DriveFile.MODE_WRITE_ONLY) == 0 || zzmw.zzb(bArr, zza3, zza3 + i9)) {
                        unsafe.putObject(t, j, new String(bArr, zza3, i9, zzkl.zza));
                        zza3 += i9;
                    } else {
                        throw zzkn.zzf();
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza3;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int zzi = zzis.zzi(zzv(i8), bArr, i, i2, zzirVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzirVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzkl.zzi(object, zzirVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzi;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zzh = zzis.zzh(bArr, i, zzirVar);
                    unsafe.putObject(t, j, zzirVar.zzc);
                    unsafe.putInt(t, j2, i4);
                    return zzh;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zza4 = zzis.zza(bArr, i, zzirVar);
                    int i10 = zzirVar.zza;
                    zzkh zzx = zzx(i8);
                    if (zzx == null || zzx.zza(i10)) {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        unsafe.putInt(t, j2, i4);
                    } else {
                        zzf(t).zzh(i3, Long.valueOf(i10));
                    }
                    return zza4;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zza5 = zzis.zza(bArr, i, zzirVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzjg.zzb(zzirVar.zza)));
                    unsafe.putInt(t, j2, i4);
                    return zza5;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzc3 = zzis.zzc(bArr, i, zzirVar);
                    unsafe.putObject(t, j, Long.valueOf(zzjg.zzc(zzirVar.zzb)));
                    unsafe.putInt(t, j2, i4);
                    return zzc3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int zzj = zzis.zzj(zzv(i8), bArr, i, i2, (i3 & (-8)) | 4, zzirVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzirVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzkl.zzi(object2, zzirVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzj;
                }
                break;
        }
        return i;
    }

    private final zzlt zzv(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlt zzltVar = (zzlt) this.zzd[i3];
        if (zzltVar != null) {
            return zzltVar;
        }
        zzlt<T> zzb2 = zzlq.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzkh zzx(int i) {
        int i2 = i / 3;
        return (zzkh) this.zzd[i2 + i2 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a9, code lost:
        if (r0 != r15) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ab, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r10 = r18;
        r2 = r19;
        r1 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02c1, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02f4, code lost:
        if (r0 != r15) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0317, code lost:
        if (r0 != r15) goto L154;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzy(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.zzir r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzll.zzy(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzir):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzz(Object obj, int i, zzlt zzltVar) {
        return zzltVar.zzj(zzmr.zzn(obj, i & 1048575));
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    public final T zza() {
        return (T) ((zzkd) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    public final boolean zzb(T t, T t2) {
        boolean zzD;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzA = zzA(i);
            long j = zzA & 1048575;
            switch (zzC(zzA)) {
                case 0:
                    if (zzI(t, t2, i) && Double.doubleToLongBits(zzmr.zzl(t, j)) == Double.doubleToLongBits(zzmr.zzl(t2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzI(t, t2, i) && Float.floatToIntBits(zzmr.zzj(t, j)) == Float.floatToIntBits(zzmr.zzj(t2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzI(t, t2, i) && zzmr.zzf(t, j) == zzmr.zzf(t2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzI(t, t2, i) && zzmr.zzf(t, j) == zzmr.zzf(t2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzI(t, t2, i) && zzmr.zzd(t, j) == zzmr.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzI(t, t2, i) && zzmr.zzf(t, j) == zzmr.zzf(t2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzI(t, t2, i) && zzmr.zzd(t, j) == zzmr.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzI(t, t2, i) && zzmr.zzh(t, j) == zzmr.zzh(t2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzI(t, t2, i) && zzlv.zzD(zzmr.zzn(t, j), zzmr.zzn(t2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzI(t, t2, i) && zzlv.zzD(zzmr.zzn(t, j), zzmr.zzn(t2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzI(t, t2, i) && zzlv.zzD(zzmr.zzn(t, j), zzmr.zzn(t2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzI(t, t2, i) && zzmr.zzd(t, j) == zzmr.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzI(t, t2, i) && zzmr.zzd(t, j) == zzmr.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzI(t, t2, i) && zzmr.zzd(t, j) == zzmr.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzI(t, t2, i) && zzmr.zzf(t, j) == zzmr.zzf(t2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzI(t, t2, i) && zzmr.zzd(t, j) == zzmr.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzI(t, t2, i) && zzmr.zzf(t, j) == zzmr.zzf(t2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzI(t, t2, i) && zzlv.zzD(zzmr.zzn(t, j), zzmr.zzn(t2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
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
                    zzD = zzlv.zzD(zzmr.zzn(t, j), zzmr.zzn(t2, j));
                    break;
                case 50:
                    zzD = zzlv.zzD(zzmr.zzn(t, j), zzmr.zzn(t2, j));
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
                    long zzB = zzB(i) & 1048575;
                    if (zzmr.zzd(t, zzB) == zzmr.zzd(t2, zzB) && zzlv.zzD(zzmr.zzn(t, j), zzmr.zzn(t2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzD) {
                return false;
            }
        }
        if (this.zzn.zzd(t).equals(this.zzn.zzd(t2))) {
            if (this.zzh) {
                this.zzo.zzb(t);
                this.zzo.zzb(t2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    public final int zzc(T t) {
        int i;
        int zze;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzA = zzA(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzA;
            int i5 = 37;
            switch (zzC(zzA)) {
                case 0:
                    i = i2 * 53;
                    zze = zzkl.zze(Double.doubleToLongBits(zzmr.zzl(t, j)));
                    i2 = i + zze;
                    break;
                case 1:
                    i = i2 * 53;
                    zze = Float.floatToIntBits(zzmr.zzj(t, j));
                    i2 = i + zze;
                    break;
                case 2:
                    i = i2 * 53;
                    zze = zzkl.zze(zzmr.zzf(t, j));
                    i2 = i + zze;
                    break;
                case 3:
                    i = i2 * 53;
                    zze = zzkl.zze(zzmr.zzf(t, j));
                    i2 = i + zze;
                    break;
                case 4:
                    i = i2 * 53;
                    zze = zzmr.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 5:
                    i = i2 * 53;
                    zze = zzkl.zze(zzmr.zzf(t, j));
                    i2 = i + zze;
                    break;
                case 6:
                    i = i2 * 53;
                    zze = zzmr.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 7:
                    i = i2 * 53;
                    zze = zzkl.zzf(zzmr.zzh(t, j));
                    i2 = i + zze;
                    break;
                case 8:
                    i = i2 * 53;
                    zze = ((String) zzmr.zzn(t, j)).hashCode();
                    i2 = i + zze;
                    break;
                case 9:
                    Object zzn = zzmr.zzn(t, j);
                    if (zzn != null) {
                        i5 = zzn.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zze = zzmr.zzn(t, j).hashCode();
                    i2 = i + zze;
                    break;
                case 11:
                    i = i2 * 53;
                    zze = zzmr.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 12:
                    i = i2 * 53;
                    zze = zzmr.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 13:
                    i = i2 * 53;
                    zze = zzmr.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 14:
                    i = i2 * 53;
                    zze = zzkl.zze(zzmr.zzf(t, j));
                    i2 = i + zze;
                    break;
                case 15:
                    i = i2 * 53;
                    zze = zzmr.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 16:
                    i = i2 * 53;
                    zze = zzkl.zze(zzmr.zzf(t, j));
                    i2 = i + zze;
                    break;
                case 17:
                    Object zzn2 = zzmr.zzn(t, j);
                    if (zzn2 != null) {
                        i5 = zzn2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
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
                    i = i2 * 53;
                    zze = zzmr.zzn(t, j).hashCode();
                    i2 = i + zze;
                    break;
                case 50:
                    i = i2 * 53;
                    zze = zzmr.zzn(t, j).hashCode();
                    i2 = i + zze;
                    break;
                case 51:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzkl.zze(Double.doubleToLongBits(zzD(t, j)));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = Float.floatToIntBits(zzE(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzkl.zze(zzG(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzkl.zze(zzG(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzF(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzkl.zze(zzG(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzF(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzkl.zzf(zzH(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = ((String) zzmr.zzn(t, j)).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzmr.zzn(t, j).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzmr.zzn(t, j).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzF(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzF(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzF(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzkl.zze(zzG(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzF(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzkl.zze(zzG(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzmr.zzn(t, j).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzn.zzd(t).hashCode();
        if (this.zzh) {
            this.zzo.zzb(t);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    public final void zzd(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.zzc.length; i += 3) {
                int zzA = zzA(i);
                long j = 1048575 & zzA;
                int i2 = this.zzc[i];
                switch (zzC(zzA)) {
                    case 0:
                        if (zzK(t2, i)) {
                            zzmr.zzm(t, j, zzmr.zzl(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzK(t2, i)) {
                            zzmr.zzk(t, j, zzmr.zzj(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzK(t2, i)) {
                            zzmr.zzg(t, j, zzmr.zzf(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzK(t2, i)) {
                            zzmr.zzg(t, j, zzmr.zzf(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzK(t2, i)) {
                            zzmr.zze(t, j, zzmr.zzd(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzK(t2, i)) {
                            zzmr.zzg(t, j, zzmr.zzf(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzK(t2, i)) {
                            zzmr.zze(t, j, zzmr.zzd(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzK(t2, i)) {
                            zzmr.zzi(t, j, zzmr.zzh(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzK(t2, i)) {
                            zzmr.zzo(t, j, zzmr.zzn(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        zzo(t, t2, i);
                        break;
                    case 10:
                        if (zzK(t2, i)) {
                            zzmr.zzo(t, j, zzmr.zzn(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzK(t2, i)) {
                            zzmr.zze(t, j, zzmr.zzd(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzK(t2, i)) {
                            zzmr.zze(t, j, zzmr.zzd(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzK(t2, i)) {
                            zzmr.zze(t, j, zzmr.zzd(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzK(t2, i)) {
                            zzmr.zzg(t, j, zzmr.zzf(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzK(t2, i)) {
                            zzmr.zze(t, j, zzmr.zzd(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzK(t2, i)) {
                            zzmr.zzg(t, j, zzmr.zzf(t2, j));
                            zzL(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        zzo(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
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
                        this.zzm.zzb(t, t2, j);
                        break;
                    case 50:
                        zzlv.zzI(this.zzq, t, t2, j);
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
                        if (zzM(t2, i2, i)) {
                            zzmr.zzo(t, j, zzmr.zzn(t2, j));
                            zzN(t, i2, i);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        zzp(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (zzM(t2, i2, i)) {
                            zzmr.zzo(t, j, zzmr.zzn(t2, j));
                            zzN(t, i2, i);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        zzp(t, t2, i);
                        break;
                }
            }
            zzlv.zzF(this.zzn, t, t2);
            if (this.zzh) {
                zzlv.zzE(this.zzo, t, t2);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    public final int zze(T t) {
        return this.zzi ? zzr(t) : zzq(t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0419, code lost:
        if (r6 == 1048575) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x041b, code lost:
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0421, code lost:
        r3 = r9.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0425, code lost:
        if (r3 >= r9.zzl) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0427, code lost:
        r4 = r9.zzj[r3];
        r5 = r9.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r9.zzA(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0439, code lost:
        if (r5 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0440, code lost:
        if (r9.zzx(r4) != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0442, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0445, code lost:
        r5 = (com.google.android.gms.internal.measurement.zzlc) r5;
        r0 = (com.google.android.gms.internal.measurement.zzlb) r9.zzw(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x044d, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x044e, code lost:
        if (r7 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0452, code lost:
        if (r0 != r32) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0459, code lost:
        throw com.google.android.gms.internal.measurement.zzkn.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x045c, code lost:
        if (r0 > r32) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x045e, code lost:
        if (r1 != r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0460, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0465, code lost:
        throw com.google.android.gms.internal.measurement.zzkn.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzg(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzir r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzll.zzg(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzir):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    public final void zzh(T t, byte[] bArr, int i, int i2, zzir zzirVar) throws IOException {
        if (this.zzi) {
            zzy(t, bArr, i, i2, zzirVar);
        } else {
            zzg(t, bArr, i, i2, 0, zzirVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    public final void zzi(T t) {
        int i;
        int i2 = this.zzk;
        while (true) {
            i = this.zzl;
            if (i2 >= i) {
                break;
            }
            long zzA = zzA(this.zzj[i2]) & 1048575;
            Object zzn = zzmr.zzn(t, zzA);
            if (zzn != null) {
                ((zzlc) zzn).zzd();
                zzmr.zzo(t, zzA, zzn);
            }
            i2++;
        }
        int length = this.zzj.length;
        while (i < length) {
            this.zzm.zza(t, this.zzj[i]);
            i++;
        }
        this.zzn.zze(t);
        if (this.zzh) {
            this.zzo.zzc(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzlt
    public final boolean zzj(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int i6 = this.zzj[i5];
            int i7 = this.zzc[i6];
            int zzA = zzA(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzA) != 0 && !zzJ(t, i6, i, i2, i10)) {
                return false;
            }
            int zzC = zzC(zzA);
            if (zzC != 9 && zzC != 17) {
                if (zzC != 27) {
                    if (zzC == 60 || zzC == 68) {
                        if (zzM(t, i7, i6) && !zzz(t, zzA, zzv(i6))) {
                            return false;
                        }
                    } else if (zzC != 49) {
                        if (zzC == 50 && !((zzlc) zzmr.zzn(t, zzA & 1048575)).isEmpty()) {
                            zzlb zzlbVar = (zzlb) zzw(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzmr.zzn(t, zzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlt zzv = zzv(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzv.zzj(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzJ(t, i6, i, i2, i10) && !zzz(t, zzA, zzv(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.zzh) {
            this.zzo.zzb(t);
            throw null;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    public final void zzm(T t, zzjl zzjlVar) throws IOException {
        if (!this.zzi) {
            zzR(t, zzjlVar);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzA = zzA(i);
                int i2 = this.zzc[i];
                switch (zzC(zzA)) {
                    case 0:
                        if (zzK(t, i)) {
                            zzjlVar.zzf(i2, zzmr.zzl(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzK(t, i)) {
                            zzjlVar.zze(i2, zzmr.zzj(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzK(t, i)) {
                            zzjlVar.zzc(i2, zzmr.zzf(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzK(t, i)) {
                            zzjlVar.zzh(i2, zzmr.zzf(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzK(t, i)) {
                            zzjlVar.zzi(i2, zzmr.zzd(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzK(t, i)) {
                            zzjlVar.zzj(i2, zzmr.zzf(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzK(t, i)) {
                            zzjlVar.zzk(i2, zzmr.zzd(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzK(t, i)) {
                            zzjlVar.zzl(i2, zzmr.zzh(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzK(t, i)) {
                            zzT(i2, zzmr.zzn(t, zzA & 1048575), zzjlVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzK(t, i)) {
                            zzjlVar.zzr(i2, zzmr.zzn(t, zzA & 1048575), zzv(i));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzK(t, i)) {
                            zzjlVar.zzn(i2, (zzjd) zzmr.zzn(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzK(t, i)) {
                            zzjlVar.zzo(i2, zzmr.zzd(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzK(t, i)) {
                            zzjlVar.zzg(i2, zzmr.zzd(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzK(t, i)) {
                            zzjlVar.zzb(i2, zzmr.zzd(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzK(t, i)) {
                            zzjlVar.zzd(i2, zzmr.zzf(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzK(t, i)) {
                            zzjlVar.zzp(i2, zzmr.zzd(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzK(t, i)) {
                            zzjlVar.zzq(i2, zzmr.zzf(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzK(t, i)) {
                            zzjlVar.zzs(i2, zzmr.zzn(t, zzA & 1048575), zzv(i));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzlv.zzJ(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, false);
                        break;
                    case 19:
                        zzlv.zzK(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, false);
                        break;
                    case 20:
                        zzlv.zzL(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, false);
                        break;
                    case 21:
                        zzlv.zzM(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, false);
                        break;
                    case 22:
                        zzlv.zzQ(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, false);
                        break;
                    case 23:
                        zzlv.zzO(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, false);
                        break;
                    case 24:
                        zzlv.zzT(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, false);
                        break;
                    case 25:
                        zzlv.zzW(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, false);
                        break;
                    case 26:
                        zzlv.zzX(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar);
                        break;
                    case 27:
                        zzlv.zzZ(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, zzv(i));
                        break;
                    case 28:
                        zzlv.zzY(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar);
                        break;
                    case 29:
                        zzlv.zzR(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, false);
                        break;
                    case 30:
                        zzlv.zzV(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, false);
                        break;
                    case 31:
                        zzlv.zzU(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, false);
                        break;
                    case 32:
                        zzlv.zzP(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, false);
                        break;
                    case 33:
                        zzlv.zzS(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, false);
                        break;
                    case 34:
                        zzlv.zzN(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, false);
                        break;
                    case 35:
                        zzlv.zzJ(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, true);
                        break;
                    case 36:
                        zzlv.zzK(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, true);
                        break;
                    case 37:
                        zzlv.zzL(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, true);
                        break;
                    case 38:
                        zzlv.zzM(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, true);
                        break;
                    case 39:
                        zzlv.zzQ(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, true);
                        break;
                    case 40:
                        zzlv.zzO(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, true);
                        break;
                    case 41:
                        zzlv.zzT(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, true);
                        break;
                    case 42:
                        zzlv.zzW(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, true);
                        break;
                    case 43:
                        zzlv.zzR(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, true);
                        break;
                    case 44:
                        zzlv.zzV(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, true);
                        break;
                    case 45:
                        zzlv.zzU(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, true);
                        break;
                    case 46:
                        zzlv.zzP(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, true);
                        break;
                    case 47:
                        zzlv.zzS(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, true);
                        break;
                    case 48:
                        zzlv.zzN(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, true);
                        break;
                    case 49:
                        zzlv.zzaa(this.zzc[i], (List) zzmr.zzn(t, zzA & 1048575), zzjlVar, zzv(i));
                        break;
                    case 50:
                        zzS(zzjlVar, i2, zzmr.zzn(t, zzA & 1048575), i);
                        break;
                    case 51:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzf(i2, zzD(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zze(i2, zzE(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzc(i2, zzG(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzh(i2, zzG(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzi(i2, zzF(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzj(i2, zzG(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzk(i2, zzF(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzl(i2, zzH(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzM(t, i2, i)) {
                            zzT(i2, zzmr.zzn(t, zzA & 1048575), zzjlVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzr(i2, zzmr.zzn(t, zzA & 1048575), zzv(i));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzn(i2, (zzjd) zzmr.zzn(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzo(i2, zzF(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzg(i2, zzF(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzb(i2, zzF(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzd(i2, zzG(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzp(i2, zzF(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzq(i2, zzG(t, zzA & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzM(t, i2, i)) {
                            zzjlVar.zzs(i2, zzmr.zzn(t, zzA & 1048575), zzv(i));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzmh<?, ?> zzmhVar = this.zzn;
            zzmhVar.zzi(zzmhVar.zzd(t), zzjlVar);
        } else {
            this.zzo.zzb(t);
            throw null;
        }
    }
}
