package e.d.b.d.m;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;
/* loaded from: classes2.dex */
public abstract class t<S> extends Fragment {
    public final LinkedHashSet<s<S>> a = new LinkedHashSet<>();

    public boolean b(s<S> sVar) {
        return this.a.add(sVar);
    }
}
