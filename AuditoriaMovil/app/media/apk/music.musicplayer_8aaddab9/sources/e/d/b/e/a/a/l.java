package e.d.b.e.a.a;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public final class l extends j<List<String>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f6831c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, e.d.b.e.a.g.n<List<String>> nVar) {
        super(oVar, nVar);
        this.f6831c = oVar;
    }

    @Override // e.d.b.e.a.a.j, e.d.b.e.a.c.m0
    public final void a(List<Bundle> list) {
        this.f6821b.f6876e.a();
        o.a.a(4, "onGetSessionStates", new Object[0]);
        o oVar = this.f6831c;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundle = list.get(i2);
            t0 t0Var = oVar.f6875d;
            ArrayList arrayList2 = new ArrayList();
            w wVar = y.a;
            ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
            HashMap hashMap = new HashMap();
            int size2 = stringArrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str = stringArrayList.get(i3);
                hashMap.put(str, AssetPackState.a(bundle, str, t0Var, wVar));
            }
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                String str2 = (String) arrayList2.get(i4);
                hashMap.put(str2, AssetPackState.b(str2, 4, 0, 0L, 0L, 0.0d));
            }
            bundle.getLong("total_bytes_to_download");
            AssetPackState assetPackState = (AssetPackState) hashMap.values().iterator().next();
            if (assetPackState == null) {
                o.a.a(6, "onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            int f2 = assetPackState.f();
            boolean z = true;
            if (f2 != 1 && f2 != 7 && f2 != 2 && f2 != 3) {
                z = false;
            }
            if (z) {
                arrayList.add(assetPackState.e());
            }
        }
        this.a.b(arrayList);
    }
}
