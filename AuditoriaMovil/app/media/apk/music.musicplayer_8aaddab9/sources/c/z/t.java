package c.z;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import c.i.k.d0;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class t {
    public static final z a;

    /* renamed from: b  reason: collision with root package name */
    public static final Property<View, Float> f2912b;

    /* loaded from: classes.dex */
    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(t.a(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f2) {
            float floatValue = f2.floatValue();
            t.a.e(view, floatValue);
        }
    }

    /* loaded from: classes.dex */
    public class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Rect get(View view) {
            AtomicInteger atomicInteger = c.i.k.d0.a;
            return d0.e.a(view);
        }

        @Override // android.util.Property
        public void set(View view, Rect rect) {
            AtomicInteger atomicInteger = c.i.k.d0.a;
            d0.e.c(view, rect);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            a = new y();
        } else if (i2 >= 23) {
            a = new x();
        } else if (i2 >= 22) {
            a = new w();
        } else if (i2 >= 21) {
            a = new v();
        } else {
            a = new u();
        }
        f2912b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    public static float a(View view) {
        return a.b(view);
    }

    public static void b(View view, int i2, int i3, int i4, int i5) {
        a.d(view, i2, i3, i4, i5);
    }
}
