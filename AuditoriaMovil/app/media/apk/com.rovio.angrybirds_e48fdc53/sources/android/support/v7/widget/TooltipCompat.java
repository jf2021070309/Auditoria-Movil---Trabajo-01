package android.support.v7.widget;

import android.os.Build;
import android.view.View;
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
/* loaded from: classes.dex */
public class TooltipCompat {

    /* loaded from: classes2.dex */
    private interface ViewCompatImpl {
        void setTooltipText(View view, CharSequence charSequence);
    }

    /* loaded from: classes2.dex */
    private static class BaseViewCompatImpl implements ViewCompatImpl {
        private BaseViewCompatImpl() {
        }

        @Override // android.support.v7.widget.TooltipCompat.ViewCompatImpl
        public void setTooltipText(View view, CharSequence charSequence) {
            TooltipCompatHandler.setTooltipText(view, charSequence);
        }
    }

    public static void setTooltipText(View view, CharSequence tooltipText) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(tooltipText);
        } else {
            TooltipCompatHandler.setTooltipText(view, tooltipText);
        }
    }

    /* loaded from: classes2.dex */
    private static class Api26ViewCompatImpl implements ViewCompatImpl {
        private Api26ViewCompatImpl() {
        }

        @Override // android.support.v7.widget.TooltipCompat.ViewCompatImpl
        public void setTooltipText(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    private TooltipCompat() {
    }
}
