package com.amazon.aps.iva.w6;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.a0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.k;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.w6.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: SceneRenderer.java */
/* loaded from: classes.dex */
public final class i implements com.amazon.aps.iva.v6.g, a {
    public int j;
    public SurfaceTexture k;
    public byte[] n;
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicBoolean c = new AtomicBoolean(true);
    public final g d = new g();
    public final c e = new c();
    public final a0<Long> f = new a0<>();
    public final a0<e> g = new a0<>();
    public final float[] h = new float[16];
    public final float[] i = new float[16];
    public volatile int l = 0;
    public int m = -1;

    public final SurfaceTexture a() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            com.amazon.aps.iva.t5.k.b();
            this.d.a();
            com.amazon.aps.iva.t5.k.b();
            com.amazon.aps.iva.t5.k.c("No current context", !g0.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            com.amazon.aps.iva.t5.k.b();
            int i = iArr[0];
            com.amazon.aps.iva.t5.k.a(36197, i);
            this.j = i;
        } catch (k.a e) {
            p.d("Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.j);
        this.k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.amazon.aps.iva.w6.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.this.b.set(true);
            }
        });
        return this.k;
    }

    @Override // com.amazon.aps.iva.w6.a
    public final void b(float[] fArr, long j) {
        this.e.c.a(j, fArr);
    }

    @Override // com.amazon.aps.iva.v6.g
    public final void c(long j, long j2, v vVar, MediaFormat mediaFormat) {
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        ArrayList<e.a> arrayList;
        boolean z;
        this.f.a(j2, Long.valueOf(j));
        byte[] bArr = vVar.w;
        int i4 = vVar.x;
        byte[] bArr2 = this.n;
        int i5 = this.m;
        this.n = bArr;
        if (i4 == -1) {
            i4 = this.l;
        }
        this.m = i4;
        if (i5 != i4 || !Arrays.equals(bArr2, this.n)) {
            byte[] bArr3 = this.n;
            e eVar = null;
            if (bArr3 != null) {
                int i6 = this.m;
                com.amazon.aps.iva.t5.v vVar2 = new com.amazon.aps.iva.t5.v(bArr3);
                try {
                    vVar2.G(4);
                    int e = vVar2.e();
                    vVar2.F(0);
                    if (e == 1886547818) {
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                if (z) {
                    vVar2.G(8);
                    int i7 = vVar2.b;
                    int i8 = vVar2.c;
                    while (i7 < i8) {
                        int e2 = vVar2.e() + i7;
                        if (e2 <= i7 || e2 > i8) {
                            break;
                        }
                        int e3 = vVar2.e();
                        if (e3 != 2037673328 && e3 != 1836279920) {
                            vVar2.F(e2);
                            i7 = e2;
                        }
                        vVar2.E(e2);
                        arrayList = f.a(vVar2);
                        break;
                    }
                    arrayList = null;
                } else {
                    arrayList = f.a(vVar2);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    if (size != 1) {
                        if (size == 2) {
                            eVar = new e(arrayList.get(0), arrayList.get(1), i6);
                        }
                    } else {
                        e.a aVar = arrayList.get(0);
                        eVar = new e(aVar, aVar, i6);
                    }
                }
            }
            if (eVar == null || !g.b(eVar)) {
                int i9 = this.m;
                float radians = (float) Math.toRadians(180.0f);
                float radians2 = (float) Math.toRadians(360.0f);
                float f3 = radians / 36;
                float f4 = radians2 / 72;
                float[] fArr = new float[15984];
                float[] fArr2 = new float[10656];
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 36; i10 < i13; i13 = 36) {
                    float f5 = radians / 2.0f;
                    float f6 = (i10 * f3) - f5;
                    int i14 = i10 + 1;
                    float f7 = (i14 * f3) - f5;
                    int i15 = 0;
                    while (i15 < 73) {
                        int i16 = i14;
                        int i17 = 0;
                        int i18 = 2;
                        while (i17 < i18) {
                            if (i17 == 0) {
                                f2 = f7;
                                f = f6;
                            } else {
                                f = f7;
                                f2 = f;
                            }
                            float f8 = i15 * f4;
                            float f9 = f6;
                            int i19 = i11 + 1;
                            float f10 = f4;
                            double d = 50.0f;
                            int i20 = i15;
                            double d2 = (f8 + 3.1415927f) - (radians2 / 2.0f);
                            float f11 = f3;
                            double d3 = f;
                            int i21 = i9;
                            int i22 = i17;
                            fArr[i11] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                            int i23 = i19 + 1;
                            fArr[i19] = (float) (Math.sin(d3) * d);
                            int i24 = i23 + 1;
                            fArr[i23] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                            int i25 = i12 + 1;
                            fArr2[i12] = f8 / radians2;
                            int i26 = i25 + 1;
                            fArr2[i25] = ((i10 + i22) * f11) / radians;
                            if (i20 == 0 && i22 == 0) {
                                i = i20;
                                i2 = i22;
                            } else {
                                i = i20;
                                i2 = i22;
                                if (i != 72 || i2 != 1) {
                                    i3 = 2;
                                    i12 = i26;
                                    i11 = i24;
                                    i17 = i2 + 1;
                                    i15 = i;
                                    i18 = i3;
                                    f7 = f2;
                                    f4 = f10;
                                    f6 = f9;
                                    f3 = f11;
                                    i9 = i21;
                                }
                            }
                            System.arraycopy(fArr, i24 - 3, fArr, i24, 3);
                            i24 += 3;
                            i3 = 2;
                            System.arraycopy(fArr2, i26 - 2, fArr2, i26, 2);
                            i26 += 2;
                            i12 = i26;
                            i11 = i24;
                            i17 = i2 + 1;
                            i15 = i;
                            i18 = i3;
                            f7 = f2;
                            f4 = f10;
                            f6 = f9;
                            f3 = f11;
                            i9 = i21;
                        }
                        i15++;
                        i14 = i16;
                        f6 = f6;
                        i9 = i9;
                    }
                    i10 = i14;
                }
                e.a aVar2 = new e.a(new e.b(0, 1, fArr, fArr2));
                eVar = new e(aVar2, aVar2, i9);
            }
            this.g.a(j2, eVar);
        }
    }

    @Override // com.amazon.aps.iva.w6.a
    public final void e() {
        this.f.b();
        c cVar = this.e;
        cVar.c.b();
        cVar.d = false;
        this.c.set(true);
    }
}
