/**
 * ErrorsException automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.twitter;

import app.sdkgen.client.Exception.KnownStatusCodeException;

public class ErrorsException extends KnownStatusCodeException {

    private Errors payload;

    public ErrorsException(Errors payload) {
        super("The server returned an error");

        this.payload = payload;
    }

    public Errors getPayload() {
        return this.payload;
    }

}
