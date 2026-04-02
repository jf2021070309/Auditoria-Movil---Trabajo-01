package e.h.g.l1;

import android.content.Context;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import e.h.g.l0;
/* loaded from: classes2.dex */
public class a {
    public Preference.c a;

    /* renamed from: b  reason: collision with root package name */
    public CheckBoxPreference f8331b;

    /* renamed from: c  reason: collision with root package name */
    public l0 f8332c;

    /* renamed from: d  reason: collision with root package name */
    public String f8333d;

    /* renamed from: e  reason: collision with root package name */
    public Preference.c f8334e = new C0177a();

    /* renamed from: e.h.g.l1.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0177a implements Preference.c {
        public C0177a() {
        }

        @Override // androidx.preference.Preference.c
        public boolean a(Preference preference, Object obj) {
            a aVar = a.this;
            Preference.c cVar = aVar.a;
            if (cVar == null) {
                if (obj instanceof Boolean) {
                    aVar.f8332c.m(aVar.f8333d, ((Boolean) obj).booleanValue());
                    return true;
                }
                return true;
            } else if (cVar.a(preference, obj)) {
                if (obj instanceof Boolean) {
                    a aVar2 = a.this;
                    aVar2.f8332c.m(aVar2.f8333d, ((Boolean) obj).booleanValue());
                    return true;
                }
                return true;
            } else {
                return false;
            }
        }
    }

    public a(Context context, String str) {
        l0 h2 = l0.h(context);
        this.f8333d = str;
        this.f8332c = h2;
        CheckBoxPreference checkBoxPreference = new CheckBoxPreference(context, null);
        this.f8331b = checkBoxPreference;
        checkBoxPreference.G(str);
        CheckBoxPreference checkBoxPreference2 = this.f8331b;
        checkBoxPreference2.f477e = this.f8334e;
        checkBoxPreference2.F(false);
    }
}
