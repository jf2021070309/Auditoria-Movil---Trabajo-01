package com.ironsource.sdk.controller;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f {
    long a;
    int b;
    int c;
    b d = b.NONE;
    private String e;
    private String f;
    private com.ironsource.sdk.k.b g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.sdk.controller.f$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.a().length];
            a = iArr;
            try {
                int i = a.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = a;
                int i2 = a.b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = a;
                int i3 = a.c;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {1, 2, 3};

        public static int[] a() {
            return (int[]) d.clone();
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);
        
        int g;

        b(int i) {
            this.g = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(JSONObject jSONObject, String str, String str2, com.ironsource.sdk.k.b bVar) {
        int optInt = jSONObject.optInt("controllerSourceStrategy", -1);
        this.b = optInt;
        this.c = optInt != 1 ? optInt != 2 ? a.a : a.c : a.b;
        this.e = str;
        this.f = str2;
        this.g = bVar;
    }

    private void a(com.ironsource.sdk.h.c cVar) {
        if (this.g.b()) {
            return;
        }
        this.g.a(cVar, this.f);
    }

    private com.ironsource.sdk.h.c f() {
        return new com.ironsource.sdk.h.c(this.e, "mobileController.html");
    }

    private com.ironsource.sdk.h.c g() {
        return new com.ironsource.sdk.h.c(this.e, "next_mobileController.html");
    }

    private com.ironsource.sdk.h.c h() {
        return new com.ironsource.sdk.h.c(this.e, "fallback_mobileController.html");
    }

    private void i() {
        try {
            com.ironsource.sdk.h.c f = f();
            if (f.exists()) {
                com.ironsource.sdk.h.c h = h();
                if (h.exists()) {
                    h.delete();
                }
                IronSourceStorageUtils.renameFile(f.getPath(), h.getPath());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b bVar) {
        com.ironsource.sdk.a.a a2 = new com.ironsource.sdk.a.a().a("generalmessage", Integer.valueOf(this.b)).a("controllersource", Integer.valueOf(bVar.g));
        if (this.a > 0) {
            a2.a("timingvalue", Long.valueOf(System.currentTimeMillis() - this.a));
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.t, a2.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.d != b.NONE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        com.ironsource.sdk.h.c cVar;
        int i = AnonymousClass2.a[this.c - 1];
        if (i == 1) {
            IronSourceStorageUtils.deleteFile(f());
            cVar = new com.ironsource.sdk.h.c(this.e, SDKUtils.getFileName(this.f));
        } else if (i != 2) {
            if (i == 3) {
                try {
                    com.ironsource.sdk.h.c f = f();
                    com.ironsource.sdk.h.c g = g();
                    if (!g.exists() && !f.exists()) {
                        a(new com.ironsource.sdk.h.c(this.e, SDKUtils.getFileName(this.f)));
                        return false;
                    } else if (!g.exists() && f.exists()) {
                        b bVar = b.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                        this.d = bVar;
                        a(bVar);
                        a(new com.ironsource.sdk.h.c(this.e, g.getName()));
                        return true;
                    } else {
                        i();
                        if (IronSourceStorageUtils.renameFile(g().getPath(), f().getPath())) {
                            b bVar2 = b.PREPARED_CONTROLLER_LOADED;
                            this.d = bVar2;
                            a(bVar2);
                            c();
                            a(new com.ironsource.sdk.h.c(this.e, g.getName()));
                            return true;
                        } else if (d()) {
                            b bVar3 = b.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.d = bVar3;
                            a(bVar3);
                            a(new com.ironsource.sdk.h.c(this.e, g.getName()));
                            return true;
                        } else {
                            a(new com.ironsource.sdk.h.c(this.e, SDKUtils.getFileName(this.f)));
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } else {
            i();
            cVar = new com.ironsource.sdk.h.c(this.e, SDKUtils.getFileName(this.f));
        }
        a(cVar);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        IronSourceStorageUtils.deleteFile(h());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        try {
            if (h().exists()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), f().getPath());
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject e() {
        return new JSONObject() { // from class: com.ironsource.sdk.controller.f.1
            {
                putOpt("controllerSourceStrategy", Integer.valueOf(f.this.b));
                putOpt("controllerSourceCode", Integer.valueOf(f.this.d.g));
            }
        };
    }
}
