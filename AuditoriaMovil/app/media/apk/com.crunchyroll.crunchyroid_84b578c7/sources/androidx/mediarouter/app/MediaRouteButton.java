package androidx.mediarouter.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import com.amazon.aps.iva.e8.e;
import com.amazon.aps.iva.e8.f;
import com.amazon.aps.iva.f8.e0;
import com.amazon.aps.iva.f8.f0;
import com.amazon.aps.iva.f8.q0;
import com.amazon.aps.iva.h3.a;
import com.amazon.aps.iva.q.h1;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public class MediaRouteButton extends View {
    public static final SparseArray<Drawable.ConstantState> q = new SparseArray<>(2);
    public static final int[] r = {16842912};
    public static final int[] s = {16842911};
    public final f0 b;
    public final a c;
    public e0 d;
    public f e;
    public boolean f;
    public boolean g;
    public b h;
    public Drawable i;
    public int j;
    public int k;
    public int l;
    public final ColorStateList m;
    public final int n;
    public final int o;
    public boolean p;

    /* loaded from: classes.dex */
    public final class a extends f0.a {
        public a() {
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onProviderAdded(f0 f0Var, f0.g gVar) {
            MediaRouteButton.this.b();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onProviderChanged(f0 f0Var, f0.g gVar) {
            MediaRouteButton.this.b();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onProviderRemoved(f0 f0Var, f0.g gVar) {
            MediaRouteButton.this.b();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteAdded(f0 f0Var, f0.h hVar) {
            MediaRouteButton.this.b();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteChanged(f0 f0Var, f0.h hVar) {
            MediaRouteButton.this.b();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteRemoved(f0 f0Var, f0.h hVar) {
            MediaRouteButton.this.b();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteSelected(f0 f0Var, f0.h hVar) {
            MediaRouteButton.this.b();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteUnselected(f0 f0Var, f0.h hVar) {
            MediaRouteButton.this.b();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouterParamsChanged(f0 f0Var, q0 q0Var) {
            boolean z;
            if (q0Var != null) {
                z = q0Var.e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON");
            } else {
                z = false;
            }
            MediaRouteButton mediaRouteButton = MediaRouteButton.this;
            if (mediaRouteButton.g != z) {
                mediaRouteButton.g = z;
                mediaRouteButton.refreshDrawableState();
            }
        }
    }

    /* loaded from: classes.dex */
    public final class b extends AsyncTask<Void, Void, Drawable> {
        public final int a;
        public final Context b;

        public b(int i, Context context) {
            this.a = i;
            this.b = context;
        }

        @Override // android.os.AsyncTask
        public final Drawable doInBackground(Void[] voidArr) {
            SparseArray<Drawable.ConstantState> sparseArray = MediaRouteButton.q;
            int i = this.a;
            if (sparseArray.get(i) == null) {
                return com.amazon.aps.iva.l.a.a(this.b, i);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Drawable drawable) {
            Drawable drawable2 = drawable;
            if (drawable2 != null) {
                MediaRouteButton.q.put(this.a, drawable2.getConstantState());
            }
            MediaRouteButton.this.h = null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Drawable drawable) {
            Drawable drawable2 = drawable;
            int i = this.a;
            MediaRouteButton mediaRouteButton = MediaRouteButton.this;
            if (drawable2 != null) {
                MediaRouteButton.q.put(i, drawable2.getConstantState());
                mediaRouteButton.h = null;
            } else {
                Drawable.ConstantState constantState = MediaRouteButton.q.get(i);
                if (constantState != null) {
                    drawable2 = constantState.newDrawable();
                }
                mediaRouteButton.h = null;
            }
            mediaRouteButton.setRemoteIndicatorDrawableInternal(drawable2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaRouteButton(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = androidx.mediarouter.app.d.f(r9)
            r0.<init>(r9, r1)
            r9 = 2130969673(0x7f040449, float:1.7548035E38)
            int r9 = androidx.mediarouter.app.d.h(r9, r0)
            if (r9 == 0) goto L18
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r0, r9)
            r0 = r1
        L18:
            r9 = 2130969661(0x7f04043d, float:1.754801E38)
            r8.<init>(r0, r10, r9)
            com.amazon.aps.iva.f8.e0 r0 = com.amazon.aps.iva.f8.e0.c
            r8.d = r0
            com.amazon.aps.iva.e8.f r0 = com.amazon.aps.iva.e8.f.getDefault()
            r8.e = r0
            android.content.Context r0 = r8.getContext()
            int[] r3 = com.amazon.aps.iva.d8.a.a
            r7 = 0
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r10, r3, r9, r7)
            r6 = 2130969661(0x7f04043d, float:1.754801E38)
            r1 = r8
            r2 = r0
            r4 = r10
            r5 = r9
            com.amazon.aps.iva.p3.g0.m(r1, r2, r3, r4, r5, r6)
            boolean r10 = r8.isInEditMode()
            r1 = 3
            if (r10 == 0) goto L55
            r10 = 0
            r8.b = r10
            r8.c = r10
            int r9 = r9.getResourceId(r1, r7)
            android.graphics.drawable.Drawable r9 = com.amazon.aps.iva.l.a.a(r0, r9)
            r8.i = r9
            goto Lde
        L55:
            com.amazon.aps.iva.f8.f0 r10 = com.amazon.aps.iva.f8.f0.d(r0)
            r8.b = r10
            androidx.mediarouter.app.MediaRouteButton$a r10 = new androidx.mediarouter.app.MediaRouteButton$a
            r10.<init>()
            r8.c = r10
            com.amazon.aps.iva.f8.f0$h r10 = com.amazon.aps.iva.f8.f0.g()
            boolean r0 = r10.f()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L71
            int r10 = r10.h
            goto L72
        L71:
            r10 = r7
        L72:
            r8.l = r10
            r8.k = r10
            r10 = 4
            android.content.res.ColorStateList r10 = r9.getColorStateList(r10)
            r8.m = r10
            int r10 = r9.getDimensionPixelSize(r7, r7)
            r8.n = r10
            int r10 = r9.getDimensionPixelSize(r2, r7)
            r8.o = r10
            int r10 = r9.getResourceId(r1, r7)
            r0 = 2
            int r0 = r9.getResourceId(r0, r7)
            r8.j = r0
            r9.recycle()
            int r9 = r8.j
            android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = androidx.mediarouter.app.MediaRouteButton.q
            if (r9 == 0) goto Lac
            java.lang.Object r9 = r0.get(r9)
            android.graphics.drawable.Drawable$ConstantState r9 = (android.graphics.drawable.Drawable.ConstantState) r9
            if (r9 == 0) goto Lac
            android.graphics.drawable.Drawable r9 = r9.newDrawable()
            r8.setRemoteIndicatorDrawable(r9)
        Lac:
            android.graphics.drawable.Drawable r9 = r8.i
            if (r9 != 0) goto Ld8
            if (r10 == 0) goto Ld5
            java.lang.Object r9 = r0.get(r10)
            android.graphics.drawable.Drawable$ConstantState r9 = (android.graphics.drawable.Drawable.ConstantState) r9
            if (r9 == 0) goto Lc2
            android.graphics.drawable.Drawable r9 = r9.newDrawable()
            r8.setRemoteIndicatorDrawableInternal(r9)
            goto Ld8
        Lc2:
            androidx.mediarouter.app.MediaRouteButton$b r9 = new androidx.mediarouter.app.MediaRouteButton$b
            android.content.Context r0 = r8.getContext()
            r9.<init>(r10, r0)
            r8.h = r9
            java.util.concurrent.Executor r10 = android.os.AsyncTask.SERIAL_EXECUTOR
            java.lang.Void[] r0 = new java.lang.Void[r7]
            r9.executeOnExecutor(r10, r0)
            goto Ld8
        Ld5:
            r8.a()
        Ld8:
            r8.e()
            r8.setClickable(r2)
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private FragmentManager getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof h) {
            return ((h) activity).getSupportFragmentManager();
        }
        return null;
    }

    public final void a() {
        if (this.j > 0) {
            b bVar = this.h;
            if (bVar != null) {
                bVar.cancel(false);
            }
            b bVar2 = new b(this.j, getContext());
            this.h = bVar2;
            this.j = 0;
            bVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        int i;
        this.b.getClass();
        f0.h g = f0.g();
        if (!g.f()) {
            i = g.h;
        } else {
            i = 0;
        }
        if (this.l != i) {
            this.l = i;
            e();
            refreshDrawableState();
        }
        if (i == 1) {
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fc, code lost:
        if (r3 != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteButton.c():boolean");
    }

    public final boolean d(int i) {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            this.b.getClass();
            if (f0.g().f()) {
                if (fragmentManager.C("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                    return false;
                }
                com.amazon.aps.iva.e8.d onCreateChooserDialogFragment = this.e.onCreateChooserDialogFragment();
                onCreateChooserDialogFragment.setRouteSelector(this.d);
                if (i == 2) {
                    onCreateChooserDialogFragment.setUseDynamicGroup(true);
                }
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                aVar.d(0, onCreateChooserDialogFragment, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
                aVar.i();
            } else if (fragmentManager.C("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                return false;
            } else {
                e onCreateControllerDialogFragment = this.e.onCreateControllerDialogFragment();
                onCreateControllerDialogFragment.setRouteSelector(this.d);
                if (i == 2) {
                    onCreateControllerDialogFragment.setUseDynamicGroup(true);
                }
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
                aVar2.d(0, onCreateControllerDialogFragment, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
                aVar2.i();
            }
            return true;
        }
        throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.i != null) {
            this.i.setState(getDrawableState());
            if (this.i.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.i.getCurrent();
                int i = this.l;
                if (i != 1 && this.k == i) {
                    if (i == 2 && !animationDrawable.isRunning()) {
                        animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                    }
                } else if (!animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
            }
            invalidate();
        }
        this.k = this.l;
    }

    public final void e() {
        int i;
        int i2 = this.l;
        if (i2 != 1) {
            if (i2 != 2) {
                i = R.string.mr_cast_button_disconnected;
            } else {
                i = R.string.mr_cast_button_connected;
            }
        } else {
            i = R.string.mr_cast_button_connecting;
        }
        String string = getContext().getString(i);
        setContentDescription(string);
        h1.a(this, (!this.p || TextUtils.isEmpty(string)) ? null : null);
    }

    public f getDialogFactory() {
        return this.e;
    }

    public e0 getRouteSelector() {
        return this.d;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.f = true;
        if (!this.d.d()) {
            this.b.a(this.d, this.c, 0);
        }
        b();
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.b == null) {
            return onCreateDrawableState;
        }
        if (this.g) {
            return onCreateDrawableState;
        }
        int i2 = this.l;
        if (i2 != 1) {
            if (i2 == 2) {
                View.mergeDrawableStates(onCreateDrawableState, r);
            }
        } else {
            View.mergeDrawableStates(onCreateDrawableState, s);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f = false;
            if (!this.d.d()) {
                this.b.i(this.c);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.i != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.i.getIntrinsicWidth();
            int intrinsicHeight = this.i.getIntrinsicHeight();
            int i = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i2 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.i.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.i.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Drawable drawable = this.i;
        int i4 = 0;
        if (drawable != null) {
            i3 = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            i3 = 0;
        }
        int max = Math.max(this.n, i3);
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            i4 = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int max2 = Math.max(this.o, i4);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                size = max;
            }
        } else {
            size = Math.min(size, max);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = max2;
            }
        } else {
            size2 = Math.min(size2, max2);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        a();
        if (!c() && !performClick) {
            return false;
        }
        return true;
    }

    public void setCheatSheetEnabled(boolean z) {
        if (z != this.p) {
            this.p = z;
            e();
        }
    }

    public void setDialogFactory(f fVar) {
        if (fVar != null) {
            this.e = fVar;
            return;
        }
        throw new IllegalArgumentException("factory must not be null");
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.j = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        boolean z;
        b bVar = this.h;
        if (bVar != null) {
            bVar.cancel(false);
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.i);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.m;
            if (colorStateList != null) {
                drawable = drawable.mutate();
                a.b.h(drawable, colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
        this.i = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(e0 e0Var) {
        if (e0Var != null) {
            if (!this.d.equals(e0Var)) {
                if (this.f) {
                    boolean d = this.d.d();
                    a aVar = this.c;
                    f0 f0Var = this.b;
                    if (!d) {
                        f0Var.i(aVar);
                    }
                    if (!e0Var.d()) {
                        f0Var.a(e0Var, aVar, 0);
                    }
                }
                this.d = e0Var;
                b();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        Drawable drawable = this.i;
        if (drawable != null) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.i) {
            return false;
        }
        return true;
    }

    @Deprecated
    public void setAlwaysVisible(boolean z) {
    }
}
