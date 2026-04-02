package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: assets/audience_network.dex */
public final class MS {
    @TargetApi(ConnectionResult.SERVICE_UPDATING)
    public static Bitmap A00(C1046Xo c1046Xo, Bitmap bitmap, int i2) throws RSRuntimeException {
        RenderScript renderScript = null;
        Allocation allocation = null;
        Allocation allocation2 = null;
        ScriptIntrinsicBlur scriptIntrinsicBlur = null;
        try {
            renderScript = RenderScript.create(c1046Xo);
            renderScript.setMessageHandler(new RenderScript.RSMessageHandler());
            allocation = Allocation.createFromBitmap(renderScript, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            allocation2 = Allocation.createTyped(renderScript, allocation.getType());
            scriptIntrinsicBlur = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            scriptIntrinsicBlur.setInput(allocation);
            scriptIntrinsicBlur.setRadius(i2);
            scriptIntrinsicBlur.forEach(allocation2);
            allocation2.copyTo(bitmap);
            renderScript.destroy();
            allocation.destroy();
            allocation2.destroy();
            scriptIntrinsicBlur.destroy();
            return bitmap;
        } catch (Throwable th) {
            if (renderScript != null) {
                renderScript.destroy();
            }
            if (allocation != null) {
                allocation.destroy();
            }
            if (allocation2 != null) {
                allocation2.destroy();
            }
            if (scriptIntrinsicBlur != null) {
                scriptIntrinsicBlur.destroy();
            }
            throw th;
        }
    }

    @Nullable
    public static Bitmap A01(C1046Xo c1046Xo, Bitmap bitmap, int i2, int i3) {
        int width = bitmap.getWidth() / i3;
        int height = bitmap.getHeight() / i3;
        if (width == 0 || height == 0 || Build.VERSION.SDK_INT < 18) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(1.0f / i3, 1.0f / i3);
        Paint paint = new Paint();
        paint.setFlags(3);
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            Bitmap A00 = A00(c1046Xo, createBitmap, i2);
            if (i3 != 1) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(A00, bitmap.getWidth(), bitmap.getHeight(), true);
                A00.recycle();
                return createScaledBitmap;
            }
            return A00;
        } catch (RSRuntimeException unused) {
            return new TZ().A02(createBitmap, i2);
        }
    }
}
