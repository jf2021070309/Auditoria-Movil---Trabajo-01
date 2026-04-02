package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import e.d.d.w.e0;
import e.d.d.w.g0;
import e.d.d.w.h0;
import java.util.Map;
@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new h0();
    @SafeParcelable.Field(id = 2)
    public Bundle a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f4749b;

    /* renamed from: c  reason: collision with root package name */
    public a f4750c;

    /* loaded from: classes2.dex */
    public static class a {
        public a(e0 e0Var, g0 g0Var) {
            e0Var.j("gcm.n.title");
            e0Var.g("gcm.n.title");
            a(e0Var, "gcm.n.title");
            e0Var.j("gcm.n.body");
            e0Var.g("gcm.n.body");
            a(e0Var, "gcm.n.body");
            e0Var.j("gcm.n.icon");
            if (TextUtils.isEmpty(e0Var.j("gcm.n.sound2"))) {
                e0Var.j("gcm.n.sound");
            }
            e0Var.j("gcm.n.tag");
            e0Var.j("gcm.n.color");
            e0Var.j("gcm.n.click_action");
            e0Var.j("gcm.n.android_channel_id");
            e0Var.e();
            e0Var.j("gcm.n.image");
            e0Var.j("gcm.n.ticker");
            e0Var.b("gcm.n.notification_priority");
            e0Var.b("gcm.n.visibility");
            e0Var.b("gcm.n.notification_count");
            e0Var.a("gcm.n.sticky");
            e0Var.a("gcm.n.local_only");
            e0Var.a("gcm.n.default_sound");
            e0Var.a("gcm.n.default_vibrate_timings");
            e0Var.a("gcm.n.default_light_settings");
            e0Var.h("gcm.n.event_time");
            e0Var.d();
            e0Var.k();
        }

        public static String[] a(e0 e0Var, String str) {
            Object[] f2 = e0Var.f(str);
            if (f2 == null) {
                return null;
            }
            String[] strArr = new String[f2.length];
            for (int i2 = 0; i2 < f2.length; i2++) {
                strArr[i2] = String.valueOf(f2[i2]);
            }
            return strArr;
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.a = bundle;
    }

    public Map<String, String> getData() {
        if (this.f4749b == null) {
            Bundle bundle = this.a;
            c.f.a aVar = new c.f.a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            this.f4749b = aVar;
        }
        return this.f4749b;
    }

    public a h() {
        if (this.f4750c == null && e0.l(this.a)) {
            this.f4750c = new a(new e0(this.a), null);
        }
        return this.f4750c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
