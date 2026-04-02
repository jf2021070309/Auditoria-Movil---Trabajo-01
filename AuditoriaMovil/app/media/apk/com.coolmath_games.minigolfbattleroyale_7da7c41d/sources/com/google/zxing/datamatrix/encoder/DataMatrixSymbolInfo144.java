package com.google.zxing.datamatrix.encoder;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: classes2.dex */
final class DataMatrixSymbolInfo144 extends SymbolInfo {
    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public int getDataLengthForInterleavedBlock(int i) {
        return i <= 8 ? 156 : 155;
    }

    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public int getInterleavedBlockCount() {
        return 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataMatrixSymbolInfo144() {
        super(false, 1558, IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, 22, 22, 36, -1, 62);
    }
}
