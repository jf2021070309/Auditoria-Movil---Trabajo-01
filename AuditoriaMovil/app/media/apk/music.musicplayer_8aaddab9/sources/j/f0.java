package j;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class f0 implements Closeable {
    @Nullable
    public Reader a;

    /* loaded from: classes.dex */
    public static final class a extends Reader {
        public final k.g a;

        /* renamed from: b  reason: collision with root package name */
        public final Charset f9234b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f9235c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public Reader f9236d;

        public a(k.g gVar, Charset charset) {
            this.a = gVar;
            this.f9234b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f9235c = true;
            Reader reader = this.f9236d;
            if (reader != null) {
                reader.close();
            } else {
                this.a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) throws IOException {
            if (this.f9235c) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f9236d;
            if (reader == null) {
                k.g gVar = this.a;
                Charset charset = this.f9234b;
                k.h hVar = j.i0.c.f9271d;
                if (gVar.C(0L, hVar)) {
                    gVar.skip(hVar.i());
                    charset = j.i0.c.f9276i;
                } else {
                    k.h hVar2 = j.i0.c.f9272e;
                    if (gVar.C(0L, hVar2)) {
                        gVar.skip(hVar2.i());
                        charset = j.i0.c.f9277j;
                    } else {
                        k.h hVar3 = j.i0.c.f9273f;
                        if (gVar.C(0L, hVar3)) {
                            gVar.skip(hVar3.i());
                            charset = j.i0.c.f9278k;
                        } else {
                            k.h hVar4 = j.i0.c.f9274g;
                            if (gVar.C(0L, hVar4)) {
                                gVar.skip(hVar4.i());
                                charset = j.i0.c.f9279l;
                            } else {
                                k.h hVar5 = j.i0.c.f9275h;
                                if (gVar.C(0L, hVar5)) {
                                    gVar.skip(hVar5.i());
                                    charset = j.i0.c.f9280m;
                                }
                            }
                        }
                    }
                }
                reader = new InputStreamReader(this.a.c0(), charset);
                this.f9236d = reader;
            }
            return reader.read(cArr, i2, i3);
        }
    }

    public abstract long a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j.i0.c.e(h());
    }

    @Nullable
    public abstract u f();

    public abstract k.g h();
}
