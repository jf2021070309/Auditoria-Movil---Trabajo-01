package com.kwad.sdk.d.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kwad.sdk.utils.s;
/* loaded from: classes.dex */
public final class a {
    private static int ajL;
    private static long ajM;

    public static boolean B(View view) {
        return (view.getSystemUiVisibility() & 1024) == 1024;
    }

    public static void C(View view) {
        if (view == null || ((View) view.getParent()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }

    public static int[] D(View view) {
        if (view == null) {
            return null;
        }
        view.getLocationInWindow(r1);
        int[] iArr = {iArr[0] + (view.getWidth() / 2), iArr[1] + (view.getHeight() / 2)};
        return iArr;
    }

    public static int E(View view) {
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return ((FrameLayout.LayoutParams) layoutParams).gravity;
        }
        return 0;
    }

    public static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static View a(ViewGroup viewGroup, int i, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, true);
    }

    public static void a(View.OnClickListener onClickListener, View... viewArr) {
        for (View view : viewArr) {
            view.setOnClickListener(onClickListener);
        }
    }

    public static void a(TextView textView, String str, Bitmap bitmap) {
        String str2 = str + " ";
        TextPaint paint = textView.getPaint();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        int ceil = ((int) Math.ceil(fontMetrics.descent - fontMetrics.top)) + 2;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(textView.getContext().getResources(), bitmap);
        int intrinsicWidth = (bitmapDrawable.getIntrinsicWidth() * ceil) / bitmapDrawable.getIntrinsicHeight();
        bitmapDrawable.setBounds(0, a(textView.getContext(), 1.0f), intrinsicWidth, ceil);
        float width = textView.getWidth();
        if (paint.measureText(str2) > width) {
            int i = 1;
            int i2 = 1;
            int i3 = 0;
            boolean z = false;
            while (true) {
                float measureText = paint.measureText(str2.substring(i3, i));
                if (measureText < width) {
                    if (i2 == textView.getMaxLines()) {
                        float f = measureText + intrinsicWidth;
                        if (paint.measureText(" ") + f < width && f + paint.measureText("...") + paint.measureText(" ") < width) {
                            if (z) {
                                str2 = str2.substring(0, i) + "... ";
                                break;
                            }
                        } else {
                            i--;
                            z = true;
                        }
                    }
                    i++;
                } else {
                    i3 = i - 1;
                    i2++;
                }
                if (i <= str2.length()) {
                    if (i2 > textView.getMaxLines()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        String str3 = str2 + "*";
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new com.kwad.sdk.core.view.a(textView.getContext(), bitmap), str3.length() - 1, str3.length(), 33);
        textView.setText(spannableString);
    }

    @Deprecated
    public static int aI(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i = Build.VERSION.SDK_INT;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (i >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public static float aJ(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int b(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void b(View view, int i, int i2, int i3, int i4) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMargins(i, i2, i3, 0);
            view.requestLayout();
        }
    }

    public static boolean b(Activity activity) {
        return b(activity.getWindow());
    }

    private static boolean b(Window window) {
        return (window.getAttributes().flags & 1024) == 1024;
    }

    private static View c(Activity activity) {
        return c(activity.getWindow());
    }

    private static View c(Window window) {
        return window.getDecorView().findViewById(16908290);
    }

    public static int d(Activity activity) {
        return c(activity).getWidth();
    }

    public static void d(View view, int i, int i2) {
        View view2;
        if (view == null || i == 0 || i2 == 0 || (view2 = (View) view.getParent()) == null) {
            return;
        }
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (width > height) {
            if (i <= i2) {
                layoutParams.width = (int) ((i / (i2 * 1.0f)) * height);
                layoutParams.height = height;
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            if (i2 <= i) {
                layoutParams.width = width;
                layoutParams.height = (int) ((i2 / (i * 1.0f)) * width);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        view.setLayoutParams(layoutParams);
    }

    public static int e(Activity activity) {
        return c(activity).getHeight();
    }

    public static void e(View view, int i, int i2) {
        View view2;
        if (view == null || i == 0 || i2 == 0 || (view2 = (View) view.getParent()) == null) {
            return;
        }
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (i > i2) {
            layoutParams.width = width;
            layoutParams.height = (int) ((i2 / (i * 1.0f)) * width);
        } else {
            layoutParams.width = (int) ((i / (i2 * 1.0f)) * height);
            layoutParams.height = height;
        }
        view.setLayoutParams(layoutParams);
    }

    public static void f(View view, int i, int i2) {
        View view2;
        if (view == null || i == 0 || i2 == 0 || (view2 = (View) view.getParent()) == null) {
            return;
        }
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (width <= height || i > i2) {
            layoutParams.width = width;
            layoutParams.height = (int) ((i2 / (i * 1.0f)) * width);
        } else {
            layoutParams.width = (int) ((i / (i2 * 1.0f)) * height);
            layoutParams.height = height;
        }
        view.setLayoutParams(layoutParams);
    }

    public static int g(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static int getColor(Context context, int i) {
        return context.getResources().getColor(i);
    }

    @Deprecated
    public static int getScreenHeight(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    @Deprecated
    public static int getScreenWidth(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int getStatusBarHeight(Context context) {
        int i = ajL;
        if (i <= 0 && context != null) {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                ajL = context.getResources().getDimensionPixelSize(identifier);
            } else {
                try {
                    ajL = context.getResources().getDimensionPixelSize(((Integer) s.f("com.android.internal.R$dimen", "status_bar_height")).intValue());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (ajL <= 0) {
                ajL = a(context, 25.0f);
            }
            return ajL;
        }
        return i;
    }

    public static void m(View view, int i) {
        if (view == null || i == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static void n(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
        }
    }

    public static boolean yA() {
        long uptimeMillis = SystemClock.uptimeMillis();
        int i = (Math.abs(uptimeMillis - ajM) > 500L ? 1 : (Math.abs(uptimeMillis - ajM) == 500L ? 0 : -1));
        ajM = uptimeMillis;
        return i < 0;
    }
}
