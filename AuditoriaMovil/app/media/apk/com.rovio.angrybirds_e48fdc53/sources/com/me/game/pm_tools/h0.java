package com.me.game.pm_tools;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import java.util.HashMap;
/* loaded from: classes5.dex */
public class h0 {
    private static volatile h0 b;
    private HashMap<String, Drawable> a = new HashMap<>();

    public static h0 b() {
        if (b == null) {
            synchronized (h0.class) {
                if (b == null) {
                    b = new h0();
                }
            }
        }
        return b;
    }

    public final Drawable a(String str) {
        Drawable bitmapDrawable;
        Drawable drawable = this.a.get(str);
        if (drawable != null) {
            return drawable;
        }
        byte[] a = k0.b().a(str);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a, 0, a.length);
        if (str.endsWith(".9.png")) {
            bitmapDrawable = new NinePatchDrawable(decodeByteArray, decodeByteArray.getNinePatchChunk(), new Rect(), null);
        } else {
            bitmapDrawable = new BitmapDrawable(b.d.getResources(), decodeByteArray);
        }
        this.a.put(str, bitmapDrawable);
        return bitmapDrawable;
    }
}
