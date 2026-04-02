package com.worldturner.medeia.parser;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.pointer.JsonPointer;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: JsonTokenLocation.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/worldturner/medeia/parser/JsonTokenLocation;", "", "column", "", "getColumn", "()I", "inputSourceName", "", "getInputSourceName", "()Ljava/lang/String;", FirebaseAnalytics.Param.LEVEL, "getLevel", "line", "getLine", "pointer", "Lcom/worldturner/medeia/pointer/JsonPointer;", "getPointer", "()Lcom/worldturner/medeia/pointer/JsonPointer;", "propertyNames", "", "getPropertyNames", "()Ljava/util/Set;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public interface JsonTokenLocation {

    /* compiled from: JsonTokenLocation.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static int getColumn(JsonTokenLocation jsonTokenLocation) {
            return -1;
        }

        public static int getLine(JsonTokenLocation jsonTokenLocation) {
            return -1;
        }
    }

    int getColumn();

    String getInputSourceName();

    int getLevel();

    int getLine();

    JsonPointer getPointer();

    Set<String> getPropertyNames();
}
