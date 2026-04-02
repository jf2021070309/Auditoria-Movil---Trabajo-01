package c.g.c;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class b extends View {
    public int[] a;

    /* renamed from: b  reason: collision with root package name */
    public int f1823b;

    /* renamed from: c  reason: collision with root package name */
    public Context f1824c;

    /* renamed from: d  reason: collision with root package name */
    public c.g.a.i.g f1825d;

    /* renamed from: e  reason: collision with root package name */
    public String f1826e;

    /* renamed from: f  reason: collision with root package name */
    public String f1827f;

    /* renamed from: g  reason: collision with root package name */
    public View[] f1828g;

    /* renamed from: h  reason: collision with root package name */
    public HashMap<Integer, String> f1829h;

    public b(Context context) {
        super(context);
        this.a = new int[32];
        this.f1828g = null;
        this.f1829h = new HashMap<>();
        this.f1824c = context;
        i(null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new int[32];
        this.f1828g = null;
        this.f1829h = new HashMap<>();
        this.f1824c = context;
        i(attributeSet);
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f1824c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        ConstraintLayout constraintLayout2 = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i2 = 0;
        if (isInEditMode() && constraintLayout2 != null) {
            Object c2 = constraintLayout2.c(0, trim);
            if (c2 instanceof Integer) {
                i2 = ((Integer) c2).intValue();
            }
        }
        if (i2 == 0 && constraintLayout2 != null) {
            i2 = h(constraintLayout2, trim);
        }
        if (i2 == 0) {
            try {
                i2 = h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i2 == 0) {
            i2 = this.f1824c.getResources().getIdentifier(trim, FacebookAdapter.KEY_ID, this.f1824c.getPackageName());
        }
        if (i2 != 0) {
            this.f1829h.put(Integer.valueOf(i2), trim);
            d(i2);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    public final void d(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f1823b + 1;
        int[] iArr = this.a;
        if (i3 > iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.a;
        int i4 = this.f1823b;
        iArr2[i4] = i2;
        this.f1823b = i4 + 1;
    }

    public final void e(String str) {
        if (str == null || str.length() == 0 || this.f1824c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    StringBuilder y = e.a.d.a.a.y("to use ConstraintTag view ");
                    y.append(childAt.getClass().getSimpleName());
                    y.append(" must have an ID");
                    Log.w("ConstraintHelper", y.toString());
                } else {
                    d(childAt.getId());
                }
            }
        }
    }

    public void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i2 = 0; i2 < this.f1823b; i2++) {
            View d2 = constraintLayout.d(this.a[i2]);
            if (d2 != null) {
                d2.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    d2.setTranslationZ(d2.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.f1823b);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || (resources = this.f1824c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f1909b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1826e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1827f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void j(c.g.a.i.d dVar, boolean z) {
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public void n() {
        if (this.f1825d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).q0 = (c.g.a.i.d) this.f1825d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1826e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1827f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1826e = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f1823b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                c(str.substring(i2));
                return;
            } else {
                c(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1827f = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f1823b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                e(str.substring(i2));
                return;
            } else {
                e(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1826e = null;
        this.f1823b = 0;
        for (int i2 : iArr) {
            d(i2);
        }
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f1826e == null) {
            d(i2);
        }
    }
}
