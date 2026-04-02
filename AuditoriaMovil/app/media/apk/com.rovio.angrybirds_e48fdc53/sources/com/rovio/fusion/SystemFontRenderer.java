package com.rovio.fusion;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
/* loaded from: classes2.dex */
public class SystemFontRenderer {
    private Paint a = new Paint();
    private Paint b = new Paint();
    private int c;

    public SystemFontRenderer(String str, int i, int i2, int i3, int i4, int i5) {
        this.c = 0;
        this.a.setTextSize(i);
        this.a.setAntiAlias(true);
        this.a.setColor(i2);
        this.a.setTypeface(Typeface.create(str, i5));
        this.c = i3;
        if (this.c < 0) {
            this.c = 0;
        }
        this.b.setTextSize(i);
        this.b.setAntiAlias(true);
        this.b.setColor(i4);
        this.b.setTypeface(Typeface.create(str, i5));
        this.b.setStyle(Paint.Style.FILL_AND_STROKE);
        this.b.setStrokeWidth(this.c * 2);
    }

    public int[] drawString(String str) {
        Rect rect = new Rect();
        this.a.getTextBounds(str, 0, str.length(), rect);
        int width = getWidth(str) + (this.c * 2);
        int height = getHeight(str) + (this.c * 2);
        int[] iArr = new int[width * height];
        if (width > 0 && height > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            createBitmap.eraseColor(0);
            if (this.c > 0) {
                canvas.drawText(str, (-rect.left) + this.c, (-getTop(str)) + this.c, this.b);
                canvas.drawText(str, (-rect.left) + this.c, (-getTop(str)) + this.c, this.a);
            } else {
                canvas.drawText(str, -rect.left, -getTop(str), this.a);
            }
            createBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        }
        return iArr;
    }

    public int getWidth(String str) {
        Rect rect = new Rect();
        this.a.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    public int getHeight(String str) {
        return (int) (this.a.getFontMetrics().bottom - this.a.getFontMetrics().top);
    }

    public int getLeft(String str) {
        Rect rect = new Rect();
        this.a.getTextBounds(str, 0, str.length(), rect);
        return rect.left;
    }

    public int getTop(String str) {
        return (int) this.a.getFontMetrics().top;
    }

    public int getLeading() {
        return (int) this.a.getFontMetrics().leading;
    }

    public int getAscender() {
        return -((int) this.a.ascent());
    }

    public int getDescender() {
        return (int) this.a.descent();
    }
}
