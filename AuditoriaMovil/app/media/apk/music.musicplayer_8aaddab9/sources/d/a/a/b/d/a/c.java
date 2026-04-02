package d.a.a.b.d.a;

import java.util.Comparator;
/* loaded from: classes.dex */
public class c implements Comparator<String> {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // java.util.Comparator
    public int compare(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        int i2 = 0;
        for (e eVar : this.a.a) {
            Comparable a = eVar.a(str4);
            Comparable a2 = eVar.a(str3);
            if (a != null && a2 != null) {
                i2 += a.compareTo(a2);
            }
        }
        return i2 == 0 ? str4.compareTo(str3) : i2;
    }
}
