package com.amazon.aps.iva.h40;

import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.p;
import androidx.preference.SwitchPreferenceCompat;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.fz.k;
import com.amazon.aps.iva.g70.f;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.us.w;
import com.amazon.aps.iva.us.z;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: NotificationSettingsFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/h40/b;", "Lcom/amazon/aps/iva/h40/g;", "Lcom/amazon/aps/iva/sy/a;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.sy.a implements g {
    public final com.amazon.aps.iva.ez.f k = new com.amazon.aps.iva.ez.f(this, i.class, c.h);
    public final m l = com.amazon.aps.iva.kb0.f.b(new C0323b());
    public static final /* synthetic */ l<Object>[] n = {q.a(b.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/presentation/settings/notifications/NotificationSettingsViewModelImpl;", 0)};
    public static final a m = new a();

    /* compiled from: NotificationSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: NotificationSettingsFragment.kt */
    /* renamed from: com.amazon.aps.iva.h40.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0323b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<e> {
        public C0323b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final e invoke() {
            a aVar = b.m;
            b bVar = b.this;
            bVar.getClass();
            return new f(bVar, (i) bVar.k.getValue(bVar, b.n[0]));
        }
    }

    /* compiled from: NotificationSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, i> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final i invoke(p pVar) {
            j.f(pVar, "it");
            com.amazon.aps.iva.gz.b bVar = com.ellation.crunchyroll.application.e.b().g;
            if (bVar != null) {
                com.amazon.aps.iva.bo.f b = com.ellation.crunchyroll.application.e.b().b();
                z zVar = w.a.a;
                j.f(zVar, "userSessionAnalytics");
                return new i(new d(new k(bVar, b, zVar), new com.amazon.aps.iva.hz.b(com.ellation.crunchyroll.application.e.b())));
            }
            j.m("notificationStateStore");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.h40.g
    public final void Eb(int i, boolean z) {
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) G4(getString(i));
        if (switchPreferenceCompat != null) {
            switchPreferenceCompat.B(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004f, code lost:
        if (r2.size() > 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0060, code lost:
        if (r0.getPackageManager().queryIntentActivities(r1, com.google.android.gms.cast.Cast.MAX_MESSAGE_LENGTH).size() > 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0062, code lost:
        r2 = true;
     */
    @Override // com.amazon.aps.iva.h40.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K9() {
        /*
            r5 = this;
            androidx.fragment.app.h r0 = r5.requireActivity()
            java.lang.String r1 = "requireActivity()"
            com.amazon.aps.iva.yb0.j.e(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "android.settings.APP_NOTIFICATION_SETTINGS"
            android.content.Intent r1 = r1.setAction(r2)
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r3 = "android.provider.extra.APP_PACKAGE"
            android.content.Intent r1 = r1.putExtra(r3, r2)
            java.lang.String r2 = "app_package"
            java.lang.String r3 = r0.getPackageName()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo()
            int r2 = r2.uid
            java.lang.String r3 = "app_uid"
            android.content.Intent r1 = r1.putExtra(r3, r2)
            java.lang.String r2 = "Intent()\n            .se…vity.applicationInfo.uid)"
            com.amazon.aps.iva.yb0.j.e(r1, r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 < r3) goto L52
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            android.content.pm.PackageManager$ResolveInfoFlags r3 = com.amazon.aps.iva.d2.t.a()
            java.util.List r2 = com.amazon.aps.iva.ap.c.c(r2, r1, r3)
            int r2 = r2.size()
            if (r2 <= 0) goto L64
            goto L62
        L52:
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            r3 = 65536(0x10000, float:9.18355E-41)
            java.util.List r2 = r2.queryIntentActivities(r1, r3)
            int r2 = r2.size()
            if (r2 <= 0) goto L64
        L62:
            r2 = 1
            goto L65
        L64:
            r2 = 0
        L65:
            if (r2 == 0) goto L68
            goto L69
        L68:
            r1 = 0
        L69:
            if (r1 != 0) goto L95
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            android.content.Intent r1 = r1.setAction(r2)
            java.lang.String r2 = r0.getPackageName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "package:"
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.content.Intent r1 = r1.setData(r2)
            java.lang.String r2 = "Intent()\n            .se…{activity.packageName}\"))"
            com.amazon.aps.iva.yb0.j.e(r1, r2)
        L95:
            r0.startActivity(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h40.b.K9():void");
    }

    @Override // com.amazon.aps.iva.h40.g
    public final void O6() {
        com.amazon.aps.iva.g70.g gVar = new com.amazon.aps.iva.g70.g(R.style.MaterialAlertDialog, null, getString(R.string.dialog_system_notification_settings_message), getString(R.string.dialog_system_notification_settings_positive), null, getString(R.string.dialog_system_notification_settings_negative), 18);
        com.amazon.aps.iva.g70.f.e.getClass();
        f.a.a(gVar).show(getParentFragmentManager(), "system_settings_dialog");
    }

    @Override // androidx.preference.b
    public final void ci(String str) {
        gi(R.xml.notification_settings, str);
    }

    @Override // androidx.preference.b
    public final void ei(Drawable drawable) {
        super.ei(new ColorDrawable(0));
    }

    @Override // androidx.preference.b
    public final void fi(int i) {
        super.fi(0);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        com.amazon.aps.iva.fz.l[] values;
        j.f(sharedPreferences, "prefences");
        if (str != null && G4(str) != null) {
            for (com.amazon.aps.iva.fz.l lVar : com.amazon.aps.iva.fz.l.values()) {
                if (j.a(getString(lVar.getKeyRes()), str)) {
                    ((e) this.l.getValue()).n6(lVar, sharedPreferences.getBoolean(str, false));
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    @Override // com.amazon.aps.iva.wy.f, androidx.preference.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.app_legal_info_layout);
        j.e(findViewById, "view.findViewById<View>(…id.app_legal_info_layout)");
        findViewById.setVisibility(8);
        t0.j(view, null, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.settings_content_container_margin_top)), null, null, 13);
        getParentFragmentManager().b0("system_settings_dialog", this, (e) this.l.getValue());
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((e) this.l.getValue());
    }
}
