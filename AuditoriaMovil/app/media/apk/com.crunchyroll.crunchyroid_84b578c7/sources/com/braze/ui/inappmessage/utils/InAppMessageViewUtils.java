package com.braze.ui.inappmessage.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.aps.iva.f1.b;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.Metadata;
/* compiled from: InAppMessageViewUtils.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J2\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u001a\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\fH\u0007J\u001a\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0014\u001a\u00020\fH\u0007J\u001c\u0010\u001f\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0007J\b\u0010 \u001a\u00020\u0006H\u0007J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0007J\u001a\u0010$\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0014\u001a\u00020\fH\u0002¨\u0006'"}, d2 = {"Lcom/braze/ui/inappmessage/utils/InAppMessageViewUtils;", "", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/widget/ImageView;", "imageView", "Lcom/amazon/aps/iva/kb0/q;", "setImage", "Landroid/content/Context;", "context", "", "icon", "", "iconColor", "iconBackgroundColor", "Landroid/widget/TextView;", "textView", "setIcon", "Landroid/view/View;", "view", "color", "setFrameColor", "(Landroid/view/View;Ljava/lang/Integer;)V", "setTextViewColor", "setViewBackgroundColor", "setViewBackgroundColorFilter", "Landroid/graphics/drawable/Drawable;", "drawable", "setDrawableColor", "messageView", "headerView", "resetMessageMarginsIfNecessary", "closeInAppMessageOnKeycodeBack", "Lcom/braze/enums/inappmessage/TextAlign;", "textAlign", "setTextAlignment", "setDrawableColorFilter", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InAppMessageViewUtils {
    public static final InAppMessageViewUtils INSTANCE = new InAppMessageViewUtils();

    private InAppMessageViewUtils() {
    }

    public static final void closeInAppMessageOnKeycodeBack() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, InAppMessageViewUtils$closeInAppMessageOnKeycodeBack$1.INSTANCE, 3, (Object) null);
        BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    public static final void resetMessageMarginsIfNecessary(TextView textView, TextView textView2) {
        if (textView2 == null && textView != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(textView.getLayoutParams().width, textView.getLayoutParams().height);
            layoutParams.setMargins(0, 0, 0, 0);
            textView.setLayoutParams(layoutParams);
        }
    }

    public static final void setDrawableColor(Drawable drawable, int i) {
        j.f(drawable, "drawable");
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() > 0 && (layerDrawable.getDrawable(0) instanceof GradientDrawable)) {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                j.e(drawable2, "drawable.getDrawable(0)");
                setDrawableColor(drawable2, i);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, InAppMessageViewUtils$setDrawableColor$1.INSTANCE, 3, (Object) null);
            }
        }
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i);
        } else {
            INSTANCE.setDrawableColorFilter(drawable, i);
        }
    }

    private final void setDrawableColorFilter(Drawable drawable, int i) {
        BlendMode blendMode;
        if (Build.VERSION.SDK_INT >= 29) {
            b.e();
            blendMode = BlendMode.SRC_ATOP;
            drawable.setColorFilter(com.amazon.aps.iva.c8.b.d(i, blendMode));
            return;
        }
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    public static final void setFrameColor(View view, Integer num) {
        j.f(view, "view");
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        }
    }

    public static final void setIcon(Context context, String str, int i, int i2, TextView textView) {
        j.f(context, "context");
        j.f(textView, "textView");
        if (str != null) {
            try {
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                textView.setText(str);
                setTextViewColor(textView, i);
                if (textView.getBackground() != null) {
                    Drawable background = textView.getBackground();
                    j.e(background, "textView.background");
                    setDrawableColor(background, i2);
                    return;
                }
                setViewBackgroundColor(textView, i2);
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, InAppMessageViewUtils$setIcon$1.INSTANCE);
            }
        }
    }

    public static final void setImage(Bitmap bitmap, ImageView imageView) {
        j.f(imageView, "imageView");
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static final void setTextAlignment(TextView textView, TextAlign textAlign) {
        j.f(textView, "textView");
        j.f(textAlign, "textAlign");
        if (textAlign == TextAlign.START) {
            textView.setGravity(8388611);
        } else if (textAlign == TextAlign.END) {
            textView.setGravity(8388613);
        } else if (textAlign == TextAlign.CENTER) {
            textView.setGravity(17);
        }
    }

    public static final void setTextViewColor(TextView textView, int i) {
        j.f(textView, "textView");
        textView.setTextColor(i);
    }

    public static final void setViewBackgroundColor(View view, int i) {
        j.f(view, "view");
        view.setBackgroundColor(i);
    }

    public static final void setViewBackgroundColorFilter(View view, int i) {
        j.f(view, "view");
        InAppMessageViewUtils inAppMessageViewUtils = INSTANCE;
        Drawable background = view.getBackground();
        j.e(background, "view.background");
        inAppMessageViewUtils.setDrawableColorFilter(background, i);
        view.getBackground().setAlpha(Color.alpha(i));
    }
}
