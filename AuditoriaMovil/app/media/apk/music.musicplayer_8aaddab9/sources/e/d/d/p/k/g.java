package e.d.d.p.k;

import ch.qos.logback.core.joran.action.Action;
import e.d.d.p.k.f;
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
/* loaded from: classes2.dex */
public final class g implements e.d.d.p.f {
    public static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final e.d.d.p.d f7552b;

    /* renamed from: c  reason: collision with root package name */
    public static final e.d.d.p.d f7553c;

    /* renamed from: d  reason: collision with root package name */
    public static final e.d.d.p.e<Map.Entry<Object, Object>> f7554d;

    /* renamed from: e  reason: collision with root package name */
    public OutputStream f7555e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, e.d.d.p.e<?>> f7556f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<Class<?>, e.d.d.p.g<?>> f7557g;

    /* renamed from: h  reason: collision with root package name */
    public final e.d.d.p.e<Object> f7558h;

    /* renamed from: i  reason: collision with root package name */
    public final i f7559i = new i(this);

    static {
        c cVar = new c(1, f.a.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(cVar.annotationType(), cVar);
        f7552b = new e.d.d.p.d(Action.KEY_ATTRIBUTE, hashMap == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap), null);
        c cVar2 = new c(2, f.a.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cVar2.annotationType(), cVar2);
        f7553c = new e.d.d.p.d("value", hashMap2 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap2), null);
        f7554d = new e.d.d.p.e() { // from class: e.d.d.p.k.a
            @Override // e.d.d.p.b
            public final void encode(Object obj, e.d.d.p.f fVar) {
                Map.Entry entry = (Map.Entry) obj;
                e.d.d.p.f fVar2 = fVar;
                fVar2.add(g.f7552b, entry.getKey());
                fVar2.add(g.f7553c, entry.getValue());
            }
        };
    }

    public g(OutputStream outputStream, Map<Class<?>, e.d.d.p.e<?>> map, Map<Class<?>, e.d.d.p.g<?>> map2, e.d.d.p.e<Object> eVar) {
        this.f7555e = outputStream;
        this.f7556f = map;
        this.f7557g = map2;
        this.f7558h = eVar;
    }

    public static ByteBuffer d(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static f f(e.d.d.p.d dVar) {
        f fVar = (f) ((Annotation) dVar.f7541b.get(f.class));
        if (fVar != null) {
            return fVar;
        }
        throw new e.d.d.p.c("Field has no @Protobuf config");
    }

    public static int g(e.d.d.p.d dVar) {
        f fVar = (f) ((Annotation) dVar.f7541b.get(f.class));
        if (fVar != null) {
            return ((c) fVar).a;
        }
        throw new e.d.d.p.c("Field has no @Protobuf config");
    }

    public e.d.d.p.f a(e.d.d.p.d dVar, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            h((g(dVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(a);
            h(bytes.length);
            this.f7555e.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                a(dVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                e(f7554d, dVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z || doubleValue != 0.0d) {
                h((g(dVar) << 3) | 1);
                this.f7555e.write(d(8).putDouble(doubleValue).array());
            }
            return this;
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z || floatValue != 0.0f) {
                h((g(dVar) << 3) | 5);
                this.f7555e.write(d(4).putFloat(floatValue).array());
            }
            return this;
        } else if (obj instanceof Number) {
            c(dVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            b(dVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            h((g(dVar) << 3) | 2);
            h(bArr.length);
            this.f7555e.write(bArr);
            return this;
        } else {
            e.d.d.p.e<?> eVar = this.f7556f.get(obj.getClass());
            if (eVar != null) {
                e(eVar, dVar, obj, z);
                return this;
            }
            e.d.d.p.g<?> gVar = this.f7557g.get(obj.getClass());
            if (gVar != null) {
                i iVar = this.f7559i;
                iVar.a = false;
                iVar.f7565c = dVar;
                iVar.f7564b = z;
                gVar.encode(obj, iVar);
                return this;
            } else if (obj instanceof e) {
                b(dVar, ((e) obj).getNumber(), true);
                return this;
            } else if (obj instanceof Enum) {
                b(dVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                e(this.f7558h, dVar, obj, z);
                return this;
            }
        }
    }

    @Override // e.d.d.p.f
    public e.d.d.p.f add(e.d.d.p.d dVar, int i2) throws IOException {
        b(dVar, i2, true);
        return this;
    }

    @Override // e.d.d.p.f
    public e.d.d.p.f add(e.d.d.p.d dVar, long j2) throws IOException {
        c(dVar, j2, true);
        return this;
    }

    @Override // e.d.d.p.f
    public e.d.d.p.f add(e.d.d.p.d dVar, Object obj) throws IOException {
        return a(dVar, obj, true);
    }

    @Override // e.d.d.p.f
    public e.d.d.p.f add(e.d.d.p.d dVar, boolean z) throws IOException {
        b(dVar, z ? 1 : 0, true);
        return this;
    }

    public g b(e.d.d.p.d dVar, int i2, boolean z) throws IOException {
        if (z && i2 == 0) {
            return this;
        }
        c cVar = (c) f(dVar);
        int ordinal = cVar.f7551b.ordinal();
        if (ordinal == 0) {
            h(cVar.a << 3);
            h(i2);
        } else if (ordinal == 1) {
            h(cVar.a << 3);
            h((i2 << 1) ^ (i2 >> 31));
        } else if (ordinal == 2) {
            h((cVar.a << 3) | 5);
            this.f7555e.write(d(4).putInt(i2).array());
        }
        return this;
    }

    public g c(e.d.d.p.d dVar, long j2, boolean z) throws IOException {
        if (z && j2 == 0) {
            return this;
        }
        c cVar = (c) f(dVar);
        int ordinal = cVar.f7551b.ordinal();
        if (ordinal == 0) {
            h(cVar.a << 3);
            i(j2);
        } else if (ordinal == 1) {
            h(cVar.a << 3);
            i((j2 >> 63) ^ (j2 << 1));
        } else if (ordinal == 2) {
            h((cVar.a << 3) | 1);
            this.f7555e.write(d(8).putLong(j2).array());
        }
        return this;
    }

    public final <T> g e(e.d.d.p.e<T> eVar, e.d.d.p.d dVar, T t, boolean z) throws IOException {
        d dVar2 = new d();
        try {
            OutputStream outputStream = this.f7555e;
            this.f7555e = dVar2;
            eVar.encode(t, this);
            this.f7555e = outputStream;
            long j2 = dVar2.a;
            dVar2.close();
            if (z && j2 == 0) {
                return this;
            }
            h((g(dVar) << 3) | 2);
            i(j2);
            eVar.encode(t, this);
            return this;
        } catch (Throwable th) {
            try {
                dVar2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.f7555e.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.f7555e.write(i2 & 127);
    }

    public final void i(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            this.f7555e.write((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        this.f7555e.write(((int) j2) & 127);
    }
}
