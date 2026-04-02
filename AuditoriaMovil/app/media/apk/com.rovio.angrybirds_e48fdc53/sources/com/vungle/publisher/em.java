package com.vungle.publisher;

import com.vungle.publisher.ei;
import com.vungle.publisher.ej;
import com.vungle.publisher.el;
import com.vungle.publisher.lb;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class em extends ej<el, em> {
    @Inject
    el.a g;
    @Inject
    a h;
    @Inject
    lb.a i;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: I */
    public a b_() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.jm
    /* renamed from: J */
    public el.a y() {
        return this.g;
    }

    public lb K() {
        return this.i.a(D().toURI().toString());
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends ej.a<el, em, wg> {
        @Inject
        Provider<em> b;

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
        public em a(el elVar, wg wgVar, ei.b bVar) {
            if (wgVar == null) {
                return null;
            }
            if (bVar == ei.b.postRoll) {
                String n = wgVar.n();
                if (n == null) {
                    return null;
                }
                em emVar = (em) super.a((a) elVar, (el) wgVar, bVar);
                emVar.a(n);
                return emVar;
            }
            throw new IllegalArgumentException("cannot create archive of type: " + bVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public em[] d(int i) {
            return new em[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public em g_() {
            em emVar = this.b.get();
            emVar.f = this.a.a(emVar);
            return emVar;
        }
    }
}
