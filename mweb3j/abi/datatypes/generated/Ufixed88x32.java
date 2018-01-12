package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link org.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed88x32 extends Ufixed {
    public static final Ufixed88x32 DEFAULT = new Ufixed88x32(BigInteger.ZERO);

    public Ufixed88x32(BigInteger value) {
        super(88, 32, value);
    }

    public Ufixed88x32(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(88, 32, m, n);
    }
}
