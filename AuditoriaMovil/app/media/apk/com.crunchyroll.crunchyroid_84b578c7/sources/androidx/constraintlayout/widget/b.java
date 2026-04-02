package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.u2.j;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: ConstraintHelper.java */
/* loaded from: classes.dex */
public abstract class b extends View {
    public int[] b;
    public int c;
    public final Context d;
    public j e;
    public String f;
    public String g;
    public View[] h;
    public final HashMap<Integer, String> i;

    public b(Context context) {
        super(context);
        this.b = new int[32];
        this.h = null;
        this.i = new HashMap<>();
        this.d = context;
        j(null);
    }

    public final void d(String str) {
        Context context;
        ConstraintLayout constraintLayout;
        if (str == null || str.length() == 0 || (context = this.d) == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) getParent();
        }
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, trim);
            if (designInformation instanceof Integer) {
                i = ((Integer) designInformation).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = i(constraintLayout, trim);
        }
        if (i == 0) {
            try {
                i = com.amazon.aps.iva.y2.c.class.getField(trim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
        }
        if (i != 0) {
            this.i.put(Integer.valueOf(i), trim);
            e(i);
        }
    }

    public final void e(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.c + 1;
        int[] iArr = this.b;
        if (i2 > iArr.length) {
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.b;
        int i3 = this.c;
        iArr2[i3] = i;
        this.c = i3 + 1;
    }

    public final void f(String str) {
        ConstraintLayout constraintLayout;
        if (str == null || str.length() == 0 || this.d == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).Y) && childAt.getId() != -1) {
                e(childAt.getId());
            }
        }
    }

    public final void g(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.c; i++) {
            View viewById = constraintLayout.getViewById(this.b[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.b, this.c);
    }

    public final int i(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void j(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.amazon.aps.iva.y2.d.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void l() {
        if (this.e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).q0 = this.e;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                d(str.substring(i));
                return;
            } else {
                d(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                f(str.substring(i));
                return;
            } else {
                f(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f = null;
        this.c = 0;
        for (int i : iArr) {
            e(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f == null) {
            e(i);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new int[32];
        this.h = null;
        this.i = new HashMap<>();
        this.d = context;
        j(attributeSet);
    }

    public void h(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void k(com.amazon.aps.iva.u2.e eVar, boolean z) {
    }
}
