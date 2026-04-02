package com.vungle.publisher;

import com.vungle.publisher.ei;
import com.vungle.publisher.ej;
import com.vungle.publisher.jn;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class jo extends ej<jn, jo> {
    @Inject
    jn.a g;
    @Inject
    a h;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.jm
    /* renamed from: I */
    public jn.a y() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: J */
    public a b_() {
        return this.h;
    }

    @Override // com.vungle.publisher.ej
    public String E() {
        return qr.a(z(), "index.html");
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends ej.a<jn, jo, wr> {
        @Inject
        Provider<jo> b;

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ int a(List list) {
            return super.a(list);
        }

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ List a(String str, String[] strArr) {
            return super.a(str, strArr);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.vungle.publisher.ej.a
        public jo a(jn jnVar, wr wrVar, ei.b bVar) {
            String q;
            if (wrVar == null || (q = wrVar.q()) == null) {
                return null;
            }
            jo joVar = (jo) super.a((a) jnVar, (jn) wrVar, bVar);
            joVar.a(q);
            return joVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public jo[] d(int i) {
            return new jo[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public jo g_() {
            jo joVar = this.b.get();
            joVar.f = this.a.a(joVar);
            return joVar;
        }
    }
}
