package com.google.android.gms.internal.cast;

import com.amazon.aps.iva.q.c0;
import com.google.android.gms.internal.cast.zztm;
import com.google.android.gms.internal.cast.zztp;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public abstract class zztp<MessageType extends zztp<MessageType, BuilderType>, BuilderType extends zztm<MessageType, BuilderType>> extends zzsh<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzwa zzc = zzwa.zzc();

    public static zztx zzA() {
        return zzvg.zzd();
    }

    public static zztx zzB(zztx zztxVar) {
        int i;
        int size = zztxVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zztxVar.zzg(i);
    }

    public static Object zzD(Method method, Object obj, Object... objArr) {
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

    public static Object zzE(zzux zzuxVar, String str, Object[] objArr) {
        return new zzvh(zzuxVar, str, objArr);
    }

    public static void zzH(Class cls, zztp zztpVar) {
        zztpVar.zzG();
        zzb.put(cls, zztpVar);
    }

    private final int zza(zzvi zzviVar) {
        return zzvf.zza().zzb(getClass()).zza(this);
    }

    public static zztp zzw(Class cls) {
        Map map = zzb;
        zztp zztpVar = (zztp) map.get(cls);
        if (zztpVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zztpVar = (zztp) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zztpVar == null) {
            zztpVar = (zztp) ((zztp) zzwj.zze(cls)).zzb(6, null, null);
            if (zztpVar != null) {
                map.put(cls, zztpVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zztpVar;
    }

    public static zztu zzy() {
        return zztq.zze();
    }

    public static zztw zzz() {
        return zzum.zze();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzvf.zza().zzb(getClass()).zzg(this, (zztp) obj);
    }

    public final int hashCode() {
        if (!zzK()) {
            int i = this.zza;
            if (i == 0) {
                int zzs = zzs();
                this.zza = zzs;
                return zzs;
            }
            return i;
        }
        return zzs();
    }

    public final String toString() {
        return zzuz.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.cast.zzux
    public final /* synthetic */ zzuw zzC() {
        return (zztm) zzb(5, null, null);
    }

    public final void zzF() {
        zzvf.zza().zzb(getClass()).zzd(this);
        zzG();
    }

    public final void zzG() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzI(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.cast.zzux
    public final void zzJ(zztc zztcVar) throws IOException {
        zzvf.zza().zzb(getClass()).zzf(this, zztd.zza(zztcVar));
    }

    public final boolean zzK() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.cast.zzsh
    public final int zzq(zzvi zzviVar) {
        if (zzK()) {
            int zza = zzviVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(c0.a("serialized size must be non-negative, was ", zza));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int zza2 = zzviVar.zza(this);
            if (zza2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
                return zza2;
            }
            throw new IllegalStateException(c0.a("serialized size must be non-negative, was ", zza2));
        }
        return i;
    }

    final int zzs() {
        return zzvf.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.cast.zzuy
    public final /* synthetic */ zzux zzt() {
        return (zztp) zzb(6, null, null);
    }

    @Override // com.google.android.gms.internal.cast.zzux
    public final int zzu() {
        int i;
        if (zzK()) {
            i = zza(null);
            if (i < 0) {
                throw new IllegalStateException(c0.a("serialized size must be non-negative, was ", i));
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zza(null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException(c0.a("serialized size must be non-negative, was ", i));
                }
            }
        }
        return i;
    }

    public final zztm zzv() {
        return (zztm) zzb(5, null, null);
    }

    public final zztp zzx() {
        return (zztp) zzb(4, null, null);
    }
}
