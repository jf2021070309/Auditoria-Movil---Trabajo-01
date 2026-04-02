package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.q.c0;
import com.google.ads.interactivemedia.v3.internal.zzaep;
import com.google.ads.interactivemedia.v3.internal.zzaet;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public abstract class zzaet<MessageType extends zzaet<MessageType, BuilderType>, BuilderType extends zzaep<MessageType, BuilderType>> extends zzadb<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzahk zzc = zzahk.zzc();

    private final int zza(zzags zzagsVar) {
        if (zzagsVar == null) {
            return zzagh.zza().zzb(getClass()).zza(this);
        }
        return zzagsVar.zza(this);
    }

    public static zzaet zzaB(zzaet zzaetVar, zzadr zzadrVar) throws zzafc {
        zzaef zzaefVar = zzaef.zza;
        zzadv zzl = zzadrVar.zzl();
        zzaet zzaA = zzaetVar.zzaA();
        try {
            zzags zzb2 = zzagh.zza().zzb(zzaA.getClass());
            zzb2.zzh(zzaA, zzadw.zzq(zzl), zzaefVar);
            zzb2.zzf(zzaA);
            try {
                zzl.zzm(0);
                zzb(zzaA);
                zzb(zzaA);
                return zzaA;
            } catch (zzafc e) {
                e.zzh(zzaA);
                throw e;
            }
        } catch (zzafc e2) {
            e2.zzh(zzaA);
            throw e2;
        } catch (zzahi e3) {
            zzafc zza = e3.zza();
            zza.zzh(zzaA);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzafc) {
                throw ((zzafc) e4.getCause());
            }
            zzafc zzafcVar = new zzafc(e4);
            zzafcVar.zzh(zzaA);
            throw zzafcVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzafc) {
                throw ((zzafc) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzaet zzaC(zzaet zzaetVar, zzadr zzadrVar, zzaef zzaefVar) throws zzafc {
        zzadv zzl = zzadrVar.zzl();
        zzaet zzaA = zzaetVar.zzaA();
        try {
            zzags zzb2 = zzagh.zza().zzb(zzaA.getClass());
            zzb2.zzh(zzaA, zzadw.zzq(zzl), zzaefVar);
            zzb2.zzf(zzaA);
            try {
                zzl.zzm(0);
                zzb(zzaA);
                return zzaA;
            } catch (zzafc e) {
                e.zzh(zzaA);
                throw e;
            }
        } catch (zzafc e2) {
            e2.zzh(zzaA);
            throw e2;
        } catch (zzahi e3) {
            zzafc zza = e3.zza();
            zza.zzh(zzaA);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzafc) {
                throw ((zzafc) e4.getCause());
            }
            zzafc zzafcVar = new zzafc(e4);
            zzafcVar.zzh(zzaA);
            throw zzafcVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzafc) {
                throw ((zzafc) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzaet zzaD(zzaet zzaetVar, byte[] bArr, zzaef zzaefVar) throws zzafc {
        zzaet zzc = zzc(zzaetVar, bArr, 0, bArr.length, zzaefVar);
        zzb(zzc);
        return zzc;
    }

    public static zzaey zzaE() {
        return zzaeu.zzf();
    }

    public static zzaez zzaF() {
        return zzagi.zze();
    }

    public static zzaez zzaG(zzaez zzaezVar) {
        int i;
        int size = zzaezVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzaezVar.zzd(i);
    }

    public static Object zzaI(Method method, Object obj, Object... objArr) {
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

    public static Object zzaJ(zzafz zzafzVar, String str, Object[] objArr) {
        return new zzagj(zzafzVar, str, objArr);
    }

    public static void zzaM(Class cls, zzaet zzaetVar) {
        zzaetVar.zzaL();
        zzb.put(cls, zzaetVar);
    }

    public static zzaet zzaz(Class cls) {
        Map map = zzb;
        zzaet zzaetVar = (zzaet) map.get(cls);
        if (zzaetVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaetVar = (zzaet) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzaetVar == null) {
            zzaetVar = (zzaet) ((zzaet) zzaht.zze(cls)).zzj(6, null, null);
            if (zzaetVar != null) {
                map.put(cls, zzaetVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzaetVar;
    }

    private static zzaet zzb(zzaet zzaetVar) throws zzafc {
        if (zzaetVar != null && !zzaetVar.zzaP()) {
            zzafc zza = new zzahi(zzaetVar).zza();
            zza.zzh(zzaetVar);
            throw zza;
        }
        return zzaetVar;
    }

    private static zzaet zzc(zzaet zzaetVar, byte[] bArr, int i, int i2, zzaef zzaefVar) throws zzafc {
        zzaet zzaA = zzaetVar.zzaA();
        try {
            zzags zzb2 = zzagh.zza().zzb(zzaA.getClass());
            zzb2.zzi(zzaA, bArr, 0, i2, new zzade(zzaefVar));
            zzb2.zzf(zzaA);
            return zzaA;
        } catch (zzafc e) {
            e.zzh(zzaA);
            throw e;
        } catch (zzahi e2) {
            zzafc zza = e2.zza();
            zza.zzh(zzaA);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzafc) {
                throw ((zzafc) e3.getCause());
            }
            zzafc zzafcVar = new zzafc(e3);
            zzafcVar.zzh(zzaA);
            throw zzafcVar;
        } catch (IndexOutOfBoundsException unused) {
            zzafc zzi = zzafc.zzi();
            zzi.zzh(zzaA);
            throw zzi;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzagh.zza().zzb(getClass()).zzk(this, (zzaet) obj);
    }

    public final int hashCode() {
        if (!zzaQ()) {
            int i = this.zza;
            if (i == 0) {
                int zzaw = zzaw();
                this.zza = zzaw;
                return zzaw;
            }
            return i;
        }
        return zzaw();
    }

    public final String toString() {
        return zzagb.zza(this, super.toString());
    }

    public final zzaet zzaA() {
        return (zzaet) zzj(4, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafz
    public final /* synthetic */ zzafy zzaH() {
        return (zzaep) zzj(5, null, null);
    }

    public final void zzaK() {
        zzagh.zza().zzb(getClass()).zzf(this);
        zzaL();
    }

    public final void zzaL() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzaN(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafz
    public final void zzaO(zzaea zzaeaVar) throws IOException {
        zzagh.zza().zzb(getClass()).zzj(this, zzaeb.zza(zzaeaVar));
    }

    public final boolean zzaP() {
        zzaet<MessageType, BuilderType> zzaetVar;
        byte byteValue = ((Byte) zzj(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzagh.zza().zzb(getClass()).zzl(this);
        if (true != zzl) {
            zzaetVar = null;
        } else {
            zzaetVar = this;
        }
        zzj(2, zzaetVar, null);
        return zzl;
    }

    public final boolean zzaQ() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaga
    public final /* synthetic */ zzafz zzaR() {
        return (zzaet) zzj(6, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadb
    public final int zzat(zzags zzagsVar) {
        if (zzaQ()) {
            int zza = zza(zzagsVar);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(c0.a("serialized size must be non-negative, was ", zza));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zza(zzagsVar);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException(c0.a("serialized size must be non-negative, was ", zza2));
    }

    public final int zzaw() {
        return zzagh.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafz
    public final int zzax() {
        int i;
        if (zzaQ()) {
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

    public final zzaep zzay() {
        return (zzaep) zzj(5, null, null);
    }

    public abstract Object zzj(int i, Object obj, Object obj2);
}
