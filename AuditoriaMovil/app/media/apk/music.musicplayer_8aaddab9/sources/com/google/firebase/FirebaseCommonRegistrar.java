package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import e.d.b.d.a;
import e.d.d.l.n;
import e.d.d.l.o;
import e.d.d.l.q;
import e.d.d.l.r;
import e.d.d.l.w;
import e.d.d.r.d;
import e.d.d.r.e;
import e.d.d.x.f;
import e.d.d.x.g;
import e.d.d.x.h;
import h.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements r {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // e.d.d.l.r
    public List<n<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        n.b a = n.a(h.class);
        a.a(new w(f.class, 2, 0));
        a.c(new q() { // from class: e.d.d.x.a
            @Override // e.d.d.l.q
            public final Object a(o oVar) {
                Set d2 = oVar.d(f.class);
                e eVar = e.a;
                if (eVar == null) {
                    synchronized (e.class) {
                        eVar = e.a;
                        if (eVar == null) {
                            eVar = new e();
                            e.a = eVar;
                        }
                    }
                }
                return new d(d2, eVar);
            }
        });
        arrayList.add(a.b());
        int i2 = d.a;
        n.b a2 = n.a(e.d.d.r.f.class);
        a2.a(new w(Context.class, 1, 0));
        a2.a(new w(e.class, 2, 0));
        a2.c(new q() { // from class: e.d.d.r.c
            @Override // e.d.d.l.q
            public final Object a(o oVar) {
                return new d((Context) oVar.a(Context.class), oVar.d(e.class));
            }
        });
        arrayList.add(a2.b());
        arrayList.add(a.t("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(a.t("fire-core", "20.0.0"));
        arrayList.add(a.t("device-name", a(Build.PRODUCT)));
        arrayList.add(a.t("device-model", a(Build.DEVICE)));
        arrayList.add(a.t("device-brand", a(Build.BRAND)));
        arrayList.add(a.z("android-target-sdk", new g() { // from class: e.d.d.c
            @Override // e.d.d.x.g
            public final String a(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            }
        }));
        arrayList.add(a.z("android-min-sdk", new g() { // from class: e.d.d.d
            @Override // e.d.d.x.g
            public final String a(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
            }
        }));
        arrayList.add(a.z("android-platform", new g() { // from class: e.d.d.e
            @Override // e.d.d.x.g
            public final String a(Object obj) {
                Context context = (Context) obj;
                int i3 = Build.VERSION.SDK_INT;
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : (i3 < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (i3 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i3 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : "auto" : "watch";
            }
        }));
        arrayList.add(a.z("android-installer", new g() { // from class: e.d.d.b
            @Override // e.d.d.x.g
            public final String a(Object obj) {
                Context context = (Context) obj;
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
            }
        }));
        try {
            str = c.a.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(a.t("kotlin", str));
        }
        return arrayList;
    }
}
