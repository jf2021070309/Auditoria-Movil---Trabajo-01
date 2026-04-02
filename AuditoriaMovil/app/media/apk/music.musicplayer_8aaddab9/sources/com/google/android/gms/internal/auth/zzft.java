package com.google.android.gms.internal.auth;

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
public final class zzft<T> implements zzgb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgz.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfq zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfe zzl;
    private final zzgp<?, ?> zzm;
    private final zzeh<?> zzn;
    private final zzfv zzo;
    private final zzfl zzp;

    /* JADX WARN: Multi-variable type inference failed */
    private zzft(int[] iArr, int[] iArr2, Object[] objArr, int i2, int i3, zzfq zzfqVar, boolean z, boolean z2, int[] iArr3, int i4, int i5, zzfv zzfvVar, zzfe zzfeVar, zzgp<?, ?> zzgpVar, zzeh<?> zzehVar, zzfl zzflVar) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zze = objArr;
        this.zzf = i2;
        this.zzh = zzfqVar;
        this.zzi = z2;
        this.zzj = iArr3;
        this.zzk = i4;
        this.zzo = i5;
        this.zzl = zzfvVar;
        this.zzm = zzfeVar;
        this.zzn = zzgpVar;
        this.zzg = i3;
        this.zzp = zzehVar;
    }

    private static Field zzA(Class<?> cls, String str) {
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

    private final void zzB(T t, T t2, int i2) {
        long zzv = zzv(i2) & 1048575;
        if (zzG(t2, i2)) {
            Object zzf = zzgz.zzf(t, zzv);
            Object zzf2 = zzgz.zzf(t2, zzv);
            if (zzf != null && zzf2 != null) {
                zzgz.zzp(t, zzv, zzev.zzg(zzf, zzf2));
                zzD(t, i2);
            } else if (zzf2 != null) {
                zzgz.zzp(t, zzv, zzf2);
                zzD(t, i2);
            }
        }
    }

    private final void zzC(T t, T t2, int i2) {
        int zzv = zzv(i2);
        int i3 = this.zzc[i2];
        long j2 = zzv & 1048575;
        if (zzJ(t2, i3, i2)) {
            Object zzf = zzJ(t, i3, i2) ? zzgz.zzf(t, j2) : null;
            Object zzf2 = zzgz.zzf(t2, j2);
            if (zzf != null && zzf2 != null) {
                zzgz.zzp(t, j2, zzev.zzg(zzf, zzf2));
                zzE(t, i3, i2);
            } else if (zzf2 != null) {
                zzgz.zzp(t, j2, zzf2);
                zzE(t, i3, i2);
            }
        }
    }

    private final void zzD(T t, int i2) {
        int zzs = zzs(i2);
        long j2 = 1048575 & zzs;
        if (j2 == 1048575) {
            return;
        }
        zzgz.zzn(t, j2, (1 << (zzs >>> 20)) | zzgz.zzc(t, j2));
    }

    private final void zzE(T t, int i2, int i3) {
        zzgz.zzn(t, zzs(i3) & 1048575, i2);
    }

    private final boolean zzF(T t, T t2, int i2) {
        return zzG(t, i2) == zzG(t2, i2);
    }

    private final boolean zzG(T t, int i2) {
        int zzs = zzs(i2);
        long j2 = zzs & 1048575;
        if (j2 != 1048575) {
            return (zzgz.zzc(t, j2) & (1 << (zzs >>> 20))) != 0;
        }
        int zzv = zzv(i2);
        long j3 = zzv & 1048575;
        switch (zzu(zzv)) {
            case 0:
                return zzgz.zza(t, j3) != 0.0d;
            case 1:
                return zzgz.zzb(t, j3) != 0.0f;
            case 2:
                return zzgz.zzd(t, j3) != 0;
            case 3:
                return zzgz.zzd(t, j3) != 0;
            case 4:
                return zzgz.zzc(t, j3) != 0;
            case 5:
                return zzgz.zzd(t, j3) != 0;
            case 6:
                return zzgz.zzc(t, j3) != 0;
            case 7:
                return zzgz.zzt(t, j3);
            case 8:
                Object zzf = zzgz.zzf(t, j3);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzeb) {
                    return !zzeb.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzgz.zzf(t, j3) != null;
            case 10:
                return !zzeb.zzb.equals(zzgz.zzf(t, j3));
            case 11:
                return zzgz.zzc(t, j3) != 0;
            case 12:
                return zzgz.zzc(t, j3) != 0;
            case 13:
                return zzgz.zzc(t, j3) != 0;
            case 14:
                return zzgz.zzd(t, j3) != 0;
            case 15:
                return zzgz.zzc(t, j3) != 0;
            case 16:
                return zzgz.zzd(t, j3) != 0;
            case 17:
                return zzgz.zzf(t, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(T t, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? zzG(t, i2) : (i4 & i5) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzI(Object obj, int i2, zzgb zzgbVar) {
        return zzgbVar.zzi(zzgz.zzf(obj, i2 & 1048575));
    }

    private final boolean zzJ(T t, int i2, int i3) {
        return zzgz.zzc(t, (long) (zzs(i3) & 1048575)) == i2;
    }

    public static zzgq zzc(Object obj) {
        zzeq zzeqVar = (zzeq) obj;
        zzgq zzgqVar = zzeqVar.zzc;
        if (zzgqVar == zzgq.zza()) {
            zzgq zzc = zzgq.zzc();
            zzeqVar.zzc = zzc;
            return zzc;
        }
        return zzgqVar;
    }

    public static <T> zzft<T> zzj(Class<T> cls, zzfn zzfnVar, zzfv zzfvVar, zzfe zzfeVar, zzgp<?, ?> zzgpVar, zzeh<?> zzehVar, zzfl zzflVar) {
        if (zzfnVar instanceof zzga) {
            return zzk((zzga) zzfnVar, zzfvVar, zzfeVar, zzgpVar, zzehVar, zzflVar);
        }
        zzgm zzgmVar = (zzgm) zzfnVar;
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
    public static <T> com.google.android.gms.internal.auth.zzft<T> zzk(com.google.android.gms.internal.auth.zzga r33, com.google.android.gms.internal.auth.zzfv r34, com.google.android.gms.internal.auth.zzfe r35, com.google.android.gms.internal.auth.zzgp<?, ?> r36, com.google.android.gms.internal.auth.zzeh<?> r37, com.google.android.gms.internal.auth.zzfl r38) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zzk(com.google.android.gms.internal.auth.zzga, com.google.android.gms.internal.auth.zzfv, com.google.android.gms.internal.auth.zzfe, com.google.android.gms.internal.auth.zzgp, com.google.android.gms.internal.auth.zzeh, com.google.android.gms.internal.auth.zzfl):com.google.android.gms.internal.auth.zzft");
    }

    private static <T> int zzl(T t, long j2) {
        return ((Integer) zzgz.zzf(t, j2)).intValue();
    }

    private final <K, V> int zzm(T t, byte[] bArr, int i2, int i3, int i4, long j2, zzdp zzdpVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzz = zzz(i4);
        Object object = unsafe.getObject(t, j2);
        if (!((zzfk) object).zze()) {
            zzfk<K, V> zzb2 = zzfk.zza().zzb();
            zzfl.zza(zzb2, object);
            unsafe.putObject(t, j2, zzb2);
        }
        zzfj zzfjVar = (zzfj) zzz;
        throw null;
    }

    private final int zzn(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, zzdp zzdpVar) throws IOException {
        Unsafe unsafe = zzb;
        long j3 = this.zzc[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Double.valueOf(Double.longBitsToDouble(zzdq.zzn(bArr, i2))));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 8;
                }
                break;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Float.valueOf(Float.intBitsToFloat(zzdq.zzb(bArr, i2))));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 4;
                }
                break;
            case 53:
            case 54:
                if (i6 == 0) {
                    int zzm = zzdq.zzm(bArr, i2, zzdpVar);
                    unsafe.putObject(t, j2, Long.valueOf(zzdpVar.zzb));
                    unsafe.putInt(t, j3, i5);
                    return zzm;
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 55 */:
            case 62:
                if (i6 == 0) {
                    int zzj = zzdq.zzj(bArr, i2, zzdpVar);
                    unsafe.putObject(t, j2, Integer.valueOf(zzdpVar.zza));
                    unsafe.putInt(t, j3, i5);
                    return zzj;
                }
                break;
            case SyslogConstants.LOG_NEWS /* 56 */:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Long.valueOf(zzdq.zzn(bArr, i2)));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 8;
                }
                break;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Integer.valueOf(zzdq.zzb(bArr, i2)));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 4;
                }
                break;
            case 58:
                if (i6 == 0) {
                    int zzm2 = zzdq.zzm(bArr, i2, zzdpVar);
                    unsafe.putObject(t, j2, Boolean.valueOf(zzdpVar.zzb != 0));
                    unsafe.putInt(t, j3, i5);
                    return zzm2;
                }
                break;
            case 59:
                if (i6 == 2) {
                    int zzj2 = zzdq.zzj(bArr, i2, zzdpVar);
                    int i10 = zzdpVar.zza;
                    if (i10 == 0) {
                        unsafe.putObject(t, j2, "");
                    } else if ((i7 & 536870912) != 0 && !zzhd.zzd(bArr, zzj2, zzj2 + i10)) {
                        throw zzew.zzb();
                    } else {
                        unsafe.putObject(t, j2, new String(bArr, zzj2, i10, zzev.zza));
                        zzj2 += i10;
                    }
                    unsafe.putInt(t, j3, i5);
                    return zzj2;
                }
                break;
            case 60:
                if (i6 == 2) {
                    int zzd = zzdq.zzd(zzy(i9), bArr, i2, i3, zzdpVar);
                    Object object = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t, j2, zzdpVar.zzc);
                    } else {
                        unsafe.putObject(t, j2, zzev.zzg(object, zzdpVar.zzc));
                    }
                    unsafe.putInt(t, j3, i5);
                    return zzd;
                }
                break;
            case 61:
                if (i6 == 2) {
                    int zza2 = zzdq.zza(bArr, i2, zzdpVar);
                    unsafe.putObject(t, j2, zzdpVar.zzc);
                    unsafe.putInt(t, j3, i5);
                    return zza2;
                }
                break;
            case 63:
                if (i6 == 0) {
                    int zzj3 = zzdq.zzj(bArr, i2, zzdpVar);
                    int i11 = zzdpVar.zza;
                    zzet zzx = zzx(i9);
                    if (zzx == null || zzx.zza()) {
                        unsafe.putObject(t, j2, Integer.valueOf(i11));
                        unsafe.putInt(t, j3, i5);
                    } else {
                        zzc(t).zzf(i4, Long.valueOf(i11));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i6 == 0) {
                    int zzj4 = zzdq.zzj(bArr, i2, zzdpVar);
                    unsafe.putObject(t, j2, Integer.valueOf(zzee.zzb(zzdpVar.zza)));
                    unsafe.putInt(t, j3, i5);
                    return zzj4;
                }
                break;
            case 67:
                if (i6 == 0) {
                    int zzm3 = zzdq.zzm(bArr, i2, zzdpVar);
                    unsafe.putObject(t, j2, Long.valueOf(zzee.zzc(zzdpVar.zzb)));
                    unsafe.putInt(t, j3, i5);
                    return zzm3;
                }
                break;
            case 68:
                if (i6 == 3) {
                    int zzc = zzdq.zzc(zzy(i9), bArr, i2, i3, (i4 & (-8)) | 4, zzdpVar);
                    Object object2 = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j2, zzdpVar.zzc);
                    } else {
                        unsafe.putObject(t, j2, zzev.zzg(object2, zzdpVar.zzc));
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
    private final int zzo(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.auth.zzdp r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zzo(java.lang.Object, byte[], int, int, com.google.android.gms.internal.auth.zzdp):int");
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
    private final int zzp(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.auth.zzdp r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zzp(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.auth.zzdp):int");
    }

    private final int zzq(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzt(i2, 0);
    }

    private final int zzr(int i2, int i3) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzt(i2, i3);
    }

    private final int zzs(int i2) {
        return this.zzc[i2 + 2];
    }

    private final int zzt(int i2, int i3) {
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

    private static int zzu(int i2) {
        return (i2 >>> 20) & 255;
    }

    private final int zzv(int i2) {
        return this.zzc[i2 + 1];
    }

    private static <T> long zzw(T t, long j2) {
        return ((Long) zzgz.zzf(t, j2)).longValue();
    }

    private final zzet zzx(int i2) {
        int i3 = i2 / 3;
        return (zzet) this.zzd[i3 + i3 + 1];
    }

    private final zzgb zzy(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzgb zzgbVar = (zzgb) this.zzd[i4];
        if (zzgbVar != null) {
            return zzgbVar;
        }
        zzgb<T> zzb2 = zzfy.zza().zzb((Class) this.zzd[i4 + 1]);
        this.zzd[i4] = zzb2;
        return zzb2;
    }

    private final Object zzz(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final int zza(T t) {
        int i2;
        int zzc;
        int i3;
        int zzl;
        int length = this.zzc.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int zzv = zzv(i5);
            int i6 = this.zzc[i5];
            long j2 = 1048575 & zzv;
            int i7 = 37;
            switch (zzu(zzv)) {
                case 0:
                    i2 = i4 * 53;
                    zzc = zzev.zzc(Double.doubleToLongBits(zzgz.zza(t, j2)));
                    i4 = zzc + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    zzc = Float.floatToIntBits(zzgz.zzb(t, j2));
                    i4 = zzc + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    zzc = zzev.zzc(zzgz.zzd(t, j2));
                    i4 = zzc + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    zzc = zzev.zzc(zzgz.zzd(t, j2));
                    i4 = zzc + i2;
                    break;
                case 4:
                    i2 = i4 * 53;
                    zzc = zzgz.zzc(t, j2);
                    i4 = zzc + i2;
                    break;
                case 5:
                    i2 = i4 * 53;
                    zzc = zzev.zzc(zzgz.zzd(t, j2));
                    i4 = zzc + i2;
                    break;
                case 6:
                    i2 = i4 * 53;
                    zzc = zzgz.zzc(t, j2);
                    i4 = zzc + i2;
                    break;
                case 7:
                    i2 = i4 * 53;
                    zzc = zzev.zza(zzgz.zzt(t, j2));
                    i4 = zzc + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    zzc = ((String) zzgz.zzf(t, j2)).hashCode();
                    i4 = zzc + i2;
                    break;
                case 9:
                    Object zzf = zzgz.zzf(t, j2);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 10:
                    i2 = i4 * 53;
                    zzc = zzgz.zzf(t, j2).hashCode();
                    i4 = zzc + i2;
                    break;
                case 11:
                    i2 = i4 * 53;
                    zzc = zzgz.zzc(t, j2);
                    i4 = zzc + i2;
                    break;
                case 12:
                    i2 = i4 * 53;
                    zzc = zzgz.zzc(t, j2);
                    i4 = zzc + i2;
                    break;
                case 13:
                    i2 = i4 * 53;
                    zzc = zzgz.zzc(t, j2);
                    i4 = zzc + i2;
                    break;
                case 14:
                    i2 = i4 * 53;
                    zzc = zzev.zzc(zzgz.zzd(t, j2));
                    i4 = zzc + i2;
                    break;
                case 15:
                    i2 = i4 * 53;
                    zzc = zzgz.zzc(t, j2);
                    i4 = zzc + i2;
                    break;
                case 16:
                    i2 = i4 * 53;
                    zzc = zzev.zzc(zzgz.zzd(t, j2));
                    i4 = zzc + i2;
                    break;
                case 17:
                    Object zzf2 = zzgz.zzf(t, j2);
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
                    zzc = zzgz.zzf(t, j2).hashCode();
                    i4 = zzc + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    zzc = zzgz.zzf(t, j2).hashCode();
                    i4 = zzc + i2;
                    break;
                case 51:
                    if (zzJ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzev.zzc(Double.doubleToLongBits(((Double) zzgz.zzf(t, j2)).doubleValue()));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzJ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = Float.floatToIntBits(((Float) zzgz.zzf(t, j2)).floatValue());
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzJ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzev.zzc(zzw(t, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzJ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzev.zzc(zzw(t, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 55 */:
                    if (zzJ(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzl = zzl(t, j2);
                        i4 = i3 + zzl;
                        break;
                    } else {
                        break;
                    }
                case SyslogConstants.LOG_NEWS /* 56 */:
                    if (zzJ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzev.zzc(zzw(t, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzJ(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzl = zzl(t, j2);
                        i4 = i3 + zzl;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzJ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzev.zza(((Boolean) zzgz.zzf(t, j2)).booleanValue());
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzJ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = ((String) zzgz.zzf(t, j2)).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzJ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzgz.zzf(t, j2).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzJ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzgz.zzf(t, j2).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzJ(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzl = zzl(t, j2);
                        i4 = i3 + zzl;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzJ(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzl = zzl(t, j2);
                        i4 = i3 + zzl;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzJ(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzl = zzl(t, j2);
                        i4 = i3 + zzl;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzJ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzev.zzc(zzw(t, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzJ(t, i6, i5)) {
                        i3 = i4 * 53;
                        zzl = zzl(t, j2);
                        i4 = i3 + zzl;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzJ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzev.zzc(zzw(t, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzJ(t, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzgz.zzf(t, j2).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this.zzm.zza(t).hashCode() + (i4 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0322, code lost:
        if (r0 != r2) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0324, code lost:
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r13 = r32;
        r11 = r33;
        r9 = r34;
        r1 = r18;
        r2 = r19;
        r3 = r20;
        r5 = r22;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x033c, code lost:
        r7 = r33;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0366, code lost:
        if (r0 != r15) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0388, code lost:
        if (r0 != r15) goto L178;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.auth.zzdp r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdp):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final T zzd() {
        return (T) ((zzeq) this.zzg).zzj(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final void zze(T t) {
        int i2;
        int i3 = this.zzj;
        while (true) {
            i2 = this.zzk;
            if (i3 >= i2) {
                break;
            }
            long zzv = zzv(this.zzi[i3]) & 1048575;
            Object zzf = zzgz.zzf(t, zzv);
            if (zzf != null) {
                ((zzfk) zzf).zzc();
                zzgz.zzp(t, zzv, zzf);
            }
            i3++;
        }
        int length = this.zzi.length;
        while (i2 < length) {
            this.zzl.zza(t, this.zzi[i2]);
            i2++;
        }
        this.zzm.zze(t);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final void zzf(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzv = zzv(i2);
            long j2 = 1048575 & zzv;
            int i3 = this.zzc[i2];
            switch (zzu(zzv)) {
                case 0:
                    if (zzG(t2, i2)) {
                        zzgz.zzl(t, j2, zzgz.zza(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzG(t2, i2)) {
                        zzgz.zzm(t, j2, zzgz.zzb(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzG(t2, i2)) {
                        zzgz.zzo(t, j2, zzgz.zzd(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzG(t2, i2)) {
                        zzgz.zzo(t, j2, zzgz.zzd(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzG(t2, i2)) {
                        zzgz.zzn(t, j2, zzgz.zzc(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzG(t2, i2)) {
                        zzgz.zzo(t, j2, zzgz.zzd(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzG(t2, i2)) {
                        zzgz.zzn(t, j2, zzgz.zzc(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzG(t2, i2)) {
                        zzgz.zzk(t, j2, zzgz.zzt(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzG(t2, i2)) {
                        zzgz.zzp(t, j2, zzgz.zzf(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(t, t2, i2);
                    break;
                case 10:
                    if (zzG(t2, i2)) {
                        zzgz.zzp(t, j2, zzgz.zzf(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzG(t2, i2)) {
                        zzgz.zzn(t, j2, zzgz.zzc(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzG(t2, i2)) {
                        zzgz.zzn(t, j2, zzgz.zzc(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzG(t2, i2)) {
                        zzgz.zzn(t, j2, zzgz.zzc(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzG(t2, i2)) {
                        zzgz.zzo(t, j2, zzgz.zzd(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzG(t2, i2)) {
                        zzgz.zzn(t, j2, zzgz.zzc(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzG(t2, i2)) {
                        zzgz.zzo(t, j2, zzgz.zzd(t2, j2));
                        zzD(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(t, t2, i2);
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
                    this.zzl.zzb(t, t2, j2);
                    break;
                case 50:
                    zzgd.zzi(this.zzp, t, t2, j2);
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
                    if (zzJ(t2, i3, i2)) {
                        zzgz.zzp(t, j2, zzgz.zzf(t2, j2));
                        zzE(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzJ(t2, i3, i2)) {
                        zzgz.zzp(t, j2, zzgz.zzf(t2, j2));
                        zzE(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(t, t2, i2);
                    break;
            }
        }
        zzgd.zzf(this.zzm, t, t2);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final void zzg(T t, byte[] bArr, int i2, int i3, zzdp zzdpVar) throws IOException {
        if (this.zzh) {
            zzo(t, bArr, i2, i3, zzdpVar);
        } else {
            zzb(t, bArr, i2, i3, 0, zzdpVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final boolean zzh(T t, T t2) {
        boolean zzh;
        int length = this.zzc.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int zzv = zzv(i2);
            long j2 = zzv & 1048575;
            switch (zzu(zzv)) {
                case 0:
                    if (zzF(t, t2, i2) && Double.doubleToLongBits(zzgz.zza(t, j2)) == Double.doubleToLongBits(zzgz.zza(t2, j2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzF(t, t2, i2) && Float.floatToIntBits(zzgz.zzb(t, j2)) == Float.floatToIntBits(zzgz.zzb(t2, j2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzF(t, t2, i2) && zzgz.zzd(t, j2) == zzgz.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzF(t, t2, i2) && zzgz.zzd(t, j2) == zzgz.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzF(t, t2, i2) && zzgz.zzc(t, j2) == zzgz.zzc(t2, j2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzF(t, t2, i2) && zzgz.zzd(t, j2) == zzgz.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzF(t, t2, i2) && zzgz.zzc(t, j2) == zzgz.zzc(t2, j2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzF(t, t2, i2) && zzgz.zzt(t, j2) == zzgz.zzt(t2, j2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzF(t, t2, i2) && zzgd.zzh(zzgz.zzf(t, j2), zzgz.zzf(t2, j2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzF(t, t2, i2) && zzgd.zzh(zzgz.zzf(t, j2), zzgz.zzf(t2, j2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzF(t, t2, i2) && zzgd.zzh(zzgz.zzf(t, j2), zzgz.zzf(t2, j2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzF(t, t2, i2) && zzgz.zzc(t, j2) == zzgz.zzc(t2, j2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzF(t, t2, i2) && zzgz.zzc(t, j2) == zzgz.zzc(t2, j2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzF(t, t2, i2) && zzgz.zzc(t, j2) == zzgz.zzc(t2, j2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzF(t, t2, i2) && zzgz.zzd(t, j2) == zzgz.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzF(t, t2, i2) && zzgz.zzc(t, j2) == zzgz.zzc(t2, j2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzF(t, t2, i2) && zzgz.zzd(t, j2) == zzgz.zzd(t2, j2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzF(t, t2, i2) && zzgd.zzh(zzgz.zzf(t, j2), zzgz.zzf(t2, j2))) {
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
                    zzh = zzgd.zzh(zzgz.zzf(t, j2), zzgz.zzf(t2, j2));
                    break;
                case 50:
                    zzh = zzgd.zzh(zzgz.zzf(t, j2), zzgz.zzf(t2, j2));
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
                    long zzs = zzs(i2) & 1048575;
                    if (zzgz.zzc(t, zzs) == zzgz.zzc(t2, zzs) && zzgd.zzh(zzgz.zzf(t, j2), zzgz.zzf(t2, j2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzh) {
                return false;
            }
        }
        return this.zzm.zza(t).equals(this.zzm.zza(t2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzgb
    public final boolean zzi(T t) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzj) {
            int i7 = this.zzi[i6];
            int i8 = this.zzc[i7];
            int zzv = zzv(i7);
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
            if ((268435456 & zzv) != 0 && !zzH(t, i7, i2, i3, i11)) {
                return false;
            }
            int zzu = zzu(zzv);
            if (zzu != 9 && zzu != 17) {
                if (zzu != 27) {
                    if (zzu == 60 || zzu == 68) {
                        if (zzJ(t, i8, i7) && !zzI(t, zzv, zzy(i7))) {
                            return false;
                        }
                    } else if (zzu != 49) {
                        if (zzu == 50 && !((zzfk) zzgz.zzf(t, zzv & 1048575)).isEmpty()) {
                            zzfj zzfjVar = (zzfj) zzz(i7);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgz.zzf(t, zzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgb zzy = zzy(i7);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzy.zzi(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzH(t, i7, i2, i3, i11) && !zzI(t, zzv, zzy(i7))) {
                return false;
            }
            i6++;
            i4 = i2;
            i5 = i3;
        }
        return true;
    }
}
