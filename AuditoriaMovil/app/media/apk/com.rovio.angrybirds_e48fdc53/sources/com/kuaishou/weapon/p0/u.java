package com.kuaishou.weapon.p0;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.share.internal.ShareConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class u implements Runnable {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 0;
    public static final int e = 8;
    public static final int f = 1;
    public static final int g = 3;
    public static final int h = 4;
    private static long o = 0;
    private Context j;
    private q k;
    private t l;
    private File m;
    private Cdo n;
    private int p;
    private boolean r;
    private int q = 0;
    List<Integer> i = new ArrayList();
    private Map<Integer, a> s = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a {
        int a;

        public a(int i) {
            this.a = i;
        }
    }

    public u(Context context, int i, boolean z) {
        this.p = 0;
        this.r = false;
        this.j = context;
        this.k = q.a(context);
        this.l = t.a(context);
        this.n = Cdo.a(context);
        this.m = new File(context.getFilesDir(), bh.k);
        this.p = i;
        this.r = z;
    }

    private void a(s sVar) {
        try {
            if (!TextUtils.isEmpty(sVar.j) && sVar.j.length() >= 10) {
                if (!this.m.exists()) {
                    this.m.mkdir();
                }
                File file = this.m;
                File file2 = new File(file, sVar.a + "-" + sVar.d + bh.k);
                File file3 = this.m;
                File file4 = new File(file3, sVar.a + "-" + sVar.d + ".zip");
                boolean a2 = l.a(this.j).a(sVar.i, file2);
                if (!a2) {
                    a2 = l.a(this.j).a(sVar.i, file2);
                }
                if (a2) {
                    if (file4.exists()) {
                        file4.delete();
                    }
                    int c2 = b.c(file2.getAbsolutePath(), file4.getAbsolutePath(), c.a("a3NyaXNrY3RsYnVzaW5zc3Z4cHprd3NwYWlvcXBrc3M=".getBytes(AudienceNetworkActivity.WEBVIEW_ENCODING), 2));
                    if (c2 != 0) {
                        if (file4.exists()) {
                            file4.delete();
                        }
                        a2 = false;
                    }
                    if (c2 == 0 && file2.exists()) {
                        file2.delete();
                    }
                } else {
                    this.s.put(Integer.valueOf(sVar.a), new a(3));
                }
                String a3 = f.a(file4);
                if (!a2 || !sVar.j.equals(a3)) {
                    if (file2.exists()) {
                        file2.length();
                        file2.delete();
                    }
                    this.k.a(sVar.a, sVar.d, (PackageInfo) null);
                    return;
                }
                dm.a(file4.getAbsolutePath(), Boolean.TRUE);
                sVar.e = file4.getAbsolutePath();
                if (this.k.a(sVar, (String) null, (String) null)) {
                    Map<Integer, a> map = this.s;
                    if (map != null && !map.containsKey(Integer.valueOf(sVar.a))) {
                        this.s.put(Integer.valueOf(sVar.a), new a(1));
                    }
                    this.n.a(Cdo.b, System.currentTimeMillis(), true);
                    return;
                }
                Map<Integer, a> map2 = this.s;
                if (map2 != null && !map2.containsKey(Integer.valueOf(sVar.a))) {
                    this.s.put(Integer.valueOf(sVar.a), new a(4));
                }
                this.k.a(sVar.a, sVar.d, (PackageInfo) null);
                return;
            }
            this.k.a(sVar.a, sVar.d, (PackageInfo) null);
        } catch (Throwable th) {
            this.k.a(sVar.a, sVar.d, (PackageInfo) null);
        }
    }

    public JSONObject a() {
        try {
            String str = ct.a + ct.g;
            String a2 = cu.a(this.j);
            if (!TextUtils.isEmpty(a2)) {
                str = str + "?" + a2;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject c2 = cu.c(this.j);
            if (c2 != null) {
                jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_DATA, new bm(this.j).c(c2.toString()));
            }
            l a3 = l.a(this.j);
            m mVar = new m(str, jSONObject);
            mVar.a(WeaponHI.cookieData);
            mVar.b(WeaponHI.encryENV);
            JSONObject jSONObject2 = new JSONObject(a3.a(mVar));
            int optInt = jSONObject2.optInt("result", 0);
            if (optInt != 1) {
                if (optInt == -7) {
                    Cdo.a(this.j).a(Cdo.a, 1, false);
                    return null;
                }
                return null;
            }
            String a4 = new bm(this.j).a(jSONObject2.getString("antispamPluginManageRsp"));
            if (TextUtils.isEmpty(a4)) {
                if (this.q == 0) {
                    this.q = 8;
                }
                throw new NetworkErrorException("kuaishou risk pluginloader response is null");
            }
            JSONObject jSONObject3 = new JSONObject(a4);
            if (jSONObject3.optInt("status", 0) == 1) {
                return jSONObject3.optJSONObject("plugin");
            }
            Cdo cdo = this.n;
            if (cdo != null) {
                cdo.a(Cdo.b, System.currentTimeMillis(), true);
                return null;
            }
            return null;
        } catch (Exception e2) {
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObject;
        boolean z;
        String str;
        try {
            synchronized (u.class) {
                int i = this.p;
                if (i == 1 || i == 2 || i == 4 || this.r || System.currentTimeMillis() - o >= 300000) {
                    this.l.d();
                    o = System.currentTimeMillis();
                    if ((System.currentTimeMillis() - this.n.a(Cdo.b)) - (this.n.a(Cdo.c, 6) * 3600000) > 0) {
                        List<s> a2 = this.l.a();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<s> arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        JSONObject a3 = a();
                        if (a3 == null) {
                            throw new Exception("pluginJsonObject is null ");
                        }
                        boolean z2 = false;
                        try {
                            boolean b2 = dl.b(this.j);
                            Iterator<String> keys = a3.keys();
                            HashSet<String> hashSet = new HashSet();
                            boolean z3 = false;
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (b2 && next.endsWith("64")) {
                                    if (next.length() > 3) {
                                        hashSet.add(next.substring(0, next.length() - 3));
                                        str = next.substring(0, next.length() - 3) + ".32";
                                        hashSet.add(str);
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                } else if (b2 || !next.endsWith("32")) {
                                    if (b2 && next.endsWith("v8")) {
                                        if (next.length() > 3) {
                                            hashSet.add(next.substring(0, next.length() - 3));
                                            str = next.substring(0, next.length() - 3) + ".v7";
                                            hashSet.add(str);
                                            z3 = true;
                                        }
                                    } else if (!b2 && next.endsWith("v7")) {
                                        if (next.length() > 3) {
                                            hashSet.add(next.substring(0, next.length() - 3));
                                            hashSet.add(next.substring(0, next.length() - 3) + ".v8");
                                        }
                                    }
                                    z3 = true;
                                } else if (next.length() > 3) {
                                    hashSet.add(next.substring(0, next.length() - 3));
                                    str = next.substring(0, next.length() - 3) + ".64";
                                    hashSet.add(str);
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                            }
                            if (z3) {
                                for (String str2 : hashSet) {
                                    a3.remove(str2);
                                }
                            }
                            z2 = z3;
                        } catch (Throwable th) {
                        }
                        Iterator<String> keys2 = a3.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            s a4 = o.a(a3.optJSONObject(next2));
                            if (a4 != null) {
                                if (z2 && !a4.y && (next2.endsWith("32") || next2.endsWith("64") || next2.endsWith("v7") || next2.endsWith("v8"))) {
                                    a4.y = true;
                                }
                                if (a4.v) {
                                    arrayList4.add(next2);
                                }
                                if (!a4.y) {
                                    arrayList3.add(a4);
                                }
                                int indexOf = a2.indexOf(a4);
                                if (indexOf < 0 || !a4.y) {
                                    jSONObject = a3;
                                    z = z2;
                                    if (a4.y) {
                                        arrayList2.add(a4);
                                    }
                                } else {
                                    s sVar = a2.get(indexOf);
                                    if (dm.b(a4.d, sVar.d)) {
                                        if (a4.x != sVar.x) {
                                            this.l.c(a4.a, a4.x);
                                        }
                                        if (!this.l.d(a4.a)) {
                                            arrayList2.add(a4);
                                        }
                                        jSONObject = a3;
                                        z = z2;
                                    } else {
                                        z = z2;
                                        jSONObject = a3;
                                        this.n.a(Cdo.b, System.currentTimeMillis(), true);
                                        if (a4.x != sVar.x) {
                                            this.l.c(a4.a, a4.x);
                                        }
                                        arrayList.add(a4);
                                    }
                                    a2.remove(indexOf);
                                }
                                z2 = z;
                                a3 = jSONObject;
                            }
                        }
                        for (s sVar2 : a2) {
                            if (!arrayList4.contains(sVar2.c)) {
                                List<Integer> list = this.i;
                                if (list != null) {
                                    list.add(Integer.valueOf(sVar2.a));
                                }
                                this.k.a(sVar2.c);
                            }
                        }
                        for (s sVar3 : arrayList3) {
                            if (!arrayList4.contains(sVar3.c)) {
                                List<Integer> list2 = this.i;
                                if (list2 != null) {
                                    list2.add(Integer.valueOf(sVar3.a));
                                }
                                this.k.a(sVar3.c);
                            }
                        }
                        ArrayList<s> arrayList5 = new ArrayList();
                        if (arrayList2.size() != 0) {
                            arrayList5.addAll(arrayList2);
                        }
                        if (arrayList.size() != 0) {
                            arrayList5.addAll(arrayList);
                        }
                        for (s sVar4 : arrayList5) {
                            if (sVar4 != null) {
                                if (arrayList.contains(sVar4)) {
                                    this.k.a(sVar4.a, sVar4.d, (PackageInfo) null);
                                } else if (arrayList2.contains(sVar4)) {
                                    a(sVar4);
                                }
                            }
                        }
                    } else {
                        this.k.c();
                        this.l.b();
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                this.k.c();
                this.l.b();
            } finally {
                WeaponHI.iD();
            }
        }
    }
}
