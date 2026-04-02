package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.amazon.aps.iva.g3.e;
import com.amazon.aps.iva.h3.a;
import com.google.android.gms.cast.internal.Logger;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzs {
    private static final Logger zza = new Logger("WidgetUtil");

    @TargetApi(17)
    public static Bitmap zza(Context context, Bitmap bitmap, float f, float f2) {
        Logger logger = zza;
        logger.d("Begin blurring bitmap %s, original width = %d, original height = %d.", bitmap, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        int round = Math.round(bitmap.getWidth() * 0.25f);
        int round2 = Math.round(bitmap.getHeight() * 0.25f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, false);
        Bitmap createBitmap = Bitmap.createBitmap(round, round2, createScaledBitmap.getConfig());
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, createFromBitmap.getElement());
        create2.setInput(createFromBitmap);
        create2.setRadius(7.5f);
        create2.forEach(createTyped);
        createTyped.copyTo(createBitmap);
        create.destroy();
        logger.d("End blurring bitmap %s, original width = %d, original height = %d.", createScaledBitmap, Integer.valueOf(round), Integer.valueOf(round2));
        return createBitmap;
    }

    public static Drawable zzb(Context context, int i, int i2) {
        return zzd(context, i, i2, 0, 17170443);
    }

    public static Drawable zzc(Context context, int i, int i2) {
        return zzd(context, i, i2, 16842800, 0);
    }

    private static Drawable zzd(Context context, int i, int i2, int i3, int i4) {
        int color;
        ColorStateList colorStateList;
        Drawable mutate = context.getResources().getDrawable(i2).mutate();
        a.b.i(mutate, PorterDuff.Mode.SRC_IN);
        if (i != 0) {
            colorStateList = com.amazon.aps.iva.d3.a.getColorStateList(context, i);
        } else {
            if (i3 != 0) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i3});
                color = obtainStyledAttributes.getColor(0, 0);
                obtainStyledAttributes.recycle();
            } else {
                color = com.amazon.aps.iva.d3.a.getColor(context, i4);
            }
            colorStateList = new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{color, e.h(color, 128)});
        }
        a.b.h(mutate, colorStateList);
        return mutate;
    }
}
