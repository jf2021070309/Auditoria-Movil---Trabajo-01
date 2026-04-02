package com.amazon.aps.iva.a8;

import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.i;
import java.io.IOException;
/* compiled from: WavHeaderReader.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: WavHeaderReader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(i iVar, v vVar) throws IOException {
            iVar.c(vVar.a, 0, 8, false);
            vVar.F(0);
            return new a(vVar.e(), vVar.k());
        }
    }

    public static boolean a(i iVar) throws IOException {
        v vVar = new v(8);
        int i = a.a(iVar, vVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        iVar.c(vVar.a, 0, 4, false);
        vVar.F(0);
        if (vVar.e() != 1463899717) {
            p.c();
            return false;
        }
        return true;
    }

    public static a b(int i, i iVar, v vVar) throws IOException {
        a a2 = a.a(iVar, vVar);
        while (true) {
            int i2 = a2.a;
            if (i2 != i) {
                p.g();
                long j = a2.b + 8;
                if (j <= 2147483647L) {
                    iVar.k((int) j);
                    a2 = a.a(iVar, vVar);
                } else {
                    throw h0.c("Chunk is too large (~2GB+) to skip; id: " + i2);
                }
            } else {
                return a2;
            }
        }
    }
}
