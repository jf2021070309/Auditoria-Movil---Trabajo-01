package com.google.android.gms.internal.ads;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import e.a.d.a.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
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
    private zzghl(int[] iArr, int[] iArr2, Object[] objArr, int i2, int i3, zzghi zzghiVar, boolean z, boolean z2, int[] iArr3, int i4, int i5, zzghn zzghnVar, zzggw zzggwVar, zzgio<?, ?> zzgioVar, zzgfn<?> zzgfnVar, zzghd zzghdVar) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zze = objArr;
        this.zzf = i2;
        this.zzi = i3 instanceof zzgga;
        this.zzj = zzghiVar;
        boolean z3 = false;
        if (zzgioVar != 0 && zzgioVar.zza((zzghi) i3)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = z2;
        this.zzl = iArr3;
        this.zzm = i4;
        this.zzq = i5;
        this.zzn = zzghnVar;
        this.zzo = zzggwVar;
        this.zzp = zzgioVar;
        this.zzg = i3;
        this.zzr = zzgfnVar;
    }

    private final <UT, UB> UB zzA(Object obj, int i2, UB ub, zzgio<UT, UB> zzgioVar) {
        int i3 = this.zzc[i2];
        Object zzn = zzgiy.zzn(obj, zzD(i2) & 1048575);
        if (zzn == null || zzy(i2) == null) {
            return ub;
        }
        zzghc zzghcVar = (zzghc) zzn;
        zzghb zzghbVar = (zzghb) zzx(i2);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzB(Object obj, int i2, zzghz zzghzVar) {
        return zzghzVar.zzk(zzgiy.zzn(obj, i2 & 1048575));
    }

    private final void zzC(Object obj, int i2, zzght zzghtVar) throws IOException {
        if (zzG(i2)) {
            zzgiy.zzo(obj, i2 & 1048575, zzghtVar.zzn());
        } else if (this.zzi) {
            zzgiy.zzo(obj, i2 & 1048575, zzghtVar.zzm());
        } else {
            zzgiy.zzo(obj, i2 & 1048575, zzghtVar.zzq());
        }
    }

    private final int zzD(int i2) {
        return this.zzc[i2 + 1];
    }

    private final int zzE(int i2) {
        return this.zzc[i2 + 2];
    }

    private static int zzF(int i2) {
        return (i2 >>> 20) & 255;
    }

    private static boolean zzG(int i2) {
        return (i2 & 536870912) != 0;
    }

    private static <T> double zzH(T t, long j2) {
        return ((Double) zzgiy.zzn(t, j2)).doubleValue();
    }

    private static <T> float zzI(T t, long j2) {
        return ((Float) zzgiy.zzn(t, j2)).floatValue();
    }

    private static <T> int zzJ(T t, long j2) {
        return ((Integer) zzgiy.zzn(t, j2)).intValue();
    }

    private static <T> long zzK(T t, long j2) {
        return ((Long) zzgiy.zzn(t, j2)).longValue();
    }

    private static <T> boolean zzL(T t, long j2) {
        return ((Boolean) zzgiy.zzn(t, j2)).booleanValue();
    }

    private final boolean zzM(T t, T t2, int i2) {
        return zzO(t, i2) == zzO(t2, i2);
    }

    private final boolean zzN(T t, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? zzO(t, i2) : (i4 & i5) != 0;
    }

    private final boolean zzO(T t, int i2) {
        int zzE = zzE(i2);
        long j2 = zzE & 1048575;
        if (j2 != 1048575) {
            return (zzgiy.zzd(t, j2) & (1 << (zzE >>> 20))) != 0;
        }
        int zzD = zzD(i2);
        long j3 = zzD & 1048575;
        switch (zzF(zzD)) {
            case 0:
                return zzgiy.zzl(t, j3) != 0.0d;
            case 1:
                return zzgiy.zzj(t, j3) != 0.0f;
            case 2:
                return zzgiy.zzf(t, j3) != 0;
            case 3:
                return zzgiy.zzf(t, j3) != 0;
            case 4:
                return zzgiy.zzd(t, j3) != 0;
            case 5:
                return zzgiy.zzf(t, j3) != 0;
            case 6:
                return zzgiy.zzd(t, j3) != 0;
            case 7:
                return zzgiy.zzh(t, j3);
            case 8:
                Object zzn = zzgiy.zzn(t, j3);
                if (zzn instanceof String) {
                    return !((String) zzn).isEmpty();
                } else if (zzn instanceof zzgex) {
                    return !zzgex.zzb.equals(zzn);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzgiy.zzn(t, j3) != null;
            case 10:
                return !zzgex.zzb.equals(zzgiy.zzn(t, j3));
            case 11:
                return zzgiy.zzd(t, j3) != 0;
            case 12:
                return zzgiy.zzd(t, j3) != 0;
            case 13:
                return zzgiy.zzd(t, j3) != 0;
            case 14:
                return zzgiy.zzf(t, j3) != 0;
            case 15:
                return zzgiy.zzd(t, j3) != 0;
            case 16:
                return zzgiy.zzf(t, j3) != 0;
            case 17:
                return zzgiy.zzn(t, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzP(T t, int i2) {
        int zzE = zzE(i2);
        long j2 = 1048575 & zzE;
        if (j2 == 1048575) {
            return;
        }
        zzgiy.zze(t, j2, (1 << (zzE >>> 20)) | zzgiy.zzd(t, j2));
    }

    private final boolean zzQ(T t, int i2, int i3) {
        return zzgiy.zzd(t, (long) (zzE(i3) & 1048575)) == i2;
    }

    private final void zzR(T t, int i2, int i3) {
        zzgiy.zze(t, zzE(i3) & 1048575, i2);
    }

    private final int zzS(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzU(i2, 0);
    }

    private final int zzT(int i2, int i3) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzU(i2, i3);
    }

    private final int zzU(int i2, int i3) {
        int length = (this.zzc.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.zzc[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private final void zzV(T t, zzgfi zzgfiVar) throws IOException {
        int i2;
        if (this.zzh) {
            this.zzp.zzb(t);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < length) {
            int zzD = zzD(i4);
            int i7 = this.zzc[i4];
            int zzF = zzF(zzD);
            if (zzF <= 17) {
                int i8 = this.zzc[i4 + 2];
                int i9 = i8 & i3;
                if (i9 != i6) {
                    i5 = unsafe.getInt(t, i9);
                    i6 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i2 = 0;
            }
            long j2 = zzD & i3;
            switch (zzF) {
                case 0:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzf(i7, zzgiy.zzl(t, j2));
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 1:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zze(i7, zzgiy.zzj(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 2:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzc(i7, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 3:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzh(i7, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 4:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzi(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 5:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzj(i7, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 6:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzk(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 7:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzl(i7, zzgiy.zzh(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 8:
                    if ((i5 & i2) != 0) {
                        zzX(i7, unsafe.getObject(t, j2), zzgfiVar);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 9:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzr(i7, unsafe.getObject(t, j2), zzw(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 10:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzn(i7, (zzgex) unsafe.getObject(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 11:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzo(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 12:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzg(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 13:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzb(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 14:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzd(i7, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 15:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzp(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 16:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzq(i7, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 17:
                    if ((i5 & i2) != 0) {
                        zzgfiVar.zzs(i7, unsafe.getObject(t, j2), zzw(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    zzgib.zzJ(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 19:
                    zzgib.zzK(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 20:
                    zzgib.zzL(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    zzgib.zzM(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 22:
                    zzgib.zzQ(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzgib.zzO(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 24:
                    zzgib.zzT(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 25:
                    zzgib.zzW(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 26:
                    zzgib.zzX(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar);
                    break;
                case 27:
                    zzgib.zzZ(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, zzw(i4));
                    break;
                case 28:
                    zzgib.zzY(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar);
                    break;
                case 29:
                    zzgib.zzR(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, false);
                    break;
                case 30:
                    zzgib.zzV(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, false);
                    break;
                case 31:
                    zzgib.zzU(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, false);
                    break;
                case 32:
                    zzgib.zzP(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, false);
                    break;
                case 33:
                    zzgib.zzS(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, false);
                    break;
                case 34:
                    zzgib.zzN(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, false);
                    break;
                case 35:
                    zzgib.zzJ(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, true);
                    break;
                case 36:
                    zzgib.zzK(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, true);
                    break;
                case 37:
                    zzgib.zzL(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, true);
                    break;
                case 38:
                    zzgib.zzM(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, true);
                    break;
                case 39:
                    zzgib.zzQ(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, true);
                    break;
                case 40:
                    zzgib.zzO(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, true);
                    break;
                case 41:
                    zzgib.zzT(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, true);
                    break;
                case 42:
                    zzgib.zzW(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, true);
                    break;
                case 43:
                    zzgib.zzR(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, true);
                    break;
                case 44:
                    zzgib.zzV(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, true);
                    break;
                case 45:
                    zzgib.zzU(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, true);
                    break;
                case 46:
                    zzgib.zzP(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, true);
                    break;
                case 47:
                    zzgib.zzS(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, true);
                    break;
                case SyslogConstants.LOG_LPR /* 48 */:
                    zzgib.zzN(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, true);
                    break;
                case 49:
                    zzgib.zzaa(this.zzc[i4], (List) unsafe.getObject(t, j2), zzgfiVar, zzw(i4));
                    break;
                case 50:
                    zzW(zzgfiVar, i7, unsafe.getObject(t, j2), i4);
                    break;
                case 51:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzf(i7, zzH(t, j2));
                        break;
                    }
                    break;
                case 52:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zze(i7, zzI(t, j2));
                        break;
                    }
                    break;
                case 53:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzc(i7, zzK(t, j2));
                        break;
                    }
                    break;
                case 54:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzh(i7, zzK(t, j2));
                        break;
                    }
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 55 */:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzi(i7, zzJ(t, j2));
                        break;
                    }
                    break;
                case SyslogConstants.LOG_NEWS /* 56 */:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzj(i7, zzK(t, j2));
                        break;
                    }
                    break;
                case 57:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzk(i7, zzJ(t, j2));
                        break;
                    }
                    break;
                case 58:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzl(i7, zzL(t, j2));
                        break;
                    }
                    break;
                case 59:
                    if (zzQ(t, i7, i4)) {
                        zzX(i7, unsafe.getObject(t, j2), zzgfiVar);
                        break;
                    }
                    break;
                case 60:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzr(i7, unsafe.getObject(t, j2), zzw(i4));
                        break;
                    }
                    break;
                case 61:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzn(i7, (zzgex) unsafe.getObject(t, j2));
                        break;
                    }
                    break;
                case 62:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzo(i7, zzJ(t, j2));
                        break;
                    }
                    break;
                case 63:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzg(i7, zzJ(t, j2));
                        break;
                    }
                    break;
                case 64:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzb(i7, zzJ(t, j2));
                        break;
                    }
                    break;
                case 65:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzd(i7, zzK(t, j2));
                        break;
                    }
                    break;
                case 66:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzp(i7, zzJ(t, j2));
                        break;
                    }
                    break;
                case 67:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzq(i7, zzK(t, j2));
                        break;
                    }
                    break;
                case 68:
                    if (zzQ(t, i7, i4)) {
                        zzgfiVar.zzs(i7, unsafe.getObject(t, j2), zzw(i4));
                        break;
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        zzgio<?, ?> zzgioVar = this.zzo;
        zzgioVar.zzr(zzgioVar.zzj(t), zzgfiVar);
    }

    private final <K, V> void zzW(zzgfi zzgfiVar, int i2, Object obj, int i3) throws IOException {
        if (obj == null) {
            return;
        }
        zzghb zzghbVar = (zzghb) zzx(i3);
        throw null;
    }

    private static final void zzX(int i2, Object obj, zzgfi zzgfiVar) throws IOException {
        if (obj instanceof String) {
            zzgfiVar.zzm(i2, (String) obj);
        } else {
            zzgfiVar.zzn(i2, (zzgex) obj);
        }
    }

    public static zzgip zzg(Object obj) {
        zzgga zzggaVar = (zzgga) obj;
        zzgip zzgipVar = zzggaVar.zzc;
        if (zzgipVar == zzgip.zza()) {
            zzgip zzb2 = zzgip.zzb();
            zzggaVar.zzc = zzb2;
            return zzb2;
        }
        return zzgipVar;
    }

    public static <T> zzghl<T> zzl(Class<T> cls, zzghf zzghfVar, zzghn zzghnVar, zzggw zzggwVar, zzgio<?, ?> zzgioVar, zzgfn<?> zzgfnVar, zzghd zzghdVar) {
        if (zzghfVar instanceof zzghs) {
            return zzm((zzghs) zzghfVar, zzghnVar, zzggwVar, zzgioVar, zzgfnVar, zzghdVar);
        }
        zzgil zzgilVar = (zzgil) zzghfVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.android.gms.internal.ads.zzghl<T> zzm(com.google.android.gms.internal.ads.zzghs r33, com.google.android.gms.internal.ads.zzghn r34, com.google.android.gms.internal.ads.zzggw r35, com.google.android.gms.internal.ads.zzgio<?, ?> r36, com.google.android.gms.internal.ads.zzgfn<?> r37, com.google.android.gms.internal.ads.zzghd r38) {
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
            StringBuilder sb = new StringBuilder(a.b(String.valueOf(str).length(), 40, name.length(), String.valueOf(arrays).length()));
            a.M(sb, "Field ", str, " for ", name);
            throw new RuntimeException(a.r(sb, " not found. Known fields are ", arrays));
        }
    }

    private final void zzp(T t, T t2, int i2) {
        long zzD = zzD(i2) & 1048575;
        if (zzO(t2, i2)) {
            Object zzn = zzgiy.zzn(t, zzD);
            Object zzn2 = zzgiy.zzn(t2, zzD);
            if (zzn != null && zzn2 != null) {
                zzgiy.zzo(t, zzD, zzggk.zzi(zzn, zzn2));
                zzP(t, i2);
            } else if (zzn2 != null) {
                zzgiy.zzo(t, zzD, zzn2);
                zzP(t, i2);
            }
        }
    }

    private final void zzq(T t, T t2, int i2) {
        int zzD = zzD(i2);
        int i3 = this.zzc[i2];
        long j2 = zzD & 1048575;
        if (zzQ(t2, i3, i2)) {
            Object zzn = zzQ(t, i3, i2) ? zzgiy.zzn(t, j2) : null;
            Object zzn2 = zzgiy.zzn(t2, j2);
            if (zzn != null && zzn2 != null) {
                zzgiy.zzo(t, j2, zzggk.zzi(zzn, zzn2));
                zzR(t, i3, i2);
            } else if (zzn2 != null) {
                zzgiy.zzo(t, j2, zzn2);
                zzR(t, i3, i2);
            }
        }
    }

    private final int zzr(T t) {
        int i2;
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
        int zzr;
        int zzv;
        int zzx8;
        int i3;
        Unsafe unsafe = zzb;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzD = zzD(i7);
            int i8 = this.zzc[i7];
            int zzF = zzF(zzD);
            if (zzF <= 17) {
                int i9 = this.zzc[i7 + 2];
                int i10 = i9 & 1048575;
                i2 = 1 << (i9 >>> 20);
                if (i10 != i6) {
                    i5 = unsafe.getInt(t, i10);
                    i6 = i10;
                }
            } else {
                i2 = 0;
            }
            long j2 = zzD & 1048575;
            switch (zzF) {
                case 0:
                    if ((i5 & i2) != 0) {
                        zzx = zzgfh.zzx(i8 << 3);
                        zzw2 = zzx + 8;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i5 & i2) != 0) {
                        zzx2 = zzgfh.zzx(i8 << 3);
                        zzw2 = zzx2 + 4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i5 & i2) != 0) {
                        long j3 = unsafe.getLong(t, j2);
                        zzx3 = zzgfh.zzx(i8 << 3);
                        zzy = zzgfh.zzy(j3);
                        i4 = zzy + zzx3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i5 & i2) != 0) {
                        long j4 = unsafe.getLong(t, j2);
                        zzx3 = zzgfh.zzx(i8 << 3);
                        zzy = zzgfh.zzy(j4);
                        i4 = zzy + zzx3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i5 & i2) != 0) {
                        int i11 = unsafe.getInt(t, j2);
                        zzx4 = zzgfh.zzx(i8 << 3);
                        zzw = zzgfh.zzw(i11);
                        zzw2 = zzw + zzx4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i5 & i2) != 0) {
                        zzx = zzgfh.zzx(i8 << 3);
                        zzw2 = zzx + 8;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i5 & i2) != 0) {
                        zzx2 = zzgfh.zzx(i8 << 3);
                        zzw2 = zzx2 + 4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i5 & i2) != 0) {
                        zzx5 = zzgfh.zzx(i8 << 3);
                        zzw2 = zzx5 + 1;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i5 & i2) != 0) {
                        Object object = unsafe.getObject(t, j2);
                        if (object instanceof zzgex) {
                            zzx6 = zzgfh.zzx(i8 << 3);
                            zzc = ((zzgex) object).zzc();
                            zzx7 = zzgfh.zzx(zzc);
                            i3 = zzx7 + zzc + zzx6;
                            i4 += i3;
                            break;
                        } else {
                            zzx4 = zzgfh.zzx(i8 << 3);
                            zzw = zzgfh.zzz((String) object);
                            zzw2 = zzw + zzx4;
                            i4 += zzw2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if ((i5 & i2) != 0) {
                        zzw2 = zzgib.zzw(i8, unsafe.getObject(t, j2), zzw(i7));
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i5 & i2) != 0) {
                        zzx6 = zzgfh.zzx(i8 << 3);
                        zzc = ((zzgex) unsafe.getObject(t, j2)).zzc();
                        zzx7 = zzgfh.zzx(zzc);
                        i3 = zzx7 + zzc + zzx6;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i5 & i2) != 0) {
                        int i12 = unsafe.getInt(t, j2);
                        zzx4 = zzgfh.zzx(i8 << 3);
                        zzw = zzgfh.zzx(i12);
                        zzw2 = zzw + zzx4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i5 & i2) != 0) {
                        int i13 = unsafe.getInt(t, j2);
                        zzx4 = zzgfh.zzx(i8 << 3);
                        zzw = zzgfh.zzw(i13);
                        zzw2 = zzw + zzx4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i5 & i2) != 0) {
                        zzx2 = zzgfh.zzx(i8 << 3);
                        zzw2 = zzx2 + 4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i5 & i2) != 0) {
                        zzx = zzgfh.zzx(i8 << 3);
                        zzw2 = zzx + 8;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i5 & i2) != 0) {
                        int i14 = unsafe.getInt(t, j2);
                        zzx4 = zzgfh.zzx(i8 << 3);
                        zzw = zzgfh.zzx((i14 >> 31) ^ (i14 + i14));
                        zzw2 = zzw + zzx4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i5 & i2) != 0) {
                        long j5 = unsafe.getLong(t, j2);
                        zzx4 = zzgfh.zzx(i8 << 3);
                        zzw = zzgfh.zzy((j5 >> 63) ^ (j5 + j5));
                        zzw2 = zzw + zzx4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i5 & i2) != 0) {
                        zzw2 = zzgfh.zzF(i8, (zzghi) unsafe.getObject(t, j2), zzw(i7));
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    zzw2 = zzgib.zzs(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzw2;
                    break;
                case 19:
                    zzw2 = zzgib.zzq(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzw2;
                    break;
                case 20:
                    zzw2 = zzgib.zzc(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzw2;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    zzw2 = zzgib.zze(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzw2;
                    break;
                case 22:
                    zzw2 = zzgib.zzk(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzw2;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzw2 = zzgib.zzs(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzw2;
                    break;
                case 24:
                    zzw2 = zzgib.zzq(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzw2;
                    break;
                case 25:
                    zzw2 = zzgib.zzu(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzw2;
                    break;
                case 26:
                    zzw2 = zzgib.zzv(i8, (List) unsafe.getObject(t, j2));
                    i4 += zzw2;
                    break;
                case 27:
                    zzw2 = zzgib.zzx(i8, (List) unsafe.getObject(t, j2), zzw(i7));
                    i4 += zzw2;
                    break;
                case 28:
                    zzw2 = zzgib.zzy(i8, (List) unsafe.getObject(t, j2));
                    i4 += zzw2;
                    break;
                case 29:
                    zzw2 = zzgib.zzm(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzw2;
                    break;
                case 30:
                    zzw2 = zzgib.zzi(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzw2;
                    break;
                case 31:
                    zzw2 = zzgib.zzq(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzw2;
                    break;
                case 32:
                    zzw2 = zzgib.zzs(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzw2;
                    break;
                case 33:
                    zzw2 = zzgib.zzo(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzw2;
                    break;
                case 34:
                    zzw2 = zzgib.zzg(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzw2;
                    break;
                case 35:
                    zzr = zzgib.zzr((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i8);
                        zzx8 = zzgfh.zzx(zzr);
                        i3 = zzx8 + zzv + zzr;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzr = zzgib.zzp((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i8);
                        zzx8 = zzgfh.zzx(zzr);
                        i3 = zzx8 + zzv + zzr;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzr = zzgib.zzb((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i8);
                        zzx8 = zzgfh.zzx(zzr);
                        i3 = zzx8 + zzv + zzr;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzr = zzgib.zzd((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i8);
                        zzx8 = zzgfh.zzx(zzr);
                        i3 = zzx8 + zzv + zzr;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzr = zzgib.zzj((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i8);
                        zzx8 = zzgfh.zzx(zzr);
                        i3 = zzx8 + zzv + zzr;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzr = zzgib.zzr((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i8);
                        zzx8 = zzgfh.zzx(zzr);
                        i3 = zzx8 + zzv + zzr;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzr = zzgib.zzp((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i8);
                        zzx8 = zzgfh.zzx(zzr);
                        i3 = zzx8 + zzv + zzr;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzr = zzgib.zzt((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i8);
                        zzx8 = zzgfh.zzx(zzr);
                        i3 = zzx8 + zzv + zzr;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzr = zzgib.zzl((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i8);
                        zzx8 = zzgfh.zzx(zzr);
                        i3 = zzx8 + zzv + zzr;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzr = zzgib.zzh((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i8);
                        zzx8 = zzgfh.zzx(zzr);
                        i3 = zzx8 + zzv + zzr;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzr = zzgib.zzp((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i8);
                        zzx8 = zzgfh.zzx(zzr);
                        i3 = zzx8 + zzv + zzr;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzr = zzgib.zzr((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i8);
                        zzx8 = zzgfh.zzx(zzr);
                        i3 = zzx8 + zzv + zzr;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzr = zzgib.zzn((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i8);
                        zzx8 = zzgfh.zzx(zzr);
                        i3 = zzx8 + zzv + zzr;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case SyslogConstants.LOG_LPR /* 48 */:
                    zzr = zzgib.zzf((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i8);
                        zzx8 = zzgfh.zzx(zzr);
                        i3 = zzx8 + zzv + zzr;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzw2 = zzgib.zzz(i8, (List) unsafe.getObject(t, j2), zzw(i7));
                    i4 += zzw2;
                    break;
                case 50:
                    zzghd.zza(i8, unsafe.getObject(t, j2), zzx(i7));
                    break;
                case 51:
                    if (zzQ(t, i8, i7)) {
                        zzx = zzgfh.zzx(i8 << 3);
                        zzw2 = zzx + 8;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzQ(t, i8, i7)) {
                        zzx2 = zzgfh.zzx(i8 << 3);
                        zzw2 = zzx2 + 4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzQ(t, i8, i7)) {
                        long zzK = zzK(t, j2);
                        zzx3 = zzgfh.zzx(i8 << 3);
                        zzy = zzgfh.zzy(zzK);
                        i4 = zzy + zzx3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzQ(t, i8, i7)) {
                        long zzK2 = zzK(t, j2);
                        zzx3 = zzgfh.zzx(i8 << 3);
                        zzy = zzgfh.zzy(zzK2);
                        i4 = zzy + zzx3 + i4;
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 55 */:
                    if (zzQ(t, i8, i7)) {
                        int zzJ = zzJ(t, j2);
                        zzx4 = zzgfh.zzx(i8 << 3);
                        zzw = zzgfh.zzw(zzJ);
                        zzw2 = zzw + zzx4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case SyslogConstants.LOG_NEWS /* 56 */:
                    if (zzQ(t, i8, i7)) {
                        zzx = zzgfh.zzx(i8 << 3);
                        zzw2 = zzx + 8;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzQ(t, i8, i7)) {
                        zzx2 = zzgfh.zzx(i8 << 3);
                        zzw2 = zzx2 + 4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzQ(t, i8, i7)) {
                        zzx5 = zzgfh.zzx(i8 << 3);
                        zzw2 = zzx5 + 1;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzQ(t, i8, i7)) {
                        Object object2 = unsafe.getObject(t, j2);
                        if (object2 instanceof zzgex) {
                            zzx6 = zzgfh.zzx(i8 << 3);
                            zzc = ((zzgex) object2).zzc();
                            zzx7 = zzgfh.zzx(zzc);
                            i3 = zzx7 + zzc + zzx6;
                            i4 += i3;
                            break;
                        } else {
                            zzx4 = zzgfh.zzx(i8 << 3);
                            zzw = zzgfh.zzz((String) object2);
                            zzw2 = zzw + zzx4;
                            i4 += zzw2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzQ(t, i8, i7)) {
                        zzw2 = zzgib.zzw(i8, unsafe.getObject(t, j2), zzw(i7));
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzQ(t, i8, i7)) {
                        zzx6 = zzgfh.zzx(i8 << 3);
                        zzc = ((zzgex) unsafe.getObject(t, j2)).zzc();
                        zzx7 = zzgfh.zzx(zzc);
                        i3 = zzx7 + zzc + zzx6;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzQ(t, i8, i7)) {
                        int zzJ2 = zzJ(t, j2);
                        zzx4 = zzgfh.zzx(i8 << 3);
                        zzw = zzgfh.zzx(zzJ2);
                        zzw2 = zzw + zzx4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzQ(t, i8, i7)) {
                        int zzJ3 = zzJ(t, j2);
                        zzx4 = zzgfh.zzx(i8 << 3);
                        zzw = zzgfh.zzw(zzJ3);
                        zzw2 = zzw + zzx4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzQ(t, i8, i7)) {
                        zzx2 = zzgfh.zzx(i8 << 3);
                        zzw2 = zzx2 + 4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzQ(t, i8, i7)) {
                        zzx = zzgfh.zzx(i8 << 3);
                        zzw2 = zzx + 8;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzQ(t, i8, i7)) {
                        int zzJ4 = zzJ(t, j2);
                        zzx4 = zzgfh.zzx(i8 << 3);
                        zzw = zzgfh.zzx((zzJ4 >> 31) ^ (zzJ4 + zzJ4));
                        zzw2 = zzw + zzx4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzQ(t, i8, i7)) {
                        long zzK3 = zzK(t, j2);
                        zzx4 = zzgfh.zzx(i8 << 3);
                        zzw = zzgfh.zzy((zzK3 >> 63) ^ (zzK3 + zzK3));
                        zzw2 = zzw + zzx4;
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzQ(t, i8, i7)) {
                        zzw2 = zzgfh.zzF(i8, (zzghi) unsafe.getObject(t, j2), zzw(i7));
                        i4 += zzw2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzgio<?, ?> zzgioVar = this.zzo;
        int zzq = zzgioVar.zzq(zzgioVar.zzj(t)) + i4;
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
        int zzr;
        int zzv;
        int zzx8;
        int i2;
        Unsafe unsafe = zzb;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzD = zzD(i4);
            int zzF = zzF(zzD);
            int i5 = this.zzc[i4];
            long j2 = zzD & 1048575;
            if (zzF >= zzgfs.zzJ.zza() && zzF <= zzgfs.zzW.zza()) {
                int i6 = this.zzc[i4 + 2];
            }
            switch (zzF) {
                case 0:
                    if (zzO(t, i4)) {
                        zzx = zzgfh.zzx(i5 << 3);
                        zzw2 = zzx + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (zzO(t, i4)) {
                        zzx2 = zzgfh.zzx(i5 << 3);
                        zzw2 = zzx2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (zzO(t, i4)) {
                        long zzf = zzgiy.zzf(t, j2);
                        zzx3 = zzgfh.zzx(i5 << 3);
                        zzy = zzgfh.zzy(zzf);
                        zzw2 = zzy + zzx3;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (zzO(t, i4)) {
                        long zzf2 = zzgiy.zzf(t, j2);
                        zzx3 = zzgfh.zzx(i5 << 3);
                        zzy = zzgfh.zzy(zzf2);
                        zzw2 = zzy + zzx3;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (zzO(t, i4)) {
                        int zzd = zzgiy.zzd(t, j2);
                        zzx4 = zzgfh.zzx(i5 << 3);
                        zzw = zzgfh.zzw(zzd);
                        zzw2 = zzw + zzx4;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (zzO(t, i4)) {
                        zzx = zzgfh.zzx(i5 << 3);
                        zzw2 = zzx + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (zzO(t, i4)) {
                        zzx2 = zzgfh.zzx(i5 << 3);
                        zzw2 = zzx2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (zzO(t, i4)) {
                        zzx5 = zzgfh.zzx(i5 << 3);
                        zzw2 = zzx5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (zzO(t, i4)) {
                        Object zzn = zzgiy.zzn(t, j2);
                        if (!(zzn instanceof zzgex)) {
                            zzx4 = zzgfh.zzx(i5 << 3);
                            zzw = zzgfh.zzz((String) zzn);
                            zzw2 = zzw + zzx4;
                            break;
                        } else {
                            zzx6 = zzgfh.zzx(i5 << 3);
                            zzc = ((zzgex) zzn).zzc();
                            zzx7 = zzgfh.zzx(zzc);
                            i2 = zzx7 + zzc + zzx6;
                            i3 += i2;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (zzO(t, i4)) {
                        zzw2 = zzgib.zzw(i5, zzgiy.zzn(t, j2), zzw(i4));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (zzO(t, i4)) {
                        zzx6 = zzgfh.zzx(i5 << 3);
                        zzc = ((zzgex) zzgiy.zzn(t, j2)).zzc();
                        zzx7 = zzgfh.zzx(zzc);
                        i2 = zzx7 + zzc + zzx6;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 11:
                    if (zzO(t, i4)) {
                        int zzd2 = zzgiy.zzd(t, j2);
                        zzx4 = zzgfh.zzx(i5 << 3);
                        zzw = zzgfh.zzx(zzd2);
                        zzw2 = zzw + zzx4;
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (zzO(t, i4)) {
                        int zzd3 = zzgiy.zzd(t, j2);
                        zzx4 = zzgfh.zzx(i5 << 3);
                        zzw = zzgfh.zzw(zzd3);
                        zzw2 = zzw + zzx4;
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (zzO(t, i4)) {
                        zzx2 = zzgfh.zzx(i5 << 3);
                        zzw2 = zzx2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (zzO(t, i4)) {
                        zzx = zzgfh.zzx(i5 << 3);
                        zzw2 = zzx + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (zzO(t, i4)) {
                        int zzd4 = zzgiy.zzd(t, j2);
                        zzx4 = zzgfh.zzx(i5 << 3);
                        zzw = zzgfh.zzx((zzd4 >> 31) ^ (zzd4 + zzd4));
                        zzw2 = zzw + zzx4;
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (zzO(t, i4)) {
                        long zzf3 = zzgiy.zzf(t, j2);
                        zzx4 = zzgfh.zzx(i5 << 3);
                        zzw = zzgfh.zzy((zzf3 >> 63) ^ (zzf3 + zzf3));
                        zzw2 = zzw + zzx4;
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (zzO(t, i4)) {
                        zzw2 = zzgfh.zzF(i5, (zzghi) zzgiy.zzn(t, j2), zzw(i4));
                        break;
                    } else {
                        continue;
                    }
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    zzw2 = zzgib.zzs(i5, (List) zzgiy.zzn(t, j2), false);
                    break;
                case 19:
                    zzw2 = zzgib.zzq(i5, (List) zzgiy.zzn(t, j2), false);
                    break;
                case 20:
                    zzw2 = zzgib.zzc(i5, (List) zzgiy.zzn(t, j2), false);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    zzw2 = zzgib.zze(i5, (List) zzgiy.zzn(t, j2), false);
                    break;
                case 22:
                    zzw2 = zzgib.zzk(i5, (List) zzgiy.zzn(t, j2), false);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzw2 = zzgib.zzs(i5, (List) zzgiy.zzn(t, j2), false);
                    break;
                case 24:
                    zzw2 = zzgib.zzq(i5, (List) zzgiy.zzn(t, j2), false);
                    break;
                case 25:
                    zzw2 = zzgib.zzu(i5, (List) zzgiy.zzn(t, j2), false);
                    break;
                case 26:
                    zzw2 = zzgib.zzv(i5, (List) zzgiy.zzn(t, j2));
                    break;
                case 27:
                    zzw2 = zzgib.zzx(i5, (List) zzgiy.zzn(t, j2), zzw(i4));
                    break;
                case 28:
                    zzw2 = zzgib.zzy(i5, (List) zzgiy.zzn(t, j2));
                    break;
                case 29:
                    zzw2 = zzgib.zzm(i5, (List) zzgiy.zzn(t, j2), false);
                    break;
                case 30:
                    zzw2 = zzgib.zzi(i5, (List) zzgiy.zzn(t, j2), false);
                    break;
                case 31:
                    zzw2 = zzgib.zzq(i5, (List) zzgiy.zzn(t, j2), false);
                    break;
                case 32:
                    zzw2 = zzgib.zzs(i5, (List) zzgiy.zzn(t, j2), false);
                    break;
                case 33:
                    zzw2 = zzgib.zzo(i5, (List) zzgiy.zzn(t, j2), false);
                    break;
                case 34:
                    zzw2 = zzgib.zzg(i5, (List) zzgiy.zzn(t, j2), false);
                    break;
                case 35:
                    zzr = zzgib.zzr((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i5);
                        zzx8 = zzgfh.zzx(zzr);
                        i2 = zzx8 + zzv + zzr;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 36:
                    zzr = zzgib.zzp((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i5);
                        zzx8 = zzgfh.zzx(zzr);
                        i2 = zzx8 + zzv + zzr;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 37:
                    zzr = zzgib.zzb((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i5);
                        zzx8 = zzgfh.zzx(zzr);
                        i2 = zzx8 + zzv + zzr;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 38:
                    zzr = zzgib.zzd((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i5);
                        zzx8 = zzgfh.zzx(zzr);
                        i2 = zzx8 + zzv + zzr;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 39:
                    zzr = zzgib.zzj((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i5);
                        zzx8 = zzgfh.zzx(zzr);
                        i2 = zzx8 + zzv + zzr;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 40:
                    zzr = zzgib.zzr((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i5);
                        zzx8 = zzgfh.zzx(zzr);
                        i2 = zzx8 + zzv + zzr;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 41:
                    zzr = zzgib.zzp((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i5);
                        zzx8 = zzgfh.zzx(zzr);
                        i2 = zzx8 + zzv + zzr;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 42:
                    zzr = zzgib.zzt((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i5);
                        zzx8 = zzgfh.zzx(zzr);
                        i2 = zzx8 + zzv + zzr;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 43:
                    zzr = zzgib.zzl((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i5);
                        zzx8 = zzgfh.zzx(zzr);
                        i2 = zzx8 + zzv + zzr;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 44:
                    zzr = zzgib.zzh((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i5);
                        zzx8 = zzgfh.zzx(zzr);
                        i2 = zzx8 + zzv + zzr;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 45:
                    zzr = zzgib.zzp((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i5);
                        zzx8 = zzgfh.zzx(zzr);
                        i2 = zzx8 + zzv + zzr;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 46:
                    zzr = zzgib.zzr((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i5);
                        zzx8 = zzgfh.zzx(zzr);
                        i2 = zzx8 + zzv + zzr;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 47:
                    zzr = zzgib.zzn((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i5);
                        zzx8 = zzgfh.zzx(zzr);
                        i2 = zzx8 + zzv + zzr;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case SyslogConstants.LOG_LPR /* 48 */:
                    zzr = zzgib.zzf((List) unsafe.getObject(t, j2));
                    if (zzr > 0) {
                        zzv = zzgfh.zzv(i5);
                        zzx8 = zzgfh.zzx(zzr);
                        i2 = zzx8 + zzv + zzr;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 49:
                    zzw2 = zzgib.zzz(i5, (List) zzgiy.zzn(t, j2), zzw(i4));
                    break;
                case 50:
                    zzghd.zza(i5, zzgiy.zzn(t, j2), zzx(i4));
                    continue;
                case 51:
                    if (zzQ(t, i5, i4)) {
                        zzx = zzgfh.zzx(i5 << 3);
                        zzw2 = zzx + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (zzQ(t, i5, i4)) {
                        zzx2 = zzgfh.zzx(i5 << 3);
                        zzw2 = zzx2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (zzQ(t, i5, i4)) {
                        long zzK = zzK(t, j2);
                        zzx3 = zzgfh.zzx(i5 << 3);
                        zzy = zzgfh.zzy(zzK);
                        zzw2 = zzy + zzx3;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (zzQ(t, i5, i4)) {
                        long zzK2 = zzK(t, j2);
                        zzx3 = zzgfh.zzx(i5 << 3);
                        zzy = zzgfh.zzy(zzK2);
                        zzw2 = zzy + zzx3;
                        break;
                    } else {
                        continue;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 55 */:
                    if (zzQ(t, i5, i4)) {
                        int zzJ = zzJ(t, j2);
                        zzx4 = zzgfh.zzx(i5 << 3);
                        zzw = zzgfh.zzw(zzJ);
                        zzw2 = zzw + zzx4;
                        break;
                    } else {
                        continue;
                    }
                case SyslogConstants.LOG_NEWS /* 56 */:
                    if (zzQ(t, i5, i4)) {
                        zzx = zzgfh.zzx(i5 << 3);
                        zzw2 = zzx + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (zzQ(t, i5, i4)) {
                        zzx2 = zzgfh.zzx(i5 << 3);
                        zzw2 = zzx2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (zzQ(t, i5, i4)) {
                        zzx5 = zzgfh.zzx(i5 << 3);
                        zzw2 = zzx5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (zzQ(t, i5, i4)) {
                        Object zzn2 = zzgiy.zzn(t, j2);
                        if (!(zzn2 instanceof zzgex)) {
                            zzx4 = zzgfh.zzx(i5 << 3);
                            zzw = zzgfh.zzz((String) zzn2);
                            zzw2 = zzw + zzx4;
                            break;
                        } else {
                            zzx6 = zzgfh.zzx(i5 << 3);
                            zzc = ((zzgex) zzn2).zzc();
                            zzx7 = zzgfh.zzx(zzc);
                            i2 = zzx7 + zzc + zzx6;
                            i3 += i2;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (zzQ(t, i5, i4)) {
                        zzw2 = zzgib.zzw(i5, zzgiy.zzn(t, j2), zzw(i4));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (zzQ(t, i5, i4)) {
                        zzx6 = zzgfh.zzx(i5 << 3);
                        zzc = ((zzgex) zzgiy.zzn(t, j2)).zzc();
                        zzx7 = zzgfh.zzx(zzc);
                        i2 = zzx7 + zzc + zzx6;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 62:
                    if (zzQ(t, i5, i4)) {
                        int zzJ2 = zzJ(t, j2);
                        zzx4 = zzgfh.zzx(i5 << 3);
                        zzw = zzgfh.zzx(zzJ2);
                        zzw2 = zzw + zzx4;
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (zzQ(t, i5, i4)) {
                        int zzJ3 = zzJ(t, j2);
                        zzx4 = zzgfh.zzx(i5 << 3);
                        zzw = zzgfh.zzw(zzJ3);
                        zzw2 = zzw + zzx4;
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (zzQ(t, i5, i4)) {
                        zzx2 = zzgfh.zzx(i5 << 3);
                        zzw2 = zzx2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (zzQ(t, i5, i4)) {
                        zzx = zzgfh.zzx(i5 << 3);
                        zzw2 = zzx + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (zzQ(t, i5, i4)) {
                        int zzJ4 = zzJ(t, j2);
                        zzx4 = zzgfh.zzx(i5 << 3);
                        zzw = zzgfh.zzx((zzJ4 >> 31) ^ (zzJ4 + zzJ4));
                        zzw2 = zzw + zzx4;
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (zzQ(t, i5, i4)) {
                        long zzK3 = zzK(t, j2);
                        zzx4 = zzgfh.zzx(i5 << 3);
                        zzw = zzgfh.zzy((zzK3 >> 63) ^ (zzK3 + zzK3));
                        zzw2 = zzw + zzx4;
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (zzQ(t, i5, i4)) {
                        zzw2 = zzgfh.zzF(i5, (zzghi) zzgiy.zzn(t, j2), zzw(i4));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i3 += zzw2;
        }
        zzgio<?, ?> zzgioVar = this.zzo;
        return zzgioVar.zzq(zzgioVar.zzj(t)) + i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021a -> B:120:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:67:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cc -> B:100:0x01cd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzt(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.ads.zzgej r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzghl.zzt(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.zzgej):int");
    }

    private final <K, V> int zzu(T t, byte[] bArr, int i2, int i3, int i4, long j2, zzgej zzgejVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzx = zzx(i4);
        Object object = unsafe.getObject(t, j2);
        if (zzghd.zzb(object)) {
            zzghc<K, V> zzc = zzghc.zza().zzc();
            zzghd.zzc(zzc, object);
            unsafe.putObject(t, j2, zzc);
        }
        zzghb zzghbVar = (zzghb) zzx;
        throw null;
    }

    private final int zzv(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, zzgej zzgejVar) throws IOException {
        Unsafe unsafe = zzb;
        long j3 = this.zzc[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Double.valueOf(Double.longBitsToDouble(zzgek.zze(bArr, i2))));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 8;
                }
                break;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Float.valueOf(Float.intBitsToFloat(zzgek.zzd(bArr, i2))));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 4;
                }
                break;
            case 53:
            case 54:
                if (i6 == 0) {
                    int zzc = zzgek.zzc(bArr, i2, zzgejVar);
                    unsafe.putObject(t, j2, Long.valueOf(zzgejVar.zzb));
                    unsafe.putInt(t, j3, i5);
                    return zzc;
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 55 */:
            case 62:
                if (i6 == 0) {
                    int zza2 = zzgek.zza(bArr, i2, zzgejVar);
                    unsafe.putObject(t, j2, Integer.valueOf(zzgejVar.zza));
                    unsafe.putInt(t, j3, i5);
                    return zza2;
                }
                break;
            case SyslogConstants.LOG_NEWS /* 56 */:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Long.valueOf(zzgek.zze(bArr, i2)));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 8;
                }
                break;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Integer.valueOf(zzgek.zzd(bArr, i2)));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 4;
                }
                break;
            case 58:
                if (i6 == 0) {
                    int zzc2 = zzgek.zzc(bArr, i2, zzgejVar);
                    unsafe.putObject(t, j2, Boolean.valueOf(zzgejVar.zzb != 0));
                    unsafe.putInt(t, j3, i5);
                    return zzc2;
                }
                break;
            case 59:
                if (i6 == 2) {
                    int zza3 = zzgek.zza(bArr, i2, zzgejVar);
                    int i10 = zzgejVar.zza;
                    if (i10 == 0) {
                        unsafe.putObject(t, j2, "");
                    } else if ((i7 & 536870912) != 0 && !zzgjd.zzb(bArr, zza3, zza3 + i10)) {
                        throw zzggm.zzl();
                    } else {
                        unsafe.putObject(t, j2, new String(bArr, zza3, i10, zzggk.zza));
                        zza3 += i10;
                    }
                    unsafe.putInt(t, j3, i5);
                    return zza3;
                }
                break;
            case 60:
                if (i6 == 2) {
                    int zzi = zzgek.zzi(zzw(i9), bArr, i2, i3, zzgejVar);
                    Object object = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t, j2, zzgejVar.zzc);
                    } else {
                        unsafe.putObject(t, j2, zzggk.zzi(object, zzgejVar.zzc));
                    }
                    unsafe.putInt(t, j3, i5);
                    return zzi;
                }
                break;
            case 61:
                if (i6 == 2) {
                    int zzh = zzgek.zzh(bArr, i2, zzgejVar);
                    unsafe.putObject(t, j2, zzgejVar.zzc);
                    unsafe.putInt(t, j3, i5);
                    return zzh;
                }
                break;
            case 63:
                if (i6 == 0) {
                    int zza4 = zzgek.zza(bArr, i2, zzgejVar);
                    int i11 = zzgejVar.zza;
                    zzgge zzy = zzy(i9);
                    if (zzy == null || zzy.zza(i11)) {
                        unsafe.putObject(t, j2, Integer.valueOf(i11));
                        unsafe.putInt(t, j3, i5);
                    } else {
                        zzg(t).zzh(i4, Long.valueOf(i11));
                    }
                    return zza4;
                }
                break;
            case 66:
                if (i6 == 0) {
                    int zza5 = zzgek.zza(bArr, i2, zzgejVar);
                    unsafe.putObject(t, j2, Integer.valueOf(zzgfc.zzG(zzgejVar.zza)));
                    unsafe.putInt(t, j3, i5);
                    return zza5;
                }
                break;
            case 67:
                if (i6 == 0) {
                    int zzc3 = zzgek.zzc(bArr, i2, zzgejVar);
                    unsafe.putObject(t, j2, Long.valueOf(zzgfc.zzH(zzgejVar.zzb)));
                    unsafe.putInt(t, j3, i5);
                    return zzc3;
                }
                break;
            case 68:
                if (i6 == 3) {
                    int zzj = zzgek.zzj(zzw(i9), bArr, i2, i3, (i4 & (-8)) | 4, zzgejVar);
                    Object object2 = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j2, zzgejVar.zzc);
                    } else {
                        unsafe.putObject(t, j2, zzggk.zzi(object2, zzgejVar.zzc));
                    }
                    unsafe.putInt(t, j3, i5);
                    return zzj;
                }
                break;
        }
        return i2;
    }

    private final zzghz zzw(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzghz zzghzVar = (zzghz) this.zzd[i4];
        if (zzghzVar != null) {
            return zzghzVar;
        }
        zzghz<T> zzb2 = zzghq.zza().zzb((Class) this.zzd[i4 + 1]);
        this.zzd[i4] = zzb2;
        return zzb2;
    }

    private final Object zzx(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    private final zzgge zzy(int i2) {
        int i3 = i2 / 3;
        return (zzgge) this.zzd[i3 + i3 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02a8, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02aa, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r19;
        r1 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02be, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02f1, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0314, code lost:
        if (r0 != r15) goto L152;
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
        for (int i2 = 0; i2 < length; i2 += 3) {
            int zzD2 = zzD(i2);
            long j2 = zzD2 & 1048575;
            switch (zzF(zzD2)) {
                case 0:
                    if (zzM(t, t2, i2) && Double.doubleToLongBits(zzgiy.zzl(t, j2)) == Double.doubleToLongBits(zzgiy.zzl(t2, j2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzM(t, t2, i2) && Float.floatToIntBits(zzgiy.zzj(t, j2)) == Float.floatToIntBits(zzgiy.zzj(t2, j2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzM(t, t2, i2) && zzgiy.zzf(t, j2) == zzgiy.zzf(t2, j2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzM(t, t2, i2) && zzgiy.zzf(t, j2) == zzgiy.zzf(t2, j2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzM(t, t2, i2) && zzgiy.zzd(t, j2) == zzgiy.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzM(t, t2, i2) && zzgiy.zzf(t, j2) == zzgiy.zzf(t2, j2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzM(t, t2, i2) && zzgiy.zzd(t, j2) == zzgiy.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzM(t, t2, i2) && zzgiy.zzh(t, j2) == zzgiy.zzh(t2, j2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzM(t, t2, i2) && zzgib.zzD(zzgiy.zzn(t, j2), zzgiy.zzn(t2, j2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzM(t, t2, i2) && zzgib.zzD(zzgiy.zzn(t, j2), zzgiy.zzn(t2, j2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzM(t, t2, i2) && zzgib.zzD(zzgiy.zzn(t, j2), zzgiy.zzn(t2, j2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzM(t, t2, i2) && zzgiy.zzd(t, j2) == zzgiy.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzM(t, t2, i2) && zzgiy.zzd(t, j2) == zzgiy.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzM(t, t2, i2) && zzgiy.zzd(t, j2) == zzgiy.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzM(t, t2, i2) && zzgiy.zzf(t, j2) == zzgiy.zzf(t2, j2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzM(t, t2, i2) && zzgiy.zzd(t, j2) == zzgiy.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzM(t, t2, i2) && zzgiy.zzf(t, j2) == zzgiy.zzf(t2, j2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzM(t, t2, i2) && zzgib.zzD(zzgiy.zzn(t, j2), zzgiy.zzn(t2, j2))) {
                        continue;
                    }
                    return false;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
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
                case SyslogConstants.LOG_LPR /* 48 */:
                case 49:
                    zzD = zzgib.zzD(zzgiy.zzn(t, j2), zzgiy.zzn(t2, j2));
                    break;
                case 50:
                    zzD = zzgib.zzD(zzgiy.zzn(t, j2), zzgiy.zzn(t2, j2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case ModuleDescriptor.MODULE_VERSION /* 55 */:
                case SyslogConstants.LOG_NEWS /* 56 */:
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
                    long zzE = zzE(i2) & 1048575;
                    if (zzgiy.zzd(t, zzE) == zzgiy.zzd(t2, zzE) && zzgib.zzD(zzgiy.zzn(t, j2), zzgiy.zzn(t2, j2))) {
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
        int i2;
        int zze;
        int i3;
        int zzJ;
        int length = this.zzc.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int zzD = zzD(i5);
            int i6 = this.zzc[i5];
            long j2 = 1048575 & zzD;
            int i7 = 37;
            switch (zzF(zzD)) {
                case 0:
                    i2 = i4 * 53;
                    zze = zzggk.zze(Double.doubleToLongBits(zzgiy.zzl(t, j2)));
                    i4 = zze + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    zze = Float.floatToIntBits(zzgiy.zzj(t, j2));
                    i4 = zze + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    zze = zzggk.zze(zzgiy.zzf(t, j2));
                    i4 = zze + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    zze = zzggk.zze(zzgiy.zzf(t, j2));
                    i4 = zze + i2;
                    break;
                case 4:
                    i2 = i4 * 53;
                    zze = zzgiy.zzd(t, j2);
                    i4 = zze + i2;
                    break;
                case 5:
                    i2 = i4 * 53;
                    zze = zzggk.zze(zzgiy.zzf(t, j2));
                    i4 = zze + i2;
                    break;
                case 6:
                    i2 = i4 * 53;
                    zze = zzgiy.zzd(t, j2);
                    i4 = zze + i2;
                    break;
                case 7:
                    i2 = i4 * 53;
                    zze = zzggk.zzf(zzgiy.zzh(t, j2));
                    i4 = zze + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    zze = ((String) zzgiy.zzn(t, j2)).hashCode();
                    i4 = zze + i2;
                    break;
                case 9:
                    Object zzn = zzgiy.zzn(t, j2);
                    if (zzn != null) {
                        i7 = zzn.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 10:
                    i2 = i4 * 53;
                    zze = zzgiy.zzn(t, j2).hashCode();
                    i4 = zze + i2;
                    break;
                case 11:
                    i2 = i4 * 53;
                    zze = zzgiy.zzd(t, j2);
                    i4 = zze + i2;
                    break;
                case 12:
                    i2 = i4 * 53;
                    zze = zzgiy.zzd(t, j2);
                    i4 = zze + i2;
                    break;
                case 13:
                    i2 = i4 * 53;
                    zze = zzgiy.zzd(t, j2);
                    i4 = zze + i2;
                    break;
                case 14:
                    i2 = i4 * 53;
                    zze = zzggk.zze(zzgiy.zzf(t, j2));
                    i4 = zze + i2;
                    break;
                case 15:
                    i2 = i4 * 53;
                    zze = zzgiy.zzd(t, j2);
                    i4 = zze + i2;
                    break;
                case 16:
                    i2 = i4 * 53;
                    zze = zzggk.zze(zzgiy.zzf(t, j2));
                    i4 = zze + i2;
                    break;
                case 17:
                    Object zzn2 = zzgiy.zzn(t, j2);
                    if (zzn2 != null) {
                        i7 = zzn2.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
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
                case SyslogConstants.LOG_LPR /* 48 */:
                case 49:
                    i2 = i4 * 53;
                    zze = zzgiy.zzn(t, j2).hashCode();
                    i4 = zze + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    zze = zzgiy.zzn(t, j2).hashCode();
                    i4 = zze + i2;
                    break;
                case 51:
                    if (zzQ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zze = zzggk.zze(Double.doubleToLongBits(zzH(t, j2)));
                        i4 = zze + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzQ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zze = Float.floatToIntBits(zzI(t, j2));
                        i4 = zze + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzQ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zze = zzggk.zze(zzK(t, j2));
                        i4 = zze + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzQ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zze = zzggk.zze(zzK(t, j2));
                        i4 = zze + i2;
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 55 */:
                    if (zzQ(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzJ = zzJ(t, j2);
                        i4 = i3 + zzJ;
                        break;
                    } else {
                        break;
                    }
                case SyslogConstants.LOG_NEWS /* 56 */:
                    if (zzQ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zze = zzggk.zze(zzK(t, j2));
                        i4 = zze + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzQ(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzJ = zzJ(t, j2);
                        i4 = i3 + zzJ;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzQ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zze = zzggk.zzf(zzL(t, j2));
                        i4 = zze + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzQ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zze = ((String) zzgiy.zzn(t, j2)).hashCode();
                        i4 = zze + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzQ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zze = zzgiy.zzn(t, j2).hashCode();
                        i4 = zze + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzQ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zze = zzgiy.zzn(t, j2).hashCode();
                        i4 = zze + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzQ(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzJ = zzJ(t, j2);
                        i4 = i3 + zzJ;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzQ(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzJ = zzJ(t, j2);
                        i4 = i3 + zzJ;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzQ(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzJ = zzJ(t, j2);
                        i4 = i3 + zzJ;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzQ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zze = zzggk.zze(zzK(t, j2));
                        i4 = zze + i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzQ(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzJ = zzJ(t, j2);
                        i4 = i3 + zzJ;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzQ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zze = zzggk.zze(zzK(t, j2));
                        i4 = zze + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzQ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zze = zzgiy.zzn(t, j2).hashCode();
                        i4 = zze + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzo.zzj(t).hashCode() + (i4 * 53);
        if (this.zzh) {
            this.zzp.zzb(t);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzd(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzD = zzD(i2);
            long j2 = 1048575 & zzD;
            int i3 = this.zzc[i2];
            switch (zzF(zzD)) {
                case 0:
                    if (zzO(t2, i2)) {
                        zzgiy.zzm(t, j2, zzgiy.zzl(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(t2, i2)) {
                        zzgiy.zzk(t, j2, zzgiy.zzj(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(t2, i2)) {
                        zzgiy.zzg(t, j2, zzgiy.zzf(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(t2, i2)) {
                        zzgiy.zzg(t, j2, zzgiy.zzf(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(t2, i2)) {
                        zzgiy.zze(t, j2, zzgiy.zzd(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(t2, i2)) {
                        zzgiy.zzg(t, j2, zzgiy.zzf(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(t2, i2)) {
                        zzgiy.zze(t, j2, zzgiy.zzd(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(t2, i2)) {
                        zzgiy.zzi(t, j2, zzgiy.zzh(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(t2, i2)) {
                        zzgiy.zzo(t, j2, zzgiy.zzn(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzp(t, t2, i2);
                    break;
                case 10:
                    if (zzO(t2, i2)) {
                        zzgiy.zzo(t, j2, zzgiy.zzn(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(t2, i2)) {
                        zzgiy.zze(t, j2, zzgiy.zzd(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(t2, i2)) {
                        zzgiy.zze(t, j2, zzgiy.zzd(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(t2, i2)) {
                        zzgiy.zze(t, j2, zzgiy.zzd(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(t2, i2)) {
                        zzgiy.zzg(t, j2, zzgiy.zzf(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(t2, i2)) {
                        zzgiy.zze(t, j2, zzgiy.zzd(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(t2, i2)) {
                        zzgiy.zzg(t, j2, zzgiy.zzf(t2, j2));
                        zzP(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzp(t, t2, i2);
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
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
                case SyslogConstants.LOG_LPR /* 48 */:
                case 49:
                    this.zzn.zzc(t, t2, j2);
                    break;
                case 50:
                    zzgib.zzI(this.zzr, t, t2, j2);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case ModuleDescriptor.MODULE_VERSION /* 55 */:
                case SyslogConstants.LOG_NEWS /* 56 */:
                case 57:
                case 58:
                case 59:
                    if (zzQ(t2, i3, i2)) {
                        zzgiy.zzo(t, j2, zzgiy.zzn(t2, j2));
                        zzR(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzq(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzQ(t2, i3, i2)) {
                        zzgiy.zzo(t, j2, zzgiy.zzn(t2, j2));
                        zzR(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzq(t, t2, i2);
                    break;
            }
        }
        zzgib.zzF(this.zzo, t, t2);
        if (this.zzh) {
            zzgib.zzE(this.zzp, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final int zze(T t) {
        return this.zzj ? zzs(t) : zzr(t);
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzf(T t, zzght zzghtVar, zzgfm zzgfmVar) throws IOException {
        Objects.requireNonNull(zzgfmVar);
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
                                    long j2 = zzD & 1048575;
                                    zzgiy.zzo(t, j2, zzggk.zzi(zzgiy.zzn(t, j2), zzghtVar.zzo(zzw(zzS), zzgfmVar)));
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
                                    long j3 = zzD & 1048575;
                                    zzgiy.zzo(t, j3, zzggk.zzi(zzgiy.zzn(t, j3), zzghtVar.zzp(zzw(zzS), zzgfmVar)));
                                    break;
                                } else {
                                    zzgiy.zzo(t, zzD & 1048575, zzghtVar.zzp(zzw(zzS), zzgfmVar));
                                    zzP(t, zzS);
                                    break;
                                }
                            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                zzghtVar.zzx(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 19:
                                zzghtVar.zzy(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 20:
                                zzghtVar.zzA(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                zzghtVar.zzz(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 22:
                                zzghtVar.zzB(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case ConnectionResult.API_DISABLED /* 23 */:
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
                            case SyslogConstants.LOG_LPR /* 48 */:
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
                            case ModuleDescriptor.MODULE_VERSION /* 55 */:
                                zzgiy.zzo(t, zzD & 1048575, Integer.valueOf(zzghtVar.zzi()));
                                zzR(t, zzb2, zzS);
                                break;
                            case SyslogConstants.LOG_NEWS /* 56 */:
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
                                    long j4 = zzD & 1048575;
                                    zzgiy.zzo(t, j4, zzggk.zzi(zzgiy.zzn(t, j4), zzghtVar.zzo(zzw(zzS), zzgfmVar)));
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
                                    for (int i2 = this.zzl; i2 < this.zzm; i2++) {
                                        obj = zzA(t, this.zzk[i2], obj, zzgioVar);
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
                            for (int i3 = this.zzl; i3 < this.zzm; i3++) {
                                obj = zzA(t, this.zzk[i3], obj, zzgioVar);
                            }
                            if (obj != null) {
                                zzgioVar.zzl(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                } else if (zzb2 == Integer.MAX_VALUE) {
                    for (int i4 = this.zzl; i4 < this.zzm; i4++) {
                        obj = zzA(t, this.zzk[i4], obj, zzgioVar);
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
                            for (int i5 = this.zzl; i5 < this.zzm; i5++) {
                                obj = zzA(t, this.zzk[i5], obj, zzgioVar);
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
                for (int i6 = this.zzl; i6 < this.zzm; i6++) {
                    obj = zzA(t, this.zzk[i6], obj, zzgioVar);
                }
                if (obj != null) {
                    zzgioVar.zzl(t, obj);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x042b, code lost:
        if (r6 == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x042d, code lost:
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0433, code lost:
        r3 = r9.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0437, code lost:
        if (r3 >= r9.zzm) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0439, code lost:
        r9.zzA(r12, r9.zzk[r3], r2, r9.zzo);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0445, code lost:
        if (r7 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0449, code lost:
        if (r0 != r32) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0450, code lost:
        throw com.google.android.gms.internal.ads.zzggm.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0453, code lost:
        if (r0 > r32) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0455, code lost:
        if (r1 != r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0457, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x045d, code lost:
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
    public final void zzi(T t, byte[] bArr, int i2, int i3, zzgej zzgejVar) throws IOException {
        if (this.zzj) {
            zzz(t, bArr, i2, i3, zzgejVar);
        } else {
            zzh(t, bArr, i2, i3, 0, zzgejVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzj(T t) {
        int i2;
        int i3 = this.zzl;
        while (true) {
            i2 = this.zzm;
            if (i3 >= i2) {
                break;
            }
            long zzD = zzD(this.zzk[i3]) & 1048575;
            Object zzn = zzgiy.zzn(t, zzD);
            if (zzn != null) {
                ((zzghc) zzn).zzd();
                zzgiy.zzo(t, zzD, zzn);
            }
            i3++;
        }
        int length = this.zzk.length;
        while (i2 < length) {
            this.zzn.zzb(t, this.zzk[i2]);
            i2++;
        }
        this.zzo.zzm(t);
        if (this.zzh) {
            this.zzp.zzd(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzghz
    public final boolean zzk(T t) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzl) {
            int i7 = this.zzk[i6];
            int i8 = this.zzc[i7];
            int zzD = zzD(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(t, i10);
                }
                i3 = i5;
                i2 = i10;
            } else {
                i2 = i4;
                i3 = i5;
            }
            if ((268435456 & zzD) != 0 && !zzN(t, i7, i2, i3, i11)) {
                return false;
            }
            int zzF = zzF(zzD);
            if (zzF != 9 && zzF != 17) {
                if (zzF != 27) {
                    if (zzF == 60 || zzF == 68) {
                        if (zzQ(t, i8, i7) && !zzB(t, zzD, zzw(i7))) {
                            return false;
                        }
                    } else if (zzF != 49) {
                        if (zzF == 50 && !((zzghc) zzgiy.zzn(t, zzD & 1048575)).isEmpty()) {
                            zzghb zzghbVar = (zzghb) zzx(i7);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgiy.zzn(t, zzD & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzghz zzw = zzw(i7);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzw.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzN(t, i7, i2, i3, i11) && !zzB(t, zzD, zzw(i7))) {
                return false;
            }
            i6++;
            i4 = i2;
            i5 = i3;
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
        } else if (this.zzh) {
            this.zzp.zzb(t);
            throw null;
        } else {
            int length = this.zzc.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int zzD = zzD(i2);
                int i3 = this.zzc[i2];
                switch (zzF(zzD)) {
                    case 0:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzf(i3, zzgiy.zzl(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzO(t, i2)) {
                            zzgfiVar.zze(i3, zzgiy.zzj(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzc(i3, zzgiy.zzf(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzh(i3, zzgiy.zzf(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzi(i3, zzgiy.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzj(i3, zzgiy.zzf(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzk(i3, zzgiy.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzl(i3, zzgiy.zzh(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzO(t, i2)) {
                            zzX(i3, zzgiy.zzn(t, zzD & 1048575), zzgfiVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzr(i3, zzgiy.zzn(t, zzD & 1048575), zzw(i2));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzn(i3, (zzgex) zzgiy.zzn(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzo(i3, zzgiy.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzg(i3, zzgiy.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzb(i3, zzgiy.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzd(i3, zzgiy.zzf(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzp(i3, zzgiy.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzq(i3, zzgiy.zzf(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzO(t, i2)) {
                            zzgfiVar.zzs(i3, zzgiy.zzn(t, zzD & 1048575), zzw(i2));
                            break;
                        } else {
                            break;
                        }
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        zzgib.zzJ(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 19:
                        zzgib.zzK(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 20:
                        zzgib.zzL(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        zzgib.zzM(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 22:
                        zzgib.zzQ(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        zzgib.zzO(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 24:
                        zzgib.zzT(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 25:
                        zzgib.zzW(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 26:
                        zzgib.zzX(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar);
                        break;
                    case 27:
                        zzgib.zzZ(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, zzw(i2));
                        break;
                    case 28:
                        zzgib.zzY(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar);
                        break;
                    case 29:
                        zzgib.zzR(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 30:
                        zzgib.zzV(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 31:
                        zzgib.zzU(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 32:
                        zzgib.zzP(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 33:
                        zzgib.zzS(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 34:
                        zzgib.zzN(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, false);
                        break;
                    case 35:
                        zzgib.zzJ(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 36:
                        zzgib.zzK(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 37:
                        zzgib.zzL(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 38:
                        zzgib.zzM(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 39:
                        zzgib.zzQ(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 40:
                        zzgib.zzO(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 41:
                        zzgib.zzT(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 42:
                        zzgib.zzW(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 43:
                        zzgib.zzR(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 44:
                        zzgib.zzV(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 45:
                        zzgib.zzU(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 46:
                        zzgib.zzP(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 47:
                        zzgib.zzS(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case SyslogConstants.LOG_LPR /* 48 */:
                        zzgib.zzN(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, true);
                        break;
                    case 49:
                        zzgib.zzaa(this.zzc[i2], (List) zzgiy.zzn(t, zzD & 1048575), zzgfiVar, zzw(i2));
                        break;
                    case 50:
                        zzW(zzgfiVar, i3, zzgiy.zzn(t, zzD & 1048575), i2);
                        break;
                    case 51:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzf(i3, zzH(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zze(i3, zzI(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzc(i3, zzK(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzh(i3, zzK(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case ModuleDescriptor.MODULE_VERSION /* 55 */:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzi(i3, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case SyslogConstants.LOG_NEWS /* 56 */:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzj(i3, zzK(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzk(i3, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzl(i3, zzL(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzQ(t, i3, i2)) {
                            zzX(i3, zzgiy.zzn(t, zzD & 1048575), zzgfiVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzr(i3, zzgiy.zzn(t, zzD & 1048575), zzw(i2));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzn(i3, (zzgex) zzgiy.zzn(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzo(i3, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzg(i3, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzb(i3, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzd(i3, zzK(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzp(i3, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzq(i3, zzK(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzQ(t, i3, i2)) {
                            zzgfiVar.zzs(i3, zzgiy.zzn(t, zzD & 1048575), zzw(i2));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzgio<?, ?> zzgioVar = this.zzo;
            zzgioVar.zzr(zzgioVar.zzj(t), zzgfiVar);
        }
    }
}
