package androidx.media3.ui;

import android.content.Context;
import android.view.View;
import androidx.media3.ui.SubtitleView;
import com.amazon.aps.iva.c8.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: CanvasSubtitleOutput.java */
/* loaded from: classes.dex */
public final class a extends View implements SubtitleView.a {
    public final ArrayList b;
    public List<com.amazon.aps.iva.s5.a> c;
    public int d;
    public float e;
    public com.amazon.aps.iva.c8.a f;
    public float g;

    public a(Context context) {
        super(context, null);
        this.b = new ArrayList();
        this.c = Collections.emptyList();
        this.d = 0;
        this.e = 0.0533f;
        this.f = com.amazon.aps.iva.c8.a.g;
        this.g = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public final void a(List<com.amazon.aps.iva.s5.a> list, com.amazon.aps.iva.c8.a aVar, float f, int i, float f2) {
        this.c = list;
        this.f = aVar;
        this.e = f;
        this.d = i;
        this.g = f2;
        while (true) {
            ArrayList arrayList = this.b;
            if (arrayList.size() < list.size()) {
                arrayList.add(new v(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0428, code lost:
        if (r6 < r3) goto L154;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04d8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r44) {
        /*
            Method dump skipped, instructions count: 1292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.a.dispatchDraw(android.graphics.Canvas):void");
    }
}
