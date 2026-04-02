package e.a.a.a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import c.t.m;
import ch.qos.logback.core.CoreConstants;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.SkuDetails;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzd;
import com.google.android.gms.internal.play_billing.zzp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d extends c {
    public volatile int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4978b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f4979c;

    /* renamed from: d  reason: collision with root package name */
    public volatile e0 f4980d;

    /* renamed from: e  reason: collision with root package name */
    public Context f4981e;

    /* renamed from: f  reason: collision with root package name */
    public volatile zzd f4982f;

    /* renamed from: g  reason: collision with root package name */
    public volatile y f4983g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4984h;

    /* renamed from: i  reason: collision with root package name */
    public int f4985i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4986j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4987k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4988l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4989m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4990n;
    public boolean o;
    public boolean p;
    public ExecutorService q;

    public d(String str, boolean z, Context context, p pVar) {
        String str2;
        try {
            str2 = (String) Class.forName("e.a.a.b.a").getField(CoreConstants.VERSION_NAME_KEY).get(null);
        } catch (Exception unused) {
            str2 = "4.0.0";
        }
        this.a = 0;
        this.f4979c = new Handler(Looper.getMainLooper());
        this.f4985i = 0;
        this.f4978b = str2;
        Context applicationContext = context.getApplicationContext();
        this.f4981e = applicationContext;
        this.f4980d = new e0(applicationContext, pVar);
        this.p = z;
    }

    @Override // e.a.a.a.c
    public final void a(final a aVar, final b bVar) {
        if (!b()) {
            j jVar = b0.f4976m;
            i.a.s sVar = ((e) bVar).a;
            h.o.c.j.d(jVar, "it");
            sVar.M(jVar);
        } else if (TextUtils.isEmpty(aVar.a)) {
            zza.zzk("BillingClient", "Please provide a valid purchase token.");
            j jVar2 = b0.f4973j;
            i.a.s sVar2 = ((e) bVar).a;
            h.o.c.j.d(jVar2, "it");
            sVar2.M(jVar2);
        } else if (!this.f4987k) {
            j jVar3 = b0.f4965b;
            i.a.s sVar3 = ((e) bVar).a;
            h.o.c.j.d(jVar3, "it");
            sVar3.M(jVar3);
        } else if (k(new Callable() { // from class: e.a.a.a.g0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                d dVar = d.this;
                a aVar2 = aVar;
                b bVar2 = bVar;
                Objects.requireNonNull(dVar);
                try {
                    Bundle zzd = dVar.f4982f.zzd(9, dVar.f4981e.getPackageName(), aVar2.a, zza.zzb(aVar2, dVar.f4978b));
                    int zza = zza.zza(zzd, "BillingClient");
                    zza.zzh(zzd, "BillingClient");
                    j jVar4 = new j();
                    jVar4.a = zza;
                    i.a.s sVar4 = ((e) bVar2).a;
                    h.o.c.j.d(jVar4, "it");
                    sVar4.M(jVar4);
                    return null;
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 32);
                    sb.append("Error acknowledge purchase; ex: ");
                    sb.append(valueOf);
                    zza.zzk("BillingClient", sb.toString());
                    j jVar5 = b0.f4976m;
                    i.a.s sVar5 = ((e) bVar2).a;
                    h.o.c.j.d(jVar5, "it");
                    sVar5.M(jVar5);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: e.a.a.a.f0
            @Override // java.lang.Runnable
            public final void run() {
                b bVar2 = b.this;
                j jVar4 = b0.f4977n;
                i.a.s sVar4 = ((e) bVar2).a;
                h.o.c.j.d(jVar4, "it");
                sVar4.M(jVar4);
            }
        }, h()) == null) {
            j j2 = j();
            i.a.s sVar4 = ((e) bVar).a;
            h.o.c.j.d(j2, "it");
            sVar4.M(j2);
        }
    }

    @Override // e.a.a.a.c
    public final boolean b() {
        return (this.a != 2 || this.f4982f == null || this.f4983g == null) ? false : true;
    }

    @Override // e.a.a.a.c
    public final j c(Activity activity, final i iVar) {
        String str;
        String str2;
        String str3;
        String str4;
        Future k2;
        String str5;
        String str6;
        String str7;
        Bundle bundle;
        boolean z;
        String str8;
        if (!b()) {
            j jVar = b0.f4976m;
            i(jVar);
            return jVar;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(iVar.f5002f);
        final SkuDetails skuDetails = (SkuDetails) arrayList.get(0);
        final String e2 = skuDetails.e();
        String str9 = "BillingClient";
        if (e2.equals("subs") && !this.f4984h) {
            zza.zzk("BillingClient", "Current client doesn't support subscriptions.");
            j jVar2 = b0.o;
            i(jVar2);
            return jVar2;
        }
        if (((!iVar.f5003g && iVar.f4998b == null && iVar.f5000d == null && iVar.f5001e == 0 && !iVar.a) ? false : true) && !this.f4986j) {
            zza.zzk("BillingClient", "Current client doesn't support extra params for buy intent.");
            j jVar3 = b0.f4970g;
            i(jVar3);
            return jVar3;
        } else if (arrayList.size() > 1 && !this.o) {
            zza.zzk("BillingClient", "Current client doesn't support multi-item purchases.");
            j jVar4 = b0.p;
            i(jVar4);
            return jVar4;
        } else {
            String str10 = "";
            int i2 = 0;
            String str11 = "";
            while (i2 < arrayList.size()) {
                String valueOf = String.valueOf(str11);
                String valueOf2 = String.valueOf(arrayList.get(i2));
                String str12 = str10;
                String r = e.a.d.a.a.r(new StringBuilder(valueOf.length() + valueOf2.length()), valueOf, valueOf2);
                if (i2 < arrayList.size() - 1) {
                    r = String.valueOf(r).concat(", ");
                }
                str11 = r;
                i2++;
                str10 = str12;
            }
            String str13 = str10;
            zza.zzj("BillingClient", e.a.d.a.a.t(new StringBuilder(String.valueOf(str11).length() + 41 + e2.length()), "Constructing buy intent for ", str11, ", item type: ", e2));
            if (this.f4986j) {
                final Bundle zze = zza.zze(iVar, this.f4987k, this.p, this.f4978b);
                ArrayList<String> arrayList2 = new ArrayList<>();
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<Integer> arrayList5 = new ArrayList<>();
                str2 = "; try to reconnect";
                ArrayList<String> arrayList6 = new ArrayList<>();
                str4 = str11;
                int size = arrayList.size();
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                str = "BUY_INTENT";
                int i3 = 0;
                while (i3 < size) {
                    int i4 = size;
                    SkuDetails skuDetails2 = (SkuDetails) arrayList.get(i3);
                    String str14 = str9;
                    if (!skuDetails2.f2940b.optString("skuDetailsToken").isEmpty()) {
                        arrayList2.add(skuDetails2.f2940b.optString("skuDetailsToken"));
                    }
                    try {
                        str8 = new JSONObject(skuDetails2.a).optString("offer_id_token");
                    } catch (JSONException unused) {
                        str8 = str13;
                    }
                    String str15 = e2;
                    String optString = skuDetails2.f2940b.optString("offer_id");
                    int optInt = skuDetails2.f2940b.optInt("offer_type");
                    String optString2 = skuDetails2.f2940b.optString("serializedDocid");
                    arrayList3.add(str8);
                    z2 |= !TextUtils.isEmpty(str8);
                    arrayList4.add(optString);
                    z3 |= !TextUtils.isEmpty(optString);
                    arrayList5.add(Integer.valueOf(optInt));
                    z4 |= optInt != 0;
                    z5 |= !TextUtils.isEmpty(optString2);
                    arrayList6.add(optString2);
                    i3++;
                    str9 = str14;
                    size = i4;
                    e2 = str15;
                }
                final String str16 = e2;
                str3 = str9;
                if (!arrayList2.isEmpty()) {
                    zze.putStringArrayList("skuDetailsTokens", arrayList2);
                }
                if (z2) {
                    if (!this.f4989m) {
                        j jVar5 = b0.f4971h;
                        i(jVar5);
                        return jVar5;
                    }
                    zze.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList3);
                }
                if (z3) {
                    zze.putStringArrayList("SKU_OFFER_ID_LIST", arrayList4);
                }
                if (z4) {
                    zze.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList5);
                }
                if (z5) {
                    zze.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                if (TextUtils.isEmpty(skuDetails.f())) {
                    z = false;
                } else {
                    zze.putString("skuPackageName", skuDetails.f());
                    z = true;
                }
                if (!TextUtils.isEmpty(null)) {
                    zze.putString("accountName", null);
                }
                if (arrayList.size() > 1) {
                    ArrayList<String> arrayList7 = new ArrayList<>(arrayList.size() - 1);
                    ArrayList<String> arrayList8 = new ArrayList<>(arrayList.size() - 1);
                    for (int i5 = 1; i5 < arrayList.size(); i5++) {
                        arrayList7.add(((SkuDetails) arrayList.get(i5)).d());
                        arrayList8.add(((SkuDetails) arrayList.get(i5)).e());
                    }
                    zze.putStringArrayList("additionalSkus", arrayList7);
                    zze.putStringArrayList("additionalSkuTypes", arrayList8);
                }
                if (!TextUtils.isEmpty(activity.getIntent().getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = activity.getIntent().getStringExtra("PROXY_PACKAGE");
                    zze.putString("proxyPackage", stringExtra);
                    try {
                        zze.putString("proxyPackageVersion", this.f4981e.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        zze.putString("proxyPackageVersion", "package not found");
                    }
                }
                final int i6 = (this.f4990n && z) ? 15 : this.f4987k ? 9 : iVar.f5003g ? 7 : 6;
                k2 = k(new Callable() { // from class: e.a.a.a.o0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        d dVar = d.this;
                        int i7 = i6;
                        SkuDetails skuDetails3 = skuDetails;
                        return dVar.f4982f.zzg(i7, dVar.f4981e.getPackageName(), skuDetails3.d(), str16, null, zze);
                    }
                }, 5000L, null, this.f4979c);
            } else {
                str = "BUY_INTENT";
                str2 = "; try to reconnect";
                str3 = "BillingClient";
                str4 = str11;
                k2 = k(new Callable() { // from class: e.a.a.a.h0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        d dVar = d.this;
                        SkuDetails skuDetails3 = skuDetails;
                        return dVar.f4982f.zzf(3, dVar.f4981e.getPackageName(), skuDetails3.d(), e2, null);
                    }
                }, 5000L, null, this.f4979c);
            }
            try {
                try {
                    try {
                        bundle = (Bundle) k2.get(5000L, TimeUnit.MILLISECONDS);
                        str7 = str3;
                    } catch (CancellationException | TimeoutException unused3) {
                        str7 = str3;
                    }
                } catch (Exception unused4) {
                    str7 = str3;
                }
            } catch (CancellationException | TimeoutException unused5) {
                str5 = str2;
                str6 = str4;
                str7 = str3;
            }
            try {
                int zza = zza.zza(bundle, str7);
                zza.zzh(bundle, str7);
                if (zza == 0) {
                    Intent intent = new Intent(activity, ProxyBillingActivity.class);
                    String str17 = str;
                    intent.putExtra(str17, (PendingIntent) bundle.getParcelable(str17));
                    activity.startActivity(intent);
                    return b0.f4975l;
                }
                StringBuilder sb = new StringBuilder(52);
                sb.append("Unable to buy item, Error response code: ");
                sb.append(zza);
                zza.zzk(str7, sb.toString());
                j jVar6 = new j();
                jVar6.a = zza;
                i(jVar6);
                return jVar6;
            } catch (CancellationException | TimeoutException unused6) {
                str5 = str2;
                str6 = str4;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 68);
                sb2.append("Time out while launching billing flow: ; for sku: ");
                sb2.append(str6);
                sb2.append(str5);
                zza.zzk(str7, sb2.toString());
                j jVar7 = b0.f4977n;
                i(jVar7);
                return jVar7;
            } catch (Exception unused7) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 69);
                sb3.append("Exception while launching billing flow: ; for sku: ");
                sb3.append(str4);
                sb3.append(str2);
                zza.zzk(str7, sb3.toString());
                j jVar8 = b0.f4976m;
                i(jVar8);
                return jVar8;
            }
        }
    }

    @Override // e.a.a.a.c
    public final void d(String str, final l lVar) {
        if (!b()) {
            ((f) lVar).a(b0.f4976m, null);
        } else if (k(new u(this, str, lVar), 30000L, new Runnable() { // from class: e.a.a.a.k0
            @Override // java.lang.Runnable
            public final void run() {
                ((f) l.this).a(b0.f4977n, null);
            }
        }, h()) == null) {
            ((f) lVar).a(j(), null);
        }
    }

    @Override // e.a.a.a.c
    public void e(String str, final n nVar) {
        if (!b()) {
            ((g) nVar).a(b0.f4976m, zzp.zzg());
        } else if (TextUtils.isEmpty(str)) {
            zza.zzk("BillingClient", "Please provide a valid SKU type.");
            ((g) nVar).a(b0.f4969f, zzp.zzg());
        } else if (k(new t(this, str, nVar), 30000L, new Runnable() { // from class: e.a.a.a.l0
            @Override // java.lang.Runnable
            public final void run() {
                ((g) n.this).a(b0.f4977n, zzp.zzg());
            }
        }, h()) == null) {
            ((g) nVar).a(j(), zzp.zzg());
        }
    }

    @Override // e.a.a.a.c
    public final void f(q qVar, final r rVar) {
        if (!b()) {
            ((m.a) rVar).a(b0.f4976m, null);
            return;
        }
        final String str = qVar.a;
        List<String> list = qVar.f5017b;
        if (TextUtils.isEmpty(str)) {
            zza.zzk("BillingClient", "Please fix the input params. SKU type can't be empty.");
            ((m.a) rVar).a(b0.f4969f, null);
        } else if (list == null) {
            zza.zzk("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            ((m.a) rVar).a(b0.f4968e, null);
        } else {
            final ArrayList arrayList = new ArrayList();
            for (String str2 : list) {
                if (TextUtils.isEmpty(str2)) {
                    throw new IllegalArgumentException("SKU must be set.");
                }
                arrayList.add(new c0(str2));
            }
            if (k(new Callable() { // from class: e.a.a.a.i0
                /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
                    r14 = 4;
                 */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 319
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.i0.call():java.lang.Object");
                }
            }, 30000L, new Runnable() { // from class: e.a.a.a.m0
                @Override // java.lang.Runnable
                public final void run() {
                    ((m.a) r.this).a(b0.f4977n, null);
                }
            }, h()) == null) {
                ((m.a) rVar).a(j(), null);
            }
        }
    }

    @Override // e.a.a.a.c
    public final void g(h hVar) {
        ServiceInfo serviceInfo;
        if (b()) {
            zza.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            ((e.j.d.g) hVar).a(b0.f4975l);
        } else if (this.a == 1) {
            zza.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            ((e.j.d.g) hVar).a(b0.f4967d);
        } else if (this.a == 3) {
            zza.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            ((e.j.d.g) hVar).a(b0.f4976m);
        } else {
            this.a = 1;
            e0 e0Var = this.f4980d;
            d0 d0Var = e0Var.f4993b;
            Context context = e0Var.a;
            IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
            if (!d0Var.f4991b) {
                context.registerReceiver(d0Var.f4992c.f4993b, intentFilter);
                d0Var.f4991b = true;
            }
            zza.zzj("BillingClient", "Starting in-app billing setup.");
            this.f4983g = new y(this, hVar);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f4981e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    zza.zzk("BillingClient", "The device doesn't have valid Play Store.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f4978b);
                    if (this.f4981e.bindService(intent2, this.f4983g, 1)) {
                        zza.zzj("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    zza.zzk("BillingClient", "Connection to Billing service is blocked.");
                }
            }
            this.a = 0;
            zza.zzj("BillingClient", "Billing service unavailable on device.");
            ((e.j.d.g) hVar).a(b0.f4966c);
        }
    }

    public final Handler h() {
        return Looper.myLooper() == null ? this.f4979c : new Handler(Looper.myLooper());
    }

    public final j i(final j jVar) {
        if (Thread.interrupted()) {
            return jVar;
        }
        this.f4979c.post(new Runnable() { // from class: e.a.a.a.j0
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                dVar.f4980d.f4993b.a.a(jVar, null);
            }
        });
        return jVar;
    }

    public final j j() {
        return (this.a == 0 || this.a == 3) ? b0.f4976m : b0.f4974k;
    }

    public final <T> Future<T> k(Callable<T> callable, long j2, final Runnable runnable, Handler handler) {
        double d2 = j2;
        Double.isNaN(d2);
        long j3 = (long) (d2 * 0.95d);
        if (this.q == null) {
            this.q = Executors.newFixedThreadPool(zza.zza, new v(this));
        }
        try {
            final Future<T> submit = this.q.submit(callable);
            handler.postDelayed(new Runnable() { // from class: e.a.a.a.n0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    zza.zzk("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, j3);
            return submit;
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 28);
            sb.append("Async task throws exception ");
            sb.append(valueOf);
            zza.zzk("BillingClient", sb.toString());
            return null;
        }
    }
}
