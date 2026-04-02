package com.google.android.gms.internal.pal;

import com.google.android.gms.internal.pal.zzacv;
import com.google.android.gms.internal.pal.zzacz;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public abstract class zzacz<MessageType extends zzacz<MessageType, BuilderType>, BuilderType extends zzacv<MessageType, BuilderType>> extends zzabi<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzafj zzc = zzafj.zzc();
    protected int zzd = -1;

    private static zzacz zza(zzacz zzaczVar) throws zzadi {
        if (zzaczVar != null && !zzaczVar.zzaH()) {
            zzadi zza = new zzafh(zzaczVar).zza();
            zza.zzh(zzaczVar);
            throw zza;
        }
        return zzaczVar;
    }

    public static zzadf zzaA(zzadf zzadfVar) {
        int i;
        int size = zzadfVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzadfVar.zzd(i);
    }

    public static Object zzaD(Method method, Object obj, Object... objArr) {
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

    public static Object zzaE(zzaef zzaefVar, String str, Object[] objArr) {
        return new zzaep(zzaefVar, str, objArr);
    }

    public static void zzaF(Class cls, zzacz zzaczVar) {
        zzb.put(cls, zzaczVar);
    }

    public static zzacz zzav(Class cls) {
        Map map = zzb;
        zzacz zzaczVar = (zzacz) map.get(cls);
        if (zzaczVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaczVar = (zzacz) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzaczVar == null) {
            zzaczVar = (zzacz) ((zzacz) zzafs.zze(cls)).zzb(6, null, null);
            if (zzaczVar != null) {
                map.put(cls, zzaczVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzaczVar;
    }

    public static zzacz zzaw(zzacz zzaczVar, zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        zzacc zzh = zzabyVar.zzh();
        zzacz zzaczVar2 = (zzacz) zzaczVar.zzb(4, null, null);
        try {
            zzaer zzb2 = zzaen.zza().zzb(zzaczVar2.getClass());
            zzb2.zzh(zzaczVar2, zzacd.zzq(zzh), zzacmVar);
            zzb2.zzf(zzaczVar2);
            try {
                zzh.zzm(0);
                zza(zzaczVar2);
                return zzaczVar2;
            } catch (zzadi e) {
                e.zzh(zzaczVar2);
                throw e;
            }
        } catch (zzadi e2) {
            e2.zzh(zzaczVar2);
            throw e2;
        } catch (zzafh e3) {
            zzadi zza = e3.zza();
            zza.zzh(zzaczVar2);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzadi) {
                throw ((zzadi) e4.getCause());
            }
            zzadi zzadiVar = new zzadi(e4);
            zzadiVar.zzh(zzaczVar2);
            throw zzadiVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzadi) {
                throw ((zzadi) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzacz zzax(zzacz zzaczVar, byte[] bArr, zzacm zzacmVar) throws zzadi {
        zzacz zzc = zzc(zzaczVar, bArr, 0, bArr.length, zzacmVar);
        zza(zzc);
        return zzc;
    }

    public static zzade zzay() {
        return zzada.zzf();
    }

    public static zzadf zzaz() {
        return zzaeo.zze();
    }

    private static zzacz zzc(zzacz zzaczVar, byte[] bArr, int i, int i2, zzacm zzacmVar) throws zzadi {
        zzacz zzaczVar2 = (zzacz) zzaczVar.zzb(4, null, null);
        try {
            zzaer zzb2 = zzaen.zza().zzb(zzaczVar2.getClass());
            zzb2.zzi(zzaczVar2, bArr, 0, i2, new zzabl(zzacmVar));
            zzb2.zzf(zzaczVar2);
            if (zzaczVar2.zza == 0) {
                return zzaczVar2;
            }
            throw new RuntimeException();
        } catch (zzadi e) {
            e.zzh(zzaczVar2);
            throw e;
        } catch (zzafh e2) {
            zzadi zza = e2.zza();
            zza.zzh(zzaczVar2);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzadi) {
                throw ((zzadi) e3.getCause());
            }
            zzadi zzadiVar = new zzadi(e3);
            zzadiVar.zzh(zzaczVar2);
            throw zzadiVar;
        } catch (IndexOutOfBoundsException unused) {
            zzadi zzi = zzadi.zzi();
            zzi.zzh(zzaczVar2);
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
        return zzaen.zza().zzb(getClass()).zzk(this, (zzacz) obj);
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = zzaen.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzaeh.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.pal.zzaef
    public final /* synthetic */ zzaee zzaB() {
        return (zzacv) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.pal.zzaef
    public final /* synthetic */ zzaee zzaC() {
        zzacv zzacvVar = (zzacv) zzb(5, null, null);
        zzacvVar.zzal(this);
        return zzacvVar;
    }

    @Override // com.google.android.gms.internal.pal.zzaef
    public final void zzaG(zzach zzachVar) throws IOException {
        zzaen.zza().zzb(getClass()).zzj(this, zzaci.zza(zzachVar));
    }

    public final boolean zzaH() {
        zzacz<MessageType, BuilderType> zzaczVar;
        byte byteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzaen.zza().zzb(getClass()).zzl(this);
        if (true != zzl) {
            zzaczVar = null;
        } else {
            zzaczVar = this;
        }
        zzb(2, zzaczVar, null);
        return zzl;
    }

    @Override // com.google.android.gms.internal.pal.zzabi
    public final int zzap() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.pal.zzaeg
    public final /* synthetic */ zzaef zzaq() {
        return (zzacz) zzb(6, null, null);
    }

    @Override // com.google.android.gms.internal.pal.zzabi
    public final void zzar(int i) {
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.pal.zzaef
    public final int zzat() {
        int i = this.zzd;
        if (i == -1) {
            int zza = zzaen.zza().zzb(getClass()).zza(this);
            this.zzd = zza;
            return zza;
        }
        return i;
    }

    public final zzacv zzau() {
        return (zzacv) zzb(5, null, null);
    }

    public abstract Object zzb(int i, Object obj, Object obj2);
}
