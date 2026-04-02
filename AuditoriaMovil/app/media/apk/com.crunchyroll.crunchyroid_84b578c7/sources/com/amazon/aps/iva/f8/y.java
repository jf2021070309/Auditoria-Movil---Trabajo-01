package com.amazon.aps.iva.f8;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: MediaRouteDescriptor.java */
/* loaded from: classes.dex */
public final class y {
    public final Bundle a;

    public y(Bundle bundle) {
        this.a = bundle;
    }

    public final HashSet a() {
        Bundle bundle = this.a;
        if (!bundle.containsKey("allowedPackages")) {
            return new HashSet();
        }
        return new HashSet(bundle.getStringArrayList("allowedPackages"));
    }

    public final ArrayList b() {
        Bundle bundle = this.a;
        if (!bundle.containsKey("controlFilters")) {
            return new ArrayList();
        }
        return new ArrayList(bundle.getParcelableArrayList("controlFilters"));
    }

    public final ArrayList c() {
        Bundle bundle = this.a;
        if (!bundle.containsKey("groupMemberIds")) {
            return new ArrayList();
        }
        return new ArrayList(bundle.getStringArrayList("groupMemberIds"));
    }

    public final Uri d() {
        String string = this.a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final String e() {
        return this.a.getString("id");
    }

    public final boolean f() {
        if (!TextUtils.isEmpty(e()) && !TextUtils.isEmpty(this.a.getString(AppMeasurementSdk.ConditionalUserProperty.NAME)) && !b().contains(null)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteDescriptor{ id=");
        sb.append(e());
        sb.append(", groupMemberIds=");
        sb.append(c());
        sb.append(", name=");
        Bundle bundle = this.a;
        sb.append(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        sb.append(", description=");
        sb.append(bundle.getString("status"));
        sb.append(", iconUri=");
        sb.append(d());
        sb.append(", isEnabled=");
        sb.append(bundle.getBoolean("enabled", true));
        sb.append(", connectionState=");
        sb.append(bundle.getInt("connectionState", 0));
        sb.append(", controlFilters=");
        sb.append(Arrays.toString(b().toArray()));
        sb.append(", playbackType=");
        sb.append(bundle.getInt("playbackType", 1));
        sb.append(", playbackStream=");
        sb.append(bundle.getInt("playbackStream", -1));
        sb.append(", deviceType=");
        sb.append(bundle.getInt("deviceType"));
        sb.append(", volume=");
        sb.append(bundle.getInt("volume"));
        sb.append(", volumeMax=");
        sb.append(bundle.getInt("volumeMax"));
        sb.append(", volumeHandling=");
        sb.append(bundle.getInt("volumeHandling", 0));
        sb.append(", presentationDisplayId=");
        sb.append(bundle.getInt("presentationDisplayId", -1));
        sb.append(", extras=");
        sb.append(bundle.getBundle("extras"));
        sb.append(", isValid=");
        sb.append(f());
        sb.append(", minClientVersion=");
        sb.append(bundle.getInt("minClientVersion", 1));
        sb.append(", maxClientVersion=");
        sb.append(bundle.getInt("maxClientVersion", Integer.MAX_VALUE));
        sb.append(", isVisibilityPublic=");
        sb.append(bundle.getBoolean("isVisibilityPublic", true));
        sb.append(", allowedPackages=");
        sb.append(Arrays.toString(a().toArray()));
        sb.append(" }");
        return sb.toString();
    }

    /* compiled from: MediaRouteDescriptor.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final Bundle a;
        public final ArrayList b;
        public final ArrayList c;
        public final HashSet d;

        public a(String str, String str2) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new HashSet();
            Bundle bundle = new Bundle();
            this.a = bundle;
            if (str != null) {
                bundle.putString("id", str);
                if (str2 != null) {
                    bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
                    return;
                }
                throw new NullPointerException("name must not be null");
            }
            throw new NullPointerException("id must not be null");
        }

        public final void a(ArrayList arrayList) {
            if (arrayList != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        IntentFilter intentFilter = (IntentFilter) it.next();
                        if (intentFilter != null) {
                            ArrayList arrayList2 = this.c;
                            if (!arrayList2.contains(intentFilter)) {
                                arrayList2.add(intentFilter);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("filters must not be null");
        }

        public final y b() {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.c);
            Bundle bundle = this.a;
            bundle.putParcelableArrayList("controlFilters", arrayList);
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.b));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
            return new y(bundle);
        }

        public a(y yVar) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new HashSet();
            this.a = new Bundle(yVar.a);
            this.b = yVar.c();
            this.c = yVar.b();
            this.d = yVar.a();
        }
    }
}
