package com.amazon.aps.iva.a10;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.sv.e;
import com.amazon.aps.iva.u70.c;
import com.amazon.aps.iva.x50.n;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import com.ellation.crunchyroll.ui.R;
import java.util.List;
/* compiled from: SyncingStartedMessageView.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    public final ViewGroup b;
    public com.amazon.aps.iva.u70.c c;
    public final com.amazon.aps.iva.a10.b d;

    /* compiled from: SyncingStartedMessageView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ q invoke() {
            return q.a;
        }
    }

    /* compiled from: SyncingStartedMessageView.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.xb0.a<q> aVar) {
            super(0);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.invoke();
            return q.a;
        }
    }

    public d(ViewGroup viewGroup) {
        this.b = viewGroup;
        com.amazon.aps.iva.zv.b bVar = e.e;
        if (bVar != null) {
            com.amazon.aps.iva.p00.a z = bVar.z();
            n nVar = new n(new Handler(Looper.getMainLooper()));
            j.f(z, "audioLanguageTitleProvider");
            com.amazon.aps.iva.a10.b bVar2 = new com.amazon.aps.iva.a10.b(z, this, nVar);
            com.ellation.crunchyroll.mvp.lifecycle.a.b(bVar2, viewGroup);
            this.d = bVar2;
            return;
        }
        j.m("dependencies");
        throw null;
    }

    public final void G(List<PlayableAssetVersion> list, String str, com.amazon.aps.iva.xb0.a<q> aVar) {
        j.f(list, "versions");
        j.f(str, "audioLocale");
        com.amazon.aps.iva.a10.b bVar = this.d;
        bVar.getClass();
        com.amazon.aps.iva.p00.a aVar2 = bVar.b;
        boolean z = true;
        if (!m.b0(aVar2.getTitleForLanguage(str))) {
            c view = bVar.getView();
            String titleForLanguage = aVar2.getTitleForLanguage(str);
            if (list.size() <= 1) {
                z = false;
            }
            view.aa(titleForLanguage, z, aVar);
            bVar.c.b(new com.amazon.aps.iva.a10.a(bVar.getView()), 5000L);
        }
    }

    @Override // com.amazon.aps.iva.a10.c
    public final void aa(String str, boolean z, com.amazon.aps.iva.xb0.a<q> aVar) {
        int i;
        j.f(str, "audioLanguageTitle");
        int i2 = com.amazon.aps.iva.u70.c.a;
        int i3 = R.style.ActionSnackBarTextStyle;
        int i4 = R.style.ActionSnackBarActionTextStyle;
        ViewGroup viewGroup = this.b;
        com.amazon.aps.iva.u70.c a2 = c.a.a(viewGroup, -2, i3, i4);
        a2.b(a.h, new b(aVar));
        String string = viewGroup.getContext().getString(com.crunchyroll.crunchyroid.R.string.syncing_started_message_format, str);
        j.e(string, "viewGroup.context.getStr…geTitle\n                )");
        if (z) {
            i = com.crunchyroll.crunchyroid.R.string.action_change;
        } else {
            i = 0;
        }
        com.amazon.aps.iva.u70.c.c(a2, string, i, R.drawable.ic_information, 4);
        this.c = a2;
    }

    @Override // com.amazon.aps.iva.a10.c
    public final void hide() {
        com.amazon.aps.iva.u70.c cVar = this.c;
        if (cVar != null) {
            cVar.dismiss();
        }
    }
}
