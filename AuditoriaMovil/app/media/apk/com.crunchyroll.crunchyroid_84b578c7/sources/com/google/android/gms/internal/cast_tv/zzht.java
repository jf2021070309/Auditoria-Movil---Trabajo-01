package com.google.android.gms.internal.cast_tv;

import com.amazon.aps.iva.q.c0;
import com.google.android.gms.internal.cast_tv.zzhq;
import com.google.android.gms.internal.cast_tv.zzht;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzht<MessageType extends zzht<MessageType, BuilderType>, BuilderType extends zzhq<MessageType, BuilderType>> extends zzgc<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzkf zzc = zzkf.zzc();

    public static void zzA(Class cls, zzht zzhtVar) {
        zzhtVar.zzz();
        zzb.put(cls, zzhtVar);
    }

    private final int zzc(zzjn zzjnVar) {
        if (zzjnVar == null) {
            return zzjk.zza().zzb(getClass()).zza(this);
        }
        return zzjnVar.zza(this);
    }

    private static zzht zzd(zzht zzhtVar, byte[] bArr, int i, int i2, zzhh zzhhVar) throws zzie {
        zzht zzs = zzhtVar.zzs();
        try {
            zzjn zzb2 = zzjk.zza().zzb(zzs.getClass());
            zzb2.zzh(zzs, bArr, 0, i2, new zzgg(zzhhVar));
            zzb2.zzf(zzs);
            return zzs;
        } catch (zzie e) {
            e.zzf(zzs);
            throw e;
        } catch (zzkd e2) {
            zzie zza = e2.zza();
            zza.zzf(zzs);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzie) {
                throw ((zzie) e3.getCause());
            }
            zzie zzieVar = new zzie(e3);
            zzieVar.zzf(zzs);
            throw zzieVar;
        } catch (IndexOutOfBoundsException unused) {
            zzie zzg = zzie.zzg();
            zzg.zzf(zzs);
            throw zzg;
        }
    }

    public static zzht zzr(Class cls) {
        Map map = zzb;
        zzht zzhtVar = (zzht) map.get(cls);
        if (zzhtVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzhtVar = (zzht) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzhtVar == null) {
            zzhtVar = (zzht) ((zzht) zzko.zze(cls)).zzi(6, null, null);
            if (zzhtVar != null) {
                map.put(cls, zzhtVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzhtVar;
    }

    public static zzht zzt(zzht zzhtVar, byte[] bArr, zzhh zzhhVar) throws zzie {
        zzht zzd = zzd(zzhtVar, bArr, 0, bArr.length, zzhhVar);
        if (zzd != null && !zzd.zzC()) {
            zzie zza = new zzkd(zzd).zza();
            zza.zzf(zzd);
            throw zza;
        }
        return zzd;
    }

    public static zzhy zzu() {
        return zzhu.zzf();
    }

    public static zzib zzv() {
        return zzjl.zze();
    }

    public static Object zzw(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object zzx(zzjc zzjcVar, String str, Object[] objArr) {
        return new zzjm(zzjcVar, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzjk.zza().zzb(getClass()).zzj(this, (zzht) obj);
    }

    public final int hashCode() {
        if (!zzD()) {
            int i = this.zza;
            if (i == 0) {
                int zzo = zzo();
                this.zza = zzo;
                return zzo;
            }
            return i;
        }
        return zzo();
    }

    public final String toString() {
        return zzje.zza(this, super.toString());
    }

    public final void zzB(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean zzC() {
        zzht<MessageType, BuilderType> zzhtVar;
        byte byteValue = ((Byte) zzi(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzjk.zza().zzb(getClass()).zzk(this);
        if (true != zzk) {
            zzhtVar = null;
        } else {
            zzhtVar = this;
        }
        zzi(2, zzhtVar, null);
        return zzk;
    }

    public final boolean zzD() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjc
    public final /* synthetic */ zzjb zzE() {
        return (zzhq) zzi(5, null, null);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjc
    public final void zzF(zzhc zzhcVar) throws IOException {
        zzjk.zza().zzb(getClass()).zzi(this, zzhd.zza(zzhcVar));
    }

    public abstract Object zzi(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.cast_tv.zzgc
    public final int zzk(zzjn zzjnVar) {
        if (zzD()) {
            int zzc = zzc(zzjnVar);
            if (zzc >= 0) {
                return zzc;
            }
            throw new IllegalStateException(c0.a("serialized size must be non-negative, was ", zzc));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zzc2 = zzc(zzjnVar);
        if (zzc2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zzc2;
            return zzc2;
        }
        throw new IllegalStateException(c0.a("serialized size must be non-negative, was ", zzc2));
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjd
    public final /* synthetic */ zzjc zzl() {
        return (zzht) zzi(6, null, null);
    }

    public final int zzo() {
        return zzjk.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjc
    public final int zzp() {
        int i;
        if (zzD()) {
            i = zzc(null);
            if (i < 0) {
                throw new IllegalStateException(c0.a("serialized size must be non-negative, was ", i));
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zzc(null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException(c0.a("serialized size must be non-negative, was ", i));
                }
            }
        }
        return i;
    }

    public final zzhq zzq() {
        return (zzhq) zzi(5, null, null);
    }

    public final zzht zzs() {
        return (zzht) zzi(4, null, null);
    }

    public final void zzy() {
        zzjk.zza().zzb(getClass()).zzf(this);
        zzz();
    }

    public final void zzz() {
        this.zzd &= Integer.MAX_VALUE;
    }
}
