package c.b.i;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class f0 extends ListView {
    public final Rect a;

    /* renamed from: b  reason: collision with root package name */
    public int f1140b;

    /* renamed from: c  reason: collision with root package name */
    public int f1141c;

    /* renamed from: d  reason: collision with root package name */
    public int f1142d;

    /* renamed from: e  reason: collision with root package name */
    public int f1143e;

    /* renamed from: f  reason: collision with root package name */
    public int f1144f;

    /* renamed from: g  reason: collision with root package name */
    public Field f1145g;

    /* renamed from: h  reason: collision with root package name */
    public a f1146h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1147i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1148j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1149k;

    /* renamed from: l  reason: collision with root package name */
    public c.i.l.d f1150l;

    /* renamed from: m  reason: collision with root package name */
    public b f1151m;

    /* loaded from: classes.dex */
    public static class a extends c.b.e.a.c {

        /* renamed from: b  reason: collision with root package name */
        public boolean f1152b;

        public a(Drawable drawable) {
            super(drawable);
            this.f1152b = true;
        }

        @Override // c.b.e.a.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1152b) {
                this.a.draw(canvas);
            }
        }

        @Override // c.b.e.a.c, android.graphics.drawable.Drawable
        public void setHotspot(float f2, float f3) {
            if (this.f1152b) {
                c.i.a.a0(this.a, f2, f3);
            }
        }

        @Override // c.b.e.a.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f1152b) {
                c.i.a.b0(this.a, i2, i3, i4, i5);
            }
        }

        @Override // c.b.e.a.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1152b) {
                return this.a.setState(iArr);
            }
            return false;
        }

        @Override // c.b.e.a.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1152b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = f0.this;
            f0Var.f1151m = null;
            f0Var.drawableStateChanged();
        }
    }

    public f0(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.a = new Rect();
        this.f1140b = 0;
        this.f1141c = 0;
        this.f1142d = 0;
        this.f1143e = 0;
        this.f1148j = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1145g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.f1146h;
        if (aVar != null) {
            aVar.f1152b = z;
        }
    }

    public int a(int i2, int i3, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i2, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i3) {
                return (i4 < 0 || i6 <= i4 || i8 <= 0 || i5 == i3) ? i3 : i8;
            }
            if (i4 >= 0 && i6 >= i4) {
                i8 = i5;
            }
            i6++;
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r3 != 3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.i.f0.b(android.view.MotionEvent, int):boolean");
    }

    public final void c() {
        Drawable selector = getSelector();
        if (selector != null && this.f1149k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.a);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f1151m != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1148j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1148j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1148j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1148j && this.f1147i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f1151m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1151m == null) {
            b bVar = new b();
            this.f1151m = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1144f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1151m;
        if (bVar != null) {
            f0 f0Var = f0.this;
            f0Var.f1151m = null;
            f0Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f1147i = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1146h = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1140b = rect.left;
        this.f1141c = rect.top;
        this.f1142d = rect.right;
        this.f1143e = rect.bottom;
    }
}
