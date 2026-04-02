package com.amazon.aps.iva.rc;

import com.amazon.aps.iva.lc.d;
import com.amazon.aps.iva.rc.o;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: ByteArrayLoader.java */
/* loaded from: classes.dex */
public final class b<Data> implements o<byte[], Data> {
    public final InterfaceC0674b<Data> a;

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: com.amazon.aps.iva.rc.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0674b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public b(InterfaceC0674b<Data> interfaceC0674b) {
        this.a = interfaceC0674b;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a buildLoadData(byte[] bArr, int i, int i2, com.amazon.aps.iva.kc.h hVar) {
        byte[] bArr2 = bArr;
        return new o.a(new com.amazon.aps.iva.gd.b(bArr2), new c(bArr2, this.a));
    }

    @Override // com.amazon.aps.iva.rc.o
    public final /* bridge */ /* synthetic */ boolean handles(byte[] bArr) {
        return true;
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class a implements p<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: com.amazon.aps.iva.rc.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0673a implements InterfaceC0674b<ByteBuffer> {
            @Override // com.amazon.aps.iva.rc.b.InterfaceC0674b
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // com.amazon.aps.iva.rc.b.InterfaceC0674b
            public final ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<byte[], ByteBuffer> build(s sVar) {
            return new b(new C0673a());
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class c<Data> implements com.amazon.aps.iva.lc.d<Data> {
        public final byte[] b;
        public final InterfaceC0674b<Data> c;

        public c(byte[] bArr, InterfaceC0674b<Data> interfaceC0674b) {
            this.b = bArr;
            this.c = interfaceC0674b;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final Class<Data> a() {
            return this.c.a();
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void d(com.amazon.aps.iva.ec.c cVar, d.a<? super Data> aVar) {
            aVar.f((Data) this.c.b(this.b));
        }

        @Override // com.amazon.aps.iva.lc.d
        public final com.amazon.aps.iva.kc.a e() {
            return com.amazon.aps.iva.kc.a.LOCAL;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void b() {
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void cancel() {
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class d implements p<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        /* loaded from: classes.dex */
        public class a implements InterfaceC0674b<InputStream> {
            @Override // com.amazon.aps.iva.rc.b.InterfaceC0674b
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.amazon.aps.iva.rc.b.InterfaceC0674b
            public final InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<byte[], InputStream> build(s sVar) {
            return new b(new a());
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }
}
