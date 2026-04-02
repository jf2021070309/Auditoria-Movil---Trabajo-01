package com.amazon.aps.iva.vc;

import com.bumptech.glide.load.data.a;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferRewinder.java */
/* loaded from: classes.dex */
public final class a implements com.bumptech.glide.load.data.a<ByteBuffer> {
    public final ByteBuffer a;

    /* compiled from: ByteBufferRewinder.java */
    /* renamed from: com.amazon.aps.iva.vc.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0795a implements a.InterfaceC0945a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0945a
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0945a
        public final com.bumptech.glide.load.data.a<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.a
    public final ByteBuffer a() throws IOException {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.a
    public final void b() {
    }
}
