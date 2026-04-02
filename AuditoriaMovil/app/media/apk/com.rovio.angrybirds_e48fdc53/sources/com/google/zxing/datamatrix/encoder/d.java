package com.google.zxing.datamatrix.encoder;
/* loaded from: classes2.dex */
final class d extends SymbolInfo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        super(false, 1558, 620, 22, 22, 36, -1, 62);
    }

    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public int getInterleavedBlockCount() {
        return 10;
    }

    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public int getDataLengthForInterleavedBlock(int i) {
        return i <= 8 ? 156 : 155;
    }
}
