package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfw;
import com.google.android.gms.internal.ads.zzgga;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public abstract class zzgga<MessageType extends zzgga<MessageType, BuilderType>, BuilderType extends zzgfw<MessageType, BuilderType>> extends zzgeg<MessageType, BuilderType> {
    private static final Map<Object, zzgga<?, ?>> zzb = new ConcurrentHashMap();
    public zzgip zzc = zzgip.zza();
    public int zzd = -1;

    private static <T extends zzgga<T, ?>> T zza(T t) throws zzggm {
        if (t == null || t.zzat()) {
            return t;
        }
        zzggm zzggmVar = new zzggm(new zzgin(t).getMessage());
        zzggmVar.zza(t);
        throw zzggmVar;
    }

    public static Object zzaA(Method method, Object obj, Object... objArr) {
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

    public static zzggf zzaB() {
        return zzggb.zzd();
    }

    public static zzggf zzaC(zzggf zzggfVar) {
        int size = zzggfVar.size();
        return zzggfVar.zzf(size == 0 ? 10 : size + size);
    }

    public static zzggi zzaD() {
        return zzggx.zzd();
    }

    public static <E> zzggj<E> zzaE() {
        return zzghr.zzd();
    }

    public static <E> zzggj<E> zzaF(zzggj<E> zzggjVar) {
        int size = zzggjVar.size();
        return zzggjVar.zze(size == 0 ? 10 : size + size);
    }

    public static <T extends zzgga<T, ?>> T zzaG(T t, byte[] bArr, int i2, int i3, zzgfm zzgfmVar) throws zzggm {
        T t2 = (T) t.zzb(4, null, null);
        try {
            zzghz zzb2 = zzghq.zza().zzb(t2.getClass());
            zzb2.zzi(t2, bArr, 0, i3, new zzgej(zzgfmVar));
            zzb2.zzj(t2);
            if (t2.zza == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (zzggm e2) {
            e = e2;
            if (e.zzc()) {
                e = new zzggm(e);
            }
            e.zza(t2);
            throw e;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzggm) {
                throw ((zzggm) e3.getCause());
            }
            zzggm zzggmVar = new zzggm(e3);
            zzggmVar.zza(t2);
            throw zzggmVar;
        } catch (IndexOutOfBoundsException unused) {
            zzggm zzd = zzggm.zzd();
            zzd.zza(t2);
            throw zzd;
        }
    }

    public static <T extends zzgga<T, ?>> T zzaH(T t, zzgex zzgexVar) throws zzggm {
        zzgfm zza = zzgfm.zza();
        try {
            zzgfc zzp = zzgexVar.zzp();
            T t2 = (T) t.zzb(4, null, null);
            try {
                zzghz zzb2 = zzghq.zza().zzb(t2.getClass());
                zzb2.zzf(t2, zzgfd.zza(zzp), zza);
                zzb2.zzj(t2);
                try {
                    zzp.zzb(0);
                    zza(t2);
                    zza(t2);
                    return t2;
                } catch (zzggm e2) {
                    e2.zza(t2);
                    throw e2;
                }
            } catch (zzggm e3) {
                e = e3;
                if (e.zzc()) {
                    e = new zzggm(e);
                }
                e.zza(t2);
                throw e;
            } catch (IOException e4) {
                if (e4.getCause() instanceof zzggm) {
                    throw ((zzggm) e4.getCause());
                }
                zzggm zzggmVar = new zzggm(e4);
                zzggmVar.zza(t2);
                throw zzggmVar;
            } catch (RuntimeException e5) {
                if (e5.getCause() instanceof zzggm) {
                    throw ((zzggm) e5.getCause());
                }
                throw e5;
            }
        } catch (zzggm e6) {
            throw e6;
        }
    }

    public static <T extends zzgga<T, ?>> T zzaI(T t, zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        try {
            zzgfc zzp = zzgexVar.zzp();
            T t2 = (T) t.zzb(4, null, null);
            try {
                try {
                    zzghz zzb2 = zzghq.zza().zzb(t2.getClass());
                    zzb2.zzf(t2, zzgfd.zza(zzp), zzgfmVar);
                    zzb2.zzj(t2);
                    try {
                        zzp.zzb(0);
                        zza(t2);
                        return t2;
                    } catch (zzggm e2) {
                        e2.zza(t2);
                        throw e2;
                    }
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof zzggm) {
                        throw ((zzggm) e3.getCause());
                    }
                    throw e3;
                }
            } catch (zzggm e4) {
                e = e4;
                if (e.zzc()) {
                    e = new zzggm(e);
                }
                e.zza(t2);
                throw e;
            } catch (IOException e5) {
                if (e5.getCause() instanceof zzggm) {
                    throw ((zzggm) e5.getCause());
                }
                zzggm zzggmVar = new zzggm(e5);
                zzggmVar.zza(t2);
                throw zzggmVar;
            }
        } catch (zzggm e6) {
            throw e6;
        }
    }

    public static <T extends zzgga<T, ?>> T zzaJ(T t, byte[] bArr) throws zzggm {
        T t2 = (T) zzaG(t, bArr, 0, bArr.length, zzgfm.zza());
        zza(t2);
        return t2;
    }

    public static <T extends zzgga<T, ?>> T zzaK(T t, byte[] bArr, zzgfm zzgfmVar) throws zzggm {
        T t2 = (T) zzaG(t, bArr, 0, bArr.length, zzgfmVar);
        zza(t2);
        return t2;
    }

    public static <T extends zzgga> T zzax(Class<T> cls) {
        Map<Object, zzgga<?, ?>> map = zzb;
        zzgga<?, ?> zzggaVar = map.get(cls);
        if (zzggaVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzggaVar = map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzggaVar == null) {
            zzggaVar = (zzgga) ((zzgga) zzgiy.zzc(cls)).zzb(6, null, null);
            if (zzggaVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzggaVar);
        }
        return zzggaVar;
    }

    public static <T extends zzgga> void zzay(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    public static Object zzaz(zzghi zzghiVar, String str, Object[] objArr) {
        return new zzghs(zzghiVar, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzghq.zza().zzb(getClass()).zzb(this, (zzgga) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int zzc = zzghq.zza().zzb(getClass()).zzc(this);
        this.zza = zzc;
        return zzc;
    }

    public final String toString() {
        return zzghk.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final /* bridge */ /* synthetic */ zzghh zzaL() {
        zzgfw zzgfwVar = (zzgfw) zzb(5, null, null);
        zzgfwVar.zzai(this);
        return zzgfwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final /* bridge */ /* synthetic */ zzghh zzaM() {
        return (zzgfw) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgeg
    public final int zzap() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgeg
    public final void zzaq(int i2) {
        this.zzd = i2;
    }

    public final <MessageType extends zzgga<MessageType, BuilderType>, BuilderType extends zzgfw<MessageType, BuilderType>> BuilderType zzas() {
        return (BuilderType) zzb(5, null, null);
    }

    public final boolean zzat() {
        byte byteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzghq.zza().zzb(getClass()).zzk(this);
        zzb(2, true != zzk ? null : this, null);
        return zzk;
    }

    public final BuilderType zzau() {
        BuilderType buildertype = (BuilderType) zzb(5, null, null);
        buildertype.zzai(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final void zzav(zzgfh zzgfhVar) throws IOException {
        zzghq.zza().zzb(getClass()).zzn(this, zzgfi.zza(zzgfhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final int zzaw() {
        int i2 = this.zzd;
        if (i2 == -1) {
            int zze = zzghq.zza().zzb(getClass()).zze(this);
            this.zzd = zze;
            return zze;
        }
        return i2;
    }

    public abstract Object zzb(int i2, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzghj
    public final /* bridge */ /* synthetic */ zzghi zzbe() {
        return (zzgga) zzb(6, null, null);
    }
}
