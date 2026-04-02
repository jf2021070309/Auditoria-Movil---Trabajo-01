package e.d.d.p.j;

import android.util.Base64;
import android.util.JsonWriter;
import e.d.d.p.g;
import e.d.d.p.h;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
/* loaded from: classes2.dex */
public final class f implements e.d.d.p.f, h {
    public boolean a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f7546b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, e.d.d.p.e<?>> f7547c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, g<?>> f7548d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.d.p.e<Object> f7549e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7550f;

    public f(Writer writer, Map<Class<?>, e.d.d.p.e<?>> map, Map<Class<?>, g<?>> map2, e.d.d.p.e<Object> eVar, boolean z) {
        this.f7546b = new JsonWriter(writer);
        this.f7547c = map;
        this.f7548d = map2;
        this.f7549e = eVar;
        this.f7550f = z;
    }

    public f a(Object obj, boolean z) throws IOException {
        int[] iArr;
        int i2 = 0;
        if (z) {
            if (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number)) {
                Object[] objArr = new Object[1];
                objArr[0] = obj == null ? null : obj.getClass();
                throw new e.d.d.p.c(String.format("%s cannot be encoded inline", objArr));
            }
        }
        if (obj == null) {
            this.f7546b.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f7546b.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                c();
                this.f7546b.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            } else {
                this.f7546b.beginArray();
                if (obj instanceof int[]) {
                    int length = ((int[]) obj).length;
                    while (i2 < length) {
                        this.f7546b.value(iArr[i2]);
                        i2++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i2 < length2) {
                        long j2 = jArr[i2];
                        c();
                        this.f7546b.value(j2);
                        i2++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i2 < length3) {
                        this.f7546b.value(dArr[i2]);
                        i2++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i2 < length4) {
                        this.f7546b.value(zArr[i2]);
                        i2++;
                    }
                } else if (obj instanceof Number[]) {
                    for (Number number : (Number[]) obj) {
                        a(number, false);
                    }
                } else {
                    for (Object obj2 : (Object[]) obj) {
                        a(obj2, false);
                    }
                }
                this.f7546b.endArray();
                return this;
            }
        } else if (obj instanceof Collection) {
            this.f7546b.beginArray();
            for (Object obj3 : (Collection) obj) {
                a(obj3, false);
            }
            this.f7546b.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f7546b.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    b((String) key, entry.getValue());
                } catch (ClassCastException e2) {
                    throw new e.d.d.p.c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                }
            }
            this.f7546b.endObject();
            return this;
        } else {
            e.d.d.p.e<?> eVar = this.f7547c.get(obj.getClass());
            if (eVar != null) {
                if (!z) {
                    this.f7546b.beginObject();
                }
                eVar.encode(obj, this);
                if (!z) {
                    this.f7546b.endObject();
                }
                return this;
            }
            g<?> gVar = this.f7548d.get(obj.getClass());
            if (gVar != null) {
                gVar.encode(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                c();
                this.f7546b.value(name);
                return this;
            } else {
                e.d.d.p.e<Object> eVar2 = this.f7549e;
                if (!z) {
                    this.f7546b.beginObject();
                }
                eVar2.encode(obj, this);
                if (!z) {
                    this.f7546b.endObject();
                }
                return this;
            }
        }
    }

    @Override // e.d.d.p.f
    public e.d.d.p.f add(e.d.d.p.d dVar, int i2) throws IOException {
        String str = dVar.a;
        c();
        this.f7546b.name(str);
        c();
        this.f7546b.value(i2);
        return this;
    }

    @Override // e.d.d.p.f
    public e.d.d.p.f add(e.d.d.p.d dVar, long j2) throws IOException {
        String str = dVar.a;
        c();
        this.f7546b.name(str);
        c();
        this.f7546b.value(j2);
        return this;
    }

    @Override // e.d.d.p.f
    public e.d.d.p.f add(e.d.d.p.d dVar, Object obj) throws IOException {
        return b(dVar.a, obj);
    }

    @Override // e.d.d.p.f
    public e.d.d.p.f add(e.d.d.p.d dVar, boolean z) throws IOException {
        String str = dVar.a;
        c();
        this.f7546b.name(str);
        c();
        this.f7546b.value(z);
        return this;
    }

    @Override // e.d.d.p.h
    public h add(String str) throws IOException {
        c();
        this.f7546b.value(str);
        return this;
    }

    @Override // e.d.d.p.h
    public h add(boolean z) throws IOException {
        c();
        this.f7546b.value(z);
        return this;
    }

    public f b(String str, Object obj) throws IOException {
        if (this.f7550f) {
            if (obj == null) {
                return this;
            }
            c();
            this.f7546b.name(str);
            return a(obj, false);
        }
        c();
        this.f7546b.name(str);
        if (obj == null) {
            this.f7546b.nullValue();
            return this;
        }
        return a(obj, false);
    }

    public final void c() throws IOException {
        if (!this.a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
