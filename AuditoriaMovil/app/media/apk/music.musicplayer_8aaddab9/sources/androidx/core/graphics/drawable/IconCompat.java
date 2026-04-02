package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.Compressor;
import com.applovin.sdk.AppLovinEventTypes;
import e.a.d.a.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public int f346b;

    /* renamed from: c  reason: collision with root package name */
    public Object f347c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f348d;

    /* renamed from: e  reason: collision with root package name */
    public Parcelable f349e;

    /* renamed from: f  reason: collision with root package name */
    public int f350f;

    /* renamed from: g  reason: collision with root package name */
    public int f351g;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f352h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f353i;

    /* renamed from: j  reason: collision with root package name */
    public String f354j;

    /* renamed from: k  reason: collision with root package name */
    public String f355k;

    public IconCompat() {
        this.f346b = -1;
        this.f348d = null;
        this.f349e = null;
        this.f350f = 0;
        this.f351g = 0;
        this.f352h = null;
        this.f353i = a;
        this.f354j = null;
    }

    public IconCompat(int i2) {
        this.f346b = -1;
        this.f348d = null;
        this.f349e = null;
        this.f350f = 0;
        this.f351g = 0;
        this.f352h = null;
        this.f353i = a;
        this.f354j = null;
        this.f346b = i2;
    }

    public static Bitmap a(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i2) {
        if (str != null) {
            if (i2 != 0) {
                IconCompat iconCompat = new IconCompat(2);
                iconCompat.f350f = i2;
                if (resources != null) {
                    try {
                        iconCompat.f347c = resources.getResourceName(i2);
                    } catch (Resources.NotFoundException unused) {
                        throw new IllegalArgumentException("Icon resource cannot be found");
                    }
                } else {
                    iconCompat.f347c = str;
                }
                iconCompat.f355k = str;
                return iconCompat;
            }
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        throw new IllegalArgumentException("Package must not be null.");
    }

    public static Resources e(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, Compressor.BUFFER_SIZE);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e2);
            return null;
        }
    }

    public int c() {
        int i2;
        int i3 = this.f346b;
        if (i3 != -1 || (i2 = Build.VERSION.SDK_INT) < 23) {
            if (i3 == 2) {
                return this.f350f;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        Icon icon = (Icon) this.f347c;
        if (i2 >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    public String d() {
        int i2;
        int i3 = this.f346b;
        if (i3 != -1 || (i2 = Build.VERSION.SDK_INT) < 23) {
            if (i3 == 2) {
                return TextUtils.isEmpty(this.f355k) ? ((String) this.f347c).split(":", -1)[0] : this.f355k;
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        Icon icon = (Icon) this.f347c;
        if (i2 >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    public int f() {
        int i2;
        int i3 = this.f346b;
        if (i3 != -1 || (i2 = Build.VERSION.SDK_INT) < 23) {
            return i3;
        }
        Icon icon = (Icon) this.f347c;
        if (i2 >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e2);
            return -1;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e3);
            return -1;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e4);
            return -1;
        }
    }

    public Uri g() {
        int i2;
        int i3 = this.f346b;
        if (i3 != -1 || (i2 = Build.VERSION.SDK_INT) < 23) {
            if (i3 == 4 || i3 == 6) {
                return Uri.parse((String) this.f347c);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        Icon icon = (Icon) this.f347c;
        if (i2 >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    public InputStream h(Context context) {
        Uri g2 = g();
        String scheme = g2.getScheme();
        if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme) || Action.FILE_ATTRIBUTE.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(g2);
            } catch (Exception e2) {
                Log.w("IconCompat", "Unable to load image from URI: " + g2, e2);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f347c));
        } catch (FileNotFoundException e3) {
            Log.w("IconCompat", "Unable to load image from path: " + g2, e3);
            return null;
        }
    }

    @Deprecated
    public Icon i() {
        return j(null);
    }

    public Icon j(Context context) {
        Icon createWithBitmap;
        switch (this.f346b) {
            case -1:
                return (Icon) this.f347c;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.f347c);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(d(), this.f350f);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.f347c, this.f350f, this.f351g);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.f347c);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    createWithBitmap = Icon.createWithBitmap(a((Bitmap) this.f347c, false));
                    break;
                } else {
                    createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f347c);
                    break;
                }
            case 6:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    createWithBitmap = Icon.createWithAdaptiveBitmapContentUri(g());
                    break;
                } else if (context == null) {
                    StringBuilder y = a.y("Context is required to resolve the file uri of the icon: ");
                    y.append(g());
                    throw new IllegalArgumentException(y.toString());
                } else {
                    InputStream h2 = h(context);
                    if (h2 == null) {
                        StringBuilder y2 = a.y("Cannot load adaptive icon from uri: ");
                        y2.append(g());
                        throw new IllegalStateException(y2.toString());
                    } else if (i2 < 26) {
                        createWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(h2), false));
                        break;
                    } else {
                        createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(h2));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = this.f352h;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f353i;
        if (mode != a) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public String toString() {
        String str;
        if (this.f346b == -1) {
            return String.valueOf(this.f347c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f346b) {
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
        switch (this.f346b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f347c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f347c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f355k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f350f);
                if (this.f351g != 0) {
                    sb.append(" off=");
                    sb.append(this.f351g);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f347c);
                break;
        }
        if (this.f352h != null) {
            sb.append(" tint=");
            sb.append(this.f352h);
        }
        if (this.f353i != a) {
            sb.append(" mode=");
            sb.append(this.f353i);
        }
        sb.append(")");
        return sb.toString();
    }
}
