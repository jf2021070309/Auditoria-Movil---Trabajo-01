package com.flurry.sdk;

import com.flurry.sdk.lb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public abstract class la {
    public final String b;
    public lc e;
    public String c = "defaultDataKey_";
    public Set<String> d = new HashSet();
    private kj<js> a = new kj<js>() { // from class: com.flurry.sdk.la.1
        @Override // com.flurry.sdk.kj
        public final /* synthetic */ void a(js jsVar) {
            js jsVar2 = jsVar;
            ko.a(4, la.this.b, "onNetworkStateChanged : isNetworkEnable = " + jsVar2.a);
            if (!jsVar2.a) {
                return;
            }
            la.this.b();
        }
    };

    /* loaded from: classes2.dex */
    public interface a {
    }

    public abstract void a(byte[] bArr, String str, String str2);

    public la(final String str, String str2) {
        this.b = str2;
        kk.a().a("com.flurry.android.sdk.NetworkStateEvent", this.a);
        ka.a().b(new mc() { // from class: com.flurry.sdk.la.2
            @Override // com.flurry.sdk.mc
            public final void a() {
                la.this.e = new lc(str);
            }
        });
    }

    public final void b() {
        ka.a().b(new mc() { // from class: com.flurry.sdk.la.4
            final /* synthetic */ a a = null;

            @Override // com.flurry.sdk.mc
            public final void a() {
                final la laVar = la.this;
                if (!jt.a().b) {
                    ko.a(5, laVar.b, "Reports were not sent! No Internet connection!");
                    return;
                }
                ArrayList<String> arrayList = new ArrayList(laVar.e.c.keySet());
                if (arrayList.isEmpty()) {
                    ko.a(4, laVar.b, "No more reports to send.");
                    return;
                }
                for (String str : arrayList) {
                    if (!laVar.c()) {
                        return;
                    }
                    List<String> a2 = laVar.e.a(str);
                    ko.a(4, laVar.b, "Number of not sent blocks = " + a2.size());
                    for (String str2 : a2) {
                        if (!laVar.d.contains(str2)) {
                            if (laVar.c()) {
                                lb lbVar = (lb) new kh(ka.a().a.getFileStreamPath(lb.a(str2)), ".yflurrydatasenderblock.", 1, new ll<lb>() { // from class: com.flurry.sdk.la.6
                                    @Override // com.flurry.sdk.ll
                                    public final li<lb> a(int i) {
                                        return new lb.a();
                                    }
                                }).a();
                                if (lbVar == null) {
                                    ko.a(6, laVar.b, "Internal ERROR! Cannot read!");
                                    laVar.e.a(str2, str);
                                } else {
                                    byte[] bArr = lbVar.b;
                                    if (bArr == null || bArr.length == 0) {
                                        ko.a(6, laVar.b, "Internal ERROR! Report is empty!");
                                        laVar.e.a(str2, str);
                                    } else {
                                        ko.a(5, laVar.b, "Reading block info " + str2);
                                        laVar.d.add(str2);
                                        laVar.a(bArr, str2, str);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    public void a(final String str, final String str2, int i) {
        ka.a().b(new mc() { // from class: com.flurry.sdk.la.7
            @Override // com.flurry.sdk.mc
            public final void a() {
                if (!la.this.e.a(str, str2)) {
                    ko.a(6, la.this.b, "Internal error. Block wasn't deleted with id = " + str);
                }
                if (!la.this.d.remove(str)) {
                    ko.a(6, la.this.b, "Internal error. Block with id = " + str + " was not in progress state");
                }
            }
        });
    }

    public final void a(final String str) {
        ka.a().b(new mc() { // from class: com.flurry.sdk.la.8
            @Override // com.flurry.sdk.mc
            public final void a() {
                if (!la.this.d.remove(str)) {
                    ko.a(6, la.this.b, "Internal error. Block with id = " + str + " was not in progress state");
                }
            }
        });
    }

    public final void b(final byte[] bArr, final String str, final String str2) {
        if (bArr == null || bArr.length == 0) {
            ko.a(6, this.b, "Report that has to be sent is EMPTY or NULL");
            return;
        }
        ka.a().b(new mc() { // from class: com.flurry.sdk.la.3
            @Override // com.flurry.sdk.mc
            public final void a() {
                final la laVar = la.this;
                byte[] bArr2 = bArr;
                lb lbVar = new lb(bArr2);
                String str3 = lbVar.a;
                new kh(ka.a().a.getFileStreamPath(lb.a(str3)), ".yflurrydatasenderblock.", 1, new ll<lb>() { // from class: com.flurry.sdk.la.5
                    @Override // com.flurry.sdk.ll
                    public final li<lb> a(int i) {
                        return new lb.a();
                    }
                }).a(lbVar);
                ko.a(5, laVar.b, "Saving Block File " + str3 + " at " + ka.a().a.getFileStreamPath(lb.a(str3)));
                laVar.e.a(lbVar, laVar.c + str + "_" + str2);
            }
        });
        b();
    }

    final boolean c() {
        return this.d.size() <= 5;
    }
}
