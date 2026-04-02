package com.vungle.publisher;

import com.vungle.publisher.tr;
import javax.inject.Singleton;
import rx.Observable;
import rx.functions.Func1;
/* loaded from: classes4.dex */
public class th extends tr {
    th() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.tr
    public tr.b a() {
        return tr.b.GET;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.tr
    public tr.c b() {
        return tr.c.download;
    }

    @Override // com.vungle.publisher.tr
    public String toString() {
        return "{" + b() + ": " + c() + "}";
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends tr.a<th> implements Func1<gd<?>, Observable<th>> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.tr.a
        /* renamed from: a */
        public th b() {
            return new th();
        }

        @Override // rx.functions.Func1
        /* renamed from: a */
        public Observable<th> call(gd<?> gdVar) {
            th c = c();
            c.a(gdVar.e());
            return Observable.just(c);
        }
    }
}
