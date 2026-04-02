package com.amazon.aps.iva.p3;

import android.view.View;
import android.view.ViewParent;
import com.amazon.aps.iva.p3.g0;
import java.util.Objects;
import java.util.WeakHashMap;
/* compiled from: NestedScrollingChildHelper.java */
/* loaded from: classes.dex */
public final class q {
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public q(View view) {
        this.c = view;
    }

    public final boolean a(float f, float f2, boolean z) {
        ViewParent g;
        if (!this.d || (g = g(0)) == null) {
            return false;
        }
        try {
            return o0.a(g, this.c, f, f2, z);
        } catch (AbstractMethodError unused) {
            Objects.toString(g);
            return false;
        }
    }

    public final boolean b(float f, float f2) {
        ViewParent g;
        if (!this.d || (g = g(0)) == null) {
            return false;
        }
        try {
            return o0.b(g, this.c, f, f2);
        } catch (AbstractMethodError unused) {
            Objects.toString(g);
            return false;
        }
    }

    public final boolean c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent g;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.d || (g = g(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr3 = this.e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.c;
        if (g instanceof r) {
            ((r) g).onNestedPreScroll(view2, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                o0.c(g, view2, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(g);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final void d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        f(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final boolean e(int i, int i2, int i3, int i4, int[] iArr) {
        return f(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent g;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.d || (g = g(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr4 = this.e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.c;
        if (g instanceof s) {
            ((s) g).onNestedScroll(view2, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (g instanceof r) {
                ((r) g).onNestedScroll(view2, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    o0.d(g, view2, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    Objects.toString(g);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final ViewParent g(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.b;
        }
        return this.a;
    }

    public final boolean h(int i) {
        if (g(i) != null) {
            return true;
        }
        return false;
    }

    public final void i(boolean z) {
        if (this.d) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.i.z(this.c);
        }
        this.d = z;
    }

    public final boolean j(int i, int i2) {
        boolean f;
        if (h(i2)) {
            return true;
        }
        if (this.d) {
            View view = this.c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z = parent instanceof r;
                if (z) {
                    f = ((r) parent).onStartNestedScroll(view2, view, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            f = o0.f(parent, view2, view, i);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                        }
                    }
                    f = false;
                }
                if (f) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            this.b = parent;
                        }
                    } else {
                        this.a = parent;
                    }
                    if (z) {
                        ((r) parent).onNestedScrollAccepted(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            o0.e(parent, view2, view, i);
                        } catch (AbstractMethodError unused2) {
                            Objects.toString(parent);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    public final void k(int i) {
        ViewParent g = g(i);
        if (g != null) {
            boolean z = g instanceof r;
            View view = this.c;
            if (z) {
                ((r) g).onStopNestedScroll(view, i);
            } else if (i == 0) {
                try {
                    o0.g(g, view);
                } catch (AbstractMethodError unused) {
                    Objects.toString(g);
                }
            }
            if (i != 0) {
                if (i == 1) {
                    this.b = null;
                    return;
                }
                return;
            }
            this.a = null;
        }
    }
}
