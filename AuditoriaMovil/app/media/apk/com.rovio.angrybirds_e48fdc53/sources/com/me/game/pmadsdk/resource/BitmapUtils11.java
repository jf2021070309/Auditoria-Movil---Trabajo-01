package com.me.game.pmadsdk.resource;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.me.game.pmadsdk.base.BaseUtils;
import java.util.HashMap;
/* loaded from: classes6.dex */
public class BitmapUtils11 extends BaseUtils {
    private static volatile BitmapUtils11 mIns = null;
    private HashMap<String, Drawable> mDrawableCache = new HashMap<>();

    protected BitmapUtils11() {
    }

    public static BitmapUtils11 getIns() {
        if (mIns == null) {
            synchronized (BitmapUtils11.class) {
                if (mIns == null) {
                    mIns = new BitmapUtils11();
                }
            }
        }
        return mIns;
    }

    public final Drawable getDrawable(String src) {
        Drawable drawable;
        Drawable drawable2 = this.mDrawableCache.get(src);
        if (drawable2 != null) {
            return drawable2;
        }
        byte[] bytes = ResourceHelper.getIns().getBitmapData(src);
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        if (src.endsWith(".9.png")) {
            drawable = new NinePatchDrawable(bitmap, bitmap.getNinePatchChunk(), new Rect(), null);
        } else {
            drawable = new BitmapDrawable(mApplication.getResources(), bitmap);
        }
        this.mDrawableCache.put(src, drawable);
        return drawable;
    }
}
