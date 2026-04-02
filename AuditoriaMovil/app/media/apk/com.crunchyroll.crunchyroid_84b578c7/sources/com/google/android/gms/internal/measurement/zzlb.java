package com.google.android.gms.internal.measurement;

import com.amazon.aps.iva.q.c0;
import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
public abstract class zzlb<MessageType extends zzlb<MessageType, BuilderType>, BuilderType extends zzkx<MessageType, BuilderType>> extends zzjk<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected zznl zzc = zznl.zzc();

    private final int zza(zzmt zzmtVar) {
        if (zzmtVar == null) {
            return zzmq.zza().zzb(getClass()).zza(this);
        }
        return zzmtVar.zza(this);
    }

    public static zzlb zzbC(Class cls) {
        Map map = zza;
        zzlb zzlbVar = (zzlb) map.get(cls);
        if (zzlbVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzlbVar = (zzlb) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzlbVar == null) {
            zzlbVar = (zzlb) ((zzlb) zznu.zze(cls)).zzl(6, null, null);
            if (zzlbVar != null) {
                map.put(cls, zzlbVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzlbVar;
    }

    public static zzlg zzbE() {
        return zzlc.zzf();
    }

    public static zzlh zzbF() {
        return zzlx.zzf();
    }

    public static zzlh zzbG(zzlh zzlhVar) {
        int i;
        int size = zzlhVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzlhVar.zze(i);
    }

    public static zzli zzbH() {
        return zzmr.zze();
    }

    public static zzli zzbI(zzli zzliVar) {
        int i;
        int size = zzliVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzliVar.zzd(i);
    }

    public static Object zzbK(Method method, Object obj, Object... objArr) {
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

    public static Object zzbL(zzmi zzmiVar, String str, Object[] objArr) {
        return new zzms(zzmiVar, str, objArr);
    }

    public static void zzbO(Class cls, zzlb zzlbVar) {
        zzlbVar.zzbN();
        zza.put(cls, zzlbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzmq.zza().zzb(getClass()).zzj(this, (zzlb) obj);
    }

    public final int hashCode() {
        if (!zzbR()) {
            int i = this.zzb;
            if (i == 0) {
                int zzby = zzby();
                this.zzb = zzby;
                return zzby;
            }
            return i;
        }
        return zzby();
    }

    public final String toString() {
        return zzmk.zza(this, super.toString());
    }

    public final zzkx zzbA() {
        return (zzkx) zzl(5, null, null);
    }

    public final zzkx zzbB() {
        zzkx zzkxVar = (zzkx) zzl(5, null, null);
        zzkxVar.zzaB(this);
        return zzkxVar;
    }

    public final zzlb zzbD() {
        return (zzlb) zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ zzmh zzbJ() {
        return (zzkx) zzl(5, null, null);
    }

    public final void zzbM() {
        zzmq.zza().zzb(getClass()).zzf(this);
        zzbN();
    }

    public final void zzbN() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzbP(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final void zzbQ(zzki zzkiVar) throws IOException {
        zzmq.zza().zzb(getClass()).zzi(this, zzkj.zza(zzkiVar));
    }

    public final boolean zzbR() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* synthetic */ zzmi zzbV() {
        return (zzlb) zzl(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzjk
    public final int zzbu(zzmt zzmtVar) {
        if (zzbR()) {
            int zza2 = zza(zzmtVar);
            if (zza2 >= 0) {
                return zza2;
            }
            throw new IllegalStateException(c0.a("serialized size must be non-negative, was ", zza2));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza3 = zza(zzmtVar);
        if (zza3 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza3;
            return zza3;
        }
        throw new IllegalStateException(c0.a("serialized size must be non-negative, was ", zza3));
    }

    public final int zzby() {
        return zzmq.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final int zzbz() {
        int i;
        if (zzbR()) {
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

    public abstract Object zzl(int i, Object obj, Object obj2);
}
