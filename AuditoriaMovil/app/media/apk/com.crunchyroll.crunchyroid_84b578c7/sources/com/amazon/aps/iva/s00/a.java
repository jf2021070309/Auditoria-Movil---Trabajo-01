package com.amazon.aps.iva.s00;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.h;
import com.amazon.aps.iva.n4.d;
import com.amazon.aps.iva.nw.g;
import com.amazon.aps.iva.q.j1;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.u70.i;
import com.amazon.aps.iva.x00.f;
import com.amazon.aps.iva.y00.b;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.downloading.e0;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: AssetsDownloadingDecorator.kt */
/* loaded from: classes2.dex */
public final class a implements b {
    public final h b;
    public final com.amazon.aps.iva.qg.a[] c;

    public a(h hVar, com.amazon.aps.iva.qg.a... aVarArr) {
        j.f(hVar, "activity");
        j.f(aVarArr, "downloadStateListeners");
        this.b = hVar;
        this.c = aVarArr;
    }

    @Override // com.amazon.aps.iva.y00.b
    public final void G8(String str) {
        com.amazon.aps.iva.qg.a[] aVarArr;
        j.f(str, "downloadId");
        for (com.amazon.aps.iva.qg.a aVar : this.c) {
            aVar.X6(new com.amazon.aps.iva.qg.b(str, DownloadButtonState.NotStarted.c));
            aVar.G2(str);
        }
    }

    @Override // com.amazon.aps.iva.y00.b
    public final void Zd() {
        this.b.runOnUiThread(new j1(this, 8));
    }

    @Override // com.amazon.aps.iva.y00.b
    public final void ga(g gVar) {
        this.b.runOnUiThread(new d(10, this, gVar));
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(i iVar) {
        j.f(iVar, "message");
        int i = com.amazon.aps.iva.u70.h.a;
        View findViewById = this.b.findViewById(R.id.snackbar_container);
        j.e(findViewById, "activity.findViewById(R.id.snackbar_container)");
        h.a.a((ViewGroup) findViewById, iVar);
    }

    @Override // com.amazon.aps.iva.y00.b
    public final void u4(e0... e0VarArr) {
        com.amazon.aps.iva.qg.a[] aVarArr;
        j.f(e0VarArr, "localVideos");
        e0[] e0VarArr2 = (e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length);
        for (com.amazon.aps.iva.qg.a aVar : this.c) {
            ArrayList arrayList = new ArrayList(e0VarArr2.length);
            for (e0 e0Var : e0VarArr2) {
                arrayList.add(new com.amazon.aps.iva.qg.b(e0Var.e(), f.a(e0Var)));
            }
            com.amazon.aps.iva.qg.b[] bVarArr = (com.amazon.aps.iva.qg.b[]) arrayList.toArray(new com.amazon.aps.iva.qg.b[0]);
            aVar.X6((com.amazon.aps.iva.qg.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        }
    }
}
