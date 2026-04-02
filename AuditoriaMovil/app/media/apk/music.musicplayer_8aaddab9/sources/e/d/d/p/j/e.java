package e.d.d.p.j;

import e.d.d.p.g;
import e.d.d.p.h;
import e.d.d.p.j.e;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public final class e implements e.d.d.p.i.b<e> {
    public static final a a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, e.d.d.p.e<?>> f7542b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, g<?>> f7543c;

    /* renamed from: d  reason: collision with root package name */
    public e.d.d.p.e<Object> f7544d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7545e;

    /* loaded from: classes2.dex */
    public static final class a implements g<Date> {
        public static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public a(d dVar) {
        }

        @Override // e.d.d.p.b
        public void encode(Object obj, h hVar) throws IOException {
            hVar.add(a.format((Date) obj));
        }
    }

    public e() {
        HashMap hashMap = new HashMap();
        this.f7542b = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f7543c = hashMap2;
        this.f7544d = new e.d.d.p.e() { // from class: e.d.d.p.j.a
            @Override // e.d.d.p.b
            public final void encode(Object obj, e.d.d.p.f fVar) {
                e.a aVar = e.a;
                StringBuilder y = e.a.d.a.a.y("Couldn't find encoder for type ");
                y.append(obj.getClass().getCanonicalName());
                throw new e.d.d.p.c(y.toString());
            }
        };
        this.f7545e = false;
        hashMap2.put(String.class, new g() { // from class: e.d.d.p.j.b
            @Override // e.d.d.p.b
            public final void encode(Object obj, h hVar) {
                e.a aVar = e.a;
                hVar.add((String) obj);
            }
        });
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, new g() { // from class: e.d.d.p.j.c
            @Override // e.d.d.p.b
            public final void encode(Object obj, h hVar) {
                e.a aVar = e.a;
                hVar.add(((Boolean) obj).booleanValue());
            }
        });
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, a);
        hashMap.remove(Date.class);
    }

    @Override // e.d.d.p.i.b
    public e registerEncoder(Class cls, e.d.d.p.e eVar) {
        this.f7542b.put(cls, eVar);
        this.f7543c.remove(cls);
        return this;
    }
}
