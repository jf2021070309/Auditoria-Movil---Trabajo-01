package c.z;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class q {

    /* renamed from: b  reason: collision with root package name */
    public View f2907b;
    public final Map<String, Object> a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<i> f2908c = new ArrayList<>();

    @Deprecated
    public q() {
    }

    public q(View view) {
        this.f2907b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.f2907b == qVar.f2907b && this.a.equals(qVar.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() + (this.f2907b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("TransitionValues@");
        y.append(Integer.toHexString(hashCode()));
        y.append(":\n");
        StringBuilder A = e.a.d.a.a.A(y.toString(), "    view = ");
        A.append(this.f2907b);
        A.append("\n");
        String k2 = e.a.d.a.a.k(A.toString(), "    values:");
        for (String str : this.a.keySet()) {
            k2 = k2 + "    " + str + ": " + this.a.get(str) + "\n";
        }
        return k2;
    }
}
