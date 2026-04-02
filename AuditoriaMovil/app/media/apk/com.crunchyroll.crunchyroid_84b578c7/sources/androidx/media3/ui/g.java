package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.widget.FrameLayout;
import androidx.media3.ui.SubtitleView;
import com.amazon.aps.iva.c8.w;
import com.amazon.aps.iva.c8.y;
import com.amazon.aps.iva.t5.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: WebViewSubtitleOutput.java */
/* loaded from: classes.dex */
public final class g extends FrameLayout implements SubtitleView.a {
    public final androidx.media3.ui.a b;
    public final y c;
    public List<com.amazon.aps.iva.s5.a> d;
    public com.amazon.aps.iva.c8.a e;
    public float f;
    public int g;
    public float h;

    /* compiled from: WebViewSubtitleOutput.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(Context context) {
        super(context, null);
        this.d = Collections.emptyList();
        this.e = com.amazon.aps.iva.c8.a.g;
        this.f = 0.0533f;
        this.g = 0;
        this.h = 0.08f;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context);
        this.b = aVar;
        y yVar = new y(context);
        this.c = yVar;
        yVar.setBackgroundColor(0);
        addView(aVar);
        addView(yVar);
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public final void a(List<com.amazon.aps.iva.s5.a> list, com.amazon.aps.iva.c8.a aVar, float f, int i, float f2) {
        this.e = aVar;
        this.f = f;
        this.g = i;
        this.h = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.amazon.aps.iva.s5.a aVar2 = list.get(i2);
            if (aVar2.e != null) {
                arrayList.add(aVar2);
            } else {
                arrayList2.add(aVar2);
            }
        }
        if (!this.d.isEmpty() || !arrayList2.isEmpty()) {
            this.d = arrayList2;
            c();
        }
        this.b.a(arrayList, aVar, f, i, f2);
        invalidate();
    }

    public final String b(float f, int i) {
        float b = w.b(f, i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (b == -3.4028235E38f) {
            return "unset";
        }
        return g0.o("%.2fpx", Float.valueOf(b / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x0467, code lost:
        if (((android.text.style.TypefaceSpan) r15).getFamily() != null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01cd, code lost:
        if (r12 != 0) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d0, code lost:
        if (r12 != 0) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d3, code lost:
        r22 = "right";
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d5, code lost:
        r0 = 2;
        r23 = r22;
        r22 = "top";
     */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.g.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.d.isEmpty()) {
            c();
        }
    }
}
