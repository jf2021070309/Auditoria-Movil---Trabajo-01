package com.worldturner.medeia.parser;

import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: JsonTokenType.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BM\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/worldturner/medeia/parser/JsonTokenType;", "", "firstStructureToken", "", "lastStructureToken", "booleanToken", "nonStructureToken", "syntheticType", "firstToken", "lastToken", "(Ljava/lang/String;IZZZZZZZ)V", "getBooleanToken", "()Z", "getFirstStructureToken", "getFirstToken", "getLastStructureToken", "getLastToken", "getNonStructureToken", "getSyntheticType", "NONE", "END_OF_STREAM", "START_OBJECT", "END_OBJECT", "START_ARRAY", "END_ARRAY", "FIELD_NAME", "VALUE_NUMBER", "VALUE_TEXT", "VALUE_BOOLEAN_TRUE", "VALUE_BOOLEAN_FALSE", "VALUE_NULL", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public enum JsonTokenType {
    NONE(false, false, false, false, true, false, false, 111, null),
    END_OF_STREAM(false, false, false, false, true, false, false, 111, null),
    START_OBJECT(true, false, false, false, false, false, false, WebSocketProtocol.PAYLOAD_SHORT, null),
    END_OBJECT(false, true, false, false, false, false, false, 125, null),
    START_ARRAY(true, false, false, false, false, false, false, WebSocketProtocol.PAYLOAD_SHORT, null),
    END_ARRAY(false, true, false, false, false, false, false, 125, null),
    FIELD_NAME(false, false, false, false, false, false, false, 127, null),
    VALUE_NUMBER(false, false, false, true, false, false, false, 119, null),
    VALUE_TEXT(false, false, false, true, false, false, false, 119, null),
    VALUE_BOOLEAN_TRUE(false, false, true, true, false, false, false, 115, null),
    VALUE_BOOLEAN_FALSE(false, false, true, true, false, false, false, 115, null),
    VALUE_NULL(false, false, false, true, false, false, false, 119, null);
    
    private final boolean booleanToken;
    private final boolean firstStructureToken;
    private final boolean firstToken;
    private final boolean lastStructureToken;
    private final boolean lastToken;
    private final boolean nonStructureToken;
    private final boolean syntheticType;

    JsonTokenType(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.firstStructureToken = z;
        this.lastStructureToken = z2;
        this.booleanToken = z3;
        this.nonStructureToken = z4;
        this.syntheticType = z5;
        this.firstToken = z6;
        this.lastToken = z7;
    }

    public final boolean getBooleanToken() {
        return this.booleanToken;
    }

    public final boolean getFirstStructureToken() {
        return this.firstStructureToken;
    }

    public final boolean getFirstToken() {
        return this.firstToken;
    }

    public final boolean getLastStructureToken() {
        return this.lastStructureToken;
    }

    public final boolean getLastToken() {
        return this.lastToken;
    }

    public final boolean getNonStructureToken() {
        return this.nonStructureToken;
    }

    public final boolean getSyntheticType() {
        return this.syntheticType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* synthetic */ JsonTokenType(boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, int r22, com.amazon.aps.iva.yb0.e r23) {
        /*
            r12 = this;
            r0 = r22 & 1
            r1 = 0
            if (r0 == 0) goto L7
            r5 = r1
            goto L8
        L7:
            r5 = r15
        L8:
            r0 = r22 & 2
            if (r0 == 0) goto Le
            r6 = r1
            goto L10
        Le:
            r6 = r16
        L10:
            r0 = r22 & 4
            if (r0 == 0) goto L16
            r7 = r1
            goto L18
        L16:
            r7 = r17
        L18:
            r0 = r22 & 8
            if (r0 == 0) goto L1e
            r8 = r1
            goto L20
        L1e:
            r8 = r18
        L20:
            r0 = r22 & 16
            if (r0 == 0) goto L26
            r9 = r1
            goto L28
        L26:
            r9 = r19
        L28:
            r0 = r22 & 32
            r2 = 1
            if (r0 == 0) goto L37
            if (r8 != 0) goto L34
            if (r5 == 0) goto L32
            goto L34
        L32:
            r0 = r1
            goto L35
        L34:
            r0 = r2
        L35:
            r10 = r0
            goto L39
        L37:
            r10 = r20
        L39:
            r0 = r22 & 64
            if (r0 == 0) goto L44
            if (r8 != 0) goto L41
            if (r6 == 0) goto L42
        L41:
            r1 = r2
        L42:
            r11 = r1
            goto L46
        L44:
            r11 = r21
        L46:
            r2 = r12
            r3 = r13
            r4 = r14
            r2.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.worldturner.medeia.parser.JsonTokenType.<init>(java.lang.String, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, com.amazon.aps.iva.yb0.e):void");
    }
}
