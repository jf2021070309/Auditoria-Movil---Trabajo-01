package com.vungle.publisher;

import android.content.Context;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.mj;
import com.vungle.publisher.rg;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class rf extends mj {
    rg b;
    rr c;

    rf(Context context) {
        super(context);
    }

    public boolean a() {
        if (b()) {
            this.c.b(this);
            return true;
        } else if (!this.b.b()) {
            int historyIndex = getHistoryIndex();
            Logger.v(Logger.AD_TAG, "back pressed at index: " + historyIndex);
            if (historyIndex > 0) {
                goBack();
                return true;
            }
            return true;
        } else {
            return true;
        }
    }

    int getHistoryIndex() {
        return copyBackForwardList().getCurrentIndex();
    }

    public boolean b() {
        return this.b.a();
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends mj.b<rf> {
        @Inject
        rg.a c;
        @Inject
        Provider<rd> d;
        @Inject
        rr e;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.mj.b
        /* renamed from: b */
        public rf a(Context context) {
            rf rfVar = new rf(context);
            rfVar.c = this.e;
            return rfVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.mj.b
        public void a(String str, rf rfVar, p pVar, boolean z, x xVar) {
            rg a = this.c.a(str, pVar, z, xVar);
            rfVar.b = a;
            rfVar.setWebViewClient(a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.mj.b
        public void a(rf rfVar) {
            rfVar.setWebChromeClient(this.d.get());
        }
    }
}
