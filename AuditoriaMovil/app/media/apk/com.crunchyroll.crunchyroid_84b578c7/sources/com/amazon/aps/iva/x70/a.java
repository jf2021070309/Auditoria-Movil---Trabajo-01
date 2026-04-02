package com.amazon.aps.iva.x70;

import android.view.View;
import android.view.ViewTreeObserver;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.xw.u0;
import com.amazon.aps.iva.xw.v0;
import com.amazon.aps.iva.xw.w0;
import com.amazon.aps.iva.yb0.j;
import com.ellation.widgets.unbreakabletextviewgroup.UnbreakableTextViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ViewExtensions.kt */
/* loaded from: classes2.dex */
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public a(int i, View view, String str) {
        this.b = view;
        this.c = str;
        this.d = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.b;
        if (view.getViewTreeObserver().isAlive() && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            UnbreakableTextViewGroup unbreakableTextViewGroup = (UnbreakableTextViewGroup) view;
            String str = this.c;
            j.e(str, "divider");
            v0 a = w0.a(unbreakableTextViewGroup);
            ArrayList arrayList = new ArrayList(r.Y(a));
            Iterator<View> it = a.iterator();
            while (true) {
                u0 u0Var = (u0) it;
                if (u0Var.hasNext()) {
                    arrayList.add(new e((View) u0Var.next()));
                } else {
                    b bVar = new b(unbreakableTextViewGroup, str, arrayList, this.d);
                    unbreakableTextViewGroup.getClass();
                    bVar.onCreate();
                    return;
                }
            }
        }
    }
}
