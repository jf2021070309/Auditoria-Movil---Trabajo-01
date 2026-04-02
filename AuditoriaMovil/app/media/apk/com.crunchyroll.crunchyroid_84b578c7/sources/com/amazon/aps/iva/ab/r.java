package com.amazon.aps.iva.ab;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.f1.t0;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.s1.z0;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Transformer, com.amazon.aps.iva.aq.d, com.amazon.aps.iva.sp.h, com.amazon.aps.iva.y60.d {
    public static final /* synthetic */ r b = new r();
    public static final com.amazon.aps.iva.o2.d c = new com.amazon.aps.iva.o2.d(1.0f, 1.0f);

    public static final long c(float f, float f2) {
        long floatToIntBits = (Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = z0.b;
        return floatToIntBits;
    }

    public static final long d(float f, float f2) {
        long floatToIntBits = (Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = com.amazon.aps.iva.e1.g.d;
        return floatToIntBits;
    }

    public static final void e(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        throw new IndexOutOfBoundsException(j0.e("index: ", i, ", size: ", i2));
    }

    public static final void f(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException(j0.e("index: ", i, ", size: ", i2));
    }

    public static final void g(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException(j0.e("fromIndex: ", i, " > toIndex: ", i2));
        }
        StringBuilder a = com.amazon.aps.iva.b6.x.a("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
        a.append(i3);
        throw new IndexOutOfBoundsException(a.toString());
    }

    public static String[] h(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final void i(com.amazon.aps.iva.c2.f fVar, com.amazon.aps.iva.f1.u uVar, com.amazon.aps.iva.f1.s sVar, float f, t0 t0Var, com.amazon.aps.iva.n2.i iVar, com.amazon.aps.iva.h1.f fVar2, int i) {
        ArrayList arrayList = fVar.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.amazon.aps.iva.c2.i iVar2 = (com.amazon.aps.iva.c2.i) arrayList.get(i2);
            iVar2.a.u(uVar, sVar, f, t0Var, iVar, fVar2, i);
            uVar.f(0.0f, iVar2.a.getHeight());
        }
    }

    public static final long j(long j) {
        return com.amazon.aps.iva.e1.d.d(com.amazon.aps.iva.e1.g.d(j) / 2.0f, com.amazon.aps.iva.e1.g.b(j) / 2.0f);
    }

    public static final com.amazon.aps.iva.ku.e k(FragmentManager fragmentManager) {
        Fragment C = fragmentManager.C("post_comment");
        if (C instanceof com.amazon.aps.iva.ku.e) {
            return (com.amazon.aps.iva.ku.e) C;
        }
        return null;
    }

    public static LinkedHashSet l(String str, String... strArr) {
        com.amazon.aps.iva.yb0.j.f(str, "internalName");
        com.amazon.aps.iva.yb0.j.f(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet m(String str, String... strArr) {
        com.amazon.aps.iva.yb0.j.f(strArr, "signatures");
        return l("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet n(String str, String... strArr) {
        return l("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final long o(long j, long j2) {
        return d(z0.a(j2) * com.amazon.aps.iva.e1.g.d(j), z0.b(j2) * com.amazon.aps.iva.e1.g.b(j));
    }

    public static final com.amazon.aps.iva.fs.b p(View view, String str) {
        TextView textView;
        CharSequence text;
        com.amazon.aps.iva.yb0.j.f(view, "<this>");
        com.amazon.aps.iva.js.b0 v = com.amazon.aps.iva.ff0.b.v(view);
        if (str == null) {
            if (view instanceof TextView) {
                textView = (TextView) view;
            } else {
                textView = null;
            }
            if (textView != null && (text = textView.getText()) != null) {
                str = text.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
        }
        return new com.amazon.aps.iva.fs.b(v, str);
    }

    public static String q(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "None";
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "Characters";
        }
        if (i == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "Words";
        }
        if (i == 3) {
            z4 = true;
        }
        if (z4) {
            return "Sentences";
        }
        return "Invalid";
    }

    @Override // com.amazon.aps.iva.y60.d
    public String a(String str, String str2) {
        return com.amazon.aps.iva.c.b.a("Tap: ", str, "/", str2);
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return ((zzfz) obj).zzc();
    }

    @Override // com.amazon.aps.iva.aq.d
    public int b() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.amazon.aps.iva.sp.h
    public String serialize(Object obj) {
        JsonObject jsonObject = (JsonObject) obj;
        com.amazon.aps.iva.yb0.j.f(jsonObject, "model");
        String jsonElement = jsonObject.toString();
        com.amazon.aps.iva.yb0.j.e(jsonElement, "model.toString()");
        return jsonElement;
    }
}
