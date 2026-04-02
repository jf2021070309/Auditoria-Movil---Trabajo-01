package com.worldturner.medeia.api;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* compiled from: TokenLocationException.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/worldturner/medeia/api/TokenLocationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", FirebaseAnalytics.Param.LOCATION, "cause", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getLocation", "()Ljava/lang/String;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public class TokenLocationException extends RuntimeException {
    private final String location;

    public /* synthetic */ TokenLocationException(String str, String str2, Throwable th, int i, e eVar) {
        this(str, str2, (i & 4) != 0 ? null : th);
    }

    public final String getLocation() {
        return this.location;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenLocationException(String str, String str2, Throwable th) {
        super(str + ' ' + str2, th);
        j.g(str2, FirebaseAnalytics.Param.LOCATION);
        this.location = str2;
    }
}
