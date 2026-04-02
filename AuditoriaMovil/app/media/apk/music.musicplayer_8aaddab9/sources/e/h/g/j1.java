package e.h.g;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Environment;
import android.os.LocaleList;
import android.os.Looper;
import android.widget.Toast;
import com.applovin.sdk.AppLovinEventTypes;
import com.jrtstudio.tools.JRTProvider;
import e.h.g.j0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class j1 {
    public static final Object a;

    /* renamed from: b  reason: collision with root package name */
    public static Toast f8316b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f8317c;

    /* renamed from: d  reason: collision with root package name */
    public static String f8318d;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f8319e;

    static {
        new r0().h();
        a = new Object();
    }

    public static void a(Activity activity, ArrayList<Uri> arrayList, ArrayList<String> arrayList2, String str) {
        if (arrayList.size() >= 1 || arrayList2.size() >= 1) {
            try {
                if (arrayList2.size() != 1 && arrayList.size() != 1) {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND_MULTIPLE");
                    intent.setType("audio/*");
                    if (!v0.d() || arrayList.size() <= 0) {
                        arrayList.clear();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            try {
                                File file = new File(arrayList2.get(i2));
                                arrayList.add(JRTProvider.b(activity, x0.f8405d.getPackageName() + ".provider", file));
                            } catch (Exception e2) {
                                s1.l(e2, true);
                            }
                        }
                    }
                    e.j.d.j.b();
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    activity.startActivity(Intent.createChooser(intent, ""));
                    e.h.e.g.g(AppLovinEventTypes.USER_SHARED_LINK);
                    return;
                }
                l(activity, arrayList.size() > 0 ? arrayList.get(0) : null, arrayList2.size() > 0 ? arrayList2.get(0) : null, null);
            } catch (Throwable th) {
                s1.l(th, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019e, code lost:
        r14 = e.h.g.x0.f8405d.getContentResolver().query(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new java.lang.String[]{"_id"}, "_display_name = ? AND relative_path = ?", new java.lang.String[]{r15, r14}, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b8, code lost:
        if (r14 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01be, code lost:
        if (r14.moveToFirst() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
        r0 = r14.getLong(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c6, code lost:
        if (r0 == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01cb, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01cc, code lost:
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
        if (r8 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e0, code lost:
        if (r8 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e2, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e8, code lost:
        if (r7 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ea, code lost:
        r6 = e.h.g.x0.f8405d.getContentResolver().query(android.provider.MediaStore.Audio.Media.getContentUriForPath(r7), new java.lang.String[]{"_id"}, "_data=?", new java.lang.String[]{r7}, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0103, code lost:
        if (r6 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0109, code lost:
        if (r6.moveToFirst() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010b, code lost:
        r7 = r6.getLong(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0111, code lost:
        if (r7 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0116, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0117, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0123, code lost:
        if (r15 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0129, code lost:
        if (r15.startsWith("/file") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012b, code lost:
        r15 = r15.replace("/file", "");
        r15 = e.h.g.x0.f8405d.getContentResolver().query(android.provider.MediaStore.Audio.Media.getContentUriForPath(r15), new java.lang.String[]{"_id"}, "_data=?", new java.lang.String[]{r15}, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x014a, code lost:
        if (r15 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0150, code lost:
        if (r15.moveToFirst() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
        r6 = r15.getLong(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0158, code lost:
        if (r6 == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015d, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015e, code lost:
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016b, code lost:
        if (e.h.g.v0.d() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0173, code lost:
        if (android.provider.DocumentsContract.isDocumentUri(e.h.g.x0.f8405d, r14) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0175, code lost:
        r15 = e.h.g.q0.n(e.h.g.p0.a.d(e.h.g.x0.f8405d, r14));
        r14 = android.provider.DocumentsContract.getDocumentId(r14).split(":")[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018f, code lost:
        if (r14.endsWith(r15) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0191, code lost:
        r14 = r14.substring(0, r14.length() - r15.length());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long b(android.net.Uri r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.g.j1.b(android.net.Uri, java.lang.String):long");
    }

    public static File c() {
        try {
            return Environment.getExternalStorageDirectory();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static boolean d(Context context, String str, boolean z) {
        if (!z) {
            try {
                context.getApplicationContext().getPackageManager().getApplicationInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                return false;
            }
        }
        try {
            if (d(context, str, false)) {
                return context.getApplicationContext().getPackageManager().checkSignatures(x0.f8405d.getPackageName(), str) == 0;
            }
        } catch (Exception e2) {
            s1.l(e2, true);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d6, code lost:
        if (r2 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00da, code lost:
        if (r2 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00de, code lost:
        if (r2 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
        r2.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e() {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.g.j1.e():boolean");
    }

    public static boolean f() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean g(Context context, String str) {
        try {
            e.j.d.j.b();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str));
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception e2) {
            s1.l(e2, true);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.storage.StorageVolume h(android.app.Activity r6, java.io.File r7, java.lang.String r8, int r9) {
        /*
            e.j.d.j.b()
            boolean r0 = e.h.g.v0.g()
            r1 = 0
            if (r0 == 0) goto Lc5
            boolean r0 = e.h.g.v0.i()
            java.lang.String r2 = "android.content.extra.SHOW_ADVANCED"
            java.lang.String r3 = "android.intent.action.OPEN_DOCUMENT_TREE"
            r4 = 1
            if (r0 == 0) goto Lba
            if (r8 == 0) goto L5a
            boolean r0 = e.h.g.v0.i()
            if (r0 == 0) goto L5a
            java.lang.String r0 = "external_primary"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L34
            e.h.g.x0 r7 = e.h.g.x0.f8405d
            java.lang.Class<android.os.storage.StorageManager> r8 = android.os.storage.StorageManager.class
            java.lang.Object r7 = r7.getSystemService(r8)
            android.os.storage.StorageManager r7 = (android.os.storage.StorageManager) r7
            android.os.storage.StorageVolume r7 = r7.getPrimaryStorageVolume()
            goto L68
        L34:
            e.h.g.x0 r8 = e.h.g.x0.f8405d
            java.lang.Class<android.os.storage.StorageManager> r0 = android.os.storage.StorageManager.class
            java.lang.Object r8 = r8.getSystemService(r0)
            android.os.storage.StorageManager r8 = (android.os.storage.StorageManager) r8
            java.util.List r8 = r8.getStorageVolumes()
            java.util.Iterator r8 = r8.iterator()
        L46:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r8.next()
            android.os.storage.StorageVolume r0 = (android.os.storage.StorageVolume) r0
            boolean r5 = r0.isPrimary()
            if (r5 != 0) goto L46
            r7 = r0
            goto L68
        L5a:
            e.h.g.x0 r8 = e.h.g.x0.f8405d
            java.lang.Class<android.os.storage.StorageManager> r0 = android.os.storage.StorageManager.class
            java.lang.Object r8 = r8.getSystemService(r0)
            android.os.storage.StorageManager r8 = (android.os.storage.StorageManager) r8
            android.os.storage.StorageVolume r7 = r8.getStorageVolume(r7)
        L68:
            if (r7 == 0) goto Lae
            boolean r8 = e.h.g.v0.d()
            if (r8 != 0) goto L7a
            android.content.Intent r8 = r7.createAccessIntent(r1)
            if (r8 == 0) goto Lac
            r6.startActivityForResult(r8, r9)
            goto Lac
        L7a:
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r3)
            r8.putExtra(r2, r4)
            java.lang.String r0 = r7.getUuid()
            if (r0 == 0) goto L8d
            java.lang.String r0 = r7.getUuid()
            goto L8f
        L8d:
            java.lang.String r0 = "primary"
        L8f:
            java.lang.String r1 = "%3A"
            java.lang.String r0 = e.a.d.a.a.k(r0, r1)
            java.lang.String r1 = "content://com.android.externalstorage.documents/document"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri r0 = android.net.Uri.withAppendedPath(r1, r0)
            java.lang.String r1 = "android.content.extra.LOCAL_ONLY"
            r8.putExtra(r1, r4)
            java.lang.String r1 = "android.provider.extra.INITIAL_URI"
            r8.putExtra(r1, r0)
            r6.startActivityForResult(r8, r9)
        Lac:
            r1 = r7
            goto Lc5
        Lae:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r3)
            r7.putExtra(r2, r4)
            r6.startActivityForResult(r7, r9)
            goto Lc5
        Lba:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r3)
            r7.putExtra(r2, r4)
            r6.startActivityForResult(r7, r9)
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.g.j1.h(android.app.Activity, java.io.File, java.lang.String, int):android.os.storage.StorageVolume");
    }

    public static Uri i(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            Long.parseLong(lastPathSegment);
            List<String> pathSegments = uri.getPathSegments();
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.path(null);
            for (int i2 = 0; i2 < pathSegments.size() - 1; i2++) {
                buildUpon.appendPath(pathSegments.get(i2));
            }
            return buildUpon.build();
        }
        throw new IllegalArgumentException("No path segments to remove");
    }

    public static void j(final Activity activity, final DialogInterface dialogInterface) {
        if (activity == null || dialogInterface == null) {
            return;
        }
        j0.h(new j0.c() { // from class: e.h.g.e0
            @Override // e.h.g.j0.c
            public final void a() {
                Activity activity2 = activity;
                DialogInterface dialogInterface2 = dialogInterface;
                try {
                    if (activity2.isFinishing()) {
                        return;
                    }
                    dialogInterface2.dismiss();
                } catch (Throwable th) {
                    s1.l(th, true);
                }
            }
        });
    }

    public static void k(Configuration configuration, Locale locale) {
        Locale.setDefault(locale);
        if (!v0.i()) {
            configuration.setLocale(locale);
            return;
        }
        LocaleList locales = configuration.getLocales();
        ArrayList arrayList = new ArrayList(locales.size() + 1);
        arrayList.add(locale);
        for (int i2 = 0; i2 < locales.size(); i2++) {
            Locale locale2 = locales.get(i2);
            Iterator it = arrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Locale locale3 = (Locale) it.next();
                if (locale3.getLanguage().equals(locale2.getLanguage()) && locale3.getCountry().equals(locale2.getCountry())) {
                    z = true;
                }
            }
            if (!z) {
                arrayList.add(locale2);
            }
        }
        configuration.setLocales(new LocaleList((Locale[]) arrayList.toArray(new Locale[arrayList.size()])));
    }

    public static void l(Activity activity, Uri uri, String str, String str2) {
        if (activity != null) {
            try {
                Intent type = new Intent("android.intent.action.SEND").setType("audio/*");
                if (!v0.d() || uri == null) {
                    uri = JRTProvider.b(activity, x0.f8405d.getPackageName() + ".provider", new File(str));
                }
                type.putExtra("android.intent.extra.STREAM", uri);
                if (str2 != null) {
                    type.putExtra("android.intent.extra.TEXT", str2);
                }
                e.j.d.j.b();
                activity.startActivity(Intent.createChooser(type, ""));
                e.h.e.g.g(AppLovinEventTypes.USER_SHARED_LINK);
            } catch (Throwable th) {
                s1.l(th, true);
            }
        }
    }

    public static void m(final Activity activity, final File file, final String str, final int i2) {
        final WeakReference weakReference = new WeakReference(activity);
        j0.h(new j0.c() { // from class: e.h.g.d0
            @Override // e.h.g.j0.c
            public final void a() {
                final WeakReference weakReference2 = weakReference;
                final Activity activity2 = activity;
                final File file2 = file;
                final String str2 = str;
                final int i3 = i2;
                try {
                    Activity activity3 = (Activity) weakReference2.get();
                    if (activity3 == null || activity3.isFinishing()) {
                        return;
                    }
                    new AlertDialog.Builder(activity3).setTitle(x0.q(R.string.lollipop_access_title)).setMessage(x0.q(R.string.lollipop_access_message)).setPositiveButton(x0.q(R.string.grant_access), new DialogInterface.OnClickListener() { // from class: e.h.g.y
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            WeakReference weakReference3 = weakReference2;
                            Activity activity4 = activity2;
                            File file3 = file2;
                            String str3 = str2;
                            int i5 = i3;
                            j1.j((Activity) weakReference3.get(), dialogInterface);
                            try {
                                if (((Activity) weakReference3.get()) != null) {
                                    j1.h(activity4, file3, str3, i5);
                                }
                            } catch (Exception e2) {
                                s1.l(e2, true);
                            }
                        }
                    }).setNegativeButton(x0.q(R.string.cancel), new DialogInterface.OnClickListener() { // from class: e.h.g.a0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            j1.j((Activity) weakReference2.get(), dialogInterface);
                        }
                    }).create().show();
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void n(int i2, r0 r0Var) {
        r0Var.g();
        int i3 = 0;
        while (true) {
            long j2 = i2;
            if (j2 <= r0Var.b()) {
                return;
            }
            if (i3 == 0) {
                try {
                    Thread.sleep(j2);
                } catch (InterruptedException unused) {
                }
            } else {
                Thread.sleep(10L);
            }
            i3++;
        }
    }

    public static void o(long j2, r0 r0Var) {
        r0Var.g();
        while (j2 > r0Var.b()) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException unused) {
            }
        }
    }

    public static void p(String str, final int i2) {
        if (str == null) {
            return;
        }
        final String trim = str.trim();
        if (trim.length() == 0) {
            return;
        }
        j0.h(new j0.c() { // from class: e.h.g.c0
            @Override // e.h.g.j0.c
            public final void a() {
                String str2 = trim;
                int i3 = i2;
                try {
                    x0 x0Var = x0.f8405d;
                    if (j1.f8316b == null) {
                        try {
                            j1.f8316b = Toast.makeText(x0Var, "", 0);
                        } catch (RuntimeException unused) {
                        }
                    }
                    if (j1.f8316b != null) {
                        if (v0.k() && j1.f8316b.getView() != null && j1.f8316b.getView().isShown()) {
                            j1.f8316b.cancel();
                        }
                        j1.f8316b.setText(str2);
                        j1.f8316b.setDuration(i3);
                        j1.f8316b.show();
                    }
                } catch (Throwable th) {
                    s1.l(th, true);
                }
            }
        });
    }

    public static void q(final Context context, final BroadcastReceiver broadcastReceiver) {
        if (f()) {
            j0.d(new j0.b() { // from class: e.h.g.b0
                @Override // e.h.g.j0.b
                public final void a() {
                    j1.q(context, broadcastReceiver);
                }
            });
        } else if (context == null || broadcastReceiver == null) {
        } else {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (Throwable unused) {
            }
        }
    }
}
