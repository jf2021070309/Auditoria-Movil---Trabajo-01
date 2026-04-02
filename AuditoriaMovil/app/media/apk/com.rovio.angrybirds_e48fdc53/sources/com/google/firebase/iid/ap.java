package com.google.firebase.iid;
/* loaded from: classes2.dex */
final class ap implements InstanceIdResult {
    private final String a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ap(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public final String getId() {
        return this.a;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public final String getToken() {
        return this.b;
    }
}
