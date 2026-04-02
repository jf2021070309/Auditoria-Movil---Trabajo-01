package com.amazon.aps.iva.c3;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TaskStackBuilder.java */
/* loaded from: classes.dex */
public final class g0 implements Iterable<Intent> {
    public final ArrayList<Intent> b = new ArrayList<>();
    public final Context c;

    /* compiled from: TaskStackBuilder.java */
    /* loaded from: classes.dex */
    public static class a {
        public static PendingIntent a(Context context, int i, Intent[] intentArr, int i2, Bundle bundle) {
            return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
        }
    }

    /* compiled from: TaskStackBuilder.java */
    /* loaded from: classes.dex */
    public interface b {
        Intent getSupportParentActivityIntent();
    }

    public g0(Context context) {
        this.c = context;
    }

    public final void b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.c.getPackageManager());
        }
        if (component != null) {
            d(component);
        }
        this.b.add(intent);
    }

    public final void d(ComponentName componentName) {
        Context context = this.c;
        ArrayList<Intent> arrayList = this.b;
        int size = arrayList.size();
        try {
            for (Intent b2 = l.b(context, componentName); b2 != null; b2 = l.b(context, b2.getComponent())) {
                arrayList.add(size, b2);
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final PendingIntent e(int i) {
        ArrayList<Intent> arrayList = this.b;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return a.a(this.c, 1, intentArr, i, null);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    public final void f() {
        ArrayList<Intent> arrayList = this.b;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Context context = this.c;
            if (!com.amazon.aps.iva.d3.a.startActivities(context, intentArr, null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.b.iterator();
    }
}
