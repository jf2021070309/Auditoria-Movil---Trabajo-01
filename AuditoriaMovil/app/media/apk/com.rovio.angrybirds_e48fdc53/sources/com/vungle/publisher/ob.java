package com.vungle.publisher;

import android.os.Bundle;
import com.vungle.publisher.inject.Injector;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.mm;
import com.vungle.publisher.om;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class ob extends mm<om> {
    @Inject
    om.a n;

    @Override // com.vungle.publisher.mf
    public void a() {
        try {
            this.k.a(new ao());
        } catch (Exception e) {
            Logger.w(Logger.AD_TAG, "exception in onBackPressed", e);
        }
    }

    @Override // com.vungle.publisher.mf
    public String b() {
        return "postRollFragment";
    }

    @Override // com.vungle.publisher.mm, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (Injector.getInstance().d()) {
            Injector.c().a(this);
        } else {
            Logger.w(Logger.AD_TAG, "SDK not initialized");
            getActivity().finish();
        }
        super.onActivityCreated(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.mm
    /* renamed from: b */
    public om a(String str, p pVar, x xVar) {
        return this.n.a(str, pVar, this.c, xVar);
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends mm.a<ob> {
        @Inject
        Provider<ob> a;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.mm.a
        /* renamed from: c */
        public ob a() {
            return this.a.get();
        }

        @Override // com.vungle.publisher.mm.a
        protected String b() {
            return "postRollFragment";
        }
    }
}
