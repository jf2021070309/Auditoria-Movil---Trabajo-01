package com.worldturner.medeia.parser;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.TokenLocationException;
import kotlin.Metadata;
/* compiled from: SimpleObjectMapper.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/worldturner/medeia/parser/TypeMismatchException;", "Lcom/worldturner/medeia/api/TokenLocationException;", "message", "", FirebaseAnalytics.Param.LOCATION, "(Ljava/lang/String;Ljava/lang/String;)V", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class TypeMismatchException extends TokenLocationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeMismatchException(String str, String str2) {
        super(str, str2, null, 4, null);
        j.g(str, "message");
        j.g(str2, FirebaseAnalytics.Param.LOCATION);
    }
}
