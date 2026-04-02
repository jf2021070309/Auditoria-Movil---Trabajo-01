package com.amazon.aps.iva.u70;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.xw.w0;
import com.ellation.crunchyroll.ui.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.ContentViewCallback;
/* compiled from: ActionSnackbar.kt */
/* loaded from: classes2.dex */
public final class c extends BaseTransientBottomBar<c> {
    public static final /* synthetic */ int a = 0;

    /* compiled from: ActionSnackbar.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static c a(ViewGroup viewGroup, int i, int i2, int i3) {
            com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_snackbar_action, viewGroup, false);
            com.amazon.aps.iva.yb0.j.e(inflate, "getContent(parent)");
            c cVar = new c(viewGroup, inflate, i2, i3);
            cVar.setDuration(i);
            BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = ((BaseTransientBottomBar) cVar).view;
            com.amazon.aps.iva.yb0.j.e(snackbarBaseLayout, "view");
            snackbarBaseLayout.setPadding(0, 0, 0, 0);
            return cVar;
        }
    }

    /* compiled from: ActionSnackbar.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ContentViewCallback {
        @Override // com.google.android.material.snackbar.ContentViewCallback
        public final void animateContentIn(int i, int i2) {
        }

        @Override // com.google.android.material.snackbar.ContentViewCallback
        public final void animateContentOut(int i, int i2) {
        }
    }

    public c(ViewGroup viewGroup, View view, int i, int i2) {
        super(viewGroup, view, new b());
        this.view.setOnApplyWindowInsetsListener(new com.amazon.aps.iva.u70.a());
        ((TextView) this.view.findViewById(R.id.snackbar_text)).setTextAppearance(i);
        ((TextView) this.view.findViewById(R.id.snackbar_action)).setTextAppearance(i2);
    }

    public static void c(final c cVar, String str, int i, int i2, int i3) {
        boolean z;
        if ((i3 & 8) != 0) {
            i2 = R.drawable.ic_confirmation;
        }
        ((TextView) cVar.view.findViewById(R.id.snackbar_text)).setText(str);
        boolean z2 = false;
        if (i != 0) {
            TextView textView = (TextView) cVar.view.findViewById(R.id.snackbar_action);
            textView.setText(i);
            textView.setVisibility(0);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.amazon.aps.iva.u70.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c cVar2 = cVar;
                    com.amazon.aps.iva.yb0.j.f(cVar2, "$this_apply");
                    com.amazon.aps.iva.xb0.a aVar = com.amazon.aps.iva.xb0.a.this;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    cVar2.dispatchDismiss(1);
                }
            });
        }
        ((ImageView) cVar.view.findViewById(R.id.snackbar_icon)).setImageResource(i2);
        TextView textView2 = (TextView) cVar.view.findViewById(R.id.snackbar_text);
        TextView textView3 = (TextView) cVar.view.findViewById(R.id.snackbar_action);
        ConstraintLayout constraintLayout = (ConstraintLayout) cVar.view.findViewById(R.id.snackbar_constraint);
        if (textView2.isLaidOut()) {
            if (textView2.getLayout().getWidth() >= ((int) TypedValue.applyDimension(1, 160.0f, textView2.getResources().getDisplayMetrics()))) {
                z = true;
            } else {
                z = false;
            }
            int lineCount = textView2.getLayout().getLineCount();
            int i4 = 0;
            while (true) {
                if (i4 >= lineCount) {
                    break;
                } else if (textView2.getLayout().getEllipsisCount(i4) > 0) {
                    z2 = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (!z && z2) {
                com.amazon.aps.iva.yb0.j.e(constraintLayout, "constraint");
                w0.b(constraintLayout, new f(textView2, textView2, lineCount, textView3));
            }
        } else {
            textView2.getViewTreeObserver().addOnGlobalLayoutListener(new e(textView2, textView2, textView3, constraintLayout));
        }
        cVar.show();
    }

    public final void b(com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(aVar, "onDismiss");
        com.amazon.aps.iva.yb0.j.f(aVar2, "onDismissedByUser");
        addCallback(new d(aVar2, aVar));
    }
}
