package com.vungle.publisher;

import android.content.Context;
import com.vungle.publisher.mj;
import javax.inject.Inject;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class om extends mj {
    private om(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends mj.b<om> {
        @Inject
        lz c;
        @Inject
        lw d;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.mj.b
        /* renamed from: b */
        public om a(Context context) {
            return new om(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.mj.b
        public void a(String str, om omVar, p pVar, boolean z, x xVar) {
            omVar.setWebViewClient(this.c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.mj.b
        public void a(om omVar) {
            omVar.setWebChromeClient(this.d);
        }
    }
}
