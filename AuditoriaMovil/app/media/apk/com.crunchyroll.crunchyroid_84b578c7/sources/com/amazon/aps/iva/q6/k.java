package com.amazon.aps.iva.q6;

import com.amazon.aps.iva.h6.g;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.g0;
import java.io.IOException;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;
/* compiled from: DataChunk.java */
/* loaded from: classes.dex */
public abstract class k extends e {
    public byte[] j;
    public volatile boolean k;

    public k(com.amazon.aps.iva.w5.f fVar, com.amazon.aps.iva.w5.i iVar, v vVar, int i, Object obj, byte[] bArr) {
        super(fVar, iVar, 3, vVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        k kVar;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = g0.e;
            kVar = this;
        } else {
            kVar = this;
            bArr2 = bArr;
        }
        kVar.j = bArr2;
    }

    @Override // com.amazon.aps.iva.t6.k.d
    public final void a() throws IOException {
        try {
            this.i.b(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                byte[] bArr = this.j;
                if (bArr.length < i2 + Http2.INITIAL_MAX_FRAME_SIZE) {
                    this.j = Arrays.copyOf(bArr, bArr.length + Http2.INITIAL_MAX_FRAME_SIZE);
                }
                i = this.i.l(this.j, i2, Http2.INITIAL_MAX_FRAME_SIZE);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                ((g.a) this).l = Arrays.copyOf(this.j, i2);
            }
        } finally {
            com.amazon.aps.iva.n1.c.g(this.i);
        }
    }

    @Override // com.amazon.aps.iva.t6.k.d
    public final void b() {
        this.k = true;
    }
}
