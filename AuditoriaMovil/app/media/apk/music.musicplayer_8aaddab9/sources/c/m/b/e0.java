package c.m.b;

import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class e0 {
    public static final h0 a;

    /* renamed from: b  reason: collision with root package name */
    public static final h0 f2345b;

    static {
        h0 h0Var = null;
        a = Build.VERSION.SDK_INT >= 21 ? new f0() : null;
        try {
            h0Var = (h0) Class.forName("c.z.d").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        f2345b = h0Var;
    }

    public static void a(Fragment fragment, Fragment fragment2, boolean z, c.f.a<String, View> aVar, boolean z2) {
        if ((z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i2 = aVar == null ? 0 : aVar.f1665g;
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList2.add(aVar.h(i3));
                arrayList.add(aVar.l(i3));
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public static void b(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }
}
