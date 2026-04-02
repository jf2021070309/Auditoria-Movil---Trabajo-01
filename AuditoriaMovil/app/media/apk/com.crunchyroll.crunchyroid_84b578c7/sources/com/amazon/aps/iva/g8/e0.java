package com.amazon.aps.iva.g8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.amazon.aps.iva.g8.g0;
import com.amazon.aps.iva.g8.j0;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: NavDeepLinkBuilder.kt */
/* loaded from: classes.dex */
public final class e0 {
    public final Context a;
    public final Intent b;
    public final j0 c;
    public final ArrayList d;

    /* compiled from: NavDeepLinkBuilder.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final Bundle b;

        public a(int i, Bundle bundle) {
            this.a = i;
            this.b = bundle;
        }
    }

    public e0(i iVar) {
        Intent launchIntentForPackage;
        Context context = iVar.a;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.a = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.b = launchIntentForPackage;
        this.d = new ArrayList();
        this.c = iVar.i();
    }

    public final com.amazon.aps.iva.c3.g0 a() {
        j0 j0Var = this.c;
        if (j0Var != null) {
            ArrayList arrayList = this.d;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                Iterator it = arrayList.iterator();
                g0 g0Var = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    int i = 0;
                    Context context = this.a;
                    if (hasNext) {
                        a aVar = (a) it.next();
                        int i2 = aVar.a;
                        g0 b = b(i2);
                        if (b != null) {
                            int[] e = b.e(g0Var);
                            int length = e.length;
                            while (i < length) {
                                arrayList2.add(Integer.valueOf(e[i]));
                                arrayList3.add(aVar.b);
                                i++;
                            }
                            g0Var = b;
                        } else {
                            int i3 = g0.j;
                            String b2 = g0.a.b(i2, context);
                            throw new IllegalArgumentException("Navigation destination " + b2 + " cannot be found in the navigation graph " + j0Var);
                        }
                    } else {
                        int[] W0 = com.amazon.aps.iva.lb0.x.W0(arrayList2);
                        Intent intent = this.b;
                        intent.putExtra("android-support-nav:controller:deepLinkIds", W0);
                        intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                        com.amazon.aps.iva.c3.g0 g0Var2 = new com.amazon.aps.iva.c3.g0(context);
                        g0Var2.b(new Intent(intent));
                        ArrayList<Intent> arrayList4 = g0Var2.b;
                        int size = arrayList4.size();
                        while (i < size) {
                            Intent intent2 = arrayList4.get(i);
                            if (intent2 != null) {
                                intent2.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                            }
                            i++;
                        }
                        return g0Var2;
                    }
                }
            } else {
                throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
            }
        } else {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        }
    }

    public final g0 b(int i) {
        com.amazon.aps.iva.lb0.k kVar = new com.amazon.aps.iva.lb0.k();
        j0 j0Var = this.c;
        com.amazon.aps.iva.yb0.j.c(j0Var);
        kVar.addLast(j0Var);
        while (!kVar.isEmpty()) {
            g0 g0Var = (g0) kVar.removeFirst();
            if (g0Var.h == i) {
                return g0Var;
            }
            if (g0Var instanceof j0) {
                j0.b bVar = new j0.b();
                while (bVar.hasNext()) {
                    kVar.addLast((g0) bVar.next());
                }
            }
        }
        return null;
    }

    public final void c() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            int i = ((a) it.next()).a;
            if (b(i) == null) {
                int i2 = g0.j;
                StringBuilder c = com.amazon.aps.iva.k.q.c("Navigation destination ", g0.a.b(i, this.a), " cannot be found in the navigation graph ");
                c.append(this.c);
                throw new IllegalArgumentException(c.toString());
            }
        }
    }
}
