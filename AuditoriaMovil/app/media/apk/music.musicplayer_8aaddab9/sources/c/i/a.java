package c.i;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import android.widget.PopupWindow;
import android.widget.TextView;
import c.i.d.c.e;
import c.i.d.c.f;
import c.i.d.c.g;
import c.i.d.c.h;
import c.i.e.d;
import c.i.i.b;
import c.i.l.c;
import c.i.l.i;
import c.i.l.j;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class a {
    public static Method a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f1927b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f1928c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f1929d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f1930e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1931f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f1932g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f1933h;

    /* renamed from: i  reason: collision with root package name */
    public static Method f1934i;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f1935j;

    /* renamed from: k  reason: collision with root package name */
    public static Field f1936k;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f1937l;

    public static String A(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2) {
        if (J(xmlPullParser, str)) {
            return typedArray.getString(i2);
        }
        return null;
    }

    public static Intent B(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String D = D(activity, activity.getComponentName());
            if (D == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, D);
            try {
                return D(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + D + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent C(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String D = D(context, componentName);
        if (D == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), D);
        return D(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String D(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 640;
        if (i2 >= 29) {
            i3 = 269222528;
        } else if (i2 >= 24) {
            i3 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i3);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static int E(TypedArray typedArray, int i2, int i3, int i4) {
        return typedArray.getResourceId(i2, typedArray.getResourceId(i3, i4));
    }

    public static String F(TypedArray typedArray, int i2, int i3) {
        String string = typedArray.getString(i2);
        return string == null ? typedArray.getString(i3) : string;
    }

    public static File G(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder y = e.a.d.a.a.y(".font");
        y.append(Process.myPid());
        y.append("-");
        y.append(Process.myTid());
        y.append("-");
        String sb = y.toString();
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, e.a.d.a.a.e(sb, i2));
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static CharSequence[] H(TypedArray typedArray, int i2, int i3) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        return textArray == null ? typedArray.getTextArray(i3) : textArray;
    }

    public static b.a I(TextView textView) {
        int i2;
        int i3;
        TextDirectionHeuristic textDirectionHeuristic;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new b.a(textView.getTextMetricsParams());
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 1;
            i3 = 1;
        } else {
            i2 = 0;
            i3 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i4 >= 23) {
            i2 = textView.getBreakStrategy();
            i3 = textView.getHyphenationFrequency();
        }
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i4 < 28 || (textView.getInputType() & 15) != 3) {
            boolean z = textView.getLayoutDirection() == 1;
            switch (textView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (!z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new b.a(textPaint, textDirectionHeuristic, i2, i3);
    }

    public static boolean J(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int K(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
                        if (i2 != 16) {
                            if (i2 != 32) {
                                if (i2 != 64) {
                                    if (i2 != 128) {
                                        if (i2 == 256) {
                                            return 8;
                                        }
                                        throw new IllegalArgumentException(e.a.d.a.a.e("type needs to be >= FIRST and <= LAST, type=", i2));
                                    }
                                    return 7;
                                }
                                return 6;
                            }
                            return 5;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static boolean L() {
        if (Build.VERSION.SDK_INT < 31) {
            String str = Build.VERSION.CODENAME;
            if (!(!"REL".equals(str) && str.compareTo("S") >= 0)) {
                return false;
            }
        }
        return true;
    }

    public static boolean M(Rect rect, Rect rect2, int i2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        } else if (i2 == 130) {
            int i9 = rect.top;
            int i10 = rect2.top;
            return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int N(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static int O(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static ByteBuffer P(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static int Q(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    public static TypedArray R(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static void S(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f2, f3);
        } else {
            edgeEffect.onPull(f2);
        }
    }

    public static float T(EdgeEffect edgeEffect, float f2, float f3) {
        if (L()) {
            return c.c(edgeEffect, f2, f3);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f2, f3);
        } else {
            edgeEffect.onPull(f2);
        }
        return f2;
    }

    public static e U(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b.f1938b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlPullParser.next() != 3) {
                        m0(xmlPullParser);
                    }
                    return new h(new c.i.h.e(string, string2, string3, V(resources, resourceId)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlPullParser.next() != 3) {
                    if (xmlPullParser.getEventType() == 2) {
                        if (xmlPullParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b.f1939c);
                            int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                            boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                            int i3 = obtainAttributes2.hasValue(9) ? 9 : 3;
                            String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                            int i4 = obtainAttributes2.getInt(i3, 0);
                            int i5 = obtainAttributes2.hasValue(5) ? 5 : 0;
                            int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                            String string6 = obtainAttributes2.getString(i5);
                            obtainAttributes2.recycle();
                            while (xmlPullParser.next() != 3) {
                                m0(xmlPullParser);
                            }
                            arrayList.add(new g(string6, i2, z, string5, i4, resourceId2));
                        } else {
                            m0(xmlPullParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new f((g[]) arrayList.toArray(new g[arrayList.size()]));
                }
            } else {
                m0(xmlPullParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> V(Resources resources, int i2) {
        int i3;
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                i3 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i3 = typedValue.type;
            }
            if (i3 == 1) {
                for (int i4 = 0; i4 < obtainTypedArray.length(); i4++) {
                    int resourceId = obtainTypedArray.getResourceId(i4, 0);
                    if (resourceId != 0) {
                        arrayList.add(o0(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(o0(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void W(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof i) {
            ((i) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    public static void X(TextView textView, ColorStateList colorStateList) {
        Objects.requireNonNull(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof j) {
            ((j) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void Y(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                s(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                s(layoutInflater, factory2);
            }
        }
    }

    public static void Z(TextView textView, int i2) {
        h(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public static void a0(Drawable drawable, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f2, f3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r10.right <= r12.left) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r10.left >= r12.right) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = c(r9, r10, r11)
            boolean r1 = c(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L7d
            if (r0 != 0) goto Lf
            goto L7d
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L45
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L45
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L45
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L45
        L43:
            r7 = 1
            goto L46
        L45:
            r7 = 0
        L46:
            if (r7 != 0) goto L49
            return r6
        L49:
            if (r9 == r5) goto L7c
            if (r9 != r4) goto L4e
            goto L7c
        L4e:
            int r11 = N(r9, r10, r11)
            if (r9 == r5) goto L6f
            if (r9 == r3) goto L6a
            if (r9 == r4) goto L65
            if (r9 != r1) goto L5f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L73
        L5f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L65:
            int r9 = r12.right
            int r10 = r10.right
            goto L73
        L6a:
            int r9 = r10.top
            int r10 = r12.top
            goto L73
        L6f:
            int r9 = r10.left
            int r10 = r12.left
        L73:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L7b
            r2 = 1
        L7b:
            return r2
        L7c:
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.i.a.b(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static void b0(Drawable drawable, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }
    }

    public static boolean c(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void c0(TextView textView, int i2) {
        h(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void d(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static boolean d0(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i2);
        }
        if (!f1927b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f1927b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i2));
                return true;
            } catch (Exception unused2) {
                a = null;
            }
        }
        return false;
    }

    public static final Bundle e(h.f<String, ? extends Object>... fVarArr) {
        h.o.c.j.e(fVarArr, "pairs");
        Bundle bundle = new Bundle(fVarArr.length);
        int length = fVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            h.f<String, ? extends Object> fVar = fVarArr[i2];
            i2++;
            String str = fVar.a;
            B b2 = fVar.f8925b;
            if (b2 == 0) {
                bundle.putString(str, null);
            } else if (b2 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b2).booleanValue());
            } else if (b2 instanceof Byte) {
                bundle.putByte(str, ((Number) b2).byteValue());
            } else if (b2 instanceof Character) {
                bundle.putChar(str, ((Character) b2).charValue());
            } else if (b2 instanceof Double) {
                bundle.putDouble(str, ((Number) b2).doubleValue());
            } else if (b2 instanceof Float) {
                bundle.putFloat(str, ((Number) b2).floatValue());
            } else if (b2 instanceof Integer) {
                bundle.putInt(str, ((Number) b2).intValue());
            } else if (b2 instanceof Long) {
                bundle.putLong(str, ((Number) b2).longValue());
            } else if (b2 instanceof Short) {
                bundle.putShort(str, ((Number) b2).shortValue());
            } else if (b2 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b2);
            } else if (b2 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b2);
            } else if (b2 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b2);
            } else if (b2 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b2);
            } else if (b2 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b2);
            } else if (b2 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b2);
            } else if (b2 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b2);
            } else if (b2 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b2);
            } else if (b2 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b2);
            } else if (b2 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b2);
            } else if (b2 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b2);
            } else if (b2 instanceof Object[]) {
                Class<?> componentType = b2.getClass().getComponentType();
                h.o.c.j.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b2);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b2);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b2);
                } else if (!Serializable.class.isAssignableFrom(componentType)) {
                    String canonicalName = componentType.getCanonicalName();
                    throw new IllegalArgumentException("Illegal value array type " + ((Object) canonicalName) + " for key \"" + str + CoreConstants.DOUBLE_QUOTE_CHAR);
                } else {
                    bundle.putSerializable(str, (Serializable) b2);
                }
            } else if (b2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b2);
            } else {
                int i3 = Build.VERSION.SDK_INT;
                if (b2 instanceof IBinder) {
                    bundle.putBinder(str, (IBinder) b2);
                } else if (i3 >= 21 && (b2 instanceof Size)) {
                    bundle.putSize(str, (Size) b2);
                } else if (i3 < 21 || !(b2 instanceof SizeF)) {
                    String canonicalName2 = b2.getClass().getCanonicalName();
                    throw new IllegalArgumentException("Illegal value type " + ((Object) canonicalName2) + " for key \"" + str + CoreConstants.DOUBLE_QUOTE_CHAR);
                } else {
                    bundle.putSizeF(str, (SizeF) b2);
                }
            }
        }
        return bundle;
    }

    public static void e0(TextView textView, int i2) {
        h(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing(i2 - fontMetricsInt, 1.0f);
        }
    }

    public static boolean f(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public static void f0(PopupWindow popupWindow, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            c.i.l.f.c(popupWindow, z);
        } else if (i2 >= 21) {
            if (!f1937l) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f1936k = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f1937l = true;
            }
            Field field = f1936k;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException unused2) {
                }
            }
        }
    }

    public static boolean g(d[] dVarArr, d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            if (dVarArr[i2].a != dVarArr2[i2].a || dVarArr[i2].f2039b.length != dVarArr2[i2].f2039b.length) {
                return false;
            }
        }
        return true;
    }

    public static void g0(TextView textView, c.i.i.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Spannable spannable = bVar.f2114c;
            textView.setText(spannable instanceof PrecomputedText ? (PrecomputedText) spannable : null);
        } else if (!I(textView).a(bVar.f2115d)) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        } else {
            textView.setText(bVar);
        }
    }

    public static int h(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public static void h0(TextView textView, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i2);
        } else {
            textView.setTextAppearance(textView.getContext(), i2);
        }
    }

    public static <T> T i(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void i0(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i2);
        } else if (drawable instanceof c.i.e.m.a) {
            ((c.i.e.m.a) drawable).setTint(i2);
        }
    }

    public static int j(Context context, String str) {
        int Q;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            int i2 = Build.VERSION.SDK_INT;
            String permissionToOp = i2 >= 23 ? AppOpsManager.permissionToOp(str) : null;
            if (permissionToOp == null) {
                return 0;
            }
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                }
            }
            if (!(Process.myUid() == myUid && Objects.equals(context.getPackageName(), packageName))) {
                Q = Q(context, permissionToOp, packageName);
            } else if (i2 >= 29) {
                AppOpsManager c2 = c.i.c.g.c(context);
                Q = c.i.c.g.a(c2, permissionToOp, Binder.getCallingUid(), packageName);
                if (Q == 0) {
                    Q = c.i.c.g.a(c2, permissionToOp, myUid, c.i.c.g.b(context));
                }
            } else {
                Q = Q(context, permissionToOp, packageName);
            }
            return Q == 0 ? 0 : -2;
        }
        return -1;
    }

    public static void j0(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof c.i.e.m.a) {
            ((c.i.e.m.a) drawable).setTintList(colorStateList);
        }
    }

    public static int k(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static void k0(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof c.i.e.m.a) {
            ((c.i.e.m.a) drawable).setTintMode(mode);
        }
    }

    public static void l(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            drawable.clearColorFilter();
        } else if (i2 < 21) {
            drawable.clearColorFilter();
        } else {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                l(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof c.i.e.m.b) {
                l(((c.i.e.m.b) drawable).b());
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    Drawable child = drawableContainerState.getChild(i3);
                    if (child != null) {
                        l(child);
                    }
                }
            }
        }
    }

    public static void l0(PopupWindow popupWindow, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            c.i.l.f.d(popupWindow, i2);
            return;
        }
        if (!f1935j) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f1934i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f1935j = true;
        }
        Method method = f1934i;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i2));
            } catch (Exception unused2) {
            }
        }
    }

    public static float[] m(float[] fArr, int i2, int i3) {
        if (i2 <= i3) {
            int length = fArr.length;
            if (i2 < 0 || i2 > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = i3 - i2;
            int min = Math.min(i4, length - i2);
            float[] fArr2 = new float[i4];
            System.arraycopy(fArr, i2, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static void m0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static boolean n(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean o = o(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return o;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static int n0(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static boolean o(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static List<byte[]> o0(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (r13 == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098 A[Catch: NumberFormatException -> 0x00ba, LOOP:3: B:29:0x006d->B:49:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b2), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d A[Catch: NumberFormatException -> 0x00ba, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b2), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad A[Catch: NumberFormatException -> 0x00ba, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b2), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c.i.e.d[] p(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.i.a.p(java.lang.String):c.i.e.d[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T p0(Drawable drawable) {
        return drawable instanceof c.i.e.m.b ? (T) ((c.i.e.m.b) drawable).b() : drawable;
    }

    public static Path q(String str) {
        Path path = new Path();
        d[] p = p(str);
        if (p != null) {
            try {
                d.b(p, path);
                return path;
            } catch (RuntimeException e2) {
                throw new RuntimeException(e.a.d.a.a.k("Error in parsing ", str), e2);
            }
        }
        return null;
    }

    public static Drawable q0(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 23 ? drawable : i2 >= 21 ? !(drawable instanceof c.i.e.m.a) ? new c.i.e.m.d(drawable) : drawable : !(drawable instanceof c.i.e.m.a) ? new c.i.e.m.c(drawable) : drawable;
    }

    public static d[] r(d[] dVarArr) {
        if (dVarArr == null) {
            return null;
        }
        d[] dVarArr2 = new d[dVarArr.length];
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            dVarArr2[i2] = new d(dVarArr[i2]);
        }
        return dVarArr2;
    }

    public static ActionMode.Callback r0(TextView textView, ActionMode.Callback callback) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof c.i.l.g) || callback == null) ? callback : new c.i.l.g(callback, textView);
    }

    public static void s(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f1931f) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f1930e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                StringBuilder y = e.a.d.a.a.y("forceSetFactory2 Could not find field 'mFactory2' on class ");
                y.append(LayoutInflater.class.getName());
                y.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", y.toString(), e2);
            }
            f1931f = true;
        }
        Field field = f1930e;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e3) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e3);
            }
        }
    }

    public static int t(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static boolean u(TypedArray typedArray, int i2, int i3, boolean z) {
        return typedArray.getBoolean(i2, typedArray.getBoolean(i3, z));
    }

    public static Drawable v(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f1933h) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f1932g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1933h = true;
        }
        Field field = f1932g;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f1932g = null;
            }
        }
        return null;
    }

    public static ColorStateList w(CompoundButton compoundButton) {
        return Build.VERSION.SDK_INT >= 21 ? compoundButton.getButtonTintList() : ((i) compoundButton).getSupportButtonTintList();
    }

    public static float x(EdgeEffect edgeEffect) {
        if (L()) {
            return c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static int y(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!f1929d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f1928c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f1929d = true;
        }
        Method method = f1928c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                f1928c = null;
            }
        }
        return 0;
    }

    public static c.i.d.c.d z(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2, int i3) {
        c.i.d.c.d dVar;
        if (J(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return new c.i.d.c.d(null, null, typedValue.data);
            }
            try {
                dVar = c.i.d.c.d.a(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                dVar = null;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        return new c.i.d.c.d(null, null, i3);
    }
}
