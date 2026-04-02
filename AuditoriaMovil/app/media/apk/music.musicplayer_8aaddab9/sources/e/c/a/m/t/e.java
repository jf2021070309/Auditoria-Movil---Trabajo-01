package e.c.a.m.t;

import android.util.Base64;
import e.c.a.m.r.d;
import e.c.a.m.t.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* loaded from: classes.dex */
public final class e<Model, Data> implements n<Model, Data> {
    public final a<Data> a;

    /* loaded from: classes.dex */
    public interface a<Data> {
    }

    /* loaded from: classes.dex */
    public static final class b<Data> implements e.c.a.m.r.d<Data> {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final a<Data> f5785b;

        /* renamed from: c  reason: collision with root package name */
        public Data f5786c;

        public b(String str, a<Data> aVar) {
            this.a = str;
            this.f5785b = aVar;
        }

        @Override // e.c.a.m.r.d
        public Class<Data> a() {
            Objects.requireNonNull((c.a) this.f5785b);
            return InputStream.class;
        }

        @Override // e.c.a.m.r.d
        public void b() {
            try {
                a<Data> aVar = this.f5785b;
                Data data = this.f5786c;
                Objects.requireNonNull((c.a) aVar);
                ((InputStream) data).close();
            } catch (IOException unused) {
            }
        }

        @Override // e.c.a.m.r.d
        public void cancel() {
        }

        @Override // e.c.a.m.r.d
        public e.c.a.m.a d() {
            return e.c.a.m.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, Data] */
        @Override // e.c.a.m.r.d
        public void e(e.c.a.f fVar, d.a<? super Data> aVar) {
            try {
                ?? r2 = (Data) ((c.a) this.f5785b).a(this.a);
                this.f5786c = r2;
                aVar.f(r2);
            } catch (IllegalArgumentException e2) {
                aVar.c(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c<Model> implements o<Model, InputStream> {
        public final a<InputStream> a = new a(this);

        /* loaded from: classes.dex */
        public class a implements a<InputStream> {
            public a(c cVar) {
            }

            public Object a(String str) throws IllegalArgumentException {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // e.c.a.m.t.o
        public n<Model, InputStream> b(r rVar) {
            return new e(this.a);
        }
    }

    public e(a<Data> aVar) {
        this.a = aVar;
    }

    @Override // e.c.a.m.t.n
    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // e.c.a.m.t.n
    public n.a<Data> b(Model model, int i2, int i3, e.c.a.m.m mVar) {
        return new n.a<>(new e.c.a.r.b(model), new b(model.toString(), this.a));
    }
}
