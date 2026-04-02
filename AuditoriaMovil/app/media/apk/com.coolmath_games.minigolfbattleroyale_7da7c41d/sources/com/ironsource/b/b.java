package com.ironsource.b;

import android.os.AsyncTask;
import android.util.Pair;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class b extends AsyncTask<Object, Void, Boolean> {
    private ArrayList a;
    private c b;

    public b() {
    }

    public b(c cVar) {
        this.b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Boolean doInBackground(Object... objArr) {
        try {
            this.a = (ArrayList) objArr[2];
            boolean z = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            com.ironsource.c.c a = com.ironsource.c.b.a((String) objArr[1], (String) objArr[0], arrayList);
            if (a.a != 200 && a.a != 204) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Boolean bool) {
        Boolean bool2 = bool;
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(this.a, bool2.booleanValue());
        }
    }
}
