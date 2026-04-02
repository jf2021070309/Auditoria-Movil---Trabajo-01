package com.amazon.aps.iva.od0;

import com.amazon.aps.iva.od0.p;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
/* compiled from: AbstractMessageLite.java */
/* loaded from: classes4.dex */
public abstract class a implements p {

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: com.amazon.aps.iva.od0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0569a<BuilderType extends AbstractC0569a> implements p.a {
        @Override // com.amazon.aps.iva.od0.p.a
        /* renamed from: b */
        public abstract BuilderType D(d dVar, f fVar) throws IOException;

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: com.amazon.aps.iva.od0.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0570a extends FilterInputStream {
            public int b;

            public C0570a(ByteArrayInputStream byteArrayInputStream, int i) {
                super(byteArrayInputStream);
                this.b = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() throws IOException {
                return Math.min(super.available(), this.b);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.b <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.b--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, this.b));
                if (skip >= 0) {
                    this.b = (int) (this.b - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.b;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.b -= read;
                }
                return read;
            }
        }
    }
}
