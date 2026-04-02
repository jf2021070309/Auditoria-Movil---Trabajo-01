package e.j.b;

import android.content.Context;
import android.content.SharedPreferences;
import e.d.e.j;
/* loaded from: classes2.dex */
public class e extends d {
    public final SharedPreferences a;

    public e(Context context) {
        this.a = context.getSharedPreferences("com.zipoapps.blytics.counters.global", 0);
    }

    @Override // e.j.b.d
    public e.j.b.i.a b(String str, String str2) {
        if (this.a.contains(e.j.b.i.a.a(str, str2))) {
            return (e.j.b.i.a) new j().b(this.a.getString(e.j.b.i.a.a(str, str2), null), e.j.b.i.a.class);
        }
        return null;
    }

    @Override // e.j.b.d
    public void e(e.j.b.i.a aVar) {
        this.a.edit().putString(e.j.b.i.a.a(aVar.a, aVar.f8513b), new j().f(aVar)).apply();
    }
}
