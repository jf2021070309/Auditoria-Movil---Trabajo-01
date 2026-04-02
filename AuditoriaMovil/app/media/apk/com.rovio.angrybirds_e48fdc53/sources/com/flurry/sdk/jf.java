package com.flurry.sdk;

import android.widget.Toast;
import com.flurry.sdk.ku;
import com.flurry.sdk.kw;
import com.flurry.sdk.ls;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class jf extends la implements ls.a {
    private static final String a = jf.class.getSimpleName();
    private String f;
    private boolean g;

    public jf() {
        this((byte) 0);
    }

    private jf(byte b) {
        super("Analytics", jf.class.getSimpleName());
        this.c = "AnalyticsData_";
        lr a2 = lr.a();
        this.g = ((Boolean) a2.a("UseHttps")).booleanValue();
        a2.a("UseHttps", (ls.a) this);
        ko.a(4, a, "initSettings, UseHttps = " + this.g);
        String str = (String) a2.a("ReportUrl");
        a2.a("ReportUrl", (ls.a) this);
        b(str);
        ko.a(4, a, "initSettings, ReportUrl = " + str);
        b();
    }

    private void b(String str) {
        if (str != null && !str.endsWith(".do")) {
            ko.a(5, a, "overriding analytics agent report URL without an endpoint, are you sure?");
        }
        this.f = str;
    }

    @Override // com.flurry.sdk.ls.a
    public final void a(String str, Object obj) {
        char c = 65535;
        switch (str.hashCode()) {
            case -239660092:
                if (str.equals("UseHttps")) {
                    c = 0;
                    break;
                }
                break;
            case 1650629499:
                if (str.equals("ReportUrl")) {
                    c = 1;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.g = ((Boolean) obj).booleanValue();
                ko.a(4, a, "onSettingUpdate, UseHttps = " + this.g);
                return;
            case 1:
                String str2 = (String) obj;
                b(str2);
                ko.a(4, a, "onSettingUpdate, ReportUrl = " + str2);
                return;
            default:
                ko.a(6, a, "onSettingUpdate internal error!");
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.flurry.sdk.la
    public final void a(String str, String str2, final int i) {
        ka.a().b(new mc() { // from class: com.flurry.sdk.jf.2
            @Override // com.flurry.sdk.mc
            public final void a() {
                if (i == 200) {
                    hs.a();
                    jj b = hs.b();
                    if (b == null) {
                        return;
                    }
                    b.j = true;
                }
            }
        });
        super.a(str, str2, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.flurry.sdk.la
    public final void a(byte[] bArr, final String str, final String str2) {
        String str3;
        if (this.f != null) {
            str3 = this.f;
        } else if (this.g) {
            str3 = "https://data.flurry.col/aap.do";
        } else {
            str3 = "http://data.flurry.col/aap.do";
        }
        ko.a(4, a, "FlurryDataSender: start upload data " + Arrays.toString(bArr) + " with id = " + str + " to " + str3);
        ku kuVar = new ku();
        kuVar.g = str3;
        kuVar.u = 100000;
        kuVar.h = kw.a.kPost;
        kuVar.a(DownloadUtils.CONTENT_TYPE, "application/octet-stream");
        kuVar.c = new le();
        kuVar.b = bArr;
        kuVar.a = new ku.a<byte[], Void>() { // from class: com.flurry.sdk.jf.1
            @Override // com.flurry.sdk.ku.a
            public final /* synthetic */ void a(ku<byte[], Void> kuVar2, Void r7) {
                final int i = kuVar2.q;
                if (i > 0) {
                    ko.e(jf.a, "Analytics report sent.");
                    ko.a(3, jf.a, "FlurryDataSender: report " + str + " sent. HTTP response: " + i);
                    if (ko.c() <= 3 && ko.d()) {
                        ka.a().a(new Runnable() { // from class: com.flurry.sdk.jf.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Toast.makeText(ka.a().a, "SD HTTP Response Code: " + i, 0).show();
                            }
                        });
                    }
                    jf.this.a(str, str2, i);
                    jf.this.b();
                    return;
                }
                jf.this.a(str);
            }
        };
        jy.a().a((Object) this, (jf) kuVar);
    }
}
