package com.fyber.inneractive.sdk.player.c.d;

import com.fyber.inneractive.sdk.player.c.d.f.p;
import com.fyber.inneractive.sdk.player.c.d.f.u;
import java.lang.reflect.Constructor;
/* loaded from: classes.dex */
public final class c implements i {
    private static final Constructor<? extends f> a;
    private int b;
    private int c;
    private int d;
    private int e = 1;
    private int f;

    static {
        Constructor<? extends f> constructor;
        try {
            constructor = Class.forName("com.fyber.inneractive.sdk.player.exoplayer2.ext.flac.FlacExtractor").asSubclass(f.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            constructor = null;
        }
        a = constructor;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.i
    public final synchronized f[] a() {
        f[] fVarArr;
        fVarArr = new f[a == null ? 11 : 12];
        fVarArr[0] = new com.fyber.inneractive.sdk.player.c.d.b.d(this.b);
        fVarArr[1] = new com.fyber.inneractive.sdk.player.c.d.d.e(this.c);
        fVarArr[2] = new com.fyber.inneractive.sdk.player.c.d.d.g();
        fVarArr[3] = new com.fyber.inneractive.sdk.player.c.d.c.b(this.d);
        fVarArr[4] = new com.fyber.inneractive.sdk.player.c.d.f.c();
        fVarArr[5] = new com.fyber.inneractive.sdk.player.c.d.f.a();
        fVarArr[6] = new u(this.e, this.f);
        fVarArr[7] = new com.fyber.inneractive.sdk.player.c.d.a.b();
        fVarArr[8] = new com.fyber.inneractive.sdk.player.c.d.e.c();
        fVarArr[9] = new p();
        fVarArr[10] = new com.fyber.inneractive.sdk.player.c.d.g.a();
        if (a != null) {
            try {
                fVarArr[11] = a.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return fVarArr;
    }
}
