package com.amazon.aps.iva.t5;

import android.opengl.GLES20;
import com.amazon.aps.iva.t5.k;
import java.util.HashMap;
/* compiled from: GlProgram.java */
/* loaded from: classes.dex */
public final class j {
    public final int a;
    public final a[] b;
    public final b[] c;
    public final HashMap d;
    public final HashMap e;

    /* compiled from: GlProgram.java */
    /* loaded from: classes.dex */
    public static final class a {
        public a(String str) {
        }
    }

    /* compiled from: GlProgram.java */
    /* loaded from: classes.dex */
    public static final class b {
        public b(String str) {
        }
    }

    public j(String str, String str2) throws k.a {
        boolean z;
        byte[] bArr;
        byte[] bArr2;
        int glCreateProgram = GLES20.glCreateProgram();
        this.a = glCreateProgram;
        k.b();
        a(glCreateProgram, 35633, str);
        a(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        int i = 1;
        if (iArr[0] == 1) {
            z = true;
        } else {
            z = false;
        }
        k.c("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), z);
        GLES20.glUseProgram(glCreateProgram);
        this.d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.b = new a[iArr2[0]];
        int i2 = 0;
        while (i2 < iArr2[0]) {
            int i3 = this.a;
            int[] iArr3 = new int[i];
            GLES20.glGetProgramiv(i3, 35722, iArr3, 0);
            int i4 = iArr3[0];
            byte[] bArr3 = new byte[i4];
            GLES20.glGetActiveAttrib(i3, i2, i4, new int[i], 0, new int[i], 0, new int[i], 0, bArr3, 0);
            int i5 = 0;
            while (true) {
                if (i5 < i4) {
                    bArr2 = bArr3;
                    if (bArr2[i5] == 0) {
                        break;
                    }
                    i5++;
                    bArr3 = bArr2;
                } else {
                    bArr2 = bArr3;
                    i5 = i4;
                    break;
                }
            }
            String str3 = new String(bArr2, 0, i5);
            GLES20.glGetAttribLocation(i3, str3);
            a aVar = new a(str3);
            this.b[i2] = aVar;
            this.d.put(str3, aVar);
            i2++;
            i = 1;
        }
        this.e = new HashMap();
        int i6 = 1;
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr4, 0);
        this.c = new b[iArr4[0]];
        int i7 = 0;
        while (i7 < iArr4[0]) {
            int i8 = this.a;
            int[] iArr5 = new int[i6];
            GLES20.glGetProgramiv(i8, 35719, iArr5, 0);
            int i9 = iArr5[0];
            byte[] bArr4 = new byte[i9];
            GLES20.glGetActiveUniform(i8, i7, i9, new int[i6], 0, new int[i6], 0, new int[i6], 0, bArr4, 0);
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    bArr = bArr4;
                    if (bArr[i10] == 0) {
                        break;
                    }
                    i10++;
                    bArr4 = bArr;
                } else {
                    bArr = bArr4;
                    i10 = i9;
                    break;
                }
            }
            String str4 = new String(bArr, 0, i10);
            GLES20.glGetUniformLocation(i8, str4);
            b bVar = new b(str4);
            this.c[i7] = bVar;
            this.e.put(str4, bVar);
            i7++;
            i6 = 1;
        }
        k.b();
    }

    public static void a(int i, int i2, String str) throws k.a {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z = true;
        }
        k.c(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str, z);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        k.b();
    }

    public final int b(String str) throws k.a {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.a, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        k.b();
        return glGetAttribLocation;
    }
}
