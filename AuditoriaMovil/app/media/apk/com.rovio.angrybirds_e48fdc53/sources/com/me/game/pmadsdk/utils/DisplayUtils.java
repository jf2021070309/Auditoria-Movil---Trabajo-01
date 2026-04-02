package com.me.game.pmadsdk.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.me.game.pmadsdk.base.BaseUtils;
/* loaded from: classes6.dex */
public class DisplayUtils extends BaseUtils {
    private static volatile DisplayUtils mIns = null;
    private float density;
    private DisplayMetrics displayMetrics;
    private Resources mResources;
    private float scaledDensity;

    public static DisplayUtils getIns() {
        if (mIns == null) {
            synchronized (DisplayUtils.class) {
                if (mIns == null) {
                    mIns = new DisplayUtils();
                }
            }
        }
        return mIns;
    }

    private DisplayUtils() {
        this.displayMetrics = null;
        this.density = 1.0f;
        this.scaledDensity = 1.0f;
        this.mResources = null;
        this.mResources = mApplication.getResources();
        this.displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) mApplication.getSystemService("window");
        windowManager.getDefaultDisplay().getMetrics(this.displayMetrics);
        this.density = this.displayMetrics.density;
        this.scaledDensity = this.displayMetrics.scaledDensity;
    }

    public int dip2px(float dpValue) {
        return (int) ((this.density * dpValue) + 0.5f);
    }

    public int px2dip(Context context, float pxValue) {
        return (int) ((pxValue / this.density) + 0.5f);
    }

    public float sp2px(Context context, float pxValue) {
        return this.scaledDensity * pxValue;
    }

    public float px2sp(Context context, float pxValue) {
        return pxValue / this.scaledDensity;
    }

    public float getDensity(Context context) {
        return this.density;
    }

    public int getColor(int colorId) {
        return this.mResources.getColor(colorId);
    }

    public Drawable getDrawable(int id) {
        return this.mResources.getDrawable(id);
    }

    public final DisplayMetrics getDisplayMetrics() {
        return this.displayMetrics;
    }

    public int getScreenWidth() {
        return this.displayMetrics.widthPixels;
    }

    public int getScreenHeight() {
        return this.displayMetrics.heightPixels;
    }
}
