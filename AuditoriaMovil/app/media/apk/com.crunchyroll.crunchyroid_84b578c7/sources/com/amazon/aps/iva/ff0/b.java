package com.amazon.aps.iva.ff0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.StatFs;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputConnection;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.b5.c;
import com.amazon.aps.iva.c2.z;
import com.amazon.aps.iva.e1.e;
import com.amazon.aps.iva.e1.g;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.i2.e0;
import com.amazon.aps.iva.js.b0;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.q.n1;
import com.amazon.aps.iva.r4.a2;
import com.amazon.aps.iva.rp.c;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.v90.i;
import com.amazon.aps.iva.xe0.s;
import com.amazon.aps.iva.y4.k;
import com.amazon.aps.iva.y4.r;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.zj.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
/* compiled from: ByteString.kt */
/* loaded from: classes4.dex */
public final class b implements d, c, com.amazon.aps.iva.sv.b, i, com.amazon.aps.iva.xp.a {
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final s c = new s("RESUME_TOKEN");
    public static final b d = new b();

    public static void A(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof n1) {
                    editorInfo.hintText = ((n1) parent).a();
                    return;
                }
            }
        }
    }

    public static long B(int i, int i2, v vVar) {
        boolean z;
        boolean z2;
        byte[] bArr;
        vVar.F(i);
        if (vVar.c - vVar.b < 5) {
            return -9223372036854775807L;
        }
        int e = vVar.e();
        if ((8388608 & e) != 0 || ((2096896 & e) >> 8) != i2) {
            return -9223372036854775807L;
        }
        if ((e & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && vVar.u() >= 7 && vVar.c - vVar.b >= 7) {
            if ((vVar.u() & 16) == 16) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                vVar.d(0, new byte[6], 6);
                return ((bArr[3] & 255) << 1) | ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[4] & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }

    public static final f C(f fVar, float f, float f2) {
        boolean z;
        j.f(fVar, "<this>");
        boolean z2 = true;
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (f2 != 1.0f) {
                z2 = false;
            }
            if (z2) {
                return fVar;
            }
        }
        return androidx.compose.ui.graphics.a.b(fVar, f, f2, 0.0f, null, false, 131068);
    }

    public static final void D(RemoteViews remoteViews, int i, long j) {
        j.f(remoteViews, "$this$setImageViewColorFilter");
        remoteViews.setInt(i, "setColorFilter", i.G(j));
    }

    public static final ColorStateList E(com.amazon.aps.iva.x4.b bVar, Context context, boolean z) {
        return new ColorStateList(new int[][]{k0.h, new int[0]}, new int[]{i.G(bVar.a(context, z, true)), i.G(bVar.a(context, z, false))});
    }

    public static final com.amazon.aps.iva.w4.b F(com.amazon.aps.iva.x4.b bVar, Context context) {
        j.f(bVar, "<this>");
        j.f(context, "context");
        return new com.amazon.aps.iva.w4.b(E(bVar, context, false), E(bVar, context, true));
    }

    public static final ExtractedText G(e0 e0Var) {
        j.f(e0Var, "<this>");
        ExtractedText extractedText = new ExtractedText();
        com.amazon.aps.iva.c2.b bVar = e0Var.a;
        String str = bVar.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = e0Var.b;
        extractedText.selectionStart = z.e(j);
        extractedText.selectionEnd = z.d(j);
        extractedText.flags = !q.j0(bVar.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final int H(float f, DisplayMetrics displayMetrics) {
        return (int) TypedValue.applyDimension(1, f, displayMetrics);
    }

    public static final int I(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final n J(n nVar, float f) {
        j.f(nVar, "$this$width");
        return nVar.d(new r(new c.a(f)));
    }

    public static final n K(n nVar) {
        j.f(nVar, "<this>");
        return nVar.d(new k(c.e.a));
    }

    public static final n L(n nVar) {
        j.f(nVar, "<this>");
        return nVar.d(new r(c.e.a));
    }

    public static final e h(long j, long j2) {
        return new e(com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j), g.d(j2) + com.amazon.aps.iva.e1.c.c(j), g.b(j2) + com.amazon.aps.iva.e1.c.d(j));
    }

    public static final void i(int i, List list) {
        int size = list.size();
        if (i >= 0 && i < size) {
            return;
        }
        throw new IndexOutOfBoundsException(com.amazon.aps.iva.q.n.a("Index ", i, " is out of bounds. The list has ", size, " elements."));
    }

    public static final void j(int i, int i2, List list) {
        int size = list.size();
        if (i <= i2) {
            if (i >= 0) {
                if (i2 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
            }
            throw new IndexOutOfBoundsException(com.amazon.aps.iva.c80.a.d("fromIndex (", i, ") is less than 0."));
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.n.a("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", i2, ")."));
    }

    public static final int k(char c2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if ('0' <= c2 && c2 < ':') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' <= c2 && c2 < 'g') {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            c3 = 'A';
            if ('A' > c2 || c2 >= 'G') {
                z3 = false;
            }
            if (!z3) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c2);
            }
        }
        return (c2 - c3) + 10;
    }

    public static final boolean l(Set set, Set set2) {
        if (set.size() < set2.size()) {
            Set<Object> set3 = set;
            if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                for (Object obj : set3) {
                    if (set2.contains(obj)) {
                        return true;
                    }
                }
            }
            return false;
        }
        Set<Object> set4 = set2;
        if (!(set4 instanceof Collection) || !set4.isEmpty()) {
            for (Object obj2 : set4) {
                if (set.contains(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static n m(n nVar, com.amazon.aps.iva.p4.a aVar) {
        j.f(nVar, "$this$background");
        return nVar.d(new com.amazon.aps.iva.p4.c(aVar, 2));
    }

    public static int n(int i, int i2) {
        boolean z;
        if (Math.abs(i - i2) < 20) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0;
        }
        if (i >= i2) {
            return 1;
        }
        return -1;
    }

    public static final n o(n nVar) {
        j.f(nVar, "<this>");
        return nVar.d(new k(c.C0130c.a));
    }

    public static final n p(n nVar) {
        j.f(nVar, "<this>");
        return o(q(nVar));
    }

    public static final n q(n nVar) {
        j.f(nVar, "<this>");
        return nVar.d(new r(c.C0130c.a));
    }

    public static final int r(int i, ArrayList arrayList) {
        char c2;
        j.f(arrayList, "paragraphInfoList");
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            com.amazon.aps.iva.c2.i iVar = (com.amazon.aps.iva.c2.i) arrayList.get(i3);
            if (iVar.b > i) {
                c2 = 1;
            } else if (iVar.c <= i) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 < 0) {
                i2 = i3 + 1;
            } else if (c2 > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int s(int i, ArrayList arrayList) {
        char c2;
        j.f(arrayList, "paragraphInfoList");
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            com.amazon.aps.iva.c2.i iVar = (com.amazon.aps.iva.c2.i) arrayList.get(i3);
            if (iVar.d > i) {
                c2 = 1;
            } else if (iVar.e <= i) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 < 0) {
                i2 = i3 + 1;
            } else if (c2 > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int t(ArrayList arrayList, float f) {
        char c2;
        j.f(arrayList, "paragraphInfoList");
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            com.amazon.aps.iva.c2.i iVar = (com.amazon.aps.iva.c2.i) arrayList.get(i2);
            if (iVar.f > f) {
                c2 = 1;
            } else if (iVar.g <= f) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 < 0) {
                i = i2 + 1;
            } else if (c2 > 0) {
                size = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public static final long u(com.amazon.aps.iva.x4.a aVar, Context context) {
        boolean z;
        j.f(aVar, "<this>");
        j.f(context, "context");
        if (aVar instanceof com.amazon.aps.iva.x4.b) {
            com.amazon.aps.iva.x4.b bVar = (com.amazon.aps.iva.x4.b) aVar;
            if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
                z = true;
            } else {
                z = false;
            }
            return bVar.a(context, z, false);
        } else if (aVar instanceof com.amazon.aps.iva.x4.d) {
            com.amazon.aps.iva.x4.d dVar = (com.amazon.aps.iva.x4.d) aVar;
            x k = k0.k(context, dVar.a, false, null);
            if (k != null) {
                return k.a;
            }
            x k2 = k0.k(context, dVar.b, false, null);
            j.c(k2);
            return k2.a;
        } else {
            throw new h();
        }
    }

    public static b0 v(View view) {
        int i;
        DisplayMetrics displayMetrics;
        DisplayMetrics displayMetrics2;
        j.f(view, "view");
        int i2 = 0;
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        Context context = view.getContext();
        j.e(context, "view.context");
        Resources resources = context.getResources();
        if (resources != null && (displayMetrics2 = resources.getDisplayMetrics()) != null) {
            i = displayMetrics2.widthPixels;
        } else {
            i = 0;
        }
        Resources resources2 = context.getResources();
        if (resources2 != null && (displayMetrics = resources2.getDisplayMetrics()) != null) {
            i2 = displayMetrics.heightPixels;
        }
        return z(n((width / 2) + i3, i / 2), n((height / 2) + i4, i2 / 2));
    }

    public static final n w(n nVar, float f) {
        j.f(nVar, "$this$height");
        return nVar.d(new k(new c.a(f)));
    }

    public static final int x(RemoteViews remoteViews, a2 a2Var, int i, int i2, Integer num) {
        boolean z;
        int incrementAndGet;
        j.f(remoteViews, "<this>");
        j.f(a2Var, "translationContext");
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (num != null) {
                incrementAndGet = num.intValue();
            } else {
                incrementAndGet = a2Var.g.incrementAndGet();
            }
            if (incrementAndGet != -1) {
                remoteViews.setInt(i, "setInflatedId", incrementAndGet);
            }
            if (i2 != 0) {
                remoteViews.setInt(i, "setLayoutResource", i2);
            }
            remoteViews.setViewVisibility(i, 0);
            return incrementAndGet;
        }
        throw new IllegalArgumentException("viewStubId must not be View.NO_ID".toString());
    }

    public static /* synthetic */ int y(RemoteViews remoteViews, a2 a2Var, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return x(remoteViews, a2Var, i, i2, null);
    }

    public static b0 z(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return b0.CENTER;
        }
        if (i == 0 && i2 == -1) {
            return b0.TOP;
        }
        if (i == 0 && i2 == 1) {
            return b0.BOTTOM;
        }
        if (i == -1 && i2 == -1) {
            return b0.TOP_LEFT;
        }
        if (i == -1 && i2 == 0) {
            return b0.LEFT;
        }
        if (i == -1 && i2 == 1) {
            return b0.BOTTOM_LEFT;
        }
        if (i == 1 && i2 == -1) {
            return b0.TOP_RIGHT;
        }
        if (i == 1 && i2 == 0) {
            return b0.RIGHT;
        }
        if (i == 1 && i2 == 1) {
            return b0.BOTTOM_RIGHT;
        }
        throw new IllegalStateException(com.amazon.aps.iva.q.n.a("Incorrect view coordinates: (", i, ", ", i2, ")"));
    }

    @Override // com.amazon.aps.iva.sv.b
    public com.amazon.aps.iva.sv.a c(Context context) {
        j.f(context, "context");
        try {
            String str = null;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                str = externalFilesDir.getPath();
            }
            return new com.amazon.aps.iva.sv.a(new StatFs(str).getAvailableBytes());
        } catch (Exception unused) {
            return new com.amazon.aps.iva.sv.a(0L);
        }
    }

    @Override // com.amazon.aps.iva.v90.i
    public View e(View view, AttributeSet attributeSet) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Context context = textView.getContext();
            j.b(context, "context");
            int a = i.a.a(context, attributeSet, 16843087);
            Context context2 = textView.getContext();
            j.b(context2, "context");
            int a2 = i.a.a(context2, attributeSet, 16843088);
            if (a > 0) {
                textView.setText(a);
            }
            if (a2 > 0) {
                textView.setHint(a2);
            }
        }
        return view;
    }

    @Override // com.amazon.aps.iva.xp.a
    public com.amazon.aps.iva.rq.a f() {
        return com.amazon.aps.iva.rq.a.GRANTED;
    }

    @Override // com.amazon.aps.iva.rp.c
    public com.amazon.aps.iva.eq.a g() {
        return new com.amazon.aps.iva.eq.a(null, null, null, null, null, null, null, 127);
    }

    @Override // com.amazon.aps.iva.xp.a
    public void b() {
    }

    @Override // com.amazon.aps.iva.rp.c
    public void a(Context context) {
    }

    @Override // com.amazon.aps.iva.xp.a
    public void d(com.amazon.aps.iva.rq.b bVar) {
    }
}
