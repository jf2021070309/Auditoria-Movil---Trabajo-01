package com.fyber.inneractive.sdk.util;

import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Array;
/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(android.content.Context r8, android.graphics.Bitmap r9, com.fyber.inneractive.sdk.util.b r10) {
        /*
            int r0 = r10.a
            int r1 = r10.d
            int r0 = r0 / r1
            int r1 = r10.b
            int r2 = r10.d
            int r1 = r1 / r2
            r2 = 2
            int[] r3 = new int[r2]
            r4 = 0
            r3[r4] = r0
            r5 = 1
            r3[r5] = r1
            r6 = r4
        L14:
            if (r6 >= r2) goto L1f
            r7 = r3[r6]
            if (r7 != 0) goto L1c
            r4 = r5
            goto L1f
        L1c:
            int r6 = r6 + 1
            goto L14
        L1f:
            if (r4 == 0) goto L23
            r8 = 0
            return r8
        L23:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            int r2 = r10.d
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3 / r2
            int r4 = r10.d
            float r4 = (float) r4
            float r3 = r3 / r4
            r1.scale(r2, r3)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r3 = 3
            r2.setFlags(r3)
            android.graphics.PorterDuffColorFilter r3 = new android.graphics.PorterDuffColorFilter
            int r4 = r10.e
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r3.<init>(r4, r6)
            r2.setColorFilter(r3)
            r3 = 0
            r1.drawBitmap(r9, r3, r3, r2)
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r9 < r1) goto L62
            int r9 = r10.c     // Catch: android.renderscript.RSRuntimeException -> L62
            android.graphics.Bitmap r8 = a(r8, r0, r9)     // Catch: android.renderscript.RSRuntimeException -> L62
            goto L68
        L62:
            int r8 = r10.c
            android.graphics.Bitmap r8 = a(r0, r8)
        L68:
            int r9 = r10.d
            if (r9 != r5) goto L6d
            return r8
        L6d:
            int r9 = r10.a
            int r10 = r10.b
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createScaledBitmap(r8, r9, r10, r5)
            r8.recycle()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.a.a(android.content.Context, android.graphics.Bitmap, com.fyber.inneractive.sdk.util.b):android.graphics.Bitmap");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap a(android.content.Context r5, android.graphics.Bitmap r6, int r7) throws android.renderscript.RSRuntimeException {
        /*
            r0 = 0
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r5)     // Catch: java.lang.Throwable -> L54
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch: java.lang.Throwable -> L4e
            r1.<init>()     // Catch: java.lang.Throwable -> L4e
            r5.setMessageHandler(r1)     // Catch: java.lang.Throwable -> L4e
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Throwable -> L4e
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r5, r6, r1, r2)     // Catch: java.lang.Throwable -> L4e
            android.renderscript.Type r2 = r1.getType()     // Catch: java.lang.Throwable -> L4b
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r5, r2)     // Catch: java.lang.Throwable -> L4b
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r5)     // Catch: java.lang.Throwable -> L46
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r5, r3)     // Catch: java.lang.Throwable -> L46
            r0.setInput(r1)     // Catch: java.lang.Throwable -> L46
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L46
            r0.setRadius(r7)     // Catch: java.lang.Throwable -> L46
            r0.forEach(r2)     // Catch: java.lang.Throwable -> L46
            r2.copyTo(r6)     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L36
            r5.destroy()
        L36:
            if (r1 == 0) goto L3b
            r1.destroy()
        L3b:
            if (r2 == 0) goto L40
            r2.destroy()
        L40:
            if (r0 == 0) goto L45
            r0.destroy()
        L45:
            return r6
        L46:
            r6 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L58
        L4b:
            r6 = move-exception
            r2 = r0
            goto L51
        L4e:
            r6 = move-exception
            r1 = r0
            r2 = r1
        L51:
            r0 = r5
            r5 = r2
            goto L58
        L54:
            r6 = move-exception
            r5 = r0
            r1 = r5
            r2 = r1
        L58:
            if (r0 == 0) goto L5d
            r0.destroy()
        L5d:
            if (r1 == 0) goto L62
            r1.destroy()
        L62:
            if (r2 == 0) goto L67
            r2.destroy()
        L67:
            if (r5 == 0) goto L6c
            r5.destroy()
        L6c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.a.a(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    private static Bitmap a(Bitmap bitmap, int i) {
        int[] iArr;
        int i2 = i;
        if (i2 <= 0) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i7 = (i6 + 1) >> 1;
        int i8 = i7 * i7;
        int i9 = i8 * 256;
        int[] iArr7 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr7[i10] = i10 / i8;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(int.class, i6, 3);
        int i11 = i2 + 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < height) {
            int i15 = -i2;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i15 <= i2) {
                int i25 = i5;
                int i26 = height;
                int i27 = iArr2[i13 + Math.min(i4, Math.max(i15, 0))];
                int[] iArr9 = iArr8[i15 + i2];
                iArr9[0] = (i27 & 16711680) >> 16;
                iArr9[1] = (i27 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr9[2] = i27 & 255;
                int abs = i11 - Math.abs(i15);
                i16 += iArr9[0] * abs;
                i17 += iArr9[1] * abs;
                i18 += iArr9[2] * abs;
                if (i15 > 0) {
                    i22 += iArr9[0];
                    i23 += iArr9[1];
                    i24 += iArr9[2];
                } else {
                    i19 += iArr9[0];
                    i20 += iArr9[1];
                    i21 += iArr9[2];
                }
                i15++;
                height = i26;
                i5 = i25;
            }
            int i28 = i5;
            int i29 = height;
            int i30 = i2;
            int i31 = 0;
            while (i31 < width) {
                iArr3[i13] = iArr7[i16];
                iArr4[i13] = iArr7[i17];
                iArr5[i13] = iArr7[i18];
                int i32 = i16 - i19;
                int i33 = i17 - i20;
                int i34 = i18 - i21;
                int[] iArr10 = iArr8[((i30 - i2) + i6) % i6];
                int i35 = i19 - iArr10[0];
                int i36 = i20 - iArr10[1];
                int i37 = i21 - iArr10[2];
                if (i12 == 0) {
                    iArr = iArr7;
                    iArr6[i31] = Math.min(i31 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i38 = iArr2[i14 + iArr6[i31]];
                iArr10[0] = (i38 & 16711680) >> 16;
                iArr10[1] = (i38 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[2] = i38 & 255;
                int i39 = i22 + iArr10[0];
                int i40 = i23 + iArr10[1];
                int i41 = i24 + iArr10[2];
                i16 = i32 + i39;
                i17 = i33 + i40;
                i18 = i34 + i41;
                i30 = (i30 + 1) % i6;
                int[] iArr11 = iArr8[i30 % i6];
                i19 = i35 + iArr11[0];
                i20 = i36 + iArr11[1];
                i21 = i37 + iArr11[2];
                i22 = i39 - iArr11[0];
                i23 = i40 - iArr11[1];
                i24 = i41 - iArr11[2];
                i13++;
                i31++;
                iArr7 = iArr;
            }
            i14 += width;
            i12++;
            height = i29;
            i5 = i28;
        }
        int i42 = i5;
        int i43 = height;
        int[] iArr12 = iArr7;
        int i44 = 0;
        while (i44 < width) {
            int i45 = -i2;
            int i46 = i45 * width;
            int i47 = 0;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            while (i45 <= i2) {
                int[] iArr13 = iArr6;
                int max = Math.max(0, i46) + i44;
                int[] iArr14 = iArr8[i45 + i2];
                iArr14[0] = iArr3[max];
                iArr14[1] = iArr4[max];
                iArr14[2] = iArr5[max];
                int abs2 = i11 - Math.abs(i45);
                i47 += iArr3[max] * abs2;
                i48 += iArr4[max] * abs2;
                i49 += iArr5[max] * abs2;
                if (i45 > 0) {
                    i53 += iArr14[0];
                    i54 += iArr14[1];
                    i55 += iArr14[2];
                } else {
                    i50 += iArr14[0];
                    i51 += iArr14[1];
                    i52 += iArr14[2];
                }
                int i56 = i42;
                if (i45 < i56) {
                    i46 += width;
                }
                i45++;
                i42 = i56;
                iArr6 = iArr13;
            }
            int[] iArr15 = iArr6;
            int i57 = i42;
            int i58 = i2;
            int i59 = i44;
            int i60 = i43;
            int i61 = 0;
            while (i61 < i60) {
                iArr2[i59] = (iArr2[i59] & ViewCompat.MEASURED_STATE_MASK) | (iArr12[i47] << 16) | (iArr12[i48] << 8) | iArr12[i49];
                int i62 = i47 - i50;
                int i63 = i48 - i51;
                int i64 = i49 - i52;
                int[] iArr16 = iArr8[((i58 - i2) + i6) % i6];
                int i65 = i50 - iArr16[0];
                int i66 = i51 - iArr16[1];
                int i67 = i52 - iArr16[2];
                if (i44 == 0) {
                    iArr15[i61] = Math.min(i61 + i11, i57) * width;
                }
                int i68 = iArr15[i61] + i44;
                iArr16[0] = iArr3[i68];
                iArr16[1] = iArr4[i68];
                iArr16[2] = iArr5[i68];
                int i69 = i53 + iArr16[0];
                int i70 = i54 + iArr16[1];
                int i71 = i55 + iArr16[2];
                i47 = i62 + i69;
                i48 = i63 + i70;
                i49 = i64 + i71;
                i58 = (i58 + 1) % i6;
                int[] iArr17 = iArr8[i58];
                i50 = i65 + iArr17[0];
                i51 = i66 + iArr17[1];
                i52 = i67 + iArr17[2];
                i53 = i69 - iArr17[0];
                i54 = i70 - iArr17[1];
                i55 = i71 - iArr17[2];
                i59 += width;
                i61++;
                i2 = i;
            }
            i44++;
            i2 = i;
            i43 = i60;
            i42 = i57;
            iArr6 = iArr15;
        }
        bitmap.setPixels(iArr2, 0, width, 0, 0, width, i43);
        return bitmap;
    }
}
