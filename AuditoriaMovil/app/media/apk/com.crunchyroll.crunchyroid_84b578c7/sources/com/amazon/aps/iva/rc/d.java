package com.amazon.aps.iva.rc;

import android.util.Base64;
import com.amazon.aps.iva.lc.d;
import com.amazon.aps.iva.rc.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: DataUrlLoader.java */
/* loaded from: classes.dex */
public final class d<Model, Data> implements o<Model, Data> {
    public final a<Data> a;

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public interface a<Data> {
    }

    public d(c.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a<Data> buildLoadData(Model model, int i, int i2, com.amazon.aps.iva.kc.h hVar) {
        return new o.a<>(new com.amazon.aps.iva.gd.b(model), new b(model.toString(), this.a));
    }

    @Override // com.amazon.aps.iva.rc.o
    public final boolean handles(Model model) {
        return model.toString().startsWith("data:image");
    }

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public static final class b<Data> implements com.amazon.aps.iva.lc.d<Data> {
        public final String b;
        public final a<Data> c;
        public ByteArrayInputStream d;

        public b(String str, a<Data> aVar) {
            this.b = str;
            this.c = aVar;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final Class<Data> a() {
            this.c.getClass();
            return InputStream.class;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void b() {
            try {
                a<Data> aVar = this.c;
                ByteArrayInputStream byteArrayInputStream = this.d;
                ((c.a) aVar).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void d(com.amazon.aps.iva.ec.c cVar, d.a<? super Data> aVar) {
            try {
                ByteArrayInputStream a = ((c.a) this.c).a(this.b);
                this.d = a;
                aVar.f(a);
            } catch (IllegalArgumentException e) {
                aVar.c(e);
            }
        }

        @Override // com.amazon.aps.iva.lc.d
        public final com.amazon.aps.iva.kc.a e() {
            return com.amazon.aps.iva.kc.a.LOCAL;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void cancel() {
        }
    }

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public static final class c<Model> implements p<Model, InputStream> {
        public final a a = new a();

        /* compiled from: DataUrlLoader.java */
        /* loaded from: classes.dex */
        public class a implements a<InputStream> {
            public final ByteArrayInputStream a(String str) throws IllegalArgumentException {
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

        @Override // com.amazon.aps.iva.rc.p
        public final o<Model, InputStream> build(s sVar) {
            return new d(this.a);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }
}
