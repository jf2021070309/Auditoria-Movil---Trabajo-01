package com.fyber.inneractive.sdk.player.c.a;

import com.fyber.inneractive.sdk.player.c.a.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* loaded from: classes.dex */
public final class k implements c {
    long d;
    long e;
    private j h;
    private ByteBuffer i;
    private ShortBuffer j;
    private ByteBuffer k;
    private boolean l;
    float b = 1.0f;
    float c = 1.0f;
    private int f = -1;
    private int g = -1;

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final int c() {
        return 2;
    }

    public k() {
        ByteBuffer byteBuffer = a;
        this.i = byteBuffer;
        this.j = byteBuffer.asShortBuffer();
        this.k = a;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final boolean a(int i, int i2, int i3) throws c.a {
        if (i3 != 2) {
            throw new c.a(i, i2, i3);
        }
        if (this.g == i && this.f == i2) {
            return false;
        }
        this.g = i;
        this.f = i2;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final boolean a() {
        return Math.abs(this.b - 1.0f) >= 0.01f || Math.abs(this.c - 1.0f) >= 0.01f;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final int b() {
        return this.f;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.d += remaining;
            j jVar = this.h;
            int remaining2 = asShortBuffer.remaining() / jVar.a;
            jVar.a(remaining2);
            asShortBuffer.get(jVar.c, jVar.g * jVar.a, ((jVar.a * remaining2) * 2) / 2);
            jVar.g += remaining2;
            jVar.a();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i = this.h.h * this.f * 2;
        if (i > 0) {
            if (this.i.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.i = order;
                this.j = order.asShortBuffer();
            } else {
                this.i.clear();
                this.j.clear();
            }
            j jVar2 = this.h;
            ShortBuffer shortBuffer = this.j;
            int min = Math.min(shortBuffer.remaining() / jVar2.a, jVar2.h);
            shortBuffer.put(jVar2.d, 0, jVar2.a * min);
            jVar2.h -= min;
            System.arraycopy(jVar2.d, min * jVar2.a, jVar2.d, 0, jVar2.h * jVar2.a);
            this.e += i;
            this.i.limit(i);
            this.k = this.i;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final void d() {
        j jVar = this.h;
        int i = jVar.g;
        int i2 = jVar.h + ((int) ((((i / (jVar.e / jVar.f)) + jVar.i) / jVar.f) + 0.5f));
        jVar.a((jVar.b * 2) + i);
        for (int i3 = 0; i3 < jVar.b * 2 * jVar.a; i3++) {
            jVar.c[(jVar.a * i) + i3] = 0;
        }
        jVar.g += jVar.b * 2;
        jVar.a();
        if (jVar.h > i2) {
            jVar.h = i2;
        }
        jVar.g = 0;
        jVar.j = 0;
        jVar.i = 0;
        this.l = true;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final ByteBuffer e() {
        ByteBuffer byteBuffer = this.k;
        this.k = a;
        return byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final boolean f() {
        if (this.l) {
            j jVar = this.h;
            return jVar == null || jVar.h == 0;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final void g() {
        j jVar = new j(this.g, this.f);
        this.h = jVar;
        jVar.e = this.b;
        this.h.f = this.c;
        this.k = a;
        this.d = 0L;
        this.e = 0L;
        this.l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final void h() {
        this.h = null;
        ByteBuffer byteBuffer = a;
        this.i = byteBuffer;
        this.j = byteBuffer.asShortBuffer();
        this.k = a;
        this.f = -1;
        this.g = -1;
        this.d = 0L;
        this.e = 0L;
        this.l = false;
    }
}
