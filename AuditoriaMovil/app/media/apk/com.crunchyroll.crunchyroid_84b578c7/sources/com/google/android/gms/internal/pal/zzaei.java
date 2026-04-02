package com.google.android.gms.internal.pal;

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
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzaei<T> implements zzaer<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzafs.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzaef zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzadt zzn;
    private final zzafi zzo;
    private final zzacn zzp;
    private final zzaek zzq;
    private final zzaea zzr;

    private zzaei(int[] iArr, Object[] objArr, int i, int i2, zzaef zzaefVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzaek zzaekVar, zzadt zzadtVar, zzafi zzafiVar, zzacn zzacnVar, zzaea zzaeaVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzaefVar instanceof zzacz;
        this.zzj = z;
        boolean z3 = false;
        if (zzacnVar != null && zzacnVar.zzh(zzaefVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzq = zzaekVar;
        this.zzn = zzadtVar;
        this.zzo = zzafiVar;
        this.zzp = zzacnVar;
        this.zzg = zzaefVar;
        this.zzr = zzaeaVar;
    }

    private final int zzA(int i, int i2) {
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

    private static int zzB(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzC(int i) {
        return this.zzc[i + 1];
    }

    private static long zzD(Object obj, long j) {
        return ((Long) zzafs.zzf(obj, j)).longValue();
    }

    private final zzadd zzE(int i) {
        int i2 = i / 3;
        return (zzadd) this.zzd[i2 + i2 + 1];
    }

    private final zzaer zzF(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzaer zzaerVar = (zzaer) this.zzd[i3];
        if (zzaerVar != null) {
            return zzaerVar;
        }
        zzaer zzb2 = zzaen.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzG(Object obj, int i, Object obj2, zzafi zzafiVar) {
        int i2 = this.zzc[i];
        Object zzf = zzafs.zzf(obj, zzC(i) & 1048575);
        if (zzf == null) {
            return obj2;
        }
        if (zzE(i) == null) {
            return obj2;
        }
        zzadz zzadzVar = (zzadz) zzf;
        zzady zzadyVar = (zzady) zzH(i);
        throw null;
    }

    private final Object zzH(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzI(Class cls, String str) {
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

    private final void zzJ(Object obj, Object obj2, int i) {
        long zzC = zzC(i) & 1048575;
        if (!zzS(obj2, i)) {
            return;
        }
        Object zzf = zzafs.zzf(obj, zzC);
        Object zzf2 = zzafs.zzf(obj2, zzC);
        if (zzf != null && zzf2 != null) {
            zzafs.zzs(obj, zzC, zzadg.zzg(zzf, zzf2));
            zzM(obj, i);
        } else if (zzf2 != null) {
            zzafs.zzs(obj, zzC, zzf2);
            zzM(obj, i);
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        Object obj3;
        int zzC = zzC(i);
        int i2 = this.zzc[i];
        long j = zzC & 1048575;
        if (!zzV(obj2, i2, i)) {
            return;
        }
        if (zzV(obj, i2, i)) {
            obj3 = zzafs.zzf(obj, j);
        } else {
            obj3 = null;
        }
        Object zzf = zzafs.zzf(obj2, j);
        if (obj3 != null && zzf != null) {
            zzafs.zzs(obj, j, zzadg.zzg(obj3, zzf));
            zzN(obj, i2, i);
        } else if (zzf != null) {
            zzafs.zzs(obj, j, zzf);
            zzN(obj, i2, i);
        }
    }

    private final void zzL(Object obj, int i, zzaeq zzaeqVar) throws IOException {
        if (zzR(i)) {
            zzafs.zzs(obj, i & 1048575, zzaeqVar.zzu());
        } else if (this.zzi) {
            zzafs.zzs(obj, i & 1048575, zzaeqVar.zzt());
        } else {
            zzafs.zzs(obj, i & 1048575, zzaeqVar.zzp());
        }
    }

    private final void zzM(Object obj, int i) {
        int zzz = zzz(i);
        long j = 1048575 & zzz;
        if (j == 1048575) {
            return;
        }
        zzafs.zzq(obj, j, (1 << (zzz >>> 20)) | zzafs.zzc(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzafs.zzq(obj, zzz(i2) & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzO(Object obj, zzaga zzagaVar) throws IOException {
        int i;
        boolean z;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i2 = 1048575;
            int i3 = 1048575;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int zzC = zzC(i4);
                int[] iArr = this.zzc;
                int i6 = iArr[i4];
                int zzB = zzB(zzC);
                if (zzB <= 17) {
                    int i7 = iArr[i4 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i3) {
                        i5 = unsafe.getInt(obj, i8);
                        i3 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = zzC & i2;
                switch (zzB) {
                    case 0:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzf(i6, zzafs.zza(obj, j));
                            break;
                        }
                    case 1:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzo(i6, zzafs.zzb(obj, j));
                            break;
                        }
                    case 2:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzt(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 3:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzJ(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 4:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzr(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 5:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzm(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 6:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzk(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 7:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzb(i6, zzafs.zzw(obj, j));
                            break;
                        }
                    case 8:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzX(i6, unsafe.getObject(obj, j), zzagaVar);
                            break;
                        }
                    case 9:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzv(i6, unsafe.getObject(obj, j), zzF(i4));
                            break;
                        }
                    case 10:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzd(i6, (zzaby) unsafe.getObject(obj, j));
                            break;
                        }
                    case 11:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzH(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 12:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzi(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 13:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzw(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 14:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzy(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 15:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzA(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 16:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzC(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 17:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzagaVar.zzq(i6, unsafe.getObject(obj, j), zzF(i4));
                            break;
                        }
                    case 18:
                        zzaet.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, false);
                        break;
                    case 19:
                        zzaet.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, false);
                        break;
                    case 20:
                        zzaet.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, false);
                        break;
                    case 21:
                        zzaet.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, false);
                        break;
                    case 22:
                        zzaet.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, false);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        zzaet.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, false);
                        break;
                    case 24:
                        zzaet.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, false);
                        break;
                    case 25:
                        zzaet.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, false);
                        break;
                    case 26:
                        zzaet.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar);
                        break;
                    case 27:
                        zzaet.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, zzF(i4));
                        break;
                    case 28:
                        zzaet.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar);
                        break;
                    case 29:
                        z = false;
                        zzaet.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, false);
                        break;
                    case 30:
                        z = false;
                        zzaet.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, false);
                        break;
                    case 31:
                        z = false;
                        zzaet.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, false);
                        break;
                    case 32:
                        z = false;
                        zzaet.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, false);
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        z = false;
                        zzaet.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, false);
                        break;
                    case 34:
                        z = false;
                        zzaet.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, false);
                        break;
                    case 35:
                        zzaet.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, true);
                        break;
                    case 36:
                        zzaet.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, true);
                        break;
                    case 37:
                        zzaet.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, true);
                        break;
                    case 38:
                        zzaet.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, true);
                        break;
                    case 39:
                        zzaet.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, true);
                        break;
                    case 40:
                        zzaet.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, true);
                        break;
                    case 41:
                        zzaet.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, true);
                        break;
                    case 42:
                        zzaet.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, true);
                        break;
                    case 43:
                        zzaet.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, true);
                        break;
                    case 44:
                        zzaet.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, true);
                        break;
                    case 45:
                        zzaet.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, true);
                        break;
                    case 46:
                        zzaet.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, true);
                        break;
                    case 47:
                        zzaet.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, true);
                        break;
                    case 48:
                        zzaet.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, true);
                        break;
                    case 49:
                        zzaet.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzagaVar, zzF(i4));
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        zzP(zzagaVar, i6, unsafe.getObject(obj, j), i4);
                        break;
                    case 51:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzf(i6, zzo(obj, j));
                        }
                        break;
                    case 52:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzo(i6, zzp(obj, j));
                        }
                        break;
                    case 53:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzt(i6, zzD(obj, j));
                        }
                        break;
                    case 54:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzJ(i6, zzD(obj, j));
                        }
                        break;
                    case 55:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzr(i6, zzs(obj, j));
                        }
                        break;
                    case 56:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzm(i6, zzD(obj, j));
                        }
                        break;
                    case 57:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzk(i6, zzs(obj, j));
                        }
                        break;
                    case 58:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzb(i6, zzW(obj, j));
                        }
                        break;
                    case 59:
                        if (zzV(obj, i6, i4)) {
                            zzX(i6, unsafe.getObject(obj, j), zzagaVar);
                        }
                        break;
                    case 60:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzv(i6, unsafe.getObject(obj, j), zzF(i4));
                        }
                        break;
                    case 61:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzd(i6, (zzaby) unsafe.getObject(obj, j));
                        }
                        break;
                    case 62:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzH(i6, zzs(obj, j));
                        }
                        break;
                    case 63:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzi(i6, zzs(obj, j));
                        }
                        break;
                    case 64:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzw(i6, zzs(obj, j));
                        }
                        break;
                    case 65:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzy(i6, zzD(obj, j));
                        }
                        break;
                    case 66:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzA(i6, zzs(obj, j));
                        }
                        break;
                    case 67:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzC(i6, zzD(obj, j));
                        }
                        break;
                    case 68:
                        if (zzV(obj, i6, i4)) {
                            zzagaVar.zzq(i6, unsafe.getObject(obj, j), zzF(i4));
                        }
                        break;
                }
                i4 += 3;
                i2 = 1048575;
            }
            zzafi zzafiVar = this.zzo;
            zzafiVar.zzp(zzafiVar.zzd(obj), zzagaVar);
            return;
        }
        this.zzp.zza(obj);
        throw null;
    }

    private final void zzP(zzaga zzagaVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzady zzadyVar = (zzady) zzH(i2);
        throw null;
    }

    private final boolean zzQ(Object obj, Object obj2, int i) {
        if (zzS(obj, i) == zzS(obj2, i)) {
            return true;
        }
        return false;
    }

    private static boolean zzR(int i) {
        if ((i & 536870912) != 0) {
            return true;
        }
        return false;
    }

    private final boolean zzS(Object obj, int i) {
        int zzz = zzz(i);
        long j = zzz & 1048575;
        if (j == 1048575) {
            int zzC = zzC(i);
            long j2 = zzC & 1048575;
            switch (zzB(zzC)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzafs.zza(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzafs.zzb(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzafs.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzafs.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzafs.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzafs.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzafs.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzafs.zzw(obj, j2);
                case 8:
                    Object zzf = zzafs.zzf(obj, j2);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzaby) {
                        if (zzaby.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzafs.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzaby.zzb.equals(zzafs.zzf(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzafs.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzafs.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzafs.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzafs.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzafs.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzafs.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzafs.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((zzafs.zzc(obj, j) & (1 << (zzz >>> 20))) == 0) {
            return false;
        } else {
            return true;
        }
    }

    private final boolean zzT(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzS(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzU(Object obj, int i, zzaer zzaerVar) {
        return zzaerVar.zzl(zzafs.zzf(obj, i & 1048575));
    }

    private final boolean zzV(Object obj, int i, int i2) {
        if (zzafs.zzc(obj, zzz(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean zzW(Object obj, long j) {
        return ((Boolean) zzafs.zzf(obj, j)).booleanValue();
    }

    private static final void zzX(int i, Object obj, zzaga zzagaVar) throws IOException {
        if (obj instanceof String) {
            zzagaVar.zzF(i, (String) obj);
        } else {
            zzagaVar.zzd(i, (zzaby) obj);
        }
    }

    public static zzafj zzd(Object obj) {
        zzacz zzaczVar = (zzacz) obj;
        zzafj zzafjVar = zzaczVar.zzc;
        if (zzafjVar == zzafj.zzc()) {
            zzafj zze = zzafj.zze();
            zzaczVar.zzc = zze;
            return zze;
        }
        return zzafjVar;
    }

    public static zzaei zzm(Class cls, zzaec zzaecVar, zzaek zzaekVar, zzadt zzadtVar, zzafi zzafiVar, zzacn zzacnVar, zzaea zzaeaVar) {
        if (zzaecVar instanceof zzaep) {
            return zzn((zzaep) zzaecVar, zzaekVar, zzadtVar, zzafiVar, zzacnVar, zzaeaVar);
        }
        zzaff zzaffVar = (zzaff) zzaecVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.pal.zzaei zzn(com.google.android.gms.internal.pal.zzaep r30, com.google.android.gms.internal.pal.zzaek r31, com.google.android.gms.internal.pal.zzadt r32, com.google.android.gms.internal.pal.zzafi r33, com.google.android.gms.internal.pal.zzacn r34, com.google.android.gms.internal.pal.zzaea r35) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.zzaei.zzn(com.google.android.gms.internal.pal.zzaep, com.google.android.gms.internal.pal.zzaek, com.google.android.gms.internal.pal.zzadt, com.google.android.gms.internal.pal.zzafi, com.google.android.gms.internal.pal.zzacn, com.google.android.gms.internal.pal.zzaea):com.google.android.gms.internal.pal.zzaei");
    }

    private static double zzo(Object obj, long j) {
        return ((Double) zzafs.zzf(obj, j)).doubleValue();
    }

    private static float zzp(Object obj, long j) {
        return ((Float) zzafs.zzf(obj, j)).floatValue();
    }

    private final int zzq(Object obj) {
        int i;
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
        int zzA8;
        int zzB2;
        int zzi;
        int zzz;
        int zzA9;
        int i2;
        int zzA10;
        int zzd2;
        int zzA11;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i6 < this.zzc.length) {
            int zzC = zzC(i6);
            int[] iArr = this.zzc;
            int i8 = iArr[i6];
            int zzB3 = zzB(zzC);
            if (zzB3 <= 17) {
                int i9 = iArr[i6 + 2];
                int i10 = i9 & i3;
                i = 1 << (i9 >>> 20);
                if (i10 != i7) {
                    i4 = unsafe.getInt(obj, i10);
                    i7 = i10;
                }
            } else {
                i = 0;
            }
            long j = i3 & zzC;
            switch (zzB3) {
                case 0:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        zzA = zzach.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i5 += zzo;
                        break;
                    }
                case 1:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzach.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 2:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzA3 = zzach.zzA(i8 << 3);
                        zzB = zzach.zzB(j2);
                        zzo = zzA3 + zzB;
                        i5 += zzo;
                        break;
                    }
                case 3:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        zzA3 = zzach.zzA(i8 << 3);
                        zzB = zzach.zzB(j3);
                        zzo = zzA3 + zzB;
                        i5 += zzo;
                        break;
                    }
                case 4:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        int i11 = unsafe.getInt(obj, j);
                        zzA4 = zzach.zzA(i8 << 3);
                        zzv = zzach.zzv(i11);
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 5:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        zzA = zzach.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i5 += zzo;
                        break;
                    }
                case 6:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzach.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 7:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzach.zzA(i8 << 3);
                        zzo = zzA5 + 1;
                        i5 += zzo;
                        break;
                    }
                case 8:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzaby) {
                            zzA6 = zzach.zzA(i8 << 3);
                            zzd = ((zzaby) object).zzd();
                            zzA7 = zzach.zzA(zzd);
                            i5 = zzA7 + zzd + zzA6 + i5;
                            break;
                        } else {
                            zzA4 = zzach.zzA(i8 << 3);
                            zzv = zzach.zzy((String) object);
                            zzo = zzv + zzA4;
                            i5 += zzo;
                            break;
                        }
                    }
                case 9:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        zzo = zzaet.zzo(i8, unsafe.getObject(obj, j), zzF(i6));
                        i5 += zzo;
                        break;
                    }
                case 10:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        zzA6 = zzach.zzA(i8 << 3);
                        zzd = ((zzaby) unsafe.getObject(obj, j)).zzd();
                        zzA7 = zzach.zzA(zzd);
                        i5 = zzA7 + zzd + zzA6 + i5;
                        break;
                    }
                case 11:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        int i12 = unsafe.getInt(obj, j);
                        zzA4 = zzach.zzA(i8 << 3);
                        zzv = zzach.zzA(i12);
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 12:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        zzA4 = zzach.zzA(i8 << 3);
                        zzv = zzach.zzv(i13);
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 13:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzach.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 14:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        zzA = zzach.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i5 += zzo;
                        break;
                    }
                case 15:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        zzA4 = zzach.zzA(i8 << 3);
                        zzv = zzach.zzA((i14 >> 31) ^ (i14 + i14));
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 16:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        zzA8 = zzach.zzA(i8 << 3);
                        zzB2 = zzach.zzB((j4 >> 63) ^ (j4 + j4));
                        zzo = zzB2 + zzA8;
                        i5 += zzo;
                        break;
                    }
                case 17:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        zzo = zzach.zzu(i8, (zzaef) unsafe.getObject(obj, j), zzF(i6));
                        i5 += zzo;
                        break;
                    }
                case 18:
                    zzo = zzaet.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 19:
                    zzo = zzaet.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 20:
                    zzo = zzaet.zzm(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 21:
                    zzo = zzaet.zzx(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 22:
                    zzo = zzaet.zzk(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzo = zzaet.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 24:
                    zzo = zzaet.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 25:
                    zzo = zzaet.zza(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 26:
                    zzo = zzaet.zzu(i8, (List) unsafe.getObject(obj, j));
                    i5 += zzo;
                    break;
                case 27:
                    zzo = zzaet.zzp(i8, (List) unsafe.getObject(obj, j), zzF(i6));
                    i5 += zzo;
                    break;
                case 28:
                    zzo = zzaet.zzc(i8, (List) unsafe.getObject(obj, j));
                    i5 += zzo;
                    break;
                case 29:
                    zzo = zzaet.zzv(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 30:
                    zzo = zzaet.zzd(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 31:
                    zzo = zzaet.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 32:
                    zzo = zzaet.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    zzo = zzaet.zzq(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 34:
                    zzo = zzaet.zzs(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 35:
                    zzi = zzaet.zzi((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzach.zzz(i8);
                        zzA9 = zzach.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 36:
                    zzi = zzaet.zzg((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzach.zzz(i8);
                        zzA9 = zzach.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 37:
                    zzi = zzaet.zzn((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzach.zzz(i8);
                        zzA9 = zzach.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 38:
                    zzi = zzaet.zzy((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzach.zzz(i8);
                        zzA9 = zzach.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 39:
                    zzi = zzaet.zzl((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzach.zzz(i8);
                        zzA9 = zzach.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 40:
                    zzi = zzaet.zzi((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzach.zzz(i8);
                        zzA9 = zzach.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 41:
                    zzi = zzaet.zzg((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzach.zzz(i8);
                        zzA9 = zzach.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 42:
                    zzi = zzaet.zzb((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzach.zzz(i8);
                        zzA9 = zzach.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 43:
                    zzi = zzaet.zzw((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzach.zzz(i8);
                        zzA9 = zzach.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 44:
                    zzi = zzaet.zze((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzach.zzz(i8);
                        zzA9 = zzach.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 45:
                    zzi = zzaet.zzg((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzach.zzz(i8);
                        zzA9 = zzach.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 46:
                    zzi = zzaet.zzi((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzach.zzz(i8);
                        zzA9 = zzach.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 47:
                    zzi = zzaet.zzr((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzach.zzz(i8);
                        zzA9 = zzach.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 48:
                    zzi = zzaet.zzt((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzach.zzz(i8);
                        zzA9 = zzach.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 49:
                    zzo = zzaet.zzj(i8, (List) unsafe.getObject(obj, j), zzF(i6));
                    i5 += zzo;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    zzaea.zza(i8, unsafe.getObject(obj, j), zzH(i6));
                    break;
                case 51:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        zzA = zzach.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i5 += zzo;
                        break;
                    }
                case 52:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        zzA2 = zzach.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 53:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        long zzD = zzD(obj, j);
                        zzA3 = zzach.zzA(i8 << 3);
                        zzB = zzach.zzB(zzD);
                        zzo = zzA3 + zzB;
                        i5 += zzo;
                        break;
                    }
                case 54:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        long zzD2 = zzD(obj, j);
                        zzA3 = zzach.zzA(i8 << 3);
                        zzB = zzach.zzB(zzD2);
                        zzo = zzA3 + zzB;
                        i5 += zzo;
                        break;
                    }
                case 55:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        int zzs = zzs(obj, j);
                        zzA4 = zzach.zzA(i8 << 3);
                        zzv = zzach.zzv(zzs);
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 56:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        zzA = zzach.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i5 += zzo;
                        break;
                    }
                case 57:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        zzA2 = zzach.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 58:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        zzA5 = zzach.zzA(i8 << 3);
                        zzo = zzA5 + 1;
                        i5 += zzo;
                        break;
                    }
                case 59:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzaby) {
                            zzA10 = zzach.zzA(i8 << 3);
                            zzd2 = ((zzaby) object2).zzd();
                            zzA11 = zzach.zzA(zzd2);
                            i2 = zzA11 + zzd2 + zzA10;
                            i5 += i2;
                            break;
                        } else {
                            zzA4 = zzach.zzA(i8 << 3);
                            zzv = zzach.zzy((String) object2);
                            zzo = zzv + zzA4;
                            i5 += zzo;
                            break;
                        }
                    }
                case 60:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        zzo = zzaet.zzo(i8, unsafe.getObject(obj, j), zzF(i6));
                        i5 += zzo;
                        break;
                    }
                case 61:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        zzA10 = zzach.zzA(i8 << 3);
                        zzd2 = ((zzaby) unsafe.getObject(obj, j)).zzd();
                        zzA11 = zzach.zzA(zzd2);
                        i2 = zzA11 + zzd2 + zzA10;
                        i5 += i2;
                        break;
                    }
                case 62:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        int zzs2 = zzs(obj, j);
                        zzA4 = zzach.zzA(i8 << 3);
                        zzv = zzach.zzA(zzs2);
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 63:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        int zzs3 = zzs(obj, j);
                        zzA4 = zzach.zzA(i8 << 3);
                        zzv = zzach.zzv(zzs3);
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 64:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        zzA2 = zzach.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 65:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        zzA = zzach.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i5 += zzo;
                        break;
                    }
                case 66:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        int zzs4 = zzs(obj, j);
                        zzA4 = zzach.zzA(i8 << 3);
                        zzv = zzach.zzA((zzs4 >> 31) ^ (zzs4 + zzs4));
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 67:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        long zzD3 = zzD(obj, j);
                        zzA8 = zzach.zzA(i8 << 3);
                        zzB2 = zzach.zzB((zzD3 >> 63) ^ (zzD3 + zzD3));
                        zzo = zzB2 + zzA8;
                        i5 += zzo;
                        break;
                    }
                case 68:
                    if (!zzV(obj, i8, i6)) {
                        break;
                    } else {
                        zzo = zzach.zzu(i8, (zzaef) unsafe.getObject(obj, j), zzF(i6));
                        i5 += zzo;
                        break;
                    }
            }
            i6 += 3;
            i3 = 1048575;
        }
        zzafi zzafiVar = this.zzo;
        int zza2 = i5 + zzafiVar.zza(zzafiVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzp.zza(obj);
        throw null;
    }

    private final int zzr(Object obj) {
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
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int zzC = zzC(i3);
            int zzB2 = zzB(zzC);
            int i4 = this.zzc[i3];
            long j = zzC & 1048575;
            if (zzB2 >= zzacs.zzJ.zza() && zzB2 <= zzacs.zzW.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (zzB2) {
                case 0:
                    if (zzS(obj, i3)) {
                        zzA = zzach.zzA(i4 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (zzS(obj, i3)) {
                        zzA2 = zzach.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (zzS(obj, i3)) {
                        long zzd2 = zzafs.zzd(obj, j);
                        zzA3 = zzach.zzA(i4 << 3);
                        zzB = zzach.zzB(zzd2);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (zzS(obj, i3)) {
                        long zzd3 = zzafs.zzd(obj, j);
                        zzA3 = zzach.zzA(i4 << 3);
                        zzB = zzach.zzB(zzd3);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (zzS(obj, i3)) {
                        int zzc = zzafs.zzc(obj, j);
                        zzA4 = zzach.zzA(i4 << 3);
                        zzv = zzach.zzv(zzc);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (zzS(obj, i3)) {
                        zzA = zzach.zzA(i4 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (zzS(obj, i3)) {
                        zzA2 = zzach.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (zzS(obj, i3)) {
                        zzA5 = zzach.zzA(i4 << 3);
                        zzo = zzA5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (zzS(obj, i3)) {
                        Object zzf = zzafs.zzf(obj, j);
                        if (zzf instanceof zzaby) {
                            zzA6 = zzach.zzA(i4 << 3);
                            zzd = ((zzaby) zzf).zzd();
                            zzA7 = zzach.zzA(zzd);
                            i = zzA7 + zzd + zzA6;
                            i2 += i;
                        } else {
                            zzA4 = zzach.zzA(i4 << 3);
                            zzv = zzach.zzy((String) zzf);
                            zzo = zzv + zzA4;
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (zzS(obj, i3)) {
                        zzo = zzaet.zzo(i4, zzafs.zzf(obj, j), zzF(i3));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (zzS(obj, i3)) {
                        zzA6 = zzach.zzA(i4 << 3);
                        zzd = ((zzaby) zzafs.zzf(obj, j)).zzd();
                        zzA7 = zzach.zzA(zzd);
                        i = zzA7 + zzd + zzA6;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 11:
                    if (zzS(obj, i3)) {
                        int zzc2 = zzafs.zzc(obj, j);
                        zzA4 = zzach.zzA(i4 << 3);
                        zzv = zzach.zzA(zzc2);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (zzS(obj, i3)) {
                        int zzc3 = zzafs.zzc(obj, j);
                        zzA4 = zzach.zzA(i4 << 3);
                        zzv = zzach.zzv(zzc3);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (zzS(obj, i3)) {
                        zzA2 = zzach.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (zzS(obj, i3)) {
                        zzA = zzach.zzA(i4 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (zzS(obj, i3)) {
                        int zzc4 = zzafs.zzc(obj, j);
                        zzA4 = zzach.zzA(i4 << 3);
                        zzv = zzach.zzA((zzc4 >> 31) ^ (zzc4 + zzc4));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (zzS(obj, i3)) {
                        long zzd4 = zzafs.zzd(obj, j);
                        zzA4 = zzach.zzA(i4 << 3);
                        zzv = zzach.zzB((zzd4 >> 63) ^ (zzd4 + zzd4));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (zzS(obj, i3)) {
                        zzo = zzach.zzu(i4, (zzaef) zzafs.zzf(obj, j), zzF(i3));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    zzo = zzaet.zzh(i4, (List) zzafs.zzf(obj, j), false);
                    break;
                case 19:
                    zzo = zzaet.zzf(i4, (List) zzafs.zzf(obj, j), false);
                    break;
                case 20:
                    zzo = zzaet.zzm(i4, (List) zzafs.zzf(obj, j), false);
                    break;
                case 21:
                    zzo = zzaet.zzx(i4, (List) zzafs.zzf(obj, j), false);
                    break;
                case 22:
                    zzo = zzaet.zzk(i4, (List) zzafs.zzf(obj, j), false);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzo = zzaet.zzh(i4, (List) zzafs.zzf(obj, j), false);
                    break;
                case 24:
                    zzo = zzaet.zzf(i4, (List) zzafs.zzf(obj, j), false);
                    break;
                case 25:
                    zzo = zzaet.zza(i4, (List) zzafs.zzf(obj, j), false);
                    break;
                case 26:
                    zzo = zzaet.zzu(i4, (List) zzafs.zzf(obj, j));
                    break;
                case 27:
                    zzo = zzaet.zzp(i4, (List) zzafs.zzf(obj, j), zzF(i3));
                    break;
                case 28:
                    zzo = zzaet.zzc(i4, (List) zzafs.zzf(obj, j));
                    break;
                case 29:
                    zzo = zzaet.zzv(i4, (List) zzafs.zzf(obj, j), false);
                    break;
                case 30:
                    zzo = zzaet.zzd(i4, (List) zzafs.zzf(obj, j), false);
                    break;
                case 31:
                    zzo = zzaet.zzf(i4, (List) zzafs.zzf(obj, j), false);
                    break;
                case 32:
                    zzo = zzaet.zzh(i4, (List) zzafs.zzf(obj, j), false);
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    zzo = zzaet.zzq(i4, (List) zzafs.zzf(obj, j), false);
                    break;
                case 34:
                    zzo = zzaet.zzs(i4, (List) zzafs.zzf(obj, j), false);
                    break;
                case 35:
                    zzi = zzaet.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzach.zzz(i4);
                        zzA8 = zzach.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 36:
                    zzi = zzaet.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzach.zzz(i4);
                        zzA8 = zzach.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 37:
                    zzi = zzaet.zzn((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzach.zzz(i4);
                        zzA8 = zzach.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 38:
                    zzi = zzaet.zzy((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzach.zzz(i4);
                        zzA8 = zzach.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 39:
                    zzi = zzaet.zzl((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzach.zzz(i4);
                        zzA8 = zzach.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 40:
                    zzi = zzaet.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzach.zzz(i4);
                        zzA8 = zzach.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 41:
                    zzi = zzaet.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzach.zzz(i4);
                        zzA8 = zzach.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 42:
                    zzi = zzaet.zzb((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzach.zzz(i4);
                        zzA8 = zzach.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 43:
                    zzi = zzaet.zzw((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzach.zzz(i4);
                        zzA8 = zzach.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 44:
                    zzi = zzaet.zze((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzach.zzz(i4);
                        zzA8 = zzach.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 45:
                    zzi = zzaet.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzach.zzz(i4);
                        zzA8 = zzach.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 46:
                    zzi = zzaet.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzach.zzz(i4);
                        zzA8 = zzach.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 47:
                    zzi = zzaet.zzr((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzach.zzz(i4);
                        zzA8 = zzach.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 48:
                    zzi = zzaet.zzt((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzach.zzz(i4);
                        zzA8 = zzach.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 49:
                    zzo = zzaet.zzj(i4, (List) zzafs.zzf(obj, j), zzF(i3));
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    zzaea.zza(i4, zzafs.zzf(obj, j), zzH(i3));
                    continue;
                case 51:
                    if (zzV(obj, i4, i3)) {
                        zzA = zzach.zzA(i4 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (zzV(obj, i4, i3)) {
                        zzA2 = zzach.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (zzV(obj, i4, i3)) {
                        long zzD = zzD(obj, j);
                        zzA3 = zzach.zzA(i4 << 3);
                        zzB = zzach.zzB(zzD);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (zzV(obj, i4, i3)) {
                        long zzD2 = zzD(obj, j);
                        zzA3 = zzach.zzA(i4 << 3);
                        zzB = zzach.zzB(zzD2);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (zzV(obj, i4, i3)) {
                        int zzs = zzs(obj, j);
                        zzA4 = zzach.zzA(i4 << 3);
                        zzv = zzach.zzv(zzs);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (zzV(obj, i4, i3)) {
                        zzA = zzach.zzA(i4 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (zzV(obj, i4, i3)) {
                        zzA2 = zzach.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (zzV(obj, i4, i3)) {
                        zzA5 = zzach.zzA(i4 << 3);
                        zzo = zzA5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (zzV(obj, i4, i3)) {
                        Object zzf2 = zzafs.zzf(obj, j);
                        if (zzf2 instanceof zzaby) {
                            zzA6 = zzach.zzA(i4 << 3);
                            zzd = ((zzaby) zzf2).zzd();
                            zzA7 = zzach.zzA(zzd);
                            i = zzA7 + zzd + zzA6;
                            i2 += i;
                        } else {
                            zzA4 = zzach.zzA(i4 << 3);
                            zzv = zzach.zzy((String) zzf2);
                            zzo = zzv + zzA4;
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (zzV(obj, i4, i3)) {
                        zzo = zzaet.zzo(i4, zzafs.zzf(obj, j), zzF(i3));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (zzV(obj, i4, i3)) {
                        zzA6 = zzach.zzA(i4 << 3);
                        zzd = ((zzaby) zzafs.zzf(obj, j)).zzd();
                        zzA7 = zzach.zzA(zzd);
                        i = zzA7 + zzd + zzA6;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 62:
                    if (zzV(obj, i4, i3)) {
                        int zzs2 = zzs(obj, j);
                        zzA4 = zzach.zzA(i4 << 3);
                        zzv = zzach.zzA(zzs2);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (zzV(obj, i4, i3)) {
                        int zzs3 = zzs(obj, j);
                        zzA4 = zzach.zzA(i4 << 3);
                        zzv = zzach.zzv(zzs3);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (zzV(obj, i4, i3)) {
                        zzA2 = zzach.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (zzV(obj, i4, i3)) {
                        zzA = zzach.zzA(i4 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (zzV(obj, i4, i3)) {
                        int zzs4 = zzs(obj, j);
                        zzA4 = zzach.zzA(i4 << 3);
                        zzv = zzach.zzA((zzs4 >> 31) ^ (zzs4 + zzs4));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (zzV(obj, i4, i3)) {
                        long zzD3 = zzD(obj, j);
                        zzA4 = zzach.zzA(i4 << 3);
                        zzv = zzach.zzB((zzD3 >> 63) ^ (zzD3 + zzD3));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (zzV(obj, i4, i3)) {
                        zzo = zzach.zzu(i4, (zzaef) zzafs.zzf(obj, j), zzF(i3));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i2 += zzo;
        }
        zzafi zzafiVar = this.zzo;
        return i2 + zzafiVar.zza(zzafiVar.zzd(obj));
    }

    private static int zzs(Object obj, long j) {
        return ((Integer) zzafs.zzf(obj, j)).intValue();
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzabl zzablVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i3);
        Object object = unsafe.getObject(obj, j);
        if (zzaea.zzb(object)) {
            zzadz zzb2 = zzadz.zza().zzb();
            zzaea.zzc(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzady zzadyVar = (zzady) zzH;
        throw null;
    }

    private final int zzu(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzabl zzablVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzabm.zzn(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzabm.zzb(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzabm.zzm(bArr, i, zzablVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzablVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzabm.zzj(bArr, i, zzablVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzablVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzabm.zzn(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzabm.zzb(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzabm.zzm(bArr, i, zzablVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzablVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzabm.zzj(bArr, i, zzablVar);
                    int i9 = zzablVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzafx.zzf(bArr, zzj2, zzj2 + i9)) {
                        throw zzadi.zzd();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i9, zzadg.zzb));
                        zzj2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int zzd = zzabm.zzd(zzF(i8), bArr, i, i2, zzablVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzablVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzadg.zzg(object, zzablVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzd;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzabm.zza(bArr, i, zzablVar);
                    unsafe.putObject(obj, j, zzablVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzabm.zzj(bArr, i, zzablVar);
                    int i10 = zzablVar.zza;
                    zzadd zzE = zzE(i8);
                    if (zzE != null && !zzE.zza(i10)) {
                        zzd(obj).zzh(i3, Long.valueOf(i10));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zzj4 = zzabm.zzj(bArr, i, zzablVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzacc.zzs(zzablVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzabm.zzm(bArr, i, zzablVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzacc.zzt(zzablVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int zzc = zzabm.zzc(zzF(i8), bArr, i, i2, (i3 & (-8)) | 4, zzablVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, zzablVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzadg.zzg(object2, zzablVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    private final int zzv(Object obj, byte[] bArr, int i, int i2, zzabl zzablVar) throws IOException {
        byte b;
        int i3;
        int zzx;
        int i4;
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int i10;
        int zzm;
        int zzd;
        int i11;
        int i12;
        int i13;
        zzaei<T> zzaeiVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i14 = i2;
        zzabl zzablVar2 = zzablVar;
        Unsafe unsafe2 = zzb;
        int i15 = 1048575;
        int i16 = -1;
        int i17 = i;
        int i18 = -1;
        int i19 = 1048575;
        int i20 = 0;
        int i21 = 0;
        while (i17 < i14) {
            int i22 = i17 + 1;
            byte b2 = bArr2[i17];
            if (b2 < 0) {
                i3 = zzabm.zzk(b2, bArr2, i22, zzablVar2);
                b = zzablVar2.zza;
            } else {
                b = b2;
                i3 = i22;
            }
            int i23 = b >>> 3;
            int i24 = b & 7;
            if (i23 > i18) {
                zzx = zzaeiVar.zzy(i23, i20 / 3);
            } else {
                zzx = zzaeiVar.zzx(i23);
            }
            int i25 = zzx;
            if (i25 == i16) {
                i4 = i3;
                i5 = i23;
                i6 = i16;
                unsafe = unsafe2;
                i7 = 0;
            } else {
                int[] iArr = zzaeiVar.zzc;
                int i26 = iArr[i25 + 1];
                int zzB = zzB(i26);
                long j = i26 & i15;
                if (zzB <= 17) {
                    int i27 = iArr[i25 + 2];
                    int i28 = 1 << (i27 >>> 20);
                    int i29 = i27 & 1048575;
                    if (i29 != i19) {
                        if (i19 != 1048575) {
                            unsafe2.putInt(obj2, i19, i21);
                        }
                        if (i29 != 1048575) {
                            i21 = unsafe2.getInt(obj2, i29);
                        }
                        i19 = i29;
                    }
                    switch (zzB) {
                        case 0:
                            zzablVar2 = zzablVar;
                            i8 = i25;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 1) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzafs.zzo(obj2, j, Double.longBitsToDouble(zzabm.zzn(bArr2, i9)));
                                i17 = i9 + 8;
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 1:
                            zzablVar2 = zzablVar;
                            i8 = i25;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 5) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzafs.zzp(obj2, j, Float.intBitsToFloat(zzabm.zzb(bArr2, i9)));
                                i17 = i9 + 4;
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            zzablVar2 = zzablVar;
                            i8 = i25;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzm = zzabm.zzm(bArr2, i9, zzablVar2);
                                unsafe2.putLong(obj, j, zzablVar2.zzb);
                                i21 |= i28;
                                i17 = zzm;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            zzablVar2 = zzablVar;
                            i8 = i25;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i17 = zzabm.zzj(bArr2, i9, zzablVar2);
                                unsafe2.putInt(obj2, j, zzablVar2.zza);
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            zzablVar2 = zzablVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 1) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i9 = i3;
                                unsafe2.putLong(obj, j, zzabm.zzn(bArr2, i3));
                                i17 = i9 + 8;
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            zzablVar2 = zzablVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 5) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, j, zzabm.zzb(bArr2, i3));
                                i17 = i3 + 4;
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 7:
                            zzablVar2 = zzablVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i17 = zzabm.zzm(bArr2, i3, zzablVar2);
                                zzafs.zzm(obj2, j, zzablVar2.zzb != 0);
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 8:
                            zzablVar2 = zzablVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 2) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                if ((536870912 & i26) == 0) {
                                    i17 = zzabm.zzg(bArr2, i3, zzablVar2);
                                } else {
                                    i17 = zzabm.zzh(bArr2, i3, zzablVar2);
                                }
                                unsafe2.putObject(obj2, j, zzablVar2.zzc);
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 9:
                            zzablVar2 = zzablVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 2) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzd = zzabm.zzd(zzaeiVar.zzF(i8), bArr2, i3, i14, zzablVar2);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, zzablVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j, zzadg.zzg(object, zzablVar2.zzc));
                                }
                                i21 |= i28;
                                i17 = zzd;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 10:
                            zzablVar2 = zzablVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 2) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzd = zzabm.zza(bArr2, i3, zzablVar2);
                                unsafe2.putObject(obj2, j, zzablVar2.zzc);
                                i21 |= i28;
                                i17 = zzd;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 12:
                            zzablVar2 = zzablVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzd = zzabm.zzj(bArr2, i3, zzablVar2);
                                unsafe2.putInt(obj2, j, zzablVar2.zza);
                                i21 |= i28;
                                i17 = zzd;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 15:
                            zzablVar2 = zzablVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzd = zzabm.zzj(bArr2, i3, zzablVar2);
                                unsafe2.putInt(obj2, j, zzacc.zzs(zzablVar2.zza));
                                i21 |= i28;
                                i17 = zzd;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 16:
                            if (i24 != 0) {
                                i5 = i23;
                                i8 = i25;
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzablVar2 = zzablVar;
                                zzm = zzabm.zzm(bArr2, i3, zzablVar2);
                                i8 = i25;
                                i5 = i23;
                                i10 = 1048575;
                                unsafe2.putLong(obj, j, zzacc.zzt(zzablVar2.zzb));
                                i21 |= i28;
                                i17 = zzm;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        default:
                            i5 = i23;
                            i8 = i25;
                            i9 = i3;
                            i4 = i9;
                            unsafe = unsafe2;
                            i7 = i8;
                            i6 = -1;
                            break;
                    }
                } else {
                    zzablVar2 = zzablVar;
                    i8 = i25;
                    int i30 = i3;
                    i10 = 1048575;
                    i5 = i23;
                    if (zzB == 27) {
                        if (i24 == 2) {
                            zzadf zzadfVar = (zzadf) unsafe2.getObject(obj2, j);
                            if (!zzadfVar.zzc()) {
                                int size = zzadfVar.size();
                                zzadfVar = zzadfVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzadfVar);
                            }
                            i17 = zzabm.zze(zzaeiVar.zzF(i8), b, bArr, i30, i2, zzadfVar, zzablVar);
                            i21 = i21;
                            i20 = i8;
                            i18 = i5;
                            i15 = i10;
                            i16 = -1;
                        } else {
                            i11 = i30;
                            i12 = i21;
                            i13 = i19;
                            unsafe = unsafe2;
                            i7 = i8;
                            i6 = -1;
                        }
                    } else if (zzB <= 49) {
                        i12 = i21;
                        i13 = i19;
                        i6 = -1;
                        unsafe = unsafe2;
                        i7 = i8;
                        i17 = zzw(obj, bArr, i30, i2, b, i5, i24, i8, i26, zzB, j, zzablVar);
                        if (i17 != i30) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i14 = i2;
                            zzablVar2 = zzablVar;
                            i19 = i13;
                            i16 = i6;
                            i18 = i5;
                            i21 = i12;
                            i20 = i7;
                            unsafe2 = unsafe;
                            i15 = 1048575;
                            zzaeiVar = this;
                        } else {
                            i4 = i17;
                            i19 = i13;
                            i21 = i12;
                        }
                    } else {
                        i11 = i30;
                        i12 = i21;
                        i13 = i19;
                        unsafe = unsafe2;
                        i7 = i8;
                        i6 = -1;
                        if (zzB != 50) {
                            i17 = zzu(obj, bArr, i11, i2, b, i5, i24, i26, zzB, j, i7, zzablVar);
                            if (i17 != i11) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i14 = i2;
                                zzablVar2 = zzablVar;
                                i19 = i13;
                                i16 = i6;
                                i18 = i5;
                                i21 = i12;
                                i20 = i7;
                                unsafe2 = unsafe;
                                i15 = 1048575;
                                zzaeiVar = this;
                            } else {
                                i4 = i17;
                                i19 = i13;
                                i21 = i12;
                            }
                        } else if (i24 == 2) {
                            i17 = zzt(obj, bArr, i11, i2, i7, j, zzablVar);
                            if (i17 != i11) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i14 = i2;
                                zzablVar2 = zzablVar;
                                i19 = i13;
                                i16 = i6;
                                i18 = i5;
                                i21 = i12;
                                i20 = i7;
                                unsafe2 = unsafe;
                                i15 = 1048575;
                                zzaeiVar = this;
                            } else {
                                i4 = i17;
                                i19 = i13;
                                i21 = i12;
                            }
                        }
                    }
                    i4 = i11;
                    i19 = i13;
                    i21 = i12;
                }
            }
            i17 = zzabm.zzi(b, bArr, i4, i2, zzd(obj), zzablVar);
            zzaeiVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i14 = i2;
            zzablVar2 = zzablVar;
            i16 = i6;
            i18 = i5;
            i20 = i7;
            unsafe2 = unsafe;
            i15 = 1048575;
        }
        int i31 = i21;
        int i32 = i19;
        Unsafe unsafe3 = unsafe2;
        if (i32 != i15) {
            unsafe3.putInt(obj, i32, i31);
        }
        if (i17 == i2) {
            return i17;
        }
        throw zzadi.zzg();
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
    private final int zzw(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.pal.zzabl r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.zzaei.zzw(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.pal.zzabl):int");
    }

    private final int zzx(int i) {
        if (i >= this.zze && i <= this.zzf) {
            return zzA(i, 0);
        }
        return -1;
    }

    private final int zzy(int i, int i2) {
        if (i >= this.zze && i <= this.zzf) {
            return zzA(i, i2);
        }
        return -1;
    }

    private final int zzz(int i) {
        return this.zzc[i + 2];
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final int zza(Object obj) {
        if (this.zzj) {
            return zzr(obj);
        }
        return zzq(obj);
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final int zzb(Object obj) {
        int i;
        int zzc;
        int i2;
        int zzc2;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzC = zzC(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & zzC;
            int i6 = 37;
            switch (zzB(zzC)) {
                case 0:
                    i = i3 * 53;
                    zzc = zzadg.zzc(Double.doubleToLongBits(zzafs.zza(obj, j)));
                    i3 = zzc + i;
                    break;
                case 1:
                    i = i3 * 53;
                    zzc = Float.floatToIntBits(zzafs.zzb(obj, j));
                    i3 = zzc + i;
                    break;
                case 2:
                    i = i3 * 53;
                    zzc = zzadg.zzc(zzafs.zzd(obj, j));
                    i3 = zzc + i;
                    break;
                case 3:
                    i = i3 * 53;
                    zzc = zzadg.zzc(zzafs.zzd(obj, j));
                    i3 = zzc + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    zzc2 = zzafs.zzc(obj, j);
                    i3 = i2 + zzc2;
                    break;
                case 5:
                    i = i3 * 53;
                    zzc = zzadg.zzc(zzafs.zzd(obj, j));
                    i3 = zzc + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    zzc2 = zzafs.zzc(obj, j);
                    i3 = i2 + zzc2;
                    break;
                case 7:
                    i = i3 * 53;
                    zzc = zzadg.zza(zzafs.zzw(obj, j));
                    i3 = zzc + i;
                    break;
                case 8:
                    i = i3 * 53;
                    zzc = ((String) zzafs.zzf(obj, j)).hashCode();
                    i3 = zzc + i;
                    break;
                case 9:
                    Object zzf = zzafs.zzf(obj, j);
                    if (zzf != null) {
                        i6 = zzf.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i = i3 * 53;
                    zzc = zzafs.zzf(obj, j).hashCode();
                    i3 = zzc + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    zzc2 = zzafs.zzc(obj, j);
                    i3 = i2 + zzc2;
                    break;
                case 12:
                    i2 = i3 * 53;
                    zzc2 = zzafs.zzc(obj, j);
                    i3 = i2 + zzc2;
                    break;
                case 13:
                    i2 = i3 * 53;
                    zzc2 = zzafs.zzc(obj, j);
                    i3 = i2 + zzc2;
                    break;
                case 14:
                    i = i3 * 53;
                    zzc = zzadg.zzc(zzafs.zzd(obj, j));
                    i3 = zzc + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    zzc2 = zzafs.zzc(obj, j);
                    i3 = i2 + zzc2;
                    break;
                case 16:
                    i = i3 * 53;
                    zzc = zzadg.zzc(zzafs.zzd(obj, j));
                    i3 = zzc + i;
                    break;
                case 17:
                    Object zzf2 = zzafs.zzf(obj, j);
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
                    i = i3 * 53;
                    zzc = zzafs.zzf(obj, j).hashCode();
                    i3 = zzc + i;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    i = i3 * 53;
                    zzc = zzafs.zzf(obj, j).hashCode();
                    i3 = zzc + i;
                    break;
                case 51:
                    if (zzV(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzadg.zzc(Double.doubleToLongBits(zzo(obj, j)));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzV(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = Float.floatToIntBits(zzp(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzV(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzadg.zzc(zzD(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzV(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzadg.zzc(zzD(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzV(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzc2 = zzs(obj, j);
                        i3 = i2 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzV(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzadg.zzc(zzD(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzV(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzc2 = zzs(obj, j);
                        i3 = i2 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzV(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzadg.zza(zzW(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzV(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = ((String) zzafs.zzf(obj, j)).hashCode();
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzV(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzafs.zzf(obj, j).hashCode();
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzV(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzafs.zzf(obj, j).hashCode();
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzV(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzc2 = zzs(obj, j);
                        i3 = i2 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzV(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzc2 = zzs(obj, j);
                        i3 = i2 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzV(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzc2 = zzs(obj, j);
                        i3 = i2 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzV(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzadg.zzc(zzD(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzV(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzc2 = zzs(obj, j);
                        i3 = i2 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzV(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzadg.zzc(zzD(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzV(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzafs.zzf(obj, j).hashCode();
                        i3 = zzc + i;
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

    /* JADX WARN: Code restructure failed: missing block: B:143:0x043f, code lost:
        if (r6 == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0441, code lost:
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0447, code lost:
        r3 = r9.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x044b, code lost:
        if (r3 >= r9.zzm) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x044d, code lost:
        r9.zzG(r12, r9.zzk[r3], r2, r9.zzo);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0459, code lost:
        if (r7 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x045d, code lost:
        if (r0 != r32) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0464, code lost:
        throw com.google.android.gms.internal.pal.zzadi.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0467, code lost:
        if (r0 > r32) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0469, code lost:
        if (r1 != r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x046b, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0470, code lost:
        throw com.google.android.gms.internal.pal.zzadi.zzg();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.pal.zzabl r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.zzaei.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.pal.zzabl):int");
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final Object zze() {
        return ((zzacz) this.zzg).zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final void zzf(Object obj) {
        int i;
        int i2 = this.zzl;
        while (true) {
            i = this.zzm;
            if (i2 >= i) {
                break;
            }
            long zzC = zzC(this.zzk[i2]) & 1048575;
            Object zzf = zzafs.zzf(obj, zzC);
            if (zzf != null) {
                ((zzadz) zzf).zzc();
                zzafs.zzs(obj, zzC, zzf);
            }
            i2++;
        }
        int length = this.zzk.length;
        while (i < length) {
            this.zzn.zzb(obj, this.zzk[i]);
            i++;
        }
        this.zzo.zzm(obj);
        if (this.zzh) {
            this.zzp.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzC = zzC(i);
            long j = 1048575 & zzC;
            int i2 = this.zzc[i];
            switch (zzB(zzC)) {
                case 0:
                    if (zzS(obj2, i)) {
                        zzafs.zzo(obj, j, zzafs.zza(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzS(obj2, i)) {
                        zzafs.zzp(obj, j, zzafs.zzb(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzS(obj2, i)) {
                        zzafs.zzr(obj, j, zzafs.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzS(obj2, i)) {
                        zzafs.zzr(obj, j, zzafs.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzS(obj2, i)) {
                        zzafs.zzq(obj, j, zzafs.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzS(obj2, i)) {
                        zzafs.zzr(obj, j, zzafs.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzS(obj2, i)) {
                        zzafs.zzq(obj, j, zzafs.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzS(obj2, i)) {
                        zzafs.zzm(obj, j, zzafs.zzw(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzS(obj2, i)) {
                        zzafs.zzs(obj, j, zzafs.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i);
                    break;
                case 10:
                    if (zzS(obj2, i)) {
                        zzafs.zzs(obj, j, zzafs.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzS(obj2, i)) {
                        zzafs.zzq(obj, j, zzafs.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzS(obj2, i)) {
                        zzafs.zzq(obj, j, zzafs.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzS(obj2, i)) {
                        zzafs.zzq(obj, j, zzafs.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzS(obj2, i)) {
                        zzafs.zzr(obj, j, zzafs.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzS(obj2, i)) {
                        zzafs.zzq(obj, j, zzafs.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzS(obj2, i)) {
                        zzafs.zzr(obj, j, zzafs.zzd(obj2, j));
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
                    zzaet.zzaa(this.zzr, obj, obj2, j);
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
                    if (zzV(obj2, i2, i)) {
                        zzafs.zzs(obj, j, zzafs.zzf(obj2, j));
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
                    if (zzV(obj2, i2, i)) {
                        zzafs.zzs(obj, j, zzafs.zzf(obj2, j));
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
        zzaet.zzF(this.zzo, obj, obj2);
        if (this.zzh) {
            zzaet.zzE(this.zzp, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final void zzh(Object obj, zzaeq zzaeqVar, zzacm zzacmVar) throws IOException {
        Object zzc;
        zzacmVar.getClass();
        zzafi zzafiVar = this.zzo;
        zzacn zzacnVar = this.zzp;
        zzacr zzacrVar = null;
        Object obj2 = null;
        while (true) {
            try {
                int zzc2 = zzaeqVar.zzc();
                int zzx = zzx(zzc2);
                if (zzx < 0) {
                    if (zzc2 == Integer.MAX_VALUE) {
                        for (int i = this.zzl; i < this.zzm; i++) {
                            obj2 = zzG(obj, this.zzk[i], obj2, zzafiVar);
                        }
                        if (obj2 != null) {
                            zzafiVar.zzn(obj, obj2);
                            return;
                        }
                        return;
                    }
                    if (!this.zzh) {
                        zzc = null;
                    } else {
                        zzc = zzacnVar.zzc(zzacmVar, this.zzg, zzc2);
                    }
                    if (zzc != null) {
                        if (zzacrVar == null) {
                            zzacrVar = zzacnVar.zzb(obj);
                        }
                        zzacr zzacrVar2 = zzacrVar;
                        obj2 = zzacnVar.zzd(zzaeqVar, zzc, zzacmVar, zzacrVar2, obj2, zzafiVar);
                        zzacrVar = zzacrVar2;
                    } else {
                        zzafiVar.zzr(zzaeqVar);
                        if (obj2 == null) {
                            obj2 = zzafiVar.zzc(obj);
                        }
                        if (!zzafiVar.zzq(obj2, zzaeqVar)) {
                            for (int i2 = this.zzl; i2 < this.zzm; i2++) {
                                obj2 = zzG(obj, this.zzk[i2], obj2, zzafiVar);
                            }
                            if (obj2 != null) {
                                zzafiVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    int zzC = zzC(zzx);
                    try {
                        switch (zzB(zzC)) {
                            case 0:
                                zzafs.zzo(obj, zzC & 1048575, zzaeqVar.zza());
                                zzM(obj, zzx);
                                break;
                            case 1:
                                zzafs.zzp(obj, zzC & 1048575, zzaeqVar.zzb());
                                zzM(obj, zzx);
                                break;
                            case 2:
                                zzafs.zzr(obj, zzC & 1048575, zzaeqVar.zzl());
                                zzM(obj, zzx);
                                break;
                            case 3:
                                zzafs.zzr(obj, zzC & 1048575, zzaeqVar.zzo());
                                zzM(obj, zzx);
                                break;
                            case 4:
                                zzafs.zzq(obj, zzC & 1048575, zzaeqVar.zzg());
                                zzM(obj, zzx);
                                break;
                            case 5:
                                zzafs.zzr(obj, zzC & 1048575, zzaeqVar.zzk());
                                zzM(obj, zzx);
                                break;
                            case 6:
                                zzafs.zzq(obj, zzC & 1048575, zzaeqVar.zzf());
                                zzM(obj, zzx);
                                break;
                            case 7:
                                zzafs.zzm(obj, zzC & 1048575, zzaeqVar.zzN());
                                zzM(obj, zzx);
                                break;
                            case 8:
                                zzL(obj, zzC, zzaeqVar);
                                zzM(obj, zzx);
                                break;
                            case 9:
                                if (zzS(obj, zzx)) {
                                    long j = zzC & 1048575;
                                    zzafs.zzs(obj, j, zzadg.zzg(zzafs.zzf(obj, j), zzaeqVar.zzs(zzF(zzx), zzacmVar)));
                                    break;
                                } else {
                                    zzafs.zzs(obj, zzC & 1048575, zzaeqVar.zzs(zzF(zzx), zzacmVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 10:
                                zzafs.zzs(obj, zzC & 1048575, zzaeqVar.zzp());
                                zzM(obj, zzx);
                                break;
                            case 11:
                                zzafs.zzq(obj, zzC & 1048575, zzaeqVar.zzj());
                                zzM(obj, zzx);
                                break;
                            case 12:
                                int zze = zzaeqVar.zze();
                                zzadd zzE = zzE(zzx);
                                if (zzE != null && !zzE.zza(zze)) {
                                    obj2 = zzaet.zzD(zzc2, zze, obj2, zzafiVar);
                                    break;
                                }
                                zzafs.zzq(obj, zzC & 1048575, zze);
                                zzM(obj, zzx);
                                break;
                            case 13:
                                zzafs.zzq(obj, zzC & 1048575, zzaeqVar.zzh());
                                zzM(obj, zzx);
                                break;
                            case 14:
                                zzafs.zzr(obj, zzC & 1048575, zzaeqVar.zzm());
                                zzM(obj, zzx);
                                break;
                            case 15:
                                zzafs.zzq(obj, zzC & 1048575, zzaeqVar.zzi());
                                zzM(obj, zzx);
                                break;
                            case 16:
                                zzafs.zzr(obj, zzC & 1048575, zzaeqVar.zzn());
                                zzM(obj, zzx);
                                break;
                            case 17:
                                if (zzS(obj, zzx)) {
                                    long j2 = zzC & 1048575;
                                    zzafs.zzs(obj, j2, zzadg.zzg(zzafs.zzf(obj, j2), zzaeqVar.zzr(zzF(zzx), zzacmVar)));
                                    break;
                                } else {
                                    zzafs.zzs(obj, zzC & 1048575, zzaeqVar.zzr(zzF(zzx), zzacmVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 18:
                                zzaeqVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 19:
                                zzaeqVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 20:
                                zzaeqVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 21:
                                zzaeqVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 22:
                                zzaeqVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case ConnectionResult.API_DISABLED /* 23 */:
                                zzaeqVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 24:
                                zzaeqVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 25:
                                zzaeqVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 26:
                                if (zzR(zzC)) {
                                    ((zzacd) zzaeqVar).zzK(this.zzn.zza(obj, zzC & 1048575), true);
                                    break;
                                } else {
                                    ((zzacd) zzaeqVar).zzK(this.zzn.zza(obj, zzC & 1048575), false);
                                    break;
                                }
                            case 27:
                                zzaeqVar.zzF(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzacmVar);
                                break;
                            case 28:
                                zzaeqVar.zzw(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 29:
                                zzaeqVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 30:
                                List zza2 = this.zzn.zza(obj, zzC & 1048575);
                                zzaeqVar.zzy(zza2);
                                obj2 = zzaet.zzC(zzc2, zza2, zzE(zzx), obj2, zzafiVar);
                                break;
                            case 31:
                                zzaeqVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 32:
                                zzaeqVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                                zzaeqVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 34:
                                zzaeqVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 35:
                                zzaeqVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 36:
                                zzaeqVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 37:
                                zzaeqVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 38:
                                zzaeqVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 39:
                                zzaeqVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 40:
                                zzaeqVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 41:
                                zzaeqVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 42:
                                zzaeqVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 43:
                                zzaeqVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 44:
                                List zza3 = this.zzn.zza(obj, zzC & 1048575);
                                zzaeqVar.zzy(zza3);
                                obj2 = zzaet.zzC(zzc2, zza3, zzE(zzx), obj2, zzafiVar);
                                break;
                            case 45:
                                zzaeqVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 46:
                                zzaeqVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 47:
                                zzaeqVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 48:
                                zzaeqVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 49:
                                zzaeqVar.zzC(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzacmVar);
                                break;
                            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                                Object zzH = zzH(zzx);
                                long zzC2 = zzC(zzx) & 1048575;
                                Object zzf = zzafs.zzf(obj, zzC2);
                                if (zzf != null) {
                                    if (zzaea.zzb(zzf)) {
                                        Object zzb2 = zzadz.zza().zzb();
                                        zzaea.zzc(zzb2, zzf);
                                        zzafs.zzs(obj, zzC2, zzb2);
                                        zzf = zzb2;
                                    }
                                } else {
                                    zzf = zzadz.zza().zzb();
                                    zzafs.zzs(obj, zzC2, zzf);
                                }
                                zzadz zzadzVar = (zzadz) zzf;
                                zzady zzadyVar = (zzady) zzH;
                                throw null;
                                break;
                            case 51:
                                zzafs.zzs(obj, zzC & 1048575, Double.valueOf(zzaeqVar.zza()));
                                zzN(obj, zzc2, zzx);
                                break;
                            case 52:
                                zzafs.zzs(obj, zzC & 1048575, Float.valueOf(zzaeqVar.zzb()));
                                zzN(obj, zzc2, zzx);
                                break;
                            case 53:
                                zzafs.zzs(obj, zzC & 1048575, Long.valueOf(zzaeqVar.zzl()));
                                zzN(obj, zzc2, zzx);
                                break;
                            case 54:
                                zzafs.zzs(obj, zzC & 1048575, Long.valueOf(zzaeqVar.zzo()));
                                zzN(obj, zzc2, zzx);
                                break;
                            case 55:
                                zzafs.zzs(obj, zzC & 1048575, Integer.valueOf(zzaeqVar.zzg()));
                                zzN(obj, zzc2, zzx);
                                break;
                            case 56:
                                zzafs.zzs(obj, zzC & 1048575, Long.valueOf(zzaeqVar.zzk()));
                                zzN(obj, zzc2, zzx);
                                break;
                            case 57:
                                zzafs.zzs(obj, zzC & 1048575, Integer.valueOf(zzaeqVar.zzf()));
                                zzN(obj, zzc2, zzx);
                                break;
                            case 58:
                                zzafs.zzs(obj, zzC & 1048575, Boolean.valueOf(zzaeqVar.zzN()));
                                zzN(obj, zzc2, zzx);
                                break;
                            case 59:
                                zzL(obj, zzC, zzaeqVar);
                                zzN(obj, zzc2, zzx);
                                break;
                            case 60:
                                if (zzV(obj, zzc2, zzx)) {
                                    long j3 = zzC & 1048575;
                                    zzafs.zzs(obj, j3, zzadg.zzg(zzafs.zzf(obj, j3), zzaeqVar.zzs(zzF(zzx), zzacmVar)));
                                } else {
                                    zzafs.zzs(obj, zzC & 1048575, zzaeqVar.zzs(zzF(zzx), zzacmVar));
                                    zzM(obj, zzx);
                                }
                                zzN(obj, zzc2, zzx);
                                break;
                            case 61:
                                zzafs.zzs(obj, zzC & 1048575, zzaeqVar.zzp());
                                zzN(obj, zzc2, zzx);
                                break;
                            case 62:
                                zzafs.zzs(obj, zzC & 1048575, Integer.valueOf(zzaeqVar.zzj()));
                                zzN(obj, zzc2, zzx);
                                break;
                            case 63:
                                int zze2 = zzaeqVar.zze();
                                zzadd zzE2 = zzE(zzx);
                                if (zzE2 != null && !zzE2.zza(zze2)) {
                                    obj2 = zzaet.zzD(zzc2, zze2, obj2, zzafiVar);
                                    break;
                                }
                                zzafs.zzs(obj, zzC & 1048575, Integer.valueOf(zze2));
                                zzN(obj, zzc2, zzx);
                                break;
                            case 64:
                                zzafs.zzs(obj, zzC & 1048575, Integer.valueOf(zzaeqVar.zzh()));
                                zzN(obj, zzc2, zzx);
                                break;
                            case 65:
                                zzafs.zzs(obj, zzC & 1048575, Long.valueOf(zzaeqVar.zzm()));
                                zzN(obj, zzc2, zzx);
                                break;
                            case 66:
                                zzafs.zzs(obj, zzC & 1048575, Integer.valueOf(zzaeqVar.zzi()));
                                zzN(obj, zzc2, zzx);
                                break;
                            case 67:
                                zzafs.zzs(obj, zzC & 1048575, Long.valueOf(zzaeqVar.zzn()));
                                zzN(obj, zzc2, zzx);
                                break;
                            case 68:
                                zzafs.zzs(obj, zzC & 1048575, zzaeqVar.zzr(zzF(zzx), zzacmVar));
                                zzN(obj, zzc2, zzx);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = zzafiVar.zzf();
                                }
                                if (!zzafiVar.zzq(obj2, zzaeqVar)) {
                                    for (int i3 = this.zzl; i3 < this.zzm; i3++) {
                                        obj2 = zzG(obj, this.zzk[i3], obj2, zzafiVar);
                                    }
                                    if (obj2 != null) {
                                        zzafiVar.zzn(obj, obj2);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzadh unused) {
                        zzafiVar.zzr(zzaeqVar);
                        if (obj2 == null) {
                            obj2 = zzafiVar.zzc(obj);
                        }
                        if (!zzafiVar.zzq(obj2, zzaeqVar)) {
                            for (int i4 = this.zzl; i4 < this.zzm; i4++) {
                                obj2 = zzG(obj, this.zzk[i4], obj2, zzafiVar);
                            }
                            if (obj2 != null) {
                                zzafiVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzl; i5 < this.zzm; i5++) {
                    obj2 = zzG(obj, this.zzk[i5], obj2, zzafiVar);
                }
                if (obj2 != null) {
                    zzafiVar.zzn(obj, obj2);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzabl zzablVar) throws IOException {
        if (this.zzj) {
            zzv(obj, bArr, i, i2, zzablVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzablVar);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final void zzj(Object obj, zzaga zzagaVar) throws IOException {
        if (this.zzj) {
            if (!this.zzh) {
                int length = this.zzc.length;
                for (int i = 0; i < length; i += 3) {
                    int zzC = zzC(i);
                    int i2 = this.zzc[i];
                    switch (zzB(zzC)) {
                        case 0:
                            if (zzS(obj, i)) {
                                zzagaVar.zzf(i2, zzafs.zza(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzS(obj, i)) {
                                zzagaVar.zzo(i2, zzafs.zzb(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzS(obj, i)) {
                                zzagaVar.zzt(i2, zzafs.zzd(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzS(obj, i)) {
                                zzagaVar.zzJ(i2, zzafs.zzd(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzS(obj, i)) {
                                zzagaVar.zzr(i2, zzafs.zzc(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzS(obj, i)) {
                                zzagaVar.zzm(i2, zzafs.zzd(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzS(obj, i)) {
                                zzagaVar.zzk(i2, zzafs.zzc(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzS(obj, i)) {
                                zzagaVar.zzb(i2, zzafs.zzw(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzS(obj, i)) {
                                zzX(i2, zzafs.zzf(obj, zzC & 1048575), zzagaVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzS(obj, i)) {
                                zzagaVar.zzv(i2, zzafs.zzf(obj, zzC & 1048575), zzF(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzS(obj, i)) {
                                zzagaVar.zzd(i2, (zzaby) zzafs.zzf(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzS(obj, i)) {
                                zzagaVar.zzH(i2, zzafs.zzc(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzS(obj, i)) {
                                zzagaVar.zzi(i2, zzafs.zzc(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzS(obj, i)) {
                                zzagaVar.zzw(i2, zzafs.zzc(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzS(obj, i)) {
                                zzagaVar.zzy(i2, zzafs.zzd(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzS(obj, i)) {
                                zzagaVar.zzA(i2, zzafs.zzc(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzS(obj, i)) {
                                zzagaVar.zzC(i2, zzafs.zzd(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzS(obj, i)) {
                                zzagaVar.zzq(i2, zzafs.zzf(obj, zzC & 1048575), zzF(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzaet.zzJ(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                            break;
                        case 19:
                            zzaet.zzN(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                            break;
                        case 20:
                            zzaet.zzQ(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                            break;
                        case 21:
                            zzaet.zzY(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                            break;
                        case 22:
                            zzaet.zzP(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            zzaet.zzM(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                            break;
                        case 24:
                            zzaet.zzL(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                            break;
                        case 25:
                            zzaet.zzH(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                            break;
                        case 26:
                            zzaet.zzW(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar);
                            break;
                        case 27:
                            zzaet.zzR(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, zzF(i));
                            break;
                        case 28:
                            zzaet.zzI(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar);
                            break;
                        case 29:
                            zzaet.zzX(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                            break;
                        case 30:
                            zzaet.zzK(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                            break;
                        case 31:
                            zzaet.zzS(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                            break;
                        case 32:
                            zzaet.zzT(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                            break;
                        case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                            zzaet.zzU(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                            break;
                        case 34:
                            zzaet.zzV(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                            break;
                        case 35:
                            zzaet.zzJ(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                            break;
                        case 36:
                            zzaet.zzN(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                            break;
                        case 37:
                            zzaet.zzQ(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                            break;
                        case 38:
                            zzaet.zzY(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                            break;
                        case 39:
                            zzaet.zzP(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                            break;
                        case 40:
                            zzaet.zzM(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                            break;
                        case 41:
                            zzaet.zzL(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                            break;
                        case 42:
                            zzaet.zzH(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                            break;
                        case 43:
                            zzaet.zzX(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                            break;
                        case 44:
                            zzaet.zzK(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                            break;
                        case 45:
                            zzaet.zzS(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                            break;
                        case 46:
                            zzaet.zzT(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                            break;
                        case 47:
                            zzaet.zzU(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                            break;
                        case 48:
                            zzaet.zzV(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                            break;
                        case 49:
                            zzaet.zzO(i2, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, zzF(i));
                            break;
                        case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                            zzP(zzagaVar, i2, zzafs.zzf(obj, zzC & 1048575), i);
                            break;
                        case 51:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzf(i2, zzo(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzo(i2, zzp(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzt(i2, zzD(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzJ(i2, zzD(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzr(i2, zzs(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzm(i2, zzD(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzk(i2, zzs(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzb(i2, zzW(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzV(obj, i2, i)) {
                                zzX(i2, zzafs.zzf(obj, zzC & 1048575), zzagaVar);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzv(i2, zzafs.zzf(obj, zzC & 1048575), zzF(i));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzd(i2, (zzaby) zzafs.zzf(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzH(i2, zzs(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzi(i2, zzs(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzw(i2, zzs(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzy(i2, zzD(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzA(i2, zzs(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzC(i2, zzD(obj, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzV(obj, i2, i)) {
                                zzagaVar.zzq(i2, zzafs.zzf(obj, zzC & 1048575), zzF(i));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zzafi zzafiVar = this.zzo;
                zzafiVar.zzp(zzafiVar.zzd(obj), zzagaVar);
                return;
            }
            this.zzp.zza(obj);
            throw null;
        }
        zzO(obj, zzagaVar);
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzZ;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzC = zzC(i);
            long j = zzC & 1048575;
            switch (zzB(zzC)) {
                case 0:
                    if (zzQ(obj, obj2, i) && Double.doubleToLongBits(zzafs.zza(obj, j)) == Double.doubleToLongBits(zzafs.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzQ(obj, obj2, i) && Float.floatToIntBits(zzafs.zzb(obj, j)) == Float.floatToIntBits(zzafs.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzQ(obj, obj2, i) && zzafs.zzd(obj, j) == zzafs.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzQ(obj, obj2, i) && zzafs.zzd(obj, j) == zzafs.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzQ(obj, obj2, i) && zzafs.zzc(obj, j) == zzafs.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzQ(obj, obj2, i) && zzafs.zzd(obj, j) == zzafs.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzQ(obj, obj2, i) && zzafs.zzc(obj, j) == zzafs.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzQ(obj, obj2, i) && zzafs.zzw(obj, j) == zzafs.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzQ(obj, obj2, i) && zzaet.zzZ(zzafs.zzf(obj, j), zzafs.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzQ(obj, obj2, i) && zzaet.zzZ(zzafs.zzf(obj, j), zzafs.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzQ(obj, obj2, i) && zzaet.zzZ(zzafs.zzf(obj, j), zzafs.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzQ(obj, obj2, i) && zzafs.zzc(obj, j) == zzafs.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzQ(obj, obj2, i) && zzafs.zzc(obj, j) == zzafs.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzQ(obj, obj2, i) && zzafs.zzc(obj, j) == zzafs.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzQ(obj, obj2, i) && zzafs.zzd(obj, j) == zzafs.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzQ(obj, obj2, i) && zzafs.zzc(obj, j) == zzafs.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzQ(obj, obj2, i) && zzafs.zzd(obj, j) == zzafs.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzQ(obj, obj2, i) && zzaet.zzZ(zzafs.zzf(obj, j), zzafs.zzf(obj2, j))) {
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
                    zzZ = zzaet.zzZ(zzafs.zzf(obj, j), zzafs.zzf(obj2, j));
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    zzZ = zzaet.zzZ(zzafs.zzf(obj, j), zzafs.zzf(obj2, j));
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
                    long zzz = zzz(i) & 1048575;
                    if (zzafs.zzc(obj, zzz) == zzafs.zzc(obj2, zzz) && zzaet.zzZ(zzafs.zzf(obj, j), zzafs.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzZ) {
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

    @Override // com.google.android.gms.internal.pal.zzaer
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzl) {
            int i6 = this.zzk[i5];
            int i7 = this.zzc[i6];
            int zzC = zzC(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzC) != 0 && !zzT(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzB = zzB(zzC);
            if (zzB != 9 && zzB != 17) {
                if (zzB != 27) {
                    if (zzB != 60 && zzB != 68) {
                        if (zzB != 49) {
                            if (zzB == 50 && !((zzadz) zzafs.zzf(obj, zzC & 1048575)).isEmpty()) {
                                zzady zzadyVar = (zzady) zzH(i6);
                                throw null;
                            }
                        }
                    } else if (zzV(obj, i7, i6) && !zzU(obj, zzC, zzF(i6))) {
                        return false;
                    }
                }
                List list = (List) zzafs.zzf(obj, zzC & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzaer zzF = zzF(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzF.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzT(obj, i6, i, i2, i10) && !zzU(obj, zzC, zzF(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj);
        throw null;
    }
}
