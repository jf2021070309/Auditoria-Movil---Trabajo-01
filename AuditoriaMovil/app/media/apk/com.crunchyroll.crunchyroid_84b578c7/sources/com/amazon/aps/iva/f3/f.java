package com.amazon.aps.iva.f3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import com.amazon.aps.iva.f3.d;
import com.amazon.aps.iva.f3.f;
import com.amazon.aps.iva.x2.u;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ResourcesCompat.java */
/* loaded from: classes.dex */
public final class f {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final WeakHashMap<d, SparseArray<c>> b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Drawable a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        public static Drawable b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static int a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        public static ColorStateList b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public final ColorStateList a;
        public final Configuration b;
        public final int c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int hashCode;
            this.a = colorStateList;
            this.b = configuration;
            if (theme == null) {
                hashCode = 0;
            } else {
                hashCode = theme.hashCode();
            }
            this.c = hashCode;
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final Resources a;
        public final Resources.Theme b;

        public d(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.a.equals(dVar.a) && com.amazon.aps.iva.o3.b.a(this.b, dVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return com.amazon.aps.iva.o3.b.b(this.a, this.b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public static Handler getHandler(Handler handler) {
            if (handler == null) {
                return new Handler(Looper.getMainLooper());
            }
            return handler;
        }

        public final void callbackFailAsync(final int i, Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: com.amazon.aps.iva.f3.g
                @Override // java.lang.Runnable
                public final void run() {
                    f.e.this.lambda$callbackFailAsync$1(i);
                }
            });
        }

        public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
            getHandler(handler).post(new u(1, this, typeface));
        }

        /* renamed from: onFontRetrievalFailed */
        public abstract void lambda$callbackFailAsync$1(int i);

        /* renamed from: onFontRetrieved */
        public abstract void lambda$callbackSuccessAsync$0(Typeface typeface);
    }

    public static Typeface a(int i, Context context) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, e eVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Typeface typeface = null;
            if (!charSequence2.startsWith("res/")) {
                if (eVar != null) {
                    eVar.callbackFailAsync(-3, null);
                }
            } else {
                int i3 = typedValue.assetCookie;
                com.amazon.aps.iva.x.g<String, Typeface> gVar = com.amazon.aps.iva.g3.i.b;
                Typeface typeface2 = gVar.get(com.amazon.aps.iva.g3.i.b(resources, i, charSequence2, i3, i2));
                if (typeface2 != null) {
                    if (eVar != null) {
                        eVar.callbackSuccessAsync(typeface2, null);
                    }
                    typeface = typeface2;
                } else if (!z2) {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            d.b a2 = com.amazon.aps.iva.f3.d.a(resources.getXml(i), resources);
                            if (a2 == null) {
                                if (eVar != null) {
                                    eVar.callbackFailAsync(-3, null);
                                }
                            } else {
                                typeface = com.amazon.aps.iva.g3.i.a(context, a2, resources, i, charSequence2, typedValue.assetCookie, i2, eVar, z);
                            }
                        } else {
                            int i4 = typedValue.assetCookie;
                            Typeface c2 = com.amazon.aps.iva.g3.i.a.c(context, resources, i, charSequence2, i2);
                            if (c2 != null) {
                                gVar.put(com.amazon.aps.iva.g3.i.b(resources, i, charSequence2, i4, i2), c2);
                            }
                            if (eVar != null) {
                                if (c2 != null) {
                                    eVar.callbackSuccessAsync(c2, null);
                                } else {
                                    eVar.callbackFailAsync(-3, null);
                                }
                            }
                            typeface = c2;
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        if (eVar != null) {
                            eVar.callbackFailAsync(-3, null);
                        }
                    }
                }
            }
            if (typeface == null && eVar == null && !z2) {
                throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
            }
            return typeface;
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
    }
}
