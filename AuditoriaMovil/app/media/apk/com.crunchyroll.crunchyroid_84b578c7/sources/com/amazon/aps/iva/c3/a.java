package com.amazon.aps.iva.c3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
/* compiled from: ActivityCompat.java */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.d3.a {
    public static final /* synthetic */ int a = 0;

    /* compiled from: ActivityCompat.java */
    /* renamed from: com.amazon.aps.iva.c3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0160a {
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        public static void b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        public static void c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        public static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        public static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        public static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        public static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static boolean a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface f {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class g extends SharedElementCallback {
        public final f0 a;

        public g(f0 f0Var) {
            this.a = f0Var;
        }

        @Override // android.app.SharedElementCallback
        public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            Bitmap bitmap;
            Bitmap bitmap2;
            f0 f0Var = this.a;
            f0Var.getClass();
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                Drawable background = imageView.getBackground();
                if (drawable != null && background == null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                        float min = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
                        if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
                            bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                        } else {
                            int i = (int) (intrinsicWidth * min);
                            int i2 = (int) (intrinsicHeight * min);
                            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Rect bounds = drawable.getBounds();
                            int i3 = bounds.left;
                            int i4 = bounds.top;
                            int i5 = bounds.right;
                            int i6 = bounds.bottom;
                            drawable.setBounds(0, 0, i, i2);
                            drawable.draw(canvas);
                            drawable.setBounds(i3, i4, i5, i6);
                            bitmap2 = createBitmap;
                        }
                    } else {
                        bitmap2 = null;
                    }
                    if (bitmap2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("sharedElement:snapshot:bitmap", bitmap2);
                        bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                        if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                            float[] fArr = new float[9];
                            imageView.getImageMatrix().getValues(fArr);
                            bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                            return bundle;
                        }
                        return bundle;
                    }
                }
            }
            int round = Math.round(rectF.width());
            int round2 = Math.round(rectF.height());
            if (round > 0 && round2 > 0) {
                float min2 = Math.min(1.0f, 1048576.0f / (round * round2));
                int i7 = (int) (round * min2);
                int i8 = (int) (round2 * min2);
                if (f0Var.a == null) {
                    f0Var.a = new Matrix();
                }
                f0Var.a.set(matrix);
                f0Var.a.postTranslate(-rectF.left, -rectF.top);
                f0Var.a.postScale(min2, min2);
                bitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmap);
                canvas2.concat(f0Var.a);
                view.draw(canvas2);
            } else {
                bitmap = null;
            }
            return bitmap;
        }

        @Override // android.app.SharedElementCallback
        public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
            this.a.getClass();
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
                if (bitmap == null) {
                    return null;
                }
                ImageView imageView = new ImageView(context);
                imageView.setImageBitmap(bitmap);
                imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                    Matrix matrix = new Matrix();
                    matrix.setValues(floatArray);
                    imageView.setImageMatrix(matrix);
                    return imageView;
                }
                return imageView;
            } else if (!(parcelable instanceof Bitmap)) {
                return null;
            } else {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageBitmap((Bitmap) parcelable);
                return imageView2;
            }
        }

        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onRejectSharedElements(List<View> list) {
            this.a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.a.getClass();
            c.a(onSharedElementsReadyListener);
        }
    }

    public static boolean a(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i >= 32) {
            return e.a(activity, str);
        }
        if (i == 31) {
            return d.b(activity, str);
        }
        return c.c(activity, str);
    }
}
