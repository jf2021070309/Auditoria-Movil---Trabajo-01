package com.amazon.aps.iva.b7;

import com.amazon.aps.iva.b7.e;
import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.u;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.a;
import com.amazon.aps.iva.x6.f0;
import java.util.Collections;
/* compiled from: AudioTagPayloadReader.java */
/* loaded from: classes.dex */
public final class a extends e {
    public static final int[] e = {5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;
    public int d;

    public final boolean a(v vVar) throws e.a {
        String str;
        if (!this.b) {
            int u = vVar.u();
            int i = (u >> 4) & 15;
            this.d = i;
            f0 f0Var = this.a;
            if (i == 2) {
                int i2 = e[(u >> 2) & 3];
                v.a aVar = new v.a();
                aVar.k = "audio/mpeg";
                aVar.x = 1;
                aVar.y = i2;
                f0Var.c(aVar.a());
                this.c = true;
            } else if (i != 7 && i != 8) {
                if (i != 10) {
                    throw new e.a("Audio format not supported: " + this.d);
                }
            } else {
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                v.a aVar2 = new v.a();
                aVar2.k = str;
                aVar2.x = 1;
                aVar2.y = 8000;
                f0Var.c(aVar2.a());
                this.c = true;
            }
            this.b = true;
        } else {
            vVar.G(1);
        }
        return true;
    }

    public final boolean b(long j, com.amazon.aps.iva.t5.v vVar) throws h0 {
        int i = this.d;
        f0 f0Var = this.a;
        if (i == 2) {
            int i2 = vVar.c - vVar.b;
            f0Var.a(i2, vVar);
            this.a.d(j, 1, i2, 0, null);
            return true;
        }
        int u = vVar.u();
        if (u == 0 && !this.c) {
            int i3 = vVar.c - vVar.b;
            byte[] bArr = new byte[i3];
            vVar.d(0, bArr, i3);
            a.C0844a b = com.amazon.aps.iva.x6.a.b(new u(bArr), false);
            v.a aVar = new v.a();
            aVar.k = "audio/mp4a-latm";
            aVar.h = b.c;
            aVar.x = b.b;
            aVar.y = b.a;
            aVar.m = Collections.singletonList(bArr);
            f0Var.c(new com.amazon.aps.iva.q5.v(aVar));
            this.c = true;
            return false;
        } else if (this.d == 10 && u != 1) {
            return false;
        } else {
            int i4 = vVar.c - vVar.b;
            f0Var.a(i4, vVar);
            this.a.d(j, 1, i4, 0, null);
            return true;
        }
    }
}
