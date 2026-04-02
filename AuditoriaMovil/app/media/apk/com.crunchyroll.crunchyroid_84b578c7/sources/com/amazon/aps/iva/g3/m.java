package com.amazon.aps.iva.g3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import com.amazon.aps.iva.f3.d;
import com.google.android.gms.cast.MediaError;
import java.io.IOException;
/* compiled from: TypefaceCompatApi29Impl.java */
/* loaded from: classes.dex */
public final class m extends o {
    public static Font f(FontFamily fontFamily, int i) {
        int i2;
        int i3;
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = MediaError.DetailedErrorCode.MANIFEST_UNKNOWN;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        FontStyle fontStyle = new FontStyle(i2, i3);
        Font font = fontFamily.getFont(0);
        int g = g(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int g2 = g(fontStyle, font2.getStyle());
            if (g2 < g) {
                font = font2;
                g = g2;
            }
        }
        return font;
    }

    public static int g(FontStyle fontStyle, FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    @Override // com.amazon.aps.iva.g3.o
    public final Typeface a(Context context, d.c cVar, Resources resources, int i) {
        d.C0238d[] c0238dArr;
        int i2;
        try {
            FontFamily.Builder builder = null;
            for (d.C0238d c0238d : cVar.a) {
                try {
                    Font.Builder weight = new Font.Builder(resources, c0238d.f).setWeight(c0238d.b);
                    if (c0238d.c) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    Font build = weight.setSlant(i2).setTtcIndex(c0238d.e).setFontVariationSettings(c0238d.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(f(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.amazon.aps.iva.g3.o
    public final Typeface b(Context context, com.amazon.aps.iva.m3.l[] lVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        int i2;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (com.amazon.aps.iva.m3.l lVar : lVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(lVar.a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(lVar.c);
                        if (lVar.d) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        Font build = weight.setSlant(i2).setTtcIndex(lVar.b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(f(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.amazon.aps.iva.g3.o
    public final Typeface c(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.amazon.aps.iva.g3.o
    public final com.amazon.aps.iva.m3.l e(int i, com.amazon.aps.iva.m3.l[] lVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
