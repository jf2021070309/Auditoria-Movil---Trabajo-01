package c.i.h;

import c.i.h.j;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class i implements c.i.j.a<j.a> {
    public final /* synthetic */ String a;

    public i(String str) {
        this.a = str;
    }

    @Override // c.i.j.a
    /* renamed from: b */
    public void a(j.a aVar) {
        synchronized (j.f2090c) {
            c.f.h<String, ArrayList<c.i.j.a<j.a>>> hVar = j.f2091d;
            ArrayList<c.i.j.a<j.a>> arrayList = hVar.get(this.a);
            if (arrayList == null) {
                return;
            }
            hVar.remove(this.a);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                arrayList.get(i2).a(aVar);
            }
        }
    }
}
