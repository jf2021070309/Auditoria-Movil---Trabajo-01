package com.vungle.publisher;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.vungle.publisher.lf;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.mj;
import javax.inject.Inject;
/* loaded from: classes4.dex */
public abstract class mm<W extends mj> extends mf {
    protected lf e;
    protected W f;
    protected String g;
    protected p h;
    protected x i;
    @Inject
    com.vungle.publisher.env.i j;
    @Inject
    qg k;
    @Inject
    lf.b l;
    @Inject
    Context m;

    protected abstract W a(String str, p pVar, x xVar);

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            if (bundle != null) {
                this.e = this.l.a(bundle);
                this.g = bundle.getString(VungleAdActivity.AD_ID_EXTRA_KEY);
                this.i = x.a(bundle.getString("templateType"));
            }
        } catch (Exception e) {
            Logger.w(Logger.AD_TAG, "exception in onCreate", e);
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f.onConfigurationChanged(configuration);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RelativeLayout relativeLayout;
        Exception e;
        W a2;
        try {
            a2 = a(this.g, this.h, this.i);
            this.f = a2;
            a2.a(this.e);
            this.j.a(a2);
            zo.a((View) a2);
            relativeLayout = new RelativeLayout(this.m);
        } catch (Exception e2) {
            relativeLayout = null;
            e = e2;
        }
        try {
            relativeLayout.addView(a2);
            ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
        } catch (Exception e3) {
            e = e3;
            Logger.w(Logger.AD_TAG, "exception in onCreateView", e);
            return relativeLayout;
        }
        return relativeLayout;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        Logger.d(Logger.AD_TAG, "webview fragment onDestroy()");
        super.onDestroy();
        if (this.f != null) {
            this.f.destroy();
        }
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString(VungleAdActivity.AD_ID_EXTRA_KEY, this.g);
        bundle.putString("templateType", this.i.name());
        this.e.a(bundle);
        super.onSaveInstanceState(bundle);
    }

    /* loaded from: classes4.dex */
    public static abstract class a<A extends mm<?>> {
        protected abstract A a();

        protected abstract String b();

        public A a(Activity activity, String str, lf lfVar, p pVar, boolean z, x xVar) {
            A a = a(activity);
            if (a == null) {
                a = a();
            }
            return a((a<A>) a, str, lfVar, pVar, z, xVar);
        }

        private A a(A a, String str, lf lfVar, p pVar, boolean z, x xVar) {
            a.e = lfVar;
            a.g = str;
            a.h = pVar;
            a.c = z;
            a.i = xVar;
            return a;
        }

        private A a(Activity activity) {
            return (A) activity.getFragmentManager().findFragmentByTag(b());
        }
    }
}
