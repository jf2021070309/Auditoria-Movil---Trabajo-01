package com.vungle.publisher;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import com.vungle.publisher.cn;
import com.vungle.publisher.log.Logger;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import rx.subjects.BehaviorSubject;
/* loaded from: classes4.dex */
public abstract class mg<A extends cn> {
    A a;
    mf c;
    me<?> d;
    yj<?> e;
    protected String f;
    protected String g;
    @Inject
    qg i;
    @Inject
    zc j;
    @Inject
    com.vungle.publisher.env.i k;
    private p l;
    WeakReference<VungleAdActivity> b = new WeakReference<>(null);
    protected BehaviorSubject<Void> h = BehaviorSubject.create();

    protected abstract me<?> a();

    protected abstract yj<?> b();

    public void a(VungleAdActivity vungleAdActivity, A a2, String str, p pVar, Bundle bundle) {
        this.a = a2;
        this.b = new WeakReference<>(vungleAdActivity);
        this.l = pVar;
        this.g = str;
        this.d = a();
        this.e = b();
        this.d.register();
        this.e.register();
        boolean z = bundle != null;
        if (!z) {
            this.i.a(new av(a2, str, pVar));
        }
        this.f = z ? bundle.getString("currentFragment") : null;
    }

    public void a(Bundle bundle) {
        try {
            bundle.putString("currentFragment", this.c.b());
        } catch (Exception e) {
            Logger.e(Logger.AD_TAG, "error in onSaveInstanceState", e);
        }
    }

    public void a(Configuration configuration) {
    }

    public boolean a(int i, KeyEvent keyEvent) {
        return this.c.a(i, keyEvent);
    }

    public void c() {
        this.c.a();
    }

    public void a(boolean z) {
        this.c.a(z);
    }

    public void a(VungleAdActivity vungleAdActivity) {
        this.h.onNext(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z, boolean z2) {
        try {
            try {
                this.i.a(z ? new bv(this.a, this.g, z2) : new bu(this.a, this.g, z2));
                this.h.onNext(null);
                VungleAdActivity vungleAdActivity = this.b.get();
                if (vungleAdActivity != null) {
                    vungleAdActivity.finish();
                }
            } catch (Exception e) {
                Logger.e(Logger.AD_TAG, "error exiting ad", e);
                VungleAdActivity vungleAdActivity2 = this.b.get();
                if (vungleAdActivity2 != null) {
                    vungleAdActivity2.finish();
                }
            }
        } catch (Throwable th) {
            VungleAdActivity vungleAdActivity3 = this.b.get();
            if (vungleAdActivity3 != null) {
                vungleAdActivity3.finish();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Uri uri) {
        try {
            Intent a2 = this.j.a("android.intent.action.VIEW", uri);
            a2.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
            VungleAdActivity vungleAdActivity = this.b.get();
            if (vungleAdActivity != null) {
                vungleAdActivity.startActivity(a2);
            } else {
                Logger.e(Logger.AD_TAG, "error loading URL: " + uri.toString(), new Throwable("Activity destroyed."));
            }
        } catch (Exception e) {
            Logger.e(Logger.AD_TAG, "error loading URL: " + uri.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Uri uri) {
        a(uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(mf mfVar) {
        VungleAdActivity vungleAdActivity = this.b.get();
        if (mfVar != this.c && vungleAdActivity != null) {
            FragmentTransaction beginTransaction = vungleAdActivity.getFragmentManager().beginTransaction();
            if (this.l == null || this.l.isTransitionAnimationEnabled()) {
                beginTransaction.setTransition(4099);
            }
            this.c = mfVar;
            beginTransaction.replace(16908290, mfVar, mfVar.b());
            beginTransaction.commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i) {
        try {
            VungleAdActivity vungleAdActivity = this.b.get();
            if (vungleAdActivity != null) {
                vungleAdActivity.setRequestedOrientation(i);
            }
        } catch (Exception e) {
            Logger.e(Logger.AD_TAG, "could not set orientation", e);
        }
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        @Inject
        Provider<oy> a;
        @Inject
        Provider<nk> b;
        @Inject
        Provider<ns> c;

        public <P extends mg<A>, A extends cn> P a(A a) {
            if (x.flexview == x.a(a.s)) {
                return this.c.get();
            }
            return (P) new q<P>() { // from class: com.vungle.publisher.mg.a.1
                /* JADX INFO: Access modifiers changed from: protected */
                /* JADX WARN: Incorrect return type in method signature: ()TP; */
                @Override // com.vungle.publisher.q
                /* renamed from: e */
                public mg a() {
                    return a.this.a.get();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                /* JADX WARN: Incorrect return type in method signature: ()TP; */
                @Override // com.vungle.publisher.q
                /* renamed from: f */
                public mg b() {
                    return a.this.a.get();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                /* JADX WARN: Incorrect return type in method signature: ()TP; */
                @Override // com.vungle.publisher.q
                /* renamed from: g */
                public mg c() {
                    return a.this.b.get();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                /* JADX WARN: Incorrect return type in method signature: ()TP; */
                @Override // com.vungle.publisher.q
                /* renamed from: h */
                public mg d() {
                    return a.this.b.get();
                }
            }.a(a);
        }
    }
}
