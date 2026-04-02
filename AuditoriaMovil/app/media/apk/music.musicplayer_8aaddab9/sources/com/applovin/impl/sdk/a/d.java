package com.applovin.impl.sdk.a;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
/* loaded from: classes.dex */
public class d {
    private final View a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendlyObstructionPurpose f3806b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3807c;

    public d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.a = view;
        this.f3806b = friendlyObstructionPurpose;
        this.f3807c = str;
    }

    public View a() {
        return this.a;
    }

    public FriendlyObstructionPurpose b() {
        return this.f3806b;
    }

    public String c() {
        return this.f3807c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        View view = this.a;
        if (view == null ? dVar.a == null : view.equals(dVar.a)) {
            if (this.f3806b != dVar.f3806b) {
                return false;
            }
            String str = this.f3807c;
            String str2 = dVar.f3807c;
            return str != null ? str.equals(str2) : str2 == null;
        }
        return false;
    }

    public int hashCode() {
        View view = this.a;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f3806b;
        int hashCode2 = (hashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f3807c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
