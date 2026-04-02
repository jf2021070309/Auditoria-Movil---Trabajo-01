package com.rovio.fusion;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Log;
import java.io.IOException;
import java.util.Hashtable;
/* loaded from: classes2.dex */
public class EmbeddedFontRenderer {
    private static String FONT_PATH = "data/fonts/ttf";
    private static String[] s_fontList = null;
    private static Hashtable<String, Typeface> s_typefaces = new Hashtable<>();
    private Paint a = new Paint();
    private Paint b = new Paint();
    private int c;

    private static void InitFontList() {
        if (s_fontList == null) {
            try {
                s_fontList = Globals.getActivity().getAssets().list(FONT_PATH);
                for (int i = 0; i < s_fontList.length; i++) {
                    Log.d("ABF", "font " + i + ": " + s_fontList[i]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String GetFontPath(String str) {
        for (int i = 0; i < s_fontList.length; i++) {
            int lastIndexOf = s_fontList[i].lastIndexOf(46);
            if (lastIndexOf == -1) {
                lastIndexOf = s_fontList[i].length();
            }
            if (s_fontList[i].substring(0, lastIndexOf).equals(str)) {
                return FONT_PATH + "/" + s_fontList[i];
            }
        }
        return null;
    }

    private static Typeface GetTypeface(String str) {
        Typeface typeface = s_typefaces.get(str);
        if (typeface == null) {
            Typeface createFromAsset = Typeface.createFromAsset(Globals.getActivity().getAssets(), str);
            s_typefaces.put(str, createFromAsset);
            return createFromAsset;
        }
        return typeface;
    }

    public EmbeddedFontRenderer(String str, int i, int i2, int i3, int i4, int i5) {
        this.c = 0;
        InitFontList();
        Typeface GetTypeface = GetTypeface(GetFontPath(str));
        this.a.setTextSize(i);
        this.a.setAntiAlias(true);
        this.a.setColor(i2);
        this.a.setTypeface(GetTypeface);
        this.c = i3;
        if (this.c < 0) {
            this.c = 0;
        }
        if (this.c > 0) {
            this.b.setTextSize(i);
            this.b.setAntiAlias(true);
            this.b.setColor(i4);
            this.b.setTypeface(GetTypeface);
            this.b.setStyle(Paint.Style.FILL_AND_STROKE);
            this.b.setStrokeWidth(this.c * 2);
        }
    }

    public int[] drawString(String str) {
        Rect rect = new Rect();
        String[] split = str.split("\n");
        int width = getWidth(str) + (this.c * 2);
        int rowHeight = (getRowHeight() * split.length) + (this.c * 2);
        int[] iArr = new int[width * rowHeight];
        if (width > 0 && rowHeight > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(width, rowHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            createBitmap.eraseColor(0);
            for (int i = 0; i < split.length; i++) {
                String str2 = split[i];
                this.a.getTextBounds(str2, 0, str2.length(), rect);
                int rowHeight2 = (-getTop(str2)) + (getRowHeight() * i);
                if (this.c > 0) {
                    canvas.drawText(str2, (-rect.left) + this.c, this.c + rowHeight2, this.b);
                    canvas.drawText(str2, (-rect.left) + this.c, rowHeight2 + this.c, this.a);
                } else {
                    canvas.drawText(str2, -rect.left, rowHeight2, this.a);
                }
            }
            createBitmap.getPixels(iArr, 0, width, 0, 0, width, rowHeight);
        }
        return iArr;
    }

    private int a(String str) {
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '\n') {
                i++;
            }
        }
        return i;
    }

    public int getWidth(String str) {
        Rect rect = new Rect();
        this.a.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    public int getRowHeight() {
        return (int) (this.a.getFontMetrics().bottom - this.a.getFontMetrics().top);
    }

    public int getHeight(String str) {
        return getRowHeight() * a(str);
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
