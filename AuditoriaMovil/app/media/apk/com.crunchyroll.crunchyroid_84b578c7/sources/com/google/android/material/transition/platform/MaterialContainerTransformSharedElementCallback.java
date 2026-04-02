package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import com.google.android.material.R;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.common.primitives.Ints;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class MaterialContainerTransformSharedElementCallback extends SharedElementCallback {
    private static WeakReference<View> capturedSharedElement;
    private Rect returnEndBounds;
    private boolean entering = true;
    private boolean transparentWindowBackgroundEnabled = true;
    private boolean sharedElementReenterTransitionEnabled = false;
    private ShapeProvider shapeProvider = new ShapeableViewShapeProvider();

    /* loaded from: classes3.dex */
    public interface ShapeProvider {
        ShapeAppearanceModel provideShape(View view);
    }

    /* loaded from: classes3.dex */
    public static class ShapeableViewShapeProvider implements ShapeProvider {
        @Override // com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider
        public ShapeAppearanceModel provideShape(View view) {
            if (view instanceof Shapeable) {
                return ((Shapeable) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    private static Drawable getWindowBackground(Window window) {
        return window.getDecorView().getBackground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void removeWindowBackground(android.view.Window r5) {
        /*
            android.graphics.drawable.Drawable r5 = getWindowBackground(r5)
            if (r5 != 0) goto L7
            return
        L7:
            android.graphics.drawable.Drawable r5 = r5.mutate()
            com.amazon.aps.iva.g3.b r0 = com.amazon.aps.iva.g3.b.CLEAR
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 29
            r4 = 0
            if (r1 < r3) goto L20
            java.lang.Object r0 = com.amazon.aps.iva.g3.d.a(r0)
            if (r0 == 0) goto L6d
            android.graphics.ColorFilter r4 = com.amazon.aps.iva.g3.a.a(r2, r0)
            goto L6d
        L20:
            if (r0 != 0) goto L23
            goto L65
        L23:
            int[] r1 = com.amazon.aps.iva.g3.c.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L62;
                case 2: goto L5f;
                case 3: goto L5c;
                case 4: goto L59;
                case 5: goto L56;
                case 6: goto L53;
                case 7: goto L50;
                case 8: goto L4d;
                case 9: goto L4a;
                case 10: goto L47;
                case 11: goto L44;
                case 12: goto L41;
                case 13: goto L3e;
                case 14: goto L3b;
                case 15: goto L38;
                case 16: goto L35;
                case 17: goto L32;
                case 18: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L65
        L2f:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.LIGHTEN
            goto L66
        L32:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.DARKEN
            goto L66
        L35:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.OVERLAY
            goto L66
        L38:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SCREEN
            goto L66
        L3b:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L66
        L3e:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.ADD
            goto L66
        L41:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.XOR
            goto L66
        L44:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.DST_ATOP
            goto L66
        L47:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L66
        L4a:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.DST_OUT
            goto L66
        L4d:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_OUT
            goto L66
        L50:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.DST_IN
            goto L66
        L53:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            goto L66
        L56:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.DST_OVER
            goto L66
        L59:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_OVER
            goto L66
        L5c:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.DST
            goto L66
        L5f:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC
            goto L66
        L62:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR
            goto L66
        L65:
            r0 = r4
        L66:
            if (r0 == 0) goto L6d
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            r4.<init>(r2, r0)
        L6d:
            r5.setColorFilter(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.removeWindowBackground(android.view.Window):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void restoreWindowBackground(Window window) {
        Drawable windowBackground = getWindowBackground(window);
        if (windowBackground == null) {
            return;
        }
        windowBackground.mutate().clearColorFilter();
    }

    private void setUpEnterTransform(final Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementEnterTransition;
            if (!this.sharedElementReenterTransitionEnabled) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.transparentWindowBackgroundEnabled) {
                updateBackgroundFadeDuration(window, materialContainerTransform);
                materialContainerTransform.addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.1
                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.restoreWindowBackground(window);
                    }

                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.removeWindowBackground(window);
                    }
                });
            }
        }
    }

    private void setUpReturnTransform(final Activity activity, final Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementReturnTransition;
            materialContainerTransform.setHoldAtEndEnabled(true);
            materialContainerTransform.addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.2
                @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    View view;
                    if (MaterialContainerTransformSharedElementCallback.capturedSharedElement != null && (view = (View) MaterialContainerTransformSharedElementCallback.capturedSharedElement.get()) != null) {
                        view.setAlpha(1.0f);
                        WeakReference unused = MaterialContainerTransformSharedElementCallback.capturedSharedElement = null;
                    }
                    activity.finish();
                    activity.overridePendingTransition(0, 0);
                }
            });
            if (this.transparentWindowBackgroundEnabled) {
                updateBackgroundFadeDuration(window, materialContainerTransform);
                materialContainerTransform.addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.3
                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.removeWindowBackground(window);
                    }
                });
            }
        }
    }

    private static void updateBackgroundFadeDuration(Window window, MaterialContainerTransform materialContainerTransform) {
        if (materialContainerTransform.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(materialContainerTransform.getDuration());
        }
    }

    public ShapeProvider getShapeProvider() {
        return this.shapeProvider;
    }

    public boolean isSharedElementReenterTransitionEnabled() {
        return this.sharedElementReenterTransitionEnabled;
    }

    public boolean isTransparentWindowBackgroundEnabled() {
        return this.transparentWindowBackgroundEnabled;
    }

    @Override // android.app.SharedElementCallback
    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        capturedSharedElement = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    public View onCreateSnapshotView(Context context, Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        ShapeAppearanceModel provideShape;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (onCreateSnapshotView != null && (weakReference = capturedSharedElement) != null && this.shapeProvider != null && (view = weakReference.get()) != null && (provideShape = this.shapeProvider.provideShape(view)) != null) {
            onCreateSnapshotView.setTag(R.id.mtrl_motion_snapshot_view, provideShape);
        }
        return onCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(List<String> list, Map<String, View> map) {
        View view;
        Activity activity;
        if (!list.isEmpty() && !map.isEmpty() && (view = map.get(list.get(0))) != null && (activity = ContextUtils.getActivity(view.getContext())) != null) {
            Window window = activity.getWindow();
            if (this.entering) {
                setUpEnterTransform(window);
            } else {
                setUpReturnTransform(activity, window);
            }
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        if (!list2.isEmpty() && (list2.get(0).getTag(R.id.mtrl_motion_snapshot_view) instanceof View)) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, null);
        }
        if (!this.entering && !list2.isEmpty()) {
            this.returnEndBounds = TransitionUtils.getRelativeBoundsRect(list2.get(0));
        }
        this.entering = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (!this.entering && !list2.isEmpty() && this.returnEndBounds != null) {
            View view = list2.get(0);
            view.measure(View.MeasureSpec.makeMeasureSpec(this.returnEndBounds.width(), Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(this.returnEndBounds.height(), Ints.MAX_POWER_OF_TWO));
            Rect rect = this.returnEndBounds;
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void setShapeProvider(ShapeProvider shapeProvider) {
        this.shapeProvider = shapeProvider;
    }

    public void setSharedElementReenterTransitionEnabled(boolean z) {
        this.sharedElementReenterTransitionEnabled = z;
    }

    public void setTransparentWindowBackgroundEnabled(boolean z) {
        this.transparentWindowBackgroundEnabled = z;
    }
}
