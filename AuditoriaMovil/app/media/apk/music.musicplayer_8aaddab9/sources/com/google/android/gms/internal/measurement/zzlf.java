package com.google.android.gms.internal.measurement;

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
/* loaded from: classes2.dex */
public final class zzlf<T> implements zzln<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzml.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkq zzm;
    private final zzmb<?, ?> zzn;
    private final zzjk<?> zzo;
    private final zzlh zzp;
    private final zzkx zzq;

    /* JADX WARN: Multi-variable type inference failed */
    private zzlf(int[] iArr, int[] iArr2, Object[] objArr, int i2, int i3, zzlc zzlcVar, boolean z, boolean z2, int[] iArr3, int i4, int i5, zzlh zzlhVar, zzkq zzkqVar, zzmb<?, ?> zzmbVar, zzjk<?> zzjkVar, zzkx zzkxVar) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zze = objArr;
        this.zzf = i2;
        this.zzi = zzlcVar;
        boolean z3 = false;
        if (zzmbVar != 0 && zzmbVar.zzc((zzlc) i3)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = z2;
        this.zzk = iArr3;
        this.zzl = i4;
        this.zzp = i5;
        this.zzm = zzlhVar;
        this.zzn = zzkqVar;
        this.zzo = zzmbVar;
        this.zzg = i3;
        this.zzq = zzjkVar;
    }

    private static int zzA(int i2) {
        return (i2 >>> 20) & 255;
    }

    private final int zzB(int i2) {
        return this.zzc[i2 + 1];
    }

    private static <T> long zzC(T t, long j2) {
        return ((Long) zzml.zzf(t, j2)).longValue();
    }

    private final zzkb zzD(int i2) {
        int i3 = i2 / 3;
        return (zzkb) this.zzd[i3 + i3 + 1];
    }

    private final zzln zzE(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzln zzlnVar = (zzln) this.zzd[i4];
        if (zzlnVar != null) {
            return zzlnVar;
        }
        zzln<T> zzb2 = zzlk.zza().zzb((Class) this.zzd[i4 + 1]);
        this.zzd[i4] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    private static Field zzG(Class<?> cls, String str) {
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

    private final void zzH(T t, T t2, int i2) {
        long zzB = zzB(i2) & 1048575;
        if (zzM(t2, i2)) {
            Object zzf = zzml.zzf(t, zzB);
            Object zzf2 = zzml.zzf(t2, zzB);
            if (zzf != null && zzf2 != null) {
                zzml.zzs(t, zzB, zzkf.zzg(zzf, zzf2));
                zzJ(t, i2);
            } else if (zzf2 != null) {
                zzml.zzs(t, zzB, zzf2);
                zzJ(t, i2);
            }
        }
    }

    private final void zzI(T t, T t2, int i2) {
        int zzB = zzB(i2);
        int i3 = this.zzc[i2];
        long j2 = zzB & 1048575;
        if (zzP(t2, i3, i2)) {
            Object zzf = zzP(t, i3, i2) ? zzml.zzf(t, j2) : null;
            Object zzf2 = zzml.zzf(t2, j2);
            if (zzf != null && zzf2 != null) {
                zzml.zzs(t, j2, zzkf.zzg(zzf, zzf2));
                zzK(t, i3, i2);
            } else if (zzf2 != null) {
                zzml.zzs(t, j2, zzf2);
                zzK(t, i3, i2);
            }
        }
    }

    private final void zzJ(T t, int i2) {
        int zzy = zzy(i2);
        long j2 = 1048575 & zzy;
        if (j2 == 1048575) {
            return;
        }
        zzml.zzq(t, j2, (1 << (zzy >>> 20)) | zzml.zzc(t, j2));
    }

    private final void zzK(T t, int i2, int i3) {
        zzml.zzq(t, zzy(i3) & 1048575, i2);
    }

    private final boolean zzL(T t, T t2, int i2) {
        return zzM(t, i2) == zzM(t2, i2);
    }

    private final boolean zzM(T t, int i2) {
        int zzy = zzy(i2);
        long j2 = zzy & 1048575;
        if (j2 != 1048575) {
            return (zzml.zzc(t, j2) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i2);
        long j3 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzml.zza(t, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzml.zzb(t, j3)) != 0;
            case 2:
                return zzml.zzd(t, j3) != 0;
            case 3:
                return zzml.zzd(t, j3) != 0;
            case 4:
                return zzml.zzc(t, j3) != 0;
            case 5:
                return zzml.zzd(t, j3) != 0;
            case 6:
                return zzml.zzc(t, j3) != 0;
            case 7:
                return zzml.zzw(t, j3);
            case 8:
                Object zzf = zzml.zzf(t, j3);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzix) {
                    return !zzix.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzml.zzf(t, j3) != null;
            case 10:
                return !zzix.zzb.equals(zzml.zzf(t, j3));
            case 11:
                return zzml.zzc(t, j3) != 0;
            case 12:
                return zzml.zzc(t, j3) != 0;
            case 13:
                return zzml.zzc(t, j3) != 0;
            case 14:
                return zzml.zzd(t, j3) != 0;
            case 15:
                return zzml.zzc(t, j3) != 0;
            case 16:
                return zzml.zzd(t, j3) != 0;
            case 17:
                return zzml.zzf(t, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzN(T t, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? zzM(t, i2) : (i4 & i5) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzO(Object obj, int i2, zzln zzlnVar) {
        return zzlnVar.zzj(zzml.zzf(obj, i2 & 1048575));
    }

    private final boolean zzP(T t, int i2, int i3) {
        return zzml.zzc(t, (long) (zzy(i3) & 1048575)) == i2;
    }

    private static <T> boolean zzQ(T t, long j2) {
        return ((Boolean) zzml.zzf(t, j2)).booleanValue();
    }

    private final void zzR(T t, zzjf zzjfVar) throws IOException {
        int i2;
        if (this.zzh) {
            this.zzo.zza(t);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < length) {
            int zzB = zzB(i4);
            int i7 = this.zzc[i4];
            int zzA = zzA(zzB);
            if (zzA <= 17) {
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
            long j2 = zzB & i3;
            switch (zzA) {
                case 0:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzf(i7, zzml.zza(t, j2));
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 1:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzo(i7, zzml.zzb(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 2:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzt(i7, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 3:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzJ(i7, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 4:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzr(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 5:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzm(i7, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 6:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzk(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 7:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzb(i7, zzml.zzw(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 8:
                    if ((i5 & i2) != 0) {
                        zzT(i7, unsafe.getObject(t, j2), zzjfVar);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 9:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzv(i7, unsafe.getObject(t, j2), zzE(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 10:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzd(i7, (zzix) unsafe.getObject(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 11:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzH(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 12:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzi(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 13:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzw(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 14:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzy(i7, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 15:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzA(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 16:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzC(i7, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 17:
                    if ((i5 & i2) != 0) {
                        zzjfVar.zzq(i7, unsafe.getObject(t, j2), zzE(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    zzlp.zzL(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 19:
                    zzlp.zzP(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 20:
                    zzlp.zzS(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    zzlp.zzaa(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 22:
                    zzlp.zzR(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzlp.zzO(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 24:
                    zzlp.zzN(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 25:
                    zzlp.zzJ(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 26:
                    zzlp.zzY(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar);
                    break;
                case 27:
                    zzlp.zzT(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, zzE(i4));
                    break;
                case 28:
                    zzlp.zzK(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar);
                    break;
                case 29:
                    zzlp.zzZ(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, false);
                    break;
                case 30:
                    zzlp.zzM(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, false);
                    break;
                case 31:
                    zzlp.zzU(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, false);
                    break;
                case 32:
                    zzlp.zzV(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, false);
                    break;
                case 33:
                    zzlp.zzW(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, false);
                    break;
                case 34:
                    zzlp.zzX(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, false);
                    break;
                case 35:
                    zzlp.zzL(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, true);
                    break;
                case 36:
                    zzlp.zzP(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, true);
                    break;
                case 37:
                    zzlp.zzS(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, true);
                    break;
                case 38:
                    zzlp.zzaa(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, true);
                    break;
                case 39:
                    zzlp.zzR(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, true);
                    break;
                case 40:
                    zzlp.zzO(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, true);
                    break;
                case 41:
                    zzlp.zzN(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, true);
                    break;
                case 42:
                    zzlp.zzJ(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, true);
                    break;
                case 43:
                    zzlp.zzZ(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, true);
                    break;
                case 44:
                    zzlp.zzM(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, true);
                    break;
                case 45:
                    zzlp.zzU(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, true);
                    break;
                case 46:
                    zzlp.zzV(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, true);
                    break;
                case 47:
                    zzlp.zzW(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, true);
                    break;
                case SyslogConstants.LOG_LPR /* 48 */:
                    zzlp.zzX(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, true);
                    break;
                case 49:
                    zzlp.zzQ(this.zzc[i4], (List) unsafe.getObject(t, j2), zzjfVar, zzE(i4));
                    break;
                case 50:
                    zzS(zzjfVar, i7, unsafe.getObject(t, j2), i4);
                    break;
                case 51:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzf(i7, zzn(t, j2));
                        break;
                    }
                    break;
                case 52:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzo(i7, zzo(t, j2));
                        break;
                    }
                    break;
                case 53:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzt(i7, zzC(t, j2));
                        break;
                    }
                    break;
                case 54:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzJ(i7, zzC(t, j2));
                        break;
                    }
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 55 */:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzr(i7, zzr(t, j2));
                        break;
                    }
                    break;
                case SyslogConstants.LOG_NEWS /* 56 */:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzm(i7, zzC(t, j2));
                        break;
                    }
                    break;
                case 57:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzk(i7, zzr(t, j2));
                        break;
                    }
                    break;
                case 58:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzb(i7, zzQ(t, j2));
                        break;
                    }
                    break;
                case 59:
                    if (zzP(t, i7, i4)) {
                        zzT(i7, unsafe.getObject(t, j2), zzjfVar);
                        break;
                    }
                    break;
                case 60:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzv(i7, unsafe.getObject(t, j2), zzE(i4));
                        break;
                    }
                    break;
                case 61:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzd(i7, (zzix) unsafe.getObject(t, j2));
                        break;
                    }
                    break;
                case 62:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzH(i7, zzr(t, j2));
                        break;
                    }
                    break;
                case 63:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzi(i7, zzr(t, j2));
                        break;
                    }
                    break;
                case 64:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzw(i7, zzr(t, j2));
                        break;
                    }
                    break;
                case 65:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzy(i7, zzC(t, j2));
                        break;
                    }
                    break;
                case 66:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzA(i7, zzr(t, j2));
                        break;
                    }
                    break;
                case 67:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzC(i7, zzC(t, j2));
                        break;
                    }
                    break;
                case 68:
                    if (zzP(t, i7, i4)) {
                        zzjfVar.zzq(i7, unsafe.getObject(t, j2), zzE(i4));
                        break;
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        zzmb<?, ?> zzmbVar = this.zzn;
        zzmbVar.zzi(zzmbVar.zzc(t), zzjfVar);
    }

    private final <K, V> void zzS(zzjf zzjfVar, int i2, Object obj, int i3) throws IOException {
        if (obj == null) {
            return;
        }
        zzkv zzkvVar = (zzkv) zzF(i3);
        throw null;
    }

    private static final void zzT(int i2, Object obj, zzjf zzjfVar) throws IOException {
        if (obj instanceof String) {
            zzjfVar.zzF(i2, (String) obj);
        } else {
            zzjfVar.zzd(i2, (zzix) obj);
        }
    }

    public static zzmc zzd(Object obj) {
        zzjx zzjxVar = (zzjx) obj;
        zzmc zzmcVar = zzjxVar.zzc;
        if (zzmcVar == zzmc.zzc()) {
            zzmc zze = zzmc.zze();
            zzjxVar.zzc = zze;
            return zze;
        }
        return zzmcVar;
    }

    public static <T> zzlf<T> zzk(Class<T> cls, zzkz zzkzVar, zzlh zzlhVar, zzkq zzkqVar, zzmb<?, ?> zzmbVar, zzjk<?> zzjkVar, zzkx zzkxVar) {
        if (zzkzVar instanceof zzlm) {
            return zzl((zzlm) zzkzVar, zzlhVar, zzkqVar, zzmbVar, zzjkVar, zzkxVar);
        }
        zzly zzlyVar = (zzly) zzkzVar;
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
    public static <T> com.google.android.gms.internal.measurement.zzlf<T> zzl(com.google.android.gms.internal.measurement.zzlm r33, com.google.android.gms.internal.measurement.zzlh r34, com.google.android.gms.internal.measurement.zzkq r35, com.google.android.gms.internal.measurement.zzmb<?, ?> r36, com.google.android.gms.internal.measurement.zzjk<?> r37, com.google.android.gms.internal.measurement.zzkx r38) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlf.zzl(com.google.android.gms.internal.measurement.zzlm, com.google.android.gms.internal.measurement.zzlh, com.google.android.gms.internal.measurement.zzkq, com.google.android.gms.internal.measurement.zzmb, com.google.android.gms.internal.measurement.zzjk, com.google.android.gms.internal.measurement.zzkx):com.google.android.gms.internal.measurement.zzlf");
    }

    private static <T> double zzn(T t, long j2) {
        return ((Double) zzml.zzf(t, j2)).doubleValue();
    }

    private static <T> float zzo(T t, long j2) {
        return ((Float) zzml.zzf(t, j2)).floatValue();
    }

    private final int zzp(T t) {
        int i2;
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int zzo;
        int zzi;
        int zzz;
        int zzA8;
        int i3;
        Unsafe unsafe = zzb;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzB2 = zzB(i7);
            int i8 = this.zzc[i7];
            int zzA9 = zzA(zzB2);
            if (zzA9 <= 17) {
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
            long j2 = zzB2 & 1048575;
            switch (zzA9) {
                case 0:
                    if ((i5 & i2) != 0) {
                        zzA = zzje.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i5 & i2) != 0) {
                        zzA2 = zzje.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i5 & i2) != 0) {
                        long j3 = unsafe.getLong(t, j2);
                        zzA3 = zzje.zzA(i8 << 3);
                        zzB = zzje.zzB(j3);
                        i4 = zzB + zzA3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i5 & i2) != 0) {
                        long j4 = unsafe.getLong(t, j2);
                        zzA3 = zzje.zzA(i8 << 3);
                        zzB = zzje.zzB(j4);
                        i4 = zzB + zzA3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i5 & i2) != 0) {
                        int i11 = unsafe.getInt(t, j2);
                        zzA4 = zzje.zzA(i8 << 3);
                        zzv = zzje.zzv(i11);
                        zzo = zzv + zzA4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i5 & i2) != 0) {
                        zzA = zzje.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i5 & i2) != 0) {
                        zzA2 = zzje.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i5 & i2) != 0) {
                        zzA5 = zzje.zzA(i8 << 3);
                        zzo = zzA5 + 1;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i5 & i2) != 0) {
                        Object object = unsafe.getObject(t, j2);
                        if (object instanceof zzix) {
                            zzA6 = zzje.zzA(i8 << 3);
                            zzd = ((zzix) object).zzd();
                            zzA7 = zzje.zzA(zzd);
                            i3 = zzA7 + zzd + zzA6;
                            i4 += i3;
                            break;
                        } else {
                            zzA4 = zzje.zzA(i8 << 3);
                            zzv = zzje.zzy((String) object);
                            zzo = zzv + zzA4;
                            i4 += zzo;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if ((i5 & i2) != 0) {
                        zzo = zzlp.zzo(i8, unsafe.getObject(t, j2), zzE(i7));
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i5 & i2) != 0) {
                        zzA6 = zzje.zzA(i8 << 3);
                        zzd = ((zzix) unsafe.getObject(t, j2)).zzd();
                        zzA7 = zzje.zzA(zzd);
                        i3 = zzA7 + zzd + zzA6;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i5 & i2) != 0) {
                        int i12 = unsafe.getInt(t, j2);
                        zzA4 = zzje.zzA(i8 << 3);
                        zzv = zzje.zzA(i12);
                        zzo = zzv + zzA4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i5 & i2) != 0) {
                        int i13 = unsafe.getInt(t, j2);
                        zzA4 = zzje.zzA(i8 << 3);
                        zzv = zzje.zzv(i13);
                        zzo = zzv + zzA4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i5 & i2) != 0) {
                        zzA2 = zzje.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i5 & i2) != 0) {
                        zzA = zzje.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i5 & i2) != 0) {
                        int i14 = unsafe.getInt(t, j2);
                        zzA4 = zzje.zzA(i8 << 3);
                        zzv = zzje.zzA((i14 >> 31) ^ (i14 + i14));
                        zzo = zzv + zzA4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i5 & i2) != 0) {
                        long j5 = unsafe.getLong(t, j2);
                        zzA4 = zzje.zzA(i8 << 3);
                        zzv = zzje.zzB((j5 >> 63) ^ (j5 + j5));
                        zzo = zzv + zzA4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i5 & i2) != 0) {
                        zzo = zzje.zzu(i8, (zzlc) unsafe.getObject(t, j2), zzE(i7));
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    zzo = zzlp.zzh(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzo;
                    break;
                case 19:
                    zzo = zzlp.zzf(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzo;
                    break;
                case 20:
                    zzo = zzlp.zzm(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzo;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    zzo = zzlp.zzx(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzo;
                    break;
                case 22:
                    zzo = zzlp.zzk(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzo;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzo = zzlp.zzh(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzo;
                    break;
                case 24:
                    zzo = zzlp.zzf(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzo;
                    break;
                case 25:
                    zzo = zzlp.zza(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzo;
                    break;
                case 26:
                    zzo = zzlp.zzu(i8, (List) unsafe.getObject(t, j2));
                    i4 += zzo;
                    break;
                case 27:
                    zzo = zzlp.zzp(i8, (List) unsafe.getObject(t, j2), zzE(i7));
                    i4 += zzo;
                    break;
                case 28:
                    zzo = zzlp.zzc(i8, (List) unsafe.getObject(t, j2));
                    i4 += zzo;
                    break;
                case 29:
                    zzo = zzlp.zzv(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzo;
                    break;
                case 30:
                    zzo = zzlp.zzd(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzo;
                    break;
                case 31:
                    zzo = zzlp.zzf(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzo;
                    break;
                case 32:
                    zzo = zzlp.zzh(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzo;
                    break;
                case 33:
                    zzo = zzlp.zzq(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzo;
                    break;
                case 34:
                    zzo = zzlp.zzs(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += zzo;
                    break;
                case 35:
                    zzi = zzlp.zzi((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i8);
                        zzA8 = zzje.zzA(zzi);
                        i3 = zzA8 + zzz + zzi;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzi = zzlp.zzg((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i8);
                        zzA8 = zzje.zzA(zzi);
                        i3 = zzA8 + zzz + zzi;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzi = zzlp.zzn((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i8);
                        zzA8 = zzje.zzA(zzi);
                        i3 = zzA8 + zzz + zzi;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzi = zzlp.zzy((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i8);
                        zzA8 = zzje.zzA(zzi);
                        i3 = zzA8 + zzz + zzi;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzi = zzlp.zzl((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i8);
                        zzA8 = zzje.zzA(zzi);
                        i3 = zzA8 + zzz + zzi;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzi = zzlp.zzi((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i8);
                        zzA8 = zzje.zzA(zzi);
                        i3 = zzA8 + zzz + zzi;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzi = zzlp.zzg((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i8);
                        zzA8 = zzje.zzA(zzi);
                        i3 = zzA8 + zzz + zzi;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzi = zzlp.zzb((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i8);
                        zzA8 = zzje.zzA(zzi);
                        i3 = zzA8 + zzz + zzi;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzi = zzlp.zzw((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i8);
                        zzA8 = zzje.zzA(zzi);
                        i3 = zzA8 + zzz + zzi;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzi = zzlp.zze((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i8);
                        zzA8 = zzje.zzA(zzi);
                        i3 = zzA8 + zzz + zzi;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzi = zzlp.zzg((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i8);
                        zzA8 = zzje.zzA(zzi);
                        i3 = zzA8 + zzz + zzi;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzi = zzlp.zzi((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i8);
                        zzA8 = zzje.zzA(zzi);
                        i3 = zzA8 + zzz + zzi;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzi = zzlp.zzr((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i8);
                        zzA8 = zzje.zzA(zzi);
                        i3 = zzA8 + zzz + zzi;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case SyslogConstants.LOG_LPR /* 48 */:
                    zzi = zzlp.zzt((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i8);
                        zzA8 = zzje.zzA(zzi);
                        i3 = zzA8 + zzz + zzi;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzlp.zzj(i8, (List) unsafe.getObject(t, j2), zzE(i7));
                    i4 += zzo;
                    break;
                case 50:
                    zzkx.zza(i8, unsafe.getObject(t, j2), zzF(i7));
                    break;
                case 51:
                    if (zzP(t, i8, i7)) {
                        zzA = zzje.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzP(t, i8, i7)) {
                        zzA2 = zzje.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzP(t, i8, i7)) {
                        long zzC = zzC(t, j2);
                        zzA3 = zzje.zzA(i8 << 3);
                        zzB = zzje.zzB(zzC);
                        i4 = zzB + zzA3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzP(t, i8, i7)) {
                        long zzC2 = zzC(t, j2);
                        zzA3 = zzje.zzA(i8 << 3);
                        zzB = zzje.zzB(zzC2);
                        i4 = zzB + zzA3 + i4;
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 55 */:
                    if (zzP(t, i8, i7)) {
                        int zzr = zzr(t, j2);
                        zzA4 = zzje.zzA(i8 << 3);
                        zzv = zzje.zzv(zzr);
                        zzo = zzv + zzA4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case SyslogConstants.LOG_NEWS /* 56 */:
                    if (zzP(t, i8, i7)) {
                        zzA = zzje.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzP(t, i8, i7)) {
                        zzA2 = zzje.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzP(t, i8, i7)) {
                        zzA5 = zzje.zzA(i8 << 3);
                        zzo = zzA5 + 1;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzP(t, i8, i7)) {
                        Object object2 = unsafe.getObject(t, j2);
                        if (object2 instanceof zzix) {
                            zzA6 = zzje.zzA(i8 << 3);
                            zzd = ((zzix) object2).zzd();
                            zzA7 = zzje.zzA(zzd);
                            i3 = zzA7 + zzd + zzA6;
                            i4 += i3;
                            break;
                        } else {
                            zzA4 = zzje.zzA(i8 << 3);
                            zzv = zzje.zzy((String) object2);
                            zzo = zzv + zzA4;
                            i4 += zzo;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzP(t, i8, i7)) {
                        zzo = zzlp.zzo(i8, unsafe.getObject(t, j2), zzE(i7));
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzP(t, i8, i7)) {
                        zzA6 = zzje.zzA(i8 << 3);
                        zzd = ((zzix) unsafe.getObject(t, j2)).zzd();
                        zzA7 = zzje.zzA(zzd);
                        i3 = zzA7 + zzd + zzA6;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzP(t, i8, i7)) {
                        int zzr2 = zzr(t, j2);
                        zzA4 = zzje.zzA(i8 << 3);
                        zzv = zzje.zzA(zzr2);
                        zzo = zzv + zzA4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzP(t, i8, i7)) {
                        int zzr3 = zzr(t, j2);
                        zzA4 = zzje.zzA(i8 << 3);
                        zzv = zzje.zzv(zzr3);
                        zzo = zzv + zzA4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzP(t, i8, i7)) {
                        zzA2 = zzje.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzP(t, i8, i7)) {
                        zzA = zzje.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzP(t, i8, i7)) {
                        int zzr4 = zzr(t, j2);
                        zzA4 = zzje.zzA(i8 << 3);
                        zzv = zzje.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        zzo = zzv + zzA4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzP(t, i8, i7)) {
                        long zzC3 = zzC(t, j2);
                        zzA4 = zzje.zzA(i8 << 3);
                        zzv = zzje.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        zzo = zzv + zzA4;
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzP(t, i8, i7)) {
                        zzo = zzje.zzu(i8, (zzlc) unsafe.getObject(t, j2), zzE(i7));
                        i4 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzmb<?, ?> zzmbVar = this.zzn;
        int zza2 = zzmbVar.zza(zzmbVar.zzc(t)) + i4;
        if (this.zzh) {
            this.zzo.zza(t);
            throw null;
        }
        return zza2;
    }

    private final int zzq(T t) {
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int zzo;
        int zzi;
        int zzz;
        int zzA8;
        int i2;
        Unsafe unsafe = zzb;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzB2 = zzB(i4);
            int zzA9 = zzA(zzB2);
            int i5 = this.zzc[i4];
            long j2 = zzB2 & 1048575;
            if (zzA9 >= zzjp.zzJ.zza() && zzA9 <= zzjp.zzW.zza()) {
                int i6 = this.zzc[i4 + 2];
            }
            switch (zzA9) {
                case 0:
                    if (zzM(t, i4)) {
                        zzA = zzje.zzA(i5 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (zzM(t, i4)) {
                        zzA2 = zzje.zzA(i5 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (zzM(t, i4)) {
                        long zzd2 = zzml.zzd(t, j2);
                        zzA3 = zzje.zzA(i5 << 3);
                        zzB = zzje.zzB(zzd2);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (zzM(t, i4)) {
                        long zzd3 = zzml.zzd(t, j2);
                        zzA3 = zzje.zzA(i5 << 3);
                        zzB = zzje.zzB(zzd3);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (zzM(t, i4)) {
                        int zzc = zzml.zzc(t, j2);
                        zzA4 = zzje.zzA(i5 << 3);
                        zzv = zzje.zzv(zzc);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (zzM(t, i4)) {
                        zzA = zzje.zzA(i5 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (zzM(t, i4)) {
                        zzA2 = zzje.zzA(i5 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (zzM(t, i4)) {
                        zzA5 = zzje.zzA(i5 << 3);
                        zzo = zzA5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (zzM(t, i4)) {
                        Object zzf = zzml.zzf(t, j2);
                        if (!(zzf instanceof zzix)) {
                            zzA4 = zzje.zzA(i5 << 3);
                            zzv = zzje.zzy((String) zzf);
                            zzo = zzv + zzA4;
                            break;
                        } else {
                            zzA6 = zzje.zzA(i5 << 3);
                            zzd = ((zzix) zzf).zzd();
                            zzA7 = zzje.zzA(zzd);
                            i2 = zzA7 + zzd + zzA6;
                            i3 += i2;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (zzM(t, i4)) {
                        zzo = zzlp.zzo(i5, zzml.zzf(t, j2), zzE(i4));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (zzM(t, i4)) {
                        zzA6 = zzje.zzA(i5 << 3);
                        zzd = ((zzix) zzml.zzf(t, j2)).zzd();
                        zzA7 = zzje.zzA(zzd);
                        i2 = zzA7 + zzd + zzA6;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 11:
                    if (zzM(t, i4)) {
                        int zzc2 = zzml.zzc(t, j2);
                        zzA4 = zzje.zzA(i5 << 3);
                        zzv = zzje.zzA(zzc2);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (zzM(t, i4)) {
                        int zzc3 = zzml.zzc(t, j2);
                        zzA4 = zzje.zzA(i5 << 3);
                        zzv = zzje.zzv(zzc3);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (zzM(t, i4)) {
                        zzA2 = zzje.zzA(i5 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (zzM(t, i4)) {
                        zzA = zzje.zzA(i5 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (zzM(t, i4)) {
                        int zzc4 = zzml.zzc(t, j2);
                        zzA4 = zzje.zzA(i5 << 3);
                        zzv = zzje.zzA((zzc4 >> 31) ^ (zzc4 + zzc4));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (zzM(t, i4)) {
                        long zzd4 = zzml.zzd(t, j2);
                        zzA4 = zzje.zzA(i5 << 3);
                        zzv = zzje.zzB((zzd4 >> 63) ^ (zzd4 + zzd4));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (zzM(t, i4)) {
                        zzo = zzje.zzu(i5, (zzlc) zzml.zzf(t, j2), zzE(i4));
                        break;
                    } else {
                        continue;
                    }
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    zzo = zzlp.zzh(i5, (List) zzml.zzf(t, j2), false);
                    break;
                case 19:
                    zzo = zzlp.zzf(i5, (List) zzml.zzf(t, j2), false);
                    break;
                case 20:
                    zzo = zzlp.zzm(i5, (List) zzml.zzf(t, j2), false);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    zzo = zzlp.zzx(i5, (List) zzml.zzf(t, j2), false);
                    break;
                case 22:
                    zzo = zzlp.zzk(i5, (List) zzml.zzf(t, j2), false);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzo = zzlp.zzh(i5, (List) zzml.zzf(t, j2), false);
                    break;
                case 24:
                    zzo = zzlp.zzf(i5, (List) zzml.zzf(t, j2), false);
                    break;
                case 25:
                    zzo = zzlp.zza(i5, (List) zzml.zzf(t, j2), false);
                    break;
                case 26:
                    zzo = zzlp.zzu(i5, (List) zzml.zzf(t, j2));
                    break;
                case 27:
                    zzo = zzlp.zzp(i5, (List) zzml.zzf(t, j2), zzE(i4));
                    break;
                case 28:
                    zzo = zzlp.zzc(i5, (List) zzml.zzf(t, j2));
                    break;
                case 29:
                    zzo = zzlp.zzv(i5, (List) zzml.zzf(t, j2), false);
                    break;
                case 30:
                    zzo = zzlp.zzd(i5, (List) zzml.zzf(t, j2), false);
                    break;
                case 31:
                    zzo = zzlp.zzf(i5, (List) zzml.zzf(t, j2), false);
                    break;
                case 32:
                    zzo = zzlp.zzh(i5, (List) zzml.zzf(t, j2), false);
                    break;
                case 33:
                    zzo = zzlp.zzq(i5, (List) zzml.zzf(t, j2), false);
                    break;
                case 34:
                    zzo = zzlp.zzs(i5, (List) zzml.zzf(t, j2), false);
                    break;
                case 35:
                    zzi = zzlp.zzi((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i5);
                        zzA8 = zzje.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 36:
                    zzi = zzlp.zzg((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i5);
                        zzA8 = zzje.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 37:
                    zzi = zzlp.zzn((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i5);
                        zzA8 = zzje.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 38:
                    zzi = zzlp.zzy((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i5);
                        zzA8 = zzje.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 39:
                    zzi = zzlp.zzl((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i5);
                        zzA8 = zzje.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 40:
                    zzi = zzlp.zzi((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i5);
                        zzA8 = zzje.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 41:
                    zzi = zzlp.zzg((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i5);
                        zzA8 = zzje.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 42:
                    zzi = zzlp.zzb((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i5);
                        zzA8 = zzje.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 43:
                    zzi = zzlp.zzw((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i5);
                        zzA8 = zzje.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 44:
                    zzi = zzlp.zze((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i5);
                        zzA8 = zzje.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 45:
                    zzi = zzlp.zzg((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i5);
                        zzA8 = zzje.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 46:
                    zzi = zzlp.zzi((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i5);
                        zzA8 = zzje.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 47:
                    zzi = zzlp.zzr((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i5);
                        zzA8 = zzje.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case SyslogConstants.LOG_LPR /* 48 */:
                    zzi = zzlp.zzt((List) unsafe.getObject(t, j2));
                    if (zzi > 0) {
                        zzz = zzje.zzz(i5);
                        zzA8 = zzje.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 49:
                    zzo = zzlp.zzj(i5, (List) zzml.zzf(t, j2), zzE(i4));
                    break;
                case 50:
                    zzkx.zza(i5, zzml.zzf(t, j2), zzF(i4));
                    continue;
                case 51:
                    if (zzP(t, i5, i4)) {
                        zzA = zzje.zzA(i5 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (zzP(t, i5, i4)) {
                        zzA2 = zzje.zzA(i5 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (zzP(t, i5, i4)) {
                        long zzC = zzC(t, j2);
                        zzA3 = zzje.zzA(i5 << 3);
                        zzB = zzje.zzB(zzC);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (zzP(t, i5, i4)) {
                        long zzC2 = zzC(t, j2);
                        zzA3 = zzje.zzA(i5 << 3);
                        zzB = zzje.zzB(zzC2);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 55 */:
                    if (zzP(t, i5, i4)) {
                        int zzr = zzr(t, j2);
                        zzA4 = zzje.zzA(i5 << 3);
                        zzv = zzje.zzv(zzr);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case SyslogConstants.LOG_NEWS /* 56 */:
                    if (zzP(t, i5, i4)) {
                        zzA = zzje.zzA(i5 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (zzP(t, i5, i4)) {
                        zzA2 = zzje.zzA(i5 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (zzP(t, i5, i4)) {
                        zzA5 = zzje.zzA(i5 << 3);
                        zzo = zzA5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (zzP(t, i5, i4)) {
                        Object zzf2 = zzml.zzf(t, j2);
                        if (!(zzf2 instanceof zzix)) {
                            zzA4 = zzje.zzA(i5 << 3);
                            zzv = zzje.zzy((String) zzf2);
                            zzo = zzv + zzA4;
                            break;
                        } else {
                            zzA6 = zzje.zzA(i5 << 3);
                            zzd = ((zzix) zzf2).zzd();
                            zzA7 = zzje.zzA(zzd);
                            i2 = zzA7 + zzd + zzA6;
                            i3 += i2;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (zzP(t, i5, i4)) {
                        zzo = zzlp.zzo(i5, zzml.zzf(t, j2), zzE(i4));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (zzP(t, i5, i4)) {
                        zzA6 = zzje.zzA(i5 << 3);
                        zzd = ((zzix) zzml.zzf(t, j2)).zzd();
                        zzA7 = zzje.zzA(zzd);
                        i2 = zzA7 + zzd + zzA6;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 62:
                    if (zzP(t, i5, i4)) {
                        int zzr2 = zzr(t, j2);
                        zzA4 = zzje.zzA(i5 << 3);
                        zzv = zzje.zzA(zzr2);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (zzP(t, i5, i4)) {
                        int zzr3 = zzr(t, j2);
                        zzA4 = zzje.zzA(i5 << 3);
                        zzv = zzje.zzv(zzr3);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (zzP(t, i5, i4)) {
                        zzA2 = zzje.zzA(i5 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (zzP(t, i5, i4)) {
                        zzA = zzje.zzA(i5 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (zzP(t, i5, i4)) {
                        int zzr4 = zzr(t, j2);
                        zzA4 = zzje.zzA(i5 << 3);
                        zzv = zzje.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (zzP(t, i5, i4)) {
                        long zzC3 = zzC(t, j2);
                        zzA4 = zzje.zzA(i5 << 3);
                        zzv = zzje.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (zzP(t, i5, i4)) {
                        zzo = zzje.zzu(i5, (zzlc) zzml.zzf(t, j2), zzE(i4));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i3 += zzo;
        }
        zzmb<?, ?> zzmbVar = this.zzn;
        return zzmbVar.zza(zzmbVar.zzc(t)) + i3;
    }

    private static <T> int zzr(T t, long j2) {
        return ((Integer) zzml.zzf(t, j2)).intValue();
    }

    private final <K, V> int zzs(T t, byte[] bArr, int i2, int i3, int i4, long j2, zzik zzikVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i4);
        Object object = unsafe.getObject(t, j2);
        if (!((zzkw) object).zze()) {
            zzkw<K, V> zzb2 = zzkw.zza().zzb();
            zzkx.zzb(zzb2, object);
            unsafe.putObject(t, j2, zzb2);
        }
        zzkv zzkvVar = (zzkv) zzF;
        throw null;
    }

    private final int zzt(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, zzik zzikVar) throws IOException {
        Unsafe unsafe = zzb;
        long j3 = this.zzc[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Double.valueOf(Double.longBitsToDouble(zzil.zzn(bArr, i2))));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 8;
                }
                break;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Float.valueOf(Float.intBitsToFloat(zzil.zzb(bArr, i2))));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 4;
                }
                break;
            case 53:
            case 54:
                if (i6 == 0) {
                    int zzm = zzil.zzm(bArr, i2, zzikVar);
                    unsafe.putObject(t, j2, Long.valueOf(zzikVar.zzb));
                    unsafe.putInt(t, j3, i5);
                    return zzm;
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 55 */:
            case 62:
                if (i6 == 0) {
                    int zzj = zzil.zzj(bArr, i2, zzikVar);
                    unsafe.putObject(t, j2, Integer.valueOf(zzikVar.zza));
                    unsafe.putInt(t, j3, i5);
                    return zzj;
                }
                break;
            case SyslogConstants.LOG_NEWS /* 56 */:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Long.valueOf(zzil.zzn(bArr, i2)));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 8;
                }
                break;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Integer.valueOf(zzil.zzb(bArr, i2)));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 4;
                }
                break;
            case 58:
                if (i6 == 0) {
                    int zzm2 = zzil.zzm(bArr, i2, zzikVar);
                    unsafe.putObject(t, j2, Boolean.valueOf(zzikVar.zzb != 0));
                    unsafe.putInt(t, j3, i5);
                    return zzm2;
                }
                break;
            case 59:
                if (i6 == 2) {
                    int zzj2 = zzil.zzj(bArr, i2, zzikVar);
                    int i10 = zzikVar.zza;
                    if (i10 == 0) {
                        unsafe.putObject(t, j2, "");
                    } else if ((i7 & 536870912) != 0 && !zzmq.zzf(bArr, zzj2, zzj2 + i10)) {
                        throw zzkh.zzc();
                    } else {
                        unsafe.putObject(t, j2, new String(bArr, zzj2, i10, zzkf.zzb));
                        zzj2 += i10;
                    }
                    unsafe.putInt(t, j3, i5);
                    return zzj2;
                }
                break;
            case 60:
                if (i6 == 2) {
                    int zzd = zzil.zzd(zzE(i9), bArr, i2, i3, zzikVar);
                    Object object = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t, j2, zzikVar.zzc);
                    } else {
                        unsafe.putObject(t, j2, zzkf.zzg(object, zzikVar.zzc));
                    }
                    unsafe.putInt(t, j3, i5);
                    return zzd;
                }
                break;
            case 61:
                if (i6 == 2) {
                    int zza2 = zzil.zza(bArr, i2, zzikVar);
                    unsafe.putObject(t, j2, zzikVar.zzc);
                    unsafe.putInt(t, j3, i5);
                    return zza2;
                }
                break;
            case 63:
                if (i6 == 0) {
                    int zzj3 = zzil.zzj(bArr, i2, zzikVar);
                    int i11 = zzikVar.zza;
                    zzkb zzD = zzD(i9);
                    if (zzD == null || zzD.zza(i11)) {
                        unsafe.putObject(t, j2, Integer.valueOf(i11));
                        unsafe.putInt(t, j3, i5);
                    } else {
                        zzd(t).zzh(i4, Long.valueOf(i11));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i6 == 0) {
                    int zzj4 = zzil.zzj(bArr, i2, zzikVar);
                    unsafe.putObject(t, j2, Integer.valueOf(zzja.zzb(zzikVar.zza)));
                    unsafe.putInt(t, j3, i5);
                    return zzj4;
                }
                break;
            case 67:
                if (i6 == 0) {
                    int zzm3 = zzil.zzm(bArr, i2, zzikVar);
                    unsafe.putObject(t, j2, Long.valueOf(zzja.zzc(zzikVar.zzb)));
                    unsafe.putInt(t, j3, i5);
                    return zzm3;
                }
                break;
            case 68:
                if (i6 == 3) {
                    int zzc = zzil.zzc(zzE(i9), bArr, i2, i3, (i4 & (-8)) | 4, zzikVar);
                    Object object2 = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j2, zzikVar.zzc);
                    } else {
                        unsafe.putObject(t, j2, zzkf.zzg(object2, zzikVar.zzc));
                    }
                    unsafe.putInt(t, j3, i5);
                    return zzc;
                }
                break;
        }
        return i2;
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
    private final int zzu(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.zzik r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlf.zzu(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzik):int");
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
    private final int zzv(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.zzik r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlf.zzv(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzik):int");
    }

    private final int zzw(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzz(i2, 0);
    }

    private final int zzx(int i2, int i3) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzz(i2, i3);
    }

    private final int zzy(int i2) {
        return this.zzc[i2 + 2];
    }

    private final int zzz(int i2, int i3) {
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

    @Override // com.google.android.gms.internal.measurement.zzln
    public final int zza(T t) {
        return this.zzi ? zzq(t) : zzp(t);
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final int zzb(T t) {
        int i2;
        int zzc;
        int i3;
        int zzr;
        int length = this.zzc.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int zzB = zzB(i5);
            int i6 = this.zzc[i5];
            long j2 = 1048575 & zzB;
            int i7 = 37;
            switch (zzA(zzB)) {
                case 0:
                    i2 = i4 * 53;
                    zzc = zzkf.zzc(Double.doubleToLongBits(zzml.zza(t, j2)));
                    i4 = zzc + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    zzc = Float.floatToIntBits(zzml.zzb(t, j2));
                    i4 = zzc + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    zzc = zzkf.zzc(zzml.zzd(t, j2));
                    i4 = zzc + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    zzc = zzkf.zzc(zzml.zzd(t, j2));
                    i4 = zzc + i2;
                    break;
                case 4:
                    i2 = i4 * 53;
                    zzc = zzml.zzc(t, j2);
                    i4 = zzc + i2;
                    break;
                case 5:
                    i2 = i4 * 53;
                    zzc = zzkf.zzc(zzml.zzd(t, j2));
                    i4 = zzc + i2;
                    break;
                case 6:
                    i2 = i4 * 53;
                    zzc = zzml.zzc(t, j2);
                    i4 = zzc + i2;
                    break;
                case 7:
                    i2 = i4 * 53;
                    zzc = zzkf.zza(zzml.zzw(t, j2));
                    i4 = zzc + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    zzc = ((String) zzml.zzf(t, j2)).hashCode();
                    i4 = zzc + i2;
                    break;
                case 9:
                    Object zzf = zzml.zzf(t, j2);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 10:
                    i2 = i4 * 53;
                    zzc = zzml.zzf(t, j2).hashCode();
                    i4 = zzc + i2;
                    break;
                case 11:
                    i2 = i4 * 53;
                    zzc = zzml.zzc(t, j2);
                    i4 = zzc + i2;
                    break;
                case 12:
                    i2 = i4 * 53;
                    zzc = zzml.zzc(t, j2);
                    i4 = zzc + i2;
                    break;
                case 13:
                    i2 = i4 * 53;
                    zzc = zzml.zzc(t, j2);
                    i4 = zzc + i2;
                    break;
                case 14:
                    i2 = i4 * 53;
                    zzc = zzkf.zzc(zzml.zzd(t, j2));
                    i4 = zzc + i2;
                    break;
                case 15:
                    i2 = i4 * 53;
                    zzc = zzml.zzc(t, j2);
                    i4 = zzc + i2;
                    break;
                case 16:
                    i2 = i4 * 53;
                    zzc = zzkf.zzc(zzml.zzd(t, j2));
                    i4 = zzc + i2;
                    break;
                case 17:
                    Object zzf2 = zzml.zzf(t, j2);
                    if (zzf2 != null) {
                        i7 = zzf2.hashCode();
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
                    zzc = zzml.zzf(t, j2).hashCode();
                    i4 = zzc + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    zzc = zzml.zzf(t, j2).hashCode();
                    i4 = zzc + i2;
                    break;
                case 51:
                    if (zzP(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzkf.zzc(Double.doubleToLongBits(zzn(t, j2)));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzP(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = Float.floatToIntBits(zzo(t, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzP(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzkf.zzc(zzC(t, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzP(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzkf.zzc(zzC(t, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 55 */:
                    if (zzP(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzr = zzr(t, j2);
                        i4 = i3 + zzr;
                        break;
                    } else {
                        break;
                    }
                case SyslogConstants.LOG_NEWS /* 56 */:
                    if (zzP(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzkf.zzc(zzC(t, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzP(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzr = zzr(t, j2);
                        i4 = i3 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzP(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzkf.zza(zzQ(t, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzP(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = ((String) zzml.zzf(t, j2)).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzP(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzml.zzf(t, j2).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzP(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzml.zzf(t, j2).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzP(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzr = zzr(t, j2);
                        i4 = i3 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzP(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzr = zzr(t, j2);
                        i4 = i3 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzP(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzr = zzr(t, j2);
                        i4 = i3 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzP(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzkf.zzc(zzC(t, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzP(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzr = zzr(t, j2);
                        i4 = i3 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzP(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzkf.zzc(zzC(t, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzP(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzml.zzf(t, j2).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzc(t).hashCode() + (i4 * 53);
        if (this.zzh) {
            this.zzo.zza(t);
            throw null;
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0417, code lost:
        if (r6 == 1048575) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0419, code lost:
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x041f, code lost:
        r3 = r9.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0423, code lost:
        if (r3 >= r9.zzl) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0425, code lost:
        r4 = r9.zzj[r3];
        r5 = r9.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zzml.zzf(r12, r9.zzB(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0437, code lost:
        if (r5 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x043e, code lost:
        if (r9.zzD(r4) != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0440, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0443, code lost:
        r5 = (com.google.android.gms.internal.measurement.zzkw) r5;
        r0 = (com.google.android.gms.internal.measurement.zzkv) r9.zzF(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x044b, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x044c, code lost:
        if (r7 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0450, code lost:
        if (r0 != r32) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0457, code lost:
        throw com.google.android.gms.internal.measurement.zzkh.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x045a, code lost:
        if (r0 > r32) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x045c, code lost:
        if (r1 != r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x045e, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0464, code lost:
        throw com.google.android.gms.internal.measurement.zzkh.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzik r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlf.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzik):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final T zze() {
        return (T) ((zzjx) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzf(T t) {
        int i2;
        int i3 = this.zzk;
        while (true) {
            i2 = this.zzl;
            if (i3 >= i2) {
                break;
            }
            long zzB = zzB(this.zzj[i3]) & 1048575;
            Object zzf = zzml.zzf(t, zzB);
            if (zzf != null) {
                ((zzkw) zzf).zzc();
                zzml.zzs(t, zzB, zzf);
            }
            i3++;
        }
        int length = this.zzj.length;
        while (i2 < length) {
            this.zzm.zza(t, this.zzj[i2]);
            i2++;
        }
        this.zzn.zzg(t);
        if (this.zzh) {
            this.zzo.zzb(t);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzg(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzB = zzB(i2);
            long j2 = 1048575 & zzB;
            int i3 = this.zzc[i2];
            switch (zzA(zzB)) {
                case 0:
                    if (zzM(t2, i2)) {
                        zzml.zzo(t, j2, zzml.zza(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzM(t2, i2)) {
                        zzml.zzp(t, j2, zzml.zzb(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzM(t2, i2)) {
                        zzml.zzr(t, j2, zzml.zzd(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzM(t2, i2)) {
                        zzml.zzr(t, j2, zzml.zzd(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzM(t2, i2)) {
                        zzml.zzq(t, j2, zzml.zzc(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzM(t2, i2)) {
                        zzml.zzr(t, j2, zzml.zzd(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzM(t2, i2)) {
                        zzml.zzq(t, j2, zzml.zzc(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzM(t2, i2)) {
                        zzml.zzm(t, j2, zzml.zzw(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzM(t2, i2)) {
                        zzml.zzs(t, j2, zzml.zzf(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(t, t2, i2);
                    break;
                case 10:
                    if (zzM(t2, i2)) {
                        zzml.zzs(t, j2, zzml.zzf(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzM(t2, i2)) {
                        zzml.zzq(t, j2, zzml.zzc(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzM(t2, i2)) {
                        zzml.zzq(t, j2, zzml.zzc(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzM(t2, i2)) {
                        zzml.zzq(t, j2, zzml.zzc(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzM(t2, i2)) {
                        zzml.zzr(t, j2, zzml.zzd(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzM(t2, i2)) {
                        zzml.zzq(t, j2, zzml.zzc(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzM(t2, i2)) {
                        zzml.zzr(t, j2, zzml.zzd(t2, j2));
                        zzJ(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(t, t2, i2);
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
                    this.zzm.zzb(t, t2, j2);
                    break;
                case 50:
                    zzlp.zzI(this.zzq, t, t2, j2);
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
                    if (zzP(t2, i3, i2)) {
                        zzml.zzs(t, j2, zzml.zzf(t2, j2));
                        zzK(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzP(t2, i3, i2)) {
                        zzml.zzs(t, j2, zzml.zzf(t2, j2));
                        zzK(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(t, t2, i2);
                    break;
            }
        }
        zzlp.zzF(this.zzn, t, t2);
        if (this.zzh) {
            zzlp.zzE(this.zzo, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzh(T t, byte[] bArr, int i2, int i3, zzik zzikVar) throws IOException {
        if (this.zzi) {
            zzu(t, bArr, i2, i3, zzikVar);
        } else {
            zzc(t, bArr, i2, i3, 0, zzikVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final boolean zzi(T t, T t2) {
        boolean zzH;
        int length = this.zzc.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int zzB = zzB(i2);
            long j2 = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzL(t, t2, i2) && Double.doubleToLongBits(zzml.zza(t, j2)) == Double.doubleToLongBits(zzml.zza(t2, j2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(t, t2, i2) && Float.floatToIntBits(zzml.zzb(t, j2)) == Float.floatToIntBits(zzml.zzb(t2, j2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(t, t2, i2) && zzml.zzd(t, j2) == zzml.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(t, t2, i2) && zzml.zzd(t, j2) == zzml.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(t, t2, i2) && zzml.zzc(t, j2) == zzml.zzc(t2, j2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(t, t2, i2) && zzml.zzd(t, j2) == zzml.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(t, t2, i2) && zzml.zzc(t, j2) == zzml.zzc(t2, j2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(t, t2, i2) && zzml.zzw(t, j2) == zzml.zzw(t2, j2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(t, t2, i2) && zzlp.zzH(zzml.zzf(t, j2), zzml.zzf(t2, j2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(t, t2, i2) && zzlp.zzH(zzml.zzf(t, j2), zzml.zzf(t2, j2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(t, t2, i2) && zzlp.zzH(zzml.zzf(t, j2), zzml.zzf(t2, j2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(t, t2, i2) && zzml.zzc(t, j2) == zzml.zzc(t2, j2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(t, t2, i2) && zzml.zzc(t, j2) == zzml.zzc(t2, j2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(t, t2, i2) && zzml.zzc(t, j2) == zzml.zzc(t2, j2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(t, t2, i2) && zzml.zzd(t, j2) == zzml.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(t, t2, i2) && zzml.zzc(t, j2) == zzml.zzc(t2, j2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(t, t2, i2) && zzml.zzd(t, j2) == zzml.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(t, t2, i2) && zzlp.zzH(zzml.zzf(t, j2), zzml.zzf(t2, j2))) {
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
                    zzH = zzlp.zzH(zzml.zzf(t, j2), zzml.zzf(t2, j2));
                    break;
                case 50:
                    zzH = zzlp.zzH(zzml.zzf(t, j2), zzml.zzf(t2, j2));
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
                    long zzy = zzy(i2) & 1048575;
                    if (zzml.zzc(t, zzy) == zzml.zzc(t2, zzy) && zzlp.zzH(zzml.zzf(t, j2), zzml.zzf(t2, j2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzH) {
                return false;
            }
        }
        if (this.zzn.zzc(t).equals(this.zzn.zzc(t2))) {
            if (this.zzh) {
                this.zzo.zza(t);
                this.zzo.zza(t2);
                throw null;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzln
    public final boolean zzj(T t) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int i7 = this.zzj[i6];
            int i8 = this.zzc[i7];
            int zzB = zzB(i7);
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
            if ((268435456 & zzB) != 0 && !zzN(t, i7, i2, i3, i11)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzP(t, i8, i7) && !zzO(t, zzB, zzE(i7))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzkw) zzml.zzf(t, zzB & 1048575)).isEmpty()) {
                            zzkv zzkvVar = (zzkv) zzF(i7);
                            throw null;
                        }
                    }
                }
                List list = (List) zzml.zzf(t, zzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzln zzE = zzE(i7);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzE.zzj(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzN(t, i7, i2, i3, i11) && !zzO(t, zzB, zzE(i7))) {
                return false;
            }
            i6++;
            i4 = i2;
            i5 = i3;
        }
        if (this.zzh) {
            this.zzo.zza(t);
            throw null;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzm(T t, zzjf zzjfVar) throws IOException {
        if (!this.zzi) {
            zzR(t, zzjfVar);
        } else if (this.zzh) {
            this.zzo.zza(t);
            throw null;
        } else {
            int length = this.zzc.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int zzB = zzB(i2);
                int i3 = this.zzc[i2];
                switch (zzA(zzB)) {
                    case 0:
                        if (zzM(t, i2)) {
                            zzjfVar.zzf(i3, zzml.zza(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzM(t, i2)) {
                            zzjfVar.zzo(i3, zzml.zzb(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzM(t, i2)) {
                            zzjfVar.zzt(i3, zzml.zzd(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzM(t, i2)) {
                            zzjfVar.zzJ(i3, zzml.zzd(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzM(t, i2)) {
                            zzjfVar.zzr(i3, zzml.zzc(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzM(t, i2)) {
                            zzjfVar.zzm(i3, zzml.zzd(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzM(t, i2)) {
                            zzjfVar.zzk(i3, zzml.zzc(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzM(t, i2)) {
                            zzjfVar.zzb(i3, zzml.zzw(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzM(t, i2)) {
                            zzT(i3, zzml.zzf(t, zzB & 1048575), zzjfVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzM(t, i2)) {
                            zzjfVar.zzv(i3, zzml.zzf(t, zzB & 1048575), zzE(i2));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzM(t, i2)) {
                            zzjfVar.zzd(i3, (zzix) zzml.zzf(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzM(t, i2)) {
                            zzjfVar.zzH(i3, zzml.zzc(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzM(t, i2)) {
                            zzjfVar.zzi(i3, zzml.zzc(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzM(t, i2)) {
                            zzjfVar.zzw(i3, zzml.zzc(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzM(t, i2)) {
                            zzjfVar.zzy(i3, zzml.zzd(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzM(t, i2)) {
                            zzjfVar.zzA(i3, zzml.zzc(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzM(t, i2)) {
                            zzjfVar.zzC(i3, zzml.zzd(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzM(t, i2)) {
                            zzjfVar.zzq(i3, zzml.zzf(t, zzB & 1048575), zzE(i2));
                            break;
                        } else {
                            break;
                        }
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        zzlp.zzL(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, false);
                        break;
                    case 19:
                        zzlp.zzP(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, false);
                        break;
                    case 20:
                        zzlp.zzS(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, false);
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        zzlp.zzaa(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, false);
                        break;
                    case 22:
                        zzlp.zzR(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, false);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        zzlp.zzO(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, false);
                        break;
                    case 24:
                        zzlp.zzN(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, false);
                        break;
                    case 25:
                        zzlp.zzJ(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, false);
                        break;
                    case 26:
                        zzlp.zzY(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar);
                        break;
                    case 27:
                        zzlp.zzT(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, zzE(i2));
                        break;
                    case 28:
                        zzlp.zzK(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar);
                        break;
                    case 29:
                        zzlp.zzZ(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, false);
                        break;
                    case 30:
                        zzlp.zzM(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, false);
                        break;
                    case 31:
                        zzlp.zzU(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, false);
                        break;
                    case 32:
                        zzlp.zzV(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, false);
                        break;
                    case 33:
                        zzlp.zzW(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, false);
                        break;
                    case 34:
                        zzlp.zzX(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, false);
                        break;
                    case 35:
                        zzlp.zzL(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, true);
                        break;
                    case 36:
                        zzlp.zzP(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, true);
                        break;
                    case 37:
                        zzlp.zzS(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, true);
                        break;
                    case 38:
                        zzlp.zzaa(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, true);
                        break;
                    case 39:
                        zzlp.zzR(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, true);
                        break;
                    case 40:
                        zzlp.zzO(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, true);
                        break;
                    case 41:
                        zzlp.zzN(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, true);
                        break;
                    case 42:
                        zzlp.zzJ(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, true);
                        break;
                    case 43:
                        zzlp.zzZ(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, true);
                        break;
                    case 44:
                        zzlp.zzM(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, true);
                        break;
                    case 45:
                        zzlp.zzU(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, true);
                        break;
                    case 46:
                        zzlp.zzV(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, true);
                        break;
                    case 47:
                        zzlp.zzW(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, true);
                        break;
                    case SyslogConstants.LOG_LPR /* 48 */:
                        zzlp.zzX(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, true);
                        break;
                    case 49:
                        zzlp.zzQ(this.zzc[i2], (List) zzml.zzf(t, zzB & 1048575), zzjfVar, zzE(i2));
                        break;
                    case 50:
                        zzS(zzjfVar, i3, zzml.zzf(t, zzB & 1048575), i2);
                        break;
                    case 51:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzf(i3, zzn(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzo(i3, zzo(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzt(i3, zzC(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzJ(i3, zzC(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case ModuleDescriptor.MODULE_VERSION /* 55 */:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzr(i3, zzr(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case SyslogConstants.LOG_NEWS /* 56 */:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzm(i3, zzC(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzk(i3, zzr(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzb(i3, zzQ(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzP(t, i3, i2)) {
                            zzT(i3, zzml.zzf(t, zzB & 1048575), zzjfVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzv(i3, zzml.zzf(t, zzB & 1048575), zzE(i2));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzd(i3, (zzix) zzml.zzf(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzH(i3, zzr(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzi(i3, zzr(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzw(i3, zzr(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzy(i3, zzC(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzA(i3, zzr(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzC(i3, zzC(t, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzP(t, i3, i2)) {
                            zzjfVar.zzq(i3, zzml.zzf(t, zzB & 1048575), zzE(i2));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzmb<?, ?> zzmbVar = this.zzn;
            zzmbVar.zzi(zzmbVar.zzc(t), zzjfVar);
        }
    }
}
