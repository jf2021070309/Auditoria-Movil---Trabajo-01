package c.g.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class a {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public String f1816b;

    /* renamed from: c  reason: collision with root package name */
    public EnumC0031a f1817c;

    /* renamed from: d  reason: collision with root package name */
    public int f1818d;

    /* renamed from: e  reason: collision with root package name */
    public float f1819e;

    /* renamed from: f  reason: collision with root package name */
    public String f1820f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1821g;

    /* renamed from: h  reason: collision with root package name */
    public int f1822h;

    /* renamed from: c.g.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0031a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(a aVar, Object obj) {
        this.a = false;
        this.f1816b = aVar.f1816b;
        this.f1817c = aVar.f1817c;
        c(obj);
    }

    public a(String str, EnumC0031a enumC0031a, Object obj, boolean z) {
        this.a = false;
        this.f1816b = str;
        this.f1817c = enumC0031a;
        this.a = z;
        c(obj);
    }

    public static void a(Context context, XmlPullParser xmlPullParser, HashMap<String, a> hashMap) {
        EnumC0031a enumC0031a;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f1912e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC0031a enumC0031a2 = null;
        boolean z = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC0031a2 = EnumC0031a.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    enumC0031a = EnumC0031a.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    enumC0031a = EnumC0031a.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    enumC0031a = EnumC0031a.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    enumC0031a = EnumC0031a.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    enumC0031a = EnumC0031a.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    enumC0031a = EnumC0031a.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    enumC0031a = EnumC0031a.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    enumC0031a = EnumC0031a.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                enumC0031a2 = enumC0031a;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new a(str, enumC0031a2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    public static void b(View view, HashMap<String, a> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = hashMap.get(str);
            String k2 = !aVar.a ? e.a.d.a.a.k("set", str) : str;
            try {
                switch (aVar.f1817c.ordinal()) {
                    case 0:
                        cls.getMethod(k2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1818d));
                        break;
                    case 1:
                        cls.getMethod(k2, Float.TYPE).invoke(view, Float.valueOf(aVar.f1819e));
                        break;
                    case 2:
                        cls.getMethod(k2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1822h));
                        break;
                    case 3:
                        Method method = cls.getMethod(k2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f1822h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(k2, CharSequence.class).invoke(view, aVar.f1820f);
                        break;
                    case 5:
                        cls.getMethod(k2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f1821g));
                        break;
                    case 6:
                        cls.getMethod(k2, Float.TYPE).invoke(view, Float.valueOf(aVar.f1819e));
                        break;
                    case 7:
                        cls.getMethod(k2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1818d));
                        break;
                }
            } catch (IllegalAccessException e2) {
                StringBuilder B = e.a.d.a.a.B(" Custom Attribute \"", str, "\" not found on ");
                B.append(cls.getName());
                Log.e("TransitionLayout", B.toString());
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                Log.e("TransitionLayout", e3.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(k2);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e4) {
                StringBuilder B2 = e.a.d.a.a.B(" Custom Attribute \"", str, "\" not found on ");
                B2.append(cls.getName());
                Log.e("TransitionLayout", B2.toString());
                e4.printStackTrace();
            }
        }
    }

    public void c(Object obj) {
        switch (this.f1817c.ordinal()) {
            case 0:
            case 7:
                this.f1818d = ((Integer) obj).intValue();
                return;
            case 1:
                this.f1819e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f1822h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f1820f = (String) obj;
                return;
            case 5:
                this.f1821g = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f1819e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
