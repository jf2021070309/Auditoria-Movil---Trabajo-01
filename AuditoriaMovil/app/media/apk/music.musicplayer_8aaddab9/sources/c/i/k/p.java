package c.i.k;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import c.i.k.d0;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class p {
    public ViewParent a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f2210b;

    /* renamed from: c  reason: collision with root package name */
    public final View f2211c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2212d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f2213e;

    public p(View view) {
        this.f2211c = view;
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent g2;
        if (!this.f2212d || (g2 = g(0)) == null) {
            return false;
        }
        View view = this.f2211c;
        if (Build.VERSION.SDK_INT < 21) {
            if (g2 instanceof s) {
                return ((s) g2).onNestedFling(view, f2, f3, z);
            }
            return false;
        }
        try {
            return g2.onNestedFling(view, f2, f3, z);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public boolean b(float f2, float f3) {
        ViewParent g2;
        if (!this.f2212d || (g2 = g(0)) == null) {
            return false;
        }
        View view = this.f2211c;
        if (Build.VERSION.SDK_INT < 21) {
            if (g2 instanceof s) {
                return ((s) g2).onNestedPreFling(view, f2, f3);
            }
            return false;
        }
        try {
            return g2.onNestedPreFling(view, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent g2;
        int i5;
        int i6;
        int[] iArr3;
        if (!this.f2212d || (g2 = g(i4)) == null) {
            return false;
        }
        if (i2 != 0 || i3 != 0) {
            if (iArr2 != null) {
                this.f2211c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i6 = iArr2[1];
            } else {
                i5 = 0;
                i6 = 0;
            }
            if (iArr == null) {
                if (this.f2213e == null) {
                    this.f2213e = new int[2];
                }
                iArr3 = this.f2213e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.f2211c;
            if (g2 instanceof q) {
                ((q) g2).o(view, i2, i3, iArr3, i4);
            } else if (i4 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        g2.onNestedPreScroll(view, i2, i3, iArr3);
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedPreScroll", e2);
                    }
                } else if (g2 instanceof s) {
                    ((s) g2).onNestedPreScroll(view, i2, i3, iArr3);
                }
            }
            if (iArr2 != null) {
                this.f2211c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i6;
            }
            if (iArr3[0] != 0 || iArr3[1] != 0) {
                return true;
            }
        } else if (iArr2 != null) {
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        return false;
    }

    public void d(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        f(i2, i3, i4, i5, null, i6, iArr2);
    }

    public boolean e(int i2, int i3, int i4, int i5, int[] iArr) {
        return f(i2, i3, i4, i5, iArr, 0, null);
    }

    public final boolean f(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent g2;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.f2212d || (g2 = g(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2211c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            if (this.f2213e == null) {
                this.f2213e = new int[2];
            }
            int[] iArr4 = this.f2213e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f2211c;
        if (g2 instanceof r) {
            ((r) g2).e(view, i2, i3, i4, i5, i6, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i4;
            iArr3[1] = iArr3[1] + i5;
            if (g2 instanceof q) {
                ((q) g2).k(view, i2, i3, i4, i5, i6);
            } else if (i6 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        g2.onNestedScroll(view, i2, i3, i4, i5);
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedScroll", e2);
                    }
                } else if (g2 instanceof s) {
                    ((s) g2).onNestedScroll(view, i2, i3, i4, i5);
                }
            }
        }
        if (iArr != null) {
            this.f2211c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    public final ViewParent g(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return null;
            }
            return this.f2210b;
        }
        return this.a;
    }

    public boolean h(int i2) {
        return g(i2) != null;
    }

    public void i(boolean z) {
        if (this.f2212d) {
            View view = this.f2211c;
            AtomicInteger atomicInteger = d0.a;
            if (Build.VERSION.SDK_INT >= 21) {
                d0.h.z(view);
            } else if (view instanceof o) {
                ((o) view).stopNestedScroll();
            }
        }
        this.f2212d = z;
    }

    public boolean j(int i2, int i3) {
        boolean z;
        if (g(i3) != null) {
            return true;
        }
        if (this.f2212d) {
            View view = this.f2211c;
            for (ViewParent parent = this.f2211c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f2211c;
                boolean z2 = parent instanceof q;
                if (z2) {
                    z = ((q) parent).l(view, view2, i2, i3);
                } else {
                    if (i3 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                z = parent.onStartNestedScroll(view, view2, i2);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                            }
                        } else if (parent instanceof s) {
                            z = ((s) parent).onStartNestedScroll(view, view2, i2);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i3 == 0) {
                        this.a = parent;
                    } else if (i3 == 1) {
                        this.f2210b = parent;
                    }
                    View view3 = this.f2211c;
                    if (z2) {
                        ((q) parent).m(view, view3, i2, i3);
                    } else if (i3 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                parent.onNestedScrollAccepted(view, view3, i2);
                            } catch (AbstractMethodError e3) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                            }
                        } else if (parent instanceof s) {
                            ((s) parent).onNestedScrollAccepted(view, view3, i2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = parent;
                }
            }
        }
        return false;
    }

    public void k(int i2) {
        ViewParent g2 = g(i2);
        if (g2 != null) {
            View view = this.f2211c;
            if (g2 instanceof q) {
                ((q) g2).n(view, i2);
            } else if (i2 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        g2.onStopNestedScroll(view);
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onStopNestedScroll", e2);
                    }
                } else if (g2 instanceof s) {
                    ((s) g2).onStopNestedScroll(view);
                }
            }
            if (i2 == 0) {
                this.a = null;
            } else if (i2 != 1) {
            } else {
                this.f2210b = null;
            }
        }
    }
}
