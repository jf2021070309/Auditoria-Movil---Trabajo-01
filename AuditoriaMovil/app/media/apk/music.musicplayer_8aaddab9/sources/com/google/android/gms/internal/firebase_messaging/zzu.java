package com.google.android.gms.internal.firebase_messaging;

import ch.qos.logback.core.joran.action.Action;
import e.a.d.a.a;
import e.d.d.p.c;
import e.d.d.p.d;
import e.d.d.p.e;
import e.d.d.p.f;
import e.d.d.p.g;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzu implements f {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final d zzb;
    private static final d zzc;
    private static final e<Map.Entry<Object, Object>> zzd;
    private OutputStream zze;
    private final Map<Class<?>, e<?>> zzf;
    private final Map<Class<?>, g<?>> zzg;
    private final e<Object> zzh;
    private final zzy zzi = new zzy(this);

    static {
        zzo zzoVar = new zzo();
        zzoVar.zza(1);
        zzs zzb2 = zzoVar.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put(zzb2.annotationType(), zzb2);
        zzb = new d(Action.KEY_ATTRIBUTE, hashMap == null ? Collections.emptyMap() : a.C(hashMap), null);
        zzo zzoVar2 = new zzo();
        zzoVar2.zza(2);
        zzs zzb3 = zzoVar2.zzb();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(zzb3.annotationType(), zzb3);
        zzc = new d("value", hashMap2 == null ? Collections.emptyMap() : a.C(hashMap2), null);
        zzd = new e() { // from class: com.google.android.gms.internal.firebase_messaging.zzt
            @Override // e.d.d.p.b
            public final void encode(Object obj, f fVar) {
                zzu.zzg((Map.Entry) obj, fVar);
            }
        };
    }

    public zzu(OutputStream outputStream, Map<Class<?>, e<?>> map, Map<Class<?>, g<?>> map2, e<Object> eVar) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = eVar;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, f fVar) throws IOException {
        fVar.add(zzb, entry.getKey());
        fVar.add(zzc, entry.getValue());
    }

    private static int zzh(d dVar) {
        zzs zzsVar = (zzs) ((Annotation) dVar.f7541b.get(zzs.class));
        if (zzsVar != null) {
            return zzsVar.zza();
        }
        throw new c("Field has no @Protobuf config");
    }

    private final <T> long zzi(e<T> eVar, T t) throws IOException {
        zzp zzpVar = new zzp();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzpVar;
            eVar.encode(t, this);
            this.zze = outputStream;
            long zza2 = zzpVar.zza();
            zzpVar.close();
            return zza2;
        } catch (Throwable th) {
            try {
                zzpVar.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    private static zzs zzj(d dVar) {
        zzs zzsVar = (zzs) ((Annotation) dVar.f7541b.get(zzs.class));
        if (zzsVar != null) {
            return zzsVar;
        }
        throw new c("Field has no @Protobuf config");
    }

    private final <T> zzu zzk(e<T> eVar, d dVar, T t, boolean z) throws IOException {
        long zzi = zzi(eVar, t);
        if (z && zzi == 0) {
            return this;
        }
        zzn((zzh(dVar) << 3) | 2);
        zzo(zzi);
        eVar.encode(t, this);
        return this;
    }

    private final <T> zzu zzl(g<T> gVar, d dVar, T t, boolean z) throws IOException {
        this.zzi.zza(dVar, z);
        gVar.encode(t, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i2) throws IOException {
        while (true) {
            int i3 = ((i2 & (-128)) > 0L ? 1 : ((i2 & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.zze;
            if (i3 == 0) {
                outputStream.write(i2 & 127);
                return;
            } else {
                outputStream.write((i2 & 127) | 128);
                i2 >>>= 7;
            }
        }
    }

    private final void zzo(long j2) throws IOException {
        while (true) {
            int i2 = (((-128) & j2) > 0L ? 1 : (((-128) & j2) == 0L ? 0 : -1));
            OutputStream outputStream = this.zze;
            if (i2 == 0) {
                outputStream.write(((int) j2) & 127);
                return;
            } else {
                outputStream.write((((int) j2) & 127) | 128);
                j2 >>>= 7;
            }
        }
    }

    public final f add(d dVar, double d2) throws IOException {
        zza(dVar, d2, true);
        return this;
    }

    public final f add(d dVar, float f2) throws IOException {
        zzb(dVar, f2, true);
        return this;
    }

    @Override // e.d.d.p.f
    public final /* synthetic */ f add(d dVar, int i2) throws IOException {
        zzd(dVar, i2, true);
        return this;
    }

    @Override // e.d.d.p.f
    public final /* synthetic */ f add(d dVar, long j2) throws IOException {
        zze(dVar, j2, true);
        return this;
    }

    @Override // e.d.d.p.f
    public final f add(d dVar, Object obj) throws IOException {
        zzc(dVar, obj, true);
        return this;
    }

    @Override // e.d.d.p.f
    public final /* synthetic */ f add(d dVar, boolean z) throws IOException {
        zzd(dVar, z ? 1 : 0, true);
        return this;
    }

    public final f add(String str, double d2) throws IOException {
        zza(d.a(str), d2, true);
        return this;
    }

    public final f add(String str, int i2) throws IOException {
        zzd(d.a(str), i2, true);
        return this;
    }

    public final f add(String str, long j2) throws IOException {
        zze(d.a(str), j2, true);
        return this;
    }

    public final f add(String str, Object obj) throws IOException {
        zzc(d.a(str), obj, true);
        return this;
    }

    public final f add(String str, boolean z) throws IOException {
        zzd(d.a(str), z ? 1 : 0, true);
        return this;
    }

    public final f inline(Object obj) throws IOException {
        zzf(obj);
        return this;
    }

    public final f nested(d dVar) throws IOException {
        throw new c("nested() is not implemented for protobuf encoding.");
    }

    public final f nested(String str) throws IOException {
        return nested(d.a(str));
    }

    public final f zza(d dVar, double d2, boolean z) throws IOException {
        if (z && d2 == 0.0d) {
            return this;
        }
        zzn((zzh(dVar) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d2).array());
        return this;
    }

    public final f zzb(d dVar, float f2, boolean z) throws IOException {
        if (z && f2 == 0.0f) {
            return this;
        }
        zzn((zzh(dVar) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f2).array());
        return this;
    }

    public final f zzc(d dVar, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            zzn((zzh(dVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzn(bytes.length);
            this.zze.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                zzc(dVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzk(zzd, dVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            zza(dVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            zzb(dVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            zze(dVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            zzd(dVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            zzn((zzh(dVar) << 3) | 2);
            zzn(bArr.length);
            this.zze.write(bArr);
            return this;
        } else {
            e<?> eVar = this.zzf.get(obj.getClass());
            if (eVar != null) {
                zzk(eVar, dVar, obj, z);
                return this;
            }
            g<?> gVar = this.zzg.get(obj.getClass());
            if (gVar != null) {
                zzl(gVar, dVar, obj, z);
                return this;
            } else if (obj instanceof zzq) {
                zzd(dVar, ((zzq) obj).getNumber(), true);
                return this;
            } else if (obj instanceof Enum) {
                zzd(dVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                zzk(this.zzh, dVar, obj, z);
                return this;
            }
        }
    }

    public final zzu zzd(d dVar, int i2, boolean z) throws IOException {
        if (z && i2 == 0) {
            return this;
        }
        zzs zzj = zzj(dVar);
        zzr zzrVar = zzr.DEFAULT;
        int ordinal = zzj.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzj.zza() << 3);
            zzn(i2);
        } else if (ordinal == 1) {
            zzn(zzj.zza() << 3);
            zzn((i2 + i2) ^ (i2 >> 31));
        } else if (ordinal == 2) {
            zzn((zzj.zza() << 3) | 5);
            this.zze.write(zzm(4).putInt(i2).array());
        }
        return this;
    }

    public final zzu zze(d dVar, long j2, boolean z) throws IOException {
        if (z && j2 == 0) {
            return this;
        }
        zzs zzj = zzj(dVar);
        zzr zzrVar = zzr.DEFAULT;
        int ordinal = zzj.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzj.zza() << 3);
            zzo(j2);
        } else if (ordinal == 1) {
            zzn(zzj.zza() << 3);
            zzo((j2 >> 63) ^ (j2 + j2));
        } else if (ordinal == 2) {
            zzn((zzj.zza() << 3) | 1);
            this.zze.write(zzm(8).putLong(j2).array());
        }
        return this;
    }

    public final zzu zzf(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        e<?> eVar = this.zzf.get(obj.getClass());
        if (eVar != null) {
            eVar.encode(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        valueOf.length();
        throw new c("No encoder for ".concat(valueOf));
    }
}
