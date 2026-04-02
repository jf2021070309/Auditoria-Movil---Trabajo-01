package c.t;

import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.util.Objects;
/* loaded from: classes.dex */
public class h implements Preference.d {
    public final /* synthetic */ PreferenceGroup a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f2546b;

    public h(g gVar, PreferenceGroup preferenceGroup) {
        this.f2546b = gVar;
        this.a = preferenceGroup;
    }

    @Override // androidx.preference.Preference.d
    public boolean a(Preference preference) {
        this.a.T(Integer.MAX_VALUE);
        g gVar = this.f2546b;
        gVar.f2542h.removeCallbacks(gVar.f2543i);
        gVar.f2542h.post(gVar.f2543i);
        Objects.requireNonNull(this.a);
        return true;
    }
}
