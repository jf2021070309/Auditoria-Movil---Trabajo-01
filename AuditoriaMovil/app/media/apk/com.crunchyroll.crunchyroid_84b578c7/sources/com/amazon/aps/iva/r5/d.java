package com.amazon.aps.iva.r5;

import com.amazon.aps.iva.r5.b;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: BaseAudioProcessor.java */
/* loaded from: classes.dex */
public abstract class d implements b {
    public b.a b;
    public b.a c;
    public b.a d;
    public b.a e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public d() {
        ByteBuffer byteBuffer = b.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        b.a aVar = b.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.r5.b
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = b.a;
        return byteBuffer;
    }

    @Override // com.amazon.aps.iva.r5.b
    @CanIgnoreReturnValue
    public final b.a b(b.a aVar) throws b.C0666b {
        this.d = aVar;
        this.e = f(aVar);
        if (isActive()) {
            return this.e;
        }
        return b.a.e;
    }

    @Override // com.amazon.aps.iva.r5.b
    public boolean d() {
        if (this.h && this.g == b.a) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.r5.b
    public final void e() {
        this.h = true;
        h();
    }

    @CanIgnoreReturnValue
    public abstract b.a f(b.a aVar) throws b.C0666b;

    @Override // com.amazon.aps.iva.r5.b
    public final void flush() {
        this.g = b.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        g();
    }

    @Override // com.amazon.aps.iva.r5.b
    public boolean isActive() {
        if (this.e != b.a.e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer j(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.amazon.aps.iva.r5.b
    public final void reset() {
        flush();
        this.f = b.a;
        b.a aVar = b.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
