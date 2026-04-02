package com.amazon.aps.iva.rc;

import android.util.Log;
import com.amazon.aps.iva.lc.d;
import com.amazon.aps.iva.rc.o;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferFileLoader.java */
/* loaded from: classes.dex */
public final class c implements o<File, ByteBuffer> {
    @Override // com.amazon.aps.iva.rc.o
    public final o.a<ByteBuffer> buildLoadData(File file, int i, int i2, com.amazon.aps.iva.kc.h hVar) {
        File file2 = file;
        return new o.a<>(new com.amazon.aps.iva.gd.b(file2), new a(file2));
    }

    @Override // com.amazon.aps.iva.rc.o
    public final /* bridge */ /* synthetic */ boolean handles(File file) {
        return true;
    }

    /* compiled from: ByteBufferFileLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.lc.d<ByteBuffer> {
        public final File b;

        public a(File file) {
            this.b = file;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void d(com.amazon.aps.iva.ec.c cVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(com.amazon.aps.iva.hd.a.a(this.b));
            } catch (IOException e) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.c(e);
            }
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

    /* compiled from: ByteBufferFileLoader.java */
    /* loaded from: classes.dex */
    public static class b implements p<File, ByteBuffer> {
        @Override // com.amazon.aps.iva.rc.p
        public final o<File, ByteBuffer> build(s sVar) {
            return new c();
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }
}
