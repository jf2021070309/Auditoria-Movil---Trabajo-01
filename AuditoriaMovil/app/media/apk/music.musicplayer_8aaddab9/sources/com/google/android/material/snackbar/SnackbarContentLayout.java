package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.i.k.d0;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView a;

    /* renamed from: b  reason: collision with root package name */
    public Button f4666b;

    /* renamed from: c  reason: collision with root package name */
    public int f4667c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean a(int i2, int i3, int i4) {
        boolean z;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i3 && this.a.getPaddingBottom() == i4) {
            return z;
        }
        TextView textView = this.a;
        AtomicInteger atomicInteger = d0.a;
        if (d0.d.g(textView)) {
            d0.d.k(textView, d0.d.f(textView), i3, d0.d.e(textView), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public Button getActionView() {
        return this.f4666b;
    }

    public TextView getMessageView() {
        return this.a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.snackbar_text);
        this.f4666b = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (a(1, r0, r0 - r1) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (a(0, r0, r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        r3 = true;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131165344(0x7f0700a0, float:1.7944902E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131165343(0x7f07009f, float:1.79449E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L29
            r2 = 1
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r2 == 0) goto L43
            int r5 = r7.f4667c
            if (r5 <= 0) goto L43
            android.widget.Button r5 = r7.f4666b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f4667c
            if (r5 <= r6) goto L43
            int r1 = r0 - r1
            boolean r0 = r7.a(r4, r0, r1)
            if (r0 == 0) goto L4e
            goto L4d
        L43:
            if (r2 == 0) goto L46
            goto L47
        L46:
            r0 = r1
        L47:
            boolean r0 = r7.a(r3, r0, r0)
            if (r0 == 0) goto L4e
        L4d:
            r3 = 1
        L4e:
            if (r3 == 0) goto L53
            super.onMeasure(r8, r9)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f4667c = i2;
    }
}
