package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public int a;
    public Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public String i;
    public String j;

    /* loaded from: classes.dex */
    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        public static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException unused) {
                Objects.toString(obj);
                return -1;
            } catch (NoSuchMethodException unused2) {
                Objects.toString(obj);
                return -1;
            } catch (InvocationTargetException unused3) {
                Objects.toString(obj);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        public static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat r3, android.content.Context r4) {
            /*
                int r0 = r3.a
                switch(r0) {
                    case -1: goto Ld6;
                    case 0: goto L5;
                    case 1: goto Lbd;
                    case 2: goto Lb2;
                    case 3: goto La5;
                    case 4: goto L9c;
                    case 5: goto L93;
                    case 6: goto Ld;
                    default: goto L5;
                }
            L5:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Unknown type"
                r3.<init>(r4)
                throw r3
            Ld:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 < r1) goto L1d
                android.net.Uri r4 = r3.e()
                android.graphics.drawable.Icon r4 = androidx.core.graphics.drawable.IconCompat.d.a(r4)
                goto Lc5
            L1d:
                if (r4 == 0) goto L7b
                android.net.Uri r0 = r3.e()
                java.lang.String r1 = r0.getScheme()
                java.lang.String r2 = "content"
                boolean r2 = r2.equals(r1)
                if (r2 != 0) goto L4b
                java.lang.String r2 = "file"
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L38
                goto L4b
            L38:
                java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L47
                java.io.File r1 = new java.io.File     // Catch: java.io.FileNotFoundException -> L47
                java.lang.Object r2 = r3.b     // Catch: java.io.FileNotFoundException -> L47
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.FileNotFoundException -> L47
                r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L47
                r4.<init>(r1)     // Catch: java.io.FileNotFoundException -> L47
                goto L58
            L47:
                r0.toString()
                goto L57
            L4b:
                android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Exception -> L54
                java.io.InputStream r4 = r4.openInputStream(r0)     // Catch: java.lang.Exception -> L54
                goto L58
            L54:
                r0.toString()
            L57:
                r4 = 0
            L58:
                if (r4 == 0) goto L63
                android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r4)
                android.graphics.drawable.Icon r4 = androidx.core.graphics.drawable.IconCompat.b.b(r4)
                goto Lc5
            L63:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.<init>(r1)
                android.net.Uri r3 = r3.e()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
            L7b:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.<init>(r1)
                android.net.Uri r3 = r3.e()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
            L93:
                java.lang.Object r4 = r3.b
                android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
                android.graphics.drawable.Icon r4 = androidx.core.graphics.drawable.IconCompat.b.b(r4)
                goto Lc5
            L9c:
                java.lang.Object r4 = r3.b
                java.lang.String r4 = (java.lang.String) r4
                android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithContentUri(r4)
                goto Lc5
            La5:
                java.lang.Object r4 = r3.b
                byte[] r4 = (byte[]) r4
                int r0 = r3.e
                int r1 = r3.f
                android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithData(r4, r0, r1)
                goto Lc5
            Lb2:
                java.lang.String r4 = r3.d()
                int r0 = r3.e
                android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithResource(r4, r0)
                goto Lc5
            Lbd:
                java.lang.Object r4 = r3.b
                android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
                android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithBitmap(r4)
            Lc5:
                android.content.res.ColorStateList r0 = r3.g
                if (r0 == 0) goto Lcc
                r4.setTintList(r0)
            Lcc:
                android.graphics.PorterDuff$Mode r3 = r3.h
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.k
                if (r3 == r0) goto Ld5
                r4.setTintMode(r3)
            Ld5:
                return r4
            Ld6:
                java.lang.Object r3 = r3.b
                android.graphics.drawable.Icon r3 = (android.graphics.drawable.Icon) r3
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = k;
        this.i = null;
    }

    public static IconCompat b(Resources resources, String str, int i) {
        str.getClass();
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.e = i;
            if (resources != null) {
                try {
                    iconCompat.b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.b = str;
            }
            iconCompat.j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int c() {
        int i = this.a;
        if (i == -1) {
            return a.a(this.b);
        }
        if (i == 2) {
            return this.e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final String d() {
        int i = this.a;
        if (i == -1) {
            return a.b(this.b);
        }
        if (i == 2) {
            String str = this.j;
            if (str != null && !TextUtils.isEmpty(str)) {
                return this.j;
            }
            return ((String) this.b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public final Uri e() {
        int i = this.a;
        if (i == -1) {
            return a.d(this.b);
        }
        if (i != 4 && i != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.b);
    }

    public final String toString() {
        String str;
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = k;
        this.i = null;
        this.a = i;
    }
}
