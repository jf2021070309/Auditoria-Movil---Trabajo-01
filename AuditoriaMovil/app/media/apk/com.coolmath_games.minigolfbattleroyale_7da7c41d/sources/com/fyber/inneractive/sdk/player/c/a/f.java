package com.fyber.inneractive.sdk.player.c.a;

import com.fyber.inneractive.sdk.player.c.a.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* loaded from: classes.dex */
final class f implements c {
    int[] b;
    private boolean e;
    private int[] f;
    private boolean i;
    private ByteBuffer g = a;
    private ByteBuffer h = a;
    private int c = -1;
    private int d = -1;

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final int c() {
        return 2;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final boolean a(int i, int i2, int i3) throws c.a {
        boolean z = !Arrays.equals(this.b, this.f);
        int[] iArr = this.b;
        this.f = iArr;
        if (iArr == null) {
            this.e = false;
            return z;
        } else if (i3 != 2) {
            throw new c.a(i, i2, i3);
        } else {
            if (!z && this.d == i && this.c == i2) {
                return false;
            }
            this.d = i;
            this.c = i2;
            this.e = i2 != this.f.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 >= i2) {
                    throw new c.a(i, i2, i3);
                }
                this.e = (i5 != i4) | this.e;
                i4++;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final boolean a() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final int b() {
        int[] iArr = this.f;
        return iArr == null ? this.c : iArr.length;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.c * 2)) * this.f.length * 2;
        if (this.g.capacity() < length) {
            this.g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        while (position < limit) {
            for (int i : this.f) {
                this.g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.c * 2;
        }
        byteBuffer.position(limit);
        this.g.flip();
        this.h = this.g;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final void d() {
        this.i = true;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final ByteBuffer e() {
        ByteBuffer byteBuffer = this.h;
        this.h = a;
        return byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final boolean f() {
        return this.i && this.h == a;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final void g() {
        this.h = a;
        this.i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a.c
    public final void h() {
        g();
        this.g = a;
        this.c = -1;
        this.d = -1;
        this.f = null;
        this.e = false;
    }
}
