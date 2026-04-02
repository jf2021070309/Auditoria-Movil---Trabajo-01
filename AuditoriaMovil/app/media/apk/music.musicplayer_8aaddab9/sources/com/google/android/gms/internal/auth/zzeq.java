package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzeo;
import com.google.android.gms.internal.auth.zzeq;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public abstract class zzeq<MessageType extends zzeq<MessageType, BuilderType>, BuilderType extends zzeo<MessageType, BuilderType>> extends zzdm<MessageType, BuilderType> {
    private static final Map<Object, zzeq<?, ?>> zzb = new ConcurrentHashMap();
    public zzgq zzc = zzgq.zza();

    public static <T extends zzeq> T zza(Class<T> cls) {
        Map<Object, zzeq<?, ?>> map = zzb;
        zzeq<?, ?> zzeqVar = map.get(cls);
        if (zzeqVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzeqVar = map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzeqVar == null) {
            zzeqVar = (zzeq) ((zzeq) zzgz.zze(cls)).zzj(6, null, null);
            if (zzeqVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzeqVar);
        }
        return zzeqVar;
    }

    public static <T extends zzeq<T, ?>> T zzb(T t, byte[] bArr) throws zzew {
        boolean z = false;
        T t2 = (T) zzc(t, bArr, 0, bArr.length, zzeg.zza());
        if (t2 != null) {
            byte byteValue = ((Byte) t2.zzj(1, null, null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue != 0) {
                z = zzfy.zza().zzb(t2.getClass()).zzi(t2);
                t2.zzj(2, true != z ? null : t2, null);
            }
            if (!z) {
                zzew zzewVar = new zzew(new zzgo(t2).getMessage());
                zzewVar.zze(t2);
                throw zzewVar;
            }
        }
        return t2;
    }

    public static <T extends zzeq<T, ?>> T zzc(T t, byte[] bArr, int i2, int i3, zzeg zzegVar) throws zzew {
        T t2 = (T) t.zzj(4, null, null);
        try {
            zzgb zzb2 = zzfy.zza().zzb(t2.getClass());
            zzb2.zzg(t2, bArr, 0, i3, new zzdp(zzegVar));
            zzb2.zze(t2);
            if (t2.zza == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (zzew e2) {
            e2.zze(t2);
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzew) {
                throw ((zzew) e3.getCause());
            }
            zzew zzewVar = new zzew(e3);
            zzewVar.zze(t2);
            throw zzewVar;
        } catch (IndexOutOfBoundsException unused) {
            zzew zzf = zzew.zzf();
            zzf.zze(t2);
            throw zzf;
        }
    }

    public static <E> zzeu<E> zzd() {
        return zzfz.zze();
    }

    public static Object zzf(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzg(zzfq zzfqVar, String str, Object[] objArr) {
        return new zzga(zzfqVar, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    public static <T extends zzeq> void zzi(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzfy.zza().zzb(getClass()).zzh(this, (zzeq) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int zza = zzfy.zza().zzb(getClass()).zza(this);
        this.zza = zza;
        return zza;
    }

    public final String toString() {
        return zzfs.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.auth.zzfq
    public final /* bridge */ /* synthetic */ zzfp zze() {
        zzeo zzeoVar = (zzeo) zzj(5, null, null);
        zzeoVar.zze(this);
        return zzeoVar;
    }

    @Override // com.google.android.gms.internal.auth.zzfr
    public final /* bridge */ /* synthetic */ zzfq zzh() {
        return (zzeq) zzj(6, null, null);
    }

    public abstract Object zzj(int i2, Object obj, Object obj2);
}
