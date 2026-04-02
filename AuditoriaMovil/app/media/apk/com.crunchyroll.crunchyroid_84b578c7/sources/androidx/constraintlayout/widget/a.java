package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ConstraintAttribute.java */
/* loaded from: classes.dex */
public final class a {
    public final boolean a;
    public final String b;
    public final b c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    /* compiled from: ConstraintAttribute.java */
    /* renamed from: androidx.constraintlayout.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0023a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: ConstraintAttribute.java */
    /* loaded from: classes.dex */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String str, b bVar, Object obj, boolean z) {
        this.a = false;
        this.b = str;
        this.c = bVar;
        this.a = z;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        b bVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), com.amazon.aps.iva.y2.d.e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        b bVar2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
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
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    bVar = b.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    bVar = b.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    bVar = b.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    bVar = b.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    bVar = b.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                bVar2 = bVar;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new a(str, bVar2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap<String, a> hashMap) {
        Class<?> cls = view.getClass();
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            a aVar = hashMap.get(next);
            if (!aVar.a) {
                next = com.amazon.aps.iva.oa.a.a("set", next);
            }
            try {
                switch (C0023a.a[aVar.c.ordinal()]) {
                    case 1:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(aVar.d));
                        break;
                    case 2:
                        cls.getMethod(next, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.g));
                        break;
                    case 3:
                        cls.getMethod(next, CharSequence.class).invoke(view, aVar.f);
                        break;
                    case 4:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(aVar.h));
                        break;
                    case 5:
                        Method method = cls.getMethod(next, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(aVar.d));
                        break;
                    case 7:
                        cls.getMethod(next, Float.TYPE).invoke(view, Float.valueOf(aVar.e));
                        break;
                    case 8:
                        cls.getMethod(next, Float.TYPE).invoke(view, Float.valueOf(aVar.e));
                        break;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.getMessage();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
    }

    public final float a() {
        switch (C0023a.a[this.c.ordinal()]) {
            case 2:
                if (this.g) {
                    return 1.0f;
                }
                return 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.d;
            case 7:
                return this.e;
            case 8:
                return this.e;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        float f;
        switch (C0023a.a[this.c.ordinal()]) {
            case 2:
                if (this.g) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[0] = f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i = this.h;
                float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case 6:
                fArr[0] = this.d;
                return;
            case 7:
                fArr[0] = this.e;
                return;
            case 8:
                fArr[0] = this.e;
                return;
            default:
                return;
        }
    }

    public final int c() {
        int i = C0023a.a[this.c.ordinal()];
        if (i == 4 || i == 5) {
            return 4;
        }
        return 1;
    }

    public final void f(Object obj) {
        switch (C0023a.a[this.c.ordinal()]) {
            case 1:
            case 6:
                this.d = ((Integer) obj).intValue();
                return;
            case 2:
                this.g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f = (String) obj;
                return;
            case 4:
            case 5:
                this.h = ((Integer) obj).intValue();
                return;
            case 7:
                this.e = ((Float) obj).floatValue();
                return;
            case 8:
                this.e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public a(a aVar, Object obj) {
        this.a = false;
        this.b = aVar.b;
        this.c = aVar.c;
        f(obj);
    }
}
