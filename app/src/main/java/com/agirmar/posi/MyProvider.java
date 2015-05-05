package com.agirmar.posi;

import com.github.devnied.emvnfccard.parser.IProvider;

/**
 * Created by ÆgirMár on 05/05/2015.
 */
public class MyProvider implements IProvider {

    @Override
    public byte[] transceive(final byte[] pCommand) {
        // TODO implement this
        return pCommand;
    }
}