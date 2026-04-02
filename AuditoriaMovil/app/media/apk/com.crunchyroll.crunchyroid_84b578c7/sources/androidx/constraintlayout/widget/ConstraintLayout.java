package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.u2.d;
import com.amazon.aps.iva.u2.e;
import com.amazon.aps.iva.u2.f;
import com.amazon.aps.iva.u2.h;
import com.amazon.aps.iva.u2.j;
import com.amazon.aps.iva.u2.k;
import com.amazon.aps.iva.u2.l;
import com.amazon.aps.iva.u2.m;
import com.amazon.aps.iva.v2.b;
import com.amazon.aps.iva.y2.g;
import com.google.ads.AdSize;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.primitives.Ints;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.internal.http2.Http2Connection;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    private static com.amazon.aps.iva.y2.e sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.b> mConstraintHelpers;
    protected com.amazon.aps.iva.y2.a mConstraintLayoutSpec;
    private androidx.constraintlayout.widget.c mConstraintSet;
    private int mConstraintSetId;
    private com.amazon.aps.iva.y2.b mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected f mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    c mMeasurer;
    private com.amazon.aps.iva.s2.e mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<com.amazon.aps.iva.u2.e> mTempMapIdToWidget;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.b.values().length];
            a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements b.InterfaceC0780b {
        public final ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public c(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        public static boolean a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @SuppressLint({"WrongCall"})
        public final void b(com.amazon.aps.iva.u2.e eVar, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            int i;
            int i2;
            int i3;
            int i4;
            boolean z7;
            int baseline;
            int i5;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            int childMeasureSpec;
            int i6;
            boolean z12;
            boolean z13;
            boolean z14;
            int childMeasureSpec2;
            int i7;
            boolean z15;
            boolean z16;
            boolean z17;
            if (eVar == null) {
                return;
            }
            if (eVar.j0 == 8 && !eVar.G) {
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
            } else if (eVar.W == null) {
            } else {
                e.b bVar = aVar.a;
                e.b bVar2 = aVar.b;
                int i8 = aVar.c;
                int i9 = aVar.d;
                int i10 = this.b + this.c;
                int i11 = this.d;
                View view = (View) eVar.i0;
                int[] iArr = a.a;
                int i12 = iArr[bVar.ordinal()];
                com.amazon.aps.iva.u2.d dVar = eVar.M;
                com.amazon.aps.iva.u2.d dVar2 = eVar.K;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                makeMeasureSpec = 0;
                            } else {
                                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i11, -2);
                                if (eVar.s == 1) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                int i13 = aVar.j;
                                if (i13 == 1 || i13 == 2) {
                                    if (view.getMeasuredHeight() == eVar.l()) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (aVar.j != 2 && z15 && ((!z15 || !z16) && !(view instanceof e) && !eVar.B())) {
                                        z17 = false;
                                    } else {
                                        z17 = true;
                                    }
                                    if (z17) {
                                        childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.r(), Ints.MAX_POWER_OF_TWO);
                                    }
                                }
                            }
                        } else {
                            int i14 = this.f;
                            if (dVar2 != null) {
                                i7 = dVar2.g + 0;
                            } else {
                                i7 = 0;
                            }
                            if (dVar != null) {
                                i7 += dVar.g;
                            }
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i11 + i7, -1);
                        }
                    } else {
                        childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f, i11, -2);
                    }
                    makeMeasureSpec = childMeasureSpec2;
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, Ints.MAX_POWER_OF_TWO);
                }
                int i15 = iArr[bVar2.ordinal()];
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 != 4) {
                                makeMeasureSpec2 = 0;
                            } else {
                                childMeasureSpec = ViewGroup.getChildMeasureSpec(this.g, i10, -2);
                                if (eVar.t == 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                int i16 = aVar.j;
                                if (i16 == 1 || i16 == 2) {
                                    if (view.getMeasuredWidth() == eVar.r()) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (aVar.j != 2 && z12 && ((!z12 || !z13) && !(view instanceof e) && !eVar.C())) {
                                        z14 = false;
                                    } else {
                                        z14 = true;
                                    }
                                    if (z14) {
                                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.l(), Ints.MAX_POWER_OF_TWO);
                                    }
                                }
                            }
                        } else {
                            int i17 = this.g;
                            if (dVar2 != null) {
                                i6 = eVar.L.g + 0;
                            } else {
                                i6 = 0;
                            }
                            if (dVar != null) {
                                i6 += eVar.N.g;
                            }
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i17, i10 + i6, -1);
                        }
                    } else {
                        childMeasureSpec = ViewGroup.getChildMeasureSpec(this.g, i10, -2);
                    }
                    makeMeasureSpec2 = childMeasureSpec;
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, Ints.MAX_POWER_OF_TWO);
                }
                f fVar = (f) eVar.W;
                ConstraintLayout constraintLayout = ConstraintLayout.this;
                if (fVar != null && k.b(constraintLayout.mOptimizationLevel, 256) && view.getMeasuredWidth() == eVar.r() && view.getMeasuredWidth() < fVar.r() && view.getMeasuredHeight() == eVar.l() && view.getMeasuredHeight() < fVar.l() && view.getBaseline() == eVar.d0 && !eVar.A()) {
                    if (a(eVar.I, makeMeasureSpec, eVar.r()) && a(eVar.J, makeMeasureSpec2, eVar.l())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        aVar.e = eVar.r();
                        aVar.f = eVar.l();
                        aVar.g = eVar.d0;
                        return;
                    }
                }
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar3) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVar2 == bVar3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                e.b bVar4 = e.b.MATCH_PARENT;
                if (bVar2 != bVar4 && bVar2 != e.b.FIXED) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (bVar != bVar4 && bVar != e.b.FIXED) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z && eVar.Z > 0.0f) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z2 && eVar.Z > 0.0f) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (view == null) {
                    return;
                }
                b bVar5 = (b) view.getLayoutParams();
                int i18 = aVar.j;
                if (i18 != 1 && i18 != 2 && z && eVar.s == 0 && z2 && eVar.t == 0) {
                    i5 = -1;
                    baseline = 0;
                    z7 = false;
                    i = 0;
                    i2 = 0;
                } else {
                    if ((view instanceof g) && (eVar instanceof l)) {
                        ((g) view).m((l) eVar, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    eVar.I = makeMeasureSpec;
                    eVar.J = makeMeasureSpec2;
                    eVar.g = false;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    int i19 = eVar.v;
                    if (i19 > 0) {
                        i = Math.max(i19, measuredWidth);
                    } else {
                        i = measuredWidth;
                    }
                    int i20 = eVar.w;
                    if (i20 > 0) {
                        i = Math.min(i20, i);
                    }
                    int i21 = eVar.y;
                    if (i21 > 0) {
                        i2 = Math.max(i21, measuredHeight);
                    } else {
                        i2 = measuredHeight;
                    }
                    int i22 = makeMeasureSpec;
                    int i23 = eVar.z;
                    if (i23 > 0) {
                        i2 = Math.min(i23, i2);
                    }
                    if (!k.b(constraintLayout.mOptimizationLevel, 1)) {
                        if (z5 && z3) {
                            i = (int) ((i2 * eVar.Z) + 0.5f);
                        } else if (z6 && z4) {
                            i2 = (int) ((i / eVar.Z) + 0.5f);
                        }
                    }
                    if (measuredWidth == i && measuredHeight == i2) {
                        baseline = baseline2;
                        i5 = -1;
                        z7 = false;
                    } else {
                        if (measuredWidth != i) {
                            i3 = Ints.MAX_POWER_OF_TWO;
                            i4 = View.MeasureSpec.makeMeasureSpec(i, Ints.MAX_POWER_OF_TWO);
                        } else {
                            i3 = Ints.MAX_POWER_OF_TWO;
                            i4 = i22;
                        }
                        if (measuredHeight != i2) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, i3);
                        }
                        view.measure(i4, makeMeasureSpec2);
                        eVar.I = i4;
                        eVar.J = makeMeasureSpec2;
                        z7 = false;
                        eVar.g = false;
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        i = measuredWidth2;
                        i2 = measuredHeight2;
                        i5 = -1;
                    }
                }
                if (baseline != i5) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                if (i == aVar.c && i2 == aVar.d) {
                    z9 = z7;
                } else {
                    z9 = true;
                }
                aVar.i = z9;
                if (bVar5.c0) {
                    z10 = true;
                } else {
                    z10 = z8;
                }
                if (z10 && baseline != -1 && eVar.d0 != baseline) {
                    aVar.i = true;
                }
                aVar.e = i;
                aVar.f = i2;
                aVar.h = z10;
                aVar.g = baseline;
            }
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static com.amazon.aps.iva.y2.e getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new com.amazon.aps.iva.y2.e();
        }
        return sSharedValues;
    }

    private final com.amazon.aps.iva.u2.e getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).q0;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        f fVar = this.mLayoutWidget;
        fVar.i0 = this;
        c cVar = this.mMeasurer;
        fVar.w0 = cVar;
        fVar.u0.f = cVar;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.amazon.aps.iva.y2.d.b, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 113) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
                        this.mConstraintSet = cVar2;
                        cVar2.m(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        f fVar2 = this.mLayoutWidget;
        fVar2.F0 = this.mOptimizationLevel;
        com.amazon.aps.iva.s2.d.p = fVar2.W(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            com.amazon.aps.iva.u2.e viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.D();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).k0 = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof d)) {
                    this.mConstraintSet = ((d) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.c cVar = this.mConstraintSet;
        if (cVar != null) {
            cVar.c(this);
        }
        this.mLayoutWidget.s0.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                androidx.constraintlayout.widget.b bVar = this.mConstraintHelpers.get(i4);
                if (bVar.isInEditMode()) {
                    bVar.setIds(bVar.f);
                }
                j jVar = bVar.e;
                if (jVar != null) {
                    jVar.t0 = 0;
                    Arrays.fill(jVar.s0, (Object) null);
                    for (int i5 = 0; i5 < bVar.c; i5++) {
                        int i6 = bVar.b[i5];
                        View viewById = getViewById(i6);
                        if (viewById == null) {
                            Integer valueOf = Integer.valueOf(i6);
                            HashMap<Integer, String> hashMap = bVar.i;
                            String str = hashMap.get(valueOf);
                            int i7 = bVar.i(this, str);
                            if (i7 != 0) {
                                bVar.b[i5] = i7;
                                hashMap.put(Integer.valueOf(i7), str);
                                viewById = getViewById(i7);
                            }
                        }
                        if (viewById != null) {
                            j jVar2 = bVar.e;
                            com.amazon.aps.iva.u2.e viewWidget2 = getViewWidget(viewById);
                            jVar2.getClass();
                            if (viewWidget2 != jVar2 && viewWidget2 != null) {
                                int i8 = jVar2.t0 + 1;
                                com.amazon.aps.iva.u2.e[] eVarArr = jVar2.s0;
                                if (i8 > eVarArr.length) {
                                    jVar2.s0 = (com.amazon.aps.iva.u2.e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
                                }
                                com.amazon.aps.iva.u2.e[] eVarArr2 = jVar2.s0;
                                int i9 = jVar2.t0;
                                eVarArr2[i9] = viewWidget2;
                                jVar2.t0 = i9 + 1;
                            }
                        }
                    }
                    bVar.e.a();
                }
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt3 = getChildAt(i10);
            if (childAt3 instanceof e) {
                e eVar = (e) childAt3;
                if (eVar.b == -1 && !eVar.isInEditMode()) {
                    eVar.setVisibility(eVar.d);
                }
                View findViewById = findViewById(eVar.b);
                eVar.c = findViewById;
                if (findViewById != null) {
                    ((b) findViewById.getLayoutParams()).f0 = true;
                    eVar.c.setVisibility(0);
                    eVar.setVisibility(0);
                }
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt4 = getChildAt(i11);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt5 = getChildAt(i12);
            com.amazon.aps.iva.u2.e viewWidget3 = getViewWidget(childAt5);
            if (viewWidget3 != null) {
                b bVar2 = (b) childAt5.getLayoutParams();
                f fVar = this.mLayoutWidget;
                fVar.s0.add(viewWidget3);
                com.amazon.aps.iva.u2.e eVar2 = viewWidget3.W;
                if (eVar2 != null) {
                    ((m) eVar2).s0.remove(viewWidget3);
                    viewWidget3.D();
                }
                viewWidget3.W = fVar;
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget3, bVar2, this.mTempMapIdToWidget);
            }
        }
    }

    private void setWidgetBaseline(com.amazon.aps.iva.u2.e eVar, b bVar, SparseArray<com.amazon.aps.iva.u2.e> sparseArray, int i, d.b bVar2) {
        View view = this.mChildrenByIds.get(i);
        com.amazon.aps.iva.u2.e eVar2 = sparseArray.get(i);
        if (eVar2 != null && view != null && (view.getLayoutParams() instanceof b)) {
            bVar.c0 = true;
            d.b bVar3 = d.b.BASELINE;
            if (bVar2 == bVar3) {
                b bVar4 = (b) view.getLayoutParams();
                bVar4.c0 = true;
                bVar4.q0.F = true;
            }
            eVar.j(bVar3).b(eVar2.j(bVar2), bVar.D, bVar.C, true);
            eVar.F = true;
            eVar.j(d.b.TOP).j();
            eVar.j(d.b.BOTTOM).j();
        }
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x02cf -> B:153:0x02d0). Please submit an issue!!! */
    public void applyConstraintsFromLayoutParams(boolean z, View view, com.amazon.aps.iva.u2.e eVar, b bVar, SparseArray<com.amazon.aps.iva.u2.e> sparseArray) {
        float f;
        com.amazon.aps.iva.u2.e eVar2;
        com.amazon.aps.iva.u2.e eVar3;
        com.amazon.aps.iva.u2.e eVar4;
        com.amazon.aps.iva.u2.e eVar5;
        int i;
        int i2;
        float f2;
        int i3;
        float f3;
        bVar.a();
        eVar.j0 = view.getVisibility();
        if (bVar.f0) {
            eVar.G = true;
            eVar.j0 = 8;
        }
        eVar.i0 = view;
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).k(eVar, this.mLayoutWidget.x0);
        }
        int i4 = -1;
        if (bVar.d0) {
            h hVar = (h) eVar;
            int i5 = bVar.n0;
            int i6 = bVar.o0;
            float f4 = bVar.p0;
            int i7 = (f4 > (-1.0f) ? 1 : (f4 == (-1.0f) ? 0 : -1));
            if (i7 != 0) {
                if (i7 > 0) {
                    hVar.s0 = f4;
                    hVar.t0 = -1;
                    hVar.u0 = -1;
                    return;
                }
                return;
            } else if (i5 != -1) {
                if (i5 > -1) {
                    hVar.s0 = -1.0f;
                    hVar.t0 = i5;
                    hVar.u0 = -1;
                    return;
                }
                return;
            } else if (i6 != -1 && i6 > -1) {
                hVar.s0 = -1.0f;
                hVar.t0 = -1;
                hVar.u0 = i6;
                return;
            } else {
                return;
            }
        }
        int i8 = bVar.g0;
        int i9 = bVar.h0;
        int i10 = bVar.i0;
        int i11 = bVar.j0;
        int i12 = bVar.k0;
        int i13 = bVar.l0;
        float f5 = bVar.m0;
        int i14 = bVar.p;
        if (i14 != -1) {
            com.amazon.aps.iva.u2.e eVar6 = sparseArray.get(i14);
            if (eVar6 != null) {
                float f6 = bVar.r;
                int i15 = bVar.q;
                d.b bVar2 = d.b.CENTER;
                f3 = 0.0f;
                eVar.w(bVar2, eVar6, bVar2, i15, 0);
                eVar.E = f6;
            } else {
                f3 = 0.0f;
            }
            f = f3;
        } else {
            if (i8 != -1) {
                com.amazon.aps.iva.u2.e eVar7 = sparseArray.get(i8);
                if (eVar7 != null) {
                    d.b bVar3 = d.b.LEFT;
                    f = 0.0f;
                    eVar.w(bVar3, eVar7, bVar3, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i12);
                } else {
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
                if (i9 != -1 && (eVar2 = sparseArray.get(i9)) != null) {
                    eVar.w(d.b.LEFT, eVar2, d.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i12);
                }
            }
            if (i10 != -1) {
                com.amazon.aps.iva.u2.e eVar8 = sparseArray.get(i10);
                if (eVar8 != null) {
                    eVar.w(d.b.RIGHT, eVar8, d.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i13);
                }
            } else if (i11 != -1 && (eVar3 = sparseArray.get(i11)) != null) {
                d.b bVar4 = d.b.RIGHT;
                eVar.w(bVar4, eVar3, bVar4, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i13);
            }
            int i16 = bVar.i;
            if (i16 != -1) {
                com.amazon.aps.iva.u2.e eVar9 = sparseArray.get(i16);
                if (eVar9 != null) {
                    d.b bVar5 = d.b.TOP;
                    eVar.w(bVar5, eVar9, bVar5, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.x);
                }
            } else {
                int i17 = bVar.j;
                if (i17 != -1 && (eVar4 = sparseArray.get(i17)) != null) {
                    eVar.w(d.b.TOP, eVar4, d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.x);
                }
            }
            int i18 = bVar.k;
            if (i18 != -1) {
                com.amazon.aps.iva.u2.e eVar10 = sparseArray.get(i18);
                if (eVar10 != null) {
                    eVar.w(d.b.BOTTOM, eVar10, d.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.z);
                }
            } else {
                int i19 = bVar.l;
                if (i19 != -1 && (eVar5 = sparseArray.get(i19)) != null) {
                    d.b bVar6 = d.b.BOTTOM;
                    eVar.w(bVar6, eVar5, bVar6, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.z);
                }
            }
            int i20 = bVar.m;
            if (i20 != -1) {
                setWidgetBaseline(eVar, bVar, sparseArray, i20, d.b.BASELINE);
            } else {
                int i21 = bVar.n;
                if (i21 != -1) {
                    setWidgetBaseline(eVar, bVar, sparseArray, i21, d.b.TOP);
                } else {
                    int i22 = bVar.o;
                    if (i22 != -1) {
                        setWidgetBaseline(eVar, bVar, sparseArray, i22, d.b.BOTTOM);
                    }
                }
            }
            if (f5 >= f) {
                eVar.g0 = f5;
            }
            float f7 = bVar.F;
            if (f7 >= f) {
                eVar.h0 = f7;
            }
        }
        if (z && ((i3 = bVar.T) != -1 || bVar.U != -1)) {
            int i23 = bVar.U;
            eVar.b0 = i3;
            eVar.c0 = i23;
        }
        int i24 = 0;
        if (!bVar.a0) {
            if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
                if (bVar.W) {
                    eVar.M(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar.M(e.b.MATCH_PARENT);
                }
                eVar.j(d.b.LEFT).g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                eVar.j(d.b.RIGHT).g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            } else {
                eVar.M(e.b.MATCH_CONSTRAINT);
                eVar.O(0);
            }
        } else {
            eVar.M(e.b.FIXED);
            eVar.O(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.M(e.b.WRAP_CONTENT);
            }
        }
        if (!bVar.b0) {
            if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
                if (bVar.X) {
                    eVar.N(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar.N(e.b.MATCH_PARENT);
                }
                eVar.j(d.b.TOP).g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                eVar.j(d.b.BOTTOM).g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            } else {
                eVar.N(e.b.MATCH_CONSTRAINT);
                eVar.L(0);
            }
        } else {
            eVar.N(e.b.FIXED);
            eVar.L(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.N(e.b.WRAP_CONTENT);
            }
        }
        String str = bVar.G;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i4 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                    i4 = 1;
                    i2 = indexOf + i;
                }
                i = 1;
                i2 = indexOf + i;
            } else {
                i = 1;
                i2 = 0;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - i) {
                String substring2 = str.substring(i2, indexOf2);
                String substring3 = str.substring(indexOf2 + i);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > f && parseFloat2 > f) {
                        if (i4 == 1) {
                            f2 = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f2 = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f2 = f;
            } else {
                String substring4 = str.substring(i2);
                if (substring4.length() > 0) {
                    f2 = Float.parseFloat(substring4);
                }
                f2 = f;
            }
            if (f2 > f) {
                eVar.Z = f2;
                eVar.a0 = i4;
            }
        } else {
            eVar.Z = f;
        }
        float f8 = bVar.H;
        float[] fArr = eVar.n0;
        fArr[0] = f8;
        fArr[1] = bVar.I;
        eVar.l0 = bVar.J;
        eVar.m0 = bVar.K;
        int i25 = bVar.Z;
        if (i25 >= 0 && i25 <= 3) {
            eVar.r = i25;
        }
        int i26 = bVar.L;
        int i27 = bVar.N;
        int i28 = bVar.P;
        float f9 = bVar.R;
        eVar.s = i26;
        eVar.v = i27;
        if (i28 == Integer.MAX_VALUE) {
            i28 = 0;
        }
        eVar.w = i28;
        eVar.x = f9;
        if (f9 > f && f9 < 1.0f && i26 == 0) {
            eVar.s = 2;
        }
        int i29 = bVar.M;
        int i30 = bVar.O;
        int i31 = bVar.Q;
        float f10 = bVar.S;
        eVar.t = i29;
        eVar.y = i30;
        if (i31 != Integer.MAX_VALUE) {
            i24 = i31;
        }
        eVar.z = i24;
        eVar.A = f10;
        if (f10 > f && f10 < 1.0f && i29 == 0) {
            eVar.t = 2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(com.amazon.aps.iva.s2.e eVar) {
        this.mLayoutWidget.y0.getClass();
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.mDesignIds;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.mDesignIds.get(str);
            }
            return null;
        }
        return null;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.F0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.k == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.k = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.k = "parent";
            }
        }
        f fVar = this.mLayoutWidget;
        if (fVar.k0 == null) {
            fVar.k0 = fVar.k;
        }
        Iterator<com.amazon.aps.iva.u2.e> it = fVar.s0.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.u2.e next = it.next();
            View view = (View) next.i0;
            if (view != null) {
                if (next.k == null && (id = view.getId()) != -1) {
                    next.k = getContext().getResources().getResourceEntryName(id);
                }
                if (next.k0 == null) {
                    next.k0 = next.k;
                }
            }
        }
        this.mLayoutWidget.o(sb);
        return sb.toString();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final com.amazon.aps.iva.u2.e getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).q0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).q0;
            }
            return null;
        }
        return null;
    }

    public boolean isRtl() {
        boolean z;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new com.amazon.aps.iva.y2.a(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
                return;
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            com.amazon.aps.iva.u2.e eVar = bVar.q0;
            if ((childAt.getVisibility() != 8 || bVar.d0 || bVar.e0 || isInEditMode) && !bVar.f0) {
                int s = eVar.s();
                int t = eVar.t();
                int r = eVar.r() + s;
                int l = eVar.l() + t;
                childAt.layout(s, t, r, l);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(s, t, r, l);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).getClass();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOnMeasureWidthMeasureSpec == i) {
            int i3 = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                } else if (getChildAt(i4).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i4++;
                }
            }
        }
        boolean z = this.mDirtyHierarchy;
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.x0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                f fVar = this.mLayoutWidget;
                fVar.t0.c(fVar);
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        int r = this.mLayoutWidget.r();
        int l = this.mLayoutWidget.l();
        f fVar2 = this.mLayoutWidget;
        resolveMeasuredDimension(i, i2, r, l, fVar2.G0, fVar2.H0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        com.amazon.aps.iva.u2.e viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof h)) {
            b bVar = (b) view.getLayoutParams();
            h hVar = new h();
            bVar.q0 = hVar;
            bVar.d0 = true;
            hVar.S(bVar.V);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.l();
            ((b) view.getLayoutParams()).e0 = true;
            if (!this.mConstraintHelpers.contains(bVar2)) {
                this.mConstraintHelpers.add(bVar2);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        com.amazon.aps.iva.u2.e viewWidget = getViewWidget(view);
        this.mLayoutWidget.s0.remove(viewWidget);
        viewWidget.D();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new com.amazon.aps.iva.y2.a(getContext(), this, i);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        c cVar = this.mMeasurer;
        int i5 = cVar.e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + cVar.d, i, 0);
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z2) {
            min2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void resolveSystem(com.amazon.aps.iva.u2.f r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 1629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.resolveSystem(com.amazon.aps.iva.u2.f, int, int, int):void");
    }

    public void setConstraintSet(androidx.constraintlayout.widget.c cVar) {
        this.mConstraintSet = cVar;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(com.amazon.aps.iva.y2.b bVar) {
        com.amazon.aps.iva.y2.a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        f fVar = this.mLayoutWidget;
        fVar.F0 = i;
        com.amazon.aps.iva.s2.d.p = fVar.W(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    public void setSelfDimensionBehaviour(f fVar, int i, int i2, int i3, int i4) {
        e.b bVar;
        c cVar = this.mMeasurer;
        int i5 = cVar.e;
        int i6 = cVar.d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i != 0) {
                if (i != 1073741824) {
                    bVar = bVar2;
                    i2 = 0;
                } else {
                    i2 = Math.min(this.mMaxWidth - i6, i2);
                    bVar = bVar2;
                }
            } else {
                bVar = e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.mMinWidth);
                }
                i2 = 0;
            }
        } else {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 != 0) {
                if (i3 == 1073741824) {
                    i4 = Math.min(this.mMaxHeight - i5, i4);
                }
                i4 = 0;
            } else {
                bVar2 = e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.mMinHeight);
                }
                i4 = 0;
            }
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        }
        if (i2 != fVar.r() || i4 != fVar.l()) {
            fVar.u0.c = true;
        }
        fVar.b0 = 0;
        fVar.c0 = 0;
        int[] iArr = fVar.D;
        iArr[0] = this.mMaxWidth - i6;
        iArr[1] = this.mMaxHeight - i5;
        fVar.e0 = 0;
        fVar.f0 = 0;
        fVar.M(bVar);
        fVar.O(i2);
        fVar.N(bVar2);
        fVar.L(i4);
        int i7 = this.mMinWidth - i6;
        if (i7 < 0) {
            fVar.e0 = 0;
        } else {
            fVar.e0 = i7;
        }
        int i8 = this.mMinHeight - i5;
        if (i8 < 0) {
            fVar.f0 = 0;
        } else {
            fVar.f0 = i8;
        }
    }

    public void setState(int i, int i2, int i3) {
        com.amazon.aps.iva.y2.a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.b(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public boolean c0;
        public final boolean d;
        public boolean d0;
        public int e;
        public boolean e0;
        public int f;
        public boolean f0;
        public int g;
        public int g0;
        public int h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public int j0;
        public int k;
        public int k0;
        public int l;
        public int l0;
        public int m;
        public float m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public float p0;
        public int q;
        public com.amazon.aps.iva.u2.e q0;
        public float r;
        public int s;
        public int t;
        public int u;
        public int v;
        public final int w;
        public int x;
        public final int y;
        public int z;

        /* loaded from: classes.dex */
        public static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(MediaError.DetailedErrorCode.MEDIA_NETWORK, 49);
                sparseIntArray.append(MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(MediaError.DetailedErrorCode.MEDIA_DECODE, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new com.amazon.aps.iva.u2.e();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.y2.d.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = a.a.get(index);
                switch (i2) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f;
                        if (f < 0.0f) {
                            this.r = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId2;
                        if (resourceId2 == -1) {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 == -1) {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 == -1) {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 == -1) {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        this.L = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.M = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                androidx.constraintlayout.widget.c.q(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                continue;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                continue;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                continue;
                            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                continue;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i2) {
                                    case 64:
                                        androidx.constraintlayout.widget.c.p(this, obtainStyledAttributes, index, 0);
                                        continue;
                                        continue;
                                    case 65:
                                        androidx.constraintlayout.widget.c.p(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 67:
                                        this.d = obtainStyledAttributes.getBoolean(index, this.d);
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.d0 = false;
            this.a0 = true;
            this.b0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.W) {
                this.a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.X) {
                this.b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.a0 = false;
                if (i == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.b0 = false;
                if (i2 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.c != -1.0f || this.a != -1 || this.b != -1) {
                this.d0 = true;
                this.a0 = true;
                this.b0 = true;
                if (!(this.q0 instanceof h)) {
                    this.q0 = new h();
                }
                ((h) this.q0).S(this.V);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new com.amazon.aps.iva.u2.e();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new com.amazon.aps.iva.u2.e();
        }
    }
}
