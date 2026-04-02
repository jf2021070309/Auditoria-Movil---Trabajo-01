package com.amazon.aps.iva.eh;
/* compiled from: CountEligibilityRule.kt */
/* loaded from: classes.dex */
public class a implements b {
    public final int a = 3;
    public final c b;

    public a(d dVar) {
        this.b = dVar;
    }

    @Override // com.amazon.aps.iva.eh.b
    public final boolean a() {
        if (this.b.b() >= this.a) {
            return true;
        }
        return false;
    }
}
