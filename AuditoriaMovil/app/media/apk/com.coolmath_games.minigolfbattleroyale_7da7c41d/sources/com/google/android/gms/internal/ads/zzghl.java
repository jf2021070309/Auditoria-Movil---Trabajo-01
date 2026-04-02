package com.google.android.gms.internal.ads;

import com.google.android.gms.drive.DriveFile;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzghl<T> implements zzghz<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgiy.zzt();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzghi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzggw zzn;
    private final zzgio<?, ?> zzo;
    private final zzgfn<?> zzp;
    private final zzghn zzq;
    private final zzghd zzr;

    /* JADX WARN: Multi-variable type inference failed */
    private zzghl(int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, zzghi zzghiVar, boolean z, boolean z2, int[] iArr3, int i3, int i4, zzghn zzghnVar, zzggw zzggwVar, zzgio<?, ?> zzgioVar, zzgfn<?> zzgfnVar, zzghd zzghdVar) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zze = objArr;
        this.zzf = i;
        this.zzi = i2 instanceof zzgga;
        this.zzj = zzghiVar;
        boolean z3 = false;
        if (zzgioVar != 0 && zzgioVar.zza((zzghi) i2)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = z2;
        this.zzl = iArr3;
        this.zzm = i3;
        this.zzq = i4;
        this.zzn = zzghnVar;
        this.zzo = zzggwVar;
        this.zzp = zzgioVar;
        this.zzg = i2;
        this.zzr = zzgfnVar;
    }

    private final <UT, UB> UB zzA(Object obj, int i, UB ub, zzgio<UT, UB> zzgioVar) {
        int i2 = this.zzc[i];
        Object zzn = zzgiy.zzn(obj, zzD(i) & 1048575);
        if (zzn == null || zzy(i) == null) {
            return ub;
        }
        zzghc zzghcVar = (zzghc) zzn;
        zzghb zzghbVar = (zzghb) zzx(i);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzB(Object obj, int i, zzghz zzghzVar) {
        return zzghzVar.zzk(zzgiy.zzn(obj, i & 1048575));
    }

    private final void zzC(Object obj, int i, zzght zzghtVar) throws IOException {
        if (zzG(i)) {
            zzgiy.zzo(obj, i & 1048575, zzghtVar.zzn());
        } else if (!this.zzi) {
            zzgiy.zzo(obj, i & 1048575, zzghtVar.zzq());
        } else {
            zzgiy.zzo(obj, i & 1048575, zzghtVar.zzm());
        }
    }

    private final int zzD(int i) {
        return this.zzc[i + 1];
    }

    private final int zzE(int i) {
        return this.zzc[i + 2];
    }

    private static int zzF(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzG(int i) {
        return (i & DriveFile.MODE_WRITE_ONLY) != 0;
    }

    private static <T> double zzH(T t, long j) {
        return ((Double) zzgiy.zzn(t, j)).doubleValue();
    }

    private static <T> float zzI(T t, long j) {
        return ((Float) zzgiy.zzn(t, j)).floatValue();
    }

    private static <T> int zzJ(T t, long j) {
        return ((Integer) zzgiy.zzn(t, j)).intValue();
    }

    private static <T> long zzK(T t, long j) {
        return ((Long) zzgiy.zzn(t, j)).longValue();
    }

    private static <T> boolean zzL(T t, long j) {
        return ((Boolean) zzgiy.zzn(t, j)).booleanValue();
    }

    private final boolean zzM(T t, T t2, int i) {
        return zzO(t, i) == zzO(t2, i);
    }

    private final boolean zzN(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzO(t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zzO(T t, int i) {
        int zzE = zzE(i);
        long j = zzE & 1048575;
        if (j != 1048575) {
            return (zzgiy.zzd(t, j) & (1 << (zzE >>> 20))) != 0;
        }
        int zzD = zzD(i);
        long j2 = zzD & 1048575;
        switch (zzF(zzD)) {
            case 0:
                return zzgiy.zzl(t, j2) != 0.0d;
            case 1:
                return zzgiy.zzj(t, j2) != 0.0f;
            case 2:
                return zzgiy.zzf(t, j2) != 0;
            case 3:
                return zzgiy.zzf(t, j2) != 0;
            case 4:
                return zzgiy.zzd(t, j2) != 0;
            case 5:
                return zzgiy.zzf(t, j2) != 0;
            case 6:
                return zzgiy.zzd(t, j2) != 0;
            case 7:
                return zzgiy.zzh(t, j2);
            case 8:
                Object zzn = zzgiy.zzn(t, j2);
                if (zzn instanceof String) {
                    return !((String) zzn).isEmpty();
                } else if (zzn instanceof zzgex) {
                    return !zzgex.zzb.equals(zzn);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzgiy.zzn(t, j2) != null;
            case 10:
                return !zzgex.zzb.equals(zzgiy.zzn(t, j2));
            case 11:
                return zzgiy.zzd(t, j2) != 0;
            case 12:
                return zzgiy.zzd(t, j2) != 0;
            case 13:
                return zzgiy.zzd(t, j2) != 0;
            case 14:
                return zzgiy.zzf(t, j2) != 0;
            case 15:
                return zzgiy.zzd(t, j2) != 0;
            case 16:
                return zzgiy.zzf(t, j2) != 0;
            case 17:
                return zzgiy.zzn(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzP(T t, int i) {
        int zzE = zzE(i);
        long j = 1048575 & zzE;
        if (j == 1048575) {
            return;
        }
        zzgiy.zze(t, j, (1 << (zzE >>> 20)) | zzgiy.zzd(t, j));
    }

    private final boolean zzQ(T t, int i, int i2) {
        return zzgiy.zzd(t, (long) (zzE(i2) & 1048575)) == i;
    }

    private final void zzR(T t, int i, int i2) {
        zzgiy.zze(t, zzE(i2) & 1048575, i);
    }

    private final int zzS(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzU(i, 0);
    }

    private final int zzT(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzU(i, i2);
    }

    private final int zzU(int i, int i2) {
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
    private final void zzV(T t, zzgfi zzgfiVar) throws IOException {
        int i;
        boolean z;
        if (this.zzh) {
            this.zzp.zzb(t);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int zzD = zzD(i4);
            int i6 = this.zzc[i4];
            int zzF = zzF(zzD);
            if (zzF <= 17) {
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
            long j = zzD & i2;
            switch (zzF) {
                case 0:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzf(i6, zzgiy.zzl(t, j));
                        break;
                    }
                case 1:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zze(i6, zzgiy.zzj(t, j));
                        break;
                    }
                case 2:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzc(i6, unsafe.getLong(t, j));
                        break;
                    }
                case 3:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzh(i6, unsafe.getLong(t, j));
                        break;
                    }
                case 4:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzi(i6, unsafe.getInt(t, j));
                        break;
                    }
                case 5:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzj(i6, unsafe.getLong(t, j));
                        break;
                    }
                case 6:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzk(i6, unsafe.getInt(t, j));
                        break;
                    }
                case 7:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzl(i6, zzgiy.zzh(t, j));
                        break;
                    }
                case 8:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzX(i6, unsafe.getObject(t, j), zzgfiVar);
                        break;
                    }
                case 9:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzr(i6, unsafe.getObject(t, j), zzw(i4));
                        break;
                    }
                case 10:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzn(i6, (zzgex) unsafe.getObject(t, j));
                        break;
                    }
                case 11:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzo(i6, unsafe.getInt(t, j));
                        break;
                    }
                case 12:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzg(i6, unsafe.getInt(t, j));
                        break;
                    }
                case 13:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzb(i6, unsafe.getInt(t, j));
                        break;
                    }
                case 14:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzd(i6, unsafe.getLong(t, j));
                        break;
                    }
                case 15:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzp(i6, unsafe.getInt(t, j));
                        break;
                    }
                case 16:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzq(i6, unsafe.getLong(t, j));
                        break;
                    }
                case 17:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgfiVar.zzs(i6, unsafe.getObject(t, j), zzw(i4));
                        break;
                    }
                case 18:
                    zzgib.zzJ(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 19:
                    zzgib.zzK(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 20:
                    zzgib.zzL(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 21:
                    zzgib.zzM(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 22:
                    zzgib.zzQ(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 23:
                    zzgib.zzO(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 24:
                    zzgib.zzT(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 25:
                    zzgib.zzW(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 26:
                    zzgib.zzX(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar);
                    break;
                case 27:
                    zzgib.zzZ(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, zzw(i4));
                    break;
                case 28:
                    zzgib.zzY(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar);
                    break;
                case 29:
                    z = false;
                    zzgib.zzR(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 30:
                    z = false;
                    zzgib.zzV(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 31:
                    z = false;
                    zzgib.zzU(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 32:
                    z = false;
                    zzgib.zzP(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 33:
                    z = false;
                    zzgib.zzS(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 34:
                    z = false;
                    zzgib.zzN(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 35:
                    zzgib.zzJ(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 36:
                    zzgib.zzK(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 37:
                    zzgib.zzL(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 38:
                    zzgib.zzM(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 39:
                    zzgib.zzQ(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 40:
                    zzgib.zzO(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 41:
                    zzgib.zzT(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 42:
                    zzgib.zzW(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 43:
                    zzgib.zzR(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 44:
                    zzgib.zzV(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 45:
                    zzgib.zzU(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 46:
                    zzgib.zzP(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 47:
                    zzgib.zzS(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 48:
                    zzgib.zzN(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 49:
                    zzgib.zzaa(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, zzw(i4));
                    break;
                case 50:
                    zzW(zzgfiVar, i6, unsafe.getObject(t, j), i4);
                    break;
                case 51:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzf(i6, zzH(t, j));
                    }
                    break;
                case 52:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zze(i6, zzI(t, j));
                    }
                    break;
                case 53:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzc(i6, zzK(t, j));
                    }
                    break;
                case 54:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzh(i6, zzK(t, j));
                    }
                    break;
                case 55:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzi(i6, zzJ(t, j));
                    }
                    break;
                case 56:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzj(i6, zzK(t, j));
                    }
                    break;
                case 57:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzk(i6, zzJ(t, j));
                    }
                    break;
                case 58:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzl(i6, zzL(t, j));
                    }
                    break;
                case 59:
                    if (zzQ(t, i6, i4)) {
                        zzX(i6, unsafe.getObject(t, j), zzgfiVar);
                    }
                    break;
                case 60:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzr(i6, unsafe.getObject(t, j), zzw(i4));
                    }
                    break;
                case 61:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzn(i6, (zzgex) unsafe.getObject(t, j));
                    }
                    break;
                case 62:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzo(i6, zzJ(t, j));
                    }
                    break;
                case 63:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzg(i6, zzJ(t, j));
                    }
                    break;
                case 64:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzb(i6, zzJ(t, j));
                    }
                    break;
                case 65:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzd(i6, zzK(t, j));
                    }
                    break;
                case 66:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzp(i6, zzJ(t, j));
                    }
                    break;
                case 67:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzq(i6, zzK(t, j));
                    }
                    break;
                case 68:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzs(i6, unsafe.getObject(t, j), zzw(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzgio<?, ?> zzgioVar = this.zzo;
        zzgioVar.zzr(zzgioVar.zzj(t), zzgfiVar);
    }

    private final <K, V> void zzW(zzgfi zzgfiVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzghb zzghbVar = (zzghb) zzx(i2);
        throw null;
    }

    private static final void zzX(int i, Object obj, zzgfi zzgfiVar) throws IOException {
        if (obj instanceof String) {
            zzgfiVar.zzm(i, (String) obj);
        } else {
            zzgfiVar.zzn(i, (zzgex) obj);
        }
    }

    static zzgip zzg(Object obj) {
        zzgga zzggaVar = (zzgga) obj;
        zzgip zzgipVar = zzggaVar.zzc;
        if (zzgipVar == zzgip.zza()) {
            zzgip zzb2 = zzgip.zzb();
            zzggaVar.zzc = zzb2;
            return zzb2;
        }
        return zzgipVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzghl<T> zzl(Class<T> cls, zzghf zzghfVar, zzghn zzghnVar, zzggw zzggwVar, zzgio<?, ?> zzgioVar, zzgfn<?> zzgfnVar, zzghd zzghdVar) {
        if (zzghfVar instanceof zzghs) {
            return zzm((zzghs) zzghfVar, zzghnVar, zzggwVar, zzgioVar, zzgfnVar, zzghdVar);
        }
        zzgil zzgilVar = (zzgil) zzghfVar;
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
    static <T> com.google.android.gms.internal.ads.zzghl<T> zzm(com.google.android.gms.internal.ads.zzghs r34, com.google.android.gms.internal.ads.zzghn r35, com.google.android.gms.internal.ads.zzggw r36, com.google.android.gms.internal.ads.zzgio<?, ?> r37, com.google.android.gms.internal.ads.zzgfn<?> r38, com.google.android.gms.internal.ads.zzghd r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzghl.zzm(com.google.android.gms.internal.ads.zzghs, com.google.android.gms.internal.ads.zzghn, com.google.android.gms.internal.ads.zzggw, com.google.android.gms.internal.ads.zzgio, com.google.android.gms.internal.ads.zzgfn, com.google.android.gms.internal.ads.zzghd):com.google.android.gms.internal.ads.zzghl");
    }

    private static Field zzo(Class<?> cls, String str) {
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

    private final void zzp(T t, T t2, int i) {
        long zzD = zzD(i) & 1048575;
        if (zzO(t2, i)) {
            Object zzn = zzgiy.zzn(t, zzD);
            Object zzn2 = zzgiy.zzn(t2, zzD);
            if (zzn != null && zzn2 != null) {
                zzgiy.zzo(t, zzD, zzggk.zzi(zzn, zzn2));
                zzP(t, i);
            } else if (zzn2 != null) {
                zzgiy.zzo(t, zzD, zzn2);
                zzP(t, i);
            }
        }
    }

    private final void zzq(T t, T t2, int i) {
        int zzD = zzD(i);
        int i2 = this.zzc[i];
        long j = zzD & 1048575;
        if (zzQ(t2, i2, i)) {
            Object zzn = zzQ(t, i2, i) ? zzgiy.zzn(t, j) : null;
            Object zzn2 = zzgiy.zzn(t2, j);
            if (zzn != null && zzn2 != null) {
                zzgiy.zzo(t, j, zzggk.zzi(zzn, zzn2));
                zzR(t, i2, i);
            } else if (zzn2 != null) {
                zzgiy.zzo(t, j, zzn2);
                zzR(t, i2, i);
            }
        }
    }

    private final int zzr(T t) {
        int i;
        int zzx;
        int zzx2;
        int zzx3;
        int zzy;
        int zzx4;
        int zzw;
        int zzx5;
        int zzx6;
        int zzc;
        int zzx7;
        int zzw2;
        int zzv;
        int zzx8;
        int i2;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int zzD = zzD(i6);
            int i7 = this.zzc[i6];
            int zzF = zzF(zzD);
            if (zzF <= 17) {
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
            long j = zzD & 1048575;
            switch (zzF) {
                case 0:
                    if ((i5 & i) != 0) {
                        zzx = zzgfh.zzx(i7 << 3);
                        zzw2 = zzx + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if ((i5 & i) != 0) {
                        zzx2 = zzgfh.zzx(i7 << 3);
                        zzw2 = zzx2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i5 & i) != 0) {
                        long j2 = unsafe.getLong(t, j);
                        zzx3 = zzgfh.zzx(i7 << 3);
                        zzy = zzgfh.zzy(j2);
                        zzw2 = zzx3 + zzy;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i5 & i) != 0) {
                        long j3 = unsafe.getLong(t, j);
                        zzx3 = zzgfh.zzx(i7 << 3);
                        zzy = zzgfh.zzy(j3);
                        zzw2 = zzx3 + zzy;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i5 & i) != 0) {
                        int i10 = unsafe.getInt(t, j);
                        zzx4 = zzgfh.zzx(i7 << 3);
                        zzw = zzgfh.zzw(i10);
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i5 & i) != 0) {
                        zzx = zzgfh.zzx(i7 << 3);
                        zzw2 = zzx + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i5 & i) != 0) {
                        zzx2 = zzgfh.zzx(i7 << 3);
                        zzw2 = zzx2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i5 & i) != 0) {
                        zzx5 = zzgfh.zzx(i7 << 3);
                        zzw2 = zzx5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i5 & i) != 0) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof zzgex) {
                            zzx6 = zzgfh.zzx(i7 << 3);
                            zzc = ((zzgex) object).zzc();
                            zzx7 = zzgfh.zzx(zzc);
                            i2 = zzx6 + zzx7 + zzc;
                            i4 += i2;
                        } else {
                            zzx4 = zzgfh.zzx(i7 << 3);
                            zzw = zzgfh.zzz((String) object);
                            i2 = zzx4 + zzw;
                            i4 += i2;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if ((i5 & i) != 0) {
                        zzw2 = zzgib.zzw(i7, unsafe.getObject(t, j), zzw(i6));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i5 & i) != 0) {
                        zzx6 = zzgfh.zzx(i7 << 3);
                        zzc = ((zzgex) unsafe.getObject(t, j)).zzc();
                        zzx7 = zzgfh.zzx(zzc);
                        i2 = zzx6 + zzx7 + zzc;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i5 & i) != 0) {
                        int i11 = unsafe.getInt(t, j);
                        zzx4 = zzgfh.zzx(i7 << 3);
                        zzw = zzgfh.zzx(i11);
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i5 & i) != 0) {
                        int i12 = unsafe.getInt(t, j);
                        zzx4 = zzgfh.zzx(i7 << 3);
                        zzw = zzgfh.zzw(i12);
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i5 & i) != 0) {
                        zzx2 = zzgfh.zzx(i7 << 3);
                        zzw2 = zzx2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i5 & i) != 0) {
                        zzx = zzgfh.zzx(i7 << 3);
                        zzw2 = zzx + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i5 & i) != 0) {
                        int i13 = unsafe.getInt(t, j);
                        zzx4 = zzgfh.zzx(i7 << 3);
                        zzw = zzgfh.zzx((i13 >> 31) ^ (i13 + i13));
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i5 & i) != 0) {
                        long j4 = unsafe.getLong(t, j);
                        zzx4 = zzgfh.zzx(i7 << 3);
                        zzw = zzgfh.zzy((j4 >> 63) ^ (j4 + j4));
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i5 & i) != 0) {
                        zzw2 = zzgfh.zzF(i7, (zzghi) unsafe.getObject(t, j), zzw(i6));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    zzw2 = zzgib.zzs(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 19:
                    zzw2 = zzgib.zzq(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 20:
                    zzw2 = zzgib.zzc(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 21:
                    zzw2 = zzgib.zze(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 22:
                    zzw2 = zzgib.zzk(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 23:
                    zzw2 = zzgib.zzs(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 24:
                    zzw2 = zzgib.zzq(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 25:
                    zzw2 = zzgib.zzu(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 26:
                    zzw2 = zzgib.zzv(i7, (List) unsafe.getObject(t, j));
                    break;
                case 27:
                    zzw2 = zzgib.zzx(i7, (List) unsafe.getObject(t, j), zzw(i6));
                    break;
                case 28:
                    zzw2 = zzgib.zzy(i7, (List) unsafe.getObject(t, j));
                    break;
                case 29:
                    zzw2 = zzgib.zzm(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 30:
                    zzw2 = zzgib.zzi(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 31:
                    zzw2 = zzgib.zzq(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 32:
                    zzw2 = zzgib.zzs(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 33:
                    zzw2 = zzgib.zzo(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 34:
                    zzw2 = zzgib.zzg(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 35:
                    zzw = zzgib.zzr((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i7);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 36:
                    zzw = zzgib.zzp((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i7);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 37:
                    zzw = zzgib.zzb((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i7);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 38:
                    zzw = zzgib.zzd((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i7);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 39:
                    zzw = zzgib.zzj((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i7);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 40:
                    zzw = zzgib.zzr((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i7);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 41:
                    zzw = zzgib.zzp((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i7);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 42:
                    zzw = zzgib.zzt((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i7);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 43:
                    zzw = zzgib.zzl((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i7);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 44:
                    zzw = zzgib.zzh((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i7);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 45:
                    zzw = zzgib.zzp((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i7);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 46:
                    zzw = zzgib.zzr((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i7);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 47:
                    zzw = zzgib.zzn((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i7);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 48:
                    zzw = zzgib.zzf((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i7);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 49:
                    zzw2 = zzgib.zzz(i7, (List) unsafe.getObject(t, j), zzw(i6));
                    break;
                case 50:
                    zzghd.zza(i7, unsafe.getObject(t, j), zzx(i6));
                    continue;
                case 51:
                    if (zzQ(t, i7, i6)) {
                        zzx = zzgfh.zzx(i7 << 3);
                        zzw2 = zzx + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (zzQ(t, i7, i6)) {
                        zzx2 = zzgfh.zzx(i7 << 3);
                        zzw2 = zzx2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (zzQ(t, i7, i6)) {
                        long zzK = zzK(t, j);
                        zzx3 = zzgfh.zzx(i7 << 3);
                        zzy = zzgfh.zzy(zzK);
                        zzw2 = zzx3 + zzy;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (zzQ(t, i7, i6)) {
                        long zzK2 = zzK(t, j);
                        zzx3 = zzgfh.zzx(i7 << 3);
                        zzy = zzgfh.zzy(zzK2);
                        zzw2 = zzx3 + zzy;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (zzQ(t, i7, i6)) {
                        int zzJ = zzJ(t, j);
                        zzx4 = zzgfh.zzx(i7 << 3);
                        zzw = zzgfh.zzw(zzJ);
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 56:
                    if (zzQ(t, i7, i6)) {
                        zzx = zzgfh.zzx(i7 << 3);
                        zzw2 = zzx + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (zzQ(t, i7, i6)) {
                        zzx2 = zzgfh.zzx(i7 << 3);
                        zzw2 = zzx2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (zzQ(t, i7, i6)) {
                        zzx5 = zzgfh.zzx(i7 << 3);
                        zzw2 = zzx5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (zzQ(t, i7, i6)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof zzgex) {
                            zzx6 = zzgfh.zzx(i7 << 3);
                            zzc = ((zzgex) object2).zzc();
                            zzx7 = zzgfh.zzx(zzc);
                            i2 = zzx6 + zzx7 + zzc;
                            i4 += i2;
                        } else {
                            zzx4 = zzgfh.zzx(i7 << 3);
                            zzw = zzgfh.zzz((String) object2);
                            i2 = zzx4 + zzw;
                            i4 += i2;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (zzQ(t, i7, i6)) {
                        zzw2 = zzgib.zzw(i7, unsafe.getObject(t, j), zzw(i6));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (zzQ(t, i7, i6)) {
                        zzx6 = zzgfh.zzx(i7 << 3);
                        zzc = ((zzgex) unsafe.getObject(t, j)).zzc();
                        zzx7 = zzgfh.zzx(zzc);
                        i2 = zzx6 + zzx7 + zzc;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 62:
                    if (zzQ(t, i7, i6)) {
                        int zzJ2 = zzJ(t, j);
                        zzx4 = zzgfh.zzx(i7 << 3);
                        zzw = zzgfh.zzx(zzJ2);
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 63:
                    if (zzQ(t, i7, i6)) {
                        int zzJ3 = zzJ(t, j);
                        zzx4 = zzgfh.zzx(i7 << 3);
                        zzw = zzgfh.zzw(zzJ3);
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 64:
                    if (zzQ(t, i7, i6)) {
                        zzx2 = zzgfh.zzx(i7 << 3);
                        zzw2 = zzx2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (zzQ(t, i7, i6)) {
                        zzx = zzgfh.zzx(i7 << 3);
                        zzw2 = zzx + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (zzQ(t, i7, i6)) {
                        int zzJ4 = zzJ(t, j);
                        zzx4 = zzgfh.zzx(i7 << 3);
                        zzw = zzgfh.zzx((zzJ4 >> 31) ^ (zzJ4 + zzJ4));
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 67:
                    if (zzQ(t, i7, i6)) {
                        long zzK3 = zzK(t, j);
                        zzx4 = zzgfh.zzx(i7 << 3);
                        zzw = zzgfh.zzy((zzK3 >> 63) ^ (zzK3 + zzK3));
                        i2 = zzx4 + zzw;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 68:
                    if (zzQ(t, i7, i6)) {
                        zzw2 = zzgfh.zzF(i7, (zzghi) unsafe.getObject(t, j), zzw(i6));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i4 += zzw2;
        }
        zzgio<?, ?> zzgioVar = this.zzo;
        int zzq = i4 + zzgioVar.zzq(zzgioVar.zzj(t));
        if (this.zzh) {
            this.zzp.zzb(t);
            throw null;
        }
        return zzq;
    }

    private final int zzs(T t) {
        int zzx;
        int zzx2;
        int zzx3;
        int zzy;
        int zzx4;
        int zzw;
        int zzx5;
        int zzx6;
        int zzc;
        int zzx7;
        int zzw2;
        int zzv;
        int zzx8;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int zzD = zzD(i3);
            int zzF = zzF(zzD);
            int i4 = this.zzc[i3];
            long j = zzD & 1048575;
            if (zzF >= zzgfs.DOUBLE_LIST_PACKED.zza() && zzF <= zzgfs.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (zzF) {
                case 0:
                    if (zzO(t, i3)) {
                        zzx = zzgfh.zzx(i4 << 3);
                        zzw2 = zzx + 8;
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(t, i3)) {
                        zzx2 = zzgfh.zzx(i4 << 3);
                        zzw2 = zzx2 + 4;
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(t, i3)) {
                        long zzf = zzgiy.zzf(t, j);
                        zzx3 = zzgfh.zzx(i4 << 3);
                        zzy = zzgfh.zzy(zzf);
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(t, i3)) {
                        long zzf2 = zzgiy.zzf(t, j);
                        zzx3 = zzgfh.zzx(i4 << 3);
                        zzy = zzgfh.zzy(zzf2);
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(t, i3)) {
                        int zzd = zzgiy.zzd(t, j);
                        zzx4 = zzgfh.zzx(i4 << 3);
                        zzw = zzgfh.zzw(zzd);
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(t, i3)) {
                        zzx = zzgfh.zzx(i4 << 3);
                        zzw2 = zzx + 8;
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(t, i3)) {
                        zzx2 = zzgfh.zzx(i4 << 3);
                        zzw2 = zzx2 + 4;
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(t, i3)) {
                        zzx5 = zzgfh.zzx(i4 << 3);
                        zzw2 = zzx5 + 1;
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzO(t, i3)) {
                        break;
                    } else {
                        Object zzn = zzgiy.zzn(t, j);
                        if (zzn instanceof zzgex) {
                            zzx6 = zzgfh.zzx(i4 << 3);
                            zzc = ((zzgex) zzn).zzc();
                            zzx7 = zzgfh.zzx(zzc);
                            i = zzx6 + zzx7 + zzc;
                            i2 += i;
                            break;
                        } else {
                            zzx4 = zzgfh.zzx(i4 << 3);
                            zzw = zzgfh.zzz((String) zzn);
                            i = zzx4 + zzw;
                            i2 += i;
                        }
                    }
                case 9:
                    if (zzO(t, i3)) {
                        zzw2 = zzgib.zzw(i4, zzgiy.zzn(t, j), zzw(i3));
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(t, i3)) {
                        zzx6 = zzgfh.zzx(i4 << 3);
                        zzc = ((zzgex) zzgiy.zzn(t, j)).zzc();
                        zzx7 = zzgfh.zzx(zzc);
                        i = zzx6 + zzx7 + zzc;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(t, i3)) {
                        int zzd2 = zzgiy.zzd(t, j);
                        zzx4 = zzgfh.zzx(i4 << 3);
                        zzw = zzgfh.zzx(zzd2);
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(t, i3)) {
                        int zzd3 = zzgiy.zzd(t, j);
                        zzx4 = zzgfh.zzx(i4 << 3);
                        zzw = zzgfh.zzw(zzd3);
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(t, i3)) {
                        zzx2 = zzgfh.zzx(i4 << 3);
                        zzw2 = zzx2 + 4;
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(t, i3)) {
                        zzx = zzgfh.zzx(i4 << 3);
                        zzw2 = zzx + 8;
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(t, i3)) {
                        int zzd4 = zzgiy.zzd(t, j);
                        zzx4 = zzgfh.zzx(i4 << 3);
                        zzw = zzgfh.zzx((zzd4 >> 31) ^ (zzd4 + zzd4));
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(t, i3)) {
                        long zzf3 = zzgiy.zzf(t, j);
                        zzx4 = zzgfh.zzx(i4 << 3);
                        zzw = zzgfh.zzy((zzf3 >> 63) ^ (zzf3 + zzf3));
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(t, i3)) {
                        zzw2 = zzgfh.zzF(i4, (zzghi) zzgiy.zzn(t, j), zzw(i3));
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzw2 = zzgib.zzs(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += zzw2;
                    break;
                case 19:
                    zzw2 = zzgib.zzq(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += zzw2;
                    break;
                case 20:
                    zzw2 = zzgib.zzc(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += zzw2;
                    break;
                case 21:
                    zzw2 = zzgib.zze(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += zzw2;
                    break;
                case 22:
                    zzw2 = zzgib.zzk(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += zzw2;
                    break;
                case 23:
                    zzw2 = zzgib.zzs(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += zzw2;
                    break;
                case 24:
                    zzw2 = zzgib.zzq(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += zzw2;
                    break;
                case 25:
                    zzw2 = zzgib.zzu(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += zzw2;
                    break;
                case 26:
                    zzw2 = zzgib.zzv(i4, (List) zzgiy.zzn(t, j));
                    i2 += zzw2;
                    break;
                case 27:
                    zzw2 = zzgib.zzx(i4, (List) zzgiy.zzn(t, j), zzw(i3));
                    i2 += zzw2;
                    break;
                case 28:
                    zzw2 = zzgib.zzy(i4, (List) zzgiy.zzn(t, j));
                    i2 += zzw2;
                    break;
                case 29:
                    zzw2 = zzgib.zzm(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += zzw2;
                    break;
                case 30:
                    zzw2 = zzgib.zzi(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += zzw2;
                    break;
                case 31:
                    zzw2 = zzgib.zzq(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += zzw2;
                    break;
                case 32:
                    zzw2 = zzgib.zzs(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += zzw2;
                    break;
                case 33:
                    zzw2 = zzgib.zzo(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += zzw2;
                    break;
                case 34:
                    zzw2 = zzgib.zzg(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += zzw2;
                    break;
                case 35:
                    zzw = zzgib.zzr((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i4);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzw = zzgib.zzp((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i4);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzw = zzgib.zzb((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i4);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzw = zzgib.zzd((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i4);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzw = zzgib.zzj((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i4);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzw = zzgib.zzr((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i4);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzw = zzgib.zzp((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i4);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzw = zzgib.zzt((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i4);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzw = zzgib.zzl((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i4);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzw = zzgib.zzh((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i4);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzw = zzgib.zzp((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i4);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzw = zzgib.zzr((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i4);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzw = zzgib.zzn((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i4);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzw = zzgib.zzf((List) unsafe.getObject(t, j));
                    if (zzw > 0) {
                        zzv = zzgfh.zzv(i4);
                        zzx8 = zzgfh.zzx(zzw);
                        zzx4 = zzv + zzx8;
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzw2 = zzgib.zzz(i4, (List) zzgiy.zzn(t, j), zzw(i3));
                    i2 += zzw2;
                    break;
                case 50:
                    zzghd.zza(i4, zzgiy.zzn(t, j), zzx(i3));
                    break;
                case 51:
                    if (zzQ(t, i4, i3)) {
                        zzx = zzgfh.zzx(i4 << 3);
                        zzw2 = zzx + 8;
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzQ(t, i4, i3)) {
                        zzx2 = zzgfh.zzx(i4 << 3);
                        zzw2 = zzx2 + 4;
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzQ(t, i4, i3)) {
                        long zzK = zzK(t, j);
                        zzx3 = zzgfh.zzx(i4 << 3);
                        zzy = zzgfh.zzy(zzK);
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzQ(t, i4, i3)) {
                        long zzK2 = zzK(t, j);
                        zzx3 = zzgfh.zzx(i4 << 3);
                        zzy = zzgfh.zzy(zzK2);
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzQ(t, i4, i3)) {
                        int zzJ = zzJ(t, j);
                        zzx4 = zzgfh.zzx(i4 << 3);
                        zzw = zzgfh.zzw(zzJ);
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzQ(t, i4, i3)) {
                        zzx = zzgfh.zzx(i4 << 3);
                        zzw2 = zzx + 8;
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzQ(t, i4, i3)) {
                        zzx2 = zzgfh.zzx(i4 << 3);
                        zzw2 = zzx2 + 4;
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzQ(t, i4, i3)) {
                        zzx5 = zzgfh.zzx(i4 << 3);
                        zzw2 = zzx5 + 1;
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzQ(t, i4, i3)) {
                        break;
                    } else {
                        Object zzn2 = zzgiy.zzn(t, j);
                        if (zzn2 instanceof zzgex) {
                            zzx6 = zzgfh.zzx(i4 << 3);
                            zzc = ((zzgex) zzn2).zzc();
                            zzx7 = zzgfh.zzx(zzc);
                            i = zzx6 + zzx7 + zzc;
                            i2 += i;
                            break;
                        } else {
                            zzx4 = zzgfh.zzx(i4 << 3);
                            zzw = zzgfh.zzz((String) zzn2);
                            i = zzx4 + zzw;
                            i2 += i;
                        }
                    }
                case 60:
                    if (zzQ(t, i4, i3)) {
                        zzw2 = zzgib.zzw(i4, zzgiy.zzn(t, j), zzw(i3));
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzQ(t, i4, i3)) {
                        zzx6 = zzgfh.zzx(i4 << 3);
                        zzc = ((zzgex) zzgiy.zzn(t, j)).zzc();
                        zzx7 = zzgfh.zzx(zzc);
                        i = zzx6 + zzx7 + zzc;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzQ(t, i4, i3)) {
                        int zzJ2 = zzJ(t, j);
                        zzx4 = zzgfh.zzx(i4 << 3);
                        zzw = zzgfh.zzx(zzJ2);
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzQ(t, i4, i3)) {
                        int zzJ3 = zzJ(t, j);
                        zzx4 = zzgfh.zzx(i4 << 3);
                        zzw = zzgfh.zzw(zzJ3);
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzQ(t, i4, i3)) {
                        zzx2 = zzgfh.zzx(i4 << 3);
                        zzw2 = zzx2 + 4;
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzQ(t, i4, i3)) {
                        zzx = zzgfh.zzx(i4 << 3);
                        zzw2 = zzx + 8;
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzQ(t, i4, i3)) {
                        int zzJ4 = zzJ(t, j);
                        zzx4 = zzgfh.zzx(i4 << 3);
                        zzw = zzgfh.zzx((zzJ4 >> 31) ^ (zzJ4 + zzJ4));
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzQ(t, i4, i3)) {
                        long zzK3 = zzK(t, j);
                        zzx4 = zzgfh.zzx(i4 << 3);
                        zzw = zzgfh.zzy((zzK3 >> 63) ^ (zzK3 + zzK3));
                        i = zzx4 + zzw;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzQ(t, i4, i3)) {
                        zzw2 = zzgfh.zzF(i4, (zzghi) zzgiy.zzn(t, j), zzw(i3));
                        i2 += zzw2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzgio<?, ?> zzgioVar = this.zzo;
        return i2 + zzgioVar.zzq(zzgioVar.zzj(t));
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
    private final int zzt(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.ads.zzgej r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzghl.zzt(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.zzgej):int");
    }

    private final <K, V> int zzu(T t, byte[] bArr, int i, int i2, int i3, long j, zzgej zzgejVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzx = zzx(i3);
        Object object = unsafe.getObject(t, j);
        if (zzghd.zzb(object)) {
            zzghc<K, V> zzc = zzghc.zza().zzc();
            zzghd.zzc(zzc, object);
            unsafe.putObject(t, j, zzc);
        }
        zzghb zzghbVar = (zzghb) zzx;
        throw null;
    }

    private final int zzv(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzgej zzgejVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(zzgek.zze(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(zzgek.zzd(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzc = zzgek.zzc(bArr, i, zzgejVar);
                    unsafe.putObject(t, j, Long.valueOf(zzgejVar.zzb));
                    unsafe.putInt(t, j2, i4);
                    return zzc;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zza2 = zzgek.zza(bArr, i, zzgejVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzgejVar.zza));
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzgek.zze(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzgek.zzd(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzc2 = zzgek.zzc(bArr, i, zzgejVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzgejVar.zzb != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzc2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zza3 = zzgek.zza(bArr, i, zzgejVar);
                    int i9 = zzgejVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & DriveFile.MODE_WRITE_ONLY) == 0 || zzgjd.zzb(bArr, zza3, zza3 + i9)) {
                        unsafe.putObject(t, j, new String(bArr, zza3, i9, zzggk.zza));
                        zza3 += i9;
                    } else {
                        throw zzggm.zzl();
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza3;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int zzi = zzgek.zzi(zzw(i8), bArr, i, i2, zzgejVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzgejVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzggk.zzi(object, zzgejVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzi;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zzh = zzgek.zzh(bArr, i, zzgejVar);
                    unsafe.putObject(t, j, zzgejVar.zzc);
                    unsafe.putInt(t, j2, i4);
                    return zzh;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zza4 = zzgek.zza(bArr, i, zzgejVar);
                    int i10 = zzgejVar.zza;
                    zzgge zzy = zzy(i8);
                    if (zzy == null || zzy.zza(i10)) {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        unsafe.putInt(t, j2, i4);
                    } else {
                        zzg(t).zzh(i3, Long.valueOf(i10));
                    }
                    return zza4;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zza5 = zzgek.zza(bArr, i, zzgejVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzgfc.zzG(zzgejVar.zza)));
                    unsafe.putInt(t, j2, i4);
                    return zza5;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzc3 = zzgek.zzc(bArr, i, zzgejVar);
                    unsafe.putObject(t, j, Long.valueOf(zzgfc.zzH(zzgejVar.zzb)));
                    unsafe.putInt(t, j2, i4);
                    return zzc3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int zzj = zzgek.zzj(zzw(i8), bArr, i, i2, (i3 & (-8)) | 4, zzgejVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzgejVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzggk.zzi(object2, zzgejVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzj;
                }
                break;
        }
        return i;
    }

    private final zzghz zzw(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzghz zzghzVar = (zzghz) this.zzd[i3];
        if (zzghzVar != null) {
            return zzghzVar;
        }
        zzghz<T> zzb2 = zzghq.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzx(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzgge zzy(int i) {
        int i2 = i / 3;
        return (zzgge) this.zzd[i2 + i2 + 1];
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
    private final int zzz(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.zzgej r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzghl.zzz(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzgej):int");
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final T zza() {
        return (T) ((zzgga) this.zzg).zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final boolean zzb(T t, T t2) {
        boolean zzD;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzD2 = zzD(i);
            long j = zzD2 & 1048575;
            switch (zzF(zzD2)) {
                case 0:
                    if (zzM(t, t2, i) && Double.doubleToLongBits(zzgiy.zzl(t, j)) == Double.doubleToLongBits(zzgiy.zzl(t2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzM(t, t2, i) && Float.floatToIntBits(zzgiy.zzj(t, j)) == Float.floatToIntBits(zzgiy.zzj(t2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzM(t, t2, i) && zzgiy.zzf(t, j) == zzgiy.zzf(t2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzM(t, t2, i) && zzgiy.zzf(t, j) == zzgiy.zzf(t2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzM(t, t2, i) && zzgiy.zzd(t, j) == zzgiy.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzM(t, t2, i) && zzgiy.zzf(t, j) == zzgiy.zzf(t2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzM(t, t2, i) && zzgiy.zzd(t, j) == zzgiy.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzM(t, t2, i) && zzgiy.zzh(t, j) == zzgiy.zzh(t2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzM(t, t2, i) && zzgib.zzD(zzgiy.zzn(t, j), zzgiy.zzn(t2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzM(t, t2, i) && zzgib.zzD(zzgiy.zzn(t, j), zzgiy.zzn(t2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzM(t, t2, i) && zzgib.zzD(zzgiy.zzn(t, j), zzgiy.zzn(t2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzM(t, t2, i) && zzgiy.zzd(t, j) == zzgiy.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzM(t, t2, i) && zzgiy.zzd(t, j) == zzgiy.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzM(t, t2, i) && zzgiy.zzd(t, j) == zzgiy.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzM(t, t2, i) && zzgiy.zzf(t, j) == zzgiy.zzf(t2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzM(t, t2, i) && zzgiy.zzd(t, j) == zzgiy.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzM(t, t2, i) && zzgiy.zzf(t, j) == zzgiy.zzf(t2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzM(t, t2, i) && zzgib.zzD(zzgiy.zzn(t, j), zzgiy.zzn(t2, j))) {
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
                    zzD = zzgib.zzD(zzgiy.zzn(t, j), zzgiy.zzn(t2, j));
                    break;
                case 50:
                    zzD = zzgib.zzD(zzgiy.zzn(t, j), zzgiy.zzn(t2, j));
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
                    long zzE = zzE(i) & 1048575;
                    if (zzgiy.zzd(t, zzE) == zzgiy.zzd(t2, zzE) && zzgib.zzD(zzgiy.zzn(t, j), zzgiy.zzn(t2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzD) {
                return false;
            }
        }
        if (this.zzo.zzj(t).equals(this.zzo.zzj(t2))) {
            if (this.zzh) {
                this.zzp.zzb(t);
                this.zzp.zzb(t2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final int zzc(T t) {
        int i;
        int zze;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzD = zzD(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzD;
            int i5 = 37;
            switch (zzF(zzD)) {
                case 0:
                    i = i2 * 53;
                    zze = zzggk.zze(Double.doubleToLongBits(zzgiy.zzl(t, j)));
                    i2 = i + zze;
                    break;
                case 1:
                    i = i2 * 53;
                    zze = Float.floatToIntBits(zzgiy.zzj(t, j));
                    i2 = i + zze;
                    break;
                case 2:
                    i = i2 * 53;
                    zze = zzggk.zze(zzgiy.zzf(t, j));
                    i2 = i + zze;
                    break;
                case 3:
                    i = i2 * 53;
                    zze = zzggk.zze(zzgiy.zzf(t, j));
                    i2 = i + zze;
                    break;
                case 4:
                    i = i2 * 53;
                    zze = zzgiy.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 5:
                    i = i2 * 53;
                    zze = zzggk.zze(zzgiy.zzf(t, j));
                    i2 = i + zze;
                    break;
                case 6:
                    i = i2 * 53;
                    zze = zzgiy.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 7:
                    i = i2 * 53;
                    zze = zzggk.zzf(zzgiy.zzh(t, j));
                    i2 = i + zze;
                    break;
                case 8:
                    i = i2 * 53;
                    zze = ((String) zzgiy.zzn(t, j)).hashCode();
                    i2 = i + zze;
                    break;
                case 9:
                    Object zzn = zzgiy.zzn(t, j);
                    if (zzn != null) {
                        i5 = zzn.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zze = zzgiy.zzn(t, j).hashCode();
                    i2 = i + zze;
                    break;
                case 11:
                    i = i2 * 53;
                    zze = zzgiy.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 12:
                    i = i2 * 53;
                    zze = zzgiy.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 13:
                    i = i2 * 53;
                    zze = zzgiy.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 14:
                    i = i2 * 53;
                    zze = zzggk.zze(zzgiy.zzf(t, j));
                    i2 = i + zze;
                    break;
                case 15:
                    i = i2 * 53;
                    zze = zzgiy.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 16:
                    i = i2 * 53;
                    zze = zzggk.zze(zzgiy.zzf(t, j));
                    i2 = i + zze;
                    break;
                case 17:
                    Object zzn2 = zzgiy.zzn(t, j);
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
                    zze = zzgiy.zzn(t, j).hashCode();
                    i2 = i + zze;
                    break;
                case 50:
                    i = i2 * 53;
                    zze = zzgiy.zzn(t, j).hashCode();
                    i2 = i + zze;
                    break;
                case 51:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzggk.zze(Double.doubleToLongBits(zzH(t, j)));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = Float.floatToIntBits(zzI(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzggk.zze(zzK(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzggk.zze(zzK(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzJ(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzggk.zze(zzK(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzJ(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzggk.zzf(zzL(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = ((String) zzgiy.zzn(t, j)).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzgiy.zzn(t, j).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzgiy.zzn(t, j).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzJ(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzJ(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzJ(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzggk.zze(zzK(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzJ(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzggk.zze(zzK(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzgiy.zzn(t, j).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzo.zzj(t).hashCode();
        if (this.zzh) {
            this.zzp.zzb(t);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzd(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.zzc.length; i += 3) {
                int zzD = zzD(i);
                long j = 1048575 & zzD;
                int i2 = this.zzc[i];
                switch (zzF(zzD)) {
                    case 0:
                        if (zzO(t2, i)) {
                            zzgiy.zzm(t, j, zzgiy.zzl(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzO(t2, i)) {
                            zzgiy.zzk(t, j, zzgiy.zzj(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzO(t2, i)) {
                            zzgiy.zzg(t, j, zzgiy.zzf(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzO(t2, i)) {
                            zzgiy.zzg(t, j, zzgiy.zzf(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzO(t2, i)) {
                            zzgiy.zze(t, j, zzgiy.zzd(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzO(t2, i)) {
                            zzgiy.zzg(t, j, zzgiy.zzf(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzO(t2, i)) {
                            zzgiy.zze(t, j, zzgiy.zzd(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzO(t2, i)) {
                            zzgiy.zzi(t, j, zzgiy.zzh(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzO(t2, i)) {
                            zzgiy.zzo(t, j, zzgiy.zzn(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        zzp(t, t2, i);
                        break;
                    case 10:
                        if (zzO(t2, i)) {
                            zzgiy.zzo(t, j, zzgiy.zzn(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzO(t2, i)) {
                            zzgiy.zze(t, j, zzgiy.zzd(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzO(t2, i)) {
                            zzgiy.zze(t, j, zzgiy.zzd(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzO(t2, i)) {
                            zzgiy.zze(t, j, zzgiy.zzd(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzO(t2, i)) {
                            zzgiy.zzg(t, j, zzgiy.zzf(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzO(t2, i)) {
                            zzgiy.zze(t, j, zzgiy.zzd(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzO(t2, i)) {
                            zzgiy.zzg(t, j, zzgiy.zzf(t2, j));
                            zzP(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        zzp(t, t2, i);
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
                        this.zzn.zzc(t, t2, j);
                        break;
                    case 50:
                        zzgib.zzI(this.zzr, t, t2, j);
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
                        if (zzQ(t2, i2, i)) {
                            zzgiy.zzo(t, j, zzgiy.zzn(t2, j));
                            zzR(t, i2, i);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        zzq(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (zzQ(t2, i2, i)) {
                            zzgiy.zzo(t, j, zzgiy.zzn(t2, j));
                            zzR(t, i2, i);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        zzq(t, t2, i);
                        break;
                }
            }
            zzgib.zzF(this.zzo, t, t2);
            if (this.zzh) {
                zzgib.zzE(this.zzp, t, t2);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final int zze(T t) {
        return this.zzj ? zzs(t) : zzr(t);
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzf(T t, zzght zzghtVar, zzgfm zzgfmVar) throws IOException {
        if (zzgfmVar == null) {
            throw null;
        }
        zzgio zzgioVar = this.zzo;
        zzgfn<?> zzgfnVar = this.zzp;
        zzgfr<?> zzgfrVar = null;
        Object obj = null;
        while (true) {
            try {
                int zzb2 = zzghtVar.zzb();
                int zzS = zzS(zzb2);
                if (zzS >= 0) {
                    int zzD = zzD(zzS);
                    try {
                        switch (zzF(zzD)) {
                            case 0:
                                zzgiy.zzm(t, zzD & 1048575, zzghtVar.zze());
                                zzP(t, zzS);
                                break;
                            case 1:
                                zzgiy.zzk(t, zzD & 1048575, zzghtVar.zzf());
                                zzP(t, zzS);
                                break;
                            case 2:
                                zzgiy.zzg(t, zzD & 1048575, zzghtVar.zzh());
                                zzP(t, zzS);
                                break;
                            case 3:
                                zzgiy.zzg(t, zzD & 1048575, zzghtVar.zzg());
                                zzP(t, zzS);
                                break;
                            case 4:
                                zzgiy.zze(t, zzD & 1048575, zzghtVar.zzi());
                                zzP(t, zzS);
                                break;
                            case 5:
                                zzgiy.zzg(t, zzD & 1048575, zzghtVar.zzj());
                                zzP(t, zzS);
                                break;
                            case 6:
                                zzgiy.zze(t, zzD & 1048575, zzghtVar.zzk());
                                zzP(t, zzS);
                                break;
                            case 7:
                                zzgiy.zzi(t, zzD & 1048575, zzghtVar.zzl());
                                zzP(t, zzS);
                                break;
                            case 8:
                                zzC(t, zzD, zzghtVar);
                                zzP(t, zzS);
                                break;
                            case 9:
                                if (zzO(t, zzS)) {
                                    long j = zzD & 1048575;
                                    zzgiy.zzo(t, j, zzggk.zzi(zzgiy.zzn(t, j), zzghtVar.zzo(zzw(zzS), zzgfmVar)));
                                    break;
                                } else {
                                    zzgiy.zzo(t, zzD & 1048575, zzghtVar.zzo(zzw(zzS), zzgfmVar));
                                    zzP(t, zzS);
                                    break;
                                }
                            case 10:
                                zzgiy.zzo(t, zzD & 1048575, zzghtVar.zzq());
                                zzP(t, zzS);
                                break;
                            case 11:
                                zzgiy.zze(t, zzD & 1048575, zzghtVar.zzr());
                                zzP(t, zzS);
                                break;
                            case 12:
                                int zzs = zzghtVar.zzs();
                                zzgge zzy = zzy(zzS);
                                if (zzy != null && !zzy.zza(zzs)) {
                                    obj = zzgib.zzH(zzb2, zzs, obj, zzgioVar);
                                    break;
                                }
                                zzgiy.zze(t, zzD & 1048575, zzs);
                                zzP(t, zzS);
                                break;
                            case 13:
                                zzgiy.zze(t, zzD & 1048575, zzghtVar.zzt());
                                zzP(t, zzS);
                                break;
                            case 14:
                                zzgiy.zzg(t, zzD & 1048575, zzghtVar.zzu());
                                zzP(t, zzS);
                                break;
                            case 15:
                                zzgiy.zze(t, zzD & 1048575, zzghtVar.zzv());
                                zzP(t, zzS);
                                break;
                            case 16:
                                zzgiy.zzg(t, zzD & 1048575, zzghtVar.zzw());
                                zzP(t, zzS);
                                break;
                            case 17:
                                if (zzO(t, zzS)) {
                                    long j2 = zzD & 1048575;
                                    zzgiy.zzo(t, j2, zzggk.zzi(zzgiy.zzn(t, j2), zzghtVar.zzp(zzw(zzS), zzgfmVar)));
                                    break;
                                } else {
                                    zzgiy.zzo(t, zzD & 1048575, zzghtVar.zzp(zzw(zzS), zzgfmVar));
                                    zzP(t, zzS);
                                    break;
                                }
                            case 18:
                                zzghtVar.zzx(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 19:
                                zzghtVar.zzy(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 20:
                                zzghtVar.zzA(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 21:
                                zzghtVar.zzz(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 22:
                                zzghtVar.zzB(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 23:
                                zzghtVar.zzC(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 24:
                                zzghtVar.zzD(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 25:
                                zzghtVar.zzE(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 26:
                                if (zzG(zzD)) {
                                    ((zzgfd) zzghtVar).zzF(this.zzn.zza(t, zzD & 1048575), true);
                                    break;
                                } else {
                                    ((zzgfd) zzghtVar).zzF(this.zzn.zza(t, zzD & 1048575), false);
                                    break;
                                }
                            case 27:
                                zzghtVar.zzG(this.zzn.zza(t, zzD & 1048575), zzw(zzS), zzgfmVar);
                                break;
                            case 28:
                                zzghtVar.zzI(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 29:
                                zzghtVar.zzJ(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 30:
                                List<Integer> zza2 = this.zzn.zza(t, zzD & 1048575);
                                zzghtVar.zzK(zza2);
                                obj = zzgib.zzG(zzb2, zza2, zzy(zzS), obj, zzgioVar);
                                break;
                            case 31:
                                zzghtVar.zzL(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 32:
                                zzghtVar.zzM(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 33:
                                zzghtVar.zzN(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 34:
                                zzghtVar.zzO(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 35:
                                zzghtVar.zzx(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 36:
                                zzghtVar.zzy(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 37:
                                zzghtVar.zzA(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 38:
                                zzghtVar.zzz(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 39:
                                zzghtVar.zzB(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 40:
                                zzghtVar.zzC(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 41:
                                zzghtVar.zzD(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 42:
                                zzghtVar.zzE(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 43:
                                zzghtVar.zzJ(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 44:
                                List<Integer> zza3 = this.zzn.zza(t, zzD & 1048575);
                                zzghtVar.zzK(zza3);
                                obj = zzgib.zzG(zzb2, zza3, zzy(zzS), obj, zzgioVar);
                                break;
                            case 45:
                                zzghtVar.zzL(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 46:
                                zzghtVar.zzM(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 47:
                                zzghtVar.zzN(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 48:
                                zzghtVar.zzO(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 49:
                                zzghtVar.zzH(this.zzn.zza(t, zzD & 1048575), zzw(zzS), zzgfmVar);
                                break;
                            case 50:
                                Object zzx = zzx(zzS);
                                long zzD2 = zzD(zzS) & 1048575;
                                Object zzn = zzgiy.zzn(t, zzD2);
                                if (zzn == null) {
                                    zzn = zzghc.zza().zzc();
                                    zzgiy.zzo(t, zzD2, zzn);
                                } else if (zzghd.zzb(zzn)) {
                                    Object zzc = zzghc.zza().zzc();
                                    zzghd.zzc(zzc, zzn);
                                    zzgiy.zzo(t, zzD2, zzc);
                                    zzn = zzc;
                                }
                                zzghc zzghcVar = (zzghc) zzn;
                                zzghb zzghbVar = (zzghb) zzx;
                                throw null;
                                break;
                            case 51:
                                zzgiy.zzo(t, zzD & 1048575, Double.valueOf(zzghtVar.zze()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 52:
                                zzgiy.zzo(t, zzD & 1048575, Float.valueOf(zzghtVar.zzf()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 53:
                                zzgiy.zzo(t, zzD & 1048575, Long.valueOf(zzghtVar.zzh()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 54:
                                zzgiy.zzo(t, zzD & 1048575, Long.valueOf(zzghtVar.zzg()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 55:
                                zzgiy.zzo(t, zzD & 1048575, Integer.valueOf(zzghtVar.zzi()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 56:
                                zzgiy.zzo(t, zzD & 1048575, Long.valueOf(zzghtVar.zzj()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 57:
                                zzgiy.zzo(t, zzD & 1048575, Integer.valueOf(zzghtVar.zzk()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 58:
                                zzgiy.zzo(t, zzD & 1048575, Boolean.valueOf(zzghtVar.zzl()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 59:
                                zzC(t, zzD, zzghtVar);
                                zzR(t, zzb2, zzS);
                                break;
                            case 60:
                                if (zzQ(t, zzb2, zzS)) {
                                    long j3 = zzD & 1048575;
                                    zzgiy.zzo(t, j3, zzggk.zzi(zzgiy.zzn(t, j3), zzghtVar.zzo(zzw(zzS), zzgfmVar)));
                                } else {
                                    zzgiy.zzo(t, zzD & 1048575, zzghtVar.zzo(zzw(zzS), zzgfmVar));
                                    zzP(t, zzS);
                                }
                                zzR(t, zzb2, zzS);
                                break;
                            case 61:
                                zzgiy.zzo(t, zzD & 1048575, zzghtVar.zzq());
                                zzR(t, zzb2, zzS);
                                break;
                            case 62:
                                zzgiy.zzo(t, zzD & 1048575, Integer.valueOf(zzghtVar.zzr()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 63:
                                int zzs2 = zzghtVar.zzs();
                                zzgge zzy2 = zzy(zzS);
                                if (zzy2 != null && !zzy2.zza(zzs2)) {
                                    obj = zzgib.zzH(zzb2, zzs2, obj, zzgioVar);
                                    break;
                                }
                                zzgiy.zzo(t, zzD & 1048575, Integer.valueOf(zzs2));
                                zzR(t, zzb2, zzS);
                                break;
                            case 64:
                                zzgiy.zzo(t, zzD & 1048575, Integer.valueOf(zzghtVar.zzt()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 65:
                                zzgiy.zzo(t, zzD & 1048575, Long.valueOf(zzghtVar.zzu()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 66:
                                zzgiy.zzo(t, zzD & 1048575, Integer.valueOf(zzghtVar.zzv()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 67:
                                zzgiy.zzo(t, zzD & 1048575, Long.valueOf(zzghtVar.zzw()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 68:
                                zzgiy.zzo(t, zzD & 1048575, zzghtVar.zzp(zzw(zzS), zzgfmVar));
                                zzR(t, zzb2, zzS);
                                break;
                            default:
                                if (obj == null) {
                                    obj = zzgioVar.zzg();
                                }
                                if (!zzgioVar.zzn(obj, zzghtVar)) {
                                    for (int i = this.zzl; i < this.zzm; i++) {
                                        obj = zzA(t, this.zzk[i], obj, zzgioVar);
                                    }
                                    if (obj != null) {
                                        zzgioVar.zzl(t, obj);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzggl unused) {
                        zzgioVar.zza(zzghtVar);
                        if (obj == null) {
                            obj = zzgioVar.zzk(t);
                        }
                        if (!zzgioVar.zzn(obj, zzghtVar)) {
                            for (int i2 = this.zzl; i2 < this.zzm; i2++) {
                                obj = zzA(t, this.zzk[i2], obj, zzgioVar);
                            }
                            if (obj != null) {
                                zzgioVar.zzl(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                } else if (zzb2 == Integer.MAX_VALUE) {
                    for (int i3 = this.zzl; i3 < this.zzm; i3++) {
                        obj = zzA(t, this.zzk[i3], obj, zzgioVar);
                    }
                    if (obj != null) {
                        zzgioVar.zzl(t, obj);
                        return;
                    }
                    return;
                } else {
                    Object zzf = !this.zzh ? null : zzgfnVar.zzf(zzgfmVar, this.zzg, zzb2);
                    if (zzf != null) {
                        if (zzgfrVar == null) {
                            zzgfrVar = zzgfnVar.zzc(t);
                        }
                        zzgfr<?> zzgfrVar2 = zzgfrVar;
                        obj = zzgfnVar.zze(zzghtVar, zzf, zzgfmVar, zzgfrVar2, obj, zzgioVar);
                        zzgfrVar = zzgfrVar2;
                    } else {
                        zzgioVar.zza(zzghtVar);
                        if (obj == null) {
                            obj = zzgioVar.zzk(t);
                        }
                        if (!zzgioVar.zzn(obj, zzghtVar)) {
                            for (int i4 = this.zzl; i4 < this.zzm; i4++) {
                                obj = zzA(t, this.zzk[i4], obj, zzgioVar);
                            }
                            if (obj != null) {
                                zzgioVar.zzl(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzl; i5 < this.zzm; i5++) {
                    obj = zzA(t, this.zzk[i5], obj, zzgioVar);
                }
                if (obj != null) {
                    zzgioVar.zzl(t, obj);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x042d, code lost:
        if (r6 == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x042f, code lost:
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0435, code lost:
        r3 = r9.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0439, code lost:
        if (r3 >= r9.zzm) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x043b, code lost:
        r9.zzA(r12, r9.zzk[r3], r2, r9.zzo);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0447, code lost:
        if (r7 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x044b, code lost:
        if (r0 != r32) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0452, code lost:
        throw com.google.android.gms.internal.ads.zzggm.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0455, code lost:
        if (r0 > r32) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0457, code lost:
        if (r1 != r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0459, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x045e, code lost:
        throw com.google.android.gms.internal.ads.zzggm.zzk();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzh(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.ads.zzgej r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzghl.zzh(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgej):int");
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzi(T t, byte[] bArr, int i, int i2, zzgej zzgejVar) throws IOException {
        if (this.zzj) {
            zzz(t, bArr, i, i2, zzgejVar);
        } else {
            zzh(t, bArr, i, i2, 0, zzgejVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzj(T t) {
        int i;
        int i2 = this.zzl;
        while (true) {
            i = this.zzm;
            if (i2 >= i) {
                break;
            }
            long zzD = zzD(this.zzk[i2]) & 1048575;
            Object zzn = zzgiy.zzn(t, zzD);
            if (zzn != null) {
                ((zzghc) zzn).zzd();
                zzgiy.zzo(t, zzD, zzn);
            }
            i2++;
        }
        int length = this.zzk.length;
        while (i < length) {
            this.zzn.zzb(t, this.zzk[i]);
            i++;
        }
        this.zzo.zzm(t);
        if (this.zzh) {
            this.zzp.zzd(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzghz
    public final boolean zzk(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzl) {
            int i6 = this.zzk[i5];
            int i7 = this.zzc[i6];
            int zzD = zzD(i6);
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
            if ((268435456 & zzD) != 0 && !zzN(t, i6, i, i2, i10)) {
                return false;
            }
            int zzF = zzF(zzD);
            if (zzF != 9 && zzF != 17) {
                if (zzF != 27) {
                    if (zzF == 60 || zzF == 68) {
                        if (zzQ(t, i7, i6) && !zzB(t, zzD, zzw(i6))) {
                            return false;
                        }
                    } else if (zzF != 49) {
                        if (zzF == 50 && !((zzghc) zzgiy.zzn(t, zzD & 1048575)).isEmpty()) {
                            zzghb zzghbVar = (zzghb) zzx(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgiy.zzn(t, zzD & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzghz zzw = zzw(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzw.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzN(t, i6, i, i2, i10) && !zzB(t, zzD, zzw(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.zzh) {
            this.zzp.zzb(t);
            throw null;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzn(T t, zzgfi zzgfiVar) throws IOException {
        if (!this.zzj) {
            zzV(t, zzgfiVar);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzD = zzD(i);
                int i2 = this.zzc[i];
                switch (zzF(zzD)) {
                    case 0:
                        if (zzO(t, i)) {
                            zzgfiVar.zzf(i2, zzgiy.zzl(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzO(t, i)) {
                            zzgfiVar.zze(i2, zzgiy.zzj(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzO(t, i)) {
                            zzgfiVar.zzc(i2, zzgiy.zzf(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzO(t, i)) {
                            zzgfiVar.zzh(i2, zzgiy.zzf(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzO(t, i)) {
                            zzgfiVar.zzi(i2, zzgiy.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzO(t, i)) {
                            zzgfiVar.zzj(i2, zzgiy.zzf(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzO(t, i)) {
                            zzgfiVar.zzk(i2, zzgiy.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzO(t, i)) {
                            zzgfiVar.zzl(i2, zzgiy.zzh(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzO(t, i)) {
                            zzX(i2, zzgiy.zzn(t, zzD & 1048575), zzgfiVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzO(t, i)) {
                            zzgfiVar.zzr(i2, zzgiy.zzn(t, zzD & 1048575), zzw(i));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzO(t, i)) {
                            zzgfiVar.zzn(i2, (zzgex) zzgiy.zzn(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzO(t, i)) {
                            zzgfiVar.zzo(i2, zzgiy.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzO(t, i)) {
                            zzgfiVar.zzg(i2, zzgiy.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzO(t, i)) {
                            zzgfiVar.zzb(i2, zzgiy.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzO(t, i)) {
                            zzgfiVar.zzd(i2, zzgiy.zzf(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzO(t, i)) {
                            zzgfiVar.zzp(i2, zzgiy.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzO(t, i)) {
                            zzgfiVar.zzq(i2, zzgiy.zzf(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzO(t, i)) {
                            zzgfiVar.zzs(i2, zzgiy.zzn(t, zzD & 1048575), zzw(i));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzgib.zzJ(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 19:
                        zzgib.zzK(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 20:
                        zzgib.zzL(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 21:
                        zzgib.zzM(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 22:
                        zzgib.zzQ(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 23:
                        zzgib.zzO(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 24:
                        zzgib.zzT(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 25:
                        zzgib.zzW(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 26:
                        zzgib.zzX(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar);
                        break;
                    case 27:
                        zzgib.zzZ(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, zzw(i));
                        break;
                    case 28:
                        zzgib.zzY(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar);
                        break;
                    case 29:
                        zzgib.zzR(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 30:
                        zzgib.zzV(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 31:
                        zzgib.zzU(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 32:
                        zzgib.zzP(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 33:
                        zzgib.zzS(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 34:
                        zzgib.zzN(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 35:
                        zzgib.zzJ(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 36:
                        zzgib.zzK(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 37:
                        zzgib.zzL(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 38:
                        zzgib.zzM(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 39:
                        zzgib.zzQ(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 40:
                        zzgib.zzO(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 41:
                        zzgib.zzT(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 42:
                        zzgib.zzW(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 43:
                        zzgib.zzR(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 44:
                        zzgib.zzV(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 45:
                        zzgib.zzU(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 46:
                        zzgib.zzP(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 47:
                        zzgib.zzS(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 48:
                        zzgib.zzN(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 49:
                        zzgib.zzaa(this.zzc[i], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, zzw(i));
                        break;
                    case 50:
                        zzW(zzgfiVar, i2, zzgiy.zzn(t, zzD & 1048575), i);
                        break;
                    case 51:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzf(i2, zzH(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zze(i2, zzI(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzc(i2, zzK(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzh(i2, zzK(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzi(i2, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzj(i2, zzK(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzk(i2, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzl(i2, zzL(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzQ(t, i2, i)) {
                            zzX(i2, zzgiy.zzn(t, zzD & 1048575), zzgfiVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzr(i2, zzgiy.zzn(t, zzD & 1048575), zzw(i));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzn(i2, (zzgex) zzgiy.zzn(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzo(i2, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzg(i2, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzb(i2, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzd(i2, zzK(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzp(i2, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzq(i2, zzK(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzQ(t, i2, i)) {
                            zzgfiVar.zzs(i2, zzgiy.zzn(t, zzD & 1048575), zzw(i));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzgio<?, ?> zzgioVar = this.zzo;
            zzgioVar.zzr(zzgioVar.zzj(t), zzgfiVar);
        } else {
            this.zzp.zzb(t);
            throw null;
        }
    }
}
