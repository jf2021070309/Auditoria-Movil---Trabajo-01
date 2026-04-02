package e.h.g.l1;

import android.content.Context;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import e.h.g.l0;
/* loaded from: classes2.dex */
public class b {
    public Preference.c a;

    /* renamed from: b  reason: collision with root package name */
    public ListPreference f8335b;

    /* renamed from: c  reason: collision with root package name */
    public l0 f8336c;

    /* renamed from: d  reason: collision with root package name */
    public String f8337d;

    /* renamed from: e  reason: collision with root package name */
    public Preference.c f8338e = new a();

    /* loaded from: classes2.dex */
    public class a implements Preference.c {
        public a() {
        }

        @Override // androidx.preference.Preference.c
        public boolean a(Preference preference, Object obj) {
            b bVar = b.this;
            Preference.c cVar = bVar.a;
            if (cVar == null) {
                if (obj instanceof String) {
                    bVar.f8336c.p(bVar.f8337d, (String) obj);
                    return true;
                }
                return true;
            } else if (cVar.a(preference, obj)) {
                if (obj instanceof String) {
                    b bVar2 = b.this;
                    bVar2.f8336c.p(bVar2.f8337d, (String) obj);
                    return true;
                }
                return true;
            } else {
                return false;
            }
        }
    }

    public b(Context context, String str) {
        l0 h2 = l0.h(context);
        this.f8337d = str;
        this.f8336c = h2;
        ListPreference listPreference = new ListPreference(context, null);
        this.f8335b = listPreference;
        listPreference.G(str);
        ListPreference listPreference2 = this.f8335b;
        listPreference2.f477e = this.f8338e;
        listPreference2.F(false);
    }
}
